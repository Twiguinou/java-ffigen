package fr.kenlek.jpgen.generator;

import module fr.kenlek.jpgen.clang;
import module java.base;

import com.palantir.javapoet.CodeBlock;
import fr.kenlek.jpgen.api.data.Buffer;
import fr.kenlek.jpgen.generator.data.FunctionDeclaration;
import fr.kenlek.jpgen.generator.data.FunctionType;
import fr.kenlek.jpgen.generator.data.ParameterInfo;
import fr.kenlek.jpgen.generator.data.Type;
import java.util.logging.Logger;

import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXDiagnosticDisplayOptions.*;
import static fr.kenlek.jpgen.clang.CXDiagnosticSeverity.CXDiagnostic_Error;
import static fr.kenlek.jpgen.clang.CXErrorCode.CXError_Success;
import static fr.kenlek.jpgen.clang.CXTranslationUnit_Flags.CXTranslationUnit_SkipFunctionBodies;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;

public class SourceScopeScanner implements AutoCloseable
{
    private static final int TRANSLATION_UNIT_OPTIONS = CXTranslationUnit_SkipFunctionBodies;
    private static final int DIAGNOSTIC_OPTIONS = CXDiagnostic_DisplaySourceLocation | CXDiagnostic_DisplayColumn | CXDiagnostic_DisplayOption | CXDiagnostic_DisplayCategoryName;

    protected final LibClang m_clang;
    private final MemorySegment m_index;

    public SourceScopeScanner(LibClang clang, boolean enableClangOutput)
    {
        this.m_clang = clang;
        this.m_index = this.m_clang.createIndex(true, enableClangOutput);
    }

    public SourceScopeScanner(boolean enableClangOutput)
    {
        final class Container
        {
            static final LibClang CLANG = LibClang.load();
        }

        this(Container.CLANG, enableClangOutput);
    }

    public SourceScopeScanner()
    {
        this(false);
    }

    private boolean dumpDiagnostics(SegmentAllocator allocator, MemorySegment diagnostics, int options, StringBuilder report)
    {
        boolean fail = false;
        for (int i = 0; i < this.m_clang.getNumDiagnosticsInSet(diagnostics); i++)
        {
            MemorySegment diagnostic = this.m_clang.getDiagnosticInSet(diagnostics, i);
            try
            {
                report.append(System.lineSeparator());
                report.append(this.m_clang.retrieveString(this.m_clang.formatDiagnostic(allocator, diagnostic, options)).orElseThrow());

                MemorySegment children = this.m_clang.getChildDiagnostics(diagnostic);
                fail |= this.m_clang.getDiagnosticSeverity(diagnostic) >= CXDiagnostic_Error;
                fail |= this.dumpDiagnostics(allocator, children, options, report);
            }
            finally
            {
                this.m_clang.disposeDiagnostic(diagnostic);
            }
        }

        return fail;
    }

    private MemorySegment createTranslationUnit(Logger logger, Path header, List<String> arguments)
    {
        try (Arena arena = Arena.ofConfined())
        {
            Buffer<String> argumentBuffer = Buffer.allocateStrings(arena, arguments);

            MemorySegment pTU = arena.allocate(ADDRESS);
            int error = this.m_clang.parseTranslationUnit2(
                this.m_index, arena.allocateFrom(header.toString()),
                argumentBuffer.pointer(), (int) argumentBuffer.size(),
                NULL, 0, TRANSLATION_UNIT_OPTIONS, pTU
            );
            if (error != CXError_Success)
            {
                throw new ClangException("Failed to parse translation unit: " + error);
            }

            MemorySegment translationUnit = pTU.get(ADDRESS, 0);
            try
            {
                MemorySegment diagnostics = this.m_clang.getDiagnosticSetFromTU(translationUnit);
                try
                {
                    StringBuilder report = new StringBuilder("------- Clang debug parsing output -------");
                    if (this.dumpDiagnostics(SegmentAllocator.prefixAllocator(arena.allocate(CXString.LAYOUT)), diagnostics, DIAGNOSTIC_OPTIONS, report))
                    {
                        logger.severe(report.toString());
                        throw new ClangException("Encountered errors while parsing translation unit!");
                    }
                    else if (this.m_clang.getNumDiagnosticsInSet(diagnostics) > 0)
                    {
                        logger.warning(report.toString());
                    }
                }
                finally
                {
                    this.m_clang.disposeDiagnosticSet(diagnostics);
                }
            }
            catch (Throwable t)
            {
                this.m_clang.disposeTranslationUnit(translationUnit);
                throw t;
            }

            return translationUnit;
        }
    }

    public static Optional<CodeBlock> getCursorJavadoc(LibClang clang, CXCursor cursor)
    {
        try (Arena arena = Arena.ofConfined())
        {
            return clang.retrieveString(clang.Cursor_getBriefCommentText(arena, cursor)).map(CodeBlock::of);
        }
    }

    protected Type parseType(ParseOptions options, TypeCache cache, CXType type)
    {
        return cache.getOrCompute(type, () -> options.typeResolver().resolve(this.m_clang, options, type, clangType -> this.parseType(options, cache, clangType))
            .orElseThrow(() ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    return new ClangException(
                        "Could not parse type kind: " +
                        this.m_clang.retrieveString(this.m_clang.getTypeKindSpelling(arena, type.kind())).orElse(Integer.toString(type.kind()))
                    );
                }
            })
        );
    }

    protected FunctionDeclaration parseFunction(ParseOptions options, TypeCache cache, CXCursor cursor)
    {
        if (this.m_clang.getCursorKind(cursor) != CXCursor_FunctionDecl)
        {
            throw new IllegalArgumentException("Cursor does not point to a function declaration.");
        }

        NameResolver parameterNames = new NameResolver();
        List<ParameterInfo> parameterInfos = IntStream.range(0, this.m_clang.Cursor_getNumArguments(cursor))
            .mapToObj(index ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    CXCursor argumentCursor = this.m_clang.Cursor_getArgument(arena, cursor, index);
                    return new ParameterInfo(
                        getCursorJavadoc(this.m_clang, argumentCursor),
                        this.m_clang.retrieveString(this.m_clang.getCursorSpelling(arena, argumentCursor))
                            .filter(Predicate.not(String::isEmpty))
                            .map(parameterNames::resolve)
                    );
                }
            })
            .toList();

        try (Arena arena = Arena.ofConfined())
        {
            Type descriptorType = this.parseType(options, cache, this.m_clang.getCursorType(arena, cursor));
            if (descriptorType instanceof FunctionType functionType)
            {
                return new FunctionDeclaration(
                    getCursorJavadoc(this.m_clang, cursor), this.m_clang.retrieveString(this.m_clang.getCursorSpelling(arena, cursor)).orElseThrow(),
                    functionType, parameterInfos
                );
            }
            else
            {
                throw new ClangException("Descriptor type is not a function type: " + descriptorType);
            }
        }
    }

    protected int visitTranslationUnitCursor(ParseOptions options, ParseResults.Builder builder, TypeCache cache, CXCursor cursor)
    {
        if (!options.elementFilter().test(this.m_clang, cursor))
        {
            return CXChildVisit_Continue;
        }

        return switch (this.m_clang.getCursorKind(cursor))
        {
            case CXCursor_InclusionDirective -> CXChildVisit_Recurse;
            case CXCursor_EnumDecl, CXCursor_StructDecl, CXCursor_UnionDecl, CXCursor_TypedefDecl ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    builder.withType(this.parseType(options, cache, this.m_clang.getCursorType(arena, cursor)));
                    yield CXChildVisit_Continue;
                }
            }
            case CXCursor_FunctionDecl ->
            {
                if (!this.m_clang.Cursor_isVariadic(cursor))
                {
                    builder.withFunction(this.parseFunction(options, cache, cursor));
                }

                yield CXChildVisit_Continue;
            }
            default -> CXChildVisit_Continue;
        };
    }

    public ParseResults parse(Logger logger, Path header, List<String> clangArguments, ParseOptions options)
    {
        MemorySegment translationUnit = this.createTranslationUnit(logger, header, Stream.concat(
            clangArguments.stream(),
            Stream.of("-xc", "-fno-knr-functions")
        ).toList());
        try (Arena arena = Arena.ofConfined(); TypeCache cache = new TypeCache(this.m_clang))
        {
            ParseResults.Builder builder = new ParseResults.Builder();
            this.m_clang.visitChildren(
                this.m_clang.getTranslationUnitCursor(arena, translationUnit),
                CXCursorVisitor.makeHandle(LibClang.UPCALL_DISPATCHER, arena, (cursor, _, _) -> this.visitTranslationUnitCursor(options, builder, cache, cursor)),
                NULL
            );

            return builder.build();
        }
        finally
        {
            this.m_clang.disposeTranslationUnit(translationUnit);
        }
    }

    public ParseResults parse(Path header, List<String> clangArguments, ParseOptions options)
    {
        return this.parse(Logger.getGlobal(), header, clangArguments, options);
    }

    @Override
    public void close()
    {
        this.m_clang.disposeIndex(this.m_index);
    }
}

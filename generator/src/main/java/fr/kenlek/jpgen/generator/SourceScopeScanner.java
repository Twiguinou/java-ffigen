package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.clang.CXString;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.data.FunctionDeclaration;
import fr.kenlek.jpgen.generator.data.ParameterInfo;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

import static java.lang.foreign.MemorySegment.NULL;

import static java.lang.foreign.ValueLayout.ADDRESS;

import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXDiagnosticDisplayOptions.*;
import static fr.kenlek.jpgen.clang.CXDiagnosticSeverity.CXDiagnostic_Error;
import static fr.kenlek.jpgen.clang.CXErrorCode.CXError_Success;
import static fr.kenlek.jpgen.clang.CXTranslationUnit_Flags.*;

public class SourceScopeScanner implements AutoCloseable
{
    private static final int TRANSLATION_UNIT_OPTIONS = CXTranslationUnit_DetailedPreprocessingRecord | CXTranslationUnit_SkipFunctionBodies;
    private static final int DIAGNOSTIC_OPTIONS = CXDiagnostic_DisplaySourceLocation | CXDiagnostic_DisplayColumn | CXDiagnostic_DisplayOption | CXDiagnostic_DisplayCategoryName;

    protected final Logger m_logger;
    protected final LibClang m_clang;
    private final MemorySegment m_index;

    public SourceScopeScanner(Logger logger, LibClang clang, boolean enableClangOutput)
    {
        this.m_logger = logger;
        this.m_clang = clang;
        this.m_index = this.m_clang.createIndex(true, enableClangOutput);
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
                report.append(this.m_clang.retrieveString(this.m_clang.formatDiagnostic(allocator, diagnostic, options)));

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

    private MemorySegment createTranslationUnit(Path header, List<String> arguments)
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
                        this.m_logger.severe(report.toString());
                        throw new ClangException("Encountered errors while parsing translation unit!");
                    }
                    else if (this.m_clang.getNumDiagnosticsInSet(diagnostics) > 0)
                    {
                        this.m_logger.warning(report.toString());
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

    protected FunctionDeclaration parseFunction(ParseResults.Builder builder, CXCursor cursor)
    {
        if (this.m_clang.getCursorKind(cursor) != CXCursor_FunctionDecl)
        {
            throw new IllegalArgumentException("Cursor does not point to a function declaration.");
        }

        try (Arena arena = Arena.ofConfined())
        {
            ParameterInfo[] parameterInfos = new ParameterInfo[this.m_clang.Cursor_getNumArguments(cursor)];
            for (int i = 0; i < parameterInfos.length; i++)
            {
            }
        }
    }

    protected int visitTranslationUnitCursor(ParseOptions options, ParseResults.Builder builder, CXCursor cursor)
    {
        if (!options.filter().test(this.m_clang, cursor))
        {
            return CXChildVisit_Continue;
        }

        return switch (this.m_clang.getCursorKind(cursor))
        {
            case CXCursor_InclusionDirective -> CXChildVisit_Recurse;
            case CXCursor_FunctionDecl ->
            {
                if (!this.m_clang.Cursor_isVariadic(cursor))
                {
                }

                yield CXChildVisit_Continue;
            }
            default -> CXChildVisit_Continue;
        };
    }

    public ParseResults parse(Path header, List<String> clangArguments, ParseOptions options)
    {
        MemorySegment translationUnit = this.createTranslationUnit(header, Stream.concat(
            clangArguments.stream(),
            Stream.of("-xc", "-fno-khr-functions")
        ).toList());
        try (Arena arena = Arena.ofConfined())
        {
            ResultsBuilder builder = new ResultsBuilder();
            this.m_clang.visitChildren(
                this.m_clang.getTranslationUnitCursor(arena, translationUnit),
                ((CXCursorVisitor) (cursor, _, _) -> this.visitTranslationUnitCursor(options, builder, cursor)).makeHandle(arena),
                NULL
            );

            return builder.build();
        }
        finally
        {
            this.m_clang.disposeTranslationUnit(translationUnit);
        }
    }

    @Override
    public void close()
    {
        this.m_clang.disposeIndex(this.m_index);
    }
}

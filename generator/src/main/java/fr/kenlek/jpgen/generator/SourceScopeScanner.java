package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.api.ForeignUtils;
import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.clang.CXFieldVisitor;
import fr.kenlek.jpgen.clang.CXSourceRange;
import fr.kenlek.jpgen.clang.CXToken;
import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.Index_h;
import fr.kenlek.jpgen.generator.data.EnumType;
import fr.kenlek.jpgen.generator.data.FunctionDeclaration;
import fr.kenlek.jpgen.generator.data.FunctionType;
import fr.kenlek.jpgen.generator.data.Linkage;
import fr.kenlek.jpgen.generator.data.NumericType;
import fr.kenlek.jpgen.generator.data.RecordType;
import fr.kenlek.jpgen.generator.data.Type;
import fr.kenlek.jpgen.generator.data.path.JavaPath;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Logger;

import static java.lang.foreign.MemorySegment.NULL;

import static java.lang.foreign.ValueLayout.*;

import static fr.kenlek.jpgen.api.ForeignUtils.UNBOUNDED_POINTER;
import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXDiagnosticDisplayOptions.*;
import static fr.kenlek.jpgen.clang.CXErrorCode.CXError_Success;
import static fr.kenlek.jpgen.clang.CXTranslationUnit_Flags.*;
import static fr.kenlek.jpgen.clang.CXTypeKind.*;
import static fr.kenlek.jpgen.clang.ClangUtils.*;

public class SourceScopeScanner implements AutoCloseable
{
    private static final int CLANG_DIAGNOSTIC_OPTIONS = CXDiagnostic_DisplaySourceLocation | CXDiagnostic_DisplayColumn | CXDiagnostic_DisplayOption | CXDiagnostic_DisplayCategoryName;
    private static final int CLANG_TU_OPTIONS = CXTranslationUnit_DetailedPreprocessingRecord | CXTranslationUnit_SkipFunctionBodies | CXTranslationUnit_ForSerialization;

    private final Index_h m_indexH;
    private final MemorySegment index;
    public final Logger logger;
    public final boolean clangOutput;

    public SourceScopeScanner(Logger logger, boolean clangOutput, Index_h indexH)
    {
        logger.config(indexH.getClangVersion());
        this.index = indexH.clang_createIndex(0, getBoolean(clangOutput));
        this.logger = logger;
        this.clangOutput = clangOutput;
        this.m_indexH = indexH;
    }

    static Path resolvePath(Path path)
    {
        return path.toAbsolutePath().normalize();
    }

    private static Path mergeHeaders(List<Path> headers) throws IOException
    {
        if (headers.size() < 2)
        {
            throw new IllegalArgumentException("Not enough headers to merge.");
        }

        File compound = Files.createTempFile("jpgen-compound", ".h").toFile();
        try (FileWriter writer = new FileWriter(compound))
        {
            PrintingContext context = new PrintingContext(writer);
            for (Path header : headers)
            {
                context.append("#include \"").append(resolvePath(header).toString()).breakLine("\"");
            }
        }
        catch (Throwable t)
        {
            if (!compound.delete())
            {
                // try deleting another time
                compound.deleteOnExit();
            }

            throw t;
        }

        return resolvePath(compound.toPath());
    }

    private void resolveFunction(ParseResults results, CXCursor cursor, ParseOptions options)
    {
        if (this.m_indexH.clang_getCursorKind(cursor) != CXCursor_FunctionDecl)
        {
            throw new IllegalArgumentException("Provided cursor is not of function declaration kind.");
        }

        try (Arena visitingArena = Arena.ofConfined())
        {
            String functionName = this.m_indexH.getCursorSpelling(cursor).orElseThrow();
            JavaPath path = options.pathProvider().getPath(cursor).child(functionName);
            Linkage linkage = Linkage.map(this.m_indexH.clang_getCursorLinkage(cursor));

            NameResolver nameResolver = options.nameResolvers().get();

            List<String> parametersNames = new ArrayList<>();
            // Maybe replace with clang_Cursor_getArgument ?
            this.m_indexH.clang_visitChildren(cursor, ((CXCursorVisitor) (child, _, pCounter) ->
            {
                if (this.m_indexH.clang_getCursorKind(child) == CXCursor_ParmDecl)
                {
                    int index = pCounter.get(JAVA_INT, 0);
                    String parameterName = this.m_indexH.getCursorSpelling(child).orElse("$arg".concat(Integer.toString(index)));

                    parametersNames.add(nameResolver.resolve(parameterName));
                    pCounter.set(JAVA_INT, 0, index + 1);
                }

                return CXChildVisit_Continue;
            }).makeHandle(visitingArena), visitingArena.allocateFrom(JAVA_INT, 1));

            if (this.resolveType(results, this.m_indexH.clang_getCursorType(visitingArena, cursor), options) instanceof FunctionType descriptorType)
            {
                results.functions.add(new FunctionDeclaration(path, linkage, descriptorType, parametersNames));
            }
            else
            {
                throw new IllegalStateException("Descriptor type is not instance of FunctionType.");
            }
        }
    }

    private Type createManifold(ParseResults results, ParseOptions options, CXType type) throws ClangException
    {
        return switch (type.kind())
        {
            case CXType_Void -> Type.VOID;
            // Integral types
            case CXType_Bool -> NumericType.BOOLEAN;
            case CXType_Char16 -> NumericType.CHAR_16;
            case CXType_WChar ->
            {
                int size = (int) this.m_indexH.clang_Type_getSizeOf(type);
                yield size == Character.BYTES ? NumericType.CHAR_16 : NumericType.mapIntegralBytes(size);
            }
            case CXType_UChar, CXType_SChar, CXType_Char_U, CXType_Char_S, CXType_Char32, CXType_UShort, CXType_Short,
                 CXType_UInt, CXType_Int, CXType_ULong, CXType_Long, CXType_ULongLong, CXType_LongLong ->
                NumericType.mapIntegralBytes((int) this.m_indexH.clang_Type_getSizeOf(type));
            // Floating-point types
            case CXType_Float, CXType_Double, CXType_LongDouble ->
                NumericType.mapFloatBytes((int) this.m_indexH.clang_Type_getSizeOf(type));
            // Composite types
            case CXType_Enum ->
            {
                try (Arena visitingArena = Arena.ofConfined())
                {
                    // Every declaration of an enum immediately goes to its definition.
                    CXCursor declarationCursor = this.m_indexH.clang_getTypeDeclaration(visitingArena, type);
                    assert this.m_indexH.clang_getCursorKind(declarationCursor) == CXCursor_EnumDecl;

                    Type integerType = this.resolveType(results, this.m_indexH.clang_getEnumDeclIntegerType(visitingArena, declarationCursor), options);
                    EnumType.Builder enumBuilder = new EnumType.Builder(integerType);

                    this.m_indexH.clang_visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, _) ->
                    {
                        if (this.m_indexH.clang_getCursorKind(cursor) == CXCursor_EnumConstantDecl)
                        {
                            try (Arena arena = Arena.ofConfined())
                            {
                                String constantName = this.m_indexH.retrieveString(this.m_indexH.clang_getCursorSpelling(arena, cursor)).orElseThrow();
                                long value = this.m_indexH.clang_getEnumConstantDeclValue(cursor);
                                enumBuilder.addConstant(constantName, value);
                            }
                        }

                        return CXChildVisit_Continue;
                    }).makeHandle(visitingArena), NULL);

                    yield this.m_indexH.getCursorSpelling(declarationCursor).map(name -> (Type) enumBuilder.build(options.pathProvider()
                        .getPath(declarationCursor)
                        .child(name))).orElseGet(enumBuilder::build);
                }
            }
            case CXType_FunctionProto, CXType_FunctionNoProto ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    Type resultType = this.resolveType(results, this.m_indexH.clang_getResultType(arena, type), options);

                    FunctionType.Builder functionBuilder = new FunctionType.Builder(resultType);
                    int numArgs = this.m_indexH.clang_getNumArgTypes(type);
                    for (int i = 0; i < numArgs; i++)
                    {
                        try (Arena argArena = Arena.ofConfined())
                        {
                            Type parameterType = this.resolveType(results, this.m_indexH.clang_getArgType(argArena, type, i), options);
                            functionBuilder.addParameter(parameterType);
                        }
                    }

                    yield functionBuilder.build();
                }
            }
            case CXType_Record ->
            {
                try (Arena visitingArena = Arena.ofConfined())
                {
                    /*
                     * When going through a record, there is a potential risk of falling into infinite recursion because it can contain
                     * a field which references the very same struct in some way.
                     */

                    CXCursor declarationCursor = this.m_indexH.clang_getTypeDeclaration(visitingArena, type);
                    assert isRecordDeclaration(this.m_indexH.clang_getCursorKind(declarationCursor));

                    Optional<String> recordName = this.m_indexH.getCursorSpelling(declarationCursor);
                    RecordType.Kind kind = RecordType.Kind.map(this.m_indexH.clang_getCursorKind(declarationCursor));
                    long alignment = Math.max(this.m_indexH.clang_Type_getAlignOf(type), 1);

                    NameResolver nameResolver = options.nameResolvers().get();
                    if (recordName.isPresent())
                    {
                        nameResolver.register(options.recordPointerName());
                    }

                    MemorySegment pPredictedOffset = visitingArena.allocate(JAVA_LONG);
                    RecordType.Builder recordBuilder = new RecordType.Builder(kind, alignment);
                    this.m_indexH.clang_Type_visitFields(type, ((CXFieldVisitor) (cursor, _) ->
                    {
                        try (Arena arena = Arena.ofConfined())
                        {
                            long predictedOffset = pPredictedOffset.get(JAVA_LONG, 0);

                            String fieldName = this.m_indexH.getCursorSpelling(cursor).map(nameResolver::resolve).orElse(null);
                            CXType clangType = this.m_indexH.clang_getCursorType(arena, cursor);
                            Type fieldType = this.resolveType(results, clangType, options);
                            long bitOffset = this.m_indexH.clang_Cursor_getOffsetOfField(cursor);

                            if (getBoolean(this.m_indexH.clang_Cursor_isBitField(cursor)))
                            {
                                long width = this.m_indexH.clang_getFieldDeclBitWidth(cursor);
                                recordBuilder.appendMember(new RecordType.Bitfield(fieldType, bitOffset, fieldName, width));
                            }
                            else
                            {
                                long padding = bitOffset - predictedOffset;
                                if (padding > 0)
                                {
                                    recordBuilder.appendMember(new RecordType.Padding(bitOffset, padding >>> 3));
                                }
                                long size = this.m_indexH.clang_Type_getSizeOf(clangType) << 3;

                                recordBuilder.appendMember(new RecordType.Member(fieldType, bitOffset, fieldName));
                                pPredictedOffset.set(JAVA_LONG, 0, bitOffset + size);
                            }
                        }

                        return CXChildVisit_Continue;
                    }).makeHandle(visitingArena), NULL);

                    long lastOffset = pPredictedOffset.get(JAVA_LONG, 0);
                    long padding = (this.m_indexH.clang_Type_getSizeOf(type) << 3) - lastOffset;
                    if (padding > 0)
                    {
                        recordBuilder.appendMember(new RecordType.Padding(lastOffset, padding >>> 3));
                    }

                    if (recordName.isPresent())
                    {
                        yield recordBuilder.build(options.pathProvider()
                            .getPath(declarationCursor)
                            .child(recordName.orElseThrow()), options.recordPointerName());
                    }

                    yield recordBuilder.build();
                }
            }
            case CXType_Typedef ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    JavaPath path = options.pathProvider()
                        .getPath(this.m_indexH.clang_getTypeDeclaration(arena, type))
                        .child(this.m_indexH.retrieveString(this.m_indexH.clang_getTypeSpelling(arena, type)).orElseThrow());
                    Type canonicalType = this.resolveType(results, this.m_indexH.clang_getCanonicalType(arena, type), options);

                    yield new Type.Alias(path, canonicalType);
                }
            }
            // Elaborated, Unexposed and Auto were previously redirected to the type they refer to, but this was a bad decision.
            // In some cases, like writing to a ZipOutputStream, writing a declaration only once is very important and you just
            // can't afford duplicates. This could become a bad decision later but I just chose to wrap these with a custom type.
            case CXType_Elaborated ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    yield new Type.OpaqueReference(this.resolveType(results, this.m_indexH.clang_Type_getNamedType(arena, type), options));
                }
            }
            case CXType_Unexposed, CXType_Auto ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    yield new Type.OpaqueReference(this.resolveType(results, this.m_indexH.clang_getCanonicalType(arena, type), options));
                }
            }
            case CXType_Pointer, CXType_BlockPointer, CXType_IncompleteArray -> NumericType.POINTER;
            case CXType_ConstantArray, CXType_Vector ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    long length = this.m_indexH.clang_getNumElements(type);
                    if (length == -1)
                    {
                        length = Long.MAX_VALUE;
                    }

                    yield new Type.Array(this.resolveType(results, this.m_indexH.clang_getElementType(arena, type), options), length);
                }
            }
            default ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    String kindSpelling = this.m_indexH.retrieveString(this.m_indexH.clang_getTypeKindSpelling(arena, type.kind())).orElseThrow();
                    throw new ClangException("Could not resolve type kind: %s.".formatted(kindSpelling));
                }
            }
        };
    }

    private Type resolveType(ParseResults results, ParseResults.TypeKey typeKey, ParseOptions options) throws ClangException
    {
        if (!results.typeTable.containsKey(typeKey))
        {
            CXType type = typeKey.internal;
            ParseResults.TypeKey globalKey = results.createPersistentTypeKey(type);

            Function<CXType, Type> nativeResolver = t -> this.resolveType(results, t, options);

            Type manifold = options.preTypeResolver()
                .resolveType(this.m_indexH, type, options, nativeResolver)
                .orElseGet(() -> options.postTypeResolver()
                    .resolveType(this.m_indexH, type, this.createManifold(results, options, type), options, nativeResolver));

            results.typeTable.put(globalKey, manifold);
        }

        return results.typeTable.get(typeKey);
    }

    private Type resolveType(ParseResults results, CXType type, ParseOptions options) throws ClangException
    {
        return this.resolveType(results, results.createTypeKey(type), options);
    }

    private void fillResults(ParseResults results, ParseOptions options) throws IOException, ClangException
    {
        try (Arena visitingArena = Arena.ofConfined();
             Constants constants = options.skipConstants() ? null : Constants.make(this.logger, this.clangOutput, results.translationUnit)
        )
        {
            this.m_indexH.clang_visitChildren(this.m_indexH.clang_getTranslationUnitCursor(visitingArena, results.translationUnit), ((CXCursorVisitor) (cursor, _, _) ->
            {
                if (!options.elementFilter().test(this.m_indexH, cursor))
                {
                    return CXChildVisit_Continue;
                }

                switch (this.m_indexH.clang_getCursorKind(cursor))
                {
                    case CXCursor_EnumDecl, CXCursor_StructDecl, CXCursor_UnionDecl, CXCursor_TypedefDecl ->
                    {
                        try (Arena arena = Arena.ofConfined())
                        {
                            this.resolveType(results, this.m_indexH.clang_getCursorType(arena, cursor), options);
                        }
                    }
                    case CXCursor_FunctionDecl ->
                    {
                        if (!getBoolean(this.m_indexH.clang_Cursor_isFunctionInlined(cursor)) && !getBoolean(this.m_indexH.clang_Cursor_isVariadic(cursor)))
                        {
                            this.resolveFunction(results, cursor, options);
                        }
                    }
                    case CXCursor_MacroDefinition ->
                    {
                        if (!options.skipConstants() && !getBoolean(this.m_indexH.clang_Cursor_isMacroFunctionLike(cursor)))
                        {
                            try (Arena arena = Arena.ofConfined())
                            {
                                MemorySegment pTokens = arena.allocate(UNBOUNDED_POINTER);
                                MemorySegment pCount = arena.allocate(JAVA_INT);
                                CXSourceRange range = this.m_indexH.clang_getCursorExtent(arena, cursor);
                                this.m_indexH.clang_tokenize(results.translationUnit, range, pTokens, pCount);

                                MemorySegment tokens = pTokens.get(UNBOUNDED_POINTER, 0);
                                int numTokens = pCount.get(JAVA_INT, 0);

                                List<String> strTokens = new ArrayList<>();
                                for (int i = 0; i < numTokens; i++)
                                {
                                    CXToken token = CXToken.getAtIndex(tokens, i);
                                    this.m_indexH.retrieveString(this.m_indexH.clang_getTokenSpelling(arena, results.translationUnit, token)).ifPresent(strTokens::add);
                                }

                                constants.process(strTokens.toArray(String[]::new));
                            }
                        }
                    }
                    case CXCursor_InclusionDirective ->
                    {
                        MemorySegment includedFile = this.m_indexH.clang_getIncludedFile(cursor);
                        if (this.m_indexH.getFilePath(includedFile).filter(options.elementFilter()::test).isPresent())
                        {
                            return CXChildVisit_Recurse;
                        }
                    }
                }

                return CXChildVisit_Continue;
            }).makeHandle(visitingArena), NULL);

            if (!options.skipConstants())
            {
                constants.parseRemaining();
                results.constants.addAll(constants.getParsedSet());
            }
        }
    }

    public ParseResults process(ParseOptions options) throws IOException, ClangException
    {
        if (options.headers().isEmpty())
        {
            throw new IllegalArgumentException("Nothing to parse.");
        }

        boolean isCompound = options.headers().size() > 1;
        Path headerPath = isCompound ? mergeHeaders(options.headers()) : options.headers().getFirst();
        List<String> allArgs = new ArrayList<>(options.clangArgs());
        allArgs.add("-xc");
        /*
         * Important note for future inspection:
         * While trying to generate bindings for glslang I came across a weird behavior that Clang had with this function:
         *
         * const char* glslang_default_resource_string();
         *
         * While it seems perfectly fine at first glance, it turns out Clang thinks this function has no prototype. It furthermore interprets it as variadic.
         * After a bit of digging I found out why, Clang still parses the old K&R style function declaration, which is now very much obsolete. As a matter of
         * fact the correct syntax would be:
         *
         * const char* glslang_default_resource_string(void);
         *
         * To prevent this, I simply disabled K&R functions, hoping it does not generate errors in the future.
         */
        allArgs.add("-fno-knr-functions");

        try
        {
            ParseResults results = new ParseResults(this.m_indexH, this.createTranslationUnit(headerPath, allArgs));
            try
            {
                this.fillResults(results, options);
                return results;
            }
            catch (Throwable t)
            {
                results.close();
                throw t;
            }
        }
        finally
        {
            if (isCompound)
            {
                Files.delete(headerPath);
            }
        }
    }

    private MemorySegment createTranslationUnit(Path header, List<String> args) throws ClangException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment clangArgs = ForeignUtils.allocateStringArray(arena, args);

            MemorySegment pTu = arena.allocate(ADDRESS);
            int error = this.m_indexH.clang_parseTranslationUnit2(this.index, arena.allocateFrom(header.toString()), clangArgs, args.size(), NULL, 0, CLANG_TU_OPTIONS, pTu);
            if (error != CXError_Success)
            {
                throw new ClangException("Failed to parse translation unit: ".concat(Integer.toString(error)));
            }

            MemorySegment translationUnit = pTu.get(ADDRESS, 0);

            MemorySegment diagnostics = this.m_indexH.clang_getDiagnosticSetFromTU(translationUnit);
            StringBuilder clangReport = new StringBuilder("------- Clang debug parsing output -------");
            int startLength = clangReport.length();
            if (this.m_indexH.dumpDiagnostics(diagnostics, CLANG_DIAGNOSTIC_OPTIONS, clangReport))
            {
                this.logger.severe(clangReport.toString());
                this.m_indexH.clang_disposeTranslationUnit(translationUnit);
                throw new ClangException("Encountered errors while parsing translation unit!");
            }
            else if (clangReport.length() != startLength)
            {
                this.logger.warning(clangReport.toString());
            }

            return translationUnit;
        }
    }

    @Override
    public void close()
    {
        this.m_indexH.clang_disposeIndex(this.index);
    }
}

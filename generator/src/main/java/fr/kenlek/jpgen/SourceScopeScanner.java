package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.clang.CXFieldVisitor;
import fr.kenlek.jpgen.clang.CXSourceRange;
import fr.kenlek.jpgen.clang.CXToken;
import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.Index_h;
import fr.kenlek.jpgen.data.Binding;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.CanonicalPackage;
import fr.kenlek.jpgen.data.Constant;
import fr.kenlek.jpgen.data.EnumType;
import fr.kenlek.jpgen.data.FunctionDeclaration;
import fr.kenlek.jpgen.data.FunctionType;
import fr.kenlek.jpgen.data.Linkage;
import fr.kenlek.jpgen.data.RecordInformation;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.logging.Logger;

import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.*;
import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXDiagnosticDisplayOptions.*;
import static fr.kenlek.jpgen.clang.CXDiagnosticSeverity.*;
import static fr.kenlek.jpgen.clang.CXErrorCode.*;
import static fr.kenlek.jpgen.clang.CXTranslationUnit_Flags.*;
import static fr.kenlek.jpgen.clang.CXTypeKind.*;
import static fr.kenlek.jpgen.clang.Index_h.*;

public class SourceScopeScanner implements AutoCloseable
{
    public final class TypeKey implements Type.Delegated
    {
        public final CXType internal;

        public TypeKey(CXType internal)
        {
            this.internal = internal;
        }

        public TypeKey(SegmentAllocator allocator, CXType internal)
        {
            this(new CXType(allocator.allocate(CXType.gRecordLayout).copyFrom(internal.ptr())));
        }

        @Override
        public Type underlyingType()
        {
            return SourceScopeScanner.this.typeTable.get(this);
        }

        @Override
        public Type discover()
        {
            return this.underlyingType().discover();
        }

        @Override
        public boolean equals(Object obj)
        {
            return obj == this || (obj instanceof TypeKey typeKey && clang_equalTypes(typeKey.internal, this.internal) != 0);
        }

        @Override
        public int hashCode()
        {
            return Arrays.hashCode(new long[] {this.internal.data(0).address(), this.internal.data(1).address()});
        }

        @Override
        public String toString()
        {
            return this.discover().toString();
        }
    }

    private static final int CLANG_DIAGNOSTIC_OPTIONS = CXDiagnostic_DisplaySourceLocation | CXDiagnostic_DisplayColumn | CXDiagnostic_DisplayOption | CXDiagnostic_DisplayCategoryName;
    private static final int CLANG_TU_OPTIONS = CXTranslationUnit_DetailedPreprocessingRecord | CXTranslationUnit_SkipFunctionBodies | CXTranslationUnit_ForSerialization;
    private static final String DEFAULT_RECORD_POINTER_NAME = "ptr";
    private static final String DEFAULT_RECORD_LAYOUT_NAME = "gRecordLayout";

    private final MemorySegment m_index;
    private final boolean m_clangOutput;
    public final Logger logger;
    private final Map<TypeKey, TypeKey> m_globalKeys = new HashMap<>();
    public final Map<TypeKey, Type> typeTable = new HashMap<>();
    public final List<FunctionDeclaration> functions = new ArrayList<>();
    private final Arena m_persistentArena = Arena.ofShared();
    private final LocationProvider m_locationProvider;
    public final List<Constant> constants = new ArrayList<>();
    private final String m_recordPointerName, m_recordLayoutName;
    private final Set<String> m_pathFilter = new HashSet<>();
    private final List<MemorySegment> m_openTranslationUnits = new ArrayList<>();
    private final List<String> m_clangArgs;
    public final boolean skipConstants;

    public SourceScopeScanner(Logger logger, boolean clangOutput, String recordPointerName, String recordLayoutName, LocationProvider locationProvider,
                              boolean skipConstants, List<String> clangArgs)
    {
        try (Arena arena = Arena.ofConfined())
        {
            logger.info(getClangVersion(arena));
            this.m_index = clang_createIndex(0, clangOutput ? 1 : 0);
            this.logger = logger;
            this.m_locationProvider = locationProvider;
            this.m_recordLayoutName = recordLayoutName;
            this.m_recordPointerName = recordPointerName;
            this.m_clangOutput = clangOutput;
            this.skipConstants = skipConstants;
        }

        Set<String> clangArgSet = new LinkedHashSet<>();
        clangArgSet.add("-fparse-all-comments");
        clangArgSet.add("-xc");
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
        clangArgSet.add("-fno-knr-functions");
        clangArgSet.addAll(clangArgs);

        this.m_clangArgs = List.copyOf(clangArgSet);
    }

    @SuppressWarnings("unused")
    public SourceScopeScanner(Logger logger, boolean clangOutput, String recordPointerName, String recordLayoutName, LocationProvider locationProvider,
                              boolean skipConstants, String... optionalArgs)
    {
        this(logger, clangOutput, recordPointerName, recordLayoutName, locationProvider, skipConstants, List.of(optionalArgs));
    }

    public SourceScopeScanner(Logger logger, boolean clangOutput, LocationProvider locationProvider, boolean skipConstants, List<String> optionalArgs)
    {
        this(logger, clangOutput, DEFAULT_RECORD_POINTER_NAME, DEFAULT_RECORD_LAYOUT_NAME, locationProvider, skipConstants, optionalArgs);
    }

    @SuppressWarnings("unused")
    public SourceScopeScanner(Logger logger, boolean clangOutput, LocationProvider locationProvider, boolean skipConstants, String... optionalArgs)
    {
        this(logger, clangOutput, locationProvider, skipConstants, List.of(optionalArgs));
    }

    public static String getClangVersion(SegmentAllocator allocator)
    {
        return ClangUtils.retrieveString(clang_getClangVersion(allocator)).orElseThrow();
    }

    private static boolean dumpDiagnostics(Arena arena, MemorySegment diagnostics, StringBuilder clangReport)
    {
        boolean fail = false;
        for (int i = 0; i < clang_getNumDiagnosticsInSet(diagnostics); i++)
        {
            MemorySegment diag = clang_getDiagnosticInSet(diagnostics, i);
            ClangUtils.retrieveString(clang_formatDiagnostic(arena, diag, CLANG_DIAGNOSTIC_OPTIONS)).ifPresent(diagString ->
            {
                clangReport.append(System.lineSeparator());
                clangReport.append(diagString);
            });

            MemorySegment children = clang_getChildDiagnostics(diag);
            fail |= clang_getDiagnosticSeverity(diag) >= CXDiagnostic_Error;
            fail |= dumpDiagnostics(arena, children, clangReport);
            clang_disposeDiagnostic(diag);
        }

        return fail;
    }

    private FunctionDeclaration parseFunction(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_FunctionDecl;
        try (Arena arena = Arena.ofConfined())
        {
            if (this.resolveType(clang_getCursorType(arena, cursor)).discover() instanceof FunctionType functionType)
            {
                String functionName = ClangUtils.getCursorSpelling(arena, cursor).orElseThrow();
                CanonicalPackage location = this.m_locationProvider.getLocation(cursor);
                Linkage linkage = Linkage.map(clang_getCursorLinkage(cursor));
                List<String> parametersNames = new ArrayList<>();

                // Maybe replace with clang_Cursor_getArgument ?
                clang_visitChildren(cursor, ((CXCursorVisitor) (child, _, pCounter) ->
                {
                    if (clang_getCursorKind(child) == CXCursor_ParmDecl)
                    {
                        int index = pCounter.get(JAVA_INT, 0);
                        String parameterName = ClangUtils.getCursorSpelling(arena, child)
                                .filter(spelling -> !spelling.isEmpty())
                                .orElse(String.format("__arg%d", index));

                        parametersNames.add(parameterName);
                        pCounter.set(JAVA_INT, 0, index + 1);
                    }

                    return CXChildVisit_Continue;
                }).makeHandle(arena), arena.allocateFrom(JAVA_INT, 1));

                return new FunctionDeclaration(functionName, location, linkage, functionType, parametersNames);
            }

            throw new AssertionError("Type mismatch for function declaration.");
        }
    }

    private static Optional<RecordType.Padding> computePadding(long predicted, long size)
    {
        if (size > predicted)
        {
            long padding = (size - predicted) / 8;
            return Optional.of(new RecordType.Padding(padding));
        }

        return Optional.empty();
    }

    private void visitStructMember(CXCursor cursor, RecordType.Builder builder, MemorySegment offsetPrediction, Consumer<String> skipReport)
    {
        try (Arena arena = Arena.ofConfined())
        {
            String fieldName = ClangUtils.getCursorSpelling(arena, cursor).orElse("");

            if (clang_Cursor_isBitField(cursor) != 0)
            {
                skipReport.accept(String.format("Skipping bitfield: %s", fieldName));
            }
            else
            {
                CXType innerType = clang_getCursorType(arena, cursor);
                Type fieldType = this.resolveType(innerType);

                long offset = clang_Cursor_getOffsetOfField(cursor);
                computePadding(offsetPrediction.get(JAVA_LONG, 0), offset).ifPresent(builder::appendMember);
                builder.appendMember(new RecordType.Field(fieldType, fieldName));

                offsetPrediction.set(JAVA_LONG, 0, offset + clang_Type_getSizeOf(innerType) * 8);
            }
        }
    }

    private TypeKey resolveType(CXType type) throws ClangException
    {
        return this.resolveType(new TypeKey(type));
    }

    private TypeKey resolveType(TypeKey typeKey) throws ClangException
    {
        if (!this.m_globalKeys.containsKey(typeKey))
        {
            CXType type = typeKey.internal;
            TypeKey globalKey = new TypeKey(this.m_persistentArena, type);
            this.m_globalKeys.put(globalKey, globalKey);

            Type manifold = switch (type.kind())
            {
                case CXType_Void -> Type.VOID;
                // Integral types
                case CXType_Bool -> Type.BOOLEAN;
                case CXType_UChar, CXType_SChar, CXType_Char_U, CXType_Char_S -> Type.BYTE;
                case CXType_Char16 -> Type.CHARACTER;
                case CXType_WChar -> clang_Type_getSizeOf(type) == Character.BYTES ? Type.CHARACTER : Type.INTEGER;
                case CXType_UShort, CXType_Short -> Type.SHORT;
                case CXType_UInt, CXType_Int, CXType_Char32 -> Type.INTEGER;
                case CXType_ULong, CXType_Long -> clang_Type_getSizeOf(type) == Long.BYTES ? Type.LONG : Type.INTEGER;
                case CXType_ULongLong, CXType_LongLong -> Type.LONG;
                // Floating-point types
                case CXType_Float -> Type.FLOAT;
                case CXType_Double -> Type.DOUBLE;
                case CXType_Enum ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        // Every declaration of an enum immediately goes to its definition.
                        CXCursor declarationCursor = clang_getTypeDeclaration(arena, type);
                        assert clang_getCursorKind(declarationCursor) == CXCursor_EnumDecl;

                        CanonicalPackage location = this.m_locationProvider.getLocation(declarationCursor);

                        Type integerType = this.resolveType(clang_getEnumDeclIntegerType(arena, declarationCursor));
                        EnumType.Builder enumBuilder = new EnumType.Builder(integerType);

                        clang_visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, _) ->
                        {
                            if (clang_getCursorKind(cursor) == CXCursor_EnumConstantDecl)
                            {
                                String constantName = ClangUtils.retrieveString(clang_getCursorSpelling(arena, cursor)).orElseThrow();
                                long value = clang_getEnumConstantDeclValue(cursor);
                                enumBuilder.putConstant(constantName, value);
                            }

                            return CXChildVisit_Continue;
                        }).makeHandle(arena), NULL);

                        yield ClangUtils.getCursorSpelling(arena, declarationCursor)
                                .map(name -> (Type) enumBuilder.buildAsDeclaration(location, name))
                                .orElseGet(enumBuilder::buildAsType);
                    }
                }
                case CXType_FunctionProto, CXType_FunctionNoProto ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        Type resultType = this.resolveType(clang_getResultType(arena, type));
                        boolean variadic = clang_isFunctionTypeVariadic(type) != 0;

                        FunctionType.Builder functionBuilder = new FunctionType.Builder(resultType, variadic);
                        int numArgs = clang_getNumArgTypes(type);
                        for (int i = 0; i < numArgs; i++)
                        {
                            Type parameterType = this.resolveType(clang_getArgType(arena, type, i));
                            functionBuilder.addParameter(parameterType);
                        }

                        yield functionBuilder.build();
                    }
                }
                case CXType_Record ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        /*
                         * When going through a record, there is a potential risk of falling into infinite recursion because it can contain
                         * a field which references the very same struct in some way.
                         */

                        CXCursor declarationCursor = clang_getTypeDeclaration(arena, type);
                        assert ClangUtils.isRecordDeclaration(clang_getCursorKind(declarationCursor));

                        CanonicalPackage location = this.m_locationProvider.getLocation(declarationCursor);

                        Optional<String> recordName = ClangUtils.getCursorSpelling(arena, declarationCursor);
                        long alignment = clang_Type_getAlignOf(type);

                        RecordType.Builder recordBuilder;
                        if (clang_getCursorKind(declarationCursor) == CXCursor_UnionDecl)
                        {
                            recordBuilder = new RecordType.Builder(RecordType.Kind.UNION, alignment);
                            // There are no paddings to worry about here.
                            clang_Type_visitFields(type, ((CXFieldVisitor) (cursor, _) ->
                            {
                                try (Arena frameArena = Arena.ofConfined())
                                {
                                    String fieldName = ClangUtils.getCursorSpelling(frameArena, cursor).orElse("");
                                    Type fieldType = this.resolveType(clang_getCursorType(frameArena, cursor));
                                    recordBuilder.appendMember(new RecordType.Field(fieldType, fieldName));

                                    return CXChildVisit_Continue;
                                }
                            }).makeHandle(arena), NULL);
                        }
                        else
                        {
                            // While clang returns a type's size in bytes, offsets are returned in bits to take bitfields into account.
                            MemorySegment fieldOffset = arena.allocateFrom(JAVA_LONG, 0);

                            //TODO: bitfields

                            recordBuilder = new RecordType.Builder(RecordType.Kind.STRUCT, alignment);
                            clang_Type_visitFields(type, ((CXFieldVisitor) (cursor, userdata) ->
                            {
                                this.visitStructMember(cursor, recordBuilder, userdata, msg -> recordName.ifPresentOrElse(
                                        declarationName -> this.logger.warning(String.format("Report on %s: %s", declarationName, msg)),
                                        () -> this.logger.warning(msg)
                                ));
                                return CXChildVisit_Continue;
                            }).makeHandle(arena), fieldOffset);

                            long size = clang_Type_getSizeOf(type) * 8;
                            computePadding(fieldOffset.get(JAVA_LONG, 0), size).ifPresent(recordBuilder::appendMember);
                        }

                        yield recordName.map(name ->
                                {
                                    RecordInformation information = new RecordInformation(location, name,
                                            this.m_recordPointerName, this.m_recordLayoutName);
                                    return (Type) recordBuilder.buildAsDeclaration(information);
                                })
                                .orElseGet(recordBuilder::buildAsType);
                    }
                }
                case CXType_Typedef ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        CanonicalPackage location = this.m_locationProvider.getLocation(clang_getTypeDeclaration(arena, type));
                        String aliasIdentifier = ClangUtils.retrieveString(clang_getTypeSpelling(arena, type)).orElseThrow();
                        Type canonicalType = this.resolveType(clang_getCanonicalType(arena, type));
                        yield new Type.Alias(canonicalType, location, aliasIdentifier);
                    }
                }
                case CXType_Elaborated ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        yield this.resolveType(clang_Type_getNamedType(arena, type));
                    }
                }
                case CXType_Unexposed, CXType_Auto ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        yield this.resolveType(clang_getCanonicalType(arena, type));
                    }
                }
                case CXType_Pointer, CXType_BlockPointer ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        yield new Type.Pointer(this.resolveType(clang_getPointeeType(arena, type)));
                    }
                }
                case CXType_ConstantArray, CXType_IncompleteArray, CXType_Vector ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        long length = clang_getNumElements(type);
                        if (length == -1)
                        {
                            length = Long.MAX_VALUE;
                        }

                        yield new Type.Array(this.resolveType(clang_getElementType(arena, type)), length);
                    }
                }
                case CXType_Complex ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        yield this.resolveType(clang_getElementType(arena, type));
                    }
                }
                default ->
                {
                    if (type.kind() == CXType_LongDouble && clang_Type_getSizeOf(type) == Double.BYTES)
                    {
                        yield Type.DOUBLE;
                    }

                    try (Arena arena = Arena.ofConfined())
                    {
                        String kindSpelling = ClangUtils.retrieveString(clang_getTypeKindSpelling(arena, type.kind())).orElseThrow();
                        throw new ClangException(String.format("Could not resolve type kind: %s.", kindSpelling));
                    }
                }
            };

            this.typeTable.put(globalKey, manifold);
            typeKey = globalKey;
        }
        else
        {
            typeKey = this.m_globalKeys.get(typeKey);
        }

        return typeKey;
    }

    public void process(Path headerFile) throws ClangException
    {
        this.process(headerFile, ElementFilter.ALL_PARSE);
    }

    public void process(Path headerFile, ElementFilter filter) throws ClangException
    {
        String headerPathString = headerFile.toAbsolutePath().toString();
        if (this.m_pathFilter.contains(headerPathString) || !filter.test(headerFile))
        {
            return;
        }

        MemorySegment translationUnit = this.createTranslationUnit(headerPathString);
        this.m_openTranslationUnits.add(translationUnit);

        try (Arena visitingArena = Arena.ofConfined();
             Constants constants = this.skipConstants ? null : Constants.make(this.logger, this.m_clangOutput, translationUnit, this.constants))
        {
            CXCursor tuCursor = clang_getTranslationUnitCursor(visitingArena, translationUnit);
            ClangUtils.getCursorFilePath(visitingArena, tuCursor).ifPresent(path -> this.m_pathFilter.add(path.toString()));

            clang_visitChildren(clang_getTranslationUnitCursor(visitingArena, translationUnit), ((CXCursorVisitor) (cursor, _, _) ->
            {
                if (!filter.test(cursor))
                {
                    return CXChildVisit_Continue;
                }

                switch (clang_getCursorKind(cursor))
                {
                    case CXCursor_InclusionDirective ->
                    {
                        try (Arena arena = Arena.ofConfined())
                        {
                            MemorySegment file = clang_getIncludedFile(cursor);
                            if (ClangUtils.retrieveString(clang_getFileName(arena, file))
                                    .filter(pathString -> filter.test(Path.of(pathString)) && this.m_pathFilter.add(pathString))
                                    .isPresent())
                            {
                                return CXChildVisit_Recurse;
                            }
                        }
                    }
                    case CXCursor_EnumDecl, CXCursor_StructDecl, CXCursor_UnionDecl, CXCursor_TypedefDecl ->
                    {
                        try (Arena arena = Arena.ofConfined())
                        {
                            this.resolveType(clang_getCursorType(arena, cursor));
                        }
                    }
                    case CXCursor_FunctionDecl ->
                    {
                        if (clang_Cursor_isFunctionInlined(cursor) == 0)
                        {
                            this.functions.add(this.parseFunction(cursor));
                        }
                    }
                    case CXCursor_MacroDefinition ->
                    {
                        if (!this.skipConstants && clang_Cursor_isMacroFunctionLike(cursor) == 0)
                        {
                            try (Arena arena = Arena.ofConfined())
                            {
                                MemorySegment pTokens = arena.allocate(NativeTypes.UNBOUNDED_POINTER);
                                MemorySegment pCount = arena.allocate(JAVA_INT);
                                CXSourceRange range = clang_getCursorExtent(arena, cursor);
                                clang_tokenize(translationUnit, range, pTokens, pCount);

                                MemorySegment tokens = pTokens.get(NativeTypes.UNBOUNDED_POINTER, 0);
                                int numTokens = pCount.get(JAVA_INT, 0);

                                List<String> strTokens = new ArrayList<>();
                                for (int i = 0; i < numTokens; i++)
                                {
                                    CXToken token = CXToken.getAtIndex(tokens, i);
                                    ClangUtils.retrieveString(clang_getTokenSpelling(arena, translationUnit, token)).ifPresent(strTokens::add);
                                }

                                constants.process(strTokens.toArray(String[]::new));
                            }
                        }
                    }
                }

                return CXChildVisit_Continue;
            }).makeHandle(visitingArena), NULL);

            if (!this.skipConstants)
            {
                constants.parseRemaining();
                constants.getParsedSet().forEach(this.constants::add);
            }
        }
        catch (IOException e)
        {
            this.logger.severe(e.toString());
        }
    }

    private MemorySegment createTranslationUnit(String headerFileName) throws ClangException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment clangArgs = ForeignUtils.allocateStringArray(arena, this.m_clangArgs);

            MemorySegment pTu = arena.allocate(ADDRESS);
            int error = clang_parseTranslationUnit2(this.m_index, arena.allocateFrom(headerFileName), clangArgs, this.m_clangArgs.size(), NULL, 0, CLANG_TU_OPTIONS, pTu);
            if (error != CXError_Success)
            {
                throw new ClangException(String.format("Failed to parse translation unit: %d", error));
            }
            MemorySegment translationUnit = pTu.get(ADDRESS, 0);

            MemorySegment diagnostics = clang_getDiagnosticSetFromTU(translationUnit);
            StringBuilder clangReport = new StringBuilder("------- Clang debug parsing output -------");
            final int startLength = clangReport.length();
            if (dumpDiagnostics(arena, diagnostics, clangReport))
            {
                this.logger.severe(clangReport.toString());
                clang_disposeTranslationUnit(translationUnit);
                throw new ClangException("Encountered errors while parsing translation unit!");
            }
            else if (clangReport.length() != startLength)
            {
                this.logger.warning(clangReport.toString());
            }

            return translationUnit;
        }
    }

    public List<RecordType.Decl> gatherRecordDeclarations(CanonicalPackage location)
    {
        return this.typeTable.values().stream()
                .filter(type -> type instanceof RecordType.Decl record && !record.isIncomplete() && location.isPrefix(record.location()))
                .map(type -> (RecordType.Decl) type)
                .toList();
    }

    public List<EnumType.Decl> gatherEnumDeclarations(CanonicalPackage location)
    {
        return this.typeTable.values().stream()
                .filter(type -> type instanceof EnumType.Decl enumDecl && location.isPrefix(enumDecl.location()))
                .map(type -> (EnumType.Decl) type)
                .toList();
    }

    public List<Binding> gatherBindings(CanonicalPackage location)
    {
        return this.functions.stream()
                .filter(function -> function.linkage == Linkage.EXTERNAL && !function.descriptorType.variadic() && location.isPrefix(function.location()))
                .map(Binding::new)
                .toList();
    }

    public List<CallbackDeclaration> makeCallbacks(CanonicalPackage location, String descriptorName, String stubName)
    {
        return this.typeTable.entrySet().stream()
                .filter(entry -> entry.getValue() instanceof Type.Alias(_, CanonicalPackage aliasLocation, _) && location.isPrefix(aliasLocation))
                .map(entry ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        CXCursor declarationCursor = clang_getTypeDeclaration(arena, entry.getKey().internal);
                        return ((Type.Alias)entry.getValue()).toCallback(declarationCursor, descriptorName, stubName);
                    }
                })
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }

    public List<CallbackDeclaration> makeCallbacks(CanonicalPackage location)
    {
        return this.makeCallbacks(location, CallbackDeclaration.DEFAULT_DESCRIPTOR_NAME, CallbackDeclaration.DEFAULT_STUB_NAME);
    }

    @Override
    public void close()
    {
        this.m_persistentArena.close();
        this.m_openTranslationUnits.forEach(Index_h::clang_disposeTranslationUnit);
        this.m_openTranslationUnits.clear();
        clang_disposeIndex(this.m_index);
    }
}

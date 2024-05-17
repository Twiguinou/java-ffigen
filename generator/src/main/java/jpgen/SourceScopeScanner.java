package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXCursorVisitor;
import jpgen.clang.CXFieldVisitor;
import jpgen.clang.CXType;
import jpgen.data2.Declaration;
import jpgen.data2.EnumType;
import jpgen.data2.FunctionType;
import jpgen.data2.Linkage;
import jpgen.data2.RecordType;
import jpgen.data2.Type;
import jpgen.data2.TypeKey;
import org.apache.logging.log4j.Logger;

import java.io.Closeable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXChildVisitResult.*;
import static jpgen.clang.CXCursorKind.*;
import static jpgen.clang.CXDiagnosticDisplayOptions.*;
import static jpgen.clang.CXDiagnosticSeverity.*;
import static jpgen.clang.CXLanguageKind.*;
import static jpgen.clang.CXErrorCode.*;
import static jpgen.clang.CXTranslationUnit_Flags.*;
import static jpgen.clang.CXTypeKind.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class SourceScopeScanner implements Closeable
{
    private static final int CLANG_DIAGNOSTIC_OPTIONS = CXDiagnostic_DisplaySourceLocation | CXDiagnostic_DisplayColumn | CXDiagnostic_DisplayOption | CXDiagnostic_DisplayCategoryName;

    private final MemorySegment m_index;
    public final Logger logger;
    private final Map<TypeKey, Type> m_referencedTypes = new HashMap<>();
    private final List<Declaration> m_declarations = new ArrayList<>();
    private final Arena m_persistentArena = Arena.ofConfined();

    public SourceScopeScanner(Logger logger, boolean clangOutput)
    {
        try (Arena arena = Arena.ofConfined())
        {
            logger.info(getClangVersion(arena));
            this.m_index = clang_createIndex(0, clangOutput ? 1 : 0);
            this.logger = logger;
        }
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

    public Iterable<Declaration> declarations()
    {
        return this.m_declarations;
    }

    public Iterable<Type> types()
    {
        return this.m_referencedTypes.values();
    }

    private FunctionType.Decl parseFunction(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_FunctionDecl;
        try (Arena arena = Arena.ofConfined())
        {
            if (this.resolveType(clang_getCursorType(arena, cursor)) instanceof FunctionType functionType)
            {
                String functionName = ClangUtils.getCursorSpelling(arena, cursor).orElseThrow();
                Linkage linkage = Linkage.map(clang_getCursorLinkage(cursor));
                FunctionType.DeclBuilder functionBuilder = new FunctionType.DeclBuilder(linkage, functionType, functionName);

                // Maybe replace with clang_Cursor_getArgument ?
                clang_visitChildren(cursor, ((CXCursorVisitor) (child, _, _) ->
                {
                    if (clang_getCursorKind(child) == CXCursor_ParmDecl)
                    {
                        String parameterName = ClangUtils.getCursorSpelling(arena, child).orElse("");
                        functionBuilder.appendParameterName(parameterName);
                    }

                    return CXChildVisit_Continue;
                }).makeHandle(arena), NULL);

                return functionBuilder.build();
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

    private RecordType.Member makeRecordMember(SegmentAllocator allocator, CXCursor cursor, TypeKey fieldType)
    {
        String fieldName = ClangUtils.getCursorSpelling(allocator, cursor).orElse("");

        if (clang_Cursor_isBitField(cursor) != 0)
        {
            long bitCount = clang_getFieldDeclBitWidth(cursor);
            return new RecordType.Bitfield(this.resolveType(fieldType), fieldName, bitCount);
        }

        return new RecordType.Field(fieldType, fieldName);
    }

    private Type resolveType(CXType type)
    {
        return this.resolveType(new TypeKey(type));
    }

    private Type resolveType(TypeKey typeKey) throws ClangException
    {
        Type manifold = this.m_referencedTypes.get(typeKey);
        if (manifold != null)
        {
            return manifold;
        }

        try (Arena resolveArena = Arena.ofConfined())
        {
            CXType type = typeKey.internal();
            manifold = switch (type.kind())
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
                    // Every declaration of an enum immediately goes to its definition.
                    CXCursor declarationCursor = clang_getTypeDeclaration(resolveArena, type);
                    assert clang_getCursorKind(declarationCursor) == CXCursor_EnumDecl;

                    Type.ValueType integerType = (Type.ValueType) this.resolveType(clang_getEnumDeclIntegerType(resolveArena, declarationCursor));
                    EnumType.Builder enumBuilder = new EnumType.Builder(integerType);

                    clang_visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, _) ->
                    {
                        if (clang_getCursorKind(cursor) == CXCursor_EnumConstantDecl)
                        {
                            String constantName = ClangUtils.retrieveString(clang_getCursorSpelling(resolveArena, cursor)).orElseThrow();
                            long value = clang_getEnumConstantDeclValue(cursor);
                            enumBuilder.appendConstant(constantName, value);
                        }

                        return CXChildVisit_Continue;
                    }).makeHandle(resolveArena), NULL);

                    yield ClangUtils.getCursorSpelling(resolveArena, declarationCursor)
                            .map(name -> (Type) enumBuilder.buildAsDeclaration(name))
                            .orElseGet(enumBuilder::buildAsType);
                }
                case CXType_Record ->
                {
                    /*
                     * When going through a record, there is a potential risk of falling into infinite recursion because it can contain
                     * a field which references the very same struct in some way.
                     */

                    CXCursor declarationCursor = clang_getTypeDeclaration(resolveArena, type);
                    assert ClangUtils.isRecordDeclaration(clang_getCursorKind(declarationCursor));

                    Optional<String> recordName = ClangUtils.getCursorSpelling(resolveArena, declarationCursor);
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
                                TypeKey fieldType = new TypeKey(clang_getCursorType(resolveArena, cursor));
                                recordBuilder.appendMember(this.makeRecordMember(frameArena, cursor, fieldType));

                                return CXChildVisit_Continue;
                            }
                        }).makeHandle(resolveArena), NULL);
                    }
                    else
                    {
                        // While clang returns a type size in bytes, offsets are returned in bits to take bitfields into account.
                        MemorySegment fieldOffset = resolveArena.allocateFrom(JAVA_LONG, 0);

                        //TODO: bitfields

                        recordBuilder = new RecordType.Builder(RecordType.Kind.STRUCT, alignment);
                        clang_Type_visitFields(type, ((CXFieldVisitor) (cursor, predictedOffset) ->
                        {
                            try (Arena frameArena = Arena.ofConfined())
                            {
                                TypeKey fieldType = new TypeKey(clang_getCursorType(resolveArena, cursor));
                                RecordType.Member member = this.makeRecordMember(frameArena, cursor, fieldType);

                                if (member instanceof RecordType.Bitfield)
                                {
                                    recordName.ifPresentOrElse(
                                            declarationName -> this.logger.warn("Skipping bitfield: {}.{}", declarationName, member.name()),
                                            () -> this.logger.warn("Skipping bitfield: {}", member.name())
                                    );
                                }
                                else
                                {
                                    long offset = clang_Cursor_getOffsetOfField(cursor);
                                    computePadding(predictedOffset.get(JAVA_LONG, 0), offset).ifPresent(recordBuilder::appendMember);
                                    recordBuilder.appendMember(member);
                                    predictedOffset.set(JAVA_LONG, 0, offset + clang_Type_getSizeOf(fieldType.internal()) * 8);
                                }

                                return CXChildVisit_Continue;
                            }
                        }).makeHandle(resolveArena), fieldOffset);

                        long size = clang_Type_getSizeOf(type) * 8;
                        computePadding(fieldOffset.get(JAVA_LONG, 0), size).ifPresent(recordBuilder::appendMember);
                    }

                    yield recordName.map(name -> (Type) recordBuilder.buildAsDeclaration(name))
                            .orElseGet(recordBuilder::buildAsType);
                }
                case CXType_FunctionProto, CXType_FunctionNoProto ->
                {
                    Type resultType = this.resolveType(clang_getResultType(resolveArena, type));
                    boolean variadic = clang_isFunctionTypeVariadic(type) != 0;

                    FunctionType.Builder functionBuilder = new FunctionType.Builder(resultType, variadic);
                    int numArgs = clang_getNumArgTypes(type);
                    for (int i = 0; i < numArgs; i++)
                    {
                        Type parameterType = this.resolveType(clang_getArgType(resolveArena, type, i));
                        functionBuilder.appendParameter(parameterType);
                    }

                    yield functionBuilder.build();
                }
                case CXType_Typedef ->
                {
                    String aliasIdentifier = ClangUtils.retrieveString(clang_getTypeSpelling(resolveArena, type)).orElseThrow();
                    Type canonicalType = this.resolveType(clang_getCanonicalType(resolveArena, type));
                    yield new Type.Alias(canonicalType, aliasIdentifier);
                }
                case CXType_Elaborated -> this.resolveType(clang_Type_getNamedType(resolveArena, type));
                case CXType_Unexposed, CXType_Auto -> this.resolveType(clang_getCanonicalType(resolveArena, type));
                case CXType_Pointer, CXType_BlockPointer -> new Type.Pointer(this.resolveType(clang_getPointeeType(resolveArena, type)));
                case CXType_ConstantArray, CXType_IncompleteArray, CXType_Vector ->
                {
                    long length = clang_getNumElements(type);
                    if (length == -1)
                    {
                        length = Long.MAX_VALUE;
                    }

                    yield new Type.Array(this.resolveType(clang_getElementType(resolveArena, type)), length);
                }
                case CXType_Complex -> this.resolveType(clang_getElementType(resolveArena, type));
                default ->
                {
                    // Special case for MSVC
                    if (type.kind() == CXType_LongDouble && clang_Type_getSizeOf(type) == Double.BYTES)
                    {
                        yield Type.DOUBLE;
                    }

                    String kindSpelling = ClangUtils.retrieveString(clang_getTypeKindSpelling(resolveArena, type.kind())).orElseThrow();
                    throw new ClangException(String.format("Could not resolve type kind: %s.", kindSpelling));
                }
            };

            this.m_referencedTypes.put(new TypeKey(this.m_persistentArena, typeKey), manifold);

            if (manifold instanceof RecordType recordType)
            {
                for (int i = 0; i < recordType.members.length; i++)
                {
                    if (recordType.members[i] instanceof RecordType.Field(TypeKey fieldType, String fieldName))
                    {
                        Type resolvedType = this.resolveType(fieldType);
                        recordType.members[i] = new RecordType.Field(resolvedType, fieldName);
                    }
                }
            }

            return manifold;
        }
    }

    public void process(String headerFileName, String[] optionalArgs) throws ClangException
    {
        MemorySegment translationUnit = this.createTranslationUnit(headerFileName, optionalArgs);

        try (Arena visitingArena = Arena.ofConfined())
        {
            clang_visitChildren(clang_getTranslationUnitCursor(visitingArena, translationUnit), ((CXCursorVisitor) (cursor, _, _) ->
            {
                if (clang_getCursorLanguage(cursor) != CXLanguage_C)
                {
                    return CXChildVisit_Continue;
                }

                return switch (clang_getCursorKind(cursor))
                {
                    case CXCursor_InclusionDirective -> CXChildVisit_Recurse;
                    case CXCursor_EnumDecl, CXCursor_StructDecl, CXCursor_UnionDecl, CXCursor_TypedefDecl ->
                    {
                        try (Arena frameArena = Arena.ofConfined())
                        {
                            if (this.resolveType(clang_getCursorType(frameArena, cursor)) instanceof Declaration decl)
                            {
                                this.m_declarations.add(decl);
                            }
                        }

                        yield CXChildVisit_Continue;
                    }
                    case CXCursor_FunctionDecl ->
                    {
                        this.m_declarations.add(this.parseFunction(cursor));
                        yield CXChildVisit_Continue;
                    }
                    default -> CXChildVisit_Continue;
                };
            }).makeHandle(visitingArena), NULL);
        }
        finally
        {
            clang_disposeTranslationUnit(translationUnit);
        }
    }

    private MemorySegment createTranslationUnit(String headerFileName, String[] optionalArgs) throws ClangException
    {
        try (Arena arena = Arena.ofConfined())
        {
            Set<String> clangArgSet = new LinkedHashSet<>();
            clangArgSet.add("-fparse-all-comments");
            clangArgSet.add("-xc");
            clangArgSet.addAll(Arrays.asList(optionalArgs));

            List<String> clangArgs = List.copyOf(clangArgSet);
            MemorySegment clangArgsNative = arena.allocate(ADDRESS, clangArgs.size());
            for (int i = 0; i < clangArgs.size(); i++)
            {
                clangArgsNative.setAtIndex(ADDRESS, i, arena.allocateFrom(clangArgs.get(i)));
            }

            MemorySegment pTu = arena.allocate(ADDRESS);
            int error = clang_parseTranslationUnit2(this.m_index, arena.allocateFrom(headerFileName), clangArgsNative, clangArgs.size(), NULL, 0, CXTranslationUnit_DetailedPreprocessingRecord, pTu);
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
                this.logger.error(clangReport.toString());
                clang_disposeTranslationUnit(translationUnit);
                throw new ClangException("Encountered errors while parsing translation unit!");
            }
            else if (clangReport.length() != startLength)
            {
                this.logger.warn(clangReport.toString());
            }

            return translationUnit;
        }
    }

    public Iterable<Type> getTypes()
    {
        return this.m_referencedTypes.values();
    }

    public Iterable<Declaration> getDeclarations()
    {
        return this.m_declarations;
    }

    @Override
    public void close()
    {
        this.m_persistentArena.close();
        clang_disposeIndex(this.m_index);
    }
}

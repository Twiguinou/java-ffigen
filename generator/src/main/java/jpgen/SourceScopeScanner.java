package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXType;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXTranslationUnit_Flags.*;
import static jpgen.clang.CXErrorCode.*;
import static jpgen.clang.CXDiagnosticDisplayOptions.*;
import static jpgen.clang.CXDiagnosticSeverity.*;
import static jpgen.clang.CXChildVisitResult.*;
import static jpgen.clang.CXCursorKind.*;
import static jpgen.clang.CXTypeKind.*;

public class SourceScopeScanner
{
    private static final Logger gScannerLogger = LogManager.getLogger(SourceScopeScanner.class);

    private final MemorySegment m_index;
    private final MemorySegment m_translationUnit;
    private final Map<TypeKey, TypeManifold> m_referencedTypes = new HashMap<>();
    private final List<Declaration> m_declarations = new ArrayList<>();
    private final Arena m_persistentArena = Arena.ofAuto();

    public SourceScopeScanner(String header_filename)
    {
        try (Arena arena = Arena.ofConfined())
        {
            gScannerLogger.info(ForeignUtils.retrieveString(clang_getClangVersion(arena)));

            List<String> clangArgs = new ArrayList<>();
            clangArgs.add("-fparse-all-comments");
            clangArgs.add("-Weverything");
            clangArgs.add("-Werror");
            clangArgs.add("-xc");

            MemorySegment clangArgsNative = arena.allocateArray(ValueLayout.ADDRESS, clangArgs.size());
            for (int i = 0; i < clangArgs.size(); i++)
            {
                clangArgsNative.setAtIndex(ValueLayout.ADDRESS, i, arena.allocateUtf8String(clangArgs.get(i)));
            }

            this.m_index = clang_createIndex(0, 0);
            MemorySegment pTu = arena.allocate(ValueLayout.ADDRESS);
            int error = clang_parseTranslationUnit2(this.m_index, arena.allocateUtf8String(header_filename), clangArgsNative, clangArgs.size(), MemorySegment.NULL, 0, CXTranslationUnit_DetailedPreprocessingRecord, pTu);
            if (error != CXError_Success)
            {
                clang_disposeIndex(this.m_index);
                throw new IllegalStateException(STR."Failed to parse translation unit: \{error}");
            }
            this.m_translationUnit = pTu.get(ValueLayout.ADDRESS, 0);

            MemorySegment diagnostics = clang_getDiagnosticSetFromTU(this.m_translationUnit);
            StringBuilder clangReport = new StringBuilder("------- Clang debug parsing output -------");
            final int startLength = clangReport.length();
            if (dumpDiagnostics(arena, diagnostics, clangReport))
            {
                gScannerLogger.error(clangReport.toString());
                clang_disposeTranslationUnit(this.m_translationUnit);
                clang_disposeIndex(this.m_index);
                throw new RuntimeException("Encountered errors while parsing translation unit!");
            }
            else if (clangReport.length() != startLength)
            {
                gScannerLogger.warn(clangReport);
            }
        }
    }

    private static boolean dumpDiagnostics(Arena arena, MemorySegment diagnostics, StringBuilder clangReport)
    {
        boolean fail = false;
        for (int i = 0; i < clang_getNumDiagnosticsInSet(diagnostics); i++)
        {
            MemorySegment diag = clang_getDiagnosticInSet(diagnostics, i);
            clangReport.append(System.lineSeparator());
            clangReport.append(ForeignUtils.retrieveString(clang_formatDiagnostic(arena, diag, CXDiagnostic_DisplaySourceLocation | CXDiagnostic_DisplayColumn | CXDiagnostic_DisplayOption | CXDiagnostic_DisplayCategoryName)));

            MemorySegment children = clang_getChildDiagnostics(diag);
            fail |= clang_getDiagnosticSeverity(diag) >= CXDiagnostic_Error;
            fail |= dumpDiagnostics(arena, children, clangReport);
            clang_disposeDiagnostic(diag);
        }

        return fail;
    }

    private Optional<EnumType.Declaration> parseEnum(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_EnumDecl;
        if (clang_Cursor_isAnonymous(cursor) != 0)
        {
            return Optional.empty();
        }

        try (Arena arena = Arena.ofConfined())
        {
            EnumType innerType = (EnumType) this.resolveType(clang_getCursorType(arena, cursor));
            String name = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
            return Optional.of(new EnumType.Declaration(name, innerType));
        }
    }

    private Optional<RecordType.Declaration> parseRecord(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_StructDecl;
        if (clang_Cursor_isAnonymous(cursor) != 0)
        {
            return Optional.empty();
        }

        try (Arena arena = Arena.ofConfined())
        {
            RecordType innerType = (RecordType) this.resolveType(clang_getCursorType(arena, cursor));
            if (innerType.fields().length == 0)
            {
                return Optional.empty();
            }

            String name = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
            return Optional.of(new RecordType.Declaration(name, innerType));
        }
    }

    private Declaration.Variable parseVariable(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_VarDecl;
        try (Arena arena = Arena.ofConfined())
        {
            String name = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
            TypeManifold type = this.resolveType(clang_getCursorType(arena, cursor));
            return new Declaration.Variable(name, type);
        }
    }

    private TypeManifold resolveType(CXType type)
    {
        TypeKey typeKey = new TypeKey(type);
        TypeManifold manifold = this.m_referencedTypes.get(typeKey);
        if (manifold != null)
        {
            return manifold;
        }

        manifold = switch (type.kind())
        {
            case CXType_Void -> TypeManifold.VOID;
            case CXType_Bool -> TypeManifold.BOOLEAN;
            case CXType_Char_S, CXType_Char_U, CXType_SChar, CXType_UChar -> TypeManifold.CHARACTER;
            case CXType_Short, CXType_UShort -> TypeManifold.SHORT;
            case CXType_Int, CXType_UInt -> TypeManifold.INTEGER;
            case CXType_Float -> TypeManifold.FLOAT;
            case CXType_Long, CXType_ULong -> clang_Type_getSizeOf(type) == Long.BYTES ? TypeManifold.LONG : TypeManifold.INTEGER;
            case CXType_LongLong, CXType_ULongLong -> TypeManifold.LONG;
            case CXType_Double -> TypeManifold.DOUBLE;
            case CXType_Enum ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    // Every declaration of an enum immediately goes to its definition.
                    CXCursor cursor = clang_getTypeDeclaration(arena, type);
                    assert clang_getCursorKind(cursor) == CXCursor_EnumDecl;

                    TypeManifold integerType = this.resolveType(clang_getEnumDeclIntegerType(arena, cursor));
                    List<EnumType.Constant> constants = new ArrayList<>();
                    clang_visitChildren(arena, cursor, (child, _, _) ->
                    {
                        if (clang_getCursorKind(child) == CXCursor_EnumConstantDecl)
                        {
                            String constantName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, child));
                            long value = clang_getEnumConstantDeclUnsignedValue(child);
                            constants.add(new EnumType.Constant(constantName, value));
                        }
                        return CXChildVisit_Continue;
                    }, MemorySegment.NULL);

                    yield new EnumType(integerType, constants.toArray(EnumType.Constant[]::new));
                }
            }
            case CXType_Record ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    List<RecordType.Field> fields = new ArrayList<>();
                    clang_Type_visitFields(arena, type, (cursor, _) ->
                    {
                        if (clang_getCursorKind(cursor) == CXCursor_FieldDecl)
                        {
                            String fieldName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
                            long offset = clang_Cursor_getOffsetOfField(cursor);
                            TypeKey fieldTypeKey = new TypeKey(clang_getCursorType(this.m_persistentArena, cursor));
                            fields.add(new RecordType.Field(fieldName, new TypeManifold.Prototype(fieldTypeKey), offset));
                        }
                        return CXChildVisit_Continue;
                    }, MemorySegment.NULL);
                    RecordType.Shape shape = clang_getCursorKind(clang_getTypeDeclaration(arena, type)) == CXCursor_UnionDecl ? RecordType.Shape.UNION : RecordType.Shape.STRUCT;

                    yield new RecordType(shape, fields.toArray(RecordType.Field[]::new));
                }
            }
            case CXType_FunctionProto, CXType_FunctionNoProto ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    TypeManifold resultType = this.resolveType(clang_getResultType(arena, type));
                    boolean variadic = clang_isFunctionTypeVariadic(type) != 0;
                    List<TypeManifold> argTypes = new ArrayList<>();
                    for (int i = 0; i < clang_getNumArgTypes(type); i++)
                    {
                        argTypes.add(this.resolveType(clang_getArgType(arena, type, i)));
                    }

                    yield new FunctionType(variadic, resultType, argTypes.toArray(TypeManifold[]::new));
                }
            }
            case CXType_Typedef, CXType_Unexposed, CXType_Elaborated, CXType_Auto ->
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
                    yield new TypeManifold.Pointer(this.resolveType(clang_getPointeeType(arena, type)));
                }
            }
            case CXType_ConstantArray, CXType_IncompleteArray ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    yield new TypeManifold.Array(clang_getNumElements(type), this.resolveType(clang_getElementType(arena, type)));
                }
            }
            case CXType_Complex ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    yield this.resolveType(clang_getElementType(arena, type));
                }
            }
            default -> throw new RuntimeException(STR."Could not resolve type kind: \{type.kind()}.");
        };

        this.m_referencedTypes.put(new TypeKey(this.m_persistentArena, typeKey), manifold);
        if (manifold instanceof RecordType recordType)
        {
            for (int i = 0; i < recordType.fields().length; i++)
            {
                if (recordType.fields()[i].type() instanceof TypeManifold.Prototype(TypeKey identifier))
                {
                    String name = recordType.fields()[i].name();
                    long offset = recordType.fields()[i].offset();
                    TypeManifold fieldType = this.resolveType(identifier.internal());
                    recordType.fields()[i] = new RecordType.Field(name, fieldType, offset);
                }
            }
        }

        return manifold;
    }

    private FunctionType.Declaration parseFunction(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_FunctionDecl;
        try (Arena arena = Arena.ofConfined())
        {
            TypeManifold innerType = this.resolveType(clang_getCursorType(arena, cursor));
            if (innerType instanceof FunctionType functionType)
            {
                String functionName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));

                List<String> argNames = new ArrayList<>();
                clang_visitChildren(arena, cursor, (child, _, _) ->
                {
                    if (clang_getCursorKind(child) == CXCursor_ParmDecl)
                    {
                        argNames.add(ForeignUtils.retrieveString(clang_getCursorSpelling(arena, child)));
                    }
                    return CXChildVisit_Continue;
                }, MemorySegment.NULL);

                return new FunctionType.Declaration(functionName, functionType, argNames.toArray(String[]::new));
            }
            else
            {
                throw new AssertionError("Type mismatch for function declaration.");
            }
        }
    }

    public void process()
    {
        this.m_referencedTypes.clear();
        this.m_declarations.clear();
        try (Arena visitingArena = Arena.ofConfined())
        {
            clang_visitChildren(visitingArena, clang_getTranslationUnitCursor(visitingArena, this.m_translationUnit), (cursor, _, _) ->
            {
                try (Arena frameArena = Arena.ofConfined())
                {
                    if (clang_Location_isInSystemHeader(clang_getCursorLocation(frameArena, cursor)) != 0)
                    {
                        return CXChildVisit_Continue;
                    }

                    switch (clang_getCursorKind(cursor))
                    {
                        case CXCursor_EnumDecl -> this.parseEnum(cursor).ifPresent(this.m_declarations::add);
                        case CXCursor_StructDecl, CXCursor_UnionDecl -> this.parseRecord(cursor).ifPresent(this.m_declarations::add);
                        case CXCursor_FunctionDecl -> this.m_declarations.add(this.parseFunction(cursor));
                        case CXCursor_VarDecl -> this.m_declarations.add(this.parseVariable(cursor));
                        case CXCursor_TypedefDecl ->
                        {
                            if (this.resolveType(clang_getCursorType(frameArena, cursor)) instanceof TypeManifold.Pointer(FunctionType functionType))
                            {
                            }
                        }
                    }

                    return CXChildVisit_Continue;
                }
            }, MemorySegment.NULL);
        }

        this.m_declarations.forEach(gScannerLogger::info);
    }

    public void dispose()
    {
        clang_disposeTranslationUnit(this.m_translationUnit);
        clang_disposeIndex(this.m_index);
    }
}

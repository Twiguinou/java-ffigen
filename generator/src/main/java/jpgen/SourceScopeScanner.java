package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXType;
import jpgen.data.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.foreign.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    private final List<FunctionType.Declaration> m_functionTypes = new ArrayList<>();
    private final Arena m_persistentArena = Arena.ofAuto();

    public SourceScopeScanner(String header_filename)
    {
        try (Arena arena = Arena.ofConfined())
        {
            gScannerLogger.info(ForeignUtils.retrieveString(clang_getClangVersion(arena)));

            List<String> clangArgs = new ArrayList<>();
            clangArgs.add("-fparse-all-comments");
            //clangArgs.add("-Weverything");
            //clangArgs.add("-Werror");
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

    /*private Declaration.Variable parseVariable(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_VarDecl;
        try (Arena arena = Arena.ofConfined())
        {
            String name = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
            TypeManifold type = this.resolveType(clang_getCursorType(arena, cursor));
            return new Declaration.Variable(name, type);
        }
    }*/

    private FunctionType.Declaration parseFunction(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_FunctionDecl;
        try (Arena arena = Arena.ofConfined())
        {
            if (this.resolveType(clang_getCursorType(arena, cursor)) instanceof FunctionType functionType)
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

                //return new FunctionType.Declaration(functionName, false, functionType, argNames.toArray(String[]::new));
                return new FunctionType.Declaration(functionName, functionType, argNames.toArray(String[]::new));
            }

            throw new AssertionError("Type mismatch for function declaration.");
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
                    CXCursor declarationCursor = clang_getTypeDeclaration(arena, type);
                    assert clang_getCursorKind(declarationCursor) == CXCursor_EnumDecl;
                    String name = clang_Cursor_isAnonymous(declarationCursor) != 0 ? "" : ForeignUtils.retrieveString(clang_getCursorSpelling(arena, declarationCursor));

                    TypeManifold.Primitive integerType = (TypeManifold.Primitive) this.resolveType(clang_getEnumDeclIntegerType(arena, declarationCursor));
                    List<EnumType.Constant> constants = new ArrayList<>();
                    clang_visitChildren(arena, declarationCursor, (cursor, _, _) ->
                    {
                        if (clang_getCursorKind(cursor) == CXCursor_EnumConstantDecl)
                        {
                            String constantName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
                            long value = clang_getEnumConstantDeclValue(cursor);
                            constants.add(new EnumType.Constant(constantName, value));
                        }
                        return CXChildVisit_Continue;
                    }, MemorySegment.NULL);

                    yield new EnumType(name, integerType, constants.toArray(EnumType.Constant[]::new));
                }
            }
            case CXType_Record ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    CXCursor declarationCursor = clang_getTypeDeclaration(arena, type);
                    assert ForeignUtils.isRecordDeclaration(clang_getCursorKind(declarationCursor));
                    String name = clang_Cursor_isAnonymous(declarationCursor) != 0 ? "" : ForeignUtils.retrieveString(clang_getCursorSpelling(arena, declarationCursor));
                    long alignment = clang_Type_getAlignOf(type), size = clang_Type_getSizeOf(type);

                    List<RecordType.Field> fields = new ArrayList<>();
                    clang_Type_visitFields(arena, type, (cursor, _) ->
                    {
                        if (clang_getCursorKind(cursor) == CXCursor_FieldDecl)
                        {
                            String fieldName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
                            long offset = clang_Cursor_getOffsetOfField(cursor);
                            TypeKey fieldTypeKey = new TypeKey(clang_getCursorType(this.m_persistentArena, cursor));
                            boolean bitfield = clang_Cursor_isBitField(cursor) != 0;
                            fields.add(new RecordType.Field(fieldName, new TypeManifold.Prototype(fieldTypeKey), offset, bitfield));
                        }
                        return CXChildVisit_Continue;
                    }, MemorySegment.NULL);
                    RecordType.Shape shape = clang_getCursorKind(clang_getTypeDeclaration(arena, type)) == CXCursor_UnionDecl ? RecordType.Shape.UNION : RecordType.Shape.STRUCT;

                    yield new RecordType(name, shape, fields.toArray(RecordType.Field[]::new), size, alignment);
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
            case CXType_Typedef ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    String alias = ForeignUtils.retrieveString(clang_getTypeSpelling(arena, type));
                    yield new TypeManifold.Typedef(alias, this.resolveType(clang_getCanonicalType(arena, type)));
                }
            }
            case CXType_Unexposed, CXType_Elaborated, CXType_Auto ->
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
        if (manifold instanceof RecordType(_, _, RecordType.Field[] fields, _, _))
        {
            for (int i = 0; i < fields.length; i++)
            {
                if (fields[i].type() instanceof TypeManifold.Prototype(TypeKey identifier))
                {
                    String name = fields[i].name();
                    long offset = fields[i].offset();
                    boolean bitfield = fields[i].bitfield();
                    TypeManifold fieldType = this.resolveType(identifier.internal());
                    fields[i] = new RecordType.Field(name, fieldType, offset, bitfield);
                }
            }
        }

        return manifold;
    }

    public void process()
    {
        this.m_referencedTypes.clear();
        try (Arena visitingArena = Arena.ofConfined())
        {
            clang_visitChildren(visitingArena, clang_getTranslationUnitCursor(visitingArena, this.m_translationUnit), (cursor, _, _) ->
            {
                try (Arena frameArena = Arena.ofConfined())
                {
                    if (clang_Location_isInSystemHeader(clang_getCursorLocation(frameArena, cursor)) == 0 && !ForeignUtils.isInvalidDeclaration(cursor))
                    {
                        switch (clang_getCursorKind(cursor))
                        {
                            case CXCursor_EnumDecl, CXCursor_StructDecl, CXCursor_UnionDecl, CXCursor_TypedefDecl -> this.resolveType(clang_getCursorType(frameArena, cursor));
                            case CXCursor_FunctionDecl -> this.m_functionTypes.add(this.parseFunction(cursor));
                        }
                    }

                    return CXChildVisit_Continue;
                }
            }, MemorySegment.NULL);
        }

        JavaSourceGenerator generator = new JavaSourceGenerator("jpgen.vulkan", this.m_referencedTypes.values().stream().distinct().filter(type -> type instanceof Declaration).map(type -> (Declaration)type).collect(Collectors.toList()));

        File outputDir = new File("C:\\Users\\Aksil\\Desktop\\opt");
        this.m_referencedTypes.values().stream().distinct().forEach(value ->
        {
            if (value instanceof Declaration declaration && declaration.getLayout().isPresent())
            {
                String code = switch (declaration)
                {
                    case EnumType enumType -> generator.generateEnum(enumType);
                    case RecordType recordType -> generator.generateRecord(recordType);
                    default -> throw new AssertionError();
                };
                File outputFile = new File(outputDir, STR."\{generator.nameOf(declaration)}.java");
                try (FileOutputStream outputStream = new FileOutputStream(outputFile))
                {
                    outputStream.write(code.getBytes(StandardCharsets.UTF_8));
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });

        File headerFile = new File(outputDir, "VulkanCore_h.java");
        try (FileOutputStream outputStream = new FileOutputStream(headerFile))
        {
            outputStream.write(generator.generateHeader("VulkanCore_h", "vulkan-1", this.m_functionTypes).getBytes(StandardCharsets.UTF_8));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void dispose()
    {
        clang_disposeTranslationUnit(this.m_translationUnit);
        clang_disposeIndex(this.m_index);
    }
}

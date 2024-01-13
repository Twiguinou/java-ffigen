package jpgen;

import jpgen.clang.CXCursor;
import jpgen.clang.CXCursorVisitor;
import jpgen.clang.CXFieldVisitor;
import jpgen.clang.CXType;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static jpgen.clang.Index_h.*;
import static jpgen.clang.CXTranslationUnit_Flags.*;
import static jpgen.clang.CXErrorCode.*;
import static jpgen.clang.CXDiagnosticDisplayOptions.*;
import static jpgen.clang.CXDiagnosticSeverity.*;
import static jpgen.clang.CXChildVisitResult.*;
import static jpgen.clang.CXCursorKind.*;
import static jpgen.clang.CXTypeKind.*;

public class SourceScopeScanner implements Closeable
{
    private static final Logger gScannerLogger = LogManager.getLogger(SourceScopeScanner.class);

    private final MemorySegment m_index;
    private final Map<TypeKey, TypeManifold> m_referencedTypes = new HashMap<>();
    private final List<FunctionType.Declaration> m_functionDeclarations = new ArrayList<>();
    private final Arena m_persistentArena = Arena.ofAuto();

    public SourceScopeScanner()
    {
        try (Arena arena = Arena.ofConfined())
        {
            gScannerLogger.info(ForeignUtils.retrieveString(clang_getClangVersion(arena)));
            this.m_index = clang_createIndex(0, 0);
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

    private FunctionType.Declaration parseFunction(CXCursor cursor)
    {
        assert clang_getCursorKind(cursor) == CXCursor_FunctionDecl;
        try (Arena arena = Arena.ofConfined())
        {
            if (this.resolveType(clang_getCursorType(arena, cursor)) instanceof FunctionType functionType)
            {
                String functionName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));

                List<String> argNames = new ArrayList<>();
                // Maybe replace with clang_Cursor_getArgument ?
                clang_visitChildren(cursor, ((CXCursorVisitor) (child, _, _) ->
                {
                    if (clang_getCursorKind(child) == CXCursor_ParmDecl)
                    {
                        argNames.add(ForeignUtils.retrieveString(clang_getCursorSpelling(arena, child)));
                    }
                    return CXChildVisit_Continue;
                }).makeHandle(arena), MemorySegment.NULL);

                return new FunctionType.Declaration(functionName, functionType, argNames.toArray(String[]::new));
            }

            throw new AssertionError("Type mismatch for function declaration.");
        }
    }

    private TypeManifold resolveType(CXType type)
    {
        return this.resolveType(new TypeKey(type));
    }

    private TypeManifold resolveType(TypeKey typeKey)
    {
        TypeManifold manifold = this.m_referencedTypes.get(typeKey);
        if (manifold != null)
        {
            return manifold;
        }

        CXType type = typeKey.internal();
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
                    Optional<String> name = ForeignUtils.tryGetCursorSpelling(arena, declarationCursor);

                    TypeManifold.Primitive integerType = (TypeManifold.Primitive) this.resolveType(clang_getEnumDeclIntegerType(arena, declarationCursor));
                    List<EnumType.Constant> constants = new ArrayList<>();
                    clang_visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, _) ->
                    {
                        if (clang_getCursorKind(cursor) == CXCursor_EnumConstantDecl)
                        {
                            String constantName = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
                            long value = clang_getEnumConstantDeclValue(cursor);
                            constants.add(new EnumType.Constant(constantName, value));
                        }
                        return CXChildVisit_Continue;
                    }).makeHandle(arena), MemorySegment.NULL);

                    yield new EnumType(name, integerType, constants.toArray(EnumType.Constant[]::new));
                }
            }
            case CXType_Record ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    CXCursor declarationCursor = clang_getTypeDeclaration(arena, type);
                    assert ForeignUtils.isRecordDeclaration(clang_getCursorKind(declarationCursor));
                    Optional<String> name = ForeignUtils.tryGetCursorSpelling(arena, declarationCursor);
                    long alignment = clang_Type_getAlignOf(type), size = clang_Type_getSizeOf(type);

                    List<RecordType.Field> fields = new ArrayList<>();
                    clang_Type_visitFields(type, ((CXFieldVisitor) (cursor, _) ->
                    {
                        if (clang_getCursorKind(cursor) == CXCursor_FieldDecl)
                        {
                            Optional<String> fieldName = ForeignUtils.tryGetCursorSpelling(arena, cursor);
                            long offset = clang_Cursor_getOffsetOfField(cursor);
                            TypeKey fieldTypeKey = new TypeKey(clang_getCursorType(this.m_persistentArena, cursor));
                            boolean bitfield = clang_Cursor_isBitField(cursor) != 0;
                            fields.add(new RecordType.Field(fieldName, new TypeManifold.Prototype(fieldTypeKey), offset, bitfield));
                        }
                        return CXChildVisit_Continue;
                    }).makeHandle(arena), MemorySegment.NULL);
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
                    CXType underlyingType = clang_getCanonicalType(arena, type);
                    TypeKey underlyingTypeKey = new TypeKey(underlyingType);

                    if ((underlyingType.kind() == CXType_Pointer || underlyingType.kind() == CXType_BlockPointer) &&
                            this.resolveType(clang_getPointeeType(arena, underlyingType)) instanceof FunctionType functionType && !this.m_referencedTypes.containsKey(underlyingTypeKey))
                    {
                        CXCursor declarationCursor = clang_getTypeDeclaration(arena, type);

                        String[] argNames = new String[functionType.argTypes().length];
                        clang_visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, pIndex) ->
                        {
                            if (clang_getCursorKind(cursor) == CXCursor_ParmDecl)
                            {
                                pIndex = pIndex.reinterpret(ValueLayout.JAVA_INT.byteSize());
                                int i = pIndex.get(ValueLayout.JAVA_INT, 0);
                                argNames[i] = ForeignUtils.retrieveString(clang_getCursorSpelling(arena, cursor));
                                pIndex.set(ValueLayout.JAVA_INT, 0, i + 1);
                            }
                            return CXChildVisit_Continue;
                        }).makeHandle(arena), arena.allocate(ValueLayout.JAVA_INT, 0));

                        FunctionType.Callback callback = new FunctionType.Callback(Optional.of(alias), functionType, argNames);
                        this.m_referencedTypes.put(new TypeKey(this.m_persistentArena, underlyingTypeKey), callback);
                    }

                    yield new TypeManifold.Typedef(alias, this.resolveType(underlyingTypeKey));
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
                    TypeManifold pointee = this.resolveType(clang_getPointeeType(arena, type));
                    if (pointee instanceof FunctionType functionType)
                    {
                        String[] argNames = new String[functionType.argTypes().length];
                        Arrays.fill(argNames, "");
                        yield new FunctionType.Callback(Optional.empty(), functionType, argNames);
                    }

                    yield new TypeManifold.Pointer(pointee);
                }
            }
            case CXType_ConstantArray, CXType_IncompleteArray, CXType_Vector ->
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
            case CXType_LongDouble -> TypeManifold.COMPATIBILITY_TYPE;
            default ->
            {
                try (Arena arena = Arena.ofConfined())
                {
                    String kindSpelling = ForeignUtils.retrieveString(clang_getTypeKindSpelling(arena, type.kind()));
                    throw new RuntimeException(STR."Could not resolve type kind: \{kindSpelling}.");
                }
            }
        };

        this.m_referencedTypes.put(new TypeKey(this.m_persistentArena, typeKey), manifold);
        if (manifold instanceof RecordType(_, _, RecordType.Field[] fields, _, _))
        {
            for (int i = 0; i < fields.length; i++)
            {
                if (fields[i].type() instanceof TypeManifold.Prototype(TypeKey identifier))
                {
                    Optional<String> name = fields[i].name();
                    TypeManifold fieldType = this.resolveType(identifier);
                    fields[i] = new RecordType.Field(name, fieldType, fields[i].offset(), fields[i].bitfield());
                }
            }
        }

        return manifold;
    }

    public void process(String headerFileName, String[] optionalArgs)
    {
        MemorySegment translationUnit;
        try (Arena arena = Arena.ofConfined())
        {
            List<String> clangArgs = new ArrayList<>();
            clangArgs.add("-fparse-all-comments");
            clangArgs.add("-xc");
            clangArgs.addAll(Arrays.asList(optionalArgs));

            MemorySegment clangArgsNative = arena.allocateArray(ValueLayout.ADDRESS, clangArgs.size());
            for (int i = 0; i < clangArgs.size(); i++)
            {
                clangArgsNative.setAtIndex(ValueLayout.ADDRESS, i, arena.allocateUtf8String(clangArgs.get(i)));
            }

            MemorySegment pTu = arena.allocate(ValueLayout.ADDRESS);
            int error = clang_parseTranslationUnit2(this.m_index, arena.allocateUtf8String(headerFileName), clangArgsNative, clangArgs.size(), MemorySegment.NULL, 0, CXTranslationUnit_DetailedPreprocessingRecord, pTu);
            if (error != CXError_Success)
            {
                throw new IllegalStateException(STR."Failed to parse translation unit: \{error}");
            }
            translationUnit = pTu.get(ValueLayout.ADDRESS, 0);

            MemorySegment diagnostics = clang_getDiagnosticSetFromTU(translationUnit);
            StringBuilder clangReport = new StringBuilder("------- Clang debug parsing output -------");
            final int startLength = clangReport.length();
            if (dumpDiagnostics(arena, diagnostics, clangReport))
            {
                gScannerLogger.error(clangReport.toString());
                clang_disposeTranslationUnit(translationUnit);
                throw new RuntimeException("Encountered errors while parsing translation unit!");
            }
            else if (clangReport.length() != startLength)
            {
                gScannerLogger.warn(clangReport);
            }
        }

        try (Arena visitingArena = Arena.ofConfined())
        {
            clang_visitChildren(clang_getTranslationUnitCursor(visitingArena, translationUnit), ((CXCursorVisitor) (cursor, _, _) ->
            {
                try (Arena frameArena = Arena.ofConfined())
                {
                    if (clang_Location_isInSystemHeader(clang_getCursorLocation(frameArena, cursor)) == 0 && !ForeignUtils.isInvalidDeclaration(cursor))
                    {
                        switch (clang_getCursorKind(cursor))
                        {
                            case CXCursor_EnumDecl, CXCursor_StructDecl, CXCursor_UnionDecl, CXCursor_TypedefDecl -> this.resolveType(clang_getCursorType(frameArena, cursor));
                            case CXCursor_FunctionDecl -> this.m_functionDeclarations.add(this.parseFunction(cursor));
                        }
                    }

                    return CXChildVisit_Continue;
                }
            }).makeHandle(visitingArena), MemorySegment.NULL);
        }

        clang_disposeTranslationUnit(translationUnit);
    }

    public Collection<TypeManifold> getTypes()
    {
        return this.m_referencedTypes.values();
    }

    public List<FunctionType.Declaration> getDeclaredFunctions()
    {
        return this.m_functionDeclarations;
    }

    public void produceOutput(File outputDirectory, String packageName, String mainClass, String libName, Predicate<Declaration<?>> exportPredicate)
    {
        List<Declaration<?>> declarations = this.gatherTypeDeclarations();
        Map<Declaration<?>, String> names = this.translateDeclarations();
        JavaSourceGenerator generator = new JavaSourceGenerator(packageName, mainClass, names);

        for (Declaration<?> declaration : declarations)
        {
            if (!exportPredicate.test(declaration))
            {
                continue;
            }

            String code = switch (declaration)
            {
                case EnumType enumType -> generator.generateEnum(enumType);
                case RecordType recordType -> generator.generateRecord(recordType);
                case FunctionType.Callback callback -> generator.generateCallback(callback);
                default -> null;
            };
            if (code == null) continue;

            File outputFile = new File(outputDirectory, STR."\{names.get(declaration)}.java");
            try (FileOutputStream outputStream = new FileOutputStream(outputFile))
            {
                outputStream.write(code.getBytes(StandardCharsets.UTF_8));
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }

        File headerFile = new File(outputDirectory, STR."\{mainClass}.java");
        try (FileOutputStream outputStream = new FileOutputStream(headerFile))
        {
            List<FunctionType.Declaration> filteredFunctions = this.m_functionDeclarations.stream().filter(exportPredicate).toList();
            outputStream.write(generator.generateHeader(libName, filteredFunctions).getBytes(StandardCharsets.UTF_8));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public List<Declaration<?>> gatherTypeDeclarations()
    {
        return this.m_referencedTypes.values().stream()
                .filter(type -> type instanceof Declaration<?>)
                .distinct()
                .map(type -> (Declaration<?>) type)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public Map<Declaration<?>, String> translateDeclarations()
    {
        Set<String> usedNames = this.m_referencedTypes.values().stream()
                .filter(type -> type instanceof Declaration<?> declaration && declaration.name().isPresent())
                .map(type -> ((Declaration<?>)type).name().orElseThrow())
                .collect(Collectors.toSet());

        Map<Declaration<?>, String> resolvedNames = new HashMap<>();
        int index = 0;
        for (TypeManifold type : this.m_referencedTypes.values())
        {
            if (type instanceof Declaration<?> declaration && !resolvedNames.containsKey(declaration))
            {
                String name;
                if (declaration.name().isEmpty())
                {
                    do
                    {
                        name = STR."UnnamedType_\{index}";
                        ++index;
                    }
                    while (usedNames.contains(name));
                    usedNames.add(name);
                }
                else
                {
                    name = declaration.name().get();
                }

                resolvedNames.put(declaration, name);
            }
        }

        return resolvedNames;
    }

    @Override
    public void close()
    {
        clang_disposeIndex(this.m_index);
    }
}

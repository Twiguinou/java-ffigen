package fr.kenlek.jpgen.generator;

import module fr.kenlek.jpgen.clang;
import module java.base;

import com.palantir.javapoet.ClassName;
import fr.kenlek.jpgen.generator.data.AliasDeclaration;
import fr.kenlek.jpgen.generator.data.ArrayType;
import fr.kenlek.jpgen.generator.data.CallbackDeclaration;
import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.EnumDeclaration;
import fr.kenlek.jpgen.generator.data.EnumType;
import fr.kenlek.jpgen.generator.data.FunctionType;
import fr.kenlek.jpgen.generator.data.MiscType;
import fr.kenlek.jpgen.generator.data.NumericType;
import fr.kenlek.jpgen.generator.data.ParameterInfo;
import fr.kenlek.jpgen.generator.data.RecordDeclaration;
import fr.kenlek.jpgen.generator.data.RecordType;
import fr.kenlek.jpgen.generator.data.Type;

import static fr.kenlek.jpgen.clang.CXChildVisitResult.CXChildVisit_Continue;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXTypeKind.*;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

@FunctionalInterface
public interface TypeResolver
{
    @FunctionalInterface
    interface Visitor
    {
        void visit(LibClang clang, ParseOptions options, CXType type, Function<CXType, Type> nativeResolver);
    }

    TypeResolver EMPTY = (_, _, _, _) -> Optional.empty();
    TypeResolver DEFAULT = (clang, options, type, nativeResolver) -> switch (type.kind())
    {
        case CXType_Void -> Optional.of(MiscType.VOID);
        case CXType_Bool -> Optional.of(NumericType.BOOLEAN);
        case CXType_Char16 -> Optional.of(NumericType.CHAR);
        case CXType_WChar -> NumericType.integral((int) clang.Type_getSizeOf(type))
            .map(integralType -> integralType == NumericType.SHORT ? NumericType.CHAR : integralType);
        case CXType_UChar, CXType_SChar, CXType_Char_U, CXType_Char_S, CXType_Char32, CXType_UShort, CXType_Short, CXType_UInt, CXType_Int,
             CXType_ULong, CXType_Long, CXType_ULongLong, CXType_LongLong -> NumericType.integral((int) clang.Type_getSizeOf(type)).map(Type.class::cast);
        case CXType_Float, CXType_Double, CXType_LongDouble -> NumericType.floating((int) clang.Type_getSizeOf(type)).map(Type.class::cast);
        case CXType_Enum ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                CXCursor declarationCursor = clang.getTypeDeclaration(arena, type);

                EnumType.Builder builder = new EnumType.Builder();
                NameResolver constantNames = new NameResolver();
                clang.visitChildren(declarationCursor, CXCursorVisitor.makeHandle(LibClang.UPCALL_DISPATCHER, arena, (cursor, _, _) ->
                {
                    if (clang.getCursorKind(cursor) == CXCursor_EnumConstantDecl)
                    {
                        try (Arena visitorArena = Arena.ofConfined())
                        {
                            String constantName = clang.retrieveString(clang.getCursorSpelling(visitorArena, cursor)).orElseThrow();
                            long value = clang.getEnumConstantDeclUnsignedValue(cursor);
                            builder.withConstant(new EnumType.Constant(constantNames.resolve(constantName), value));
                        }
                    }

                    return CXChildVisit_Continue;
                }), NULL);

                EnumType enumType = builder.build(nativeResolver.apply(clang.getEnumDeclIntegerType(arena, declarationCursor)));
                yield Optional.of(options.pathProvider().get(clang, declarationCursor)
                    .map(path -> (Type) new EnumDeclaration(enumType, path, SourceScopeScanner.getCursorJavadoc(clang, declarationCursor)))
                    .orElse(enumType)
                );
            }
        }
        case CXType_FunctionNoProto, CXType_FunctionProto ->
        {
            FunctionType.Builder builder = new FunctionType.Builder();
            for (int i = 0; i < clang.getNumArgTypes(type); i++)
            {
                try (Arena arena = Arena.ofConfined())
                {
                    builder.withParameterType(nativeResolver.apply(clang.getArgType(arena, type, i)));
                }
            }

            try (Arena arena = Arena.ofConfined())
            {
                yield Optional.of(builder.build(nativeResolver.apply(clang.getResultType(arena, type))));
            }
        }
        case CXType_Record ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                RecordType.Builder builder = new RecordType.Builder();
                MemorySegment sizePrediction = arena.allocateFrom(JAVA_LONG, 0);
                NameResolver fieldNames = new NameResolver();
                clang.Type_visitFields(type, CXFieldVisitor.makeHandle(LibClang.UPCALL_DISPATCHER, arena, (cursor, _) ->
                {
                    if (!clang.Cursor_isBitField(cursor))
                    {
                        try (Arena visitorArena = Arena.ofConfined())
                        {
                            long offset = clang.Cursor_getOffsetOfField(cursor);
                            long padding = offset - sizePrediction.get(JAVA_LONG, 0);
                            if (padding > 0)
                            {
                                builder.withMember(new RecordType.Padding(padding / 8));
                            }

                            CXType fieldType = clang.getCursorType(visitorArena, cursor);
                            builder.withMember(new RecordType.Field(
                                nativeResolver.apply(fieldType),
                                clang.retrieveString(clang.getCursorSpelling(visitorArena, cursor))
                                    .filter(Predicate.not(String::isEmpty))
                                    .map(fieldNames::resolve)
                            ));
                            sizePrediction.set(JAVA_LONG, 0, offset + clang.Type_getSizeOf(fieldType) * 8);
                        }
                    }

                    return CXChildVisit_Continue;
                }), NULL);

                long padding = clang.Type_getSizeOf(type) * 8 - sizePrediction.get(JAVA_LONG, 0);
                if (padding > 0)
                {
                    builder.withMember(new RecordType.Padding(padding / 8));
                }

                CXCursor declarationCursor = clang.getTypeDeclaration(arena, type);
                int kind = clang.getCursorKind(declarationCursor);
                RecordType recordType = builder.build(switch (kind)
                {
                    case CXCursor_StructDecl -> RecordType.Kind.STRUCT;
                    case CXCursor_UnionDecl -> RecordType.Kind.UNION;
                    default -> throw new ClangException("Unknown record kind: " + kind);
                });
                yield Optional.of(options.pathProvider().get(clang, declarationCursor)
                    .map(path -> (Type) new RecordDeclaration(recordType, path, SourceScopeScanner.getCursorJavadoc(clang, declarationCursor)))
                    .orElse(recordType)
                );
            }
        }
        case CXType_Typedef ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                yield Optional.of(new AliasDeclaration(
                    nativeResolver.apply(clang.getCanonicalType(arena, type)),
                    options.pathProvider().get(clang, clang.getTypeDeclaration(arena, type)).orElseThrow(),
                    SourceScopeScanner.getCursorJavadoc(clang, clang.getTypeDeclaration(arena, type))
                ));
            }
        }
        case CXType_Elaborated ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                yield Optional.of(new Type.OpaqueReference(nativeResolver.apply(clang.Type_getNamedType(arena, type))));
            }
        }
        case CXType_Unexposed, CXType_Auto ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                yield Optional.of(new Type.OpaqueReference(nativeResolver.apply(clang.getCanonicalType(arena, type))));
            }
        }
        case CXType_Pointer, CXType_BlockPointer, CXType_IncompleteArray -> Optional.of(MiscType.POINTER);
        case CXType_ConstantArray, CXType_Vector ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                yield Optional.of(new ArrayType(nativeResolver.apply(clang.getElementType(arena, type)), clang.getNumElements(type)));
            }
        }
        default -> Optional.empty();
    };
    TypeResolver NAMED_CALLBACKS = (clang, options, type, nativeResolver) ->
    {
        if (type.kind() != CXType_Typedef)
        {
            return Optional.empty();
        }

        try (Arena arena = Arena.ofConfined())
        {
            CXType canonicalType = clang.getCanonicalType(arena, type);
            if (canonicalType.kind() != CXType_Pointer)
            {
                return Optional.empty();
            }

            CXType pointeeType = clang.getPointeeType(arena, canonicalType);
            if (pointeeType.kind() != CXType_FunctionNoProto && pointeeType.kind() != CXType_FunctionProto)
            {
                return Optional.empty();
            }

            if (nativeResolver.apply(pointeeType) instanceof FunctionType functionType)
            {
                CXCursor declarationCursor = clang.getTypeDeclaration(arena, type);

                List<ParameterInfo> parameterInfos = new ArrayList<>();
                NameResolver parameterNames = new NameResolver();
                clang.visitChildren(declarationCursor, CXCursorVisitor.makeHandle(LibClang.UPCALL_DISPATCHER, arena, (cursor, _, _) ->
                {
                    if (clang.getCursorKind(cursor) == CXCursor_ParmDecl)
                    {
                        parameterInfos.add(new ParameterInfo(
                            SourceScopeScanner.getCursorJavadoc(clang, cursor),
                            clang.retrieveString(clang.getCursorSpelling(arena, cursor))
                                .filter(Predicate.not(String::isEmpty))
                                .map(parameterNames::resolve)
                        ));
                    }

                    return CXChildVisit_Continue;
                }), NULL);

                return Optional.of(new CallbackDeclaration(
                    options.pathProvider().get(clang, declarationCursor).orElseThrow(),
                    SourceScopeScanner.getCursorJavadoc(clang, declarationCursor),
                    functionType, parameterInfos
                ));
            }
        }

        return Optional.empty();
    };

    static TypeResolver declarationMatcher(ClassName path, Type substitute)
    {
        return (clang, options, type, _) ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                CXCursor cursor = clang.getTypeDeclaration(arena, type);
                if (clang.isDeclaration(cursor.kind()) && path.equals(options.pathProvider().get(clang, cursor).orElseThrow()))
                {
                    return Optional.of(substitute);
                }
            }

            return Optional.empty();
        };
    }

    static <T extends Type & Declaration> TypeResolver declarationMatcher(T typeDeclaration)
    {
        return declarationMatcher(typeDeclaration.path(), typeDeclaration);
    }

    static TypeResolver visitor(Visitor visitor)
    {
        return (clang, options, type, nativeResolver) ->
        {
            visitor.visit(clang, options, type, nativeResolver);
            return Optional.empty();
        };
    }

    static TypeResolver map(TypeResolver resolver, TypeProcessor processor)
    {
        return (clang, options, type, nativeResolver) -> resolver.resolve(clang, options, type, nativeResolver)
            .map(resolvedType -> processor.process(clang, options, type, resolvedType, nativeResolver));
    }

    Optional<Type> resolve(LibClang clang, ParseOptions options, CXType type, Function<CXType, Type> nativeResolver);

    default TypeResolver or(TypeResolver resolver)
    {
        return (clang, options, type, nativeResolver) -> this.resolve(clang, options, type, nativeResolver)
            .or(() -> resolver.resolve(clang, options, type, nativeResolver));
    }

    default TypeResolver map(TypeProcessor processor)
    {
        return map(this, processor);
    }
}

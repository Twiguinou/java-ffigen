package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.*;

import static javax.lang.model.element.Modifier.*;

public enum MiscType implements Type
{
    VOID
    {
        @Override
        public <T> T apply(TypeFeature<T> feature)
        {
            return feature.check(switch (feature)
            {
                case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> false;
                case GetType(GetType.Target target, _)
                    when target == GetType.Target.CALLBACK_RETURN || target == GetType.Target.HEADER_RETURN -> TypeName.VOID;
                default -> super.apply(feature);
            });
        }
    },
    POINTER
    {
        @Override
        public <T> T apply(TypeFeature<T> feature)
        {
            return feature.check(switch (feature)
            {
                case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> false;
                case GetPhysicalLayout _ -> CodeBlock.of("$T.ADDRESS", ValueLayout.class);
                case GetSymbolicName _ -> "ADDRESS";
                case GetType _ -> TypeName.get(MemorySegment.class);
                default -> super.apply(feature);
            });
        }

        @Override
        public void apply(TypeFeature.Void feature)
        {
            switch (feature)
            {
                case AppendArrayMember(TypeSpec.Builder builder, _, CodeBlock sequenceLayout, String name, String offsetFieldName) ->
                    builder.addMethod(MethodSpec.methodBuilder(name).addModifiers(PUBLIC)
                        .returns(ParameterizedTypeName.get(Buffer.class, MemorySegment.class))
                        .addStatement("return $T.addresses(this.pointer().asSlice($L, $L))", Buffer.class, offsetFieldName, sequenceLayout)
                        .build());
                case AppendMember(TypeSpec.Builder builder, _, NameResolver names, LayoutPath path, Optional<String> name) ->
                {
                    if (name.isEmpty())
                    {
                        break;
                    }

                    String offsetFieldName = "OFFSET_" + name.get();
                    builder.addField(FieldSpec.builder(long.class, offsetFieldName, PUBLIC, STATIC, FINAL)
                        .initializer("LAYOUT.byteOffset($L)", path.emit())
                        .build());

                    String resolvedName = names.resolve(name.get());
                    builder.addMethods(List.of(
                        MethodSpec.methodBuilder(resolvedName)
                            .addModifiers(PUBLIC)
                            .returns(MemorySegment.class)
                            .addStatement("return this.pointer().get($T.ADDRESS, $L)", ValueLayout.class, offsetFieldName)
                            .build(),
                        MethodSpec.methodBuilder(resolvedName)
                            .addModifiers(PUBLIC)
                            .addParameter(MemorySegment.class, "value")
                            .addStatement("this.pointer().set($T.ADDRESS, $L, value)", ValueLayout.class, offsetFieldName)
                            .build(),
                        MethodSpec.methodBuilder(names.resolve("$" + resolvedName))
                            .addModifiers(PUBLIC)
                            .returns(MemorySegment.class)
                            .addStatement("return this.pointer().asSlice($L, $T.ADDRESS)", offsetFieldName, ValueLayout.class)
                            .build()
                    ));
                }
                default -> super.apply(feature);
            }
        }
    },
    C_LONG
    {
        @Override
        public <T> T apply(TypeFeature<T> feature)
        {
            return feature.check(switch (feature)
            {
                case GetEnumField(EnumType.Constant(Optional<CodeBlock> javadoc, String name, long value)) ->
                {
                    FieldSpec.Builder builder = FieldSpec.builder(CLong.class, name, EnumDeclaration.constantModifiers())
                        .initializer("$T.of(0x$LL)", CLong.class, Long.toHexString(value));
                    javadoc.ifPresent(builder::addJavadoc);
                    yield builder.build();
                }
                case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> false;
                case GetPhysicalLayout _ -> CodeBlock.of("$T.LAYOUT", CLong.class);
                case GetSymbolicName _ -> this.name();
                case GetType _ -> ClassName.get(CLong.class);
                default -> super.apply(feature);
            });
        }

        @Override
        public void apply(TypeFeature.Void feature)
        {
            switch (feature)
            {
                case AppendArrayMember appendArrayMember -> MiscType.appendCTypeArrayMember(appendArrayMember, CLong.class);
                case AppendMember appendMember -> MiscType.appendCTypeMember(appendMember, CLong.class);
                default -> super.apply(feature);
            }
        }
    },
    C_SIZE_T
    {
        @Override
        public <T> T apply(TypeFeature<T> feature)
        {
            return feature.check(switch (feature)
            {
                case GetEnumField(EnumType.Constant(Optional<CodeBlock> javadoc, String name, long value)) ->
                {
                    FieldSpec.Builder builder = FieldSpec.builder(CSizeT.class, name, EnumDeclaration.constantModifiers())
                        .initializer("$T.of(0x$LL)", CSizeT.class, Long.toHexString(value));
                    javadoc.ifPresent(builder::addJavadoc);
                    yield builder.build();
                }
                case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> false;
                case GetPhysicalLayout _ -> CodeBlock.of("$T.LAYOUT", CSizeT.class);
                case GetSymbolicName _ -> this.name();
                case GetType _ -> ClassName.get(CSizeT.class);
                default -> super.apply(feature);
            });
        }

        @Override
        public void apply(TypeFeature.Void feature)
        {
            switch (feature)
            {
                case AppendArrayMember appendArrayMember -> MiscType.appendCTypeArrayMember(appendArrayMember, CSizeT.class);
                case AppendMember appendMember -> MiscType.appendCTypeMember(appendMember, CSizeT.class);
                default -> super.apply(feature);
            }
        }
    };

    private static void appendCTypeArrayMember(AppendArrayMember appendArrayMember, Class<?> target)
    {
        appendArrayMember.builder().addMethod(MethodSpec.methodBuilder(appendArrayMember.name())
            .addModifiers(PUBLIC)
            .returns(ParameterizedTypeName.get(Buffer.class, target))
            .addStatement("return $T.buffer(this.pointer().asSlice($L, $L))", target, appendArrayMember.offsetFieldName(), appendArrayMember.sequenceLayout())
            .build());
    }

    private static void appendCTypeMember(AppendMember appendMember, Class<?> target)
    {
        if (appendMember.name().isEmpty())
        {
            return;
        }

        String offsetFieldName = "OFFSET_" + appendMember.name().get();
        appendMember.builder().addField(FieldSpec.builder(long.class, offsetFieldName, PUBLIC, STATIC, FINAL)
            .initializer("LAYOUT.byteOffset($L)", appendMember.path().emit())
            .build());

        String resolvedName = appendMember.names().resolve(appendMember.name().get());
        appendMember.builder().addMethods(List.of(
            MethodSpec.methodBuilder(appendMember.names().resolve("$" + resolvedName))
                .addModifiers(PUBLIC)
                .returns(MemorySegment.class)
                .addStatement("return this.pointer().asSlice($L, $T.LAYOUT)", offsetFieldName, target)
                .build(),
            MethodSpec.methodBuilder(resolvedName)
                .addModifiers(PUBLIC)
                .returns(target)
                .addStatement("return $T.wrap(this.$$L())", target, resolvedName)
                .build(),
            MethodSpec.methodBuilder(resolvedName)
                .addModifiers(PUBLIC)
                .addParameter(target, "value")
                .addStatement("value.unwrap(this.$$L())", resolvedName)
                .build()
        ));
    }

    @Override
    public List<Type> dependencies()
    {
        return List.of();
    }
}

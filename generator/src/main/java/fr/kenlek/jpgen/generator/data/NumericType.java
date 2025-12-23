package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.AppendArrayMember;
import fr.kenlek.jpgen.generator.data.features.AppendMember;
import fr.kenlek.jpgen.generator.data.features.GetEnumField;
import fr.kenlek.jpgen.generator.data.features.GetFlag;
import fr.kenlek.jpgen.generator.data.features.GetPhysicalLayout;
import fr.kenlek.jpgen.generator.data.features.GetSymbolicName;
import fr.kenlek.jpgen.generator.data.features.GetType;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import static javax.lang.model.element.Modifier.*;

public enum NumericType implements Type
{
    BYTE(TypeName.BYTE, "bytes")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            if (Byte.toUnsignedLong((byte) value) != value)
            {
                throw new IllegalArgumentException("Long value cannot fit inside a byte.");
            }

            return CodeBlock.of("(byte) 0x$L", Long.toHexString(value));
        }
    },
    SHORT(TypeName.SHORT, "shorts")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            if (Short.toUnsignedLong((short) value) != value)
            {
                throw new IllegalArgumentException("Long value cannot fit inside a short.");
            }

            return CodeBlock.of("(short) 0x$L", Long.toHexString(value));
        }
    },
    CHAR(TypeName.CHAR, "chars")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            if ((char) value != value)
            {
                throw new IllegalArgumentException("Long value cannot fit inside a Java character.");
            }

            return CodeBlock.of("(char) 0x$L", Long.toHexString(value));
        }
    },
    BOOLEAN(TypeName.BOOLEAN, "booleans")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            return CodeBlock.of(value != 0 ? "true" : "false");
        }
    },
    INT(TypeName.INT, "ints")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            if (Integer.toUnsignedLong((int) value) != value)
            {
                throw new IllegalArgumentException("Long value cannot fit inside an int.");
            }

            return CodeBlock.of("0x$L", Long.toHexString(value));
        }
    },
    LONG(TypeName.LONG, "longs")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            return CodeBlock.of("0x$LL", Long.toHexString(value));
        }
    },
    FLOAT(TypeName.FLOAT, "floats")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            throw new UnsupportedOperationException();
        }
    },
    DOUBLE(TypeName.DOUBLE, "doubles")
    {
        @Override
        protected CodeBlock constantInitializer(long value)
        {
            throw new UnsupportedOperationException();
        }
    },
    BOOL32(TypeName.BOOLEAN, "booleans32")
    {
        @Override
        public <T> T apply(TypeFeature<T> feature)
        {
            return feature.check(switch (feature)
            {
                case GetPhysicalLayout _ -> CodeBlock.of("$T.JAVA_INT", ValueLayout.class);
                case GetType _ -> TypeName.BOOLEAN.annotated(AnnotationSpec.builder(Layout.class)
                    .addMember("value", "\"JAVA_INT\"")
                    .addMember("container", "$T.class", ValueLayout.class)
                    .build());
                default -> super.apply(feature);
            });
        }

        @Override
        public void apply(TypeFeature.Void feature)
        {
            switch (feature)
            {
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
                            .returns(boolean.class)
                            .addStatement("return this.pointer().get($T.JAVA_INT, $L) != 0", ValueLayout.class, offsetFieldName)
                            .build(),
                        MethodSpec.methodBuilder(resolvedName)
                            .addModifiers(PUBLIC)
                            .addParameter(boolean.class, "value")
                            .addStatement("this.pointer().set($T.JAVA_INT, $L, value ? 1 : 0)", ValueLayout.class, offsetFieldName)
                            .build(),
                        MethodSpec.methodBuilder(names.resolve("$" + resolvedName))
                            .addModifiers(PUBLIC)
                            .returns(MemorySegment.class)
                            .addStatement("return this.pointer().asSlice($L, $T.JAVA_INT)", offsetFieldName, ValueLayout.class)
                            .build()
                    ));
                }
                default -> super.apply(feature);
            }
        }

        @Override
        protected CodeBlock constantInitializer(long value)
        {
            return CodeBlock.of(value != 0 ? "true" : "false");
        }
    };

    private final TypeName m_path;
    private final String m_bufferFactoryMethodName;

    NumericType(TypeName path, String bufferFactoryMethodName)
    {
        this.m_path = path;
        this.m_bufferFactoryMethodName = bufferFactoryMethodName;
    }

    public static Optional<NumericType> integral(int bytes)
    {
        if (bytes <= 0)
        {
            throw new IllegalArgumentException("Byte size must be strictly greater than zero.");
        }

        return switch (bytes)
        {
            case 1 -> Optional.of(BYTE);
            case 2 -> Optional.of(SHORT);
            case 4 -> Optional.of(INT);
            case 8 -> Optional.of(LONG);
            default -> Optional.empty();
        };
    }

    public static Optional<NumericType> floating(int bytes)
    {
        if (bytes <= 0)
        {
            throw new IllegalArgumentException("Byte size must be strictly greater than zero.");
        }

        return switch (bytes)
        {
            case 4 -> Optional.of(FLOAT);
            case 8 -> Optional.of(DOUBLE);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Type> dependencies()
    {
        return List.of();
    }

    @Override
    public <T> T apply(TypeFeature<T> feature)
    {
        return feature.check(switch (feature)
        {
            case GetEnumField(EnumType.Constant(Optional<CodeBlock> javadoc, String name, long value)) ->
            {
                FieldSpec.Builder builder = FieldSpec.builder(this.m_path, name, EnumDeclaration.constantModifiers())
                    .initializer(this.constantInitializer(value));
                javadoc.ifPresent(builder::addJavadoc);
                yield builder.build();
            }
            case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> false;
            case GetPhysicalLayout _ -> CodeBlock.of("$T.JAVA_$L", ValueLayout.class, this.name());
            case GetSymbolicName _ -> this.name();
            case GetType _ -> this.m_path;
            default -> Type.super.apply(feature);
        });
    }

    @Override
    public void apply(TypeFeature.Void feature)
    {
        switch (feature)
        {
            case AppendArrayMember(TypeSpec.Builder builder, _, CodeBlock sequenceLayout, String name, String offsetFieldName) ->
                builder.addMethod(MethodSpec.methodBuilder(name)
                    .addModifiers(PUBLIC)
                    .returns(ParameterizedTypeName.get(ClassName.get(Buffer.class), this.m_path.box()))
                    .addStatement("return $T.$L(this.pointer().asSlice($L, $L))", Buffer.class, this.m_bufferFactoryMethodName, offsetFieldName, sequenceLayout)
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
                        .returns(this.m_path)
                        .addStatement("return this.pointer().get($T.JAVA_$L, $L)", ValueLayout.class, this.name(), offsetFieldName)
                        .build(),
                    MethodSpec.methodBuilder(resolvedName)
                        .addModifiers(PUBLIC)
                        .addParameter(this.m_path, "value")
                        .addStatement("this.pointer().set($T.JAVA_$L, $L, value)", ValueLayout.class, this.name(), offsetFieldName)
                        .build(),
                    MethodSpec.methodBuilder(names.resolve("$" + resolvedName))
                        .addModifiers(PUBLIC)
                        .returns(MemorySegment.class)
                        .addStatement("return this.pointer().asSlice($L, $T.JAVA_$L)", offsetFieldName, ValueLayout.class, this.name())
                        .build()
                ));
            }
            default -> Type.super.apply(feature);
        }
    }

    protected abstract CodeBlock constantInitializer(long value);
}

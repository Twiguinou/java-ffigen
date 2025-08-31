package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.FieldSpec;
import com.palantir.javapoet.MethodSpec;
import com.palantir.javapoet.ParameterizedTypeName;
import com.palantir.javapoet.TypeName;
import com.palantir.javapoet.TypeSpec;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.AppendArrayMember;
import fr.kenlek.jpgen.generator.data.features.AppendMember;
import fr.kenlek.jpgen.generator.data.features.GetFlag;
import fr.kenlek.jpgen.generator.data.features.GetPhysicalLayout;
import fr.kenlek.jpgen.generator.data.features.GetSymbolicName;
import fr.kenlek.jpgen.generator.data.features.GetType;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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
                case GetFlag.NEEDS_ALLOCATOR -> false;
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
                case GetFlag.NEEDS_ALLOCATOR -> false;
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
                {
                    TypeName bufferType = ParameterizedTypeName.get(Buffer.class, MemorySegment.class);
                    builder.addMethods(List.of(
                        MethodSpec.methodBuilder(name)
                            .addModifiers(PUBLIC)
                            .returns(bufferType)
                            .addStatement("return $T.addresses(this.pointer().asSlice($L, $L))", Buffer.class, offsetFieldName, sequenceLayout)
                            .build(),
                        MethodSpec.methodBuilder(name)
                            .addModifiers(PUBLIC)
                            .addParameter(ParameterizedTypeName.get(ClassName.get(Consumer.class), bufferType), "consumer")
                            .addStatement("consumer.accept(this.$L())", name)
                            .build()
                    ));
                }
                case AppendMember(TypeSpec.Builder builder, _, NameResolver names, LayoutPath path, Optional<String> name) ->
                {
                    if (name.isEmpty())
                    {
                        break;
                    }

                    String offsetFieldName = "OFFSET__" + name.get();
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
    };

    @Override
    public List<Type> dependencies()
    {
        return List.of();
    }
}

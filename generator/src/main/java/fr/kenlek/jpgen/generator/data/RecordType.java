package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.AnnotationSpec;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.FieldSpec;
import com.palantir.javapoet.MethodSpec;
import com.palantir.javapoet.ParameterizedTypeName;
import com.palantir.javapoet.TypeName;
import com.palantir.javapoet.TypeSpec;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.AppendArrayMember;
import fr.kenlek.jpgen.generator.data.features.AppendLayouts;
import fr.kenlek.jpgen.generator.data.features.AppendMember;
import fr.kenlek.jpgen.generator.data.features.GetFlag;
import fr.kenlek.jpgen.generator.data.features.GetPhysicalLayout;
import fr.kenlek.jpgen.generator.data.features.GetSymbolicName;
import fr.kenlek.jpgen.generator.data.features.GetType;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static javax.lang.model.element.Modifier.*;

public record RecordType(Kind kind, List<Member> members) implements Type
{
    public enum Kind
    {
        STRUCT(StructLayout.class),
        UNION(UnionLayout.class);

        public final Class<? extends GroupLayout> layoutClass;

        Kind(Class<? extends GroupLayout> layoutClass)
        {
            this.layoutClass = layoutClass;
        }
    }

    public sealed interface Member permits Field, Padding {}

    public record Field(Type type, Optional<String> name) implements Member {}

    public record Padding(long size) implements Member {}

    public RecordType(Kind kind, List<Member> members)
    {
        this.kind = kind;
        this.members = List.copyOf(members);
    }

    @Override
    public List<Type> dependencies()
    {
        return Stream.concat(
            this.members().stream().flatMap(member -> switch (member)
            {
                case Field(Type type, _) -> type.dependencies().stream();
                case Padding _ -> Stream.empty();
            }),
            Stream.of(this)
        ).toList();
    }

    @Override
    public <T> T apply(TypeFeature<T> feature)
    {
        return feature.check(switch (feature)
        {
            case GetFlag.NEEDS_ALLOCATOR -> true;
            case GetPhysicalLayout(ClassName layouts) -> CodeBlock.of("$T.$L", layouts, this.apply(GetSymbolicName.VALUE));
            case GetSymbolicName _ -> this.kind() + "__" + this.members().stream()
                .map(member -> switch (member)
                {
                    case Field(Type type, Optional<String> name) -> "f" + type.apply(GetSymbolicName.VALUE) + "$" + name.orElse("") + "$";
                    case Padding(long size) -> "p" + size;
                })
                .collect(Collectors.joining("_"));
            case GetType(_, ClassName layouts) -> TypeName.get(MemorySegment.class).annotated(AnnotationSpec.builder(Layout.class)
                .addMember("value", "$S", this.apply(GetSymbolicName.VALUE))
                .addMember("container", "$T", layouts)
                .build());
            default -> Type.super.apply(feature);
        });
    }

    CodeBlock layoutFieldInitializer(ClassName layouts)
    {
        String layoutFactory = switch (this.kind())
        {
            case STRUCT -> "structLayout";
            case UNION -> "unionLayout";
        };
        GetPhysicalLayout getMemberLayout = new GetPhysicalLayout(layouts);
        CodeBlock parameters = CodeBlock.of(
            Stream.generate(() -> "$L")
                .limit(this.members().size())
                .collect(Collectors.joining(", ")),
            this.members().stream()
                .map(member -> switch (member)
                {
                    case RecordType.Field(Type type, Optional<String> name) -> CodeBlock.of("$L.$L",
                        type.apply(getMemberLayout),
                        name.map(value -> "withName(\"" + value + "\")").orElse("withoutName()")
                    );
                    case RecordType.Padding(long size) -> CodeBlock.of("$T.paddingLayout(0x$LL)", MemoryLayout.class, Long.toHexString(size));
                })
                .toArray()
        );
        return CodeBlock.of("$T.$L($L)", MemoryLayout.class, layoutFactory, parameters);
    }

    @Override
    public void apply(TypeFeature.Void feature)
    {
        switch (feature)
        {
            case AppendArrayMember(TypeSpec.Builder builder, ClassName layouts, CodeBlock sequenceLayout, String name, String offsetFieldName) ->
            {
                TypeName bufferType = ParameterizedTypeName.get(Buffer.class, MemorySegment.class);
                builder.addMethods(List.of(
                    MethodSpec.methodBuilder(name)
                        .addModifiers(PUBLIC)
                        .returns(bufferType)
                        .addStatement("return $T.slices(this.pointer().asSlice($L, $L), $T.$L)", Buffer.class, offsetFieldName, sequenceLayout, layouts, this.apply(GetSymbolicName.VALUE))
                        .build(),
                    MethodSpec.methodBuilder(name)
                        .addModifiers(PUBLIC)
                        .addParameter(ParameterizedTypeName.get(ClassName.get(Consumer.class), bufferType), "consumer")
                        .addStatement("consumer.accept(this.$L())", name)
                        .build()
                ));
            }
            case AppendLayouts(TypeSpec.Builder builder, ClassName layouts) ->
                builder.addField(FieldSpec.builder(this.kind().layoutClass, this.apply(GetSymbolicName.VALUE), PUBLIC, STATIC, FINAL)
                    .initializer(this.layoutFieldInitializer(layouts))
                    .build());
            case AppendMember(TypeSpec.Builder builder, ClassName layouts, NameResolver names, LayoutPath path, Optional<String> name) ->
            {
                if (name.isPresent())
                {
                    String offsetFieldName = "OFFSET__" + name.get();
                    builder.addField(FieldSpec.builder(long.class, offsetFieldName, PUBLIC, STATIC, FINAL)
                        .initializer("LAYOUT.byteOffset($L)", path.emit())
                        .build());

                    builder.addMethods(List.of(
                        MethodSpec.methodBuilder(names.resolve(name.get()))
                            .addModifiers(PUBLIC)
                            .returns(MemorySegment.class)
                            .addStatement("return this.pointer().asSlice($L, $T.$L)", offsetFieldName, layouts, this.apply(GetSymbolicName.VALUE))
                            .build()
                    ));
                    break;
                }

                for (int i = 0; i < this.members().size(); i++)
                {
                    if (this.members().get(i) instanceof Field(Type fieldType, Optional<String> fieldName))
                    {
                        fieldType.apply(new AppendMember(builder, layouts, names, path.with(LayoutPath.group(i)), fieldName));
                    }
                }
            }
            default -> Type.super.apply(feature);
        }
    }

    public static class Builder
    {
        public final List<Member> members = new ArrayList<>();

        public Builder() {}

        public Builder withMember(Member member)
        {
            this.members.add(member);
            return this;
        }

        public RecordType build(Kind kind)
        {
            return new RecordType(kind, this.members);
        }
    }
}

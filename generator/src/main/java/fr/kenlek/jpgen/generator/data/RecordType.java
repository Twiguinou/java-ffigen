package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.*;

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
            case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> true;
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
                builder.addMethod(MethodSpec.methodBuilder(name)
                    .addModifiers(PUBLIC)
                    .returns(ParameterizedTypeName.get(Buffer.class, MemorySegment.class))
                    .addStatement("return $T.slices(this.pointer().asSlice($L, $L), $T.$L)", Buffer.class, offsetFieldName, sequenceLayout, layouts, this.apply(GetSymbolicName.VALUE))
                    .build());
            case AppendLayouts(TypeSpec.Builder builder, ClassName layouts) ->
                builder.addField(FieldSpec.builder(this.kind().layoutClass, this.apply(GetSymbolicName.VALUE), PUBLIC, STATIC, FINAL)
                    .initializer(this.layoutFieldInitializer(layouts))
                    .build());
            case AppendMember(TypeSpec.Builder builder, ClassName layouts, NameResolver names, LayoutPath path, Optional<String> name) ->
            {
                if (name.isPresent())
                {
                    String offsetFieldName = "OFFSET_" + name.get();
                    builder.addField(FieldSpec.builder(long.class, offsetFieldName, PUBLIC, STATIC, FINAL)
                        .initializer("LAYOUT.byteOffset($L)", path.emit())
                        .build());

                    builder.addMethod(MethodSpec.methodBuilder(names.resolve(name.get()))
                        .addModifiers(PUBLIC)
                        .returns(MemorySegment.class)
                        .addStatement("return this.pointer().asSlice($L, $T.$L)", offsetFieldName, layouts, this.apply(GetSymbolicName.VALUE))
                        .build());
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

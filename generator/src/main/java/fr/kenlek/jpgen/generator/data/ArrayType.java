package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module java.base;

import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.*;

import static javax.lang.model.element.Modifier.*;

public record ArrayType(Type elementType, long length) implements Type
{
    public ArrayType
    {
        if (length <= 0)
        {
            throw new IllegalArgumentException("Array length must be strictly positive.");
        }
    }

    @Override
    public List<Type> dependencies()
    {
        return Stream.concat(
            this.elementType().dependencies().stream(),
            Stream.of(this)
        ).toList();
    }

    @Override
    public <T> T apply(TypeFeature<T> feature)
    {
        return feature.check(switch (feature)
        {
            case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> false;
            case GetPhysicalLayout(ClassName layouts) -> CodeBlock.of("$T.$L", layouts, this.apply(GetSymbolicName.VALUE));
            case GetSymbolicName _ -> "ARRAY_%d__%s".formatted(this.length(), this.elementType().apply(GetSymbolicName.VALUE));
            case GetType(GetType.Target target, ClassName layouts) -> switch (target)
            {
                case GetType.Target.CALLBACK_RETURN, GetType.Target.HEADER_PARAMETER -> TypeName.get(MemorySegment.class);
                case GetType.Target.CALLBACK_PARAMETER, GetType.Target.HEADER_RETURN ->
                    TypeName.get(MemorySegment.class).annotated(AnnotationSpec.builder(Layout.class)
                        .addMember("value", "$S", this.apply(GetSymbolicName.VALUE))
                        .addMember("container", "$T", layouts)
                        .addMember("referenced", "true")
                        .build());
            };
            default -> Type.super.apply(feature);
        });
    }

    @Override
    public void apply(TypeFeature.Void feature)
    {
        switch (feature)
        {
            case AppendArrayMember _ -> {}
            case AppendLayouts(TypeSpec.Builder builder, ClassName layouts) ->
                builder.addField(FieldSpec.builder(SequenceLayout.class, this.apply(GetSymbolicName.VALUE), PUBLIC, STATIC, FINAL)
                    .initializer("$T.sequenceLayout(0x$LL, $L)", MemoryLayout.class, Long.toHexString(this.length()), this.elementType().apply(new GetPhysicalLayout(layouts)))
                    .build());
            case AppendMember(TypeSpec.Builder builder, ClassName layouts, NameResolver names, LayoutPath path, Optional<String> name) ->
            {
                if (name.isEmpty())
                {
                    break;
                }

                String offsetFieldName = "OFFSET_" + name.get();
                builder.addField(FieldSpec.builder(long.class, offsetFieldName, PUBLIC, STATIC, FINAL)
                    .initializer("LAYOUT.byteOffset($L)", path.emit())
                    .build());

                this.elementType().apply(new AppendArrayMember(
                    builder, layouts, CodeBlock.of("$T.$L", layouts, this.apply(GetSymbolicName.VALUE)),
                    names.resolve(name.get()), offsetFieldName
                ));
            }
            default -> Type.super.apply(feature);
        }
    }
}

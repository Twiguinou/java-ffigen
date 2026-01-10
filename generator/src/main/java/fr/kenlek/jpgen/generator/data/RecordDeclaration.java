package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module fr.kenlek.jpgen.api;
import module java.base;

import fr.kenlek.jpgen.api.data.Buffer;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.*;

import static javax.lang.model.element.Modifier.*;

public record RecordDeclaration(RecordType underlying, ClassName path, Optional<CodeBlock> javadoc)
    implements Type.Delegated, Declaration
{
    public RecordDeclaration(RecordType underlying, ClassName path)
    {
        this(underlying, path, Optional.empty());
    }

    @Override
    public List<? extends Type> dependencies()
    {
        return this.underlying().members().stream().flatMap(member -> switch (member)
        {
            case RecordType.Field(Type type, _) -> type.dependencies().stream();
            case RecordType.Padding _ -> Stream.empty();
        }).toList();
    }

    @Override
    public <T> T apply(TypeFeature<T> feature)
    {
        return feature.check(switch (feature)
        {
            case GetFlag _ when feature == GetFlag.NEEDS_ALLOCATOR -> true;
            case GetPhysicalLayout _ -> CodeBlock.of("$T.LAYOUT", this.path());
            case GetSymbolicName _ -> this.symbolicName();
            case GetType _ -> this.path();
            default -> Delegated.super.apply(feature);
        });
    }

    @Override
    public void apply(TypeFeature.Void feature)
    {
        switch (feature)
        {
            case AppendArrayMember(TypeSpec.Builder builder, _, CodeBlock sequenceLayout, String name, String offsetFieldName) -> builder
                .addMethod(MethodSpec.methodBuilder(name)
                    .addModifiers(PUBLIC)
                    .returns(ParameterizedTypeName.get(ClassName.get(Buffer.class), this.path()))
                    .addStatement("return $T.slices(this.pointer().asSlice($L, $L), $T.LAYOUT, $T::new)", Buffer.class, offsetFieldName, sequenceLayout, this.path(), this.path())
                    .build())
                .addMethod(MethodSpec.methodBuilder(name)
                    .addModifiers(PUBLIC)
                    .addParameter(
                        ParameterizedTypeName.get(ClassName.get(Consumer.class), ParameterizedTypeName.get(ClassName.get(Buffer.class), this.path())),
                        "consumer"
                    )
                    .addStatement("consumer.accept(this.$L())", name)
                    .build());
            case AppendMember(TypeSpec.Builder builder, _, NameResolver names, LayoutPath layoutPath, Optional<String> name) ->
            {
                if (name.isEmpty())
                {
                    break;
                }

                String offsetFieldName = "OFFSET_" + name.get();
                builder.addField(FieldSpec.builder(long.class, offsetFieldName, PUBLIC, STATIC, FINAL)
                    .initializer("LAYOUT.byteOffset($L)", layoutPath.emit())
                    .build());

                String resolvedName = names.resolve(name.get());
                builder.addMethod(MethodSpec.methodBuilder(resolvedName)
                    .addModifiers(PUBLIC)
                    .returns(this.path())
                    .addStatement("return new $T(this.pointer().asSlice($L, $L.LAYOUT))", this.path(), offsetFieldName, this.path())
                    .build());
                builder.addMethod(MethodSpec.methodBuilder(resolvedName)
                    .addModifiers(PUBLIC)
                    .addParameter(
                        ParameterizedTypeName.get(ClassName.get(Consumer.class), this.path()),
                        "consumer"
                    )
                    .addStatement("consumer.accept(this.$L())", resolvedName)
                    .build());
            }
            default -> Delegated.super.apply(feature);
        }
    }

    @Override
    public Optional<TypeSpec> define(ClassName layouts)
    {
        if (this.underlying().members().isEmpty())
        {
            return Optional.empty();
        }

        TypeName bufferType = ParameterizedTypeName.get(ClassName.get(Buffer.class), this.path());
        TypeSpec.Builder builder = TypeSpec.recordBuilder(this.path())
            .addModifiers(PUBLIC)
            .addAnnotation(AnnotationSpec.builder(Layout.Container.class)
                .addMember("value", "\"LAYOUT\"")
                .build())
            .recordConstructor(MethodSpec.constructorBuilder()
                .addParameter(MemorySegment.class, "pointer")
                .build())
            .addSuperinterface(Addressable.class)
            .addField(FieldSpec.builder(this.underlying().kind().layoutClass, "LAYOUT", PUBLIC, STATIC, FINAL)
                .initializer("$L.withName($S)", this.underlying().layoutFieldInitializer(layouts), this.path().simpleName())
                .build())
            .addMethod(MethodSpec.compactConstructorBuilder()
                .addModifiers(PUBLIC)
                .addStatement("$T.checkLayoutConstraints(pointer, LAYOUT)", Addressable.class)
                .build())
            .addMethod(MethodSpec.constructorBuilder()
                .addModifiers(PUBLIC)
                .addParameter(SegmentAllocator.class, "allocator")
                .addStatement("this(allocator.allocate(LAYOUT))")
                .build())
            .addMethod(MethodSpec.methodBuilder("buffer")
                .addModifiers(PUBLIC, STATIC)
                .returns(bufferType)
                .addParameter(MemorySegment.class, "data")
                .addStatement("return $T.slices(data, LAYOUT, $T::new)", Buffer.class, this.path())
                .build())
            .addMethod(MethodSpec.methodBuilder("buffer")
                .addModifiers(PUBLIC, STATIC)
                .returns(bufferType)
                .addParameter(SegmentAllocator.class, "allocator")
                .addParameter(long.class, "size")
                .addStatement("return $T.slices(allocator, LAYOUT, size, $T::new)", Buffer.class, this.path())
                .build())
            .addMethod(MethodSpec.methodBuilder("layout")
                .addAnnotation(Override.class)
                .addModifiers(PUBLIC)
                .returns(this.underlying().kind().layoutClass)
                .addStatement("return LAYOUT")
                .build())
            .addMethod(MethodSpec.methodBuilder("copyFrom")
                .addModifiers(PUBLIC)
                .addParameter(this.path(), "other")
                .addStatement("$T.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize())", MemorySegment.class)
                .build());
        this.javadoc().ifPresent(builder::addJavadoc);

        NameResolver names = new NameResolver();
        names.register("pointer", "layout", "buffer", "copyFrom");
        for (int i = 0; i < this.underlying().members().size(); i++)
        {
            if (this.underlying().members().get(i) instanceof RecordType.Field(Type type, Optional<String> name))
            {
                type.apply(new AppendMember(builder, layouts, names, LayoutPath.group(i), name));
            }
        }

        return Optional.of(builder.build());
    }
}

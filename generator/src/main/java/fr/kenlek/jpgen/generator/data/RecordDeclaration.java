package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.AnnotationSpec;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.FieldSpec;
import com.palantir.javapoet.MethodSpec;
import com.palantir.javapoet.ParameterizedTypeName;
import com.palantir.javapoet.TypeName;
import com.palantir.javapoet.TypeSpec;
import fr.kenlek.jpgen.api.Addressable;
import fr.kenlek.jpgen.api.Buffer;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.AppendArrayMember;
import fr.kenlek.jpgen.generator.data.features.AppendMember;
import fr.kenlek.jpgen.generator.data.features.GetFlag;
import fr.kenlek.jpgen.generator.data.features.GetPhysicalLayout;
import fr.kenlek.jpgen.generator.data.features.GetSymbolicName;
import fr.kenlek.jpgen.generator.data.features.GetType;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static javax.lang.model.element.Modifier.*;

public record RecordDeclaration(RecordType underlying, ClassName path, Optional<CodeBlock> javadoc)
    implements Type.Delegated, Declaration
{
    public RecordDeclaration(RecordType underlying, ClassName path)
    {
        this(underlying, path, Optional.empty());
    }

    @Override
    public List<Type> dependencies()
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
            case GetFlag.NEEDS_ALLOCATOR -> true;
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
            case AppendArrayMember(TypeSpec.Builder builder, _, CodeBlock sequenceLayout, String name, String offsetFieldName) ->
            {
                TypeName bufferType = ParameterizedTypeName.get(ClassName.get(Buffer.class), this.path());
                builder.addMethods(List.of(
                    MethodSpec.methodBuilder(name)
                        .addModifiers(PUBLIC)
                        .returns(bufferType)
                        .addStatement("return $T.slices(this.pointer().asSlice($L, $L), $T.LAYOUT, $T::new)", Buffer.class, offsetFieldName, sequenceLayout, this.path(), this.path())
                        .build(),
                    MethodSpec.methodBuilder(name)
                        .addModifiers(PUBLIC)
                        .addParameter(ParameterizedTypeName.get(ClassName.get(Consumer.class), bufferType), "consumer")
                        .addStatement("consumer.accept(this.$L())", name)
                        .build()
                ));
            }
            case AppendMember(TypeSpec.Builder builder, _, NameResolver names, LayoutPath layoutPath, Optional<String> name) ->
            {
                if (name.isEmpty())
                {
                    break;
                }

                String offsetFieldName = "OFFSET__" + name.get();
                builder.addField(FieldSpec.builder(long.class, offsetFieldName, PUBLIC, STATIC, FINAL)
                    .initializer("LAYOUT.byteOffset($L)", layoutPath.emit())
                    .build());

                String resolvedName = names.resolve(name.get());
                builder.addMethods(List.of(
                    MethodSpec.methodBuilder(resolvedName)
                        .addModifiers(PUBLIC)
                        .returns(this.path())
                        .addStatement("return new $T(this.pointer().asSlice($L, $L.LAYOUT))", this.path(), offsetFieldName, this.path())
                        .build(),
                    MethodSpec.methodBuilder(resolvedName)
                        .addModifiers(PUBLIC)
                        .addParameter(ParameterizedTypeName.get(ClassName.get(Consumer.class), this.path()), "consumer")
                        .addStatement("consumer.accept(this.$L())", resolvedName)
                        .build()
                ));
            }
            default -> Delegated.super.apply(feature);
        }
    }

    @Override
    public Optional<TypeSpec> define(ClassName layouts)
    {
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
                .beginControlFlow("if (pointer.maxByteAlignment() < LAYOUT.byteAlignment() || pointer.byteSize() != LAYOUT.byteSize())")
                .addStatement("throw new $T(\"Memory slice does not follow layout constraints.\")", IllegalArgumentException.class)
                .endControlFlow()
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
            .addMethod(MethodSpec.methodBuilder("allocate")
                .addModifiers(PUBLIC, STATIC)
                .returns(bufferType)
                .addParameter(SegmentAllocator.class, "allocator")
                .addParameter(long.class, "size")
                .addStatement("return $T.allocateSlices(allocator, LAYOUT, size, $T::new)", Buffer.class, this.path())
                .build())
            .addMethod(MethodSpec.methodBuilder("getAtIndex")
                .addModifiers(PUBLIC, STATIC)
                .returns(this.path())
                .addParameter(MemorySegment.class, "buffer")
                .addParameter(long.class, "index")
                .addStatement("return new $T(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT))", this.path())
                .build())
            .addMethod(MethodSpec.methodBuilder("setAtIndex")
                .addModifiers(PUBLIC, STATIC)
                .returns(this.path())
                .addParameter(MemorySegment.class, "buffer")
                .addParameter(long.class, "index")
                .addParameter(this.path(), "value")
                .addStatement("getAtIndex(buffer, index).copyFrom(value)")
                .build())
            .addMethod(MethodSpec.methodBuilder("copyFrom")
                .addModifiers(PUBLIC)
                .addParameter(this.path(), "other")
                .addStatement("$T.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize())", MemorySegment.class)
                .build());
        this.javadoc().ifPresent(builder::addJavadoc);

        NameResolver names = new NameResolver();
        names.register("pointer", "buffer", "allocate", "getAtIndex", "setAtIndex", "copyFrom");
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

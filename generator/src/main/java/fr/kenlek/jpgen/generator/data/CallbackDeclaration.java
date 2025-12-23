package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module java.base;

import fr.kenlek.jpgen.api.dynload.UpcallDispatcher;
import fr.kenlek.jpgen.api.dynload.UpcallTarget;
import fr.kenlek.jpgen.generator.data.features.GetSymbolicName;
import fr.kenlek.jpgen.generator.data.features.GetType;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import static javax.lang.model.element.Modifier.*;

public record CallbackDeclaration(ClassName path, Optional<CodeBlock> javadoc, FunctionType type,
                                  List<ParameterInfo> parameterInfos)
    implements Type.Delegated, Declaration
{
    public CallbackDeclaration(ClassName path, Optional<CodeBlock> javadoc, FunctionType type,
                               List<ParameterInfo> parameterInfos)
    {
        type.checkParameterInfos(parameterInfos);
        this.path = path;
        this.javadoc = javadoc;
        this.type = type;
        this.parameterInfos = List.copyOf(parameterInfos);
    }

    public CallbackDeclaration(ClassName path, FunctionType type, List<ParameterInfo> parameterInfos)
    {
        this(path, Optional.empty(), type, parameterInfos);
    }

    @Override
    public Type underlying()
    {
        return MiscType.POINTER;
    }

    @Override
    public List<? extends Type> dependencies()
    {
        return Stream.concat(
            this.type().dependencies().stream(),
            this.underlying().dependencies().stream()
        ).toList();
    }

    @Override
    public <T> T apply(TypeFeature<T> feature)
    {
        return feature.check(switch (feature)
        {
            case GetSymbolicName _ -> this.symbolicName();
            default -> Delegated.super.apply(feature);
        });
    }

    @Override
    public Optional<TypeSpec> define(ClassName layouts)
    {
        TypeSpec.Builder builder = TypeSpec.interfaceBuilder(this.path())
            .addModifiers(PUBLIC)
            .addAnnotation(FunctionalInterface.class)
            .addMethod(MethodSpec.methodBuilder("makeHandle")
                .addModifiers(PUBLIC, STATIC)
                .returns(MemorySegment.class)
                .addParameter(UpcallDispatcher.class, "dispatcher")
                .addParameter(Arena.class, "arena")
                .addParameter(this.path(), "target")
                .addStatement("return target.makeHandle(dispatcher, arena)")
                .build())
            .addMethod(MethodSpec.methodBuilder("invoke")
                .addModifiers(PUBLIC, ABSTRACT)
                .addAnnotation(UpcallTarget.class)
                .returns(this.type().returnType().apply(new GetType(GetType.Target.CALLBACK_RETURN, layouts)))
                .addParameters(this.type().parameterSpecs(this.parameterInfos(), GetType.Target.CALLBACK_PARAMETER, layouts))
                .build())
            .addMethod(MethodSpec.methodBuilder("makeHandle")
                .addModifiers(PUBLIC, DEFAULT)
                .returns(MemorySegment.class)
                .addParameter(UpcallDispatcher.class, "dispatcher")
                .addParameter(Arena.class, "arena")
                .addStatement("return dispatcher.dispatch(arena, $T.class, this)", this.path())
                .build());
        this.javadoc().ifPresent(builder::addJavadoc);

        return Optional.of(builder.build());
    }
}

package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;
import module java.base;

import fr.kenlek.jpgen.api.dynload.UpcallDispatcher;
import fr.kenlek.jpgen.api.dynload.UpcallTarget;
import fr.kenlek.jpgen.generator.data.features.GetType;

import static javax.lang.model.element.Modifier.*;

public record CallbackDeclaration(ClassName path, Optional<CodeBlock> javadoc, FunctionType type,
                                  List<ParameterInfo> parameterInfos)
    implements Declaration
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
    public List<Type> dependencies()
    {
        return this.type().dependencies();
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

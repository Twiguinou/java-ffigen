package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.MethodSpec;
import com.palantir.javapoet.TypeSpec;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.UpcallTarget;
import fr.kenlek.jpgen.generator.data.features.GetType;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.util.List;
import java.util.Optional;

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
            .addMethod(MethodSpec.methodBuilder("makeHandle")
                .addModifiers(STATIC)
                .returns(MemorySegment.class)
                .addParameter(this.path(), "target")
                .addParameter(Arena.class, "arena")
                .addParameter(Linker.Option.class, "options")
                .varargs(true)
                .addStatement("return target.makeHandle(arena, options)")
                .build())
            .addMethod(MethodSpec.methodBuilder("makeHandle")
                .addModifiers(DEFAULT)
                .returns(MemorySegment.class)
                .addParameter(Arena.class, "arena")
                .addParameter(Linker.Option.class, "options")
                .varargs(true)
                .addStatement("return $T.upcall($T.class, this, arena, options)", NativeProxies.class, this.path())
                .build())
            .addMethod(MethodSpec.methodBuilder("invoke")
                .addAnnotation(UpcallTarget.class)
                .returns(this.type().returnType().apply(new GetType(GetType.Target.CALLBACK_RETURN, layouts)))
                .addParameters(this.type().parameterSpecs(this.parameterInfos(), GetType.Target.CALLBACK_PARAMETER, layouts))
                .build());
        this.javadoc().ifPresent(builder::addJavadoc);

        return Optional.of(builder.build());
    }
}

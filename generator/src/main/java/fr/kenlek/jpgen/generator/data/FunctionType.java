package fr.kenlek.jpgen.generator.data;

import module java.base;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.ParameterSpec;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.data.features.GetType;

public record FunctionType(Type returnType, List<Type> parameterTypes) implements Type
{
    public FunctionType(Type returnType, List<Type> parameterTypes)
    {
        this.returnType = returnType;
        this.parameterTypes = List.copyOf(parameterTypes);
    }

    @Override
    public List<Type> dependencies()
    {
        return Stream.concat(
            this.returnType().dependencies().stream(),
            this.parameterTypes().stream().flatMap(type -> type.dependencies().stream())
        ).toList();
    }

    public static class Builder
    {
        public final List<Type> parameterTypes = new ArrayList<>();

        public Builder() {}

        public Builder withParameterType(Type type)
        {
            this.parameterTypes.add(type);
            return this;
        }

        public FunctionType build(Type returnType)
        {
            return new FunctionType(returnType, this.parameterTypes);
        }
    }

    public void checkParameterInfos(List<ParameterInfo> parameterInfos)
    {
        if (parameterInfos.size() != this.parameterTypes().size())
        {
            throw new IllegalArgumentException("Parameter info list must be the same size as the parameter list.");
        }
    }

    public List<ParameterSpec> parameterSpecs(List<ParameterInfo> parameterInfos, GetType.Target target, ClassName layouts)
    {
        this.checkParameterInfos(parameterInfos);
        if (target != GetType.Target.CALLBACK_PARAMETER && target != GetType.Target.HEADER_PARAMETER)
        {
            throw new IllegalArgumentException("Target must be of parameter kind.");
        }

        GetType getParameterType = new GetType(target, layouts);
        NameResolver names = new NameResolver();
        return IntStream.range(0, parameterInfos.size())
            .mapToObj(i ->
            {
                String name = names.resolve(parameterInfos.get(i).name().orElse("$arg" + (i + 1)));
                ParameterSpec.Builder builder = ParameterSpec.builder(this.parameterTypes().get(i).apply(getParameterType), name);
                parameterInfos.get(i).javadoc().ifPresent(builder::addJavadoc);
                return builder.build();
            })
            .toList();
    }
}

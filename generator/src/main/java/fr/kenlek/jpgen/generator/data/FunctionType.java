package fr.kenlek.jpgen.generator.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.generator.LanguageUtils.requireJavaIdentifier;

public record FunctionType(Type returnType, List<? extends Type> parameterTypes) implements Type.Virtual
{
    public record Parameter(Type type, String name)
    {
        public Parameter
        {
            requireJavaIdentifier(name);
        }
    }

    public static class Wrapper
    {
        public final FunctionType descriptorType;
        public final List<Parameter> parameters;

        public Wrapper(FunctionType descriptorType, List<String> parameterNames)
        {
            if (descriptorType.parameterTypes().size() != parameterNames.size())
            {
                throw new IllegalArgumentException("Mismatch between the number of parameter types and names.");
            }

            this.descriptorType = descriptorType;
            this.parameters = IntStream.range(0, parameterNames.size())
                .mapToObj(index -> new Parameter(descriptorType.parameterTypes().get(index), parameterNames.get(index)))
                .toList();
        }
    }

    public FunctionType(Type returnType, List<? extends Type> parameterTypes)
    {
        this.returnType = returnType;
        this.parameterTypes = List.copyOf(parameterTypes);
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return Stream.concat(
            this.returnType().dependencies().stream(),
            this.parameterTypes().stream()
                .flatMap(type -> type.dependencies().stream())
        ).toList();
    }

    public static class Builder
    {
        public final Type returnType;
        private final List<Type> m_parameters;

        public Builder(Type returnType)
        {
            this.returnType = returnType;
            this.m_parameters = new ArrayList<>();
        }

        public Builder(Type returnType, List<? extends Type> parameters)
        {
            this.returnType = returnType;
            this.m_parameters = new ArrayList<>(parameters);
        }

        public Builder(FunctionType functionType)
        {
            this(functionType.returnType(), functionType.parameterTypes());
        }

        public Builder appendParameter(Type type)
        {
            this.m_parameters.add(type);
            return this;
        }

        private void checkIndex(int index)
        {
            if (index < 0 || index >= this.m_parameters.size())
            {
                throw new IllegalArgumentException("Provided index does not refer to an existing parameter.");
            }
        }

        public Builder setParameter(int index, Type type)
        {
            this.checkIndex(index);
            this.m_parameters.set(index, type);
            return this;
        }

        public Builder removeParameter(int index)
        {
            this.checkIndex(index);
            this.m_parameters.remove(index);
            return this;
        }

        public FunctionType build()
        {
            return new FunctionType(this.returnType, this.m_parameters);
        }
    }
}

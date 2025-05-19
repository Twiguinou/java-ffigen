package fr.kenlek.jpgen.generator.data2;

import java.util.List;
import java.util.stream.IntStream;

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
}

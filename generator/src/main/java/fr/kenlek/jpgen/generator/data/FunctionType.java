package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.LanguageUtils;
import fr.kenlek.jpgen.generator.data.features.CommonFlags;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record FunctionType(Type returnType, List<Type> parametersTypes) implements Type.Virtual
{
    public record Parameter(Type type, String name)
    {
        public Parameter
        {
            LanguageUtils.requireJavaIdentifier(name);
        }

        @Override
        public String toString()
        {
            return "%s(%s)".formatted(this.name, this.type);
        }
    }

    public static class Wrapper implements DependencyProvider
    {
        public final FunctionType descriptorType;
        public final List<String> parametersNames;

        public Wrapper(FunctionType descriptorType, List<String> parametersNames)
        {
            parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
            if (descriptorType.parametersTypes().size() != parametersNames.size())
            {
                throw new IllegalArgumentException("Mismatch between the number of parameter types and names.");
            }

            this.descriptorType = descriptorType;
            this.parametersNames = parametersNames;
        }

        public List<Parameter> createParameters()
        {
            return this.descriptorType.createParameters(this.parametersNames);
        }

        @Override
        public List<Type> getDependencies()
        {
            return this.descriptorType.getDependencies();
        }
    }

    public List<Parameter> createParameters(List<String> names)
    {
        if (this.parametersTypes.size() != names.size())
        {
            throw new IllegalArgumentException("Mismatch between the number of parameter types and names.");
        }

        Parameter[] parameters = new Parameter[this.parametersTypes.size()];
        Iterator<Type> typeIterator = this.parametersTypes.iterator();
        Iterator<String> nameIterator = names.iterator();
        for (int i = 0; i < parameters.length; i++)
        {
            parameters[i] = new Parameter(typeIterator.next(), nameIterator.next());
        }

        return List.of(parameters);
    }

    public boolean hasTranslatableTypes()
    {
        return this.returnType.check(CommonFlags.IS_TRANSLATABLE) ||
               this.parametersTypes.stream().anyMatch(type -> type.check(CommonFlags.IS_TRANSLATABLE));
    }

    public boolean isVoid()
    {
        return this.returnType.check(CommonFlags.IS_VOID);
    }

    public boolean hasCompositeReturnType()
    {
        return this.returnType.check(CommonFlags.IS_COMPOSITE);
    }

    @Override
    public List<Type> getDependencies()
    {
        return Stream.concat(
            this.returnType.getDependencies().stream(),
            this.parametersTypes.stream().flatMap(type -> type.getDependencies().stream())
        ).toList();
    }

    @Override
    public String toString()
    {
        if (this.parametersTypes.isEmpty())
        {
            return "VoidFunctionType[returnType=%s]".formatted(this.returnType);
        }

        return "FunctionType[returnType=%s, args={%s}]".formatted(this.returnType,
            this.parametersTypes.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public static class Builder
    {
        public final Type returnType;
        public final List<Type> parameters = new ArrayList<>();

        public Builder(Type returnType)
        {
            this.returnType = returnType;
        }

        public Builder(Type returnType, List<Type> parameters)
        {
            this(returnType);
            this.parameters.addAll(parameters);
        }

        public Builder(FunctionType functionType)
        {
            this(functionType.returnType, functionType.parametersTypes);
        }

        public Builder addParameter(Type type)
        {
            this.parameters.add(type);
            return this;
        }

        private void checkIndex(int index)
        {
            if (index < 0 || index >= this.parameters.size())
            {
                throw new IllegalArgumentException("Provided index does not refer to an existing parameter.");
            }
        }

        public Builder setParameter(int index, Type type)
        {
            this.checkIndex(index);
            this.parameters.set(index, type);
            return this;
        }

        public Builder removeParameter(int index)
        {
            this.checkIndex(index);
            this.parameters.remove(index);
            return this;
        }

        public FunctionType build()
        {
            return new FunctionType(this.returnType, List.copyOf(this.parameters));
        }
    }
}

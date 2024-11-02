package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;

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
            return String.format("%s(%s)", this.name, this.type);
        }
    }

    public static class Wrapper implements DependencyProvider
    {
        public final FunctionType descriptorType;
        public final List<String> parametersNames;

        public Wrapper(FunctionType descriptorType, List<String> parametersNames)
        {
            parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
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
            throw new IllegalArgumentException("Mismatch between number of parameter types and names.");
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

    @Override
    public TypeKind kind()
    {
        return TypeKind.COMMON;
    }

    public boolean hasTranslatableTypes()
    {
        return this.returnType.kind().isTranslatable() ||
               this.parametersTypes.stream().map(Type::kind).anyMatch(TypeKind::isTranslatable);
    }

    public boolean isVoid()
    {
        return this.returnType.kind().isVoid();
    }

    public boolean hasCompositeReturnType()
    {
        return this.returnType.kind().isComposite();
    }

    public boolean fuzzyEquals(FunctionType other)
    {
        if (this.parametersTypes().size() != other.parametersTypes().size())
        {
            if (this.isVoid())
            {
                return other.isVoid();
            }

            return other.isVoid() || !this.returnType().symbolicName().equals(other.symbolicName());
        }

        for (int i = 0; i < this.parametersTypes().size(); i++)
        {
            if (!this.parametersTypes().get(i).symbolicName().equals(other.parametersTypes().get(i).symbolicName()))
            {
                return false;
            }
        }

        return true;
    }

    @Override
    public List<Type> getDependencies()
    {
        return Stream.concat(
                this.returnType.getDependencies().stream(),
                this.parametersTypes.stream()
                        .flatMap(type -> type.getDependencies().stream())
        ).toList();
    }

    @Override
    public String toString()
    {
        if (this.parametersTypes.isEmpty())
        {
            return String.format("VoidFunctionType[returnType=%s]", this.returnType);
        }

        return String.format("FunctionType[returnType=%s, args={%s}]", this.returnType, this.parametersTypes.stream().map(Object::toString).collect(Collectors.joining(", ")));
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

        public Builder setParameter(Type type, int index)
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

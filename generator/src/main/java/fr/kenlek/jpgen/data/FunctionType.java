package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record FunctionType(Type returnType, List<Type> parametersTypes, boolean variadic) implements Type.Virtual
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

    public abstract static class Wrapper implements DependencyProvider
    {
        public final Type rawDescriptorType;

        protected Wrapper(Type descriptorType)
        {
            this.rawDescriptorType = descriptorType;
        }

        public Optional<FunctionType> descriptorType()
        {
            if (this.rawDescriptorType.flatten() instanceof FunctionType functionType)
            {
                return Optional.of(functionType);
            }

            return Optional.empty();
        }

        public abstract List<String> parametersNames();

        public Optional<List<Parameter>> parameters()
        {
            return this.descriptorType()
                    .map(functionType -> functionType.createParameters(this.parametersNames()));
        }

        @Override
        public List<Type> getDependencies()
        {
            return this.rawDescriptorType.getDependencies();
        }
    }

    public FunctionType
    {
        if (parametersTypes.isEmpty() && variadic)
        {
            throw new IllegalArgumentException("Void function type cannot be variadic.");
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

        return String.format("FunctionType[returnType=%s, variadic=%b, args={%s}]", this.returnType, this.variadic,
                this.parametersTypes.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public static class Builder
    {
        public final Type returnType;
        public final List<Type> parameters = new ArrayList<>();
        public final boolean variadic;

        public Builder(Type returnType, boolean variadic)
        {
            this.returnType = returnType;
            this.variadic = variadic;
        }

        public Builder(Type returnType, List<Type> parameters, boolean variadic)
        {
            this(returnType, variadic);
            this.parameters.addAll(parameters);
        }

        public Builder(FunctionType functionType)
        {
            this(functionType.returnType, functionType.parametersTypes, functionType.variadic);
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
            return new FunctionType(this.returnType, List.copyOf(this.parameters), this.variadic);
        }
    }
}

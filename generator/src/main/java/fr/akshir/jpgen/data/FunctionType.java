package fr.akshir.jpgen.data;

import fr.akshir.jpgen.PrintingContext;

import java.lang.foreign.MemoryLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record FunctionType(Type returnType, List<Type> parametersTypes, boolean variadic) implements Type
{
    public record Parameter(Type type, String name)
    {
        @Override
        public String toString()
        {
            return String.format("%s:%s", this.type, this.name);
        }
    }

    public FunctionType
    {
        if (parametersTypes.isEmpty() && variadic)
        {
            throw new IllegalArgumentException("Void function type cannot be variadic.");
        }
    }

    public static List<Parameter> createParameters(List<Type> types, List<String> names)
    {
        if (types.size() != names.size())
        {
            throw new IllegalArgumentException("Mismatch between number of parameter types and names.");
        }

        Parameter[] parameters = new Parameter[types.size()];
        Iterator<Type> typeIterator = types.iterator();
        Iterator<String> nameIterator = names.iterator();
        for (int i = 0; i < parameters.length; i++)
        {
            String parameterName = nameIterator.next();
            if (parameterName.isEmpty())
            {
                throw new IllegalArgumentException("Invalid unnamed argument.");
            }

            parameters[i] = new Parameter(typeIterator.next(), parameterName);
        }

        return List.of(parameters);
    }

    @Override
    public Optional<MemoryLayout> layout()
    {
        return Optional.empty();
    }

    @Override public void writeMemberProperties(PrintingContext context, String name, long offset) {throw new UnsupportedOperationException();}
    @Override public String getLayoutList(String name) {throw new UnsupportedOperationException();}
    @Override public void writeAccessors(PrintingContext context, String name, String data) {throw new UnsupportedOperationException();}
    @Override public void writeArrayAccessors(PrintingContext context, String name, String array) {throw new UnsupportedOperationException();}
    @Override public String getWrappedFunctionParameterType() {throw new UnsupportedOperationException();}
    @Override public String getWrappedFunctionParameter(String name) {throw new UnsupportedOperationException();}
    @Override public String getUnwrappedFunctionParameterType() {throw new UnsupportedOperationException();}
    @Override public String getUnwrappedFunctionParameter(String name) {throw new UnsupportedOperationException();}
    @Override public String getWrappedFunctionReturnType() {throw new UnsupportedOperationException();}
    @Override public String getWrappedFunctionReturnValue(String data) {throw new UnsupportedOperationException();}
    @Override public String getUnwrappedFunctionReturnType() {throw new UnsupportedOperationException();}
    @Override public String getUnwrappedFunctionReturnValue(String data) {throw new UnsupportedOperationException();}
    @Override public String getFunctionLayoutInstance() {throw new UnsupportedOperationException();}
    @Override public String getRecordMemberLayoutType() {throw new UnsupportedOperationException();}
    @Override public String getRecordMemberLayoutInstance() {throw new UnsupportedOperationException();}
    @Override public String getWrappedEnumConstant(long value) {throw new UnsupportedOperationException();}
    @Override public boolean requiresRedirect() {throw new UnsupportedOperationException();}

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

    @SuppressWarnings("unused")
    public static class Builder
    {
        public final Type returnType;
        private final List<Type> m_parameters = new ArrayList<>();
        public final boolean variadic;

        public Builder(Type returnType, boolean variadic)
        {
            this.returnType = returnType;
            this.variadic = variadic;
        }

        public Builder(Type returnType, List<Type> parameters, boolean variadic)
        {
            this(returnType, variadic);
            this.m_parameters.addAll(parameters);
        }

        public Builder(FunctionType type)
        {
            this(type.returnType, type.parametersTypes, type.variadic);
        }

        public List<Type> parameters()
        {
            return this.m_parameters;
        }

        public Builder addParameter(Type type)
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

        public Builder setParameter(Type type, int index)
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
            return new FunctionType(this.returnType, List.copyOf(this.m_parameters), this.variadic);
        }
    }
}

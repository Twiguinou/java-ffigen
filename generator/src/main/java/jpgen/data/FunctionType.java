package jpgen.data;

import jpgen.SizedIterable;

import java.lang.foreign.MemoryLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public record FunctionType(Type returnType, SizedIterable<Type> parameterTypes, boolean variadic) implements Type
{
    @Override
    public Optional<MemoryLayout> layout()
    {
        return Optional.empty();
    }

    // Where did the inheritance go??
    public static class Decl implements Declaration
    {
        private final String m_name;
        public final SizedIterable<String> parameterNames;
        public final FunctionType descriptorType;
        public final Linkage linkage;

        public Decl(Linkage linkage, FunctionType descriptorType, String name, SizedIterable<String> parameterNames)
        {
            this.m_name = name;
            this.parameterNames = parameterNames;
            this.descriptorType = descriptorType;
            this.linkage = linkage;
        }

        @Override
        public String name()
        {
            return this.m_name;
        }

        @Override
        public String toString()
        {
            Iterator<String> nameIterator = this.parameterNames.iterator();
            if (!nameIterator.hasNext())
            {
                return String.format("VoidFunction[%s, linkage=%s, returnType=%s]", this.m_name, this.linkage, this.descriptorType.returnType);
            }

            Iterator<Type> typeIterator = this.descriptorType.parameterTypes.iterator();

            StringBuilder builder = new StringBuilder();
            builder.append(nameIterator.next()).append(':').append(typeIterator.next());
            while(nameIterator.hasNext())
            {
                builder.append(',').append(nameIterator.next()).append(':').append(typeIterator.next());
            }

            return String.format("Function[%s, linkage=%s, returnType=%s, variadic=%b, args={%s}]", this.m_name, this.linkage, this.descriptorType.returnType, this.descriptorType.variadic, builder);
        }
    }

    public static class Builder
    {
        public final Type returnType;
        protected final List<Type> m_parameterTypes = new ArrayList<>();
        public final boolean variadic;

        public Builder(Type returnType, boolean variadic)
        {
            this.returnType = returnType;
            this.variadic = variadic;
        }

        public Iterable<Type> parameterTypes()
        {
            return this.m_parameterTypes;
        }

        public Builder appendParameter(Type parameterType)
        {
            this.m_parameterTypes.add(parameterType);
            return this;
        }

        protected void checkVariadic()
        {
            if (this.variadic && this.m_parameterTypes.isEmpty())
            {
                throw new IllegalStateException("A void function type cannot be variadic.");
            }
        }

        public FunctionType build()
        {
            this.checkVariadic();
            return new FunctionType(this.returnType, SizedIterable.ofArray(this.m_parameterTypes.toArray(Type[]::new)), this.variadic);
        }
    }

    // TODO: Maybe move this class elsewhere.
    public static class DeclBuilder
    {
        public FunctionType innerType;
        public String name;
        private final Set<String> m_usedNames = new HashSet<>();
        private final List<String> m_parameterNames = new ArrayList<>();
        private final Linkage m_linkage;

        public DeclBuilder(Linkage linkage, FunctionType innerType, String name)
        {
            this.innerType = innerType;
            this.name = name;
            this.m_linkage = linkage;
        }

        public Collection<String> parameterNames()
        {
            return this.m_parameterNames;
        }

        public DeclBuilder appendParameterName(String parameterName)
        {
            if (!parameterName.isEmpty() && !this.m_usedNames.add(parameterName))
            {
                throw new IllegalArgumentException(String.format("Parameter with name %s is already present.", parameterName));
            }

            this.m_parameterNames.add(parameterName);
            return this;
        }

        public Linkage linkage()
        {
            return this.m_linkage;
        }

        public Decl build()
        {
            if (this.m_parameterNames.size() != this.innerType.parameterTypes.size())
            {
                throw new IllegalStateException("Parameter count does not match the specified type.");
            }

            return new Decl(this.m_linkage, this.innerType, this.name, SizedIterable.ofArray(this.m_parameterNames.toArray(String[]::new)));
        }
    }
}

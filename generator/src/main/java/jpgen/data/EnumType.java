package jpgen.data;

import jpgen.SizedIterable;

import java.lang.foreign.MemoryLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

// Delegated for now, because we can't provide type safety without adding overhead.
public class EnumType implements Type.Delegated
{
    public record Constant(String name, long value)
    {
        @Override
        public boolean equals(Object o)
        {
            return (o instanceof Constant constant) && (this.name.equals(constant.name));
        }

        @Override
        public String toString()
        {
            return String.format("EnumConstant[%s->%d]", this.name, this.value);
        }
    }

    public final Type integralType;
    public final SizedIterable<Constant> constants;

    public EnumType(Type integralType, SizedIterable<Constant> constants)
    {
        this.integralType = integralType;
        this.constants = constants;
    }

    @Override
    public Type underlyingType()
    {
        return this.integralType;
    }

    @Override
    public Type flatten()
    {
        return this;
    }

    @Override
    public String toString()
    {
        Iterator<Constant> constantIterator = this.constants.iterator();
        if (!constantIterator.hasNext())
        {
            return String.format("Enum[integerType=%s]", this.integralType);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(constantIterator.next());
        while (constantIterator.hasNext())
        {
            builder.append(", ").append(constantIterator.next());
        }

        return String.format("Enum[integerType=%s, constants={%s}]", this.integralType, builder);
    }

    public static class Decl extends EnumType implements Declaration
    {
        private final String m_package;
        private final String m_name;

        public Decl(String canonicalPackage, String name, Type integralType, SizedIterable<Constant> constants)
        {
            super(integralType, constants);
            this.m_package = canonicalPackage;
            this.m_name = name;
        }

        public Decl(Decl enumDecl)
        {
            this(enumDecl.m_package, enumDecl.m_name, enumDecl.integralType, enumDecl.constants);
        }

        @Override
        public String name()
        {
            return this.m_name;
        }

        @Override
        public Optional<String> canonicalPackage()
        {
            if (this.m_package.isEmpty())
            {
                return Optional.empty();
            }

            return Optional.of(this.m_package);
        }

        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return super.layout().map(layout -> layout.withName(this.m_name));
        }

        @Override
        public String toString()
        {
            Iterator<Constant> constantIterator = this.constants.iterator();
            if (!constantIterator.hasNext())
            {
                return String.format("Enum[%s, integerType=%s]", this.m_name, this.integralType);
            }

            StringBuilder builder = new StringBuilder();
            builder.append(constantIterator.next());
            while (constantIterator.hasNext())
            {
                builder.append(", ").append(constantIterator.next());
            }

            return String.format("Enum[%s, integerType=%s, constants={%s}]", this.m_name, this.integralType, builder);
        }
    }

    public static class Builder
    {
        public final Type integralType;
        private final Set<Constant> m_constants = new LinkedHashSet<>();

        public Builder(Type integralType)
        {
            this.integralType = integralType;
        }

        public Iterable<Constant> constants()
        {
            return this.m_constants;
        }

        public Builder appendConstant(Constant constant)
        {
            if (!this.m_constants.add(constant))
            {
                throw new IllegalArgumentException("Constant already present.");
            }

            return this;
        }

        public Builder appendConstant(String name, long value)
        {
            return this.appendConstant(new Constant(name, value));
        }

        public EnumType buildAsType()
        {
            return new EnumType(this.integralType, SizedIterable.ofArray(this.m_constants.toArray(Constant[]::new)));
        }

        public Decl buildAsDeclaration(String canonicalPackage, String name)
        {
            return new Decl(canonicalPackage, name, this.integralType, SizedIterable.ofArray(this.m_constants.toArray(Constant[]::new)));
        }
    }
}

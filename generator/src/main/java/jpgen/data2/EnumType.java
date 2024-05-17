package jpgen.data2;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public sealed class EnumType implements Type permits EnumType.Decl
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

    public final Type.ValueType integralType;
    public final Iterable<Constant> constants;

    public EnumType(Type.ValueType integralType, Iterable<Constant> constants)
    {
        if (!integralType.isIntegral)
        {
            throw new IllegalArgumentException("Enums may only be of integral value type.");
        }

        this.integralType = integralType;
        this.constants = constants;
    }

    @Override
    public Optional<ValueLayout> layout()
    {
        return this.integralType.layout();
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

    public static final class Decl extends EnumType implements Declaration
    {
        private final String m_name;

        public Decl(String name, Type.ValueType integralType, Iterable<Constant> constants)
        {
            super(integralType, constants);
            this.m_name = name;
        }

        @Override
        public String name()
        {
            return this.m_name;
        }

        @Override
        public Optional<ValueLayout> layout()
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
        public final Type.ValueType integralType;
        private final Set<Constant> m_constants = new LinkedHashSet<>();

        public Builder(Type.ValueType integralType)
        {
            if (!integralType.isIntegral)
            {
                throw new IllegalArgumentException("Enums may only be of integral value type.");
            }

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
            return new EnumType(this.integralType, List.copyOf(this.m_constants));
        }

        public Decl buildAsDeclaration(String name)
        {
            return new Decl(name, this.integralType, List.copyOf(this.m_constants));
        }
    }
}

package fr.kenlek.jpgen.data;

import java.lang.foreign.MemoryLayout;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public final List<Constant> constants;

    public EnumType(Type integralType, List<Constant> constants)
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
        if (this.constants.isEmpty())
        {
            return String.format("Enum[integerType=%s]", this.integralType);
        }

        return String.format("Enum[integerType=%s, constants={%s}]", this.integralType,
                this.constants.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public static class Decl extends EnumType implements Declaration
    {
        private final CanonicalPackage m_location;
        private final String m_name;

        public Decl(CanonicalPackage location, String name, Type integralType, List<Constant> constants)
        {
            super(integralType, constants);
            this.m_location = location;
            this.m_name = name;
        }

        @Override
        public String name()
        {
            return this.m_name;
        }

        @Override
        public CanonicalPackage location()
        {
            return this.m_location;
        }

        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return super.layout().map(layout -> layout.withName(this.m_name));
        }

        @Override
        public String toString()
        {
            if (this.constants.isEmpty())
            {
                return String.format("Enum[%s, integerType=%s]", this.m_name, this.integralType);
            }

            return String.format("Enum[%s, integerType=%s, constants={%s}]", this.m_name, this.integralType,
                    this.constants.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }

    @SuppressWarnings("unused")
    public static class Builder
    {
        public final Type integralType;
        private final Map<String, Constant> m_constants = new LinkedHashMap<>();

        public Builder(Type integralType)
        {
            this.integralType = integralType;
        }

        public Builder(Type integralType, List<Constant> constants)
        {
            this.integralType = integralType;
            constants.forEach(constant -> this.m_constants.put(constant.name, constant));
        }

        public Builder(EnumType enumType)
        {
            this(enumType.integralType, enumType.constants);
        }

        public Collection<Constant> constants()
        {
            return this.m_constants.values();
        }

        public Builder putConstant(Constant constant)
        {
            this.m_constants.put(constant.name, constant);
            return this;
        }

        public Builder putConstant(String name, long value)
        {
            return this.putConstant(new Constant(name, value));
        }

        public Builder removeConstant(String name)
        {
            this.m_constants.remove(name);
            return this;
        }

        public EnumType buildAsType()
        {
            return new EnumType(this.integralType, this.constants().stream().toList());
        }

        public Decl buildAsDeclaration(CanonicalPackage location, String name)
        {
            return new Decl(location, name, this.integralType, this.constants().stream().toList());
        }
    }
}

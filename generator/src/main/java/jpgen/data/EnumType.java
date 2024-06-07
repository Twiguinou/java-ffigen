package jpgen.data;

import jpgen.SizedIterable;
import jpgen.PrintingContext;

import java.io.IOException;
import java.lang.foreign.MemoryLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class EnumType implements Type
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
    public Optional<? extends MemoryLayout> layout()
    {
        return this.integralType.layout();
    }

    @Override
    public String layoutClass()
    {
        return this.integralType.layoutClass();
    }

    @Override
    public String layoutInstance()
    {
        return this.integralType.layoutInstance();
    }

    @Override
    public String nativeLayoutInstance()
    {
        return this.integralType.layoutInstance();
    }

    @Override
    public String javaType()
    {
        return this.integralType.javaType();
    }

    @Override
    public String nativeType()
    {
        return this.integralType.nativeType();
    }

    @Override
    public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException
    {
        this.integralType.writeAccessors(context, name, layout, offset, data);
    }

    @Override
    public void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException
    {
        this.integralType.writeArrayAccessors(context, name, array);
    }

    @Override
    public void writeReturnWrapping(Appendable output, String result) throws IOException
    {
        this.integralType.writeReturnWrapping(output, result);
    }

    @Override
    public void writeReturnUnwrapping(Appendable output, String result) throws IOException
    {
        this.integralType.writeReturnUnwrapping(output, result);
    }

    @Override
    public void writeParameterWrapping(Appendable output, String parameter) throws IOException
    {
        this.integralType.writeParameterWrapping(output, parameter);
    }

    @Override
    public void writeParameterUnwrapping(Appendable output, String parameter) throws IOException
    {
        this.integralType.writeParameterUnwrapping(output, parameter);
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

package fr.kenlek.jpgen.generator.data;

import module java.base;

import com.palantir.javapoet.CodeBlock;

public record EnumType(Type underlying, List<Constant> constants) implements Type.Delegated
{
    public record Constant(Optional<CodeBlock> javadoc, String name, long value)
    {
        public Constant(String name, long value)
        {
            this(Optional.empty(), name, value);
        }
    }

    public EnumType(Type underlying, List<Constant> constants)
    {
        this.underlying = underlying;
        this.constants = List.copyOf(constants);
    }

    public static class Builder
    {
        public final List<Constant> constants = new ArrayList<>();

        public Builder() {}

        public Builder withConstant(Constant constant)
        {
            this.constants.add(constant);
            return this;
        }

        public EnumType build(Type integralType)
        {
            return new EnumType(integralType, this.constants);
        }
    }
}

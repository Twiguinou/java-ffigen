package jpgen.data;

public record EnumType(TypeManifold integerType, Constant[] constants) implements TypeManifold
{
    public record Constant(String name, long value)
    {
        @Override
        public String toString()
        {
            return STR."EnumConstant[\{this.name}->\{this.value}]";
        }
    }

    @Override
    public String toString()
    {
        // Empty enums are prohibited in clang.
        StringBuilder builder = new StringBuilder();
        builder.append(this.constants[0]);
        for (int i = 1; i < this.constants.length; i++)
        {
            builder.append(STR.",\{this.constants[i]}");
        }

        return STR."Enum[type=\{this.integerType}, constants={\{builder.toString()}}]";
    }

    public record Declaration(String name, EnumType innerType) implements jpgen.data.Declaration
    {
        @Override
        public String toString()
        {
            // Empty enums are prohibited in clang.
            StringBuilder builder = new StringBuilder();
            builder.append(this.innerType.constants[0]);
            for (int i = 1; i < this.innerType.constants.length; i++)
            {
                builder.append(STR.", \{this.innerType.constants[i]}");
            }

            return STR."Enum[\{this.name}, type=\{this.innerType.integerType}, constants={\{builder.toString()}}]";
        }
    }
}

package jpgen.data;

public record EnumDeclaration(String name, Constant[] constants, TypeDeclaration.IntegerPrimitive constantType) implements TypeDeclaration
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
    public String spelling()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        if (this.constants.length == 0)
        {
            return STR."Enum[\{this.name},type=\{this.constantType.spelling()}]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append(this.constants[0].toString());
        for (int i = 1; i < this.constants.length; i++)
        {
            builder.append(STR.",\{this.constants[i].toString()}");
        }

        return STR."Enum[\{this.name},type=\{this.constantType.spelling()},constants={\{builder.toString()}}]";
    }
}

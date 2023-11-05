package jpgen.data;

public record FunctionDeclaration(String name, boolean variadic, TypeReference returnType, Argument[] arguments)
{
    public record Argument(String name, TypeReference type)
    {
        @Override
        public String toString()
        {
            return STR."Argument[\{this.name},type=\{this.type}]";
        }
    }

    @Override
    public String toString()
    {
        if (this.arguments.length == 0)
        {
            return STR."Function[\{this.name},return=\{this.returnType},variadic=\{this.variadic}]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append(this.arguments[0].toString());
        for (int i = 1; i < this.arguments.length; i++)
        {
            builder.append(STR.",\{this.arguments[i].toString()}");
        }

        return STR."Function[\{this.name},returnType=\{this.returnType},variadic=\{this.variadic},args={\{builder.toString()}}]";
    }
}

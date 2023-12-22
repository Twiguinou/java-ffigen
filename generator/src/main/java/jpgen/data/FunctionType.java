package jpgen.data;

public record FunctionType(boolean variadic, TypeManifold resultType, TypeManifold[] argTypes) implements TypeManifold
{
    public record Declaration(String name, FunctionType innerType, String[] argNames) implements jpgen.data.Declaration
    {
        @Override
        public String toString()
        {
            if (this.argNames.length == 0)
            {
                return STR."Function[\{this.name}, return=\{this.innerType.resultType()}, variadic=\{this.innerType.variadic()}]";
            }

            StringBuilder builder = new StringBuilder();
            builder.append(STR."\{this.argNames[0]}:\{this.innerType.argTypes()[0]}");
            for (int i = 1; i < this.argNames.length; i++)
            {
                builder.append(STR.",\{this.argNames[i]}:\{this.innerType.argTypes()[i]}");
            }

            return STR."Function[\{this.name}, returnType=\{this.innerType.resultType()}, variadic=\{this.innerType.variadic()}, args={\{builder.toString()}}]";
        }
    }
}

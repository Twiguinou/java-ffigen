package jpgen.data;

public record RecordType(Shape shape, Field[] fields) implements TypeManifold
{
    public record Field(String name, TypeManifold type, long offset)
    {
        @Override
        public String toString()
        {
            return STR."Field[\{this.name}(\{this.offset}):\{this.type}]";
        }
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(this.fields[0]);
        for (int i = 1; i < this.fields.length; i++)
        {
            builder.append(STR.",\{this.fields[i]}");
        }

        return STR."Record[shape=\{this.shape}, fields={\{builder.toString()}}]";
    }

    public record Declaration(String name, RecordType innerType) implements jpgen.data.Declaration
    {
        @Override
        public String toString()
        {
            StringBuilder builder = new StringBuilder();
            builder.append(this.innerType.fields[0]);
            for (int i = 1; i < this.innerType.fields.length; i++)
            {
                builder.append(STR.",\{this.innerType.fields[i]}");
            }

            return STR."Record[\{this.name}:\{this.innerType.shape}, fields={\{builder.toString()}}]";
        }
    }

    public enum Shape
    {
        STRUCT,
        UNION
    }
}

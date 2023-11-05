package jpgen.data;

public record RecordDeclaration(String name, Field[] fields) implements TypeDeclaration
{
    public record Field(String name, long offset, TypeReference type)
    {
        @Override
        public String toString()
        {
            return STR."Field[\{this.name},offset=\{this.offset},type=\{this.type.toString()}]";
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
        // An empty struct yields undefined behavior in C
        assert this.fields.length > 0;
        StringBuilder builder = new StringBuilder();
        builder.append(this.fields[0].toString());
        for (int i = 1; i < this.fields.length; i++)
        {
            builder.append(String.format(", %s", this.fields[i].toString()));
        }

        return STR."Record[\{this.name},members={\{builder.toString()}}]";
    }
}

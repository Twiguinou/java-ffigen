package jpgen.data;

public record ConstantMacro(String identifier, int value)
{
    @Override
    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof ConstantMacro(String id, _) && id.equals(this.identifier));
    }

    @Override
    public int hashCode()
    {
        return this.identifier.hashCode();
    }
}

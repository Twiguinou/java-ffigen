package fr.kenlek.jpgen.data;

public record FuzzyMember(RecordType.Member value)
{
    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof FuzzyMember(RecordType.Member v) && this.value().fuzzyEquals(v);
    }

    @Override
    public int hashCode()
    {
        return this.value().fuzzyHashcode();
    }
}

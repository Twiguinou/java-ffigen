package fr.kenlek.jpgen.data;

public record FuzzyBinding(HeaderDeclaration.Binding value)
{
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof FuzzyBinding(HeaderDeclaration.IndirectBinding indirect1))
        {
            if (this.value instanceof HeaderDeclaration.IndirectBinding indirect2)
            {
                return indirect1.name.equals(indirect2.name) && indirect1.handle.equals(indirect2.handle) &&
                       indirect1.descriptorType().fuzzyEquals(indirect2.descriptorType());
            }
        }
        else if (obj instanceof FuzzyBinding(HeaderDeclaration.Binding binding) && !(this.value instanceof HeaderDeclaration.IndirectBinding))
        {
            return this.value().name.equals(binding.name) && this.value().descriptorType().fuzzyEquals(binding.descriptorType());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return this.value().name.hashCode();
    }
}

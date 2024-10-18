package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.Type;

public record TypeOp(boolean wrap, String element) implements Type.ProcessingHint
{
    public String cast(String type)
    {
        if (this.wrap())
        {
            return String.format("(%s)%s", type, this.element());
        }

        return this.element();
    }
}

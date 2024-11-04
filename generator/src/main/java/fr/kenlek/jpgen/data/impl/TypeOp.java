package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.Type;

public record TypeOp(boolean wrap, Location location, String element) implements Type.ProcessingHint
{
    public enum Location
    {
        CALLBACK_RAW,
        CALLBACK,
        FUNCTION
    }

    public String cast(String type)
    {
        if (this.wrap() && this.location() == Location.FUNCTION)
        {
            return String.format("(%s)%s", type, this.element());
        }

        return this.element();
    }
}

package fr.kenlek.jpgen.data.features;

import fr.kenlek.jpgen.data.Feature;

public record ProcessTypeValue(boolean wrap, Location location, String element) implements Feature
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
            return "((%s)%s)".formatted(type, this.element());
        }

        return this.element();
    }
}

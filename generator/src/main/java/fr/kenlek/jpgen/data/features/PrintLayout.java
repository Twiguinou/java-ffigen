package fr.kenlek.jpgen.data.features;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.Feature;

public record PrintLayout(PrintingContext context, Location location) implements Feature.Void
{
    public enum Location
    {
        LAYOUTS_CLASS
    }
}

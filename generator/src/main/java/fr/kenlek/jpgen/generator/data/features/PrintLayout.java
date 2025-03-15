package fr.kenlek.jpgen.generator.data.features;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.Feature;

public record PrintLayout(PrintingContext context, Location location) implements Feature.Opt
{
    public enum Location
    {
        LAYOUTS_CLASS
    }
}

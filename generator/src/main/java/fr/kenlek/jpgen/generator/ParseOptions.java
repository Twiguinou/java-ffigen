package fr.kenlek.jpgen.generator;

public record ParseOptions(ElementFilter elementFilter, PathProvider pathProvider, TypeResolver typeResolver)
{
    public ParseOptions(ElementFilter elementFilter, PathProvider pathProvider)
    {
        this(elementFilter, pathProvider, TypeResolver.DEFAULT);
    }
}

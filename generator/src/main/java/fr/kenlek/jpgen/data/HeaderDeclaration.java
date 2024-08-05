package fr.kenlek.jpgen.data;

import java.util.List;

public record HeaderDeclaration(String name, CanonicalPackage location, List<Binding> bindings, List<Constant> constants) implements Declaration
{
    public HeaderDeclaration(String name, CanonicalPackage location, List<Binding> bindings)
    {
        this(name, location, bindings, List.of());
    }
}

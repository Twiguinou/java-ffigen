package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.FunctionDeclaration;
import fr.kenlek.jpgen.generator.data.Type;

import java.util.List;

public record ParseResults(List<Type> types, List<FunctionDeclaration> functions)
{
    public List<Declaration> declarations()
    {
        return this.types().stream()
            .filter(Declaration.class::isInstance)
            .map(Declaration.class::cast)
            .toList();
    }

    public static class Builder
    {
        public ParseResults build()
        {
        }
    }
}

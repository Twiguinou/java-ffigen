package fr.kenlek.jpgen.generator;

import module java.base;

import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.FunctionDeclaration;
import fr.kenlek.jpgen.generator.data.Type;

public record ParseResults(List<Type> types, List<FunctionDeclaration> functions)
{
    public ParseResults(List<Type> types, List<FunctionDeclaration> functions)
    {
        this.types = List.copyOf(types);
        this.functions = List.copyOf(functions);
    }

    public List<Declaration> typeDeclarations(String prefix)
    {
        return this.types().stream()
            .filter(type ->
            {
                if (type instanceof Declaration declaration)
                {
                    if (!prefix.isEmpty())
                    {
                        String packageName = declaration.path().packageName();
                        return packageName.equals(prefix) || packageName.startsWith(prefix + ".");
                    }

                    return true;
                }

                return false;
            })
            .map(Declaration.class::cast)
            .toList();
    }

    public List<Declaration> typeDeclarations()
    {
        return this.typeDeclarations("");
    }

    public static class Builder
    {
        public final List<Type> types = new ArrayList<>();
        public final List<FunctionDeclaration> functions = new ArrayList<>();

        public Builder() {}

        public Builder withType(Type type)
        {
            this.types.add(type);
            return this;
        }

        public Builder withFunction(FunctionDeclaration function)
        {
            this.functions.add(function);
            return this;
        }

        public ParseResults build()
        {
            return new ParseResults(this.types, this.functions);
        }
    }
}

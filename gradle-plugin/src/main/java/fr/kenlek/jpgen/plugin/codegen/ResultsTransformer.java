package fr.kenlek.jpgen.plugin.codegen;

import fr.kenlek.jpgen.generator.ParseResults;

public interface ResultsTransformer
{
    WriteInfo transform(ParseResults results);
}

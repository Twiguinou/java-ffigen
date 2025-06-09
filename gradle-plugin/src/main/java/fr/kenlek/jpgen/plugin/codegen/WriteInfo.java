package fr.kenlek.jpgen.plugin.codegen;

import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.JavaPath;

public record WriteInfo(JavaPath layoutsClass, Iterable<? extends Declaration.Writable> declarations)
{
    public WriteInfo(Iterable<? extends Declaration.Writable> declarations)
    {
        this(JavaPath.EMPTY, declarations);
    }
}

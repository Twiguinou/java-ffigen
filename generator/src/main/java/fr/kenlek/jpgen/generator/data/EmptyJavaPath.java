package fr.kenlek.jpgen.generator.data;

import java.nio.file.Path;

enum EmptyJavaPath implements JavaPath
{
    VALUE;

    @Override
    public JavaPath parent()
    {
        return EMPTY;
    }

    @Override
    public String tail()
    {
        return "";
    }

    @Override
    public Path getFileSystemPath()
    {
        return Path.of("");
    }

    @Override
    public boolean isEmpty()
    {
        return true;
    }

    @Override
    public String toString()
    {
        return "";
    }
}

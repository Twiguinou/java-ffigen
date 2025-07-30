package fr.kenlek.jpgen.generator.data;

import org.jspecify.annotations.NonNull;

import java.nio.file.Path;

record ElementJavaPath(JavaPath parent, String tail) implements JavaPath
{
    @Override
    public Path getFileSystemPath()
    {
        return this.parent.getFileSystemPath().resolve(this.tail);
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public @NonNull String toString()
    {
        if (this.parent().isEmpty())
        {
            return this.tail();
        }

        return this.parent() + "." + this.tail();
    }
}

package fr.kenlek.jpgen.data.path;

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
    public String toString()
    {
        if (this.parent().isEmpty())
        {
            return this.tail();
        }

        return "%s.%s".formatted(this.parent(), this.tail());
    }
}

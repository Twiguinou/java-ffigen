package fr.kenlek.jpgen.api;

import java.nio.file.Path;

public sealed interface LibraryOption permits LibraryOption.FromName, LibraryOption.FromPath
{
    record FromName(String name) implements LibraryOption {}

    record FromPath(Path path) implements LibraryOption {}

    static FromName of(String name)
    {
        return new FromName(name);
    }

    static FromPath of(Path path)
    {
        return new FromPath(path);
    }
}

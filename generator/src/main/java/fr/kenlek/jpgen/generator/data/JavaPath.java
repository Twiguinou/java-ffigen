package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.LanguageUtils;

import java.nio.file.Path;
import java.util.regex.Matcher;

public sealed interface JavaPath permits EmptyJavaPath, ElementJavaPath
{
    JavaPath EMPTY = EmptyJavaPath.VALUE;

    static JavaPath of(JavaPath parent, String name)
    {
        if (name.isEmpty())
        {
            return parent;
        }

        if (!LanguageUtils.isJavaIdentifier(name))
        {
            throw new IllegalArgumentException("Provided Java path is badly formed, name must a valid identifier.");
        }

        return new ElementJavaPath(parent, name);
    }

    static JavaPath of(String path)
    {
        int limit = path.lastIndexOf('.');
        if (limit == -1)
        {
            return of(EMPTY, path);
        }

        if (limit == 0 || limit == path.length() - 1)
        {
            throw new IllegalArgumentException("Can't parse badly formed path.");
        }

        return of(of(path.substring(0, limit)), path.substring(limit + 1));
    }

    JavaPath parent();

    String tail();

    default JavaPath child(String name)
    {
        return of(this, name);
    }

    default String symbolize()
    {
        return this.toString().replaceAll("\\.", Matcher.quoteReplacement("$"));
    }

    Path getFileSystemPath();

    default boolean contains(JavaPath path)
    {
        return path.toString().startsWith(this.toString());
    }

    boolean isEmpty();
}

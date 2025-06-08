package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.PrintingContext;

import java.io.IOException;

public interface Declaration extends DependencyProvider
{
    interface Writable extends Declaration
    {
        default void emitClassPrefix(PrintingContext context) throws IOException
        {
            context.breakLine("/* Automatically generated source file, do not edit! */");
            JavaPath path = this.path();
            if (!path.parent().isEmpty())
            {
                context.breakLine("package %s;", path.parent());
                context.breakLine();
            }
        }

        void write(PrintingContext context, JavaPath layoutsClass) throws IOException;

        default boolean writable()
        {
            return true;
        }
    }

    static JavaPath checkPath(JavaPath path)
    {
        if (path.isEmpty())
        {
            throw new IllegalArgumentException("Declaration path must not be empty.");
        }

        return path;
    }

    JavaPath path();
}

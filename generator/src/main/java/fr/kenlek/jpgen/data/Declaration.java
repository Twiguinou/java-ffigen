package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.features.PrintLayout;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.List;

public interface Declaration extends DependencyProvider
{
    static void checkPath(JavaPath path)
    {
        if (path.isEmpty())
        {
            throw new IllegalArgumentException("Declaration path must not be empty.");
        }
    }

    JavaPath path();

    interface CodeGenerator extends Declaration
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

        void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException;

        boolean printable();
    }

    record Layouts(JavaPath path, List<Type> types) implements Declaration.CodeGenerator
    {
        public Layouts
        {
            checkPath(path);
        }

        @Override
        public List<Type> getDependencies()
        {
            return List.of();
        }

        @Override
        public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
            this.emitClassPrefix(context);

            context.breakLine("public final class %s", this.path().tail());
            context.breakLine("{private %s() {}", this.path().tail()).pushControlFlow();

            context.breakLine();
            PrintLayout printLayout = new PrintLayout(context, PrintLayout.Location.LAYOUTS_CLASS);
            for (Type type : this.types())
            {
                type.print(printLayout);
            }

            context.popControlFlow().breakLine('}');
        }

        @Override
        public boolean printable()
        {
            return true;
        }
    }

    // TODO: replace with stream gatherers when it is released
    static Layouts resolveLayouts(JavaPath path, List<? extends DependencyProvider> baseProviders)
    {
        record TypeWrapper(Type type, String symbolicName)
        {
            TypeWrapper(Type type)
            {
                this(type, type.symbolicName());
            }

            @Override
            public boolean equals(Object obj)
            {
                return obj instanceof TypeWrapper(_, String s) && this.symbolicName().equals(s);
            }

            @Override
            public int hashCode()
            {
                return this.symbolicName().hashCode();
            }
        }

        return new Layouts(path, baseProviders.stream()
            .flatMap(provider -> provider.getDependencies().stream())
            .map(TypeWrapper::new)
            .distinct()
            .map(TypeWrapper::type)
            .toList());
    }
}

package fr.kenlek.jpgen.generator.data2;

import fr.kenlek.jpgen.generator.LanguageUtils;
import fr.kenlek.jpgen.generator.PrintingContext;

import java.io.IOException;
import java.util.List;

public record HeaderDeclaration(JavaPath path, String classAnnotations, List<Constant> constants) implements Declaration.Writable
{
    public record Constant(String type, String name, String value)
    {
        public Constant
        {
            LanguageUtils.requireJavaIdentifier(name);
        }
    }

    @Override
    public void write(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        this.emitClassPrefix(context);

        context.breakLine(this.classAnnotations());
        context.breakLine("public interface %s", this.path().tail());
        context.breakLine('{').pushControlFlow();

        context.popControlFlow().breakLine('}');
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return List.of();
    }
}

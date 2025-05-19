package fr.kenlek.jpgen.plugin;

import fr.kenlek.jpgen.generator.ParseOptions;
import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.SourceScopeScanner;
import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.JavaPath;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.logging.Logger;

public abstract class Generator
{
    public final String name;
    protected final boolean debug;
    private final List<String> systemArgs;

    public Generator(String name, boolean debug, List<String> systemArgs)
    {
        this.name = name;
        this.debug = debug;
        this.systemArgs = systemArgs;
    }

    protected static void writeDeclarations(JavaPath layoutsClass, FileWriterFactory factory,
                                            Declaration.CodeGenerator... declarations) throws IOException
    {
        for (Declaration.CodeGenerator declaration : declarations)
        {
            try (Writer writer = factory.create(declaration.path()))
            {
                declaration.writeSourceFile(new PrintingContext(writer), layoutsClass);
            }
        }
    }

    protected SourceScopeScanner openScanner()
    {
        return new SourceScopeScanner(Logger.getLogger(this.name + " Generator"), this.debug);
    }

    protected ParseOptions.Builder createOptionsBuilder()
    {
        ParseOptions.Builder builder = new ParseOptions.Builder();
        builder.clangArgs.addAll(this.systemArgs);
        return builder;
    }

    public abstract void generate(FileWriterFactory factory) throws IOException;
}

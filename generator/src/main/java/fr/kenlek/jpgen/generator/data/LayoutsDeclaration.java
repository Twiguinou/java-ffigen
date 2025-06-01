package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.HintWriteFeature;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Gatherer;

public class LayoutsDeclaration implements Declaration.Writable
{
    private final JavaPath m_path;
    public final List<? extends Type> types;

    private LayoutsDeclaration(JavaPath path, List<? extends Type> types, boolean copy)
    {
        Declaration.checkPath(path);
        this.m_path = path;
        this.types = copy ? List.copyOf(types) : types;
    }

    public LayoutsDeclaration(JavaPath path, List<? extends Type> types)
    {
        this(path, types, true);
    }

    public static LayoutsDeclaration resolve(JavaPath path, List<? extends DependencyProvider> providers)
    {
        return new LayoutsDeclaration(path, providers.stream()
            .flatMap(provider -> provider.dependencies().stream())
            .gather(Gatherer.<DependencyProvider, Set<String>, Type>ofSequential(HashSet::new, (symbols, provider, downstream) ->
            {
                if (provider instanceof Type type && symbols.add(type.symbolicName()))
                {
                    downstream.push(type);
                }

                return true;
            }))
            .toList(), false);
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public void write(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        this.emitClassPrefix(context);

        context.breakLine("public final class %s", this.path().tail());
        context.breakLine("{private %s() {}", this.path().tail()).pushControlFlow();

        context.breakLine();
        for (Type type : this.types)
        {
            type.apply(HintWriteFeature.PRINT_LAYOUT, context);
        }

        context.popControlFlow().breakLine('}');
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return List.of();
    }
}

package fr.kenlek.jpgen.plugin;

import module java.base;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.JavaFile;
import fr.kenlek.jpgen.generator.*;
import fr.kenlek.jpgen.generator.data.Declaration;
import java.util.Optional;
import javax.inject.Inject;
import org.gradle.api.Action;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.*;
import org.gradle.internal.file.Deleter;
import org.gradle.work.DisableCachingByDefault;

@DisableCachingByDefault(because = "Uncacheable")
public abstract class GenerationTask extends DefaultTask
{
    private ElementFilter m_elementFilter;
    private PathProvider m_pathProvider;
    private TypeResolver m_typeResolver = TypeResolver.DEFAULT;
    protected final List<Action<DeclareSpec>> m_declareSpecActions = new ArrayList<>();
    private ClassName m_layoutsClassName;
    protected final JpgenExtension m_jpgen;

    public GenerationTask()
    {
        this.setGroup("jpgen");

        this.getEnableClangOutput().convention(false);
        this.getClangArguments().convention(List.of());

        this.m_jpgen = (JpgenExtension) this.getProject().getExtensions().getByName("jpgen");
    }

    @Input
    public abstract Property<Boolean> getEnableClangOutput();

    @Input
    public abstract ListProperty<String> getClangArguments();

    @InputFile
    public abstract RegularFileProperty getHeader();

    @Internal
    public ElementFilter getElementFilter()
    {
        return this.m_elementFilter;
    }

    public void setElementFilter(ElementFilter elementFilter)
    {
        this.m_elementFilter = elementFilter;
    }

    @Internal
    public PathProvider getPathProvider()
    {
        return this.m_pathProvider;
    }

    public void setPathProvider(PathProvider pathProvider)
    {
        this.m_pathProvider = pathProvider;
    }

    @Internal
    public TypeResolver getTypeResolver()
    {
        return this.m_typeResolver;
    }

    public void setTypeResolver(TypeResolver typeResolver)
    {
        this.m_typeResolver = typeResolver;
    }

    public GenerationTask process(Action<DeclareSpec> action)
    {
        this.m_declareSpecActions.add(action);
        return this;
    }

    @Internal
    public ClassName getLayoutsClassName()
    {
        return this.m_layoutsClassName;
    }

    public void setLayoutsClassName(ClassName layoutsClassName)
    {
        this.m_layoutsClassName = layoutsClassName;
    }

    @OutputDirectory
    public abstract DirectoryProperty getOutputDirectory();

    @Inject
    protected abstract Deleter getDeleter();

    @TaskAction
    public void generate() throws Throwable
    {
        File outputDirectory = this.getOutputDirectory().getAsFile().get();
        this.getDeleter().ensureEmptyDirectory(outputDirectory);

        Set<Declaration> declarationSet = new HashSet<>();
        try (SourceScopeScanner scanner = new SourceScopeScanner(this.m_jpgen.getLibClang().get(), this.getEnableClangOutput().get()))
        {
            ParseResults results = scanner.parse(this.getHeader().get().getAsFile().toPath(), this.getClangArguments().get(), new ParseOptions(
                this.getElementFilter(), this.getPathProvider(), this.getTypeResolver()
            ));
            DeclareSpec spec = new DeclareSpec()
            {
                @Override
                public ParseResults results()
                {
                    return results;
                }

                @Override
                public List<Declaration> declarations()
                {
                    return List.copyOf(declarationSet);
                }

                @Override
                public DeclareSpec include(Declaration... declarations)
                {
                    declarationSet.addAll(Arrays.asList(declarations));
                    return this;
                }

                @Override
                public DeclareSpec include(Iterable<? extends Declaration> declarations)
                {
                    declarations.forEach(declarationSet::add);
                    return this;
                }
            };

            for (Action<DeclareSpec> action : this.m_declareSpecActions)
            {
                action.execute(spec);
            }
        }

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor())
        {
            List<Future<Void>> futures = executor.invokeAll(declarationSet.stream().map(declaration -> (Callable<Void>) () ->
            {
                Optional<JavaFile> source = declaration.build(GenerationTask.this.getLayoutsClassName());
                if (source.isPresent())
                {
                    this.getLogger().info("Writing source file: {}", declaration.path());
                    source.get().writeTo(outputDirectory);
                }

                return null;
            }).toList());

            boolean failed = false;
            for (Future<Void> future : futures)
            {
                try
                {
                    future.get();
                }
                catch (ExecutionException e)
                {
                    failed = true;
                    this.getLogger().error("Failed to write source file.", e.getCause());
                }
            }

            if (failed)
            {
                throw new RuntimeException("One or multiple errors occured during the output phase.");
            }
        }
    }
}

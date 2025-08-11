package fr.kenlek.jpgen.plugin;

import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.ParseOptions;
import fr.kenlek.jpgen.generator.ParseResults;
import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.SourceScopeScanner;
import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.JavaPath;
import fr.kenlek.jpgen.plugin.codegen.ResultsTransformer;
import fr.kenlek.jpgen.plugin.codegen.WriteInfo;
import javax.inject.Inject;
import org.gradle.api.Action;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.FileSystemOperations;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.jspecify.annotations.NonNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class GenerateBindings extends DefaultTask
{
    private final FileSystemOperations m_fsOperations;
    private final ProviderFactory m_providers;
    private final List<Path> m_writtenFiles = new ArrayList<>();

    @Inject
    public GenerateBindings(ProjectLayout projectLayout, FileSystemOperations fsOperations, ProviderFactory providers)
    {
        this.m_fsOperations = fsOperations;
        this.m_providers = providers;

        this.getDebug().convention(false);
        this.getOutputDirectory().convention(projectLayout.getBuildDirectory().dir("bindings/src"));
        if (this.getProject().getExtensions().getByName(JpgenExtension.NAME) instanceof JpgenExtension jpgen)
        {
            this.getLibClang().convention(jpgen.getLibClang());
        }
        else
        {
            throw new IllegalStateException("Unable to resolve jpgen extension.");
        }
    }

    @Input
    public abstract Property<@NonNull Boolean> getDebug();

    @Internal
    public abstract Property<@NonNull LibClang> getLibClang();

    @Internal
    public abstract Property<@NonNull ParseOptions> getParseOptions();

    public GenerateBindings parseOptions(Action<ParseOptions.@NonNull Builder> action)
    {
        this.getParseOptions().set(this.m_providers.provider(() ->
        {
            ParseOptions.Builder builder = new ParseOptions.Builder();
            action.execute(builder);
            return builder.build();
        }));
        return this;
    }

    @Internal
    public abstract Property<@NonNull ResultsTransformer> getResultsTransformer();

    @OutputDirectory
    public abstract DirectoryProperty getOutputDirectory();

    private FileWriter createFileWriter(JavaPath path) throws IOException
    {
        this.getLogger().lifecycle("Creating file: " + path);

        File file = this.getOutputDirectory().file(path.getFileSystemPath() + ".java").get().getAsFile();
        File parent = file.getParentFile();
        if (parent != null && !parent.exists() && !parent.mkdirs())
        {
            throw new IllegalStateException("Unable to create file parent directories: " + file);
        }

        if (!file.exists() && !file.createNewFile())
        {
            throw new IllegalStateException("Unable to create file for write: " + file);
        }

        this.m_writtenFiles.add(file.toPath());
        return new FileWriter(file);
    }

    @TaskAction
    public void generate()
    {
        this.m_fsOperations.delete(delete -> delete.delete(this.m_writtenFiles));
        this.m_writtenFiles.clear();

        LibClang libClang = this.getLibClang().get();
        Logger logger = Logger.getLogger(this.getName());
        boolean debug = this.getDebug().get();

        try (SourceScopeScanner scanner = new SourceScopeScanner(libClang, logger, debug);
             ParseResults results = scanner.process(this.getParseOptions().get()))
        {
            WriteInfo info = this.getResultsTransformer().get().transform(results);
            for (Declaration.Writable declaration : info.declarations())
            {
                try (FileWriter writer = this.createFileWriter(declaration.path()))
                {
                    declaration.write(new PrintingContext(writer), info.layoutsClass());
                }
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}

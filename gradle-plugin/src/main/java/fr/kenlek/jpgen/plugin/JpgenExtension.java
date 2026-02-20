package fr.kenlek.jpgen.plugin;

import module java.base;

import fr.kenlek.jpgen.api.Platform;
import fr.kenlek.jpgen.clang.LibClang;
import javax.inject.Inject;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.file.*;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.jvm.tasks.Jar;
import org.gradle.process.ExecOperations;

import static java.lang.foreign.SymbolLookup.libraryLookup;

public abstract class JpgenExtension
{
    protected final TaskContainer m_tasks;

    @Inject
    public JpgenExtension(Project project, ExecOperations execOperations)
    {
        ProjectLayout layout = project.getLayout();
        ProviderFactory providers = project.getProviders();
        this.m_tasks = project.getTasks();

        this.getDefaultOutputDirectory().convention(layout.getBuildDirectory().dir("jpgen-output"));

        if (Platform.OS.WINDOWS.isCurrent())
        {
            this.getVsWhere().convention(layout.file(providers.environmentVariable("ProgramFiles(x86)").map(programFiles ->
            {
                Path vsWhere = Path.of(programFiles).resolve("Microsoft Visual Studio/Installer/vswhere.exe");
                return Files.isExecutable(vsWhere) ? vsWhere.toFile() : null;
            })));
            this.getVisualStudio().convention(layout.dir(this.getVsWhere().map(vsWhere ->
            {
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                execOperations.exec(exec ->
                {
                    exec.executable(vsWhere);
                    exec.args("-latest", "-property", "installationPath");
                    exec.setStandardOutput(output);
                });

                return output.toString().lines()
                    .filter(Predicate.not(String::isBlank))
                    .findFirst()
                    .map(Path::of)
                    .filter(Files::isDirectory)
                    .map(Path::toFile)
                    .orElse(null);
            })));
            this.getLibClangLibraryMSVC().convention(this.getVisualStudio().map(vs -> switch (Platform.Architecture.CURRENT)
            {
                case X86_64 -> vs.file("VC/Tools/Llvm/x64/bin/libclang.dll");
                case X86 -> vs.file("VC/Tools/Llvm/bin/libclang.dll");
                case AARCH64 -> vs.file("VC/Tools/Llvm/ARM64/bin/libclang.dll");
                default -> null;
            }));
        }

        this.getLibClang().convention(providers.gradleProperty("jpgen.clang.path")
            .map(Path::of)
            .orElse(this.getLibClangLibraryMSVC().map(lib -> lib.getAsFile().toPath()))
            .map(path -> LibClang.load(libraryLookup(path, Arena.global()))))
            .orElse(project.provider(LibClang::load));
    }

    public abstract DirectoryProperty getDefaultOutputDirectory();

    public abstract RegularFileProperty getVsWhere();

    public abstract DirectoryProperty getVisualStudio();

    public abstract RegularFileProperty getLibClangLibraryMSVC();

    public abstract Property<LibClang> getLibClang();

    public BindingsPipeline createPipeline(String name, Action<BindingsPipeline> action)
    {
        Provider<Directory> defaultDirectory = this.getDefaultOutputDirectory().dir(name);
        TaskProvider<GenerationTask> generation = this.m_tasks.register("generate-" + name + "-bindings", GenerationTask.class, task ->
        {
            task.getOutputDirectory().convention(defaultDirectory.map(dir -> dir.dir("src")));
        });
        TaskProvider<JavaCompile> compilation = this.m_tasks.register("compile-" + name + "-bindings", JavaCompile.class, task ->
        {
            task.dependsOn(generation);

            task.source(generation.map(GenerationTask::getOutputDirectory));
            task.getDestinationDirectory().convention(defaultDirectory.map(dir -> dir.dir("classes")));
        });
        TaskProvider<Jar> pack = this.m_tasks.register("pack-" + name + "-bindings", Jar.class, task ->
        {
            task.dependsOn(compilation);

            task.getDestinationDirectory().set(defaultDirectory);
            task.getArchiveBaseName().set(name);
            task.getArchiveVersion().unset();

            task.from(compilation.map(JavaCompile::getDestinationDirectory), copy -> copy.include("**/*.class"));
        });
        BindingsPipeline pipeline = new BindingsPipeline(generation, compilation, pack);
        action.execute(pipeline);
        return pipeline;
    }

    public BindingsPipeline createPipeline(String name, String group, Action<BindingsPipeline> action)
    {
        return this.createPipeline(name, pipeline ->
        {
            pipeline.generation().configure(task -> task.setGroup(group));
            pipeline.compilation().configure(task -> task.setGroup(group));
            pipeline.pack().configure(task -> task.setGroup(group));
            action.execute(pipeline);
        });
    }
}

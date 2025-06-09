package fr.kenlek.jpgen.plugin;

import javax.inject.Inject;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.FileSystemOperations;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.process.ExecOperations;

import java.util.List;

public abstract class ConfigureNatives extends CMakeTask
{
    private final FileSystemOperations m_fsOperations;

    @Inject
    public ConfigureNatives(ProjectLayout projectLayout, ExecOperations execOperations, FileSystemOperations fsOperations)
    {
        super(projectLayout, execOperations);
        this.m_fsOperations = fsOperations;

        this.getSourceDirectory().convention(projectLayout.getProjectDirectory());
        this.getCMakeArgs().set(List.of(
            "-DCMAKE_BUILD_TYPE=Release", "-DBUILD_SHARED_LIBS=ON"
        ));
        this.getCMakeCache().convention(this.getBuildDirectory().map(directory -> directory.file("CMakeCache.txt")));
    }

    @Internal
    public abstract DirectoryProperty getSourceDirectory();

    @Override @Internal
    public abstract DirectoryProperty getBuildDirectory();

    @OutputFile
    public abstract RegularFileProperty getCMakeCache();

    @Override @Input
    public abstract Property<String> getCMake();

    @Override @Input
    public abstract ListProperty<String> getCMakeArgs();

    @TaskAction
    public void configure()
    {
        this.m_fsOperations.delete(delete -> delete.delete(this.getBuildDirectory()));

        this.m_execOperations.exec(exec ->
        {
            exec.executable(this.getCMake().get());
            exec.args(
                "-S", this.getSourceDirectory().get(),
                "-B", this.getBuildDirectory().get()
            );
            exec.args(this.getCMakeArgs().get());
        });
    }
}

package fr.kenlek.jpgen.plugin;

import javax.inject.Inject;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.TaskAction;
import org.gradle.process.ExecOperations;
import org.gradle.work.DisableCachingByDefault;

import java.util.List;

@DisableCachingByDefault(because = "CMake does the caching work on its own")
public abstract class CompileNatives extends CMakeTask
{
    @Inject
    public CompileNatives(ProjectLayout projectLayout, ExecOperations execOperations)
    {
        super(projectLayout, execOperations);

        this.getCMakeArgs().set(List.of("--config", "Release"));
    }

    @Override @Internal
    public abstract DirectoryProperty getBuildDirectory();

    @Override @Input
    public abstract Property<String> getCMake();

    @Override @Input
    public abstract ListProperty<String> getCMakeArgs();

    @TaskAction
    public void configure()
    {
        this.m_execOperations.exec(exec ->
        {
            exec.executable(this.getCMake().get());
            exec.args("--build", this.getBuildDirectory().get());
            exec.args(this.getCMakeArgs().get());
        });
    }
}

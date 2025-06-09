package fr.kenlek.jpgen.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.provider.Property;
import org.gradle.process.ExecOperations;

import java.util.List;

public abstract class CMakeTask extends DefaultTask
{
    protected final ExecOperations m_execOperations;

    protected CMakeTask(ProjectLayout projectLayout, ExecOperations execOperations)
    {
        this.m_execOperations = execOperations;

        this.getBuildDirectory().convention(projectLayout.getBuildDirectory().dir("cmake"));
        this.getCMakeArgs().convention(List.of());
        if (this.getProject().getExtensions().getByName("jpgen") instanceof JpgenExtension jpgen)
        {
            this.getCMake().convention(jpgen.getCMake());
        }
        else
        {
            throw new IllegalStateException("Unable to find jpgen extension.");
        }
    }

    public abstract DirectoryProperty getBuildDirectory();

    public abstract Property<String> getCMake();

    public abstract ListProperty<String> getCMakeArgs();
}

package fr.kenlek.jpgen.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JpgenPlugin implements Plugin<Project>
{
    public JpgenPlugin() {}

    @Override
    public void apply(Project project)
    {
        project.getExtensions().create("jpgen", JpgenExtension.class);
    }
}

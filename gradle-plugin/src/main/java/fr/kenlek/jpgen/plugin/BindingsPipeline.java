package fr.kenlek.jpgen.plugin;

import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.jvm.tasks.Jar;

public record BindingsPipeline(
    TaskProvider<GenerationTask> generation, TaskProvider<JavaCompile> compilation, TaskProvider<Jar> pack
) {}

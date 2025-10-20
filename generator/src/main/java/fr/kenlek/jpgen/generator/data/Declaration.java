package fr.kenlek.jpgen.generator.data;

import module com.palantir.javapoet;

import java.util.Optional;

public interface Declaration extends DependencyProvider
{
    ClassName path();

    default String symbolicName()
    {
        return this.path().reflectionName().replace('.', '_');
    }

    default Optional<CodeBlock> javadoc()
    {
        return Optional.empty();
    }

    default Optional<TypeSpec> define(ClassName layouts)
    {
        return Optional.empty();
    }

    default Optional<JavaFile> build(ClassName layouts)
    {
        return this.define(layouts).map(type -> JavaFile.builder(this.path().packageName(), type).build());
    }
}

package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeSpec;

import java.util.Optional;

public interface Declaration extends DependencyProvider
{
    ClassName path();

    default String symbolicName()
    {
        return this.path().reflectionName().replace('.', '_');
    }

    Optional<CodeBlock> javadoc();

    default Optional<TypeSpec> define(ClassName layouts)
    {
        return Optional.empty();
    }
}

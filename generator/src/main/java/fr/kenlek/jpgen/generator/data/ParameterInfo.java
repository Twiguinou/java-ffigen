package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.CodeBlock;
import java.util.Optional;

public record ParameterInfo(Optional<CodeBlock> javadoc, Optional<String> name)
{
    public ParameterInfo(Optional<String> name)
    {
        this(Optional.empty(), name);
    }
}

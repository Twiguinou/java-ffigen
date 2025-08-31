package fr.kenlek.jpgen.generator.data.features;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;

public record GetPhysicalLayout(ClassName layouts) implements TypeFeature<CodeBlock>
{
    @Override
    public CodeBlock check(Object result)
    {
        return (CodeBlock) result;
    }
}

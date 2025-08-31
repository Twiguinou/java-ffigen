package fr.kenlek.jpgen.generator.data.features;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.TypeName;

public record GetType(Target target, ClassName layouts) implements TypeFeature<TypeName>
{
    public enum Target
    {
        CALLBACK_RETURN,
        CALLBACK_PARAMETER,
        HEADER_RETURN,
        HEADER_PARAMETER
    }

    @Override
    public TypeName check(Object result)
    {
        return (TypeName) result;
    }
}

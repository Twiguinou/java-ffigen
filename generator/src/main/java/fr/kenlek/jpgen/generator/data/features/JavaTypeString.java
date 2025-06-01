package fr.kenlek.jpgen.generator.data.features;

import fr.kenlek.jpgen.generator.data.JavaPath;

public record JavaTypeString(Target target, JavaPath layoutsClass) implements TypeFeature<String>
{
    public enum Target
    {
        ENUM_CONSTANT_TYPE,
        CALLBACK_RETURN,
        CALLBACK_PARAMETER,
        HEADER_RETURN,
        HEADER_PARAMETER
    }
}

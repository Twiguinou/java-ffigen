package fr.kenlek.jpgen.generator.data.features;

import static fr.kenlek.jpgen.generator.LanguageUtils.requireJavaIdentifier;

public enum GetSymbolicName implements TypeFeature<String>
{
    VALUE;

    @Override
    public String check(Object result)
    {
        return requireJavaIdentifier((String) result);
    }
}

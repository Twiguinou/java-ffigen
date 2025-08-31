package fr.kenlek.jpgen.generator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static fr.kenlek.jpgen.generator.LanguageUtils.isJavaIdentifier;

/// This class is just a fancy wrapper over a Set structure to resolve name conflicts inside data types.
public class NameResolver
{
    private final Set<String> m_names = new HashSet<>();

    public NameResolver() {}

    protected String transform(String name)
    {
        return "_" + name;
    }

    public String resolve(String name)
    {
        while (true)
        {
            if (isJavaIdentifier(name) && this.m_names.add(name))
            {
                return name;
            }

            name = this.transform(name);
        }
    }

    public void register(String... names)
    {
        this.m_names.addAll(Arrays.asList(names));
    }
}

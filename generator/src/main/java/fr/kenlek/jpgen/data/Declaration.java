package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;

import java.util.List;
import java.util.regex.Matcher;

public interface Declaration extends DependencyProvider
{
    record JavaPath(String parent, String name)
    {
        public JavaPath
        {
            if (parent.isEmpty())
            {
                if (!name.isEmpty() && !LanguageUtils.isJavaIdentifier(name))
                {
                    throw new IllegalArgumentException("Provided Java path is badly formed, name should be empty or a valid identifier.");
                }
            }
            else if (!LanguageUtils.isJavaPath(parent) || !LanguageUtils.isJavaIdentifier(name))
            {
                throw new IllegalArgumentException("Provided java path is badly formed, parent should be a valid path and name a valid identifier.");
            }
        }

        public JavaPath(String name)
        {
            this("", name);
        }

        public JavaPath child(String name)
        {
            return new JavaPath(this.toString(), name);
        }

        public String symbolize()
        {
            return String.format("%s", this.toString().replaceAll("\\.", Matcher.quoteReplacement("$")));
        }

        public boolean contains(JavaPath path)
        {
            return path.toString().startsWith(this.toString());
        }

        public boolean isEmpty()
        {
            return this.equals(EMPTY_PATH);
        }

        @Override
        public String toString()
        {
            if (this.parent.isEmpty())
            {
                return this.name;
            }

            return String.format("%s.%s", this.parent, this.name);
        }
    }

    JavaPath EMPTY_PATH = new JavaPath("", "");

    JavaPath path();

    record Layouts(JavaPath path, List<Type> types) implements Declaration
    {
        @Override
        public List<Type> getDependencies()
        {
            return List.of();
        }
    }

    // TODO: replace with stream gatherers when it is released
    static Layouts resolveLayouts(JavaPath path, List<? extends DependencyProvider> baseProviders)
    {
        record FuzzyEqualType(Type type, int hashcode)
        {
            FuzzyEqualType(Type type)
            {
                this(type, type.getSymbolicName().hashCode());
            }

            @Override
            public boolean equals(Object obj)
            {
                return obj instanceof FuzzyEqualType(Type t, _) && this.type.fuzzyEquals(t);
            }

            @Override
            public int hashCode()
            {
                return this.hashcode;
            }
        }

        return new Layouts(path, baseProviders.stream()
                .flatMap(provider -> provider.getDependencies().stream())
                .map(FuzzyEqualType::new)
                .distinct()
                .map(FuzzyEqualType::type)
                .toList());
    }
}

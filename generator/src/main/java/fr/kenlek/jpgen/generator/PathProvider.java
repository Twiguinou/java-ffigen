package fr.kenlek.jpgen.generator;

import module fr.kenlek.jpgen.clang;
import module java.base;

import com.palantir.javapoet.ClassName;

@FunctionalInterface
public interface PathProvider
{
    PathProvider TOP_LEVEL = of("");

    static PathProvider of(String packageName)
    {
        return (clang, cursor) ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                return clang.retrieveString(clang.getCursorSpelling(arena, cursor))
                    .filter(Predicate.not(String::isEmpty))
                    .map(name -> ClassName.get(packageName, name));
            }
        };
    }

    static PathProvider filter(PathProvider provider, ElementFilter filter)
    {
        return (clang, cursor) -> filter.test(clang, cursor) ? provider.get(clang, cursor) : Optional.empty();
    }

    Optional<ClassName> get(LibClang clang, CXCursor cursor);

    default PathProvider or(PathProvider provider)
    {
        return (clang, cursor) -> this.get(clang, cursor).or(() -> provider.get(clang, cursor));
    }

    default PathProvider filter(ElementFilter filter)
    {
        return filter(this, filter);
    }
}

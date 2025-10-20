package fr.kenlek.jpgen.generator;

import module java.base;

import com.palantir.javapoet.ClassName;
import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.LibClang;

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

    Optional<ClassName> get(LibClang clang, CXCursor cursor);

    default PathProvider or(PathProvider provider)
    {
        return (clang, cursor) -> this.get(clang, cursor).or(() -> provider.get(clang, cursor));
    }

    default PathProvider filter(ElementFilter filter)
    {
        return (clang, cursor) -> filter.test(clang, cursor) ? this.get(clang, cursor) : Optional.empty();
    }
}

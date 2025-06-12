package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.LibClang;

import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface ElementFilter
{
    ElementFilter ALL_PARSE = of(_ -> true, (_, _) -> true);
    ElementFilter SYSTEM_HEADERS = of(_ -> true, (libClang, cursor) ->
    {
        try (Arena arena = Arena.ofConfined())
        {
            return libClang.Location_isInSystemHeader(libClang.getCursorLocation(arena, cursor));
        }
    });

    static ElementFilter of(Predicate<Path> pathPredicate, BiPredicate<LibClang, CXCursor> cursorPredicate)
    {
        return new ElementFilter()
        {
            @Override
            public boolean test(Path path)
            {
                return pathPredicate.test(path);
            }

            @Override
            public boolean test(LibClang libClang, CXCursor cursor)
            {
                return cursorPredicate.test(libClang, cursor);
            }
        };
    }

    static ElementFilter ofConfined(List<Path> paths)
    {
        List<Path> resolvedPaths = paths.stream().map(SourceScopeScanner::resolvePath).toList();
        return path -> resolvedPaths.stream().anyMatch(path::startsWith);
    }

    static ElementFilter ofConfined(Path... paths)
    {
        return ofConfined(Arrays.asList(paths));
    }

    boolean test(Path path);

    default boolean test(LibClang libClang, CXCursor cursor)
    {
        return libClang.getCursorFilePath(cursor).filter(this::test).isPresent();
    }

    default ElementFilter or(ElementFilter filter)
    {
        return of(path -> this.test(path) || filter.test(path), (libClang, cursor) -> this.test(libClang, cursor) || filter.test(libClang, cursor));
    }
}

package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.Index_h;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public interface ElementFilter
{
    ElementFilter ALL_PARSE = of(_ -> true, _ -> true);

    static ElementFilter of(Predicate<Path> pathFilter, Predicate<CXCursor> cursorFilter)
    {
        return new ElementFilter()
        {
            @Override
            public boolean test(Path path)
            {
                return pathFilter.test(path);
            }

            @Override
            public boolean test(Index_h indexH, CXCursor cursor)
            {
                return cursorFilter.test(cursor);
            }
        };
    }

    static ElementFilter ofConfined(Path... paths)
    {
        List<Path> resolvedPaths = Arrays.stream(paths).map(SourceScopeScanner::resolvePath).toList();
        return new ElementFilter()
        {
            @Override
            public boolean test(Path path)
            {
                return resolvedPaths.stream().anyMatch(path::startsWith);
            }

            @Override
            public boolean test(Index_h indexH, CXCursor cursor)
            {
                return indexH.getCursorFilePath(cursor).filter(this::test).isPresent();
            }
        };
    }

    boolean test(Path path);

    boolean test(Index_h indexH, CXCursor cursor);
}

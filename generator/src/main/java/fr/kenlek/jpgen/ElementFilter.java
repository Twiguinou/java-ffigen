package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;

import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.Arrays;
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
            public boolean test(CXCursor cursor)
            {
                return cursorFilter.test(cursor);
            }
        };
    }

    static ElementFilter ofConfined(Path... paths)
    {
        return new ElementFilter()
        {
            @Override
            public boolean test(Path path)
            {
                return Arrays.stream(paths).anyMatch(path::startsWith);
            }

            @Override
            public boolean test(CXCursor cursor)
            {
                try (Arena arena = Arena.ofConfined())
                {
                    return ClangUtils.getCursorFilePath(arena, cursor).filter(this::test).isPresent();
                }
            }
        };
    }

    boolean test(Path path);

    boolean test(CXCursor cursor);
}

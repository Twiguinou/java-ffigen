package fr.kenlek.jpgen.generator;

import module fr.kenlek.jpgen.clang;
import module java.base;

import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;

@FunctionalInterface
public interface ElementFilter
{
    ElementFilter TRUE = (_, _) -> true;
    ElementFilter SYSTEM_HEADERS = (clang, cursor) ->
    {
        try (Arena arena = Arena.ofConfined())
        {
            return clang.Location_isInSystemHeader(clang.getCursorLocation(arena, cursor));
        }
    };

    static ElementFilter of(Predicate<Path> pathPredicate)
    {
        return (clang, cursor) ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                MemorySegment pFile = arena.allocate(ADDRESS);
                clang.getFileLocation(clang.getCursorLocation(arena, cursor), pFile, NULL, NULL, NULL);
                return clang.retrieveString(clang.getFileName(arena, pFile.get(ADDRESS, 0)))
                    .map(filepath -> pathPredicate.test(Path.of(filepath)))
                    .orElse(false);
            }
        };
    }

    static ElementFilter of(Path path)
    {
        return of(Predicate.isEqual(path));
    }

    static ElementFilter ofPrefix(Path pathPrefix)
    {
        return of(path -> path.startsWith(pathPrefix));
    }

    boolean test(LibClang clang, CXCursor cursor);

    default ElementFilter and(ElementFilter filter)
    {
        return (clang, cursor) -> this.test(clang, cursor) && filter.test(clang, cursor);
    }

    default ElementFilter or(ElementFilter filter)
    {
        return (clang, cursor) -> this.test(clang, cursor) || filter.test(clang, cursor);
    }

    default ElementFilter invert()
    {
        return (clang, cursor) -> !this.test(clang, cursor);
    }
}

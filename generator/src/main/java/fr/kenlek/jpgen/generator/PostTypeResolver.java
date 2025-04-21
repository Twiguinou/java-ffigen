package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.Index_h;
import fr.kenlek.jpgen.generator.data.Type;

import java.util.function.Function;

public interface PostTypeResolver
{
    PostTypeResolver DUMMY = (_, _, resolved, _, _) -> resolved;

    Type resolveType(Index_h indexH, CXType clangType, Type resolved, ParseOptions options, Function<CXType, Type> nativeResolve);

    default PostTypeResolver and(PostTypeResolver other)
    {
        return (indexH, clangType, resolved, options, nativeResolve) ->
            other.resolveType(indexH, clangType, this.resolveType(indexH, clangType, resolved, options, nativeResolve), options, nativeResolve);
    }
}

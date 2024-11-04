package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.Type;

import java.util.function.Function;

public interface PostTypeResolver
{
    PostTypeResolver DUMMY = (_, resolved, _, _) -> resolved;

    Type resolveType(CXType clangType, Type resolved, ParseOptions.Hints hints, Function<CXType, Type> nativeResolve);

    default PostTypeResolver and(PostTypeResolver other)
    {
        return (clangType, resolved, hints, nativeResolve) ->
                other.resolveType(clangType, this.resolveType(clangType, resolved, hints, nativeResolve), hints, nativeResolve);
    }
}

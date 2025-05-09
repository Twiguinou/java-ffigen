package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.data.Type;

import java.util.function.Function;

public interface PostTypeResolver
{
    PostTypeResolver DUMMY = (_, _, resolved, _, _) -> resolved;

    Type resolveType(LibClang libClang, CXType clangType, Type resolved, ParseOptions options, Function<CXType, Type> nativeResolve);

    default PostTypeResolver and(PostTypeResolver other)
    {
        return (libClang, clangType, resolved, options, nativeResolve) ->
            other.resolveType(libClang, clangType, this.resolveType(libClang, clangType, resolved, options, nativeResolve), options, nativeResolve);
    }
}

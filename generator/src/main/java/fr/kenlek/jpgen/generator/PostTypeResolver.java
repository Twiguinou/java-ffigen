package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.generator.data.Type;

import java.util.function.Function;

public interface PostTypeResolver
{
    PostTypeResolver DUMMY = (_, resolved, _, _) -> resolved;

    Type resolveType(CXType clangType, Type resolved, ParseOptions options, Function<CXType, Type> nativeResolve);

    default PostTypeResolver and(PostTypeResolver other)
    {
        return (clangType, resolved, options, nativeResolve) -> other.resolveType(clangType, this.resolveType(clangType, resolved, options, nativeResolve), options, nativeResolve);
    }
}

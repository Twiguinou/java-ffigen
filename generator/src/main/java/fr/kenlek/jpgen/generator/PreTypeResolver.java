package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.Index_h;
import fr.kenlek.jpgen.generator.data.Type;

import java.util.Optional;
import java.util.function.Function;

public interface PreTypeResolver
{
    PreTypeResolver DUMMY = (_, _, _, _) -> Optional.empty();

    Optional<Type> resolveType(Index_h indexH, CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve);

    default PreTypeResolver or(PreTypeResolver other)
    {
        return (indexH, clangType, options, nativeResolve) -> this.resolveType(indexH, clangType, options, nativeResolve)
            .or(() -> other.resolveType(indexH, clangType, options, nativeResolve));
    }
}

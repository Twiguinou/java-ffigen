package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.generator.data.Type;

import java.util.Optional;
import java.util.function.Function;

public interface PreTypeResolver
{
    PreTypeResolver DUMMY = (_, _, _) -> Optional.empty();

    Optional<Type> resolveType(CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve);

    default PreTypeResolver or(PreTypeResolver other)
    {
        return (clangType, options, nativeResolve) -> this.resolveType(clangType, options, nativeResolve)
            .or(() -> other.resolveType(clangType, options, nativeResolve));
    }
}

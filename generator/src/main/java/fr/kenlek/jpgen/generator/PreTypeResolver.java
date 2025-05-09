package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.data.Type;

import java.util.Optional;
import java.util.function.Function;

public interface PreTypeResolver
{
    PreTypeResolver DUMMY = (_, _, _, _) -> Optional.empty();

    Optional<Type> resolveType(LibClang libClang, CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve);

    default PreTypeResolver or(PreTypeResolver other)
    {
        return (libClang, clangType, options, nativeResolve) -> this.resolveType(libClang, clangType, options, nativeResolve)
            .or(() -> other.resolveType(libClang, clangType, options, nativeResolve));
    }
}

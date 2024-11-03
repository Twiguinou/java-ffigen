package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.Type;

import java.util.Optional;
import java.util.function.Function;

public interface PreTypeResolver
{
    PreTypeResolver DUMMY = (_, _, _) -> Optional.empty();

    Optional<Type> resolveType(CXType clangType, ParseOptions.Hints hints, Function<CXType, Type> nativeResolve);
}

package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.Type;

import java.util.Optional;

public interface TypeResolver
{
    TypeResolver DUMMY = new TypeResolver() {};

    default Optional<Type> resolveType(CXType clangType)
    {
        return Optional.empty();
    }

    default Type resolveType(CXType clangType, Type resolved)
    {
        return resolved;
    }
}

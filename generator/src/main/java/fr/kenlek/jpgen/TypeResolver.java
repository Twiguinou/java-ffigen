package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.Type;

import java.util.Optional;

public interface TypeResolver
{
    TypeResolver DUMMY = new TypeResolver()
    {
        @Override
        public Optional<Type> resolveType(CXType clangType)
        {
            return Optional.empty();
        }

        @Override
        public Type resolveType(CXType clangType, Type resolved)
        {
            return resolved;
        }
    };

    Optional<Type> resolveType(CXType clangType);

    Type resolveType(CXType clangType, Type resolved);
}

package fr.kenlek.jpgen.api.dynload;

import module java.base;

@FunctionalInterface
public interface PairwiseFilter
{
    enum Location
    {
        RESULT,
        PARAMETER
    }

    Optional<MethodHandle> get(Class<?> source, Class<?> target, Location location);
}

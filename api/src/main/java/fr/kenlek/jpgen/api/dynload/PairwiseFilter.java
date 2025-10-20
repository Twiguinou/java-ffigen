package fr.kenlek.jpgen.api.dynload;

import java.lang.invoke.MethodHandle;
import java.util.Optional;

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

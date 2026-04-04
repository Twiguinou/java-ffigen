package fr.kenlek.jpgen.api.dynload;

import module java.base;

/// A pairwise filter is a simple transformation which applies from parameter to parameter,
/// and from return type to return type.
/// @see DowncallTransformer#pairwiseTransformer
/// @see UpcallTransformer#pairwiseTransformer
@FunctionalInterface
public interface PairwiseFilter
{
    enum Location
    {
        RESULT,
        PARAMETER
    }

    /// Optionally apply a transformation given the source and target types, and the location.
    /// Transformations are not required to comply with the final type.
    /// - In downcalls, this means the returned [MethodHandle] must take one parameter, that is
    /// the `source` type, and return anything.
    /// - In upcalls, the method handle this time must take the `target` type and return anything.
    /// @param source The source type, from which to transform. For both downcalls and upcalls,
    /// this is the type from the Java side.
    /// @param target The target type. For both downcalls and upcalls, this is the type from
    /// the native side.
    /// @param location The place at which the transformation takes place, that is the return type
    /// or any parameter.
    /// @return A method handle with the transformation, or nothing.
    Optional<MethodHandle> get(Class<?> source, Class<?> target, Location location);
}

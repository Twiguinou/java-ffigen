package fr.kenlek.jpgen.api.dynload;

import fr.kenlek.jpgen.api.Addressable;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.*;
import static java.lang.invoke.MethodType.methodType;

/// This functional interface is responsible for transforming method handles produced by
/// [downcall dispatchers][DowncallDispatcher].
/// @see DowncallDispatcher#compose(DowncallTransformer)
@FunctionalInterface
public interface DowncallTransformer
{
    /// An explicit cast transformer which adapts the produced method handle to directly match the expected
    /// method type
    /// @see MethodHandles#explicitCastArguments(MethodHandle, MethodType)
    DowncallTransformer EXPLICIT_CAST_TRANSFORMER = (method, handle) ->
        MethodHandles.explicitCastArguments(handle, methodType(method.getReturnType(), method.getParameterTypes()));
    /// A transformer that either wraps or unwraps [Addressable] compatible types.
    /// - For a parameter which type is assignable from [Addressable], it is unwrapped by calling [Addressable#pointer()].
    /// - If the return type is assignable from [Addressable], the method handle's result (a [java.lang.foreign.MemorySegment])
    /// is wrapped into its container class. The wrapper function must be a constructor of the provided type.
    ///
    /// This transformer only seeks publicly visible fields and methods.
    /// @see DowncallTransformer#groupTransformer(MethodHandles.Lookup)
    DowncallTransformer PUBLIC_GROUP_TRANSFORMER = groupTransformer(MethodHandles.publicLookup());

    /// The equivalent of [DowncallTransformer#PUBLIC_GROUP_TRANSFORMER] adapted to the given lookup.
    /// @param lookup The lookup to use when searching for wrapping and unwrapping related functions.
    /// @return A transformer following said behavior.
    static DowncallTransformer groupTransformer(MethodHandles.Lookup lookup)
    {
        return (method, handle) ->
        {
            if (Addressable.class.isAssignableFrom(method.getReturnType()))
            {
                handle = MethodHandles.filterReturnValue(handle, findGroupWrapper(lookup, method.getReturnType()));
            }

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++)
            {
                if (!Addressable.class.isAssignableFrom(parameterTypes[i]))
                {
                    continue;
                }

                handle = MethodHandles.filterArguments(handle, i, findGroupUnwrapper(lookup, parameterTypes[i]));
            }

            return handle;
        };
    }

    /// Filters a transformer by checking the method first onto a [MethodMatcher].
    /// @param matcher The matcher responsible for validating methods before transforming them.
    /// @param transformer The transformer to use if the method passes the filter.
    /// @return A new transformer with a filtering step.
    static DowncallTransformer matching(MethodMatcher matcher, DowncallTransformer transformer)
    {
        return (method, handle) ->
        {
            MethodHandle nh = handle;
            if (matcher.matches(method))
            {
                nh = transformer.transform(method, nh);
            }

            return nh;
        };
    }

    /// Applies a transformation to the given method handle.
    /// @param method The method used for reference when the prototype handle was produced.
    /// @param handle The method handle to transform.
    /// @return Any method handle.
    MethodHandle transform(Method method, MethodHandle handle);

    /// Composes transformations of this transformer followed by the given one.
    /// Works just like [java.util.function.Function#andThen(java.util.function.Function)].
    /// @param transformer The transformer to apply after this.
    /// @return The composed downcall transformer.
    default DowncallTransformer and(DowncallTransformer transformer)
    {
        return (method, handle) -> transformer.transform(method, this.transform(method, handle));
    }
}

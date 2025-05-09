package fr.kenlek.jpgen.api.dynload;

import fr.kenlek.jpgen.api.Addressable;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;

import static java.lang.invoke.MethodType.methodType;

public interface DowncallTransformer
{
    Map<Class<?>, WeakReference<MethodHandle>> WRAPPER_CACHE = new WeakHashMap<>();
    Map<Class<?>, WeakReference<MethodHandle>> UNWRAPPER_CACHE = new WeakHashMap<>();

    private static MethodHandle findGroupWrapper(MethodHandles.Lookup lookup, Class<?> clazz)
    {
        return Optional.ofNullable(WRAPPER_CACHE.get(clazz))
            .map(reference -> Optional.ofNullable(reference.get()))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .orElseGet(() ->
            {
                try
                {
                    MethodHandle handle = lookup.findConstructor(clazz, methodType(void.class, MemorySegment.class));
                    WRAPPER_CACHE.put(clazz, new WeakReference<>(handle));
                    return handle;
                }
                catch (NoSuchMethodException e)
                {
                    throw new RuntimeException("Unable to find a wrapping constructor for: ".concat(clazz.getName()));
                }
                catch (IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }
            });
    }

    private static MethodHandle findGroupUnwrapper(MethodHandles.Lookup lookup, Class<?> clazz)
    {
        return Optional.ofNullable(UNWRAPPER_CACHE.get(clazz))
            .map(reference -> Optional.ofNullable(reference.get()))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .orElseGet(() ->
            {
                try
                {
                    MethodHandle handle = lookup.findVirtual(clazz, "pointer", methodType(MemorySegment.class));
                    UNWRAPPER_CACHE.put(clazz, new WeakReference<>(handle));
                    return handle;
                }
                catch (NoSuchMethodException | IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }
            });
    }

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

    static DowncallTransformer groupTransformer()
    {
        return groupTransformer(MethodHandles.publicLookup());
    }

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

    MethodHandle transform(Method method, MethodHandle handle);

    default DowncallTransformer and(DowncallTransformer transformer)
    {
        return (method, handle) -> transformer.transform(method, this.transform(method, handle));
    }
}

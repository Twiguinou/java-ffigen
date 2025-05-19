package fr.kenlek.jpgen.api.dynload;

import fr.kenlek.jpgen.api.Addressable;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.*;
import static java.lang.invoke.MethodType.methodType;

public interface DowncallTransformer
{
    DowncallTransformer EXPLICIT_CAST_TRANSFORMER = (method, handle) ->
        MethodHandles.explicitCastArguments(handle, methodType(method.getReturnType(), method.getParameterTypes()));
    DowncallTransformer PUBLIC_GROUP_TRANSFORMER = groupTransformer(MethodHandles.publicLookup());

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

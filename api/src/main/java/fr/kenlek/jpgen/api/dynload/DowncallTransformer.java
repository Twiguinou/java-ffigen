package fr.kenlek.jpgen.api.dynload;

import module java.base;

import fr.kenlek.jpgen.api.Addressable;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.*;
import static java.lang.invoke.MethodHandles.*;

@FunctionalInterface
public interface DowncallTransformer
{
    DowncallTransformer IDENTITY = (_, handle) -> handle;
    DowncallTransformer PUBLIC_GROUP_TRANSFORMER = groupTransformer(publicLookup());
    DowncallTransformer BOOL32_TRANSFORMER = pairwiseTransformer((source, target, location) ->
    {
        if (source.equals(int.class) && target.equals(boolean.class))
        {
            return Optional.of(switch (location)
            {
                case RESULT -> INT_TO_BOOLEAN;
                case PARAMETER -> BOOLEAN_TO_INT;
            });
        }

        return Optional.empty();
    });

    static DowncallTransformer pairwiseTransformer(PairwiseFilter filter)
    {
        return (method, handle) ->
        {
            MethodType type = handle.type();
            Optional<MethodHandle> filterQuery;

            filterQuery = filter.get(type.returnType(), method.getReturnType(), PairwiseFilter.Location.RESULT);
            if (filterQuery.isPresent())
            {
                handle = filterReturnValue(handle, filterQuery.orElseThrow());
            }

            if (method.getParameterCount() == type.parameterCount())
            {
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < type.parameterCount(); i++)
                {
                    filterQuery = filter.get(type.parameterType(i), parameterTypes[i], PairwiseFilter.Location.PARAMETER);
                    if (filterQuery.isPresent())
                    {
                        handle = filterArguments(handle, i, filterQuery.orElseThrow());
                    }
                }
            }

            return handle;
        };
    }

    static DowncallTransformer groupTransformer(MethodHandles.Lookup lookup)
    {
        return pairwiseTransformer((source, target, location) ->
        {
            if (source.equals(MemorySegment.class) && Addressable.class.isAssignableFrom(target))
            {
                return Optional.of(switch (location)
                {
                    case RESULT -> findGroupWrapper(lookup, target);
                    case PARAMETER -> findGroupUnwrapper(lookup, target);
                });
            }

            return Optional.empty();
        });
    }

    static DowncallTransformer filter(DowncallTransformer transformer, MethodMatcher matcher)
    {
        return (method, handle) -> matcher.matches(method) ? transformer.transform(method, handle) : handle;
    }

    MethodHandle transform(Method method, MethodHandle handle);

    default DowncallTransformer and(DowncallTransformer transformer)
    {
        return (method, handle) -> transformer.transform(method, this.transform(method, handle));
    }

    default DowncallTransformer compose(DowncallTransformer transformer)
    {
        return transformer.and(this);
    }

    default DowncallTransformer filter(MethodMatcher matcher)
    {
        return filter(this, matcher);
    }
}

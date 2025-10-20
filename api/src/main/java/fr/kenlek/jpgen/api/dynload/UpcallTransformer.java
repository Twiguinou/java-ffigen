package fr.kenlek.jpgen.api.dynload;

import module java.base;

import fr.kenlek.jpgen.api.Addressable;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.*;
import static java.lang.invoke.MethodHandles.*;

@FunctionalInterface
public interface UpcallTransformer
{
    UpcallTransformer IDENTITY = (_, _, handle) -> handle;
    UpcallTransformer PUBLIC_GROUP_TRANSFORMER = groupTransformer(publicLookup());
    UpcallTransformer BOOL32_TRANSFORMER = pairwiseTransformer((source, target, location) ->
    {
        if (source.equals(boolean.class) && target.equals(int.class))
        {
            return Optional.of(switch (location)
            {
                case RESULT -> BOOLEAN_TO_INT;
                case PARAMETER -> INT_TO_BOOLEAN;
            });
        }

        return Optional.empty();
    });

    static UpcallTransformer pairwiseTransformer(PairwiseFilter filter)
    {
        return (_, target, handle) ->
        {
            MethodType type = handle.type();
            Optional<MethodHandle> filterQuery;

            filterQuery = filter.get(type.returnType(), target.returnType(), PairwiseFilter.Location.RESULT);
            if (filterQuery.isPresent())
            {
                handle = filterReturnValue(handle, filterQuery.orElseThrow());
            }

            if (target.parameterCount() == type.parameterCount())
            {
                for (int i = 0; i < type.parameterCount(); i++)
                {
                    filterQuery = filter.get(type.parameterType(i), target.parameterType(i), PairwiseFilter.Location.PARAMETER);
                    if (filterQuery.isPresent())
                    {
                        handle = filterArguments(handle, i, filterQuery.orElseThrow());
                    }
                }
            }

            return handle;
        };
    }

    static UpcallTransformer groupTransformer(MethodHandles.Lookup lookup)
    {
        return pairwiseTransformer((source, target, location) ->
        {
            if (Addressable.class.isAssignableFrom(source) && target.equals(MemorySegment.class))
            {
                return Optional.of(switch (location)
                {
                    case RESULT -> findGroupUnwrapper(lookup, source);
                    case PARAMETER -> findGroupWrapper(lookup, source);
                });
            }

            return Optional.empty();
        });
    }

    static UpcallTransformer filter(UpcallTransformer transformer, MethodMatcher matcher)
    {
        return (method, target, handle) -> matcher.matches(method) ? transformer.transform(method, target, handle) : handle;
    }

    MethodHandle transform(Method method, MethodType target, MethodHandle handle);

    default UpcallTransformer and(UpcallTransformer transformer)
    {
        return (method, target, handle) -> transformer.transform(method, target, this.transform(method, target, handle));
    }

    default UpcallTransformer compose(UpcallTransformer transformer)
    {
        return transformer.and(this);
    }

    default UpcallTransformer filter(MethodMatcher matcher)
    {
        return filter(this, matcher);
    }
}

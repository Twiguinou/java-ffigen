package fr.kenlek.jpgen.api.dynload;

import module java.base;

import fr.kenlek.jpgen.api.Addressable;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.*;
import static java.lang.invoke.MethodHandles.publicLookup;
import static java.lang.invoke.MethodType.methodType;
import static java.nio.charset.StandardCharsets.UTF_8;

/// The same as [DowncallTransformer], this time for upcalls.
@FunctionalInterface
public interface UpcallTransformer
{
    /// @see DowncallTransformer#IDENTITY;
    UpcallTransformer IDENTITY = (_, _, handle) -> handle;
    /// @see DowncallTransformer#PUBLIC_GROUP_TRANSFORMER
    UpcallTransformer PUBLIC_GROUP_TRANSFORMER = groupTransformer(publicLookup());
    /// @see DowncallTransformer#BOOL32_TRANSFORMER
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
    /// @see DowncallTransformer#UTF8_STRING_TRANSFORMER
    UpcallTransformer UTF8_STRING_TRANSFORMER = stringTransformer(UTF_8);

    /// The FFM API prohibits upcalls to throw exceptions. Throwing an exception, whatever the kind, inside
    /// an upcall would directly make the JVM exit as it would otherwise require to exit the call stack until
    /// the first safe point, which is not possible in this case.
    ///
    /// It is not a good idea to rethrow anything at all with this transformer.
    /// @param exceptionType The type of exception to catch.
    /// @param catcher This consumer will run when an exception is caught.
    /// @return A transformer that surrounds every upcall with a {@code try {...} catch (exceptionType e) {...}} block.
    static <T extends Throwable> UpcallTransformer exceptionCatcher(Class<T> exceptionType, Consumer<? super T> catcher)
    {
        class Container
        {
            static final MethodHandle Consumer_apply;

            static
            {
                try
                {
                    Consumer_apply = publicLookup().findVirtual(Consumer.class, "accept", methodType(void.class, Object.class));
                }
                catch (NoSuchMethodException | IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

        MethodHandle apply = Container.Consumer_apply.bindTo(catcher)
            .asType(methodType(void.class, exceptionType));
        return (_, _, handle) ->
        {
            if (handle.type().returnType().equals(void.class))
            {
                handle = MethodHandles.catchException(handle, exceptionType, apply);
            }

            return handle;
        };
    }

    /// A version of [#exceptionCatcher(Class, Consumer)] that catches everything.
    static UpcallTransformer exceptionCatcher(Consumer<? super Throwable> catcher)
    {
        return exceptionCatcher(Throwable.class, catcher);
    }

    /// A version of `exceptionCatcher` that also returns stuff.
    /// @see #exceptionCatcher(Class, Consumer)
    static <T extends Throwable, R> UpcallTransformer exceptionCatcher(
        Class<T> exceptionType, Class<R> returnType, Function<? super T, ? extends R> catcher
    )
    {
        class Container
        {
            static final MethodHandle Function_apply;

            static
            {
                try
                {
                    Function_apply = publicLookup().findVirtual(Function.class, "apply", methodType(Object.class, Object.class));
                }
                catch (NoSuchMethodException | IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

        MethodHandle apply = Container.Function_apply.bindTo(catcher)
            .asType(methodType(returnType, exceptionType));
        return (_, _, handle) ->
        {
            if (handle.type().returnType().equals(returnType))
            {
                handle = MethodHandles.catchException(handle, exceptionType, apply);
            }

            return handle;
        };
    }

    /// A version of [#exceptionCatcher(Class, Class, Function)] that catches everything.
    static <R> UpcallTransformer exceptionCatcher(Class<R> returnType, Function<? super Throwable, ? extends R> catcher)
    {
        return exceptionCatcher(Throwable.class, returnType, catcher);
    }

    /// @see DowncallTransformer#stringTransformer
    static UpcallTransformer stringTransformer(Charset charset)
    {
        class Container
        {
            static final MethodHandle Arena_allocateFrom;

            static
            {
                try
                {
                    Arena_allocateFrom = MethodHandles.collectArguments(
                        NativeProxies.Arena_allocateFrom, 0, publicLookup().findStatic(Arena.class, "ofAuto", methodType(Arena.class))
                    );
                }
                catch (NoSuchMethodException | IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

        MethodHandle allocateFrom = MethodHandles.insertArguments(Container.Arena_allocateFrom, 1, charset);
        MethodHandle getString = MethodHandles.insertArguments(MemorySegment_getString, 1, charset);
        return pairwiseTransformer((source, target, location) ->
        {
            if (source.equals(String.class) && target.equals(MemorySegment.class))
            {
                return Optional.of(switch (location)
                {
                    // (The following statement has nothing to do with this method)
                    // Performance-wise, we would surely benefit from a confined Arena rather than a garbage collected
                    // one. When a MemorySegment (carrier of a GroupLayout) is returned, its content is copied to
                    // another MemorySegment put in place by the call arranger. That copy is beyond any visibility by
                    // anyone so we must ensure the memory has not been reclaimed until then.
                    // Maybe we could use a Linker option to be able to access the final buffer.
                    case RESULT -> allocateFrom;
                    case PARAMETER -> getString;
                });
            }

            return Optional.empty();
        });
    }

    /// @see DowncallTransformer#pairwiseTransformer
    static UpcallTransformer pairwiseTransformer(PairwiseFilter filter)
    {
        return (_, target, handle) ->
        {
            MethodType type = handle.type();
            Optional<MethodHandle> filterQuery;

            filterQuery = filter.get(type.returnType(), target.returnType(), PairwiseFilter.Location.RESULT);
            if (filterQuery.isPresent())
            {
                handle = MethodHandles.filterReturnValue(handle, filterQuery.orElseThrow());
            }

            if (target.parameterCount() == type.parameterCount())
            {
                for (int i = 0; i < type.parameterCount(); i++)
                {
                    filterQuery = filter.get(type.parameterType(i), target.parameterType(i), PairwiseFilter.Location.PARAMETER);
                    if (filterQuery.isPresent())
                    {
                        handle = MethodHandles.filterArguments(handle, i, filterQuery.orElseThrow());
                    }
                }
            }

            return handle;
        };
    }

    /// @see DowncallTransformer#groupTransformer
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

    /// @see DowncallTransformer#and(DowncallTransformer, DowncallTransformer)
    static UpcallTransformer and(UpcallTransformer first, UpcallTransformer second)
    {
        return (method, target, handle) -> second.transform(method, target, first.transform(method, target, handle));
    }

    /// @see DowncallTransformer#compose(DowncallTransformer, DowncallTransformer)
    static UpcallTransformer compose(UpcallTransformer first, UpcallTransformer second)
    {
        return and(second, first);
    }

    /// @see DowncallTransformer#filter(DowncallTransformer, MethodMatcher)
    static UpcallTransformer filter(UpcallTransformer transformer, MethodMatcher matcher)
    {
        return (method, target, handle) -> matcher.matches(method) ? transformer.transform(method, target, handle) : handle;
    }

    /// For upcalls, we also give the target Java method type.
    /// @see DowncallTransformer#transform
    MethodHandle transform(Method method, MethodType target, MethodHandle handle);

    /// @see UpcallTransformer#and(UpcallTransformer, UpcallTransformer)
    default UpcallTransformer and(UpcallTransformer transformer)
    {
        return and(this, transformer);
    }

    /// @see UpcallTransformer#and(UpcallTransformer, UpcallTransformer)
    default UpcallTransformer compose(UpcallTransformer transformer)
    {
        return compose(this, transformer);
    }

    /// @see UpcallTransformer#filter(UpcallTransformer, MethodMatcher)
    default UpcallTransformer filter(MethodMatcher matcher)
    {
        return filter(this, matcher);
    }
}

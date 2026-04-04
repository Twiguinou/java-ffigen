package fr.kenlek.jpgen.api.dynload;

import module java.base;

import fr.kenlek.jpgen.api.Addressable;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.*;
import static java.lang.invoke.MethodHandles.publicLookup;
import static java.lang.invoke.MethodType.methodType;
import static java.nio.charset.StandardCharsets.UTF_8;

/// Various transformations for downcall method handles.
/// [DowncallTransformer]s are responsible for adapting [MethodHandle]s, obtained through
/// [Linker#downcallHandle(MemorySegment, FunctionDescriptor, Linker.Option...)], to a type
/// that is compatible with the Java method that needs it. More specifically, a chain of
/// transformers must, after being applied, make the [MethodType] compatible for an
/// `invokeExact` call using the unmodified types of the Java [Method].
@FunctionalInterface
public interface DowncallTransformer
{
    /// A no-op transformer.
    DowncallTransformer IDENTITY = (_, handle) -> handle;
    /// A transformer that maps publicly visible [Addressable] subtypes to [MemorySegment]s.
    /// @see #groupTransformer
    DowncallTransformer PUBLIC_GROUP_TRANSFORMER = groupTransformer(publicLookup());
    /// A pairwise transformer that maps booleans to int. Because Java's booleans are implementation-defined,
    /// but more often 1-byte large, you can use this transformer to have a seamless transition between the two.
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
    /// With this transformer, you can pass UTF-8 [String] parameters to downcalls without explicit allocation.
    /// @see #stringTransformer
    DowncallTransformer UTF8_STRING_TRANSFORMER = stringTransformer(UTF_8);

    /// [String] transformers are a way of filling the gap between the C and Java worlds. Usually in C, character
    /// sequences are implemented with a null-terminated array of characters, with these characters' type
    /// describing the encoding. Java is more straightforward since it implements strings with arrays of bytes, of
    /// known lengths, and explicit encodings. But realistically, the implementation of strings should never be a
    /// concern for users, and as such, it is impossible to safely obtain a [MemorySegment] to a Java string.
    ///
    /// When applied to a method, this transformer finds all matching pairs of types (String, MemorySegment),
    /// allocates a confined [Arena], and shuffles data around to allocate everything without the user's intervention.
    /// @param charset The charset to use when allocating string segments.
    /// @return A downcall transformer that performs like described above.
    static DowncallTransformer stringTransformer(Charset charset)
    {
        class Container
        {
            static final MethodHandle Arena_static_ofConfined;
            static final MethodHandle Arena_close;

            static
            {
                MethodHandles.Lookup lookup = publicLookup();
                try
                {
                    Arena_static_ofConfined = lookup.findStatic(Arena.class, "ofConfined", methodType(Arena.class));
                    Arena_close = lookup.findVirtual(Arena.class, "close", methodType(void.class));
                }
                catch (NoSuchMethodException | IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

        MethodHandle allocateFrom = MethodHandles.insertArguments(Arena_allocateFrom, 2, charset);
        MethodHandle getString = MethodHandles.insertArguments(MemorySegment_getString, 1, charset);
        return (method, handle) ->
        {
            MethodType originalType = handle.type();

            if (method.getReturnType().equals(String.class) && handle.type().returnType().equals(MemorySegment.class))
            {
                handle = MethodHandles.filterReturnValue(handle, getString);
            }

            if (method.getParameterCount() == originalType.parameterCount())
            {
                Class<?>[] parameterTypes = method.getParameterTypes();
                boolean[] matchTable = new boolean[originalType.parameterCount()];
                int matchCount = 0;
                for (int i = 0; i < originalType.parameterCount(); i++)
                {
                    if (parameterTypes[i].equals(String.class) && originalType.parameterType(i).equals(MemorySegment.class))
                    {
                        matchTable[i] = true;
                        ++matchCount;
                    }
                }

                if (matchCount > 0)
                {
                    // The initial method handle can be for instance: R(T1, T2, String, T3, T4, String)
                    // Still, we need to create a confined Arena, allocate and populate the necessary data,
                    // give it to the function until it finishes, and finally can we close the Arena.
                    // In order to accomplish this, we make a rather simple transformation: every pattern of
                    // the form (...,MemorySegment,...) where MemorySegment maps to a String is substituted by
                    // (...,Arena,String,...). Then, we add a leading Arena to the parameter list like so:
                    // R(Arena,...). And finally we spread that Arena to every inserted allocator parameter.

                    // We build the permutation table and the new method handle simultaneously
                    int[] permutation = new int[originalType.parameterCount() + matchCount + 1];
                    Class<?>[] newParameterTypes = new Class<?>[originalType.parameterCount() + 1];
                    newParameterTypes[0] = Arena.class;
                    for (int i = 0, substitutionCount = 0; i < originalType.parameterCount(); i++)
                    {
                        if (matchTable[i])
                        {
                            handle = MethodHandles.collectArguments(handle, i + substitutionCount, allocateFrom);
                            newParameterTypes[i + 1] = String.class;
                            permutation[i + substitutionCount + 1] = 0;
                            ++substitutionCount;
                        }
                        else
                        {
                            newParameterTypes[i + 1] = originalType.parameterType(i);
                        }

                        permutation[i + substitutionCount + 1] = i + 1;
                    }

                    // An Arena is appended to the list of arguments
                    handle = MethodHandles.dropArguments(handle, 0, Arena.class);
                    // We must now give the first argument to every substitution we made
                    handle = MethodHandles.permuteArguments(handle, methodType(originalType.returnType(), newParameterTypes), permutation);

                    // The finally {...} block is initially a dummy or a pass-through function : R(R)
                    MethodHandle cleanup;
                    if (handle.type().returnType().equals(void.class))
                    {
                        cleanup = MethodHandles.zero(void.class);
                    }
                    else
                    {
                        cleanup = MethodHandles.identity(handle.type().returnType());
                    }

                    // MethodHandles::tryFinally requires the first argument to be a Throwable : R(Throwable(,R))
                    cleanup = MethodHandles.dropArguments(cleanup, 0, Throwable.class);
                    // Silently close the Arena with a second (or third) argument : R(Throwable(,R),Arena)
                    cleanup = MethodHandles.collectArguments(cleanup, cleanup.type().parameterCount(), Container.Arena_close);

                    // Let's combine this with the previous handle into a try {...} finally {...} statement
                    handle = MethodHandles.tryFinally(handle, cleanup);
                    // Now that the method type is R(Arena,...), finish by feeding it a confined Arena
                    handle = MethodHandles.collectArguments(handle, 0, Container.Arena_static_ofConfined);
                }
            }

            return handle;
        };
    }

    /// @see PairwiseFilter
    static DowncallTransformer pairwiseTransformer(PairwiseFilter filter)
    {
        return (method, handle) ->
        {
            MethodType type = handle.type();
            Optional<MethodHandle> filterQuery;

            filterQuery = filter.get(type.returnType(), method.getReturnType(), PairwiseFilter.Location.RESULT);
            if (filterQuery.isPresent())
            {
                handle = MethodHandles.filterReturnValue(handle, filterQuery.orElseThrow());
            }

            if (method.getParameterCount() == type.parameterCount())
            {
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < type.parameterCount(); i++)
                {
                    filterQuery = filter.get(type.parameterType(i), parameterTypes[i], PairwiseFilter.Location.PARAMETER);
                    if (filterQuery.isPresent())
                    {
                        handle = MethodHandles.filterArguments(handle, i, filterQuery.orElseThrow());
                    }
                }
            }

            return handle;
        };
    }

    /// A group transformer applies automatic wrapping and unwrapping of `group` types. Group types
    /// are subtypes of [Addressable] that are not abstract and possess a constructor taking a single
    /// [MemorySegment] as parameter.
    ///
    /// The transformer fails if a group type cannot be accessed using the given lookup.
    /// @param lookup The lookup to use when searching for wrapping and unwrapping methods.
    /// @return A downcall transformer with the behavior described above.
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

    /// Get a transformer that applies the second transformer to the result of the first.
    static DowncallTransformer and(DowncallTransformer first, DowncallTransformer second)
    {
        return (method, handle) -> second.transform(method, first.transform(method, handle));
    }

    /// Swapped version of [#and(DowncallTransformer, DowncallTransformer)].
    static DowncallTransformer compose(DowncallTransformer first, DowncallTransformer second)
    {
        return and(second, first);
    }

    /// Applies the given transformer only on methods that match the filter.
    static DowncallTransformer filter(DowncallTransformer transformer, MethodMatcher matcher)
    {
        return (method, handle) -> matcher.matches(method) ? transformer.transform(method, handle) : handle;
    }

    /// Applies a transformation to `handle` with the help of `method`.
    MethodHandle transform(Method method, MethodHandle handle);

    /// @see #and(DowncallTransformer, DowncallTransformer)
    default DowncallTransformer and(DowncallTransformer transformer)
    {
        return and(this, transformer);
    }

    /// @see #compose(DowncallTransformer, DowncallTransformer)
    default DowncallTransformer compose(DowncallTransformer transformer)
    {
        return compose(this, transformer);
    }

    /// @see #filter(DowncallTransformer, MethodMatcher)
    default DowncallTransformer filter(MethodMatcher matcher)
    {
        return filter(this, matcher);
    }
}

package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

/// A downcall dispatcher maps any Java [Method] to a downcall to a function pointer.
/// @see Linker#downcallHandle(MemorySegment, FunctionDescriptor, Linker.Option...)
public interface DowncallDispatcher
{
    /// The default downcall dispatcher is a [LinkingDowncallDispatcher] associated with the
    /// [default lookup][Linker#defaultLookup()] of the [native linker][fr.kenlek.jpgen.api.ForeignUtils#SYSTEM_LINKER].
    /// This lookup includes libraries loaded alongside the JVM, which typically means standard libraries like `libc`.
    DowncallDispatcher DEFAULT = new LinkingDowncallDispatcher(SYSTEM_LINKER.defaultLookup());

    /// Wraps a downcall dispatcher with the given transformer.
    /// @param dispatcher A downcall dispatcher
    /// @param transformer The transformation to apply to every [MethodHandle] created with the dispatcher.
    /// @return Another downcall dispatcher, which effectively computes `transformer(dispatcher(method))`.
    static DowncallDispatcher and(DowncallDispatcher dispatcher, DowncallTransformer transformer)
    {
        return method -> transformer.transform(method, dispatcher.dispatch(method));
    }

    /// Create a downcall from a given Java method.
    MethodHandle dispatch(Method method);

    /// @see #and(DowncallDispatcher, DowncallTransformer)
    default DowncallDispatcher and(DowncallTransformer transformer)
    {
        return and(this, transformer);
    }
}

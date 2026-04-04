package fr.kenlek.jpgen.api.dynload;

import module java.base;

/// The upcall version of [DowncallDispatcher]. For transformations, take a look at
/// the documentation of [LinkingUpcallDispatcher].
public interface UpcallDispatcher
{
    /// The default upcall dispatcher, without any transformation and associated with the
    /// [default linker][fr.kenlek.jpgen.api.ForeignUtils#SYSTEM_LINKER].
    UpcallDispatcher DEFAULT = new LinkingUpcallDispatcher();

    /// Dispatches an upcall to a virtual method inside a class.
    <T> MemorySegment dispatch(Arena arena, Class<? super T> clazz, T instance);

    /// Dispatches an upcall to static method inside a class.
    MemorySegment dispatch(Arena arena, Class<?> clazz);
}

package fr.kenlek.jpgen.api.dynload;

import module java.base;

public interface UpcallDispatcher
{
    UpcallDispatcher DEFAULT = new LinkingUpcallDispatcher();

    <T> MemorySegment dispatch(Arena arena, Class<? super T> clazz, T instance);

    MemorySegment dispatch(Arena arena, Class<?> clazz);
}

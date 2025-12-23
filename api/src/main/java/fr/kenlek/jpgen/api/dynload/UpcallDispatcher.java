package fr.kenlek.jpgen.api.dynload;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public interface UpcallDispatcher
{
    UpcallDispatcher DEFAULT = new LinkingUpcallDispatcher();

    <T> MemorySegment dispatch(Arena arena, Class<? super T> clazz, T instance);

    MemorySegment dispatch(Arena arena, Class<?> clazz);
}

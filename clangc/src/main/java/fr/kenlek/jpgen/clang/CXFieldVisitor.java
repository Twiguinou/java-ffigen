package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

@FunctionalInterface
public interface CXFieldVisitor
{
    static MemorySegment makeHandle(UpcallDispatcher dispatcher, Arena arena, CXFieldVisitor target)
    {
        return target.makeHandle(dispatcher, arena);
    }

    @UpcallTarget
    int invoke(CXCursor C, MemorySegment client_data);

    default MemorySegment makeHandle(UpcallDispatcher dispatcher, Arena arena)
    {
        return dispatcher.dispatch(arena, CXFieldVisitor.class, this);
    }
}

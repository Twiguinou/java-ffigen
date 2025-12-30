package fr.kenlek.jpgen.clang;

import module fr.kenlek.jpgen.api;
import module java.base;

@FunctionalInterface
public interface CXCursorVisitor
{
    static MemorySegment makeHandle(UpcallDispatcher dispatcher, Arena arena, CXCursorVisitor target)
    {
        return target.makeHandle(dispatcher, arena);
    }

    @UpcallTarget
    int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data);

    default MemorySegment makeHandle(UpcallDispatcher dispatcher, Arena arena)
    {
        return dispatcher.dispatch(arena, CXCursorVisitor.class, this);
    }
}

package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.dynload.UpcallDispatcher;
import fr.kenlek.jpgen.api.dynload.UpcallTarget;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

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

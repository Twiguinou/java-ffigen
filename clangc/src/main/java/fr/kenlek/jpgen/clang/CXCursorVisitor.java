package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.dynload.UpcallTarget;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.upcall;

public interface CXCursorVisitor
{
    @UpcallTarget
    int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data);

    default MemorySegment makeHandle(Arena arena, Linker.Option... options)
    {
        return upcall(CXCursorVisitor.class, this, arena, options);
    }

    static MemorySegment makeHandle(CXCursorVisitor target, Arena arena, Linker.Option... options)
    {
        return target.makeHandle(arena, options);
    }
}

package fr.kenlek.jpgen.clang;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.upcall;

public interface CXFieldVisitor
{
    int invoke(CXCursor C, MemorySegment client_data);

    default MemorySegment makeHandle(Arena arena, Linker.Option... options)
    {
        return upcall(CXFieldVisitor.class, this, arena, options);
    }

    static MemorySegment makeHandle(CXFieldVisitor target, Arena arena, Linker.Option... options)
    {
        return target.makeHandle(arena, options);
    }
}

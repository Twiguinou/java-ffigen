package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.api.dynload.NativeProxies;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;

public interface CXFieldVisitor
{
    int invoke(CXCursor C, MemorySegment client_data);

    default MemorySegment makeHandle(Arena arena, Linker.Option... options)
    {
        return NativeProxies.upcall(CXFieldVisitor.class, this, arena, options);
    }
}

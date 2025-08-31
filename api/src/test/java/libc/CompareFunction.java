package libc;

import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.UpcallTarget;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;

public interface CompareFunction
{
    @UpcallTarget
    int invoke(MemorySegment ptr1, MemorySegment ptr2);

    default MemorySegment makeHandle(Arena arena, Linker.Option... options)
    {
        return NativeProxies.upcall(CompareFunction.class, this, arena, options);
    }

    static MemorySegment makeHandle(CompareFunction target, Arena arena, Linker.Option... options)
    {
        return target.makeHandle(arena, options);
    }
}

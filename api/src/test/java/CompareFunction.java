import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.NativeProxies;
import fr.kenlek.jpgen.api.dynload.UpcallTarget;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;

public interface CompareFunction
{
    @UpcallTarget
    @Layout("int") int invoke(@Layout("void*") MemorySegment ptr1, @Layout("void*") MemorySegment ptr2);

    default MemorySegment makeHandle(Arena arena, Linker.Option... options)
    {
        return NativeProxies.upcall(CompareFunction.class, this, arena, options);
    }
}

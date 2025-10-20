package tests.libc;

import fr.kenlek.jpgen.api.dynload.UpcallTarget;
import java.lang.foreign.MemorySegment;

public interface CompareFunction
{
    @UpcallTarget
    int invoke(MemorySegment ptr1, MemorySegment ptr2);
}

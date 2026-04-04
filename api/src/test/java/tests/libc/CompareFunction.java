package tests.libc;

import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.UpcallTarget;
import java.lang.foreign.MemorySegment;

@Layout.Generic({
    @Layout.Case(target = MemorySegment.class, layout = @Layout(value = "int", referenced = true))
})
@FunctionalInterface
public interface CompareFunction
{
    @UpcallTarget
    int invoke(MemorySegment ptr1, MemorySegment ptr2);
}

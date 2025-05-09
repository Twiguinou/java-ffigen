import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.Redirect;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public interface LibC
{
    @Redirect("malloc")
    @Layout("void*") MemorySegment _malloc(@Layout("size_t") long size);

    default MemorySegment malloc(long size)
    {
        return this._malloc(size).reinterpret(size);
    }

    void free(@Layout("void*") MemorySegment ptr);

    div_t div(SegmentAllocator allocator, @Layout("int") int dividend, @Layout("int") int divisor);
}

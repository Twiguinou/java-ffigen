import fr.kenlek.jpgen.api.dynload.Dispatcher;
import fr.kenlek.jpgen.api.dynload.DowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.Ignore;
import fr.kenlek.jpgen.api.dynload.Layout;
import fr.kenlek.jpgen.api.dynload.Redirect;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public interface LibC
{
    @Dispatcher
    DowncallDispatcher dispatcher();

    @Redirect("malloc")
    @Layout("void*") MemorySegment _malloc(@Layout("size_t") long size);

    default MemorySegment malloc(long size)
    {
        return this._malloc(size).reinterpret(size);
    }

    void free(@Layout("void*") MemorySegment ptr);

    div_t div(@Ignore SegmentAllocator allocator, @Layout("int") int dividend, @Layout("int") int divisor);

    void qsort(@Layout("void*") MemorySegment array, @Layout("size_t") long elementCount, @Layout("size_t") long elementSize, MemorySegment compareFunction);
}

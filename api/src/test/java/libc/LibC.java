package libc;

import fr.kenlek.jpgen.api.dynload.Dispatcher;
import fr.kenlek.jpgen.api.dynload.DowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.Ignore;
import fr.kenlek.jpgen.api.dynload.Redirect;
import fr.kenlek.jpgen.api.types.CSizeT;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public interface LibC
{
    @Dispatcher
    DowncallDispatcher dispatcher();

    @Redirect("malloc")
    MemorySegment _malloc(CSizeT size);

    default MemorySegment malloc(CSizeT size)
    {
        return this._malloc(size).reinterpret(size.value);
    }

    void free(MemorySegment ptr);

    div_t div(@Ignore SegmentAllocator allocator, int dividend, int divisor);

    void qsort(MemorySegment array, CSizeT elementCount, CSizeT elementSize, MemorySegment compareFunction);
}

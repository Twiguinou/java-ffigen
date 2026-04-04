package tests.libc;

import module java.base;

import fr.kenlek.jpgen.api.data.CLong;
import fr.kenlek.jpgen.api.data.CSizeT;
import fr.kenlek.jpgen.api.dynload.Ignore;
import fr.kenlek.jpgen.api.dynload.Redirect;
import fr.kenlek.jpgen.api.dynload.Variable;

public interface LibC
{
    @Variable
    MemorySegment stdout();

    int fputs(String str, MemorySegment stream);

    int fflush(MemorySegment stream);

    @Redirect("malloc")
    MemorySegment _malloc(CSizeT size);

    default MemorySegment malloc(CSizeT size)
    {
        return this._malloc(size).reinterpret(size.value());
    }

    void free(MemorySegment ptr);

    div_t div(@Ignore SegmentAllocator allocator, int dividend, int divisor);

    void qsort(MemorySegment array, CSizeT elementCount, CSizeT elementSize, MemorySegment compareFunction);

    CLong time(MemorySegment pTime);

    String ctime(MemorySegment pTime);

    CSizeT strlen(String str);

    int strcmp(String first, String second);
}

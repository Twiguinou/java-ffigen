import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public interface Stdlib
{
    MemorySegment malloc(long size);

    void free(MemorySegment ptr);

    long strlen(MemorySegment theString);

    div_t div(SegmentAllocator allocator, int dividend, int divisor);
}

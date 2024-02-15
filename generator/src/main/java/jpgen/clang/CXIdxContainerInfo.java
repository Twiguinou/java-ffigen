package jpgen.clang;

public record CXIdxContainerInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$cursor = 0L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$cursor
    ).withName("CXIdxContainerInfo");

    public CXIdxContainerInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXIdxContainerInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXIdxContainerInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}
    public void cursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$cursor, LAYOUT$cursor.byteSize());}
}

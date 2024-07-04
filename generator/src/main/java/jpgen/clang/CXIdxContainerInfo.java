package jpgen.clang;

public record CXIdxContainerInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__cursor = jpgen.clang.CXCursor.gRecordLayout.withName("cursor");
    public static final long OFFSET__cursor = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__cursor
    ).withByteAlignment(8).withName("CXIdxContainerInfo");

    public CXIdxContainerInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxContainerInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxContainerInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxContainerInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET__cursor, LAYOUT__cursor));}
    public void cursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__cursor, LAYOUT__cursor.byteSize());}
}

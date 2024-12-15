/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxContainerInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.clang.CXCursor.LAYOUT.withName("cursor")
    ).withByteAlignment(8);

    public CXIdxContainerInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxContainerInfo getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxContainerInfo(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxContainerInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxContainerInfo other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__cursor = ((0 / fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize()) * fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize());
    public fr.kenlek.jpgen.clang.CXCursor cursor() {return new fr.kenlek.jpgen.clang.CXCursor(this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT));}
    public void cursor(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.kenlek.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT.byteSize());}
    public java.lang.foreign.MemorySegment $cursor() {return this.ptr.asSlice(MEMBER_OFFSET__cursor, fr.kenlek.jpgen.clang.CXCursor.LAYOUT);}
}

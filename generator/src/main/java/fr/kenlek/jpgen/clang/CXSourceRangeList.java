/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXSourceRangeList(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.ValueLayout.JAVA_INT.withName("count"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ranges")
    ).withByteAlignment(8);

    public CXSourceRangeList(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXSourceRangeList getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXSourceRangeList(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXSourceRangeList value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXSourceRangeList other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__count = 0;
    public int count() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__count);}
    public void count(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__count, value);}
    public java.lang.foreign.MemorySegment $count() {return this.ptr.asSlice(MEMBER_OFFSET__count, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__ranges = 8;
    public java.lang.foreign.MemorySegment ranges() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ranges);}
    public void ranges(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ranges, value);}
    public java.lang.foreign.MemorySegment $ranges() {return this.ptr.asSlice(MEMBER_OFFSET__ranges, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}

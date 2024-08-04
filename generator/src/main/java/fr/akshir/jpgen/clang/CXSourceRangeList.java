package fr.akshir.jpgen.clang;

public record CXSourceRangeList(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__count = java.lang.foreign.ValueLayout.JAVA_INT.withName("count");
    public static final long OFFSET__count = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__ranges = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("ranges");
    public static final long OFFSET__ranges = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__count,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__ranges
    ).withByteAlignment(8).withName("CXSourceRangeList");

    public CXSourceRangeList(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXSourceRangeList getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXSourceRangeList(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXSourceRangeList value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int count() {return this.ptr.get(LAYOUT__count, OFFSET__count);}
    public void count(int value) {this.ptr.set(LAYOUT__count, OFFSET__count, value);}
    public java.lang.foreign.MemorySegment $count() {return this.ptr.asSlice(OFFSET__count, LAYOUT__count);}

    public java.lang.foreign.MemorySegment ranges() {return this.ptr.get(LAYOUT__ranges, OFFSET__ranges);}
    public void ranges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ranges, OFFSET__ranges, value);}
    public java.lang.foreign.MemorySegment $ranges() {return this.ptr.asSlice(OFFSET__ranges, LAYOUT__ranges);}
}

package fr.kenlek.jpgen.clang;

public record CXTUResourceUsageEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET__kind = 0;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT__amount = java.lang.foreign.ValueLayout.JAVA_LONG.withName("amount");
    public static final long OFFSET__amount = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__amount
    ).withByteAlignment(8).withName("CXTUResourceUsageEntry");

    public CXTUResourceUsageEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXTUResourceUsageEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXTUResourceUsageEntry(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXTUResourceUsageEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}

    public long amount() {return this.ptr.get(LAYOUT__amount, OFFSET__amount);}
    public void amount(long value) {this.ptr.set(LAYOUT__amount, OFFSET__amount, value);}
    public java.lang.foreign.MemorySegment $amount() {return this.ptr.asSlice(OFFSET__amount, LAYOUT__amount);}
}

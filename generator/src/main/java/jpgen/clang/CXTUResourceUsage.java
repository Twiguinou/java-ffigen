package jpgen.clang;

public record CXTUResourceUsage(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__data = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("data");
    public static final long OFFSET__data = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numEntries = java.lang.foreign.ValueLayout.JAVA_INT.withName("numEntries");
    public static final long OFFSET__numEntries = 8;
    public static final java.lang.foreign.AddressLayout LAYOUT__entries = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("entries");
    public static final long OFFSET__entries = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__data,
            LAYOUT__numEntries,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__entries
    ).withByteAlignment(8).withName("CXTUResourceUsage");

    public CXTUResourceUsage(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXTUResourceUsage getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXTUResourceUsage(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXTUResourceUsage value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment data() {return this.ptr.get(LAYOUT__data, OFFSET__data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__data, OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}

    public int numEntries() {return this.ptr.get(LAYOUT__numEntries, OFFSET__numEntries);}
    public void numEntries(int value) {this.ptr.set(LAYOUT__numEntries, OFFSET__numEntries, value);}
    public java.lang.foreign.MemorySegment $numEntries() {return this.ptr.asSlice(OFFSET__numEntries, LAYOUT__numEntries);}

    public java.lang.foreign.MemorySegment entries() {return this.ptr.get(LAYOUT__entries, OFFSET__entries);}
    public void entries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__entries, OFFSET__entries, value);}
    public java.lang.foreign.MemorySegment $entries() {return this.ptr.asSlice(OFFSET__entries, LAYOUT__entries);}
}

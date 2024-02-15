package jpgen.clang;

public record CXTUResourceUsage(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$data = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$data = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numEntries = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$numEntries = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$entries = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$entries = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$data,
            LAYOUT$numEntries,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$entries
    ).withName("CXTUResourceUsage");

    public CXTUResourceUsage(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXTUResourceUsage getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXTUResourceUsage(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment data() {return this.ptr.get(LAYOUT$data, OFFSET$data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$data, OFFSET$data, value);}
    public java.lang.foreign.MemorySegment data_ptr() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}

    public int numEntries() {return this.ptr.get(LAYOUT$numEntries, OFFSET$numEntries);}
    public void numEntries(int value) {this.ptr.set(LAYOUT$numEntries, OFFSET$numEntries, value);}
    public java.lang.foreign.MemorySegment numEntries_ptr() {return this.ptr.asSlice(OFFSET$numEntries, LAYOUT$numEntries);}

    public java.lang.foreign.MemorySegment entries() {return this.ptr.get(LAYOUT$entries, OFFSET$entries);}
    public void entries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$entries, OFFSET$entries, value);}
    public java.lang.foreign.MemorySegment entries_ptr() {return this.ptr.asSlice(OFFSET$entries, LAYOUT$entries);}
}

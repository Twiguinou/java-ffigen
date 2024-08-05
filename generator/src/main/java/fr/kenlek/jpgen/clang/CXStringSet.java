package fr.kenlek.jpgen.clang;

public record CXStringSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__Strings = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("Strings");
    public static final long OFFSET__Strings = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__Count = java.lang.foreign.ValueLayout.JAVA_INT.withName("Count");
    public static final long OFFSET__Count = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__Strings,
            LAYOUT__Count,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXStringSet");

    public CXStringSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXStringSet getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXStringSet(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXStringSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment Strings() {return this.ptr.get(LAYOUT__Strings, OFFSET__Strings);}
    public void Strings(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__Strings, OFFSET__Strings, value);}
    public java.lang.foreign.MemorySegment $Strings() {return this.ptr.asSlice(OFFSET__Strings, LAYOUT__Strings);}

    public int Count() {return this.ptr.get(LAYOUT__Count, OFFSET__Count);}
    public void Count(int value) {this.ptr.set(LAYOUT__Count, OFFSET__Count, value);}
    public java.lang.foreign.MemorySegment $Count() {return this.ptr.asSlice(OFFSET__Count, LAYOUT__Count);}
}

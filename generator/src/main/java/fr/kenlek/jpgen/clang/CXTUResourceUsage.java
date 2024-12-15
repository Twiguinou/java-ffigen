/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXTUResourceUsage(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("data"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("numEntries"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("entries")
    ).withByteAlignment(8);

    public CXTUResourceUsage(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXTUResourceUsage getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXTUResourceUsage(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXTUResourceUsage value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXTUResourceUsage other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__data = ((0 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment data() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__numEntries = ((8 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int numEntries() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numEntries);}
    public void numEntries(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__numEntries, value);}
    public java.lang.foreign.MemorySegment $numEntries() {return this.ptr.asSlice(MEMBER_OFFSET__numEntries, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__entries = ((16 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment entries() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entries);}
    public void entries(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__entries, value);}
    public java.lang.foreign.MemorySegment $entries() {return this.ptr.asSlice(MEMBER_OFFSET__entries, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}

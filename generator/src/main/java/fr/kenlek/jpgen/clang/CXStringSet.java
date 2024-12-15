/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXStringSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Strings"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("Count"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXStringSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXStringSet getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXStringSet(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXStringSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXStringSet other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__Strings = ((0 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment Strings() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Strings);}
    public void Strings(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Strings, value);}
    public java.lang.foreign.MemorySegment $Strings() {return this.ptr.asSlice(MEMBER_OFFSET__Strings, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Count = ((8 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int Count() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Count);}
    public void Count(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Count, value);}
    public java.lang.foreign.MemorySegment $Count() {return this.ptr.asSlice(MEMBER_OFFSET__Count, java.lang.foreign.ValueLayout.JAVA_INT);}
}

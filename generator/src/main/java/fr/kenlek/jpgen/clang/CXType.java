/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXType(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.ValueLayout.JAVA_INT.withName("kind"),
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER.withName("data")
    ).withByteAlignment(8);

    public CXType(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXType getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXType(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXType value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXType other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__kind = ((0 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__data = ((8 / fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER.byteSize()) * fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER.byteSize());
    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER);}
    public java.lang.foreign.MemorySegment data(long index) {return this.data().getAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index);}
    public void data(long index, java.lang.foreign.MemorySegment value) {this.data().setAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index, value);}
}

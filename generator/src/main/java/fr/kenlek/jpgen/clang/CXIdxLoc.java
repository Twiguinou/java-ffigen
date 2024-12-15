/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIdxLoc(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER.withName("ptr_data"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("int_data"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXIdxLoc(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXIdxLoc getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIdxLoc(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIdxLoc value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXIdxLoc other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__ptr_data = ((0 / fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER.byteSize()) * fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER.byteSize());
    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.asSlice(MEMBER_OFFSET__ptr_data, fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER);}
    public java.lang.foreign.MemorySegment ptr_data(long index) {return this.ptr_data().getAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index);}
    public void ptr_data(long index, java.lang.foreign.MemorySegment value) {this.ptr_data().setAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index, value);}

    public static final long MEMBER_OFFSET__int_data = ((16 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int int_data() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__int_data);}
    public void int_data(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__int_data, value);}
    public java.lang.foreign.MemorySegment $int_data() {return this.ptr.asSlice(MEMBER_OFFSET__int_data, java.lang.foreign.ValueLayout.JAVA_INT);}
}

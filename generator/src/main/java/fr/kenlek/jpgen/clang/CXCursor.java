/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCursor(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            java.lang.foreign.ValueLayout.JAVA_INT.withName("kind"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("xdata"),
            fr.kenlek.jpgen.clang.Layouts.ARRAY_3__POINTER.withName("data")
    ).withByteAlignment(8);

    public CXCursor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXCursor getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCursor(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCursor value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCursor other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__kind = ((0 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__xdata = ((4 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int xdata() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__xdata);}
    public void xdata(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__xdata, value);}
    public java.lang.foreign.MemorySegment $xdata() {return this.ptr.asSlice(MEMBER_OFFSET__xdata, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__data = ((8 / fr.kenlek.jpgen.clang.Layouts.ARRAY_3__POINTER.byteSize()) * fr.kenlek.jpgen.clang.Layouts.ARRAY_3__POINTER.byteSize());
    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.clang.Layouts.ARRAY_3__POINTER);}
    public java.lang.foreign.MemorySegment data(long index) {return this.data().getAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index);}
    public void data(long index, java.lang.foreign.MemorySegment value) {this.data().setAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index, value);}
}

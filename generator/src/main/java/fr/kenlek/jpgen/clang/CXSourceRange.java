/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXSourceRange(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXSourceRange", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER.withName("ptr_data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("begin_int_data")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("end_int_data"))
    ));

    public CXSourceRange(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXSourceRange getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXSourceRange(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXSourceRange value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXSourceRange other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__ptr_data = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.asSlice(MEMBER_OFFSET__ptr_data, fr.kenlek.jpgen.clang.Layouts.ARRAY_2__POINTER);}
    public java.lang.foreign.MemorySegment ptr_data(long index) {return this.ptr_data().getAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index);}
    public void ptr_data(long index, java.lang.foreign.MemorySegment value) {this.ptr_data().setAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index, value);}

    public static final long MEMBER_OFFSET__begin_int_data = LAYOUT_DATA.state(1).byteOffset();
    public int begin_int_data() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__begin_int_data);}
    public void begin_int_data(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__begin_int_data, value);}
    public java.lang.foreign.MemorySegment $begin_int_data() {return this.ptr.asSlice(MEMBER_OFFSET__begin_int_data, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__end_int_data = LAYOUT_DATA.state(2).byteOffset();
    public int end_int_data() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__end_int_data);}
    public void end_int_data(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__end_int_data, value);}
    public java.lang.foreign.MemorySegment $end_int_data() {return this.ptr.asSlice(MEMBER_OFFSET__end_int_data, java.lang.foreign.ValueLayout.JAVA_INT);}
}

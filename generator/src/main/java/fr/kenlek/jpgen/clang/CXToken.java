/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXToken(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXToken", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.Layouts.ARRAY_4__INT_32.withName("int_data")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ptr_data"))
    ));

    public CXToken(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXToken getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXToken(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXToken value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXToken other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__int_data = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment int_data() {return this.ptr.asSlice(MEMBER_OFFSET__int_data, fr.kenlek.jpgen.clang.Layouts.ARRAY_4__INT_32);}
    public int int_data(long index) {return this.int_data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void int_data(long index, int value) {this.int_data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public static final long MEMBER_OFFSET__ptr_data = LAYOUT_DATA.state(1).byteOffset();
    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ptr_data);}
    public void ptr_data(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ptr_data, value);}
    public java.lang.foreign.MemorySegment $ptr_data() {return this.ptr.asSlice(MEMBER_OFFSET__ptr_data, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}

/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXFileUniqueID(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXFileUniqueID", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64.withName("data"))
    ));

    public CXFileUniqueID(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXFileUniqueID getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXFileUniqueID(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXFileUniqueID value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXFileUniqueID other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__data = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64);}
    public long data(long index) {return this.data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index);}
    public void data(long index, long value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index, value);}
}

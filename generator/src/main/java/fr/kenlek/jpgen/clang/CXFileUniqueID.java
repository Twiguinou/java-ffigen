/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXFileUniqueID(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64.withName("data")
    ).withByteAlignment(8);

    public CXFileUniqueID(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXFileUniqueID getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXFileUniqueID(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXFileUniqueID value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXFileUniqueID other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__data = ((0 / fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64.byteSize()) * fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64.byteSize());
    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64);}
    public long data(long index) {return this.data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index);}
    public void data(long index, long value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index, value);}
}

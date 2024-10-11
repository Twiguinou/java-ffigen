/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXFileUniqueID(java.lang.foreign.MemorySegment ptr)
{
    public CXFileUniqueID(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID.layout));
    }

    public static CXFileUniqueID getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXFileUniqueID(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXFileUniqueID value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID.layout.byteSize());
    }

    public void copyFrom(CXFileUniqueID other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__data = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXFileUniqueID.state(0).byteOffset();
    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.clang.Layouts.ARRAY_3__INT_64);}
    public long data(long index) {return this.data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index);}
    public void data(long index, long value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index, value);}
}

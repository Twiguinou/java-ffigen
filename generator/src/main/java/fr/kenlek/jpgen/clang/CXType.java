/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXType(java.lang.foreign.MemorySegment ptr)
{
    public CXType(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    }

    public static CXType getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXType(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXType value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout.byteSize());
    }

    public void copyFrom(CXType other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__kind = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.state(0).byteOffset();
    public int kind() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind);}
    public void kind(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(MEMBER_OFFSET__kind, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__data = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXType.state(1).byteOffset();
    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.clang.Layouts.ARRAY_2__PTR);}
    public java.lang.foreign.MemorySegment data(long index) {return this.data().getAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index);}
    public void data(long index, java.lang.foreign.MemorySegment value) {this.data().setAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index, value);}
}

/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXSourceLocation(java.lang.foreign.MemorySegment ptr)
{
    public CXSourceLocation(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    }

    public static CXSourceLocation getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXSourceLocation(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXSourceLocation value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout.byteSize());
    }

    public void copyFrom(CXSourceLocation other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__ptr_data = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.state(0).byteOffset();
    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.asSlice(MEMBER_OFFSET__ptr_data, fr.kenlek.jpgen.clang.Layouts.ARRAY_2__PTR);}
    public java.lang.foreign.MemorySegment ptr_data(long index) {return this.ptr_data().getAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index);}
    public void ptr_data(long index, java.lang.foreign.MemorySegment value) {this.ptr_data().setAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index, value);}

    public static final long MEMBER_OFFSET__int_data = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceLocation.state(1).byteOffset();
    public int int_data() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__int_data);}
    public void int_data(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__int_data, value);}
    public java.lang.foreign.MemorySegment $int_data() {return this.ptr.asSlice(MEMBER_OFFSET__int_data, java.lang.foreign.ValueLayout.JAVA_INT);}
}

/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXString(java.lang.foreign.MemorySegment ptr)
{
    public CXString(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    }

    public static CXString getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXString(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXString value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.byteSize());
    }

    public void copyFrom(CXString other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__data = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.state(0).byteOffset();
    public java.lang.foreign.MemorySegment data() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(MEMBER_OFFSET__data, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__private_flags = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.state(1).byteOffset();
    public int private_flags() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__private_flags);}
    public void private_flags(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__private_flags, value);}
    public java.lang.foreign.MemorySegment $private_flags() {return this.ptr.asSlice(MEMBER_OFFSET__private_flags, java.lang.foreign.ValueLayout.JAVA_INT);}
}

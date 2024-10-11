/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXStringSet(java.lang.foreign.MemorySegment ptr)
{
    public CXStringSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.layout));
    }

    public static CXStringSet getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXStringSet(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXStringSet value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.layout.byteSize());
    }

    public void copyFrom(CXStringSet other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Strings = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.state(0).byteOffset();
    public java.lang.foreign.MemorySegment Strings() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Strings);}
    public void Strings(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Strings, value);}
    public java.lang.foreign.MemorySegment $Strings() {return this.ptr.asSlice(MEMBER_OFFSET__Strings, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__Count = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXStringSet.state(1).byteOffset();
    public int Count() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Count);}
    public void Count(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Count, value);}
    public java.lang.foreign.MemorySegment $Count() {return this.ptr.asSlice(MEMBER_OFFSET__Count, java.lang.foreign.ValueLayout.JAVA_INT);}
}

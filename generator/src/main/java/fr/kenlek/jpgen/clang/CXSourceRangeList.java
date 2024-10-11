/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXSourceRangeList(java.lang.foreign.MemorySegment ptr)
{
    public CXSourceRangeList(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.layout));
    }

    public static CXSourceRangeList getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXSourceRangeList(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXSourceRangeList value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.layout.byteSize());
    }

    public void copyFrom(CXSourceRangeList other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__count = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.state(0).byteOffset();
    public int count() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__count);}
    public void count(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__count, value);}
    public java.lang.foreign.MemorySegment $count() {return this.ptr.asSlice(MEMBER_OFFSET__count, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__ranges = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXSourceRangeList.state(1).byteOffset();
    public java.lang.foreign.MemorySegment ranges() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ranges);}
    public void ranges(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__ranges, value);}
    public java.lang.foreign.MemorySegment $ranges() {return this.ptr.asSlice(MEMBER_OFFSET__ranges, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}

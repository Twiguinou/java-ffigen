/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCodeCompleteResults(java.lang.foreign.MemorySegment ptr)
{
    public CXCodeCompleteResults(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.layout));
    }

    public static CXCodeCompleteResults getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCodeCompleteResults(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCodeCompleteResults value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.layout.byteSize());
    }

    public void copyFrom(CXCodeCompleteResults other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Results = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.state(0).byteOffset();
    public java.lang.foreign.MemorySegment Results() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Results);}
    public void Results(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Results, value);}
    public java.lang.foreign.MemorySegment $Results() {return this.ptr.asSlice(MEMBER_OFFSET__Results, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__NumResults = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXCodeCompleteResults.state(1).byteOffset();
    public int NumResults() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__NumResults);}
    public void NumResults(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__NumResults, value);}
    public java.lang.foreign.MemorySegment $NumResults() {return this.ptr.asSlice(MEMBER_OFFSET__NumResults, java.lang.foreign.ValueLayout.JAVA_INT);}
}

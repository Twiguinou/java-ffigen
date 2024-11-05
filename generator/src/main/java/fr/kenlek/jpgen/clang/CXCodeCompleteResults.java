/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCodeCompleteResults(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXCodeCompleteResults", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Results")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("NumResults"))
    ));

    public CXCodeCompleteResults(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXCodeCompleteResults getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCodeCompleteResults(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCodeCompleteResults value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXCodeCompleteResults other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Results = LAYOUT_DATA.state(0).byteOffset();
    public java.lang.foreign.MemorySegment Results() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Results);}
    public void Results(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Results, value);}
    public java.lang.foreign.MemorySegment $Results() {return this.ptr.asSlice(MEMBER_OFFSET__Results, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__NumResults = LAYOUT_DATA.state(1).byteOffset();
    public int NumResults() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__NumResults);}
    public void NumResults(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__NumResults, value);}
    public java.lang.foreign.MemorySegment $NumResults() {return this.ptr.asSlice(MEMBER_OFFSET__NumResults, java.lang.foreign.ValueLayout.JAVA_INT);}
}

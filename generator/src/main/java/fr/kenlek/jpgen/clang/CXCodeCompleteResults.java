/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXCodeCompleteResults(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT = java.lang.foreign.MemoryLayout.structLayout(
            fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("Results"),
            java.lang.foreign.ValueLayout.JAVA_INT.withName("NumResults"),
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8);

    public CXCodeCompleteResults(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT));
    }

    public static CXCodeCompleteResults getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXCodeCompleteResults(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXCodeCompleteResults value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());
    }

    public void copyFrom(CXCodeCompleteResults other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT.byteSize());
    }

    public static final long MEMBER_OFFSET__Results = ((0 / fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize()) * fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.byteSize());
    public java.lang.foreign.MemorySegment Results() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Results);}
    public void Results(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__Results, value);}
    public java.lang.foreign.MemorySegment $Results() {return this.ptr.asSlice(MEMBER_OFFSET__Results, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__NumResults = ((8 / java.lang.foreign.ValueLayout.JAVA_INT.byteSize()) * java.lang.foreign.ValueLayout.JAVA_INT.byteSize());
    public int NumResults() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__NumResults);}
    public void NumResults(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__NumResults, value);}
    public java.lang.foreign.MemorySegment $NumResults() {return this.ptr.asSlice(MEMBER_OFFSET__NumResults, java.lang.foreign.ValueLayout.JAVA_INT);}
}

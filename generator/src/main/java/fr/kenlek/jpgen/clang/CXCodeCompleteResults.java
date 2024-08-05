package fr.kenlek.jpgen.clang;

public record CXCodeCompleteResults(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__Results = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("Results");
    public static final long OFFSET__Results = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__NumResults = java.lang.foreign.ValueLayout.JAVA_INT.withName("NumResults");
    public static final long OFFSET__NumResults = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__Results,
            LAYOUT__NumResults,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXCodeCompleteResults");

    public CXCodeCompleteResults(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXCodeCompleteResults getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXCodeCompleteResults(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXCodeCompleteResults value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment Results() {return this.ptr.get(LAYOUT__Results, OFFSET__Results);}
    public void Results(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__Results, OFFSET__Results, value);}
    public java.lang.foreign.MemorySegment $Results() {return this.ptr.asSlice(OFFSET__Results, LAYOUT__Results);}

    public int NumResults() {return this.ptr.get(LAYOUT__NumResults, OFFSET__NumResults);}
    public void NumResults(int value) {this.ptr.set(LAYOUT__NumResults, OFFSET__NumResults, value);}
    public java.lang.foreign.MemorySegment $NumResults() {return this.ptr.asSlice(OFFSET__NumResults, LAYOUT__NumResults);}
}

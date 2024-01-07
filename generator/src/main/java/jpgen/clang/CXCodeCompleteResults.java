package jpgen.clang;

public record CXCodeCompleteResults(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$Results = java.lang.foreign.ValueLayout.ADDRESS.withName("Results");
	public static final long OFFSET$Results = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$NumResults = java.lang.foreign.ValueLayout.JAVA_INT.withName("NumResults");
	public static final long OFFSET$NumResults = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$Results,
			LAYOUT$NumResults,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("CXCodeCompleteResults");

	public CXCodeCompleteResults(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment Results() {return this.ptr.get(LAYOUT$Results, OFFSET$Results);}
	public void Results(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$Results, OFFSET$Results, value);}
	public java.lang.foreign.MemorySegment Results_ptr() {return this.ptr.asSlice(OFFSET$Results, LAYOUT$Results);}

	public int NumResults() {return this.ptr.get(LAYOUT$NumResults, OFFSET$NumResults);}
	public void NumResults(int value) {this.ptr.set(LAYOUT$NumResults, OFFSET$NumResults, value);}
	public java.lang.foreign.MemorySegment NumResults_ptr() {return this.ptr.asSlice(OFFSET$NumResults, LAYOUT$NumResults);}
}

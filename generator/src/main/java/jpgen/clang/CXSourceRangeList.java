package jpgen.clang;

public record CXSourceRangeList(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$count = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$count = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$ranges = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$ranges = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$count,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$ranges
	).withName("CXSourceRangeList");

	public CXSourceRangeList(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int count() {return this.ptr.get(LAYOUT$count, OFFSET$count);}
	public void count(int value) {this.ptr.set(LAYOUT$count, OFFSET$count, value);}
	public java.lang.foreign.MemorySegment count_ptr() {return this.ptr.asSlice(OFFSET$count, LAYOUT$count);}

	public java.lang.foreign.MemorySegment ranges() {return this.ptr.get(LAYOUT$ranges, OFFSET$ranges);}
	public void ranges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ranges, OFFSET$ranges, value);}
	public java.lang.foreign.MemorySegment ranges_ptr() {return this.ptr.asSlice(OFFSET$ranges, LAYOUT$ranges);}
}

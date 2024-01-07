package jpgen.clang;

public record CXIdxContainerInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.StructLayout LAYOUT$cursor = CXCursor.gStructLayout.withName("cursor");
	public static final long OFFSET$cursor = 0L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$cursor
	).withName("CXIdxContainerInfo");

	public CXIdxContainerInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public CXCursor cursor() {return new CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}
}

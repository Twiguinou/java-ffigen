package vulkan;

public record StdVideoH265ShortTermRefPicSetFlags(java.lang.foreign.MemorySegment ptr)
{

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("StdVideoH265ShortTermRefPicSetFlags");

	public StdVideoH265ShortTermRefPicSetFlags(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}
}

package vulkan;

public record StdVideoDecodeH264ReferenceInfoFlags(java.lang.foreign.MemorySegment ptr)
{

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("StdVideoDecodeH264ReferenceInfoFlags");

	public StdVideoDecodeH264ReferenceInfoFlags(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}
}

package vulkan;

public record StdVideoDecodeH265PictureInfoFlags(java.lang.foreign.MemorySegment ptr)
{

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("StdVideoDecodeH265PictureInfoFlags");

	public StdVideoDecodeH265PictureInfoFlags(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}
}

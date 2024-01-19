package vulkan;

public record StdVideoH264SpsFlags(java.lang.foreign.MemorySegment ptr)
{

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("StdVideoH264SpsFlags");

	public StdVideoH264SpsFlags(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}
}

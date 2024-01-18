package vulkan;

public record StdVideoH264PpsFlags(java.lang.foreign.MemorySegment ptr)
{

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("StdVideoH264PpsFlags");

	public StdVideoH264PpsFlags(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}
}

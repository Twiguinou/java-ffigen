package vulkan;

public record VkRect2D(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$offset = vulkan.VkOffset2D.gStructLayout;
	public static final long OFFSET$offset = 0L;
	public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$extent = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$offset,
			LAYOUT$extent
	).withName("VkRect2D");

	public VkRect2D(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkOffset2D offset() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$offset, LAYOUT$offset));}

	public vulkan.VkExtent2D extent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$extent, LAYOUT$extent));}
}

package vulkan;

public record VkClearValue(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$color = vulkan.VkClearColorValue.gStructLayout;
	public static final long OFFSET$color = 0L;
	public static final java.lang.foreign.GroupLayout LAYOUT$depthStencil = vulkan.VkClearDepthStencilValue.gStructLayout;
	public static final long OFFSET$depthStencil = 0L;

	public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
			LAYOUT$color,
			LAYOUT$depthStencil
	).withName("VkClearValue");

	public VkClearValue(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkClearColorValue color() {return new vulkan.VkClearColorValue(this.ptr.asSlice(OFFSET$color, LAYOUT$color));}

	public vulkan.VkClearDepthStencilValue depthStencil() {return new vulkan.VkClearDepthStencilValue(this.ptr.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));}
}

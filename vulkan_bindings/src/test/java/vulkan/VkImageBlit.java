package vulkan;

public record VkImageBlit(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$srcSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
	public static final long OFFSET$srcSubresource = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$srcOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, vulkan.VkOffset3D.gStructLayout);
	public static final long OFFSET$srcOffsets = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$dstSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
	public static final long OFFSET$dstSubresource = 40L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$dstOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, vulkan.VkOffset3D.gStructLayout);
	public static final long OFFSET$dstOffsets = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$srcSubresource,
			LAYOUT$srcOffsets,
			LAYOUT$dstSubresource,
			LAYOUT$dstOffsets
	).withName("VkImageBlit");

	public VkImageBlit(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkImageSubresourceLayers srcSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));}

	public java.lang.foreign.MemorySegment srcOffsets() {return this.ptr.asSlice(OFFSET$srcOffsets, LAYOUT$srcOffsets);}
	public vulkan.VkOffset3D srcOffsets(int i) {return new vulkan.VkOffset3D(this.srcOffsets().asSlice(i * LAYOUT$srcOffsets.byteSize(), LAYOUT$srcOffsets));}

	public vulkan.VkImageSubresourceLayers dstSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));}

	public java.lang.foreign.MemorySegment dstOffsets() {return this.ptr.asSlice(OFFSET$dstOffsets, LAYOUT$dstOffsets);}
	public vulkan.VkOffset3D dstOffsets(int i) {return new vulkan.VkOffset3D(this.dstOffsets().asSlice(i * LAYOUT$dstOffsets.byteSize(), LAYOUT$dstOffsets));}
}

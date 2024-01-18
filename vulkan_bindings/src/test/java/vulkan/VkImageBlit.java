package vulkan;

public record VkImageBlit(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.StructLayout LAYOUT$srcSubresource = VkImageSubresourceLayers.gStructLayout.withName("srcSubresource");
	public static final long OFFSET$srcSubresource = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$srcOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, VkOffset3D.gStructLayout).withName("srcOffsets");
	public static final long OFFSET$srcOffsets = 16L;
	public static final java.lang.foreign.StructLayout LAYOUT$dstSubresource = VkImageSubresourceLayers.gStructLayout.withName("dstSubresource");
	public static final long OFFSET$dstSubresource = 40L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$dstOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, VkOffset3D.gStructLayout).withName("dstOffsets");
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

	public VkImageSubresourceLayers srcSubresource() {return new VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));}


	public VkImageSubresourceLayers dstSubresource() {return new VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));}

}

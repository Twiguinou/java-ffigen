package vulkan;

public record VkImageBlit2(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT.withName("sType");
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS.withName("pNext");
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.StructLayout LAYOUT$srcSubresource = VkImageSubresourceLayers.gStructLayout.withName("srcSubresource");
	public static final long OFFSET$srcSubresource = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$srcOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, VkOffset3D.gStructLayout).withName("srcOffsets");
	public static final long OFFSET$srcOffsets = 32L;
	public static final java.lang.foreign.StructLayout LAYOUT$dstSubresource = VkImageSubresourceLayers.gStructLayout.withName("dstSubresource");
	public static final long OFFSET$dstSubresource = 56L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$dstOffsets = java.lang.foreign.MemoryLayout.sequenceLayout(2, VkOffset3D.gStructLayout).withName("dstOffsets");
	public static final long OFFSET$dstOffsets = 72L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$srcSubresource,
			LAYOUT$srcOffsets,
			LAYOUT$dstSubresource,
			LAYOUT$dstOffsets
	).withName("VkImageBlit2");

	public VkImageBlit2(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public VkImageSubresourceLayers srcSubresource() {return new VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));}


	public VkImageSubresourceLayers dstSubresource() {return new VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));}

}

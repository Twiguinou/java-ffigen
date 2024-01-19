package vulkan;

public record VkAttachmentSampleCountInfoAMD(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$colorAttachmentCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pColorAttachmentSamples = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pColorAttachmentSamples = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthStencilAttachmentSamples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depthStencilAttachmentSamples = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$colorAttachmentCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pColorAttachmentSamples,
			LAYOUT$depthStencilAttachmentSamples,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkAttachmentSampleCountInfoAMD");

	public VkAttachmentSampleCountInfoAMD(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int colorAttachmentCount() {return this.ptr.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);}
	public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);}
	public java.lang.foreign.MemorySegment colorAttachmentCount_ptr() {return this.ptr.asSlice(OFFSET$colorAttachmentCount, LAYOUT$colorAttachmentCount);}

	public java.lang.foreign.MemorySegment pColorAttachmentSamples() {return this.ptr.get(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples);}
	public void pColorAttachmentSamples(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pColorAttachmentSamples, OFFSET$pColorAttachmentSamples, value);}
	public java.lang.foreign.MemorySegment pColorAttachmentSamples_ptr() {return this.ptr.asSlice(OFFSET$pColorAttachmentSamples, LAYOUT$pColorAttachmentSamples);}

	public int depthStencilAttachmentSamples() {return this.ptr.get(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples);}
	public void depthStencilAttachmentSamples(int value) {this.ptr.set(LAYOUT$depthStencilAttachmentSamples, OFFSET$depthStencilAttachmentSamples, value);}
	public java.lang.foreign.MemorySegment depthStencilAttachmentSamples_ptr() {return this.ptr.asSlice(OFFSET$depthStencilAttachmentSamples, LAYOUT$depthStencilAttachmentSamples);}
}

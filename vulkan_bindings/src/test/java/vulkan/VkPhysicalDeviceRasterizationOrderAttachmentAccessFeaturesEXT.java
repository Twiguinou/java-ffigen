package vulkan;

public record VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rasterizationOrderColorAttachmentAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rasterizationOrderColorAttachmentAccess = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rasterizationOrderDepthAttachmentAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rasterizationOrderDepthAttachmentAccess = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rasterizationOrderStencilAttachmentAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rasterizationOrderStencilAttachmentAccess = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$rasterizationOrderColorAttachmentAccess,
			LAYOUT$rasterizationOrderDepthAttachmentAccess,
			LAYOUT$rasterizationOrderStencilAttachmentAccess,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT");

	public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int rasterizationOrderColorAttachmentAccess() {return this.ptr.get(LAYOUT$rasterizationOrderColorAttachmentAccess, OFFSET$rasterizationOrderColorAttachmentAccess);}
	public void rasterizationOrderColorAttachmentAccess(int value) {this.ptr.set(LAYOUT$rasterizationOrderColorAttachmentAccess, OFFSET$rasterizationOrderColorAttachmentAccess, value);}
	public java.lang.foreign.MemorySegment rasterizationOrderColorAttachmentAccess_ptr() {return this.ptr.asSlice(OFFSET$rasterizationOrderColorAttachmentAccess, LAYOUT$rasterizationOrderColorAttachmentAccess);}

	public int rasterizationOrderDepthAttachmentAccess() {return this.ptr.get(LAYOUT$rasterizationOrderDepthAttachmentAccess, OFFSET$rasterizationOrderDepthAttachmentAccess);}
	public void rasterizationOrderDepthAttachmentAccess(int value) {this.ptr.set(LAYOUT$rasterizationOrderDepthAttachmentAccess, OFFSET$rasterizationOrderDepthAttachmentAccess, value);}
	public java.lang.foreign.MemorySegment rasterizationOrderDepthAttachmentAccess_ptr() {return this.ptr.asSlice(OFFSET$rasterizationOrderDepthAttachmentAccess, LAYOUT$rasterizationOrderDepthAttachmentAccess);}

	public int rasterizationOrderStencilAttachmentAccess() {return this.ptr.get(LAYOUT$rasterizationOrderStencilAttachmentAccess, OFFSET$rasterizationOrderStencilAttachmentAccess);}
	public void rasterizationOrderStencilAttachmentAccess(int value) {this.ptr.set(LAYOUT$rasterizationOrderStencilAttachmentAccess, OFFSET$rasterizationOrderStencilAttachmentAccess, value);}
	public java.lang.foreign.MemorySegment rasterizationOrderStencilAttachmentAccess_ptr() {return this.ptr.asSlice(OFFSET$rasterizationOrderStencilAttachmentAccess, LAYOUT$rasterizationOrderStencilAttachmentAccess);}
}

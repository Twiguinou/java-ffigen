package vulkan;

public record VkSubpassDescriptionDepthStencilResolve(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthResolveMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depthResolveMode = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencilResolveMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stencilResolveMode = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDepthStencilResolveAttachment = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDepthStencilResolveAttachment = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$depthResolveMode,
			LAYOUT$stencilResolveMode,
			LAYOUT$pDepthStencilResolveAttachment
	).withName("VkSubpassDescriptionDepthStencilResolve");

	public VkSubpassDescriptionDepthStencilResolve(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int depthResolveMode() {return this.ptr.get(LAYOUT$depthResolveMode, OFFSET$depthResolveMode);}
	public void depthResolveMode(int value) {this.ptr.set(LAYOUT$depthResolveMode, OFFSET$depthResolveMode, value);}
	public java.lang.foreign.MemorySegment depthResolveMode_ptr() {return this.ptr.asSlice(OFFSET$depthResolveMode, LAYOUT$depthResolveMode);}

	public int stencilResolveMode() {return this.ptr.get(LAYOUT$stencilResolveMode, OFFSET$stencilResolveMode);}
	public void stencilResolveMode(int value) {this.ptr.set(LAYOUT$stencilResolveMode, OFFSET$stencilResolveMode, value);}
	public java.lang.foreign.MemorySegment stencilResolveMode_ptr() {return this.ptr.asSlice(OFFSET$stencilResolveMode, LAYOUT$stencilResolveMode);}

	public java.lang.foreign.MemorySegment pDepthStencilResolveAttachment() {return this.ptr.get(LAYOUT$pDepthStencilResolveAttachment, OFFSET$pDepthStencilResolveAttachment);}
	public void pDepthStencilResolveAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDepthStencilResolveAttachment, OFFSET$pDepthStencilResolveAttachment, value);}
	public java.lang.foreign.MemorySegment pDepthStencilResolveAttachment_ptr() {return this.ptr.asSlice(OFFSET$pDepthStencilResolveAttachment, LAYOUT$pDepthStencilResolveAttachment);}
}

package vulkan;

public record VkRenderingInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$renderArea = vulkan.VkRect2D.gStructLayout;
	public static final long OFFSET$renderArea = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$layerCount = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewMask = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$colorAttachmentCount = 44L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pColorAttachments = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pColorAttachments = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDepthAttachment = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDepthAttachment = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStencilAttachment = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStencilAttachment = 64L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$renderArea,
			LAYOUT$layerCount,
			LAYOUT$viewMask,
			LAYOUT$colorAttachmentCount,
			LAYOUT$pColorAttachments,
			LAYOUT$pDepthAttachment,
			LAYOUT$pStencilAttachment
	).withName("VkRenderingInfo");

	public VkRenderingInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public vulkan.VkRect2D renderArea() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET$renderArea, LAYOUT$renderArea));}

	public int layerCount() {return this.ptr.get(LAYOUT$layerCount, OFFSET$layerCount);}
	public void layerCount(int value) {this.ptr.set(LAYOUT$layerCount, OFFSET$layerCount, value);}
	public java.lang.foreign.MemorySegment layerCount_ptr() {return this.ptr.asSlice(OFFSET$layerCount, LAYOUT$layerCount);}

	public int viewMask() {return this.ptr.get(LAYOUT$viewMask, OFFSET$viewMask);}
	public void viewMask(int value) {this.ptr.set(LAYOUT$viewMask, OFFSET$viewMask, value);}
	public java.lang.foreign.MemorySegment viewMask_ptr() {return this.ptr.asSlice(OFFSET$viewMask, LAYOUT$viewMask);}

	public int colorAttachmentCount() {return this.ptr.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);}
	public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);}
	public java.lang.foreign.MemorySegment colorAttachmentCount_ptr() {return this.ptr.asSlice(OFFSET$colorAttachmentCount, LAYOUT$colorAttachmentCount);}

	public java.lang.foreign.MemorySegment pColorAttachments() {return this.ptr.get(LAYOUT$pColorAttachments, OFFSET$pColorAttachments);}
	public void pColorAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pColorAttachments, OFFSET$pColorAttachments, value);}
	public java.lang.foreign.MemorySegment pColorAttachments_ptr() {return this.ptr.asSlice(OFFSET$pColorAttachments, LAYOUT$pColorAttachments);}

	public java.lang.foreign.MemorySegment pDepthAttachment() {return this.ptr.get(LAYOUT$pDepthAttachment, OFFSET$pDepthAttachment);}
	public void pDepthAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDepthAttachment, OFFSET$pDepthAttachment, value);}
	public java.lang.foreign.MemorySegment pDepthAttachment_ptr() {return this.ptr.asSlice(OFFSET$pDepthAttachment, LAYOUT$pDepthAttachment);}

	public java.lang.foreign.MemorySegment pStencilAttachment() {return this.ptr.get(LAYOUT$pStencilAttachment, OFFSET$pStencilAttachment);}
	public void pStencilAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStencilAttachment, OFFSET$pStencilAttachment, value);}
	public java.lang.foreign.MemorySegment pStencilAttachment_ptr() {return this.ptr.asSlice(OFFSET$pStencilAttachment, LAYOUT$pStencilAttachment);}
}

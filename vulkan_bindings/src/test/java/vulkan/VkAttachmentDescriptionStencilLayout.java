package vulkan;

public record VkAttachmentDescriptionStencilLayout(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencilInitialLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stencilInitialLayout = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencilFinalLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stencilFinalLayout = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$stencilInitialLayout,
			LAYOUT$stencilFinalLayout
	).withName("VkAttachmentDescriptionStencilLayout");

	public VkAttachmentDescriptionStencilLayout(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int stencilInitialLayout() {return this.ptr.get(LAYOUT$stencilInitialLayout, OFFSET$stencilInitialLayout);}
	public void stencilInitialLayout(int value) {this.ptr.set(LAYOUT$stencilInitialLayout, OFFSET$stencilInitialLayout, value);}
	public java.lang.foreign.MemorySegment stencilInitialLayout_ptr() {return this.ptr.asSlice(OFFSET$stencilInitialLayout, LAYOUT$stencilInitialLayout);}

	public int stencilFinalLayout() {return this.ptr.get(LAYOUT$stencilFinalLayout, OFFSET$stencilFinalLayout);}
	public void stencilFinalLayout(int value) {this.ptr.set(LAYOUT$stencilFinalLayout, OFFSET$stencilFinalLayout, value);}
	public java.lang.foreign.MemorySegment stencilFinalLayout_ptr() {return this.ptr.asSlice(OFFSET$stencilFinalLayout, LAYOUT$stencilFinalLayout);}
}

package vulkan;

public record VkCommandBufferInheritanceViewportScissorInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportScissor2D = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewportScissor2D = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportDepthCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewportDepthCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pViewportDepths = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pViewportDepths = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$viewportScissor2D,
			LAYOUT$viewportDepthCount,
			LAYOUT$pViewportDepths
	).withName("VkCommandBufferInheritanceViewportScissorInfoNV");

	public VkCommandBufferInheritanceViewportScissorInfoNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int viewportScissor2D() {return this.ptr.get(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D);}
	public void viewportScissor2D(int value) {this.ptr.set(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D, value);}
	public java.lang.foreign.MemorySegment viewportScissor2D_ptr() {return this.ptr.asSlice(OFFSET$viewportScissor2D, LAYOUT$viewportScissor2D);}

	public int viewportDepthCount() {return this.ptr.get(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount);}
	public void viewportDepthCount(int value) {this.ptr.set(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount, value);}
	public java.lang.foreign.MemorySegment viewportDepthCount_ptr() {return this.ptr.asSlice(OFFSET$viewportDepthCount, LAYOUT$viewportDepthCount);}

	public java.lang.foreign.MemorySegment pViewportDepths() {return this.ptr.get(LAYOUT$pViewportDepths, OFFSET$pViewportDepths);}
	public void pViewportDepths(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewportDepths, OFFSET$pViewportDepths, value);}
	public java.lang.foreign.MemorySegment pViewportDepths_ptr() {return this.ptr.asSlice(OFFSET$pViewportDepths, LAYOUT$pViewportDepths);}
}

package vulkan;

public record VkDisplayPresentInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$srcRect = vulkan.VkRect2D.gStructLayout;
	public static final long OFFSET$srcRect = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$dstRect = vulkan.VkRect2D.gStructLayout;
	public static final long OFFSET$dstRect = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$persistent = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$persistent = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$srcRect,
			LAYOUT$dstRect,
			LAYOUT$persistent,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDisplayPresentInfoKHR");

	public VkDisplayPresentInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public vulkan.VkRect2D srcRect() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET$srcRect, LAYOUT$srcRect));}

	public vulkan.VkRect2D dstRect() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET$dstRect, LAYOUT$dstRect));}

	public int persistent() {return this.ptr.get(LAYOUT$persistent, OFFSET$persistent);}
	public void persistent(int value) {this.ptr.set(LAYOUT$persistent, OFFSET$persistent, value);}
	public java.lang.foreign.MemorySegment persistent_ptr() {return this.ptr.asSlice(OFFSET$persistent, LAYOUT$persistent);}
}

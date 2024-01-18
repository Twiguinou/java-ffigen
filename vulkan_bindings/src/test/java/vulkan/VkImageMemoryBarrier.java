package vulkan;

public record VkImageMemoryBarrier(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcAccessMask = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstAccessMask = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$oldLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$oldLayout = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$newLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$newLayout = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcQueueFamilyIndex = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstQueueFamilyIndex = 36L;
	public static final java.lang.foreign.AddressLayout LAYOUT$image = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$image = 40L;
	public static final java.lang.foreign.GroupLayout LAYOUT$subresourceRange = vulkan.VkImageSubresourceRange.gStructLayout;
	public static final long OFFSET$subresourceRange = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$srcAccessMask,
			LAYOUT$dstAccessMask,
			LAYOUT$oldLayout,
			LAYOUT$newLayout,
			LAYOUT$srcQueueFamilyIndex,
			LAYOUT$dstQueueFamilyIndex,
			LAYOUT$image,
			LAYOUT$subresourceRange,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkImageMemoryBarrier");

	public VkImageMemoryBarrier(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int srcAccessMask() {return this.ptr.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);}
	public void srcAccessMask(int value) {this.ptr.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);}
	public java.lang.foreign.MemorySegment srcAccessMask_ptr() {return this.ptr.asSlice(OFFSET$srcAccessMask, LAYOUT$srcAccessMask);}

	public int dstAccessMask() {return this.ptr.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);}
	public void dstAccessMask(int value) {this.ptr.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);}
	public java.lang.foreign.MemorySegment dstAccessMask_ptr() {return this.ptr.asSlice(OFFSET$dstAccessMask, LAYOUT$dstAccessMask);}

	public int oldLayout() {return this.ptr.get(LAYOUT$oldLayout, OFFSET$oldLayout);}
	public void oldLayout(int value) {this.ptr.set(LAYOUT$oldLayout, OFFSET$oldLayout, value);}
	public java.lang.foreign.MemorySegment oldLayout_ptr() {return this.ptr.asSlice(OFFSET$oldLayout, LAYOUT$oldLayout);}

	public int newLayout() {return this.ptr.get(LAYOUT$newLayout, OFFSET$newLayout);}
	public void newLayout(int value) {this.ptr.set(LAYOUT$newLayout, OFFSET$newLayout, value);}
	public java.lang.foreign.MemorySegment newLayout_ptr() {return this.ptr.asSlice(OFFSET$newLayout, LAYOUT$newLayout);}

	public int srcQueueFamilyIndex() {return this.ptr.get(LAYOUT$srcQueueFamilyIndex, OFFSET$srcQueueFamilyIndex);}
	public void srcQueueFamilyIndex(int value) {this.ptr.set(LAYOUT$srcQueueFamilyIndex, OFFSET$srcQueueFamilyIndex, value);}
	public java.lang.foreign.MemorySegment srcQueueFamilyIndex_ptr() {return this.ptr.asSlice(OFFSET$srcQueueFamilyIndex, LAYOUT$srcQueueFamilyIndex);}

	public int dstQueueFamilyIndex() {return this.ptr.get(LAYOUT$dstQueueFamilyIndex, OFFSET$dstQueueFamilyIndex);}
	public void dstQueueFamilyIndex(int value) {this.ptr.set(LAYOUT$dstQueueFamilyIndex, OFFSET$dstQueueFamilyIndex, value);}
	public java.lang.foreign.MemorySegment dstQueueFamilyIndex_ptr() {return this.ptr.asSlice(OFFSET$dstQueueFamilyIndex, LAYOUT$dstQueueFamilyIndex);}

	public java.lang.foreign.MemorySegment image() {return this.ptr.get(LAYOUT$image, OFFSET$image);}
	public void image(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$image, OFFSET$image, value);}
	public java.lang.foreign.MemorySegment image_ptr() {return this.ptr.asSlice(OFFSET$image, LAYOUT$image);}

	public vulkan.VkImageSubresourceRange subresourceRange() {return new vulkan.VkImageSubresourceRange(this.ptr.asSlice(OFFSET$subresourceRange, LAYOUT$subresourceRange));}
}

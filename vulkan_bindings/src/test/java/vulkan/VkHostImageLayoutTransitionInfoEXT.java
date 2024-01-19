package vulkan;

public record VkHostImageLayoutTransitionInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$image = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$image = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$oldLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$oldLayout = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$newLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$newLayout = 28L;
	public static final java.lang.foreign.GroupLayout LAYOUT$subresourceRange = vulkan.VkImageSubresourceRange.gStructLayout;
	public static final long OFFSET$subresourceRange = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$image,
			LAYOUT$oldLayout,
			LAYOUT$newLayout,
			LAYOUT$subresourceRange,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkHostImageLayoutTransitionInfoEXT");

	public VkHostImageLayoutTransitionInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment image() {return this.ptr.get(LAYOUT$image, OFFSET$image);}
	public void image(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$image, OFFSET$image, value);}
	public java.lang.foreign.MemorySegment image_ptr() {return this.ptr.asSlice(OFFSET$image, LAYOUT$image);}

	public int oldLayout() {return this.ptr.get(LAYOUT$oldLayout, OFFSET$oldLayout);}
	public void oldLayout(int value) {this.ptr.set(LAYOUT$oldLayout, OFFSET$oldLayout, value);}
	public java.lang.foreign.MemorySegment oldLayout_ptr() {return this.ptr.asSlice(OFFSET$oldLayout, LAYOUT$oldLayout);}

	public int newLayout() {return this.ptr.get(LAYOUT$newLayout, OFFSET$newLayout);}
	public void newLayout(int value) {this.ptr.set(LAYOUT$newLayout, OFFSET$newLayout, value);}
	public java.lang.foreign.MemorySegment newLayout_ptr() {return this.ptr.asSlice(OFFSET$newLayout, LAYOUT$newLayout);}

	public vulkan.VkImageSubresourceRange subresourceRange() {return new vulkan.VkImageSubresourceRange(this.ptr.asSlice(OFFSET$subresourceRange, LAYOUT$subresourceRange));}
}

package vulkan;

public record VkImageViewCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$image = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$image = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewType = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$format = 36L;
	public static final java.lang.foreign.GroupLayout LAYOUT$components = vulkan.VkComponentMapping.gStructLayout;
	public static final long OFFSET$components = 40L;
	public static final java.lang.foreign.GroupLayout LAYOUT$subresourceRange = vulkan.VkImageSubresourceRange.gStructLayout;
	public static final long OFFSET$subresourceRange = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$image,
			LAYOUT$viewType,
			LAYOUT$format,
			LAYOUT$components,
			LAYOUT$subresourceRange,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkImageViewCreateInfo");

	public VkImageViewCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public java.lang.foreign.MemorySegment image() {return this.ptr.get(LAYOUT$image, OFFSET$image);}
	public void image(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$image, OFFSET$image, value);}
	public java.lang.foreign.MemorySegment image_ptr() {return this.ptr.asSlice(OFFSET$image, LAYOUT$image);}

	public int viewType() {return this.ptr.get(LAYOUT$viewType, OFFSET$viewType);}
	public void viewType(int value) {this.ptr.set(LAYOUT$viewType, OFFSET$viewType, value);}
	public java.lang.foreign.MemorySegment viewType_ptr() {return this.ptr.asSlice(OFFSET$viewType, LAYOUT$viewType);}

	public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
	public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
	public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

	public vulkan.VkComponentMapping components() {return new vulkan.VkComponentMapping(this.ptr.asSlice(OFFSET$components, LAYOUT$components));}

	public vulkan.VkImageSubresourceRange subresourceRange() {return new vulkan.VkImageSubresourceRange(this.ptr.asSlice(OFFSET$subresourceRange, LAYOUT$subresourceRange));}
}

package vulkan;

public record VkSamplerBorderColorComponentMappingCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$components = vulkan.VkComponentMapping.gStructLayout;
	public static final long OFFSET$components = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srgb = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srgb = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$components,
			LAYOUT$srgb,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkSamplerBorderColorComponentMappingCreateInfoEXT");

	public VkSamplerBorderColorComponentMappingCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public vulkan.VkComponentMapping components() {return new vulkan.VkComponentMapping(this.ptr.asSlice(OFFSET$components, LAYOUT$components));}

	public int srgb() {return this.ptr.get(LAYOUT$srgb, OFFSET$srgb);}
	public void srgb(int value) {this.ptr.set(LAYOUT$srgb, OFFSET$srgb, value);}
	public java.lang.foreign.MemorySegment srgb_ptr() {return this.ptr.asSlice(OFFSET$srgb, LAYOUT$srgb);}
}

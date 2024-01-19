package vulkan;

public record VkPhysicalDeviceSamplerFilterMinmaxProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$filterMinmaxSingleComponentFormats = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$filterMinmaxSingleComponentFormats = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$filterMinmaxImageComponentMapping = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$filterMinmaxImageComponentMapping = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$filterMinmaxSingleComponentFormats,
			LAYOUT$filterMinmaxImageComponentMapping
	).withName("VkPhysicalDeviceSamplerFilterMinmaxProperties");

	public VkPhysicalDeviceSamplerFilterMinmaxProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int filterMinmaxSingleComponentFormats() {return this.ptr.get(LAYOUT$filterMinmaxSingleComponentFormats, OFFSET$filterMinmaxSingleComponentFormats);}
	public void filterMinmaxSingleComponentFormats(int value) {this.ptr.set(LAYOUT$filterMinmaxSingleComponentFormats, OFFSET$filterMinmaxSingleComponentFormats, value);}
	public java.lang.foreign.MemorySegment filterMinmaxSingleComponentFormats_ptr() {return this.ptr.asSlice(OFFSET$filterMinmaxSingleComponentFormats, LAYOUT$filterMinmaxSingleComponentFormats);}

	public int filterMinmaxImageComponentMapping() {return this.ptr.get(LAYOUT$filterMinmaxImageComponentMapping, OFFSET$filterMinmaxImageComponentMapping);}
	public void filterMinmaxImageComponentMapping(int value) {this.ptr.set(LAYOUT$filterMinmaxImageComponentMapping, OFFSET$filterMinmaxImageComponentMapping, value);}
	public java.lang.foreign.MemorySegment filterMinmaxImageComponentMapping_ptr() {return this.ptr.asSlice(OFFSET$filterMinmaxImageComponentMapping, LAYOUT$filterMinmaxImageComponentMapping);}
}

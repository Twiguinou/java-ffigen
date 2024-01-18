package vulkan;

public record VkImageViewSampleWeightCreateInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$filterCenter = vulkan.VkOffset2D.gStructLayout;
	public static final long OFFSET$filterCenter = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$filterSize = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$filterSize = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numPhases = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numPhases = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$filterCenter,
			LAYOUT$filterSize,
			LAYOUT$numPhases,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkImageViewSampleWeightCreateInfoQCOM");

	public VkImageViewSampleWeightCreateInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public vulkan.VkOffset2D filterCenter() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$filterCenter, LAYOUT$filterCenter));}

	public vulkan.VkExtent2D filterSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$filterSize, LAYOUT$filterSize));}

	public int numPhases() {return this.ptr.get(LAYOUT$numPhases, OFFSET$numPhases);}
	public void numPhases(int value) {this.ptr.set(LAYOUT$numPhases, OFFSET$numPhases, value);}
	public java.lang.foreign.MemorySegment numPhases_ptr() {return this.ptr.asSlice(OFFSET$numPhases, LAYOUT$numPhases);}
}

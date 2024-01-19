package vulkan;

public record VkPhysicalDeviceMemoryDecompressionPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$decompressionMethods = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$decompressionMethods = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxDecompressionIndirectCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxDecompressionIndirectCount = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$decompressionMethods,
			LAYOUT$maxDecompressionIndirectCount
	).withName("VkPhysicalDeviceMemoryDecompressionPropertiesNV");

	public VkPhysicalDeviceMemoryDecompressionPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public long decompressionMethods() {return this.ptr.get(LAYOUT$decompressionMethods, OFFSET$decompressionMethods);}
	public void decompressionMethods(long value) {this.ptr.set(LAYOUT$decompressionMethods, OFFSET$decompressionMethods, value);}
	public java.lang.foreign.MemorySegment decompressionMethods_ptr() {return this.ptr.asSlice(OFFSET$decompressionMethods, LAYOUT$decompressionMethods);}

	public long maxDecompressionIndirectCount() {return this.ptr.get(LAYOUT$maxDecompressionIndirectCount, OFFSET$maxDecompressionIndirectCount);}
	public void maxDecompressionIndirectCount(long value) {this.ptr.set(LAYOUT$maxDecompressionIndirectCount, OFFSET$maxDecompressionIndirectCount, value);}
	public java.lang.foreign.MemorySegment maxDecompressionIndirectCount_ptr() {return this.ptr.asSlice(OFFSET$maxDecompressionIndirectCount, LAYOUT$maxDecompressionIndirectCount);}
}

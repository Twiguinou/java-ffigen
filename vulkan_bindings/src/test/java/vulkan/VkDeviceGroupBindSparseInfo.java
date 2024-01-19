package vulkan;

public record VkDeviceGroupBindSparseInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$resourceDeviceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$resourceDeviceIndex = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryDeviceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$memoryDeviceIndex = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$resourceDeviceIndex,
			LAYOUT$memoryDeviceIndex
	).withName("VkDeviceGroupBindSparseInfo");

	public VkDeviceGroupBindSparseInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int resourceDeviceIndex() {return this.ptr.get(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex);}
	public void resourceDeviceIndex(int value) {this.ptr.set(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex, value);}
	public java.lang.foreign.MemorySegment resourceDeviceIndex_ptr() {return this.ptr.asSlice(OFFSET$resourceDeviceIndex, LAYOUT$resourceDeviceIndex);}

	public int memoryDeviceIndex() {return this.ptr.get(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex);}
	public void memoryDeviceIndex(int value) {this.ptr.set(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex, value);}
	public java.lang.foreign.MemorySegment memoryDeviceIndex_ptr() {return this.ptr.asSlice(OFFSET$memoryDeviceIndex, LAYOUT$memoryDeviceIndex);}
}

package vulkan;

public record VkPhysicalDeviceSubgroupProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$subgroupSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedStages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedStages = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedOperations = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedOperations = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$quadOperationsInAllStages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$quadOperationsInAllStages = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$subgroupSize,
			LAYOUT$supportedStages,
			LAYOUT$supportedOperations,
			LAYOUT$quadOperationsInAllStages
	).withName("VkPhysicalDeviceSubgroupProperties");

	public VkPhysicalDeviceSubgroupProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int subgroupSize() {return this.ptr.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);}
	public void subgroupSize(int value) {this.ptr.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);}
	public java.lang.foreign.MemorySegment subgroupSize_ptr() {return this.ptr.asSlice(OFFSET$subgroupSize, LAYOUT$subgroupSize);}

	public int supportedStages() {return this.ptr.get(LAYOUT$supportedStages, OFFSET$supportedStages);}
	public void supportedStages(int value) {this.ptr.set(LAYOUT$supportedStages, OFFSET$supportedStages, value);}
	public java.lang.foreign.MemorySegment supportedStages_ptr() {return this.ptr.asSlice(OFFSET$supportedStages, LAYOUT$supportedStages);}

	public int supportedOperations() {return this.ptr.get(LAYOUT$supportedOperations, OFFSET$supportedOperations);}
	public void supportedOperations(int value) {this.ptr.set(LAYOUT$supportedOperations, OFFSET$supportedOperations, value);}
	public java.lang.foreign.MemorySegment supportedOperations_ptr() {return this.ptr.asSlice(OFFSET$supportedOperations, LAYOUT$supportedOperations);}

	public int quadOperationsInAllStages() {return this.ptr.get(LAYOUT$quadOperationsInAllStages, OFFSET$quadOperationsInAllStages);}
	public void quadOperationsInAllStages(int value) {this.ptr.set(LAYOUT$quadOperationsInAllStages, OFFSET$quadOperationsInAllStages, value);}
	public java.lang.foreign.MemorySegment quadOperationsInAllStages_ptr() {return this.ptr.asSlice(OFFSET$quadOperationsInAllStages, LAYOUT$quadOperationsInAllStages);}
}

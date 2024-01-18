package vulkan;

public record VkPhysicalDeviceSubgroupSizeControlProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minSubgroupSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxSubgroupSize = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxComputeWorkgroupSubgroups = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxComputeWorkgroupSubgroups = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$requiredSubgroupSizeStages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$requiredSubgroupSizeStages = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$minSubgroupSize,
			LAYOUT$maxSubgroupSize,
			LAYOUT$maxComputeWorkgroupSubgroups,
			LAYOUT$requiredSubgroupSizeStages
	).withName("VkPhysicalDeviceSubgroupSizeControlProperties");

	public VkPhysicalDeviceSubgroupSizeControlProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int minSubgroupSize() {return this.ptr.get(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize);}
	public void minSubgroupSize(int value) {this.ptr.set(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize, value);}
	public java.lang.foreign.MemorySegment minSubgroupSize_ptr() {return this.ptr.asSlice(OFFSET$minSubgroupSize, LAYOUT$minSubgroupSize);}

	public int maxSubgroupSize() {return this.ptr.get(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize);}
	public void maxSubgroupSize(int value) {this.ptr.set(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize, value);}
	public java.lang.foreign.MemorySegment maxSubgroupSize_ptr() {return this.ptr.asSlice(OFFSET$maxSubgroupSize, LAYOUT$maxSubgroupSize);}

	public int maxComputeWorkgroupSubgroups() {return this.ptr.get(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups);}
	public void maxComputeWorkgroupSubgroups(int value) {this.ptr.set(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups, value);}
	public java.lang.foreign.MemorySegment maxComputeWorkgroupSubgroups_ptr() {return this.ptr.asSlice(OFFSET$maxComputeWorkgroupSubgroups, LAYOUT$maxComputeWorkgroupSubgroups);}

	public int requiredSubgroupSizeStages() {return this.ptr.get(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages);}
	public void requiredSubgroupSizeStages(int value) {this.ptr.set(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages, value);}
	public java.lang.foreign.MemorySegment requiredSubgroupSizeStages_ptr() {return this.ptr.asSlice(OFFSET$requiredSubgroupSizeStages, LAYOUT$requiredSubgroupSizeStages);}
}

package vulkan;

public record VkPhysicalDeviceVulkanMemoryModelFeatures(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vulkanMemoryModel = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vulkanMemoryModel = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vulkanMemoryModelDeviceScope = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vulkanMemoryModelDeviceScope = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vulkanMemoryModelAvailabilityVisibilityChains = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$vulkanMemoryModel,
			LAYOUT$vulkanMemoryModelDeviceScope,
			LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceVulkanMemoryModelFeatures");

	public VkPhysicalDeviceVulkanMemoryModelFeatures(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int vulkanMemoryModel() {return this.ptr.get(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel);}
	public void vulkanMemoryModel(int value) {this.ptr.set(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel, value);}
	public java.lang.foreign.MemorySegment vulkanMemoryModel_ptr() {return this.ptr.asSlice(OFFSET$vulkanMemoryModel, LAYOUT$vulkanMemoryModel);}

	public int vulkanMemoryModelDeviceScope() {return this.ptr.get(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope);}
	public void vulkanMemoryModelDeviceScope(int value) {this.ptr.set(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope, value);}
	public java.lang.foreign.MemorySegment vulkanMemoryModelDeviceScope_ptr() {return this.ptr.asSlice(OFFSET$vulkanMemoryModelDeviceScope, LAYOUT$vulkanMemoryModelDeviceScope);}

	public int vulkanMemoryModelAvailabilityVisibilityChains() {return this.ptr.get(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains);}
	public void vulkanMemoryModelAvailabilityVisibilityChains(int value) {this.ptr.set(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, value);}
	public java.lang.foreign.MemorySegment vulkanMemoryModelAvailabilityVisibilityChains_ptr() {return this.ptr.asSlice(OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains);}
}

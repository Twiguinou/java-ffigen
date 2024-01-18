package vulkan;

public record VkPhysicalDeviceShaderCoreProperties2AMD(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderCoreFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderCoreFeatures = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$activeComputeUnitCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$activeComputeUnitCount = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderCoreFeatures,
			LAYOUT$activeComputeUnitCount
	).withName("VkPhysicalDeviceShaderCoreProperties2AMD");

	public VkPhysicalDeviceShaderCoreProperties2AMD(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int shaderCoreFeatures() {return this.ptr.get(LAYOUT$shaderCoreFeatures, OFFSET$shaderCoreFeatures);}
	public void shaderCoreFeatures(int value) {this.ptr.set(LAYOUT$shaderCoreFeatures, OFFSET$shaderCoreFeatures, value);}
	public java.lang.foreign.MemorySegment shaderCoreFeatures_ptr() {return this.ptr.asSlice(OFFSET$shaderCoreFeatures, LAYOUT$shaderCoreFeatures);}

	public int activeComputeUnitCount() {return this.ptr.get(LAYOUT$activeComputeUnitCount, OFFSET$activeComputeUnitCount);}
	public void activeComputeUnitCount(int value) {this.ptr.set(LAYOUT$activeComputeUnitCount, OFFSET$activeComputeUnitCount, value);}
	public java.lang.foreign.MemorySegment activeComputeUnitCount_ptr() {return this.ptr.asSlice(OFFSET$activeComputeUnitCount, LAYOUT$activeComputeUnitCount);}
}

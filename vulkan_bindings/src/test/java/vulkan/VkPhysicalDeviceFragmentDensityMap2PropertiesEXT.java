package vulkan;

public record VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subsampledLoads = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$subsampledLoads = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subsampledCoarseReconstructionEarlyAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$subsampledCoarseReconstructionEarlyAccess = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSubsampledArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxSubsampledArrayLayers = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetSubsampledSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetSubsampledSamplers = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$subsampledLoads,
			LAYOUT$subsampledCoarseReconstructionEarlyAccess,
			LAYOUT$maxSubsampledArrayLayers,
			LAYOUT$maxDescriptorSetSubsampledSamplers
	).withName("VkPhysicalDeviceFragmentDensityMap2PropertiesEXT");

	public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int subsampledLoads() {return this.ptr.get(LAYOUT$subsampledLoads, OFFSET$subsampledLoads);}
	public void subsampledLoads(int value) {this.ptr.set(LAYOUT$subsampledLoads, OFFSET$subsampledLoads, value);}
	public java.lang.foreign.MemorySegment subsampledLoads_ptr() {return this.ptr.asSlice(OFFSET$subsampledLoads, LAYOUT$subsampledLoads);}

	public int subsampledCoarseReconstructionEarlyAccess() {return this.ptr.get(LAYOUT$subsampledCoarseReconstructionEarlyAccess, OFFSET$subsampledCoarseReconstructionEarlyAccess);}
	public void subsampledCoarseReconstructionEarlyAccess(int value) {this.ptr.set(LAYOUT$subsampledCoarseReconstructionEarlyAccess, OFFSET$subsampledCoarseReconstructionEarlyAccess, value);}
	public java.lang.foreign.MemorySegment subsampledCoarseReconstructionEarlyAccess_ptr() {return this.ptr.asSlice(OFFSET$subsampledCoarseReconstructionEarlyAccess, LAYOUT$subsampledCoarseReconstructionEarlyAccess);}

	public int maxSubsampledArrayLayers() {return this.ptr.get(LAYOUT$maxSubsampledArrayLayers, OFFSET$maxSubsampledArrayLayers);}
	public void maxSubsampledArrayLayers(int value) {this.ptr.set(LAYOUT$maxSubsampledArrayLayers, OFFSET$maxSubsampledArrayLayers, value);}
	public java.lang.foreign.MemorySegment maxSubsampledArrayLayers_ptr() {return this.ptr.asSlice(OFFSET$maxSubsampledArrayLayers, LAYOUT$maxSubsampledArrayLayers);}

	public int maxDescriptorSetSubsampledSamplers() {return this.ptr.get(LAYOUT$maxDescriptorSetSubsampledSamplers, OFFSET$maxDescriptorSetSubsampledSamplers);}
	public void maxDescriptorSetSubsampledSamplers(int value) {this.ptr.set(LAYOUT$maxDescriptorSetSubsampledSamplers, OFFSET$maxDescriptorSetSubsampledSamplers, value);}
	public java.lang.foreign.MemorySegment maxDescriptorSetSubsampledSamplers_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetSubsampledSamplers, LAYOUT$maxDescriptorSetSubsampledSamplers);}
}

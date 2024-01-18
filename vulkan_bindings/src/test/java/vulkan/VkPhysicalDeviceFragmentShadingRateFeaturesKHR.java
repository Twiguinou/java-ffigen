package vulkan;

public record VkPhysicalDeviceFragmentShadingRateFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineFragmentShadingRate = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pipelineFragmentShadingRate = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveFragmentShadingRate = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$primitiveFragmentShadingRate = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentFragmentShadingRate = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$attachmentFragmentShadingRate = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$pipelineFragmentShadingRate,
			LAYOUT$primitiveFragmentShadingRate,
			LAYOUT$attachmentFragmentShadingRate,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceFragmentShadingRateFeaturesKHR");

	public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int pipelineFragmentShadingRate() {return this.ptr.get(LAYOUT$pipelineFragmentShadingRate, OFFSET$pipelineFragmentShadingRate);}
	public void pipelineFragmentShadingRate(int value) {this.ptr.set(LAYOUT$pipelineFragmentShadingRate, OFFSET$pipelineFragmentShadingRate, value);}
	public java.lang.foreign.MemorySegment pipelineFragmentShadingRate_ptr() {return this.ptr.asSlice(OFFSET$pipelineFragmentShadingRate, LAYOUT$pipelineFragmentShadingRate);}

	public int primitiveFragmentShadingRate() {return this.ptr.get(LAYOUT$primitiveFragmentShadingRate, OFFSET$primitiveFragmentShadingRate);}
	public void primitiveFragmentShadingRate(int value) {this.ptr.set(LAYOUT$primitiveFragmentShadingRate, OFFSET$primitiveFragmentShadingRate, value);}
	public java.lang.foreign.MemorySegment primitiveFragmentShadingRate_ptr() {return this.ptr.asSlice(OFFSET$primitiveFragmentShadingRate, LAYOUT$primitiveFragmentShadingRate);}

	public int attachmentFragmentShadingRate() {return this.ptr.get(LAYOUT$attachmentFragmentShadingRate, OFFSET$attachmentFragmentShadingRate);}
	public void attachmentFragmentShadingRate(int value) {this.ptr.set(LAYOUT$attachmentFragmentShadingRate, OFFSET$attachmentFragmentShadingRate, value);}
	public java.lang.foreign.MemorySegment attachmentFragmentShadingRate_ptr() {return this.ptr.asSlice(OFFSET$attachmentFragmentShadingRate, LAYOUT$attachmentFragmentShadingRate);}
}

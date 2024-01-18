package vulkan;

public record VkRayTracingPipelineInterfaceCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPipelineRayPayloadSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPipelineRayPayloadSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPipelineRayHitAttributeSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPipelineRayHitAttributeSize = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$maxPipelineRayPayloadSize,
			LAYOUT$maxPipelineRayHitAttributeSize
	).withName("VkRayTracingPipelineInterfaceCreateInfoKHR");

	public VkRayTracingPipelineInterfaceCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int maxPipelineRayPayloadSize() {return this.ptr.get(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize);}
	public void maxPipelineRayPayloadSize(int value) {this.ptr.set(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize, value);}
	public java.lang.foreign.MemorySegment maxPipelineRayPayloadSize_ptr() {return this.ptr.asSlice(OFFSET$maxPipelineRayPayloadSize, LAYOUT$maxPipelineRayPayloadSize);}

	public int maxPipelineRayHitAttributeSize() {return this.ptr.get(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize);}
	public void maxPipelineRayHitAttributeSize(int value) {this.ptr.set(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize, value);}
	public java.lang.foreign.MemorySegment maxPipelineRayHitAttributeSize_ptr() {return this.ptr.asSlice(OFFSET$maxPipelineRayHitAttributeSize, LAYOUT$maxPipelineRayHitAttributeSize);}
}

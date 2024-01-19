package vulkan;

public record VkPhysicalDeviceRayTracingPipelinePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderGroupHandleSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderGroupHandleSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxRayRecursionDepth = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxRayRecursionDepth = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxShaderGroupStride = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxShaderGroupStride = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderGroupBaseAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderGroupBaseAlignment = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderGroupHandleCaptureReplaySize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderGroupHandleCaptureReplaySize = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxRayDispatchInvocationCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxRayDispatchInvocationCount = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderGroupHandleAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderGroupHandleAlignment = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxRayHitAttributeSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxRayHitAttributeSize = 44L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderGroupHandleSize,
			LAYOUT$maxRayRecursionDepth,
			LAYOUT$maxShaderGroupStride,
			LAYOUT$shaderGroupBaseAlignment,
			LAYOUT$shaderGroupHandleCaptureReplaySize,
			LAYOUT$maxRayDispatchInvocationCount,
			LAYOUT$shaderGroupHandleAlignment,
			LAYOUT$maxRayHitAttributeSize
	).withName("VkPhysicalDeviceRayTracingPipelinePropertiesKHR");

	public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int shaderGroupHandleSize() {return this.ptr.get(LAYOUT$shaderGroupHandleSize, OFFSET$shaderGroupHandleSize);}
	public void shaderGroupHandleSize(int value) {this.ptr.set(LAYOUT$shaderGroupHandleSize, OFFSET$shaderGroupHandleSize, value);}
	public java.lang.foreign.MemorySegment shaderGroupHandleSize_ptr() {return this.ptr.asSlice(OFFSET$shaderGroupHandleSize, LAYOUT$shaderGroupHandleSize);}

	public int maxRayRecursionDepth() {return this.ptr.get(LAYOUT$maxRayRecursionDepth, OFFSET$maxRayRecursionDepth);}
	public void maxRayRecursionDepth(int value) {this.ptr.set(LAYOUT$maxRayRecursionDepth, OFFSET$maxRayRecursionDepth, value);}
	public java.lang.foreign.MemorySegment maxRayRecursionDepth_ptr() {return this.ptr.asSlice(OFFSET$maxRayRecursionDepth, LAYOUT$maxRayRecursionDepth);}

	public int maxShaderGroupStride() {return this.ptr.get(LAYOUT$maxShaderGroupStride, OFFSET$maxShaderGroupStride);}
	public void maxShaderGroupStride(int value) {this.ptr.set(LAYOUT$maxShaderGroupStride, OFFSET$maxShaderGroupStride, value);}
	public java.lang.foreign.MemorySegment maxShaderGroupStride_ptr() {return this.ptr.asSlice(OFFSET$maxShaderGroupStride, LAYOUT$maxShaderGroupStride);}

	public int shaderGroupBaseAlignment() {return this.ptr.get(LAYOUT$shaderGroupBaseAlignment, OFFSET$shaderGroupBaseAlignment);}
	public void shaderGroupBaseAlignment(int value) {this.ptr.set(LAYOUT$shaderGroupBaseAlignment, OFFSET$shaderGroupBaseAlignment, value);}
	public java.lang.foreign.MemorySegment shaderGroupBaseAlignment_ptr() {return this.ptr.asSlice(OFFSET$shaderGroupBaseAlignment, LAYOUT$shaderGroupBaseAlignment);}

	public int shaderGroupHandleCaptureReplaySize() {return this.ptr.get(LAYOUT$shaderGroupHandleCaptureReplaySize, OFFSET$shaderGroupHandleCaptureReplaySize);}
	public void shaderGroupHandleCaptureReplaySize(int value) {this.ptr.set(LAYOUT$shaderGroupHandleCaptureReplaySize, OFFSET$shaderGroupHandleCaptureReplaySize, value);}
	public java.lang.foreign.MemorySegment shaderGroupHandleCaptureReplaySize_ptr() {return this.ptr.asSlice(OFFSET$shaderGroupHandleCaptureReplaySize, LAYOUT$shaderGroupHandleCaptureReplaySize);}

	public int maxRayDispatchInvocationCount() {return this.ptr.get(LAYOUT$maxRayDispatchInvocationCount, OFFSET$maxRayDispatchInvocationCount);}
	public void maxRayDispatchInvocationCount(int value) {this.ptr.set(LAYOUT$maxRayDispatchInvocationCount, OFFSET$maxRayDispatchInvocationCount, value);}
	public java.lang.foreign.MemorySegment maxRayDispatchInvocationCount_ptr() {return this.ptr.asSlice(OFFSET$maxRayDispatchInvocationCount, LAYOUT$maxRayDispatchInvocationCount);}

	public int shaderGroupHandleAlignment() {return this.ptr.get(LAYOUT$shaderGroupHandleAlignment, OFFSET$shaderGroupHandleAlignment);}
	public void shaderGroupHandleAlignment(int value) {this.ptr.set(LAYOUT$shaderGroupHandleAlignment, OFFSET$shaderGroupHandleAlignment, value);}
	public java.lang.foreign.MemorySegment shaderGroupHandleAlignment_ptr() {return this.ptr.asSlice(OFFSET$shaderGroupHandleAlignment, LAYOUT$shaderGroupHandleAlignment);}

	public int maxRayHitAttributeSize() {return this.ptr.get(LAYOUT$maxRayHitAttributeSize, OFFSET$maxRayHitAttributeSize);}
	public void maxRayHitAttributeSize(int value) {this.ptr.set(LAYOUT$maxRayHitAttributeSize, OFFSET$maxRayHitAttributeSize, value);}
	public java.lang.foreign.MemorySegment maxRayHitAttributeSize_ptr() {return this.ptr.asSlice(OFFSET$maxRayHitAttributeSize, LAYOUT$maxRayHitAttributeSize);}
}

package vulkan;

public record VkPhysicalDeviceRayTracingPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderGroupHandleSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderGroupHandleSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxRecursionDepth = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxRecursionDepth = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxShaderGroupStride = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxShaderGroupStride = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderGroupBaseAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderGroupBaseAlignment = 28L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxGeometryCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxGeometryCount = 32L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxInstanceCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxInstanceCount = 40L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxTriangleCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxTriangleCount = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetAccelerationStructures = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderGroupHandleSize,
			LAYOUT$maxRecursionDepth,
			LAYOUT$maxShaderGroupStride,
			LAYOUT$shaderGroupBaseAlignment,
			LAYOUT$maxGeometryCount,
			LAYOUT$maxInstanceCount,
			LAYOUT$maxTriangleCount,
			LAYOUT$maxDescriptorSetAccelerationStructures,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceRayTracingPropertiesNV");

	public VkPhysicalDeviceRayTracingPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
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

	public int maxRecursionDepth() {return this.ptr.get(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth);}
	public void maxRecursionDepth(int value) {this.ptr.set(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth, value);}
	public java.lang.foreign.MemorySegment maxRecursionDepth_ptr() {return this.ptr.asSlice(OFFSET$maxRecursionDepth, LAYOUT$maxRecursionDepth);}

	public int maxShaderGroupStride() {return this.ptr.get(LAYOUT$maxShaderGroupStride, OFFSET$maxShaderGroupStride);}
	public void maxShaderGroupStride(int value) {this.ptr.set(LAYOUT$maxShaderGroupStride, OFFSET$maxShaderGroupStride, value);}
	public java.lang.foreign.MemorySegment maxShaderGroupStride_ptr() {return this.ptr.asSlice(OFFSET$maxShaderGroupStride, LAYOUT$maxShaderGroupStride);}

	public int shaderGroupBaseAlignment() {return this.ptr.get(LAYOUT$shaderGroupBaseAlignment, OFFSET$shaderGroupBaseAlignment);}
	public void shaderGroupBaseAlignment(int value) {this.ptr.set(LAYOUT$shaderGroupBaseAlignment, OFFSET$shaderGroupBaseAlignment, value);}
	public java.lang.foreign.MemorySegment shaderGroupBaseAlignment_ptr() {return this.ptr.asSlice(OFFSET$shaderGroupBaseAlignment, LAYOUT$shaderGroupBaseAlignment);}

	public long maxGeometryCount() {return this.ptr.get(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount);}
	public void maxGeometryCount(long value) {this.ptr.set(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount, value);}
	public java.lang.foreign.MemorySegment maxGeometryCount_ptr() {return this.ptr.asSlice(OFFSET$maxGeometryCount, LAYOUT$maxGeometryCount);}

	public long maxInstanceCount() {return this.ptr.get(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount);}
	public void maxInstanceCount(long value) {this.ptr.set(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount, value);}
	public java.lang.foreign.MemorySegment maxInstanceCount_ptr() {return this.ptr.asSlice(OFFSET$maxInstanceCount, LAYOUT$maxInstanceCount);}

	public long maxTriangleCount() {return this.ptr.get(LAYOUT$maxTriangleCount, OFFSET$maxTriangleCount);}
	public void maxTriangleCount(long value) {this.ptr.set(LAYOUT$maxTriangleCount, OFFSET$maxTriangleCount, value);}
	public java.lang.foreign.MemorySegment maxTriangleCount_ptr() {return this.ptr.asSlice(OFFSET$maxTriangleCount, LAYOUT$maxTriangleCount);}

	public int maxDescriptorSetAccelerationStructures() {return this.ptr.get(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures);}
	public void maxDescriptorSetAccelerationStructures(int value) {this.ptr.set(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures, value);}
	public java.lang.foreign.MemorySegment maxDescriptorSetAccelerationStructures_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetAccelerationStructures, LAYOUT$maxDescriptorSetAccelerationStructures);}
}

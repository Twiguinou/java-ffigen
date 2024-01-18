package vulkan;

public record VkPhysicalDeviceAccelerationStructurePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxGeometryCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxGeometryCount = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxInstanceCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxInstanceCount = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxPrimitiveCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxPrimitiveCount = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorAccelerationStructures = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetAccelerationStructures = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minAccelerationStructureScratchOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minAccelerationStructureScratchOffsetAlignment = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$maxGeometryCount,
			LAYOUT$maxInstanceCount,
			LAYOUT$maxPrimitiveCount,
			LAYOUT$maxPerStageDescriptorAccelerationStructures,
			LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures,
			LAYOUT$maxDescriptorSetAccelerationStructures,
			LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures,
			LAYOUT$minAccelerationStructureScratchOffsetAlignment,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceAccelerationStructurePropertiesKHR");

	public VkPhysicalDeviceAccelerationStructurePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public long maxGeometryCount() {return this.ptr.get(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount);}
	public void maxGeometryCount(long value) {this.ptr.set(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount, value);}
	public java.lang.foreign.MemorySegment maxGeometryCount_ptr() {return this.ptr.asSlice(OFFSET$maxGeometryCount, LAYOUT$maxGeometryCount);}

	public long maxInstanceCount() {return this.ptr.get(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount);}
	public void maxInstanceCount(long value) {this.ptr.set(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount, value);}
	public java.lang.foreign.MemorySegment maxInstanceCount_ptr() {return this.ptr.asSlice(OFFSET$maxInstanceCount, LAYOUT$maxInstanceCount);}

	public long maxPrimitiveCount() {return this.ptr.get(LAYOUT$maxPrimitiveCount, OFFSET$maxPrimitiveCount);}
	public void maxPrimitiveCount(long value) {this.ptr.set(LAYOUT$maxPrimitiveCount, OFFSET$maxPrimitiveCount, value);}
	public java.lang.foreign.MemorySegment maxPrimitiveCount_ptr() {return this.ptr.asSlice(OFFSET$maxPrimitiveCount, LAYOUT$maxPrimitiveCount);}

	public int maxPerStageDescriptorAccelerationStructures() {return this.ptr.get(LAYOUT$maxPerStageDescriptorAccelerationStructures, OFFSET$maxPerStageDescriptorAccelerationStructures);}
	public void maxPerStageDescriptorAccelerationStructures(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorAccelerationStructures, OFFSET$maxPerStageDescriptorAccelerationStructures, value);}
	public java.lang.foreign.MemorySegment maxPerStageDescriptorAccelerationStructures_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorAccelerationStructures, LAYOUT$maxPerStageDescriptorAccelerationStructures);}

	public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures);}
	public void maxPerStageDescriptorUpdateAfterBindAccelerationStructures(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, value);}
	public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindAccelerationStructures_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures);}

	public int maxDescriptorSetAccelerationStructures() {return this.ptr.get(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures);}
	public void maxDescriptorSetAccelerationStructures(int value) {this.ptr.set(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures, value);}
	public java.lang.foreign.MemorySegment maxDescriptorSetAccelerationStructures_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetAccelerationStructures, LAYOUT$maxDescriptorSetAccelerationStructures);}

	public int maxDescriptorSetUpdateAfterBindAccelerationStructures() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures);}
	public void maxDescriptorSetUpdateAfterBindAccelerationStructures(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures, value);}
	public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindAccelerationStructures_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures, LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures);}

	public int minAccelerationStructureScratchOffsetAlignment() {return this.ptr.get(LAYOUT$minAccelerationStructureScratchOffsetAlignment, OFFSET$minAccelerationStructureScratchOffsetAlignment);}
	public void minAccelerationStructureScratchOffsetAlignment(int value) {this.ptr.set(LAYOUT$minAccelerationStructureScratchOffsetAlignment, OFFSET$minAccelerationStructureScratchOffsetAlignment, value);}
	public java.lang.foreign.MemorySegment minAccelerationStructureScratchOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minAccelerationStructureScratchOffsetAlignment, LAYOUT$minAccelerationStructureScratchOffsetAlignment);}
}

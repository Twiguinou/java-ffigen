package vulkan;

public record VkWriteDescriptorSetAccelerationStructureNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$accelerationStructureCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$accelerationStructureCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pAccelerationStructures = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pAccelerationStructures = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$accelerationStructureCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pAccelerationStructures
	).withName("VkWriteDescriptorSetAccelerationStructureNV");

	public VkWriteDescriptorSetAccelerationStructureNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int accelerationStructureCount() {return this.ptr.get(LAYOUT$accelerationStructureCount, OFFSET$accelerationStructureCount);}
	public void accelerationStructureCount(int value) {this.ptr.set(LAYOUT$accelerationStructureCount, OFFSET$accelerationStructureCount, value);}
	public java.lang.foreign.MemorySegment accelerationStructureCount_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureCount, LAYOUT$accelerationStructureCount);}

	public java.lang.foreign.MemorySegment pAccelerationStructures() {return this.ptr.get(LAYOUT$pAccelerationStructures, OFFSET$pAccelerationStructures);}
	public void pAccelerationStructures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAccelerationStructures, OFFSET$pAccelerationStructures, value);}
	public java.lang.foreign.MemorySegment pAccelerationStructures_ptr() {return this.ptr.asSlice(OFFSET$pAccelerationStructures, LAYOUT$pAccelerationStructures);}
}

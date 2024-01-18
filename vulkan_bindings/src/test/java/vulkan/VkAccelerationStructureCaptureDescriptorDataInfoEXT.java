package vulkan;

public record VkAccelerationStructureCaptureDescriptorDataInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$accelerationStructure = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$accelerationStructure = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$accelerationStructureNV = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$accelerationStructureNV = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$accelerationStructure,
			LAYOUT$accelerationStructureNV
	).withName("VkAccelerationStructureCaptureDescriptorDataInfoEXT");

	public VkAccelerationStructureCaptureDescriptorDataInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment accelerationStructure() {return this.ptr.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);}
	public void accelerationStructure(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);}
	public java.lang.foreign.MemorySegment accelerationStructure_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructure, LAYOUT$accelerationStructure);}

	public java.lang.foreign.MemorySegment accelerationStructureNV() {return this.ptr.get(LAYOUT$accelerationStructureNV, OFFSET$accelerationStructureNV);}
	public void accelerationStructureNV(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$accelerationStructureNV, OFFSET$accelerationStructureNV, value);}
	public java.lang.foreign.MemorySegment accelerationStructureNV_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureNV, LAYOUT$accelerationStructureNV);}
}

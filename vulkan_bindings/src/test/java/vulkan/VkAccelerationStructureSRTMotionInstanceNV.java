package vulkan;

public record VkAccelerationStructureSRTMotionInstanceNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$transformT0 = vulkan.VkSRTDataNV.gStructLayout;
	public static final long OFFSET$transformT0 = 0L;
	public static final java.lang.foreign.GroupLayout LAYOUT$transformT1 = vulkan.VkSRTDataNV.gStructLayout;
	public static final long OFFSET$transformT1 = 64L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$accelerationStructureReference = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$accelerationStructureReference = 136L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$transformT0,
			LAYOUT$transformT1,
			java.lang.foreign.MemoryLayout.paddingLayout(8),
			LAYOUT$accelerationStructureReference
	).withName("VkAccelerationStructureSRTMotionInstanceNV");

	public VkAccelerationStructureSRTMotionInstanceNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkSRTDataNV transformT0() {return new vulkan.VkSRTDataNV(this.ptr.asSlice(OFFSET$transformT0, LAYOUT$transformT0));}

	public vulkan.VkSRTDataNV transformT1() {return new vulkan.VkSRTDataNV(this.ptr.asSlice(OFFSET$transformT1, LAYOUT$transformT1));}

	public long accelerationStructureReference() {return this.ptr.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);}
	public void accelerationStructureReference(long value) {this.ptr.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);}
	public java.lang.foreign.MemorySegment accelerationStructureReference_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureReference, LAYOUT$accelerationStructureReference);}
}

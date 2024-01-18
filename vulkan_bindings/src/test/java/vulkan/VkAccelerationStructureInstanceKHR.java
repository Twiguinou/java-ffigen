package vulkan;

public record VkAccelerationStructureInstanceKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$transform = vulkan.VkTransformMatrixKHR.gStructLayout;
	public static final long OFFSET$transform = 0L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$accelerationStructureReference = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$accelerationStructureReference = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$transform,
			java.lang.foreign.MemoryLayout.paddingLayout(8),
			LAYOUT$accelerationStructureReference
	).withName("VkAccelerationStructureInstanceKHR");

	public VkAccelerationStructureInstanceKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkTransformMatrixKHR transform() {return new vulkan.VkTransformMatrixKHR(this.ptr.asSlice(OFFSET$transform, LAYOUT$transform));}

	public long accelerationStructureReference() {return this.ptr.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);}
	public void accelerationStructureReference(long value) {this.ptr.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);}
	public java.lang.foreign.MemorySegment accelerationStructureReference_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureReference, LAYOUT$accelerationStructureReference);}
}

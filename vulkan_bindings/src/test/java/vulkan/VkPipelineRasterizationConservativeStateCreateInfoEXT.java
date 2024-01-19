package vulkan;

public record VkPipelineRasterizationConservativeStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$conservativeRasterizationMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$conservativeRasterizationMode = 20L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$extraPrimitiveOverestimationSize = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$extraPrimitiveOverestimationSize = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$conservativeRasterizationMode,
			LAYOUT$extraPrimitiveOverestimationSize,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPipelineRasterizationConservativeStateCreateInfoEXT");

	public VkPipelineRasterizationConservativeStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public int conservativeRasterizationMode() {return this.ptr.get(LAYOUT$conservativeRasterizationMode, OFFSET$conservativeRasterizationMode);}
	public void conservativeRasterizationMode(int value) {this.ptr.set(LAYOUT$conservativeRasterizationMode, OFFSET$conservativeRasterizationMode, value);}
	public java.lang.foreign.MemorySegment conservativeRasterizationMode_ptr() {return this.ptr.asSlice(OFFSET$conservativeRasterizationMode, LAYOUT$conservativeRasterizationMode);}

	public float extraPrimitiveOverestimationSize() {return this.ptr.get(LAYOUT$extraPrimitiveOverestimationSize, OFFSET$extraPrimitiveOverestimationSize);}
	public void extraPrimitiveOverestimationSize(float value) {this.ptr.set(LAYOUT$extraPrimitiveOverestimationSize, OFFSET$extraPrimitiveOverestimationSize, value);}
	public java.lang.foreign.MemorySegment extraPrimitiveOverestimationSize_ptr() {return this.ptr.asSlice(OFFSET$extraPrimitiveOverestimationSize, LAYOUT$extraPrimitiveOverestimationSize);}
}

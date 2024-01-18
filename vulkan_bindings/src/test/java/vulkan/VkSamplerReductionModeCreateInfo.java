package vulkan;

public record VkSamplerReductionModeCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$reductionMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$reductionMode = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$reductionMode,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkSamplerReductionModeCreateInfo");

	public VkSamplerReductionModeCreateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int reductionMode() {return this.ptr.get(LAYOUT$reductionMode, OFFSET$reductionMode);}
	public void reductionMode(int value) {this.ptr.set(LAYOUT$reductionMode, OFFSET$reductionMode, value);}
	public java.lang.foreign.MemorySegment reductionMode_ptr() {return this.ptr.asSlice(OFFSET$reductionMode, LAYOUT$reductionMode);}
}

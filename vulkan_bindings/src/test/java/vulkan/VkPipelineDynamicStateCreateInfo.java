package vulkan;

public record VkPipelineDynamicStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dynamicStateCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dynamicStateCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDynamicStates = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDynamicStates = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$dynamicStateCount,
			LAYOUT$pDynamicStates
	).withName("VkPipelineDynamicStateCreateInfo");

	public VkPipelineDynamicStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public int dynamicStateCount() {return this.ptr.get(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount);}
	public void dynamicStateCount(int value) {this.ptr.set(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount, value);}
	public java.lang.foreign.MemorySegment dynamicStateCount_ptr() {return this.ptr.asSlice(OFFSET$dynamicStateCount, LAYOUT$dynamicStateCount);}

	public java.lang.foreign.MemorySegment pDynamicStates() {return this.ptr.get(LAYOUT$pDynamicStates, OFFSET$pDynamicStates);}
	public void pDynamicStates(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDynamicStates, OFFSET$pDynamicStates, value);}
	public java.lang.foreign.MemorySegment pDynamicStates_ptr() {return this.ptr.asSlice(OFFSET$pDynamicStates, LAYOUT$pDynamicStates);}
}

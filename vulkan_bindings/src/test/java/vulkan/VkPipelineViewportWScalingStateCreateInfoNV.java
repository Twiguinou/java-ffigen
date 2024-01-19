package vulkan;

public record VkPipelineViewportWScalingStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportWScalingEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewportWScalingEnable = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewportCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pViewportWScalings = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pViewportWScalings = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$viewportWScalingEnable,
			LAYOUT$viewportCount,
			LAYOUT$pViewportWScalings
	).withName("VkPipelineViewportWScalingStateCreateInfoNV");

	public VkPipelineViewportWScalingStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int viewportWScalingEnable() {return this.ptr.get(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable);}
	public void viewportWScalingEnable(int value) {this.ptr.set(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable, value);}
	public java.lang.foreign.MemorySegment viewportWScalingEnable_ptr() {return this.ptr.asSlice(OFFSET$viewportWScalingEnable, LAYOUT$viewportWScalingEnable);}

	public int viewportCount() {return this.ptr.get(LAYOUT$viewportCount, OFFSET$viewportCount);}
	public void viewportCount(int value) {this.ptr.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);}
	public java.lang.foreign.MemorySegment viewportCount_ptr() {return this.ptr.asSlice(OFFSET$viewportCount, LAYOUT$viewportCount);}

	public java.lang.foreign.MemorySegment pViewportWScalings() {return this.ptr.get(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings);}
	public void pViewportWScalings(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings, value);}
	public java.lang.foreign.MemorySegment pViewportWScalings_ptr() {return this.ptr.asSlice(OFFSET$pViewportWScalings, LAYOUT$pViewportWScalings);}
}

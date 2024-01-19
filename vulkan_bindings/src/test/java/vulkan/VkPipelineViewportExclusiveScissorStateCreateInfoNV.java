package vulkan;

public record VkPipelineViewportExclusiveScissorStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$exclusiveScissorCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$exclusiveScissorCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pExclusiveScissors = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pExclusiveScissors = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$exclusiveScissorCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pExclusiveScissors
	).withName("VkPipelineViewportExclusiveScissorStateCreateInfoNV");

	public VkPipelineViewportExclusiveScissorStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int exclusiveScissorCount() {return this.ptr.get(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount);}
	public void exclusiveScissorCount(int value) {this.ptr.set(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount, value);}
	public java.lang.foreign.MemorySegment exclusiveScissorCount_ptr() {return this.ptr.asSlice(OFFSET$exclusiveScissorCount, LAYOUT$exclusiveScissorCount);}

	public java.lang.foreign.MemorySegment pExclusiveScissors() {return this.ptr.get(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors);}
	public void pExclusiveScissors(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors, value);}
	public java.lang.foreign.MemorySegment pExclusiveScissors_ptr() {return this.ptr.asSlice(OFFSET$pExclusiveScissors, LAYOUT$pExclusiveScissors);}
}

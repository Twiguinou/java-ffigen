package vulkan;

public record VkMemoryDedicatedRequirements(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prefersDedicatedAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$prefersDedicatedAllocation = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$requiresDedicatedAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$requiresDedicatedAllocation = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$prefersDedicatedAllocation,
			LAYOUT$requiresDedicatedAllocation
	).withName("VkMemoryDedicatedRequirements");

	public VkMemoryDedicatedRequirements(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int prefersDedicatedAllocation() {return this.ptr.get(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation);}
	public void prefersDedicatedAllocation(int value) {this.ptr.set(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation, value);}
	public java.lang.foreign.MemorySegment prefersDedicatedAllocation_ptr() {return this.ptr.asSlice(OFFSET$prefersDedicatedAllocation, LAYOUT$prefersDedicatedAllocation);}

	public int requiresDedicatedAllocation() {return this.ptr.get(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation);}
	public void requiresDedicatedAllocation(int value) {this.ptr.set(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation, value);}
	public java.lang.foreign.MemorySegment requiresDedicatedAllocation_ptr() {return this.ptr.asSlice(OFFSET$requiresDedicatedAllocation, LAYOUT$requiresDedicatedAllocation);}
}

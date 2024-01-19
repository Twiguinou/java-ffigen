package vulkan;

public record VkPhysicalDeviceMemoryBudgetPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$heapBudget = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_LONG);
	public static final long OFFSET$heapBudget = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$heapUsage = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_LONG);
	public static final long OFFSET$heapUsage = 144L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$heapBudget,
			LAYOUT$heapUsage
	).withName("VkPhysicalDeviceMemoryBudgetPropertiesEXT");

	public VkPhysicalDeviceMemoryBudgetPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment heapBudget() {return this.ptr.asSlice(OFFSET$heapBudget, LAYOUT$heapBudget);}
	public long heapBudget(int i) {return this.heapBudget().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, i);}
	public void heapBudget(int i, long value) {this.heapBudget().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, i, value);}

	public java.lang.foreign.MemorySegment heapUsage() {return this.ptr.asSlice(OFFSET$heapUsage, LAYOUT$heapUsage);}
	public long heapUsage(int i) {return this.heapUsage().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, i);}
	public void heapUsage(int i, long value) {this.heapUsage().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, i, value);}
}

package vulkan;

public record VkQueueFamilyGlobalPriorityPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$priorityCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$priorityCount = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$priorities = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$priorities = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$priorityCount,
			LAYOUT$priorities,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkQueueFamilyGlobalPriorityPropertiesKHR");

	public VkQueueFamilyGlobalPriorityPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int priorityCount() {return this.ptr.get(LAYOUT$priorityCount, OFFSET$priorityCount);}
	public void priorityCount(int value) {this.ptr.set(LAYOUT$priorityCount, OFFSET$priorityCount, value);}
	public java.lang.foreign.MemorySegment priorityCount_ptr() {return this.ptr.asSlice(OFFSET$priorityCount, LAYOUT$priorityCount);}

	public java.lang.foreign.MemorySegment priorities() {return this.ptr.asSlice(OFFSET$priorities, LAYOUT$priorities);}
	public int priorities(int i) {return this.priorities().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void priorities(int i, int value) {this.priorities().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}
}

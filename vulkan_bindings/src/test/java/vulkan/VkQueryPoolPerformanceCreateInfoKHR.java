package vulkan;

public record VkQueryPoolPerformanceCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$queueFamilyIndex = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$counterIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$counterIndexCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCounterIndices = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCounterIndices = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$queueFamilyIndex,
			LAYOUT$counterIndexCount,
			LAYOUT$pCounterIndices
	).withName("VkQueryPoolPerformanceCreateInfoKHR");

	public VkQueryPoolPerformanceCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int queueFamilyIndex() {return this.ptr.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);}
	public void queueFamilyIndex(int value) {this.ptr.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);}
	public java.lang.foreign.MemorySegment queueFamilyIndex_ptr() {return this.ptr.asSlice(OFFSET$queueFamilyIndex, LAYOUT$queueFamilyIndex);}

	public int counterIndexCount() {return this.ptr.get(LAYOUT$counterIndexCount, OFFSET$counterIndexCount);}
	public void counterIndexCount(int value) {this.ptr.set(LAYOUT$counterIndexCount, OFFSET$counterIndexCount, value);}
	public java.lang.foreign.MemorySegment counterIndexCount_ptr() {return this.ptr.asSlice(OFFSET$counterIndexCount, LAYOUT$counterIndexCount);}

	public java.lang.foreign.MemorySegment pCounterIndices() {return this.ptr.get(LAYOUT$pCounterIndices, OFFSET$pCounterIndices);}
	public void pCounterIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCounterIndices, OFFSET$pCounterIndices, value);}
	public java.lang.foreign.MemorySegment pCounterIndices_ptr() {return this.ptr.asSlice(OFFSET$pCounterIndices, LAYOUT$pCounterIndices);}
}

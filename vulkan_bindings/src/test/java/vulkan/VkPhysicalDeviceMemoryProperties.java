package vulkan;

public record VkPhysicalDeviceMemoryProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryTypeCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryTypeCount");
	public static final long OFFSET$memoryTypeCount = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$memoryTypes = java.lang.foreign.MemoryLayout.sequenceLayout(32, VkMemoryType.gStructLayout).withName("memoryTypes");
	public static final long OFFSET$memoryTypes = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryHeapCount = java.lang.foreign.ValueLayout.JAVA_INT.withName("memoryHeapCount");
	public static final long OFFSET$memoryHeapCount = 260L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$memoryHeaps = java.lang.foreign.MemoryLayout.sequenceLayout(16, VkMemoryHeap.gStructLayout).withName("memoryHeaps");
	public static final long OFFSET$memoryHeaps = 264L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$memoryTypeCount,
			LAYOUT$memoryTypes,
			LAYOUT$memoryHeapCount,
			LAYOUT$memoryHeaps
	).withName("VkPhysicalDeviceMemoryProperties");

	public VkPhysicalDeviceMemoryProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int memoryTypeCount() {return this.ptr.get(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount);}
	public void memoryTypeCount(int value) {this.ptr.set(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount, value);}
	public java.lang.foreign.MemorySegment memoryTypeCount_ptr() {return this.ptr.asSlice(OFFSET$memoryTypeCount, LAYOUT$memoryTypeCount);}


	public int memoryHeapCount() {return this.ptr.get(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount);}
	public void memoryHeapCount(int value) {this.ptr.set(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount, value);}
	public java.lang.foreign.MemorySegment memoryHeapCount_ptr() {return this.ptr.asSlice(OFFSET$memoryHeapCount, LAYOUT$memoryHeapCount);}

}

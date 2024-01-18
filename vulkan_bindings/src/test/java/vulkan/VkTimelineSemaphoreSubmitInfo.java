package vulkan;

public record VkTimelineSemaphoreSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$waitSemaphoreValueCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$waitSemaphoreValueCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pWaitSemaphoreValues = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pWaitSemaphoreValues = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$signalSemaphoreValueCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$signalSemaphoreValueCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSignalSemaphoreValues = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSignalSemaphoreValues = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$waitSemaphoreValueCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pWaitSemaphoreValues,
			LAYOUT$signalSemaphoreValueCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pSignalSemaphoreValues
	).withName("VkTimelineSemaphoreSubmitInfo");

	public VkTimelineSemaphoreSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int waitSemaphoreValueCount() {return this.ptr.get(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount);}
	public void waitSemaphoreValueCount(int value) {this.ptr.set(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount, value);}
	public java.lang.foreign.MemorySegment waitSemaphoreValueCount_ptr() {return this.ptr.asSlice(OFFSET$waitSemaphoreValueCount, LAYOUT$waitSemaphoreValueCount);}

	public java.lang.foreign.MemorySegment pWaitSemaphoreValues() {return this.ptr.get(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues);}
	public void pWaitSemaphoreValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues, value);}
	public java.lang.foreign.MemorySegment pWaitSemaphoreValues_ptr() {return this.ptr.asSlice(OFFSET$pWaitSemaphoreValues, LAYOUT$pWaitSemaphoreValues);}

	public int signalSemaphoreValueCount() {return this.ptr.get(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount);}
	public void signalSemaphoreValueCount(int value) {this.ptr.set(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount, value);}
	public java.lang.foreign.MemorySegment signalSemaphoreValueCount_ptr() {return this.ptr.asSlice(OFFSET$signalSemaphoreValueCount, LAYOUT$signalSemaphoreValueCount);}

	public java.lang.foreign.MemorySegment pSignalSemaphoreValues() {return this.ptr.get(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues);}
	public void pSignalSemaphoreValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues, value);}
	public java.lang.foreign.MemorySegment pSignalSemaphoreValues_ptr() {return this.ptr.asSlice(OFFSET$pSignalSemaphoreValues, LAYOUT$pSignalSemaphoreValues);}
}

package vulkan;

public record VkLatencySleepInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$signalSemaphore = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$signalSemaphore = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$value = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$value = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$signalSemaphore,
			LAYOUT$value
	).withName("VkLatencySleepInfoNV");

	public VkLatencySleepInfoNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment signalSemaphore() {return this.ptr.get(LAYOUT$signalSemaphore, OFFSET$signalSemaphore);}
	public void signalSemaphore(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$signalSemaphore, OFFSET$signalSemaphore, value);}
	public java.lang.foreign.MemorySegment signalSemaphore_ptr() {return this.ptr.asSlice(OFFSET$signalSemaphore, LAYOUT$signalSemaphore);}

	public long value() {return this.ptr.get(LAYOUT$value, OFFSET$value);}
	public void value(long value) {this.ptr.set(LAYOUT$value, OFFSET$value, value);}
	public java.lang.foreign.MemorySegment value_ptr() {return this.ptr.asSlice(OFFSET$value, LAYOUT$value);}
}

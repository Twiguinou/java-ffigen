package vulkan;

public record VkBindBufferMemoryInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$buffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$buffer = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$memory = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$memory = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$memoryOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$memoryOffset = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$buffer,
			LAYOUT$memory,
			LAYOUT$memoryOffset
	).withName("VkBindBufferMemoryInfo");

	public VkBindBufferMemoryInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT$buffer, OFFSET$buffer);}
	public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$buffer, OFFSET$buffer, value);}
	public java.lang.foreign.MemorySegment buffer_ptr() {return this.ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}

	public java.lang.foreign.MemorySegment memory() {return this.ptr.get(LAYOUT$memory, OFFSET$memory);}
	public void memory(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$memory, OFFSET$memory, value);}
	public java.lang.foreign.MemorySegment memory_ptr() {return this.ptr.asSlice(OFFSET$memory, LAYOUT$memory);}

	public long memoryOffset() {return this.ptr.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);}
	public void memoryOffset(long value) {this.ptr.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);}
	public java.lang.foreign.MemorySegment memoryOffset_ptr() {return this.ptr.asSlice(OFFSET$memoryOffset, LAYOUT$memoryOffset);}
}

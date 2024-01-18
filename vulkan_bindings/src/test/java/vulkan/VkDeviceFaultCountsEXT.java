package vulkan;

public record VkDeviceFaultCountsEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$addressInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$addressInfoCount = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vendorInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vendorInfoCount = 20L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vendorBinarySize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$vendorBinarySize = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$addressInfoCount,
			LAYOUT$vendorInfoCount,
			LAYOUT$vendorBinarySize
	).withName("VkDeviceFaultCountsEXT");

	public VkDeviceFaultCountsEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int addressInfoCount() {return this.ptr.get(LAYOUT$addressInfoCount, OFFSET$addressInfoCount);}
	public void addressInfoCount(int value) {this.ptr.set(LAYOUT$addressInfoCount, OFFSET$addressInfoCount, value);}
	public java.lang.foreign.MemorySegment addressInfoCount_ptr() {return this.ptr.asSlice(OFFSET$addressInfoCount, LAYOUT$addressInfoCount);}

	public int vendorInfoCount() {return this.ptr.get(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount);}
	public void vendorInfoCount(int value) {this.ptr.set(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount, value);}
	public java.lang.foreign.MemorySegment vendorInfoCount_ptr() {return this.ptr.asSlice(OFFSET$vendorInfoCount, LAYOUT$vendorInfoCount);}

	public long vendorBinarySize() {return this.ptr.get(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize);}
	public void vendorBinarySize(long value) {this.ptr.set(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize, value);}
	public java.lang.foreign.MemorySegment vendorBinarySize_ptr() {return this.ptr.asSlice(OFFSET$vendorBinarySize, LAYOUT$vendorBinarySize);}
}

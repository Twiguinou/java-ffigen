package vulkan;

public record VkDeviceFaultAddressInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$addressType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$addressType = 0L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$reportedAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$reportedAddress = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$addressPrecision = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$addressPrecision = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$addressType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$reportedAddress,
			LAYOUT$addressPrecision
	).withName("VkDeviceFaultAddressInfoEXT");

	public VkDeviceFaultAddressInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int addressType() {return this.ptr.get(LAYOUT$addressType, OFFSET$addressType);}
	public void addressType(int value) {this.ptr.set(LAYOUT$addressType, OFFSET$addressType, value);}
	public java.lang.foreign.MemorySegment addressType_ptr() {return this.ptr.asSlice(OFFSET$addressType, LAYOUT$addressType);}

	public long reportedAddress() {return this.ptr.get(LAYOUT$reportedAddress, OFFSET$reportedAddress);}
	public void reportedAddress(long value) {this.ptr.set(LAYOUT$reportedAddress, OFFSET$reportedAddress, value);}
	public java.lang.foreign.MemorySegment reportedAddress_ptr() {return this.ptr.asSlice(OFFSET$reportedAddress, LAYOUT$reportedAddress);}

	public long addressPrecision() {return this.ptr.get(LAYOUT$addressPrecision, OFFSET$addressPrecision);}
	public void addressPrecision(long value) {this.ptr.set(LAYOUT$addressPrecision, OFFSET$addressPrecision, value);}
	public java.lang.foreign.MemorySegment addressPrecision_ptr() {return this.ptr.asSlice(OFFSET$addressPrecision, LAYOUT$addressPrecision);}
}

package vulkan;

public record VkStridedDeviceAddressRegionKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$deviceAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$deviceAddress = 0L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$stride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$stride = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$size = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$deviceAddress,
			LAYOUT$stride,
			LAYOUT$size
	).withName("VkStridedDeviceAddressRegionKHR");

	public VkStridedDeviceAddressRegionKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public long deviceAddress() {return this.ptr.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);}
	public void deviceAddress(long value) {this.ptr.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);}
	public java.lang.foreign.MemorySegment deviceAddress_ptr() {return this.ptr.asSlice(OFFSET$deviceAddress, LAYOUT$deviceAddress);}

	public long stride() {return this.ptr.get(LAYOUT$stride, OFFSET$stride);}
	public void stride(long value) {this.ptr.set(LAYOUT$stride, OFFSET$stride, value);}
	public java.lang.foreign.MemorySegment stride_ptr() {return this.ptr.asSlice(OFFSET$stride, LAYOUT$stride);}

	public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
	public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
	public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}
}

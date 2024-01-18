package vulkan;

public record VkAccelerationStructureGeometryAabbsDataKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$data = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$data = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$stride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$stride = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$data,
			LAYOUT$stride
	).withName("VkAccelerationStructureGeometryAabbsDataKHR");

	public VkAccelerationStructureGeometryAabbsDataKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public vulkan.VkDeviceOrHostAddressConstKHR data() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$data, LAYOUT$data));}

	public long stride() {return this.ptr.get(LAYOUT$stride, OFFSET$stride);}
	public void stride(long value) {this.ptr.set(LAYOUT$stride, OFFSET$stride, value);}
	public java.lang.foreign.MemorySegment stride_ptr() {return this.ptr.asSlice(OFFSET$stride, LAYOUT$stride);}
}

package vulkan;

public record VkAccelerationStructureGeometryInstancesDataKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$arrayOfPointers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$arrayOfPointers = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$data = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$data = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$arrayOfPointers,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$data
	).withName("VkAccelerationStructureGeometryInstancesDataKHR");

	public VkAccelerationStructureGeometryInstancesDataKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int arrayOfPointers() {return this.ptr.get(LAYOUT$arrayOfPointers, OFFSET$arrayOfPointers);}
	public void arrayOfPointers(int value) {this.ptr.set(LAYOUT$arrayOfPointers, OFFSET$arrayOfPointers, value);}
	public java.lang.foreign.MemorySegment arrayOfPointers_ptr() {return this.ptr.asSlice(OFFSET$arrayOfPointers, LAYOUT$arrayOfPointers);}

	public vulkan.VkDeviceOrHostAddressConstKHR data() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$data, LAYOUT$data));}
}

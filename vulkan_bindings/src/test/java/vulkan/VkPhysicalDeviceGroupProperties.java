package vulkan;

public record VkPhysicalDeviceGroupProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$physicalDeviceCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$physicalDeviceCount = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$physicalDevices = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.ADDRESS);
	public static final long OFFSET$physicalDevices = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subsetAllocation = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$subsetAllocation = 280L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$physicalDeviceCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$physicalDevices,
			LAYOUT$subsetAllocation,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceGroupProperties");

	public VkPhysicalDeviceGroupProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int physicalDeviceCount() {return this.ptr.get(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount);}
	public void physicalDeviceCount(int value) {this.ptr.set(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount, value);}
	public java.lang.foreign.MemorySegment physicalDeviceCount_ptr() {return this.ptr.asSlice(OFFSET$physicalDeviceCount, LAYOUT$physicalDeviceCount);}

	public java.lang.foreign.MemorySegment physicalDevices() {return this.ptr.asSlice(OFFSET$physicalDevices, LAYOUT$physicalDevices);}
	public java.lang.foreign.MemorySegment physicalDevices(int i) {return this.physicalDevices().getAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i);}
	public void physicalDevices(int i, java.lang.foreign.MemorySegment value) {this.physicalDevices().setAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i, value);}

	public int subsetAllocation() {return this.ptr.get(LAYOUT$subsetAllocation, OFFSET$subsetAllocation);}
	public void subsetAllocation(int value) {this.ptr.set(LAYOUT$subsetAllocation, OFFSET$subsetAllocation, value);}
	public java.lang.foreign.MemorySegment subsetAllocation_ptr() {return this.ptr.asSlice(OFFSET$subsetAllocation, LAYOUT$subsetAllocation);}
}

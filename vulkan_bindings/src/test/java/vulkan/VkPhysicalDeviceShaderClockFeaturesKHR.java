package vulkan;

public record VkPhysicalDeviceShaderClockFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSubgroupClock = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSubgroupClock = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDeviceClock = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderDeviceClock = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderSubgroupClock,
			LAYOUT$shaderDeviceClock
	).withName("VkPhysicalDeviceShaderClockFeaturesKHR");

	public VkPhysicalDeviceShaderClockFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int shaderSubgroupClock() {return this.ptr.get(LAYOUT$shaderSubgroupClock, OFFSET$shaderSubgroupClock);}
	public void shaderSubgroupClock(int value) {this.ptr.set(LAYOUT$shaderSubgroupClock, OFFSET$shaderSubgroupClock, value);}
	public java.lang.foreign.MemorySegment shaderSubgroupClock_ptr() {return this.ptr.asSlice(OFFSET$shaderSubgroupClock, LAYOUT$shaderSubgroupClock);}

	public int shaderDeviceClock() {return this.ptr.get(LAYOUT$shaderDeviceClock, OFFSET$shaderDeviceClock);}
	public void shaderDeviceClock(int value) {this.ptr.set(LAYOUT$shaderDeviceClock, OFFSET$shaderDeviceClock, value);}
	public java.lang.foreign.MemorySegment shaderDeviceClock_ptr() {return this.ptr.asSlice(OFFSET$shaderDeviceClock, LAYOUT$shaderDeviceClock);}
}

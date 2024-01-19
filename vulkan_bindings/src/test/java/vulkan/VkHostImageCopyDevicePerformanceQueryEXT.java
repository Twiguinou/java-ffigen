package vulkan;

public record VkHostImageCopyDevicePerformanceQueryEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$optimalDeviceAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$optimalDeviceAccess = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$identicalMemoryLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$identicalMemoryLayout = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$optimalDeviceAccess,
			LAYOUT$identicalMemoryLayout
	).withName("VkHostImageCopyDevicePerformanceQueryEXT");

	public VkHostImageCopyDevicePerformanceQueryEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int optimalDeviceAccess() {return this.ptr.get(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess);}
	public void optimalDeviceAccess(int value) {this.ptr.set(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess, value);}
	public java.lang.foreign.MemorySegment optimalDeviceAccess_ptr() {return this.ptr.asSlice(OFFSET$optimalDeviceAccess, LAYOUT$optimalDeviceAccess);}

	public int identicalMemoryLayout() {return this.ptr.get(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout);}
	public void identicalMemoryLayout(int value) {this.ptr.set(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout, value);}
	public java.lang.foreign.MemorySegment identicalMemoryLayout_ptr() {return this.ptr.asSlice(OFFSET$identicalMemoryLayout, LAYOUT$identicalMemoryLayout);}
}

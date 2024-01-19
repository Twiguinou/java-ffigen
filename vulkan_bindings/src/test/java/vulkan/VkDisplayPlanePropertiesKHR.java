package vulkan;

public record VkDisplayPlanePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$currentDisplay = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$currentDisplay = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$currentStackIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$currentStackIndex = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$currentDisplay,
			LAYOUT$currentStackIndex,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDisplayPlanePropertiesKHR");

	public VkDisplayPlanePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment currentDisplay() {return this.ptr.get(LAYOUT$currentDisplay, OFFSET$currentDisplay);}
	public void currentDisplay(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$currentDisplay, OFFSET$currentDisplay, value);}
	public java.lang.foreign.MemorySegment currentDisplay_ptr() {return this.ptr.asSlice(OFFSET$currentDisplay, LAYOUT$currentDisplay);}

	public int currentStackIndex() {return this.ptr.get(LAYOUT$currentStackIndex, OFFSET$currentStackIndex);}
	public void currentStackIndex(int value) {this.ptr.set(LAYOUT$currentStackIndex, OFFSET$currentStackIndex, value);}
	public java.lang.foreign.MemorySegment currentStackIndex_ptr() {return this.ptr.asSlice(OFFSET$currentStackIndex, LAYOUT$currentStackIndex);}
}

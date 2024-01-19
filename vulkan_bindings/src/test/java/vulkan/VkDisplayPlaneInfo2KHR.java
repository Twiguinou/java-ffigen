package vulkan;

public record VkDisplayPlaneInfo2KHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$mode = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$mode = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$planeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$planeIndex = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$mode,
			LAYOUT$planeIndex,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDisplayPlaneInfo2KHR");

	public VkDisplayPlaneInfo2KHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment mode() {return this.ptr.get(LAYOUT$mode, OFFSET$mode);}
	public void mode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$mode, OFFSET$mode, value);}
	public java.lang.foreign.MemorySegment mode_ptr() {return this.ptr.asSlice(OFFSET$mode, LAYOUT$mode);}

	public int planeIndex() {return this.ptr.get(LAYOUT$planeIndex, OFFSET$planeIndex);}
	public void planeIndex(int value) {this.ptr.set(LAYOUT$planeIndex, OFFSET$planeIndex, value);}
	public java.lang.foreign.MemorySegment planeIndex_ptr() {return this.ptr.asSlice(OFFSET$planeIndex, LAYOUT$planeIndex);}
}

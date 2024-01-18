package vulkan;

public record VkPresentRegionKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rectangleCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rectangleCount = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pRectangles = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pRectangles = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$rectangleCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pRectangles
	).withName("VkPresentRegionKHR");

	public VkPresentRegionKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int rectangleCount() {return this.ptr.get(LAYOUT$rectangleCount, OFFSET$rectangleCount);}
	public void rectangleCount(int value) {this.ptr.set(LAYOUT$rectangleCount, OFFSET$rectangleCount, value);}
	public java.lang.foreign.MemorySegment rectangleCount_ptr() {return this.ptr.asSlice(OFFSET$rectangleCount, LAYOUT$rectangleCount);}

	public java.lang.foreign.MemorySegment pRectangles() {return this.ptr.get(LAYOUT$pRectangles, OFFSET$pRectangles);}
	public void pRectangles(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRectangles, OFFSET$pRectangles, value);}
	public java.lang.foreign.MemorySegment pRectangles_ptr() {return this.ptr.asSlice(OFFSET$pRectangles, LAYOUT$pRectangles);}
}

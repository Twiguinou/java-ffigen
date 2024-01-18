package vulkan;

public record VkSurfaceFormatKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$format = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorSpace = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$colorSpace = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$format,
			LAYOUT$colorSpace
	).withName("VkSurfaceFormatKHR");

	public VkSurfaceFormatKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
	public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
	public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

	public int colorSpace() {return this.ptr.get(LAYOUT$colorSpace, OFFSET$colorSpace);}
	public void colorSpace(int value) {this.ptr.set(LAYOUT$colorSpace, OFFSET$colorSpace, value);}
	public java.lang.foreign.MemorySegment colorSpace_ptr() {return this.ptr.asSlice(OFFSET$colorSpace, LAYOUT$colorSpace);}
}

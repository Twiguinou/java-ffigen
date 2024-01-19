package vulkan;

public record VkExtent3D(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$width = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$height = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depth = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depth = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$width,
			LAYOUT$height,
			LAYOUT$depth
	).withName("VkExtent3D");

	public VkExtent3D(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
	public void width(int value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
	public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

	public int height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
	public void height(int value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
	public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

	public int depth() {return this.ptr.get(LAYOUT$depth, OFFSET$depth);}
	public void depth(int value) {this.ptr.set(LAYOUT$depth, OFFSET$depth, value);}
	public java.lang.foreign.MemorySegment depth_ptr() {return this.ptr.asSlice(OFFSET$depth, LAYOUT$depth);}
}

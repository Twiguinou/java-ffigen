package vulkan;

public record VkViewportSwizzleNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$x = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$y = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$z = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$z = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$w = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$w = 12L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$x,
			LAYOUT$y,
			LAYOUT$z,
			LAYOUT$w
	).withName("VkViewportSwizzleNV");

	public VkViewportSwizzleNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int x() {return this.ptr.get(LAYOUT$x, OFFSET$x);}
	public void x(int value) {this.ptr.set(LAYOUT$x, OFFSET$x, value);}
	public java.lang.foreign.MemorySegment x_ptr() {return this.ptr.asSlice(OFFSET$x, LAYOUT$x);}

	public int y() {return this.ptr.get(LAYOUT$y, OFFSET$y);}
	public void y(int value) {this.ptr.set(LAYOUT$y, OFFSET$y, value);}
	public java.lang.foreign.MemorySegment y_ptr() {return this.ptr.asSlice(OFFSET$y, LAYOUT$y);}

	public int z() {return this.ptr.get(LAYOUT$z, OFFSET$z);}
	public void z(int value) {this.ptr.set(LAYOUT$z, OFFSET$z, value);}
	public java.lang.foreign.MemorySegment z_ptr() {return this.ptr.asSlice(OFFSET$z, LAYOUT$z);}

	public int w() {return this.ptr.get(LAYOUT$w, OFFSET$w);}
	public void w(int value) {this.ptr.set(LAYOUT$w, OFFSET$w, value);}
	public java.lang.foreign.MemorySegment w_ptr() {return this.ptr.asSlice(OFFSET$w, LAYOUT$w);}
}

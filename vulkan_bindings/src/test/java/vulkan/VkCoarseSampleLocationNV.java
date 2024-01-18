package vulkan;

public record VkCoarseSampleLocationNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pixelX = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pixelX = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pixelY = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pixelY = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sample = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sample = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$pixelX,
			LAYOUT$pixelY,
			LAYOUT$sample
	).withName("VkCoarseSampleLocationNV");

	public VkCoarseSampleLocationNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int pixelX() {return this.ptr.get(LAYOUT$pixelX, OFFSET$pixelX);}
	public void pixelX(int value) {this.ptr.set(LAYOUT$pixelX, OFFSET$pixelX, value);}
	public java.lang.foreign.MemorySegment pixelX_ptr() {return this.ptr.asSlice(OFFSET$pixelX, LAYOUT$pixelX);}

	public int pixelY() {return this.ptr.get(LAYOUT$pixelY, OFFSET$pixelY);}
	public void pixelY(int value) {this.ptr.set(LAYOUT$pixelY, OFFSET$pixelY, value);}
	public java.lang.foreign.MemorySegment pixelY_ptr() {return this.ptr.asSlice(OFFSET$pixelY, LAYOUT$pixelY);}

	public int sample() {return this.ptr.get(LAYOUT$sample, OFFSET$sample);}
	public void sample(int value) {this.ptr.set(LAYOUT$sample, OFFSET$sample, value);}
	public java.lang.foreign.MemorySegment sample_ptr() {return this.ptr.asSlice(OFFSET$sample, LAYOUT$sample);}
}

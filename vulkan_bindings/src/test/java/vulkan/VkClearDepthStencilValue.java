package vulkan;

public record VkClearDepthStencilValue(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$depth = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$depth = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencil = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stencil = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$depth,
			LAYOUT$stencil
	).withName("VkClearDepthStencilValue");

	public VkClearDepthStencilValue(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public float depth() {return this.ptr.get(LAYOUT$depth, OFFSET$depth);}
	public void depth(float value) {this.ptr.set(LAYOUT$depth, OFFSET$depth, value);}
	public java.lang.foreign.MemorySegment depth_ptr() {return this.ptr.asSlice(OFFSET$depth, LAYOUT$depth);}

	public int stencil() {return this.ptr.get(LAYOUT$stencil, OFFSET$stencil);}
	public void stencil(int value) {this.ptr.set(LAYOUT$stencil, OFFSET$stencil, value);}
	public java.lang.foreign.MemorySegment stencil_ptr() {return this.ptr.asSlice(OFFSET$stencil, LAYOUT$stencil);}
}

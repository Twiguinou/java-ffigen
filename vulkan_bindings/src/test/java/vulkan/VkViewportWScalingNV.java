package vulkan;

public record VkViewportWScalingNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$xcoeff = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$xcoeff = 0L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$ycoeff = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$ycoeff = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$xcoeff,
			LAYOUT$ycoeff
	).withName("VkViewportWScalingNV");

	public VkViewportWScalingNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public float xcoeff() {return this.ptr.get(LAYOUT$xcoeff, OFFSET$xcoeff);}
	public void xcoeff(float value) {this.ptr.set(LAYOUT$xcoeff, OFFSET$xcoeff, value);}
	public java.lang.foreign.MemorySegment xcoeff_ptr() {return this.ptr.asSlice(OFFSET$xcoeff, LAYOUT$xcoeff);}

	public float ycoeff() {return this.ptr.get(LAYOUT$ycoeff, OFFSET$ycoeff);}
	public void ycoeff(float value) {this.ptr.set(LAYOUT$ycoeff, OFFSET$ycoeff, value);}
	public java.lang.foreign.MemorySegment ycoeff_ptr() {return this.ptr.asSlice(OFFSET$ycoeff, LAYOUT$ycoeff);}
}

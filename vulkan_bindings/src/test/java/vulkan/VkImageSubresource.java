package vulkan;

public record VkImageSubresource(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$aspectMask = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mipLevel = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$mipLevel = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$arrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$arrayLayer = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$aspectMask,
			LAYOUT$mipLevel,
			LAYOUT$arrayLayer
	).withName("VkImageSubresource");

	public VkImageSubresource(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int aspectMask() {return this.ptr.get(LAYOUT$aspectMask, OFFSET$aspectMask);}
	public void aspectMask(int value) {this.ptr.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);}
	public java.lang.foreign.MemorySegment aspectMask_ptr() {return this.ptr.asSlice(OFFSET$aspectMask, LAYOUT$aspectMask);}

	public int mipLevel() {return this.ptr.get(LAYOUT$mipLevel, OFFSET$mipLevel);}
	public void mipLevel(int value) {this.ptr.set(LAYOUT$mipLevel, OFFSET$mipLevel, value);}
	public java.lang.foreign.MemorySegment mipLevel_ptr() {return this.ptr.asSlice(OFFSET$mipLevel, LAYOUT$mipLevel);}

	public int arrayLayer() {return this.ptr.get(LAYOUT$arrayLayer, OFFSET$arrayLayer);}
	public void arrayLayer(int value) {this.ptr.set(LAYOUT$arrayLayer, OFFSET$arrayLayer, value);}
	public java.lang.foreign.MemorySegment arrayLayer_ptr() {return this.ptr.asSlice(OFFSET$arrayLayer, LAYOUT$arrayLayer);}
}

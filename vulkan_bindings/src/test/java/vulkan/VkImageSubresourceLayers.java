package vulkan;

public record VkImageSubresourceLayers(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$aspectMask = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mipLevel = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$mipLevel = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$baseArrayLayer = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$layerCount = 12L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$aspectMask,
			LAYOUT$mipLevel,
			LAYOUT$baseArrayLayer,
			LAYOUT$layerCount
	).withName("VkImageSubresourceLayers");

	public VkImageSubresourceLayers(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int aspectMask() {return this.ptr.get(LAYOUT$aspectMask, OFFSET$aspectMask);}
	public void aspectMask(int value) {this.ptr.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);}
	public java.lang.foreign.MemorySegment aspectMask_ptr() {return this.ptr.asSlice(OFFSET$aspectMask, LAYOUT$aspectMask);}

	public int mipLevel() {return this.ptr.get(LAYOUT$mipLevel, OFFSET$mipLevel);}
	public void mipLevel(int value) {this.ptr.set(LAYOUT$mipLevel, OFFSET$mipLevel, value);}
	public java.lang.foreign.MemorySegment mipLevel_ptr() {return this.ptr.asSlice(OFFSET$mipLevel, LAYOUT$mipLevel);}

	public int baseArrayLayer() {return this.ptr.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);}
	public void baseArrayLayer(int value) {this.ptr.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);}
	public java.lang.foreign.MemorySegment baseArrayLayer_ptr() {return this.ptr.asSlice(OFFSET$baseArrayLayer, LAYOUT$baseArrayLayer);}

	public int layerCount() {return this.ptr.get(LAYOUT$layerCount, OFFSET$layerCount);}
	public void layerCount(int value) {this.ptr.set(LAYOUT$layerCount, OFFSET$layerCount, value);}
	public java.lang.foreign.MemorySegment layerCount_ptr() {return this.ptr.asSlice(OFFSET$layerCount, LAYOUT$layerCount);}
}

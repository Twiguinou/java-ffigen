package vulkan;

public record VkFormatProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$linearTilingFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$linearTilingFeatures = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$optimalTilingFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$optimalTilingFeatures = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$bufferFeatures = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$linearTilingFeatures,
			LAYOUT$optimalTilingFeatures,
			LAYOUT$bufferFeatures
	).withName("VkFormatProperties");

	public VkFormatProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int linearTilingFeatures() {return this.ptr.get(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures);}
	public void linearTilingFeatures(int value) {this.ptr.set(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures, value);}
	public java.lang.foreign.MemorySegment linearTilingFeatures_ptr() {return this.ptr.asSlice(OFFSET$linearTilingFeatures, LAYOUT$linearTilingFeatures);}

	public int optimalTilingFeatures() {return this.ptr.get(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures);}
	public void optimalTilingFeatures(int value) {this.ptr.set(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures, value);}
	public java.lang.foreign.MemorySegment optimalTilingFeatures_ptr() {return this.ptr.asSlice(OFFSET$optimalTilingFeatures, LAYOUT$optimalTilingFeatures);}

	public int bufferFeatures() {return this.ptr.get(LAYOUT$bufferFeatures, OFFSET$bufferFeatures);}
	public void bufferFeatures(int value) {this.ptr.set(LAYOUT$bufferFeatures, OFFSET$bufferFeatures, value);}
	public java.lang.foreign.MemorySegment bufferFeatures_ptr() {return this.ptr.asSlice(OFFSET$bufferFeatures, LAYOUT$bufferFeatures);}
}

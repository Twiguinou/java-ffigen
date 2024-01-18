package vulkan;

public record VkSparseImageMemoryRequirements(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$formatProperties = vulkan.VkSparseImageFormatProperties.gStructLayout;
	public static final long OFFSET$formatProperties = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageMipTailFirstLod = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageMipTailFirstLod = 20L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$imageMipTailSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$imageMipTailSize = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$imageMipTailOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$imageMipTailOffset = 32L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$imageMipTailStride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$imageMipTailStride = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$formatProperties,
			LAYOUT$imageMipTailFirstLod,
			LAYOUT$imageMipTailSize,
			LAYOUT$imageMipTailOffset,
			LAYOUT$imageMipTailStride
	).withName("VkSparseImageMemoryRequirements");

	public VkSparseImageMemoryRequirements(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkSparseImageFormatProperties formatProperties() {return new vulkan.VkSparseImageFormatProperties(this.ptr.asSlice(OFFSET$formatProperties, LAYOUT$formatProperties));}

	public int imageMipTailFirstLod() {return this.ptr.get(LAYOUT$imageMipTailFirstLod, OFFSET$imageMipTailFirstLod);}
	public void imageMipTailFirstLod(int value) {this.ptr.set(LAYOUT$imageMipTailFirstLod, OFFSET$imageMipTailFirstLod, value);}
	public java.lang.foreign.MemorySegment imageMipTailFirstLod_ptr() {return this.ptr.asSlice(OFFSET$imageMipTailFirstLod, LAYOUT$imageMipTailFirstLod);}

	public long imageMipTailSize() {return this.ptr.get(LAYOUT$imageMipTailSize, OFFSET$imageMipTailSize);}
	public void imageMipTailSize(long value) {this.ptr.set(LAYOUT$imageMipTailSize, OFFSET$imageMipTailSize, value);}
	public java.lang.foreign.MemorySegment imageMipTailSize_ptr() {return this.ptr.asSlice(OFFSET$imageMipTailSize, LAYOUT$imageMipTailSize);}

	public long imageMipTailOffset() {return this.ptr.get(LAYOUT$imageMipTailOffset, OFFSET$imageMipTailOffset);}
	public void imageMipTailOffset(long value) {this.ptr.set(LAYOUT$imageMipTailOffset, OFFSET$imageMipTailOffset, value);}
	public java.lang.foreign.MemorySegment imageMipTailOffset_ptr() {return this.ptr.asSlice(OFFSET$imageMipTailOffset, LAYOUT$imageMipTailOffset);}

	public long imageMipTailStride() {return this.ptr.get(LAYOUT$imageMipTailStride, OFFSET$imageMipTailStride);}
	public void imageMipTailStride(long value) {this.ptr.set(LAYOUT$imageMipTailStride, OFFSET$imageMipTailStride, value);}
	public java.lang.foreign.MemorySegment imageMipTailStride_ptr() {return this.ptr.asSlice(OFFSET$imageMipTailStride, LAYOUT$imageMipTailStride);}
}

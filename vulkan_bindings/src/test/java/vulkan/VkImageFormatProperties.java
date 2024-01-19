package vulkan;

public record VkImageFormatProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$maxExtent = vulkan.VkExtent3D.gStructLayout;
	public static final long OFFSET$maxExtent = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMipLevels = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxMipLevels = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxArrayLayers = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sampleCounts = 20L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxResourceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxResourceSize = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$maxExtent,
			LAYOUT$maxMipLevels,
			LAYOUT$maxArrayLayers,
			LAYOUT$sampleCounts,
			LAYOUT$maxResourceSize
	).withName("VkImageFormatProperties");

	public VkImageFormatProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkExtent3D maxExtent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$maxExtent, LAYOUT$maxExtent));}

	public int maxMipLevels() {return this.ptr.get(LAYOUT$maxMipLevels, OFFSET$maxMipLevels);}
	public void maxMipLevels(int value) {this.ptr.set(LAYOUT$maxMipLevels, OFFSET$maxMipLevels, value);}
	public java.lang.foreign.MemorySegment maxMipLevels_ptr() {return this.ptr.asSlice(OFFSET$maxMipLevels, LAYOUT$maxMipLevels);}

	public int maxArrayLayers() {return this.ptr.get(LAYOUT$maxArrayLayers, OFFSET$maxArrayLayers);}
	public void maxArrayLayers(int value) {this.ptr.set(LAYOUT$maxArrayLayers, OFFSET$maxArrayLayers, value);}
	public java.lang.foreign.MemorySegment maxArrayLayers_ptr() {return this.ptr.asSlice(OFFSET$maxArrayLayers, LAYOUT$maxArrayLayers);}

	public int sampleCounts() {return this.ptr.get(LAYOUT$sampleCounts, OFFSET$sampleCounts);}
	public void sampleCounts(int value) {this.ptr.set(LAYOUT$sampleCounts, OFFSET$sampleCounts, value);}
	public java.lang.foreign.MemorySegment sampleCounts_ptr() {return this.ptr.asSlice(OFFSET$sampleCounts, LAYOUT$sampleCounts);}

	public long maxResourceSize() {return this.ptr.get(LAYOUT$maxResourceSize, OFFSET$maxResourceSize);}
	public void maxResourceSize(long value) {this.ptr.set(LAYOUT$maxResourceSize, OFFSET$maxResourceSize, value);}
	public java.lang.foreign.MemorySegment maxResourceSize_ptr() {return this.ptr.asSlice(OFFSET$maxResourceSize, LAYOUT$maxResourceSize);}
}

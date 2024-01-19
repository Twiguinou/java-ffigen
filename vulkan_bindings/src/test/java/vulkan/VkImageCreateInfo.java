package vulkan;

public record VkImageCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageType = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$format = 24L;
	public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent3D.gStructLayout;
	public static final long OFFSET$extent = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mipLevels = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$mipLevels = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$arrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$arrayLayers = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$samples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$samples = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tiling = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$tiling = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$usage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$usage = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sharingMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sharingMode = 60L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$queueFamilyIndexCount = 64L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pQueueFamilyIndices = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pQueueFamilyIndices = 72L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$initialLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$initialLayout = 80L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$imageType,
			LAYOUT$format,
			LAYOUT$extent,
			LAYOUT$mipLevels,
			LAYOUT$arrayLayers,
			LAYOUT$samples,
			LAYOUT$tiling,
			LAYOUT$usage,
			LAYOUT$sharingMode,
			LAYOUT$queueFamilyIndexCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pQueueFamilyIndices,
			LAYOUT$initialLayout,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkImageCreateInfo");

	public VkImageCreateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public int imageType() {return this.ptr.get(LAYOUT$imageType, OFFSET$imageType);}
	public void imageType(int value) {this.ptr.set(LAYOUT$imageType, OFFSET$imageType, value);}
	public java.lang.foreign.MemorySegment imageType_ptr() {return this.ptr.asSlice(OFFSET$imageType, LAYOUT$imageType);}

	public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
	public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
	public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

	public vulkan.VkExtent3D extent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$extent, LAYOUT$extent));}

	public int mipLevels() {return this.ptr.get(LAYOUT$mipLevels, OFFSET$mipLevels);}
	public void mipLevels(int value) {this.ptr.set(LAYOUT$mipLevels, OFFSET$mipLevels, value);}
	public java.lang.foreign.MemorySegment mipLevels_ptr() {return this.ptr.asSlice(OFFSET$mipLevels, LAYOUT$mipLevels);}

	public int arrayLayers() {return this.ptr.get(LAYOUT$arrayLayers, OFFSET$arrayLayers);}
	public void arrayLayers(int value) {this.ptr.set(LAYOUT$arrayLayers, OFFSET$arrayLayers, value);}
	public java.lang.foreign.MemorySegment arrayLayers_ptr() {return this.ptr.asSlice(OFFSET$arrayLayers, LAYOUT$arrayLayers);}

	public int samples() {return this.ptr.get(LAYOUT$samples, OFFSET$samples);}
	public void samples(int value) {this.ptr.set(LAYOUT$samples, OFFSET$samples, value);}
	public java.lang.foreign.MemorySegment samples_ptr() {return this.ptr.asSlice(OFFSET$samples, LAYOUT$samples);}

	public int tiling() {return this.ptr.get(LAYOUT$tiling, OFFSET$tiling);}
	public void tiling(int value) {this.ptr.set(LAYOUT$tiling, OFFSET$tiling, value);}
	public java.lang.foreign.MemorySegment tiling_ptr() {return this.ptr.asSlice(OFFSET$tiling, LAYOUT$tiling);}

	public int usage() {return this.ptr.get(LAYOUT$usage, OFFSET$usage);}
	public void usage(int value) {this.ptr.set(LAYOUT$usage, OFFSET$usage, value);}
	public java.lang.foreign.MemorySegment usage_ptr() {return this.ptr.asSlice(OFFSET$usage, LAYOUT$usage);}

	public int sharingMode() {return this.ptr.get(LAYOUT$sharingMode, OFFSET$sharingMode);}
	public void sharingMode(int value) {this.ptr.set(LAYOUT$sharingMode, OFFSET$sharingMode, value);}
	public java.lang.foreign.MemorySegment sharingMode_ptr() {return this.ptr.asSlice(OFFSET$sharingMode, LAYOUT$sharingMode);}

	public int queueFamilyIndexCount() {return this.ptr.get(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount);}
	public void queueFamilyIndexCount(int value) {this.ptr.set(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount, value);}
	public java.lang.foreign.MemorySegment queueFamilyIndexCount_ptr() {return this.ptr.asSlice(OFFSET$queueFamilyIndexCount, LAYOUT$queueFamilyIndexCount);}

	public java.lang.foreign.MemorySegment pQueueFamilyIndices() {return this.ptr.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);}
	public void pQueueFamilyIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);}
	public java.lang.foreign.MemorySegment pQueueFamilyIndices_ptr() {return this.ptr.asSlice(OFFSET$pQueueFamilyIndices, LAYOUT$pQueueFamilyIndices);}

	public int initialLayout() {return this.ptr.get(LAYOUT$initialLayout, OFFSET$initialLayout);}
	public void initialLayout(int value) {this.ptr.set(LAYOUT$initialLayout, OFFSET$initialLayout, value);}
	public java.lang.foreign.MemorySegment initialLayout_ptr() {return this.ptr.asSlice(OFFSET$initialLayout, LAYOUT$initialLayout);}
}

package vulkan;

public record VkSurfaceCapabilities2EXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minImageCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minImageCount = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxImageCount = 20L;
	public static final java.lang.foreign.GroupLayout LAYOUT$currentExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$currentExtent = 24L;
	public static final java.lang.foreign.GroupLayout LAYOUT$minImageExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$minImageExtent = 32L;
	public static final java.lang.foreign.GroupLayout LAYOUT$maxImageExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$maxImageExtent = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxImageArrayLayers = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedTransforms = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedTransforms = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$currentTransform = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$currentTransform = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedCompositeAlpha = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedCompositeAlpha = 60L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedUsageFlags = 64L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedSurfaceCounters = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedSurfaceCounters = 68L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$minImageCount,
			LAYOUT$maxImageCount,
			LAYOUT$currentExtent,
			LAYOUT$minImageExtent,
			LAYOUT$maxImageExtent,
			LAYOUT$maxImageArrayLayers,
			LAYOUT$supportedTransforms,
			LAYOUT$currentTransform,
			LAYOUT$supportedCompositeAlpha,
			LAYOUT$supportedUsageFlags,
			LAYOUT$supportedSurfaceCounters
	).withName("VkSurfaceCapabilities2EXT");

	public VkSurfaceCapabilities2EXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int minImageCount() {return this.ptr.get(LAYOUT$minImageCount, OFFSET$minImageCount);}
	public void minImageCount(int value) {this.ptr.set(LAYOUT$minImageCount, OFFSET$minImageCount, value);}
	public java.lang.foreign.MemorySegment minImageCount_ptr() {return this.ptr.asSlice(OFFSET$minImageCount, LAYOUT$minImageCount);}

	public int maxImageCount() {return this.ptr.get(LAYOUT$maxImageCount, OFFSET$maxImageCount);}
	public void maxImageCount(int value) {this.ptr.set(LAYOUT$maxImageCount, OFFSET$maxImageCount, value);}
	public java.lang.foreign.MemorySegment maxImageCount_ptr() {return this.ptr.asSlice(OFFSET$maxImageCount, LAYOUT$maxImageCount);}

	public vulkan.VkExtent2D currentExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$currentExtent, LAYOUT$currentExtent));}

	public vulkan.VkExtent2D minImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minImageExtent, LAYOUT$minImageExtent));}

	public vulkan.VkExtent2D maxImageExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxImageExtent, LAYOUT$maxImageExtent));}

	public int maxImageArrayLayers() {return this.ptr.get(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers);}
	public void maxImageArrayLayers(int value) {this.ptr.set(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers, value);}
	public java.lang.foreign.MemorySegment maxImageArrayLayers_ptr() {return this.ptr.asSlice(OFFSET$maxImageArrayLayers, LAYOUT$maxImageArrayLayers);}

	public int supportedTransforms() {return this.ptr.get(LAYOUT$supportedTransforms, OFFSET$supportedTransforms);}
	public void supportedTransforms(int value) {this.ptr.set(LAYOUT$supportedTransforms, OFFSET$supportedTransforms, value);}
	public java.lang.foreign.MemorySegment supportedTransforms_ptr() {return this.ptr.asSlice(OFFSET$supportedTransforms, LAYOUT$supportedTransforms);}

	public int currentTransform() {return this.ptr.get(LAYOUT$currentTransform, OFFSET$currentTransform);}
	public void currentTransform(int value) {this.ptr.set(LAYOUT$currentTransform, OFFSET$currentTransform, value);}
	public java.lang.foreign.MemorySegment currentTransform_ptr() {return this.ptr.asSlice(OFFSET$currentTransform, LAYOUT$currentTransform);}

	public int supportedCompositeAlpha() {return this.ptr.get(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha);}
	public void supportedCompositeAlpha(int value) {this.ptr.set(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha, value);}
	public java.lang.foreign.MemorySegment supportedCompositeAlpha_ptr() {return this.ptr.asSlice(OFFSET$supportedCompositeAlpha, LAYOUT$supportedCompositeAlpha);}

	public int supportedUsageFlags() {return this.ptr.get(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags);}
	public void supportedUsageFlags(int value) {this.ptr.set(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags, value);}
	public java.lang.foreign.MemorySegment supportedUsageFlags_ptr() {return this.ptr.asSlice(OFFSET$supportedUsageFlags, LAYOUT$supportedUsageFlags);}

	public int supportedSurfaceCounters() {return this.ptr.get(LAYOUT$supportedSurfaceCounters, OFFSET$supportedSurfaceCounters);}
	public void supportedSurfaceCounters(int value) {this.ptr.set(LAYOUT$supportedSurfaceCounters, OFFSET$supportedSurfaceCounters, value);}
	public java.lang.foreign.MemorySegment supportedSurfaceCounters_ptr() {return this.ptr.asSlice(OFFSET$supportedSurfaceCounters, LAYOUT$supportedSurfaceCounters);}
}

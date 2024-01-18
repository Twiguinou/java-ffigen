package vulkan;

public record VkSurfaceCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minImageCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minImageCount = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxImageCount = 4L;
	public static final java.lang.foreign.GroupLayout LAYOUT$currentExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$currentExtent = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$minImageExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$minImageExtent = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$maxImageExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$maxImageExtent = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxImageArrayLayers = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedTransforms = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedTransforms = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$currentTransform = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$currentTransform = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedCompositeAlpha = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedCompositeAlpha = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedUsageFlags = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$minImageCount,
			LAYOUT$maxImageCount,
			LAYOUT$currentExtent,
			LAYOUT$minImageExtent,
			LAYOUT$maxImageExtent,
			LAYOUT$maxImageArrayLayers,
			LAYOUT$supportedTransforms,
			LAYOUT$currentTransform,
			LAYOUT$supportedCompositeAlpha,
			LAYOUT$supportedUsageFlags
	).withName("VkSurfaceCapabilitiesKHR");

	public VkSurfaceCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

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
}

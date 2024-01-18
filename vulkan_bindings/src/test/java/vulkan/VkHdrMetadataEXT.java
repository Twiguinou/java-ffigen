package vulkan;

public record VkHdrMetadataEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$displayPrimaryRed = vulkan.VkXYColorEXT.gStructLayout;
	public static final long OFFSET$displayPrimaryRed = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$displayPrimaryGreen = vulkan.VkXYColorEXT.gStructLayout;
	public static final long OFFSET$displayPrimaryGreen = 24L;
	public static final java.lang.foreign.GroupLayout LAYOUT$displayPrimaryBlue = vulkan.VkXYColorEXT.gStructLayout;
	public static final long OFFSET$displayPrimaryBlue = 32L;
	public static final java.lang.foreign.GroupLayout LAYOUT$whitePoint = vulkan.VkXYColorEXT.gStructLayout;
	public static final long OFFSET$whitePoint = 40L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxLuminance = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$maxLuminance = 48L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minLuminance = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$minLuminance = 52L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxContentLightLevel = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$maxContentLightLevel = 56L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxFrameAverageLightLevel = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$maxFrameAverageLightLevel = 60L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$displayPrimaryRed,
			LAYOUT$displayPrimaryGreen,
			LAYOUT$displayPrimaryBlue,
			LAYOUT$whitePoint,
			LAYOUT$maxLuminance,
			LAYOUT$minLuminance,
			LAYOUT$maxContentLightLevel,
			LAYOUT$maxFrameAverageLightLevel
	).withName("VkHdrMetadataEXT");

	public VkHdrMetadataEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public vulkan.VkXYColorEXT displayPrimaryRed() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET$displayPrimaryRed, LAYOUT$displayPrimaryRed));}

	public vulkan.VkXYColorEXT displayPrimaryGreen() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET$displayPrimaryGreen, LAYOUT$displayPrimaryGreen));}

	public vulkan.VkXYColorEXT displayPrimaryBlue() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET$displayPrimaryBlue, LAYOUT$displayPrimaryBlue));}

	public vulkan.VkXYColorEXT whitePoint() {return new vulkan.VkXYColorEXT(this.ptr.asSlice(OFFSET$whitePoint, LAYOUT$whitePoint));}

	public float maxLuminance() {return this.ptr.get(LAYOUT$maxLuminance, OFFSET$maxLuminance);}
	public void maxLuminance(float value) {this.ptr.set(LAYOUT$maxLuminance, OFFSET$maxLuminance, value);}
	public java.lang.foreign.MemorySegment maxLuminance_ptr() {return this.ptr.asSlice(OFFSET$maxLuminance, LAYOUT$maxLuminance);}

	public float minLuminance() {return this.ptr.get(LAYOUT$minLuminance, OFFSET$minLuminance);}
	public void minLuminance(float value) {this.ptr.set(LAYOUT$minLuminance, OFFSET$minLuminance, value);}
	public java.lang.foreign.MemorySegment minLuminance_ptr() {return this.ptr.asSlice(OFFSET$minLuminance, LAYOUT$minLuminance);}

	public float maxContentLightLevel() {return this.ptr.get(LAYOUT$maxContentLightLevel, OFFSET$maxContentLightLevel);}
	public void maxContentLightLevel(float value) {this.ptr.set(LAYOUT$maxContentLightLevel, OFFSET$maxContentLightLevel, value);}
	public java.lang.foreign.MemorySegment maxContentLightLevel_ptr() {return this.ptr.asSlice(OFFSET$maxContentLightLevel, LAYOUT$maxContentLightLevel);}

	public float maxFrameAverageLightLevel() {return this.ptr.get(LAYOUT$maxFrameAverageLightLevel, OFFSET$maxFrameAverageLightLevel);}
	public void maxFrameAverageLightLevel(float value) {this.ptr.set(LAYOUT$maxFrameAverageLightLevel, OFFSET$maxFrameAverageLightLevel, value);}
	public java.lang.foreign.MemorySegment maxFrameAverageLightLevel_ptr() {return this.ptr.asSlice(OFFSET$maxFrameAverageLightLevel, LAYOUT$maxFrameAverageLightLevel);}
}

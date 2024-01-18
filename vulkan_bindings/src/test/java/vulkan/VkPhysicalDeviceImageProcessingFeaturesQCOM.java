package vulkan;

public record VkPhysicalDeviceImageProcessingFeaturesQCOM(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textureSampleWeighted = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$textureSampleWeighted = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textureBoxFilter = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$textureBoxFilter = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textureBlockMatch = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$textureBlockMatch = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$textureSampleWeighted,
			LAYOUT$textureBoxFilter,
			LAYOUT$textureBlockMatch,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceImageProcessingFeaturesQCOM");

	public VkPhysicalDeviceImageProcessingFeaturesQCOM(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int textureSampleWeighted() {return this.ptr.get(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted);}
	public void textureSampleWeighted(int value) {this.ptr.set(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted, value);}
	public java.lang.foreign.MemorySegment textureSampleWeighted_ptr() {return this.ptr.asSlice(OFFSET$textureSampleWeighted, LAYOUT$textureSampleWeighted);}

	public int textureBoxFilter() {return this.ptr.get(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter);}
	public void textureBoxFilter(int value) {this.ptr.set(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter, value);}
	public java.lang.foreign.MemorySegment textureBoxFilter_ptr() {return this.ptr.asSlice(OFFSET$textureBoxFilter, LAYOUT$textureBoxFilter);}

	public int textureBlockMatch() {return this.ptr.get(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch);}
	public void textureBlockMatch(int value) {this.ptr.set(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch, value);}
	public java.lang.foreign.MemorySegment textureBlockMatch_ptr() {return this.ptr.asSlice(OFFSET$textureBlockMatch, LAYOUT$textureBlockMatch);}
}

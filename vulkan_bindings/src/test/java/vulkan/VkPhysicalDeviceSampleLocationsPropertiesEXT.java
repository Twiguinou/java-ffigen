package vulkan;

public record VkPhysicalDeviceSampleLocationsPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleLocationSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sampleLocationSampleCounts = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$maxSampleLocationGridSize = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$maxSampleLocationGridSize = 20L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$sampleLocationCoordinateRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT);
	public static final long OFFSET$sampleLocationCoordinateRange = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleLocationSubPixelBits = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sampleLocationSubPixelBits = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$variableSampleLocations = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$variableSampleLocations = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$sampleLocationSampleCounts,
			LAYOUT$maxSampleLocationGridSize,
			LAYOUT$sampleLocationCoordinateRange,
			LAYOUT$sampleLocationSubPixelBits,
			LAYOUT$variableSampleLocations,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceSampleLocationsPropertiesEXT");

	public VkPhysicalDeviceSampleLocationsPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int sampleLocationSampleCounts() {return this.ptr.get(LAYOUT$sampleLocationSampleCounts, OFFSET$sampleLocationSampleCounts);}
	public void sampleLocationSampleCounts(int value) {this.ptr.set(LAYOUT$sampleLocationSampleCounts, OFFSET$sampleLocationSampleCounts, value);}
	public java.lang.foreign.MemorySegment sampleLocationSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$sampleLocationSampleCounts, LAYOUT$sampleLocationSampleCounts);}

	public vulkan.VkExtent2D maxSampleLocationGridSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxSampleLocationGridSize, LAYOUT$maxSampleLocationGridSize));}

	public java.lang.foreign.MemorySegment sampleLocationCoordinateRange() {return this.ptr.asSlice(OFFSET$sampleLocationCoordinateRange, LAYOUT$sampleLocationCoordinateRange);}
	public float sampleLocationCoordinateRange(int i) {return this.sampleLocationCoordinateRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
	public void sampleLocationCoordinateRange(int i, float value) {this.sampleLocationCoordinateRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}

	public int sampleLocationSubPixelBits() {return this.ptr.get(LAYOUT$sampleLocationSubPixelBits, OFFSET$sampleLocationSubPixelBits);}
	public void sampleLocationSubPixelBits(int value) {this.ptr.set(LAYOUT$sampleLocationSubPixelBits, OFFSET$sampleLocationSubPixelBits, value);}
	public java.lang.foreign.MemorySegment sampleLocationSubPixelBits_ptr() {return this.ptr.asSlice(OFFSET$sampleLocationSubPixelBits, LAYOUT$sampleLocationSubPixelBits);}

	public int variableSampleLocations() {return this.ptr.get(LAYOUT$variableSampleLocations, OFFSET$variableSampleLocations);}
	public void variableSampleLocations(int value) {this.ptr.set(LAYOUT$variableSampleLocations, OFFSET$variableSampleLocations, value);}
	public java.lang.foreign.MemorySegment variableSampleLocations_ptr() {return this.ptr.asSlice(OFFSET$variableSampleLocations, LAYOUT$variableSampleLocations);}
}

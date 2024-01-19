package vulkan;

public record VkCoarseSampleOrderCustomNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shadingRate = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampleCount = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleLocationCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampleLocationCount = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSampleLocations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSampleLocations = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$shadingRate,
            LAYOUT$sampleCount,
            LAYOUT$sampleLocationCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSampleLocations
    ).withName("VkCoarseSampleOrderCustomNV");

    public VkCoarseSampleOrderCustomNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int shadingRate() {return this.ptr.get(LAYOUT$shadingRate, OFFSET$shadingRate);}
    public void shadingRate(int value) {this.ptr.set(LAYOUT$shadingRate, OFFSET$shadingRate, value);}
    public java.lang.foreign.MemorySegment shadingRate_ptr() {return this.ptr.asSlice(OFFSET$shadingRate, LAYOUT$shadingRate);}

    public int sampleCount() {return this.ptr.get(LAYOUT$sampleCount, OFFSET$sampleCount);}
    public void sampleCount(int value) {this.ptr.set(LAYOUT$sampleCount, OFFSET$sampleCount, value);}
    public java.lang.foreign.MemorySegment sampleCount_ptr() {return this.ptr.asSlice(OFFSET$sampleCount, LAYOUT$sampleCount);}

    public int sampleLocationCount() {return this.ptr.get(LAYOUT$sampleLocationCount, OFFSET$sampleLocationCount);}
    public void sampleLocationCount(int value) {this.ptr.set(LAYOUT$sampleLocationCount, OFFSET$sampleLocationCount, value);}
    public java.lang.foreign.MemorySegment sampleLocationCount_ptr() {return this.ptr.asSlice(OFFSET$sampleLocationCount, LAYOUT$sampleLocationCount);}

    public java.lang.foreign.MemorySegment pSampleLocations() {return this.ptr.get(LAYOUT$pSampleLocations, OFFSET$pSampleLocations);}
    public void pSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSampleLocations, OFFSET$pSampleLocations, value);}
    public java.lang.foreign.MemorySegment pSampleLocations_ptr() {return this.ptr.asSlice(OFFSET$pSampleLocations, LAYOUT$pSampleLocations);}
}

package vulkan;

public record VkSampleLocationsInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleLocationsPerPixel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampleLocationsPerPixel = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$sampleLocationGridSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$sampleLocationGridSize = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleLocationsCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampleLocationsCount = 28L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSampleLocations = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSampleLocations = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$sampleLocationsPerPixel,
            LAYOUT$sampleLocationGridSize,
            LAYOUT$sampleLocationsCount,
            LAYOUT$pSampleLocations
    ).withName("VkSampleLocationsInfoEXT");

    public VkSampleLocationsInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int sampleLocationsPerPixel() {return this.ptr.get(LAYOUT$sampleLocationsPerPixel, OFFSET$sampleLocationsPerPixel);}
    public void sampleLocationsPerPixel(int value) {this.ptr.set(LAYOUT$sampleLocationsPerPixel, OFFSET$sampleLocationsPerPixel, value);}
    public java.lang.foreign.MemorySegment sampleLocationsPerPixel_ptr() {return this.ptr.asSlice(OFFSET$sampleLocationsPerPixel, LAYOUT$sampleLocationsPerPixel);}

    public vulkan.VkExtent2D sampleLocationGridSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$sampleLocationGridSize, LAYOUT$sampleLocationGridSize));}

    public int sampleLocationsCount() {return this.ptr.get(LAYOUT$sampleLocationsCount, OFFSET$sampleLocationsCount);}
    public void sampleLocationsCount(int value) {this.ptr.set(LAYOUT$sampleLocationsCount, OFFSET$sampleLocationsCount, value);}
    public java.lang.foreign.MemorySegment sampleLocationsCount_ptr() {return this.ptr.asSlice(OFFSET$sampleLocationsCount, LAYOUT$sampleLocationsCount);}

    public java.lang.foreign.MemorySegment pSampleLocations() {return this.ptr.get(LAYOUT$pSampleLocations, OFFSET$pSampleLocations);}
    public void pSampleLocations(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSampleLocations, OFFSET$pSampleLocations, value);}
    public java.lang.foreign.MemorySegment pSampleLocations_ptr() {return this.ptr.asSlice(OFFSET$pSampleLocations, LAYOUT$pSampleLocations);}
}

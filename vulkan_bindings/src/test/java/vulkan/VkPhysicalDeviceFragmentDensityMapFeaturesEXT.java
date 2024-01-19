package vulkan;

public record VkPhysicalDeviceFragmentDensityMapFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentDensityMap = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentDensityMap = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentDensityMapDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentDensityMapDynamic = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentDensityMapNonSubsampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentDensityMapNonSubsampledImages = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$fragmentDensityMap,
            LAYOUT$fragmentDensityMapDynamic,
            LAYOUT$fragmentDensityMapNonSubsampledImages,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFragmentDensityMapFeaturesEXT");

    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int fragmentDensityMap() {return this.ptr.get(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap);}
    public void fragmentDensityMap(int value) {this.ptr.set(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap, value);}
    public java.lang.foreign.MemorySegment fragmentDensityMap_ptr() {return this.ptr.asSlice(OFFSET$fragmentDensityMap, LAYOUT$fragmentDensityMap);}

    public int fragmentDensityMapDynamic() {return this.ptr.get(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic);}
    public void fragmentDensityMapDynamic(int value) {this.ptr.set(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic, value);}
    public java.lang.foreign.MemorySegment fragmentDensityMapDynamic_ptr() {return this.ptr.asSlice(OFFSET$fragmentDensityMapDynamic, LAYOUT$fragmentDensityMapDynamic);}

    public int fragmentDensityMapNonSubsampledImages() {return this.ptr.get(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages);}
    public void fragmentDensityMapNonSubsampledImages(int value) {this.ptr.set(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages, value);}
    public java.lang.foreign.MemorySegment fragmentDensityMapNonSubsampledImages_ptr() {return this.ptr.asSlice(OFFSET$fragmentDensityMapNonSubsampledImages, LAYOUT$fragmentDensityMapNonSubsampledImages);}
}

package vulkan;

public record VkPhysicalDeviceShadingRateImageFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRateImage = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shadingRateImage = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRateCoarseSampleOrder = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shadingRateCoarseSampleOrder = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shadingRateImage,
            LAYOUT$shadingRateCoarseSampleOrder
    ).withName("VkPhysicalDeviceShadingRateImageFeaturesNV");

    public VkPhysicalDeviceShadingRateImageFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shadingRateImage() {return this.ptr.get(LAYOUT$shadingRateImage, OFFSET$shadingRateImage);}
    public void shadingRateImage(int value) {this.ptr.set(LAYOUT$shadingRateImage, OFFSET$shadingRateImage, value);}
    public java.lang.foreign.MemorySegment shadingRateImage_ptr() {return this.ptr.asSlice(OFFSET$shadingRateImage, LAYOUT$shadingRateImage);}

    public int shadingRateCoarseSampleOrder() {return this.ptr.get(LAYOUT$shadingRateCoarseSampleOrder, OFFSET$shadingRateCoarseSampleOrder);}
    public void shadingRateCoarseSampleOrder(int value) {this.ptr.set(LAYOUT$shadingRateCoarseSampleOrder, OFFSET$shadingRateCoarseSampleOrder, value);}
    public java.lang.foreign.MemorySegment shadingRateCoarseSampleOrder_ptr() {return this.ptr.asSlice(OFFSET$shadingRateCoarseSampleOrder, LAYOUT$shadingRateCoarseSampleOrder);}
}

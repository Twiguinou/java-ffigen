package vulkan;

public record VkPipelineViewportShadingRateImageStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRateImageEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shadingRateImageEnable = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$viewportCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pShadingRatePalettes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pShadingRatePalettes = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shadingRateImageEnable,
            LAYOUT$viewportCount,
            LAYOUT$pShadingRatePalettes
    ).withName("VkPipelineViewportShadingRateImageStateCreateInfoNV");

    public VkPipelineViewportShadingRateImageStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shadingRateImageEnable() {return this.ptr.get(LAYOUT$shadingRateImageEnable, OFFSET$shadingRateImageEnable);}
    public void shadingRateImageEnable(int value) {this.ptr.set(LAYOUT$shadingRateImageEnable, OFFSET$shadingRateImageEnable, value);}
    public java.lang.foreign.MemorySegment shadingRateImageEnable_ptr() {return this.ptr.asSlice(OFFSET$shadingRateImageEnable, LAYOUT$shadingRateImageEnable);}

    public int viewportCount() {return this.ptr.get(LAYOUT$viewportCount, OFFSET$viewportCount);}
    public void viewportCount(int value) {this.ptr.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);}
    public java.lang.foreign.MemorySegment viewportCount_ptr() {return this.ptr.asSlice(OFFSET$viewportCount, LAYOUT$viewportCount);}

    public java.lang.foreign.MemorySegment pShadingRatePalettes() {return this.ptr.get(LAYOUT$pShadingRatePalettes, OFFSET$pShadingRatePalettes);}
    public void pShadingRatePalettes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pShadingRatePalettes, OFFSET$pShadingRatePalettes, value);}
    public java.lang.foreign.MemorySegment pShadingRatePalettes_ptr() {return this.ptr.asSlice(OFFSET$pShadingRatePalettes, LAYOUT$pShadingRatePalettes);}
}

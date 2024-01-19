package vulkan;

public record VkPhysicalDeviceMaintenance5PropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthStencilSwizzleOneSupport = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthStencilSwizzleOneSupport = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$polygonModePointSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$polygonModePointSize = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$nonStrictSinglePixelWideLinesUseParallelogram = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nonStrictWideLinesUseParallelogram = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$nonStrictWideLinesUseParallelogram = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting,
            LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting,
            LAYOUT$depthStencilSwizzleOneSupport,
            LAYOUT$polygonModePointSize,
            LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram,
            LAYOUT$nonStrictWideLinesUseParallelogram
    ).withName("VkPhysicalDeviceMaintenance5PropertiesKHR");

    public VkPhysicalDeviceMaintenance5PropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int earlyFragmentMultisampleCoverageAfterSampleCounting() {return this.ptr.get(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting);}
    public void earlyFragmentMultisampleCoverageAfterSampleCounting(int value) {this.ptr.set(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting, value);}
    public java.lang.foreign.MemorySegment earlyFragmentMultisampleCoverageAfterSampleCounting_ptr() {return this.ptr.asSlice(OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting, LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting);}

    public int earlyFragmentSampleMaskTestBeforeSampleCounting() {return this.ptr.get(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting);}
    public void earlyFragmentSampleMaskTestBeforeSampleCounting(int value) {this.ptr.set(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting, value);}
    public java.lang.foreign.MemorySegment earlyFragmentSampleMaskTestBeforeSampleCounting_ptr() {return this.ptr.asSlice(OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting, LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting);}

    public int depthStencilSwizzleOneSupport() {return this.ptr.get(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport);}
    public void depthStencilSwizzleOneSupport(int value) {this.ptr.set(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport, value);}
    public java.lang.foreign.MemorySegment depthStencilSwizzleOneSupport_ptr() {return this.ptr.asSlice(OFFSET$depthStencilSwizzleOneSupport, LAYOUT$depthStencilSwizzleOneSupport);}

    public int polygonModePointSize() {return this.ptr.get(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize);}
    public void polygonModePointSize(int value) {this.ptr.set(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize, value);}
    public java.lang.foreign.MemorySegment polygonModePointSize_ptr() {return this.ptr.asSlice(OFFSET$polygonModePointSize, LAYOUT$polygonModePointSize);}

    public int nonStrictSinglePixelWideLinesUseParallelogram() {return this.ptr.get(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram);}
    public void nonStrictSinglePixelWideLinesUseParallelogram(int value) {this.ptr.set(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram, value);}
    public java.lang.foreign.MemorySegment nonStrictSinglePixelWideLinesUseParallelogram_ptr() {return this.ptr.asSlice(OFFSET$nonStrictSinglePixelWideLinesUseParallelogram, LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram);}

    public int nonStrictWideLinesUseParallelogram() {return this.ptr.get(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram);}
    public void nonStrictWideLinesUseParallelogram(int value) {this.ptr.set(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram, value);}
    public java.lang.foreign.MemorySegment nonStrictWideLinesUseParallelogram_ptr() {return this.ptr.asSlice(OFFSET$nonStrictWideLinesUseParallelogram, LAYOUT$nonStrictWideLinesUseParallelogram);}
}

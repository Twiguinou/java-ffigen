package vulkan;

public record VkFramebufferMixedSamplesCombinationNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$coverageReductionMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$coverageReductionMode = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rasterizationSamples = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthStencilSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthStencilSamples = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$colorSamples = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$coverageReductionMode,
            LAYOUT$rasterizationSamples,
            LAYOUT$depthStencilSamples,
            LAYOUT$colorSamples
    ).withName("VkFramebufferMixedSamplesCombinationNV");

    public VkFramebufferMixedSamplesCombinationNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int coverageReductionMode() {return this.ptr.get(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode);}
    public void coverageReductionMode(int value) {this.ptr.set(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode, value);}
    public java.lang.foreign.MemorySegment coverageReductionMode_ptr() {return this.ptr.asSlice(OFFSET$coverageReductionMode, LAYOUT$coverageReductionMode);}

    public int rasterizationSamples() {return this.ptr.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);}
    public void rasterizationSamples(int value) {this.ptr.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);}
    public java.lang.foreign.MemorySegment rasterizationSamples_ptr() {return this.ptr.asSlice(OFFSET$rasterizationSamples, LAYOUT$rasterizationSamples);}

    public int depthStencilSamples() {return this.ptr.get(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples);}
    public void depthStencilSamples(int value) {this.ptr.set(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples, value);}
    public java.lang.foreign.MemorySegment depthStencilSamples_ptr() {return this.ptr.asSlice(OFFSET$depthStencilSamples, LAYOUT$depthStencilSamples);}

    public int colorSamples() {return this.ptr.get(LAYOUT$colorSamples, OFFSET$colorSamples);}
    public void colorSamples(int value) {this.ptr.set(LAYOUT$colorSamples, OFFSET$colorSamples, value);}
    public java.lang.foreign.MemorySegment colorSamples_ptr() {return this.ptr.asSlice(OFFSET$colorSamples, LAYOUT$colorSamples);}
}

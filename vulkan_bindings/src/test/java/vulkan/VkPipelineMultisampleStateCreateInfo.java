package vulkan;

public record VkPipelineMultisampleStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rasterizationSamples = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleShadingEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampleShadingEnable = 24L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minSampleShading = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$minSampleShading = 28L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSampleMask = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSampleMask = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$alphaToCoverageEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$alphaToCoverageEnable = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$alphaToOneEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$alphaToOneEnable = 44L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$rasterizationSamples,
            LAYOUT$sampleShadingEnable,
            LAYOUT$minSampleShading,
            LAYOUT$pSampleMask,
            LAYOUT$alphaToCoverageEnable,
            LAYOUT$alphaToOneEnable
    ).withName("VkPipelineMultisampleStateCreateInfo");

    public VkPipelineMultisampleStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int rasterizationSamples() {return this.ptr.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);}
    public void rasterizationSamples(int value) {this.ptr.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);}
    public java.lang.foreign.MemorySegment rasterizationSamples_ptr() {return this.ptr.asSlice(OFFSET$rasterizationSamples, LAYOUT$rasterizationSamples);}

    public int sampleShadingEnable() {return this.ptr.get(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable);}
    public void sampleShadingEnable(int value) {this.ptr.set(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable, value);}
    public java.lang.foreign.MemorySegment sampleShadingEnable_ptr() {return this.ptr.asSlice(OFFSET$sampleShadingEnable, LAYOUT$sampleShadingEnable);}

    public float minSampleShading() {return this.ptr.get(LAYOUT$minSampleShading, OFFSET$minSampleShading);}
    public void minSampleShading(float value) {this.ptr.set(LAYOUT$minSampleShading, OFFSET$minSampleShading, value);}
    public java.lang.foreign.MemorySegment minSampleShading_ptr() {return this.ptr.asSlice(OFFSET$minSampleShading, LAYOUT$minSampleShading);}

    public java.lang.foreign.MemorySegment pSampleMask() {return this.ptr.get(LAYOUT$pSampleMask, OFFSET$pSampleMask);}
    public void pSampleMask(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSampleMask, OFFSET$pSampleMask, value);}
    public java.lang.foreign.MemorySegment pSampleMask_ptr() {return this.ptr.asSlice(OFFSET$pSampleMask, LAYOUT$pSampleMask);}

    public int alphaToCoverageEnable() {return this.ptr.get(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable);}
    public void alphaToCoverageEnable(int value) {this.ptr.set(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable, value);}
    public java.lang.foreign.MemorySegment alphaToCoverageEnable_ptr() {return this.ptr.asSlice(OFFSET$alphaToCoverageEnable, LAYOUT$alphaToCoverageEnable);}

    public int alphaToOneEnable() {return this.ptr.get(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable);}
    public void alphaToOneEnable(int value) {this.ptr.set(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable, value);}
    public java.lang.foreign.MemorySegment alphaToOneEnable_ptr() {return this.ptr.asSlice(OFFSET$alphaToOneEnable, LAYOUT$alphaToOneEnable);}
}

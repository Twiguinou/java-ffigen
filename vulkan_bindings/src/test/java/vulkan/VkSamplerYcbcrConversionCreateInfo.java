package vulkan;

public record VkSamplerYcbcrConversionCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$format = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$ycbcrModel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$ycbcrModel = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$ycbcrRange = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$ycbcrRange = 24L;
    public static final java.lang.foreign.GroupLayout LAYOUT$components = vulkan.VkComponentMapping.gStructLayout;
    public static final long OFFSET$components = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$xChromaOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$xChromaOffset = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$yChromaOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$yChromaOffset = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$chromaFilter = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$chromaFilter = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$forceExplicitReconstruction = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$forceExplicitReconstruction = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$format,
            LAYOUT$ycbcrModel,
            LAYOUT$ycbcrRange,
            LAYOUT$components,
            LAYOUT$xChromaOffset,
            LAYOUT$yChromaOffset,
            LAYOUT$chromaFilter,
            LAYOUT$forceExplicitReconstruction,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSamplerYcbcrConversionCreateInfo");

    public VkSamplerYcbcrConversionCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
    public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
    public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

    public int ycbcrModel() {return this.ptr.get(LAYOUT$ycbcrModel, OFFSET$ycbcrModel);}
    public void ycbcrModel(int value) {this.ptr.set(LAYOUT$ycbcrModel, OFFSET$ycbcrModel, value);}
    public java.lang.foreign.MemorySegment ycbcrModel_ptr() {return this.ptr.asSlice(OFFSET$ycbcrModel, LAYOUT$ycbcrModel);}

    public int ycbcrRange() {return this.ptr.get(LAYOUT$ycbcrRange, OFFSET$ycbcrRange);}
    public void ycbcrRange(int value) {this.ptr.set(LAYOUT$ycbcrRange, OFFSET$ycbcrRange, value);}
    public java.lang.foreign.MemorySegment ycbcrRange_ptr() {return this.ptr.asSlice(OFFSET$ycbcrRange, LAYOUT$ycbcrRange);}

    public vulkan.VkComponentMapping components() {return new vulkan.VkComponentMapping(this.ptr.asSlice(OFFSET$components, LAYOUT$components));}

    public int xChromaOffset() {return this.ptr.get(LAYOUT$xChromaOffset, OFFSET$xChromaOffset);}
    public void xChromaOffset(int value) {this.ptr.set(LAYOUT$xChromaOffset, OFFSET$xChromaOffset, value);}
    public java.lang.foreign.MemorySegment xChromaOffset_ptr() {return this.ptr.asSlice(OFFSET$xChromaOffset, LAYOUT$xChromaOffset);}

    public int yChromaOffset() {return this.ptr.get(LAYOUT$yChromaOffset, OFFSET$yChromaOffset);}
    public void yChromaOffset(int value) {this.ptr.set(LAYOUT$yChromaOffset, OFFSET$yChromaOffset, value);}
    public java.lang.foreign.MemorySegment yChromaOffset_ptr() {return this.ptr.asSlice(OFFSET$yChromaOffset, LAYOUT$yChromaOffset);}

    public int chromaFilter() {return this.ptr.get(LAYOUT$chromaFilter, OFFSET$chromaFilter);}
    public void chromaFilter(int value) {this.ptr.set(LAYOUT$chromaFilter, OFFSET$chromaFilter, value);}
    public java.lang.foreign.MemorySegment chromaFilter_ptr() {return this.ptr.asSlice(OFFSET$chromaFilter, LAYOUT$chromaFilter);}

    public int forceExplicitReconstruction() {return this.ptr.get(LAYOUT$forceExplicitReconstruction, OFFSET$forceExplicitReconstruction);}
    public void forceExplicitReconstruction(int value) {this.ptr.set(LAYOUT$forceExplicitReconstruction, OFFSET$forceExplicitReconstruction, value);}
    public java.lang.foreign.MemorySegment forceExplicitReconstruction_ptr() {return this.ptr.asSlice(OFFSET$forceExplicitReconstruction, LAYOUT$forceExplicitReconstruction);}
}

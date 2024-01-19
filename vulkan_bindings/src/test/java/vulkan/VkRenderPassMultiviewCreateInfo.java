package vulkan;

public record VkRenderPassMultiviewCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subpassCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subpassCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pViewMasks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pViewMasks = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dependencyCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dependencyCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pViewOffsets = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pViewOffsets = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$correlationMaskCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$correlationMaskCount = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pCorrelationMasks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pCorrelationMasks = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$subpassCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pViewMasks,
            LAYOUT$dependencyCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pViewOffsets,
            LAYOUT$correlationMaskCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pCorrelationMasks
    ).withName("VkRenderPassMultiviewCreateInfo");

    public VkRenderPassMultiviewCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int subpassCount() {return this.ptr.get(LAYOUT$subpassCount, OFFSET$subpassCount);}
    public void subpassCount(int value) {this.ptr.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);}
    public java.lang.foreign.MemorySegment subpassCount_ptr() {return this.ptr.asSlice(OFFSET$subpassCount, LAYOUT$subpassCount);}

    public java.lang.foreign.MemorySegment pViewMasks() {return this.ptr.get(LAYOUT$pViewMasks, OFFSET$pViewMasks);}
    public void pViewMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewMasks, OFFSET$pViewMasks, value);}
    public java.lang.foreign.MemorySegment pViewMasks_ptr() {return this.ptr.asSlice(OFFSET$pViewMasks, LAYOUT$pViewMasks);}

    public int dependencyCount() {return this.ptr.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);}
    public void dependencyCount(int value) {this.ptr.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);}
    public java.lang.foreign.MemorySegment dependencyCount_ptr() {return this.ptr.asSlice(OFFSET$dependencyCount, LAYOUT$dependencyCount);}

    public java.lang.foreign.MemorySegment pViewOffsets() {return this.ptr.get(LAYOUT$pViewOffsets, OFFSET$pViewOffsets);}
    public void pViewOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewOffsets, OFFSET$pViewOffsets, value);}
    public java.lang.foreign.MemorySegment pViewOffsets_ptr() {return this.ptr.asSlice(OFFSET$pViewOffsets, LAYOUT$pViewOffsets);}

    public int correlationMaskCount() {return this.ptr.get(LAYOUT$correlationMaskCount, OFFSET$correlationMaskCount);}
    public void correlationMaskCount(int value) {this.ptr.set(LAYOUT$correlationMaskCount, OFFSET$correlationMaskCount, value);}
    public java.lang.foreign.MemorySegment correlationMaskCount_ptr() {return this.ptr.asSlice(OFFSET$correlationMaskCount, LAYOUT$correlationMaskCount);}

    public java.lang.foreign.MemorySegment pCorrelationMasks() {return this.ptr.get(LAYOUT$pCorrelationMasks, OFFSET$pCorrelationMasks);}
    public void pCorrelationMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCorrelationMasks, OFFSET$pCorrelationMasks, value);}
    public java.lang.foreign.MemorySegment pCorrelationMasks_ptr() {return this.ptr.asSlice(OFFSET$pCorrelationMasks, LAYOUT$pCorrelationMasks);}
}

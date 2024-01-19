package vulkan;

public record VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleOrderType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampleOrderType = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$customSampleOrderCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$customSampleOrderCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pCustomSampleOrders = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pCustomSampleOrders = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$sampleOrderType,
            LAYOUT$customSampleOrderCount,
            LAYOUT$pCustomSampleOrders
    ).withName("VkPipelineViewportCoarseSampleOrderStateCreateInfoNV");

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int sampleOrderType() {return this.ptr.get(LAYOUT$sampleOrderType, OFFSET$sampleOrderType);}
    public void sampleOrderType(int value) {this.ptr.set(LAYOUT$sampleOrderType, OFFSET$sampleOrderType, value);}
    public java.lang.foreign.MemorySegment sampleOrderType_ptr() {return this.ptr.asSlice(OFFSET$sampleOrderType, LAYOUT$sampleOrderType);}

    public int customSampleOrderCount() {return this.ptr.get(LAYOUT$customSampleOrderCount, OFFSET$customSampleOrderCount);}
    public void customSampleOrderCount(int value) {this.ptr.set(LAYOUT$customSampleOrderCount, OFFSET$customSampleOrderCount, value);}
    public java.lang.foreign.MemorySegment customSampleOrderCount_ptr() {return this.ptr.asSlice(OFFSET$customSampleOrderCount, LAYOUT$customSampleOrderCount);}

    public java.lang.foreign.MemorySegment pCustomSampleOrders() {return this.ptr.get(LAYOUT$pCustomSampleOrders, OFFSET$pCustomSampleOrders);}
    public void pCustomSampleOrders(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCustomSampleOrders, OFFSET$pCustomSampleOrders, value);}
    public java.lang.foreign.MemorySegment pCustomSampleOrders_ptr() {return this.ptr.asSlice(OFFSET$pCustomSampleOrders, LAYOUT$pCustomSampleOrders);}
}

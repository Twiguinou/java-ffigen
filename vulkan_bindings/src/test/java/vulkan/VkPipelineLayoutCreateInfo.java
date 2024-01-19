package vulkan;

public record VkPipelineLayoutCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$setLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$setLayoutCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSetLayouts = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSetLayouts = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pushConstantRangeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pushConstantRangeCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPushConstantRanges = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPushConstantRanges = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$setLayoutCount,
            LAYOUT$pSetLayouts,
            LAYOUT$pushConstantRangeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPushConstantRanges
    ).withName("VkPipelineLayoutCreateInfo");

    public VkPipelineLayoutCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

    public int setLayoutCount() {return this.ptr.get(LAYOUT$setLayoutCount, OFFSET$setLayoutCount);}
    public void setLayoutCount(int value) {this.ptr.set(LAYOUT$setLayoutCount, OFFSET$setLayoutCount, value);}
    public java.lang.foreign.MemorySegment setLayoutCount_ptr() {return this.ptr.asSlice(OFFSET$setLayoutCount, LAYOUT$setLayoutCount);}

    public java.lang.foreign.MemorySegment pSetLayouts() {return this.ptr.get(LAYOUT$pSetLayouts, OFFSET$pSetLayouts);}
    public void pSetLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSetLayouts, OFFSET$pSetLayouts, value);}
    public java.lang.foreign.MemorySegment pSetLayouts_ptr() {return this.ptr.asSlice(OFFSET$pSetLayouts, LAYOUT$pSetLayouts);}

    public int pushConstantRangeCount() {return this.ptr.get(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount);}
    public void pushConstantRangeCount(int value) {this.ptr.set(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount, value);}
    public java.lang.foreign.MemorySegment pushConstantRangeCount_ptr() {return this.ptr.asSlice(OFFSET$pushConstantRangeCount, LAYOUT$pushConstantRangeCount);}

    public java.lang.foreign.MemorySegment pPushConstantRanges() {return this.ptr.get(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges);}
    public void pPushConstantRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges, value);}
    public java.lang.foreign.MemorySegment pPushConstantRanges_ptr() {return this.ptr.asSlice(OFFSET$pPushConstantRanges, LAYOUT$pPushConstantRanges);}
}

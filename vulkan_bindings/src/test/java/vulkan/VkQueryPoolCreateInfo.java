package vulkan;

public record VkQueryPoolCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queryType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queryType = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queryCount = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineStatistics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pipelineStatistics = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$queryType,
            LAYOUT$queryCount,
            LAYOUT$pipelineStatistics
    ).withName("VkQueryPoolCreateInfo");

    public VkQueryPoolCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

    public int queryType() {return this.ptr.get(LAYOUT$queryType, OFFSET$queryType);}
    public void queryType(int value) {this.ptr.set(LAYOUT$queryType, OFFSET$queryType, value);}
    public java.lang.foreign.MemorySegment queryType_ptr() {return this.ptr.asSlice(OFFSET$queryType, LAYOUT$queryType);}

    public int queryCount() {return this.ptr.get(LAYOUT$queryCount, OFFSET$queryCount);}
    public void queryCount(int value) {this.ptr.set(LAYOUT$queryCount, OFFSET$queryCount, value);}
    public java.lang.foreign.MemorySegment queryCount_ptr() {return this.ptr.asSlice(OFFSET$queryCount, LAYOUT$queryCount);}

    public int pipelineStatistics() {return this.ptr.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);}
    public void pipelineStatistics(int value) {this.ptr.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);}
    public java.lang.foreign.MemorySegment pipelineStatistics_ptr() {return this.ptr.asSlice(OFFSET$pipelineStatistics, LAYOUT$pipelineStatistics);}
}

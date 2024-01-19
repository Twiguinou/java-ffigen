package vulkan;

public record VkGraphicsPipelineShaderGroupsCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$groupCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$groupCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pGroups = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pGroups = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pipelineCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPipelines = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPipelines = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$groupCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pGroups,
            LAYOUT$pipelineCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPipelines
    ).withName("VkGraphicsPipelineShaderGroupsCreateInfoNV");

    public VkGraphicsPipelineShaderGroupsCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int groupCount() {return this.ptr.get(LAYOUT$groupCount, OFFSET$groupCount);}
    public void groupCount(int value) {this.ptr.set(LAYOUT$groupCount, OFFSET$groupCount, value);}
    public java.lang.foreign.MemorySegment groupCount_ptr() {return this.ptr.asSlice(OFFSET$groupCount, LAYOUT$groupCount);}

    public java.lang.foreign.MemorySegment pGroups() {return this.ptr.get(LAYOUT$pGroups, OFFSET$pGroups);}
    public void pGroups(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pGroups, OFFSET$pGroups, value);}
    public java.lang.foreign.MemorySegment pGroups_ptr() {return this.ptr.asSlice(OFFSET$pGroups, LAYOUT$pGroups);}

    public int pipelineCount() {return this.ptr.get(LAYOUT$pipelineCount, OFFSET$pipelineCount);}
    public void pipelineCount(int value) {this.ptr.set(LAYOUT$pipelineCount, OFFSET$pipelineCount, value);}
    public java.lang.foreign.MemorySegment pipelineCount_ptr() {return this.ptr.asSlice(OFFSET$pipelineCount, LAYOUT$pipelineCount);}

    public java.lang.foreign.MemorySegment pPipelines() {return this.ptr.get(LAYOUT$pPipelines, OFFSET$pPipelines);}
    public void pPipelines(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPipelines, OFFSET$pPipelines, value);}
    public java.lang.foreign.MemorySegment pPipelines_ptr() {return this.ptr.asSlice(OFFSET$pPipelines, LAYOUT$pPipelines);}
}

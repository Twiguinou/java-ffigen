package vulkan;

public record VkRayTracingPipelineCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStages = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStages = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$groupCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$groupCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pGroups = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pGroups = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxRecursionDepth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxRecursionDepth = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 56L;
    public static final java.lang.foreign.AddressLayout LAYOUT$basePipelineHandle = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$basePipelineHandle = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$basePipelineIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$basePipelineIndex = 72L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$stageCount,
            LAYOUT$pStages,
            LAYOUT$groupCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pGroups,
            LAYOUT$maxRecursionDepth,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$layout,
            LAYOUT$basePipelineHandle,
            LAYOUT$basePipelineIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkRayTracingPipelineCreateInfoNV");

    public VkRayTracingPipelineCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
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

    public int stageCount() {return this.ptr.get(LAYOUT$stageCount, OFFSET$stageCount);}
    public void stageCount(int value) {this.ptr.set(LAYOUT$stageCount, OFFSET$stageCount, value);}
    public java.lang.foreign.MemorySegment stageCount_ptr() {return this.ptr.asSlice(OFFSET$stageCount, LAYOUT$stageCount);}

    public java.lang.foreign.MemorySegment pStages() {return this.ptr.get(LAYOUT$pStages, OFFSET$pStages);}
    public void pStages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStages, OFFSET$pStages, value);}
    public java.lang.foreign.MemorySegment pStages_ptr() {return this.ptr.asSlice(OFFSET$pStages, LAYOUT$pStages);}

    public int groupCount() {return this.ptr.get(LAYOUT$groupCount, OFFSET$groupCount);}
    public void groupCount(int value) {this.ptr.set(LAYOUT$groupCount, OFFSET$groupCount, value);}
    public java.lang.foreign.MemorySegment groupCount_ptr() {return this.ptr.asSlice(OFFSET$groupCount, LAYOUT$groupCount);}

    public java.lang.foreign.MemorySegment pGroups() {return this.ptr.get(LAYOUT$pGroups, OFFSET$pGroups);}
    public void pGroups(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pGroups, OFFSET$pGroups, value);}
    public java.lang.foreign.MemorySegment pGroups_ptr() {return this.ptr.asSlice(OFFSET$pGroups, LAYOUT$pGroups);}

    public int maxRecursionDepth() {return this.ptr.get(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth);}
    public void maxRecursionDepth(int value) {this.ptr.set(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth, value);}
    public java.lang.foreign.MemorySegment maxRecursionDepth_ptr() {return this.ptr.asSlice(OFFSET$maxRecursionDepth, LAYOUT$maxRecursionDepth);}

    public java.lang.foreign.MemorySegment layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

    public java.lang.foreign.MemorySegment basePipelineHandle() {return this.ptr.get(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle);}
    public void basePipelineHandle(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$basePipelineHandle, OFFSET$basePipelineHandle, value);}
    public java.lang.foreign.MemorySegment basePipelineHandle_ptr() {return this.ptr.asSlice(OFFSET$basePipelineHandle, LAYOUT$basePipelineHandle);}

    public int basePipelineIndex() {return this.ptr.get(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex);}
    public void basePipelineIndex(int value) {this.ptr.set(LAYOUT$basePipelineIndex, OFFSET$basePipelineIndex, value);}
    public java.lang.foreign.MemorySegment basePipelineIndex_ptr() {return this.ptr.asSlice(OFFSET$basePipelineIndex, LAYOUT$basePipelineIndex);}
}

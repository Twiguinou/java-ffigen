package vulkan;

public record VkComputePipelineCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$stage = vulkan.VkPipelineShaderStageCreateInfo.gStructLayout;
    public static final long OFFSET$stage = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$layout = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$layout = 72L;
    public static final java.lang.foreign.AddressLayout LAYOUT$basePipelineHandle = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$basePipelineHandle = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$basePipelineIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$basePipelineIndex = 88L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$stage,
            LAYOUT$layout,
            LAYOUT$basePipelineHandle,
            LAYOUT$basePipelineIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkComputePipelineCreateInfo");

    public VkComputePipelineCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

    public vulkan.VkPipelineShaderStageCreateInfo stage() {return new vulkan.VkPipelineShaderStageCreateInfo(this.ptr.asSlice(OFFSET$stage, LAYOUT$stage));}

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

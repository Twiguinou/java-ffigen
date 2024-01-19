package vulkan;

public record VkGraphicsShaderGroupCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStages = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStages = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pVertexInputState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pVertexInputState = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pTessellationState = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pTessellationState = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stageCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pStages,
            LAYOUT$pVertexInputState,
            LAYOUT$pTessellationState
    ).withName("VkGraphicsShaderGroupCreateInfoNV");

    public VkGraphicsShaderGroupCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int stageCount() {return this.ptr.get(LAYOUT$stageCount, OFFSET$stageCount);}
    public void stageCount(int value) {this.ptr.set(LAYOUT$stageCount, OFFSET$stageCount, value);}
    public java.lang.foreign.MemorySegment stageCount_ptr() {return this.ptr.asSlice(OFFSET$stageCount, LAYOUT$stageCount);}

    public java.lang.foreign.MemorySegment pStages() {return this.ptr.get(LAYOUT$pStages, OFFSET$pStages);}
    public void pStages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStages, OFFSET$pStages, value);}
    public java.lang.foreign.MemorySegment pStages_ptr() {return this.ptr.asSlice(OFFSET$pStages, LAYOUT$pStages);}

    public java.lang.foreign.MemorySegment pVertexInputState() {return this.ptr.get(LAYOUT$pVertexInputState, OFFSET$pVertexInputState);}
    public void pVertexInputState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVertexInputState, OFFSET$pVertexInputState, value);}
    public java.lang.foreign.MemorySegment pVertexInputState_ptr() {return this.ptr.asSlice(OFFSET$pVertexInputState, LAYOUT$pVertexInputState);}

    public java.lang.foreign.MemorySegment pTessellationState() {return this.ptr.get(LAYOUT$pTessellationState, OFFSET$pTessellationState);}
    public void pTessellationState(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pTessellationState, OFFSET$pTessellationState, value);}
    public java.lang.foreign.MemorySegment pTessellationState_ptr() {return this.ptr.asSlice(OFFSET$pTessellationState, LAYOUT$pTessellationState);}
}

package vulkan;

public record VkPipelineCreationFeedbackCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPipelineCreationFeedback = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPipelineCreationFeedback = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineStageCreationFeedbackCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pipelineStageCreationFeedbackCount = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPipelineStageCreationFeedbacks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPipelineStageCreationFeedbacks = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$pPipelineCreationFeedback,
            LAYOUT$pipelineStageCreationFeedbackCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPipelineStageCreationFeedbacks
    ).withName("VkPipelineCreationFeedbackCreateInfo");

    public VkPipelineCreationFeedbackCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment pPipelineCreationFeedback() {return this.ptr.get(LAYOUT$pPipelineCreationFeedback, OFFSET$pPipelineCreationFeedback);}
    public void pPipelineCreationFeedback(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPipelineCreationFeedback, OFFSET$pPipelineCreationFeedback, value);}
    public java.lang.foreign.MemorySegment pPipelineCreationFeedback_ptr() {return this.ptr.asSlice(OFFSET$pPipelineCreationFeedback, LAYOUT$pPipelineCreationFeedback);}

    public int pipelineStageCreationFeedbackCount() {return this.ptr.get(LAYOUT$pipelineStageCreationFeedbackCount, OFFSET$pipelineStageCreationFeedbackCount);}
    public void pipelineStageCreationFeedbackCount(int value) {this.ptr.set(LAYOUT$pipelineStageCreationFeedbackCount, OFFSET$pipelineStageCreationFeedbackCount, value);}
    public java.lang.foreign.MemorySegment pipelineStageCreationFeedbackCount_ptr() {return this.ptr.asSlice(OFFSET$pipelineStageCreationFeedbackCount, LAYOUT$pipelineStageCreationFeedbackCount);}

    public java.lang.foreign.MemorySegment pPipelineStageCreationFeedbacks() {return this.ptr.get(LAYOUT$pPipelineStageCreationFeedbacks, OFFSET$pPipelineStageCreationFeedbacks);}
    public void pPipelineStageCreationFeedbacks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPipelineStageCreationFeedbacks, OFFSET$pPipelineStageCreationFeedbacks, value);}
    public java.lang.foreign.MemorySegment pPipelineStageCreationFeedbacks_ptr() {return this.ptr.asSlice(OFFSET$pPipelineStageCreationFeedbacks, LAYOUT$pPipelineStageCreationFeedbacks);}
}

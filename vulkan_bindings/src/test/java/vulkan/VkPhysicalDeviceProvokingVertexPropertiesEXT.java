package vulkan;

public record VkPhysicalDeviceProvokingVertexPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$provokingVertexModePerPipeline = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$provokingVertexModePerPipeline = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$provokingVertexModePerPipeline,
            LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex
    ).withName("VkPhysicalDeviceProvokingVertexPropertiesEXT");

    public VkPhysicalDeviceProvokingVertexPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int provokingVertexModePerPipeline() {return this.ptr.get(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline);}
    public void provokingVertexModePerPipeline(int value) {this.ptr.set(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline, value);}
    public java.lang.foreign.MemorySegment provokingVertexModePerPipeline_ptr() {return this.ptr.asSlice(OFFSET$provokingVertexModePerPipeline, LAYOUT$provokingVertexModePerPipeline);}

    public int transformFeedbackPreservesTriangleFanProvokingVertex() {return this.ptr.get(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex);}
    public void transformFeedbackPreservesTriangleFanProvokingVertex(int value) {this.ptr.set(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex, value);}
    public java.lang.foreign.MemorySegment transformFeedbackPreservesTriangleFanProvokingVertex_ptr() {return this.ptr.asSlice(OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex, LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex);}
}

package vulkan;

public record VkPhysicalDeviceRayTracingPipelineFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingPipeline = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rayTracingPipeline = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTraversalPrimitiveCulling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rayTraversalPrimitiveCulling = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$rayTracingPipeline,
            LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay,
            LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed,
            LAYOUT$rayTracingPipelineTraceRaysIndirect,
            LAYOUT$rayTraversalPrimitiveCulling,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceRayTracingPipelineFeaturesKHR");

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int rayTracingPipeline() {return this.ptr.get(LAYOUT$rayTracingPipeline, OFFSET$rayTracingPipeline);}
    public void rayTracingPipeline(int value) {this.ptr.set(LAYOUT$rayTracingPipeline, OFFSET$rayTracingPipeline, value);}
    public java.lang.foreign.MemorySegment rayTracingPipeline_ptr() {return this.ptr.asSlice(OFFSET$rayTracingPipeline, LAYOUT$rayTracingPipeline);}

    public int rayTracingPipelineShaderGroupHandleCaptureReplay() {return this.ptr.get(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay);}
    public void rayTracingPipelineShaderGroupHandleCaptureReplay(int value) {this.ptr.set(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay, value);}
    public java.lang.foreign.MemorySegment rayTracingPipelineShaderGroupHandleCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplay, LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplay);}

    public int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {return this.ptr.get(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);}
    public void rayTracingPipelineShaderGroupHandleCaptureReplayMixed(int value) {this.ptr.set(LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, value);}
    public java.lang.foreign.MemorySegment rayTracingPipelineShaderGroupHandleCaptureReplayMixed_ptr() {return this.ptr.asSlice(OFFSET$rayTracingPipelineShaderGroupHandleCaptureReplayMixed, LAYOUT$rayTracingPipelineShaderGroupHandleCaptureReplayMixed);}

    public int rayTracingPipelineTraceRaysIndirect() {return this.ptr.get(LAYOUT$rayTracingPipelineTraceRaysIndirect, OFFSET$rayTracingPipelineTraceRaysIndirect);}
    public void rayTracingPipelineTraceRaysIndirect(int value) {this.ptr.set(LAYOUT$rayTracingPipelineTraceRaysIndirect, OFFSET$rayTracingPipelineTraceRaysIndirect, value);}
    public java.lang.foreign.MemorySegment rayTracingPipelineTraceRaysIndirect_ptr() {return this.ptr.asSlice(OFFSET$rayTracingPipelineTraceRaysIndirect, LAYOUT$rayTracingPipelineTraceRaysIndirect);}

    public int rayTraversalPrimitiveCulling() {return this.ptr.get(LAYOUT$rayTraversalPrimitiveCulling, OFFSET$rayTraversalPrimitiveCulling);}
    public void rayTraversalPrimitiveCulling(int value) {this.ptr.set(LAYOUT$rayTraversalPrimitiveCulling, OFFSET$rayTraversalPrimitiveCulling, value);}
    public java.lang.foreign.MemorySegment rayTraversalPrimitiveCulling_ptr() {return this.ptr.asSlice(OFFSET$rayTraversalPrimitiveCulling, LAYOUT$rayTraversalPrimitiveCulling);}
}

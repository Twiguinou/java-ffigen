package vulkan;

public record VkPhysicalDeviceMeshShaderPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskWorkGroupTotalCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskWorkGroupTotalCount = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxTaskWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxTaskWorkGroupCount = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskWorkGroupInvocations = 32L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxTaskWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxTaskWorkGroupSize = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskPayloadSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskPayloadSize = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskSharedMemorySize = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskPayloadAndSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskPayloadAndSharedMemorySize = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshWorkGroupTotalCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshWorkGroupTotalCount = 60L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxMeshWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxMeshWorkGroupCount = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshWorkGroupInvocations = 76L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxMeshWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxMeshWorkGroupSize = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshSharedMemorySize = 92L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshPayloadAndSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshPayloadAndSharedMemorySize = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshOutputMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshOutputMemorySize = 100L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshPayloadAndOutputMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshPayloadAndOutputMemorySize = 104L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshOutputComponents = 108L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshOutputVertices = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshOutputVertices = 112L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshOutputPrimitives = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshOutputPrimitives = 116L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshOutputLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshOutputLayers = 120L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshMultiviewViewCount = 124L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$meshOutputPerVertexGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$meshOutputPerVertexGranularity = 128L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$meshOutputPerPrimitiveGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$meshOutputPerPrimitiveGranularity = 132L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPreferredTaskWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPreferredTaskWorkGroupInvocations = 136L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPreferredMeshWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPreferredMeshWorkGroupInvocations = 140L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prefersLocalInvocationVertexOutput = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prefersLocalInvocationVertexOutput = 144L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prefersLocalInvocationPrimitiveOutput = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prefersLocalInvocationPrimitiveOutput = 148L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prefersCompactVertexOutput = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prefersCompactVertexOutput = 152L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$prefersCompactPrimitiveOutput = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$prefersCompactPrimitiveOutput = 156L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxTaskWorkGroupTotalCount,
            LAYOUT$maxTaskWorkGroupCount,
            LAYOUT$maxTaskWorkGroupInvocations,
            LAYOUT$maxTaskWorkGroupSize,
            LAYOUT$maxTaskPayloadSize,
            LAYOUT$maxTaskSharedMemorySize,
            LAYOUT$maxTaskPayloadAndSharedMemorySize,
            LAYOUT$maxMeshWorkGroupTotalCount,
            LAYOUT$maxMeshWorkGroupCount,
            LAYOUT$maxMeshWorkGroupInvocations,
            LAYOUT$maxMeshWorkGroupSize,
            LAYOUT$maxMeshSharedMemorySize,
            LAYOUT$maxMeshPayloadAndSharedMemorySize,
            LAYOUT$maxMeshOutputMemorySize,
            LAYOUT$maxMeshPayloadAndOutputMemorySize,
            LAYOUT$maxMeshOutputComponents,
            LAYOUT$maxMeshOutputVertices,
            LAYOUT$maxMeshOutputPrimitives,
            LAYOUT$maxMeshOutputLayers,
            LAYOUT$maxMeshMultiviewViewCount,
            LAYOUT$meshOutputPerVertexGranularity,
            LAYOUT$meshOutputPerPrimitiveGranularity,
            LAYOUT$maxPreferredTaskWorkGroupInvocations,
            LAYOUT$maxPreferredMeshWorkGroupInvocations,
            LAYOUT$prefersLocalInvocationVertexOutput,
            LAYOUT$prefersLocalInvocationPrimitiveOutput,
            LAYOUT$prefersCompactVertexOutput,
            LAYOUT$prefersCompactPrimitiveOutput
    ).withName("VkPhysicalDeviceMeshShaderPropertiesEXT");

    public VkPhysicalDeviceMeshShaderPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxTaskWorkGroupTotalCount() {return this.ptr.get(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount);}
    public void maxTaskWorkGroupTotalCount(int value) {this.ptr.set(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount, value);}
    public java.lang.foreign.MemorySegment maxTaskWorkGroupTotalCount_ptr() {return this.ptr.asSlice(OFFSET$maxTaskWorkGroupTotalCount, LAYOUT$maxTaskWorkGroupTotalCount);}

    public java.lang.foreign.MemorySegment maxTaskWorkGroupCount() {return this.ptr.asSlice(OFFSET$maxTaskWorkGroupCount, LAYOUT$maxTaskWorkGroupCount);}
    public int maxTaskWorkGroupCount(int i) {return this.maxTaskWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxTaskWorkGroupCount(int i, int value) {this.maxTaskWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int maxTaskWorkGroupInvocations() {return this.ptr.get(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations);}
    public void maxTaskWorkGroupInvocations(int value) {this.ptr.set(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment maxTaskWorkGroupInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxTaskWorkGroupInvocations, LAYOUT$maxTaskWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxTaskWorkGroupSize() {return this.ptr.asSlice(OFFSET$maxTaskWorkGroupSize, LAYOUT$maxTaskWorkGroupSize);}
    public int maxTaskWorkGroupSize(int i) {return this.maxTaskWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxTaskWorkGroupSize(int i, int value) {this.maxTaskWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int maxTaskPayloadSize() {return this.ptr.get(LAYOUT$maxTaskPayloadSize, OFFSET$maxTaskPayloadSize);}
    public void maxTaskPayloadSize(int value) {this.ptr.set(LAYOUT$maxTaskPayloadSize, OFFSET$maxTaskPayloadSize, value);}
    public java.lang.foreign.MemorySegment maxTaskPayloadSize_ptr() {return this.ptr.asSlice(OFFSET$maxTaskPayloadSize, LAYOUT$maxTaskPayloadSize);}

    public int maxTaskSharedMemorySize() {return this.ptr.get(LAYOUT$maxTaskSharedMemorySize, OFFSET$maxTaskSharedMemorySize);}
    public void maxTaskSharedMemorySize(int value) {this.ptr.set(LAYOUT$maxTaskSharedMemorySize, OFFSET$maxTaskSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment maxTaskSharedMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxTaskSharedMemorySize, LAYOUT$maxTaskSharedMemorySize);}

    public int maxTaskPayloadAndSharedMemorySize() {return this.ptr.get(LAYOUT$maxTaskPayloadAndSharedMemorySize, OFFSET$maxTaskPayloadAndSharedMemorySize);}
    public void maxTaskPayloadAndSharedMemorySize(int value) {this.ptr.set(LAYOUT$maxTaskPayloadAndSharedMemorySize, OFFSET$maxTaskPayloadAndSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment maxTaskPayloadAndSharedMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxTaskPayloadAndSharedMemorySize, LAYOUT$maxTaskPayloadAndSharedMemorySize);}

    public int maxMeshWorkGroupTotalCount() {return this.ptr.get(LAYOUT$maxMeshWorkGroupTotalCount, OFFSET$maxMeshWorkGroupTotalCount);}
    public void maxMeshWorkGroupTotalCount(int value) {this.ptr.set(LAYOUT$maxMeshWorkGroupTotalCount, OFFSET$maxMeshWorkGroupTotalCount, value);}
    public java.lang.foreign.MemorySegment maxMeshWorkGroupTotalCount_ptr() {return this.ptr.asSlice(OFFSET$maxMeshWorkGroupTotalCount, LAYOUT$maxMeshWorkGroupTotalCount);}

    public java.lang.foreign.MemorySegment maxMeshWorkGroupCount() {return this.ptr.asSlice(OFFSET$maxMeshWorkGroupCount, LAYOUT$maxMeshWorkGroupCount);}
    public int maxMeshWorkGroupCount(int i) {return this.maxMeshWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxMeshWorkGroupCount(int i, int value) {this.maxMeshWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int maxMeshWorkGroupInvocations() {return this.ptr.get(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations);}
    public void maxMeshWorkGroupInvocations(int value) {this.ptr.set(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment maxMeshWorkGroupInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxMeshWorkGroupInvocations, LAYOUT$maxMeshWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxMeshWorkGroupSize() {return this.ptr.asSlice(OFFSET$maxMeshWorkGroupSize, LAYOUT$maxMeshWorkGroupSize);}
    public int maxMeshWorkGroupSize(int i) {return this.maxMeshWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxMeshWorkGroupSize(int i, int value) {this.maxMeshWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int maxMeshSharedMemorySize() {return this.ptr.get(LAYOUT$maxMeshSharedMemorySize, OFFSET$maxMeshSharedMemorySize);}
    public void maxMeshSharedMemorySize(int value) {this.ptr.set(LAYOUT$maxMeshSharedMemorySize, OFFSET$maxMeshSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment maxMeshSharedMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxMeshSharedMemorySize, LAYOUT$maxMeshSharedMemorySize);}

    public int maxMeshPayloadAndSharedMemorySize() {return this.ptr.get(LAYOUT$maxMeshPayloadAndSharedMemorySize, OFFSET$maxMeshPayloadAndSharedMemorySize);}
    public void maxMeshPayloadAndSharedMemorySize(int value) {this.ptr.set(LAYOUT$maxMeshPayloadAndSharedMemorySize, OFFSET$maxMeshPayloadAndSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment maxMeshPayloadAndSharedMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxMeshPayloadAndSharedMemorySize, LAYOUT$maxMeshPayloadAndSharedMemorySize);}

    public int maxMeshOutputMemorySize() {return this.ptr.get(LAYOUT$maxMeshOutputMemorySize, OFFSET$maxMeshOutputMemorySize);}
    public void maxMeshOutputMemorySize(int value) {this.ptr.set(LAYOUT$maxMeshOutputMemorySize, OFFSET$maxMeshOutputMemorySize, value);}
    public java.lang.foreign.MemorySegment maxMeshOutputMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxMeshOutputMemorySize, LAYOUT$maxMeshOutputMemorySize);}

    public int maxMeshPayloadAndOutputMemorySize() {return this.ptr.get(LAYOUT$maxMeshPayloadAndOutputMemorySize, OFFSET$maxMeshPayloadAndOutputMemorySize);}
    public void maxMeshPayloadAndOutputMemorySize(int value) {this.ptr.set(LAYOUT$maxMeshPayloadAndOutputMemorySize, OFFSET$maxMeshPayloadAndOutputMemorySize, value);}
    public java.lang.foreign.MemorySegment maxMeshPayloadAndOutputMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxMeshPayloadAndOutputMemorySize, LAYOUT$maxMeshPayloadAndOutputMemorySize);}

    public int maxMeshOutputComponents() {return this.ptr.get(LAYOUT$maxMeshOutputComponents, OFFSET$maxMeshOutputComponents);}
    public void maxMeshOutputComponents(int value) {this.ptr.set(LAYOUT$maxMeshOutputComponents, OFFSET$maxMeshOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxMeshOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxMeshOutputComponents, LAYOUT$maxMeshOutputComponents);}

    public int maxMeshOutputVertices() {return this.ptr.get(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices);}
    public void maxMeshOutputVertices(int value) {this.ptr.set(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices, value);}
    public java.lang.foreign.MemorySegment maxMeshOutputVertices_ptr() {return this.ptr.asSlice(OFFSET$maxMeshOutputVertices, LAYOUT$maxMeshOutputVertices);}

    public int maxMeshOutputPrimitives() {return this.ptr.get(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives);}
    public void maxMeshOutputPrimitives(int value) {this.ptr.set(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives, value);}
    public java.lang.foreign.MemorySegment maxMeshOutputPrimitives_ptr() {return this.ptr.asSlice(OFFSET$maxMeshOutputPrimitives, LAYOUT$maxMeshOutputPrimitives);}

    public int maxMeshOutputLayers() {return this.ptr.get(LAYOUT$maxMeshOutputLayers, OFFSET$maxMeshOutputLayers);}
    public void maxMeshOutputLayers(int value) {this.ptr.set(LAYOUT$maxMeshOutputLayers, OFFSET$maxMeshOutputLayers, value);}
    public java.lang.foreign.MemorySegment maxMeshOutputLayers_ptr() {return this.ptr.asSlice(OFFSET$maxMeshOutputLayers, LAYOUT$maxMeshOutputLayers);}

    public int maxMeshMultiviewViewCount() {return this.ptr.get(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount);}
    public void maxMeshMultiviewViewCount(int value) {this.ptr.set(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment maxMeshMultiviewViewCount_ptr() {return this.ptr.asSlice(OFFSET$maxMeshMultiviewViewCount, LAYOUT$maxMeshMultiviewViewCount);}

    public int meshOutputPerVertexGranularity() {return this.ptr.get(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity);}
    public void meshOutputPerVertexGranularity(int value) {this.ptr.set(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity, value);}
    public java.lang.foreign.MemorySegment meshOutputPerVertexGranularity_ptr() {return this.ptr.asSlice(OFFSET$meshOutputPerVertexGranularity, LAYOUT$meshOutputPerVertexGranularity);}

    public int meshOutputPerPrimitiveGranularity() {return this.ptr.get(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity);}
    public void meshOutputPerPrimitiveGranularity(int value) {this.ptr.set(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity, value);}
    public java.lang.foreign.MemorySegment meshOutputPerPrimitiveGranularity_ptr() {return this.ptr.asSlice(OFFSET$meshOutputPerPrimitiveGranularity, LAYOUT$meshOutputPerPrimitiveGranularity);}

    public int maxPreferredTaskWorkGroupInvocations() {return this.ptr.get(LAYOUT$maxPreferredTaskWorkGroupInvocations, OFFSET$maxPreferredTaskWorkGroupInvocations);}
    public void maxPreferredTaskWorkGroupInvocations(int value) {this.ptr.set(LAYOUT$maxPreferredTaskWorkGroupInvocations, OFFSET$maxPreferredTaskWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment maxPreferredTaskWorkGroupInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxPreferredTaskWorkGroupInvocations, LAYOUT$maxPreferredTaskWorkGroupInvocations);}

    public int maxPreferredMeshWorkGroupInvocations() {return this.ptr.get(LAYOUT$maxPreferredMeshWorkGroupInvocations, OFFSET$maxPreferredMeshWorkGroupInvocations);}
    public void maxPreferredMeshWorkGroupInvocations(int value) {this.ptr.set(LAYOUT$maxPreferredMeshWorkGroupInvocations, OFFSET$maxPreferredMeshWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment maxPreferredMeshWorkGroupInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxPreferredMeshWorkGroupInvocations, LAYOUT$maxPreferredMeshWorkGroupInvocations);}

    public int prefersLocalInvocationVertexOutput() {return this.ptr.get(LAYOUT$prefersLocalInvocationVertexOutput, OFFSET$prefersLocalInvocationVertexOutput);}
    public void prefersLocalInvocationVertexOutput(int value) {this.ptr.set(LAYOUT$prefersLocalInvocationVertexOutput, OFFSET$prefersLocalInvocationVertexOutput, value);}
    public java.lang.foreign.MemorySegment prefersLocalInvocationVertexOutput_ptr() {return this.ptr.asSlice(OFFSET$prefersLocalInvocationVertexOutput, LAYOUT$prefersLocalInvocationVertexOutput);}

    public int prefersLocalInvocationPrimitiveOutput() {return this.ptr.get(LAYOUT$prefersLocalInvocationPrimitiveOutput, OFFSET$prefersLocalInvocationPrimitiveOutput);}
    public void prefersLocalInvocationPrimitiveOutput(int value) {this.ptr.set(LAYOUT$prefersLocalInvocationPrimitiveOutput, OFFSET$prefersLocalInvocationPrimitiveOutput, value);}
    public java.lang.foreign.MemorySegment prefersLocalInvocationPrimitiveOutput_ptr() {return this.ptr.asSlice(OFFSET$prefersLocalInvocationPrimitiveOutput, LAYOUT$prefersLocalInvocationPrimitiveOutput);}

    public int prefersCompactVertexOutput() {return this.ptr.get(LAYOUT$prefersCompactVertexOutput, OFFSET$prefersCompactVertexOutput);}
    public void prefersCompactVertexOutput(int value) {this.ptr.set(LAYOUT$prefersCompactVertexOutput, OFFSET$prefersCompactVertexOutput, value);}
    public java.lang.foreign.MemorySegment prefersCompactVertexOutput_ptr() {return this.ptr.asSlice(OFFSET$prefersCompactVertexOutput, LAYOUT$prefersCompactVertexOutput);}

    public int prefersCompactPrimitiveOutput() {return this.ptr.get(LAYOUT$prefersCompactPrimitiveOutput, OFFSET$prefersCompactPrimitiveOutput);}
    public void prefersCompactPrimitiveOutput(int value) {this.ptr.set(LAYOUT$prefersCompactPrimitiveOutput, OFFSET$prefersCompactPrimitiveOutput, value);}
    public java.lang.foreign.MemorySegment prefersCompactPrimitiveOutput_ptr() {return this.ptr.asSlice(OFFSET$prefersCompactPrimitiveOutput, LAYOUT$prefersCompactPrimitiveOutput);}
}

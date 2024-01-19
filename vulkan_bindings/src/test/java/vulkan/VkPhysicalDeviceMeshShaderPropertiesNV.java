package vulkan;

public record VkPhysicalDeviceMeshShaderPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDrawMeshTasksCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDrawMeshTasksCount = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskWorkGroupInvocations = 20L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxTaskWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxTaskWorkGroupSize = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskTotalMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskTotalMemorySize = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTaskOutputCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTaskOutputCount = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshWorkGroupInvocations = 44L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxMeshWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxMeshWorkGroupSize = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshTotalMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshTotalMemorySize = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshOutputVertices = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshOutputVertices = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshOutputPrimitives = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshOutputPrimitives = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMeshMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMeshMultiviewViewCount = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$meshOutputPerVertexGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$meshOutputPerVertexGranularity = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$meshOutputPerPrimitiveGranularity = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$meshOutputPerPrimitiveGranularity = 80L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxDrawMeshTasksCount,
            LAYOUT$maxTaskWorkGroupInvocations,
            LAYOUT$maxTaskWorkGroupSize,
            LAYOUT$maxTaskTotalMemorySize,
            LAYOUT$maxTaskOutputCount,
            LAYOUT$maxMeshWorkGroupInvocations,
            LAYOUT$maxMeshWorkGroupSize,
            LAYOUT$maxMeshTotalMemorySize,
            LAYOUT$maxMeshOutputVertices,
            LAYOUT$maxMeshOutputPrimitives,
            LAYOUT$maxMeshMultiviewViewCount,
            LAYOUT$meshOutputPerVertexGranularity,
            LAYOUT$meshOutputPerPrimitiveGranularity,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceMeshShaderPropertiesNV");

    public VkPhysicalDeviceMeshShaderPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxDrawMeshTasksCount() {return this.ptr.get(LAYOUT$maxDrawMeshTasksCount, OFFSET$maxDrawMeshTasksCount);}
    public void maxDrawMeshTasksCount(int value) {this.ptr.set(LAYOUT$maxDrawMeshTasksCount, OFFSET$maxDrawMeshTasksCount, value);}
    public java.lang.foreign.MemorySegment maxDrawMeshTasksCount_ptr() {return this.ptr.asSlice(OFFSET$maxDrawMeshTasksCount, LAYOUT$maxDrawMeshTasksCount);}

    public int maxTaskWorkGroupInvocations() {return this.ptr.get(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations);}
    public void maxTaskWorkGroupInvocations(int value) {this.ptr.set(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment maxTaskWorkGroupInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxTaskWorkGroupInvocations, LAYOUT$maxTaskWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxTaskWorkGroupSize() {return this.ptr.asSlice(OFFSET$maxTaskWorkGroupSize, LAYOUT$maxTaskWorkGroupSize);}
    public int maxTaskWorkGroupSize(int i) {return this.maxTaskWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxTaskWorkGroupSize(int i, int value) {this.maxTaskWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int maxTaskTotalMemorySize() {return this.ptr.get(LAYOUT$maxTaskTotalMemorySize, OFFSET$maxTaskTotalMemorySize);}
    public void maxTaskTotalMemorySize(int value) {this.ptr.set(LAYOUT$maxTaskTotalMemorySize, OFFSET$maxTaskTotalMemorySize, value);}
    public java.lang.foreign.MemorySegment maxTaskTotalMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxTaskTotalMemorySize, LAYOUT$maxTaskTotalMemorySize);}

    public int maxTaskOutputCount() {return this.ptr.get(LAYOUT$maxTaskOutputCount, OFFSET$maxTaskOutputCount);}
    public void maxTaskOutputCount(int value) {this.ptr.set(LAYOUT$maxTaskOutputCount, OFFSET$maxTaskOutputCount, value);}
    public java.lang.foreign.MemorySegment maxTaskOutputCount_ptr() {return this.ptr.asSlice(OFFSET$maxTaskOutputCount, LAYOUT$maxTaskOutputCount);}

    public int maxMeshWorkGroupInvocations() {return this.ptr.get(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations);}
    public void maxMeshWorkGroupInvocations(int value) {this.ptr.set(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment maxMeshWorkGroupInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxMeshWorkGroupInvocations, LAYOUT$maxMeshWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxMeshWorkGroupSize() {return this.ptr.asSlice(OFFSET$maxMeshWorkGroupSize, LAYOUT$maxMeshWorkGroupSize);}
    public int maxMeshWorkGroupSize(int i) {return this.maxMeshWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxMeshWorkGroupSize(int i, int value) {this.maxMeshWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int maxMeshTotalMemorySize() {return this.ptr.get(LAYOUT$maxMeshTotalMemorySize, OFFSET$maxMeshTotalMemorySize);}
    public void maxMeshTotalMemorySize(int value) {this.ptr.set(LAYOUT$maxMeshTotalMemorySize, OFFSET$maxMeshTotalMemorySize, value);}
    public java.lang.foreign.MemorySegment maxMeshTotalMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxMeshTotalMemorySize, LAYOUT$maxMeshTotalMemorySize);}

    public int maxMeshOutputVertices() {return this.ptr.get(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices);}
    public void maxMeshOutputVertices(int value) {this.ptr.set(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices, value);}
    public java.lang.foreign.MemorySegment maxMeshOutputVertices_ptr() {return this.ptr.asSlice(OFFSET$maxMeshOutputVertices, LAYOUT$maxMeshOutputVertices);}

    public int maxMeshOutputPrimitives() {return this.ptr.get(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives);}
    public void maxMeshOutputPrimitives(int value) {this.ptr.set(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives, value);}
    public java.lang.foreign.MemorySegment maxMeshOutputPrimitives_ptr() {return this.ptr.asSlice(OFFSET$maxMeshOutputPrimitives, LAYOUT$maxMeshOutputPrimitives);}

    public int maxMeshMultiviewViewCount() {return this.ptr.get(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount);}
    public void maxMeshMultiviewViewCount(int value) {this.ptr.set(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment maxMeshMultiviewViewCount_ptr() {return this.ptr.asSlice(OFFSET$maxMeshMultiviewViewCount, LAYOUT$maxMeshMultiviewViewCount);}

    public int meshOutputPerVertexGranularity() {return this.ptr.get(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity);}
    public void meshOutputPerVertexGranularity(int value) {this.ptr.set(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity, value);}
    public java.lang.foreign.MemorySegment meshOutputPerVertexGranularity_ptr() {return this.ptr.asSlice(OFFSET$meshOutputPerVertexGranularity, LAYOUT$meshOutputPerVertexGranularity);}

    public int meshOutputPerPrimitiveGranularity() {return this.ptr.get(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity);}
    public void meshOutputPerPrimitiveGranularity(int value) {this.ptr.set(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity, value);}
    public java.lang.foreign.MemorySegment meshOutputPerPrimitiveGranularity_ptr() {return this.ptr.asSlice(OFFSET$meshOutputPerPrimitiveGranularity, LAYOUT$meshOutputPerPrimitiveGranularity);}
}

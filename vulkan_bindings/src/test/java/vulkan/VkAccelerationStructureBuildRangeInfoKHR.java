package vulkan;

public record VkAccelerationStructureBuildRangeInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primitiveCount = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primitiveOffset = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstVertex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$firstVertex = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformOffset = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$primitiveCount,
            LAYOUT$primitiveOffset,
            LAYOUT$firstVertex,
            LAYOUT$transformOffset
    ).withName("VkAccelerationStructureBuildRangeInfoKHR");

    public VkAccelerationStructureBuildRangeInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int primitiveCount() {return this.ptr.get(LAYOUT$primitiveCount, OFFSET$primitiveCount);}
    public void primitiveCount(int value) {this.ptr.set(LAYOUT$primitiveCount, OFFSET$primitiveCount, value);}
    public java.lang.foreign.MemorySegment primitiveCount_ptr() {return this.ptr.asSlice(OFFSET$primitiveCount, LAYOUT$primitiveCount);}

    public int primitiveOffset() {return this.ptr.get(LAYOUT$primitiveOffset, OFFSET$primitiveOffset);}
    public void primitiveOffset(int value) {this.ptr.set(LAYOUT$primitiveOffset, OFFSET$primitiveOffset, value);}
    public java.lang.foreign.MemorySegment primitiveOffset_ptr() {return this.ptr.asSlice(OFFSET$primitiveOffset, LAYOUT$primitiveOffset);}

    public int firstVertex() {return this.ptr.get(LAYOUT$firstVertex, OFFSET$firstVertex);}
    public void firstVertex(int value) {this.ptr.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);}
    public java.lang.foreign.MemorySegment firstVertex_ptr() {return this.ptr.asSlice(OFFSET$firstVertex, LAYOUT$firstVertex);}

    public int transformOffset() {return this.ptr.get(LAYOUT$transformOffset, OFFSET$transformOffset);}
    public void transformOffset(int value) {this.ptr.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);}
    public java.lang.foreign.MemorySegment transformOffset_ptr() {return this.ptr.asSlice(OFFSET$transformOffset, LAYOUT$transformOffset);}
}

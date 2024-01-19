package vulkan;

public record VkTransformMatrixKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$matrix = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT));
    public static final long OFFSET$matrix = 0L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$matrix
    ).withName("VkTransformMatrixKHR");

    public VkTransformMatrixKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment matrix() {return this.ptr.asSlice(OFFSET$matrix, LAYOUT$matrix);}
}

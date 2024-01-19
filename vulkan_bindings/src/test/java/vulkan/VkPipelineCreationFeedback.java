package vulkan;

public record VkPipelineCreationFeedback(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$duration = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$duration = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$duration
    ).withName("VkPipelineCreationFeedback");

    public VkPipelineCreationFeedback(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public long duration() {return this.ptr.get(LAYOUT$duration, OFFSET$duration);}
    public void duration(long value) {this.ptr.set(LAYOUT$duration, OFFSET$duration, value);}
    public java.lang.foreign.MemorySegment duration_ptr() {return this.ptr.asSlice(OFFSET$duration, LAYOUT$duration);}
}

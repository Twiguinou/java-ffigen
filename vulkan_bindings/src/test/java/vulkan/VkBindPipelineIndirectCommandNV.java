package vulkan;

public record VkBindPipelineIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$pipelineAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$pipelineAddress = 0L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$pipelineAddress
    ).withName("VkBindPipelineIndirectCommandNV");

    public VkBindPipelineIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long pipelineAddress() {return this.ptr.get(LAYOUT$pipelineAddress, OFFSET$pipelineAddress);}
    public void pipelineAddress(long value) {this.ptr.set(LAYOUT$pipelineAddress, OFFSET$pipelineAddress, value);}
    public java.lang.foreign.MemorySegment pipelineAddress_ptr() {return this.ptr.asSlice(OFFSET$pipelineAddress, LAYOUT$pipelineAddress);}
}

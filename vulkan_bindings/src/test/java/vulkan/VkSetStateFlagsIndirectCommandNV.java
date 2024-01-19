package vulkan;

public record VkSetStateFlagsIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$data = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$data = 0L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$data
    ).withName("VkSetStateFlagsIndirectCommandNV");

    public VkSetStateFlagsIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int data() {return this.ptr.get(LAYOUT$data, OFFSET$data);}
    public void data(int value) {this.ptr.set(LAYOUT$data, OFFSET$data, value);}
    public java.lang.foreign.MemorySegment data_ptr() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}
}

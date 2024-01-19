package vulkan;

public record VkPerformanceValueINTEL(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$data = vulkan.VkPerformanceValueDataINTEL.gStructLayout;
    public static final long OFFSET$data = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$type,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$data
    ).withName("VkPerformanceValueINTEL");

    public VkPerformanceValueINTEL(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public vulkan.VkPerformanceValueDataINTEL data() {return new vulkan.VkPerformanceValueDataINTEL(this.ptr.asSlice(OFFSET$data, LAYOUT$data));}
}

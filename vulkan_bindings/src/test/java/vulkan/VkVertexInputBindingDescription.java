package vulkan;

public record VkVertexInputBindingDescription(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$binding = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$binding = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stride = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inputRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$inputRate = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$binding,
            LAYOUT$stride,
            LAYOUT$inputRate
    ).withName("VkVertexInputBindingDescription");

    public VkVertexInputBindingDescription(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int binding() {return this.ptr.get(LAYOUT$binding, OFFSET$binding);}
    public void binding(int value) {this.ptr.set(LAYOUT$binding, OFFSET$binding, value);}
    public java.lang.foreign.MemorySegment binding_ptr() {return this.ptr.asSlice(OFFSET$binding, LAYOUT$binding);}

    public int stride() {return this.ptr.get(LAYOUT$stride, OFFSET$stride);}
    public void stride(int value) {this.ptr.set(LAYOUT$stride, OFFSET$stride, value);}
    public java.lang.foreign.MemorySegment stride_ptr() {return this.ptr.asSlice(OFFSET$stride, LAYOUT$stride);}

    public int inputRate() {return this.ptr.get(LAYOUT$inputRate, OFFSET$inputRate);}
    public void inputRate(int value) {this.ptr.set(LAYOUT$inputRate, OFFSET$inputRate, value);}
    public java.lang.foreign.MemorySegment inputRate_ptr() {return this.ptr.asSlice(OFFSET$inputRate, LAYOUT$inputRate);}
}

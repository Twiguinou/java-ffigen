package vulkan;

public record VkBindVertexBufferIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bufferAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bufferAddress = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stride = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$bufferAddress,
            LAYOUT$size,
            LAYOUT$stride
    ).withName("VkBindVertexBufferIndirectCommandNV");

    public VkBindVertexBufferIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long bufferAddress() {return this.ptr.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);}
    public void bufferAddress(long value) {this.ptr.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);}
    public java.lang.foreign.MemorySegment bufferAddress_ptr() {return this.ptr.asSlice(OFFSET$bufferAddress, LAYOUT$bufferAddress);}

    public int size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public int stride() {return this.ptr.get(LAYOUT$stride, OFFSET$stride);}
    public void stride(int value) {this.ptr.set(LAYOUT$stride, OFFSET$stride, value);}
    public java.lang.foreign.MemorySegment stride_ptr() {return this.ptr.asSlice(OFFSET$stride, LAYOUT$stride);}
}

package vulkan;

public record VkMemoryRequirements(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$alignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$alignment = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryTypeBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryTypeBits = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$size,
            LAYOUT$alignment,
            LAYOUT$memoryTypeBits,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkMemoryRequirements");

    public VkMemoryRequirements(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public long alignment() {return this.ptr.get(LAYOUT$alignment, OFFSET$alignment);}
    public void alignment(long value) {this.ptr.set(LAYOUT$alignment, OFFSET$alignment, value);}
    public java.lang.foreign.MemorySegment alignment_ptr() {return this.ptr.asSlice(OFFSET$alignment, LAYOUT$alignment);}

    public int memoryTypeBits() {return this.ptr.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);}
    public void memoryTypeBits(int value) {this.ptr.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);}
    public java.lang.foreign.MemorySegment memoryTypeBits_ptr() {return this.ptr.asSlice(OFFSET$memoryTypeBits, LAYOUT$memoryTypeBits);}
}

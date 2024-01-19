package vulkan;

public record VkBufferCopy(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$srcOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$srcOffset = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dstOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$dstOffset = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$srcOffset,
            LAYOUT$dstOffset,
            LAYOUT$size
    ).withName("VkBufferCopy");

    public VkBufferCopy(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long srcOffset() {return this.ptr.get(LAYOUT$srcOffset, OFFSET$srcOffset);}
    public void srcOffset(long value) {this.ptr.set(LAYOUT$srcOffset, OFFSET$srcOffset, value);}
    public java.lang.foreign.MemorySegment srcOffset_ptr() {return this.ptr.asSlice(OFFSET$srcOffset, LAYOUT$srcOffset);}

    public long dstOffset() {return this.ptr.get(LAYOUT$dstOffset, OFFSET$dstOffset);}
    public void dstOffset(long value) {this.ptr.set(LAYOUT$dstOffset, OFFSET$dstOffset, value);}
    public java.lang.foreign.MemorySegment dstOffset_ptr() {return this.ptr.asSlice(OFFSET$dstOffset, LAYOUT$dstOffset);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}
}

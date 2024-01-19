package vulkan;

public record VkBufferCopy2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$srcOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$srcOffset = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dstOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$dstOffset = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$srcOffset,
            LAYOUT$dstOffset,
            LAYOUT$size
    ).withName("VkBufferCopy2");

    public VkBufferCopy2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

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

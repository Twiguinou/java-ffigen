package vulkan;

public record VkBufferMemoryBarrier(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$srcAccessMask = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dstAccessMask = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$srcQueueFamilyIndex = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstQueueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dstQueueFamilyIndex = 28L;
    public static final java.lang.foreign.AddressLayout LAYOUT$buffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$buffer = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$srcAccessMask,
            LAYOUT$dstAccessMask,
            LAYOUT$srcQueueFamilyIndex,
            LAYOUT$dstQueueFamilyIndex,
            LAYOUT$buffer,
            LAYOUT$offset,
            LAYOUT$size
    ).withName("VkBufferMemoryBarrier");

    public VkBufferMemoryBarrier(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int srcAccessMask() {return this.ptr.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);}
    public void srcAccessMask(int value) {this.ptr.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);}
    public java.lang.foreign.MemorySegment srcAccessMask_ptr() {return this.ptr.asSlice(OFFSET$srcAccessMask, LAYOUT$srcAccessMask);}

    public int dstAccessMask() {return this.ptr.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);}
    public void dstAccessMask(int value) {this.ptr.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);}
    public java.lang.foreign.MemorySegment dstAccessMask_ptr() {return this.ptr.asSlice(OFFSET$dstAccessMask, LAYOUT$dstAccessMask);}

    public int srcQueueFamilyIndex() {return this.ptr.get(LAYOUT$srcQueueFamilyIndex, OFFSET$srcQueueFamilyIndex);}
    public void srcQueueFamilyIndex(int value) {this.ptr.set(LAYOUT$srcQueueFamilyIndex, OFFSET$srcQueueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment srcQueueFamilyIndex_ptr() {return this.ptr.asSlice(OFFSET$srcQueueFamilyIndex, LAYOUT$srcQueueFamilyIndex);}

    public int dstQueueFamilyIndex() {return this.ptr.get(LAYOUT$dstQueueFamilyIndex, OFFSET$dstQueueFamilyIndex);}
    public void dstQueueFamilyIndex(int value) {this.ptr.set(LAYOUT$dstQueueFamilyIndex, OFFSET$dstQueueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment dstQueueFamilyIndex_ptr() {return this.ptr.asSlice(OFFSET$dstQueueFamilyIndex, LAYOUT$dstQueueFamilyIndex);}

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT$buffer, OFFSET$buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$buffer, OFFSET$buffer, value);}
    public java.lang.foreign.MemorySegment buffer_ptr() {return this.ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}

    public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}
}

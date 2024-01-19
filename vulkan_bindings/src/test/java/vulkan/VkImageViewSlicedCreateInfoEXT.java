package vulkan;

public record VkImageViewSlicedCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sliceOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sliceOffset = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sliceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sliceCount = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$sliceOffset,
            LAYOUT$sliceCount
    ).withName("VkImageViewSlicedCreateInfoEXT");

    public VkImageViewSlicedCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int sliceOffset() {return this.ptr.get(LAYOUT$sliceOffset, OFFSET$sliceOffset);}
    public void sliceOffset(int value) {this.ptr.set(LAYOUT$sliceOffset, OFFSET$sliceOffset, value);}
    public java.lang.foreign.MemorySegment sliceOffset_ptr() {return this.ptr.asSlice(OFFSET$sliceOffset, LAYOUT$sliceOffset);}

    public int sliceCount() {return this.ptr.get(LAYOUT$sliceCount, OFFSET$sliceCount);}
    public void sliceCount(int value) {this.ptr.set(LAYOUT$sliceCount, OFFSET$sliceCount, value);}
    public java.lang.foreign.MemorySegment sliceCount_ptr() {return this.ptr.asSlice(OFFSET$sliceCount, LAYOUT$sliceCount);}
}

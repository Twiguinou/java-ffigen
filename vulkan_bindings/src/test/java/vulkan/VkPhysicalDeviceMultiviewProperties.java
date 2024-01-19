package vulkan;

public record VkPhysicalDeviceMultiviewProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMultiviewViewCount = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMultiviewInstanceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMultiviewInstanceIndex = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxMultiviewViewCount,
            LAYOUT$maxMultiviewInstanceIndex
    ).withName("VkPhysicalDeviceMultiviewProperties");

    public VkPhysicalDeviceMultiviewProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxMultiviewViewCount() {return this.ptr.get(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount);}
    public void maxMultiviewViewCount(int value) {this.ptr.set(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment maxMultiviewViewCount_ptr() {return this.ptr.asSlice(OFFSET$maxMultiviewViewCount, LAYOUT$maxMultiviewViewCount);}

    public int maxMultiviewInstanceIndex() {return this.ptr.get(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex);}
    public void maxMultiviewInstanceIndex(int value) {this.ptr.set(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex, value);}
    public java.lang.foreign.MemorySegment maxMultiviewInstanceIndex_ptr() {return this.ptr.asSlice(OFFSET$maxMultiviewInstanceIndex, LAYOUT$maxMultiviewInstanceIndex);}
}

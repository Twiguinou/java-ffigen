package vulkan;

public record VkMemoryAllocateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$allocationSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$allocationSize = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryTypeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$memoryTypeIndex = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$allocationSize,
            LAYOUT$memoryTypeIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkMemoryAllocateInfo");

    public VkMemoryAllocateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long allocationSize() {return this.ptr.get(LAYOUT$allocationSize, OFFSET$allocationSize);}
    public void allocationSize(long value) {this.ptr.set(LAYOUT$allocationSize, OFFSET$allocationSize, value);}
    public java.lang.foreign.MemorySegment allocationSize_ptr() {return this.ptr.asSlice(OFFSET$allocationSize, LAYOUT$allocationSize);}

    public int memoryTypeIndex() {return this.ptr.get(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex);}
    public void memoryTypeIndex(int value) {this.ptr.set(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex, value);}
    public java.lang.foreign.MemorySegment memoryTypeIndex_ptr() {return this.ptr.asSlice(OFFSET$memoryTypeIndex, LAYOUT$memoryTypeIndex);}
}

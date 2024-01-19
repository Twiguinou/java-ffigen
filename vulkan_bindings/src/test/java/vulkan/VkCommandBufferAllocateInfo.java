package vulkan;

public record VkCommandBufferAllocateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$commandPool = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$commandPool = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$level = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$level = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$commandBufferCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$commandBufferCount = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$commandPool,
            LAYOUT$level,
            LAYOUT$commandBufferCount
    ).withName("VkCommandBufferAllocateInfo");

    public VkCommandBufferAllocateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment commandPool() {return this.ptr.get(LAYOUT$commandPool, OFFSET$commandPool);}
    public void commandPool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$commandPool, OFFSET$commandPool, value);}
    public java.lang.foreign.MemorySegment commandPool_ptr() {return this.ptr.asSlice(OFFSET$commandPool, LAYOUT$commandPool);}

    public int level() {return this.ptr.get(LAYOUT$level, OFFSET$level);}
    public void level(int value) {this.ptr.set(LAYOUT$level, OFFSET$level, value);}
    public java.lang.foreign.MemorySegment level_ptr() {return this.ptr.asSlice(OFFSET$level, LAYOUT$level);}

    public int commandBufferCount() {return this.ptr.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);}
    public void commandBufferCount(int value) {this.ptr.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);}
    public java.lang.foreign.MemorySegment commandBufferCount_ptr() {return this.ptr.asSlice(OFFSET$commandBufferCount, LAYOUT$commandBufferCount);}
}

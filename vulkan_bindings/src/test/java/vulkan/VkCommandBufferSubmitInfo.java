package vulkan;

public record VkCommandBufferSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$commandBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$commandBuffer = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceMask = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$commandBuffer,
            LAYOUT$deviceMask,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkCommandBufferSubmitInfo");

    public VkCommandBufferSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment commandBuffer() {return this.ptr.get(LAYOUT$commandBuffer, OFFSET$commandBuffer);}
    public void commandBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$commandBuffer, OFFSET$commandBuffer, value);}
    public java.lang.foreign.MemorySegment commandBuffer_ptr() {return this.ptr.asSlice(OFFSET$commandBuffer, LAYOUT$commandBuffer);}

    public int deviceMask() {return this.ptr.get(LAYOUT$deviceMask, OFFSET$deviceMask);}
    public void deviceMask(int value) {this.ptr.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);}
    public java.lang.foreign.MemorySegment deviceMask_ptr() {return this.ptr.asSlice(OFFSET$deviceMask, LAYOUT$deviceMask);}
}

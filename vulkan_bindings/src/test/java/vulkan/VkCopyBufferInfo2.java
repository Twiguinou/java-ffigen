package vulkan;

public record VkCopyBufferInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$srcBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$srcBuffer = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$dstBuffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$dstBuffer = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$regionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$regionCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRegions = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRegions = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$srcBuffer,
            LAYOUT$dstBuffer,
            LAYOUT$regionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pRegions
    ).withName("VkCopyBufferInfo2");

    public VkCopyBufferInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment srcBuffer() {return this.ptr.get(LAYOUT$srcBuffer, OFFSET$srcBuffer);}
    public void srcBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$srcBuffer, OFFSET$srcBuffer, value);}
    public java.lang.foreign.MemorySegment srcBuffer_ptr() {return this.ptr.asSlice(OFFSET$srcBuffer, LAYOUT$srcBuffer);}

    public java.lang.foreign.MemorySegment dstBuffer() {return this.ptr.get(LAYOUT$dstBuffer, OFFSET$dstBuffer);}
    public void dstBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstBuffer, OFFSET$dstBuffer, value);}
    public java.lang.foreign.MemorySegment dstBuffer_ptr() {return this.ptr.asSlice(OFFSET$dstBuffer, LAYOUT$dstBuffer);}

    public int regionCount() {return this.ptr.get(LAYOUT$regionCount, OFFSET$regionCount);}
    public void regionCount(int value) {this.ptr.set(LAYOUT$regionCount, OFFSET$regionCount, value);}
    public java.lang.foreign.MemorySegment regionCount_ptr() {return this.ptr.asSlice(OFFSET$regionCount, LAYOUT$regionCount);}

    public java.lang.foreign.MemorySegment pRegions() {return this.ptr.get(LAYOUT$pRegions, OFFSET$pRegions);}
    public void pRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRegions, OFFSET$pRegions, value);}
    public java.lang.foreign.MemorySegment pRegions_ptr() {return this.ptr.asSlice(OFFSET$pRegions, LAYOUT$pRegions);}
}

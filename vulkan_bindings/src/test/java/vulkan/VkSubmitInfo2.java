package vulkan;

public record VkSubmitInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$waitSemaphoreInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$waitSemaphoreInfoCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pWaitSemaphoreInfos = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pWaitSemaphoreInfos = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$commandBufferInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$commandBufferInfoCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pCommandBufferInfos = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pCommandBufferInfos = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$signalSemaphoreInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$signalSemaphoreInfoCount = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSignalSemaphoreInfos = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSignalSemaphoreInfos = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$waitSemaphoreInfoCount,
            LAYOUT$pWaitSemaphoreInfos,
            LAYOUT$commandBufferInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pCommandBufferInfos,
            LAYOUT$signalSemaphoreInfoCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSignalSemaphoreInfos
    ).withName("VkSubmitInfo2");

    public VkSubmitInfo2(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int waitSemaphoreInfoCount() {return this.ptr.get(LAYOUT$waitSemaphoreInfoCount, OFFSET$waitSemaphoreInfoCount);}
    public void waitSemaphoreInfoCount(int value) {this.ptr.set(LAYOUT$waitSemaphoreInfoCount, OFFSET$waitSemaphoreInfoCount, value);}
    public java.lang.foreign.MemorySegment waitSemaphoreInfoCount_ptr() {return this.ptr.asSlice(OFFSET$waitSemaphoreInfoCount, LAYOUT$waitSemaphoreInfoCount);}

    public java.lang.foreign.MemorySegment pWaitSemaphoreInfos() {return this.ptr.get(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos);}
    public void pWaitSemaphoreInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos, value);}
    public java.lang.foreign.MemorySegment pWaitSemaphoreInfos_ptr() {return this.ptr.asSlice(OFFSET$pWaitSemaphoreInfos, LAYOUT$pWaitSemaphoreInfos);}

    public int commandBufferInfoCount() {return this.ptr.get(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount);}
    public void commandBufferInfoCount(int value) {this.ptr.set(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount, value);}
    public java.lang.foreign.MemorySegment commandBufferInfoCount_ptr() {return this.ptr.asSlice(OFFSET$commandBufferInfoCount, LAYOUT$commandBufferInfoCount);}

    public java.lang.foreign.MemorySegment pCommandBufferInfos() {return this.ptr.get(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos);}
    public void pCommandBufferInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos, value);}
    public java.lang.foreign.MemorySegment pCommandBufferInfos_ptr() {return this.ptr.asSlice(OFFSET$pCommandBufferInfos, LAYOUT$pCommandBufferInfos);}

    public int signalSemaphoreInfoCount() {return this.ptr.get(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount);}
    public void signalSemaphoreInfoCount(int value) {this.ptr.set(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount, value);}
    public java.lang.foreign.MemorySegment signalSemaphoreInfoCount_ptr() {return this.ptr.asSlice(OFFSET$signalSemaphoreInfoCount, LAYOUT$signalSemaphoreInfoCount);}

    public java.lang.foreign.MemorySegment pSignalSemaphoreInfos() {return this.ptr.get(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos);}
    public void pSignalSemaphoreInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos, value);}
    public java.lang.foreign.MemorySegment pSignalSemaphoreInfos_ptr() {return this.ptr.asSlice(OFFSET$pSignalSemaphoreInfos, LAYOUT$pSignalSemaphoreInfos);}
}

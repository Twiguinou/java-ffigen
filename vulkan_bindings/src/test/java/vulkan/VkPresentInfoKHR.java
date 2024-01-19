package vulkan;

public record VkPresentInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$waitSemaphoreCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pWaitSemaphores = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pWaitSemaphores = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$swapchainCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$swapchainCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSwapchains = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSwapchains = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pImageIndices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pImageIndices = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pResults = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pResults = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$waitSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pWaitSemaphores,
            LAYOUT$swapchainCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSwapchains,
            LAYOUT$pImageIndices,
            LAYOUT$pResults
    ).withName("VkPresentInfoKHR");

    public VkPresentInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int waitSemaphoreCount() {return this.ptr.get(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount);}
    public void waitSemaphoreCount(int value) {this.ptr.set(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount, value);}
    public java.lang.foreign.MemorySegment waitSemaphoreCount_ptr() {return this.ptr.asSlice(OFFSET$waitSemaphoreCount, LAYOUT$waitSemaphoreCount);}

    public java.lang.foreign.MemorySegment pWaitSemaphores() {return this.ptr.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);}
    public void pWaitSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);}
    public java.lang.foreign.MemorySegment pWaitSemaphores_ptr() {return this.ptr.asSlice(OFFSET$pWaitSemaphores, LAYOUT$pWaitSemaphores);}

    public int swapchainCount() {return this.ptr.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);}
    public void swapchainCount(int value) {this.ptr.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);}
    public java.lang.foreign.MemorySegment swapchainCount_ptr() {return this.ptr.asSlice(OFFSET$swapchainCount, LAYOUT$swapchainCount);}

    public java.lang.foreign.MemorySegment pSwapchains() {return this.ptr.get(LAYOUT$pSwapchains, OFFSET$pSwapchains);}
    public void pSwapchains(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSwapchains, OFFSET$pSwapchains, value);}
    public java.lang.foreign.MemorySegment pSwapchains_ptr() {return this.ptr.asSlice(OFFSET$pSwapchains, LAYOUT$pSwapchains);}

    public java.lang.foreign.MemorySegment pImageIndices() {return this.ptr.get(LAYOUT$pImageIndices, OFFSET$pImageIndices);}
    public void pImageIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pImageIndices, OFFSET$pImageIndices, value);}
    public java.lang.foreign.MemorySegment pImageIndices_ptr() {return this.ptr.asSlice(OFFSET$pImageIndices, LAYOUT$pImageIndices);}

    public java.lang.foreign.MemorySegment pResults() {return this.ptr.get(LAYOUT$pResults, OFFSET$pResults);}
    public void pResults(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pResults, OFFSET$pResults, value);}
    public java.lang.foreign.MemorySegment pResults_ptr() {return this.ptr.asSlice(OFFSET$pResults, LAYOUT$pResults);}
}

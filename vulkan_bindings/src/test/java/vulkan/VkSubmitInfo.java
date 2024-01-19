package vulkan;

public record VkSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$waitSemaphoreCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pWaitSemaphores = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pWaitSemaphores = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pWaitDstStageMask = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pWaitDstStageMask = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$commandBufferCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$commandBufferCount = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pCommandBuffers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pCommandBuffers = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$signalSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$signalSemaphoreCount = 56L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSignalSemaphores = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSignalSemaphores = 64L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$waitSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pWaitSemaphores,
            LAYOUT$pWaitDstStageMask,
            LAYOUT$commandBufferCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pCommandBuffers,
            LAYOUT$signalSemaphoreCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSignalSemaphores
    ).withName("VkSubmitInfo");

    public VkSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
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

    public java.lang.foreign.MemorySegment pWaitDstStageMask() {return this.ptr.get(LAYOUT$pWaitDstStageMask, OFFSET$pWaitDstStageMask);}
    public void pWaitDstStageMask(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWaitDstStageMask, OFFSET$pWaitDstStageMask, value);}
    public java.lang.foreign.MemorySegment pWaitDstStageMask_ptr() {return this.ptr.asSlice(OFFSET$pWaitDstStageMask, LAYOUT$pWaitDstStageMask);}

    public int commandBufferCount() {return this.ptr.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);}
    public void commandBufferCount(int value) {this.ptr.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);}
    public java.lang.foreign.MemorySegment commandBufferCount_ptr() {return this.ptr.asSlice(OFFSET$commandBufferCount, LAYOUT$commandBufferCount);}

    public java.lang.foreign.MemorySegment pCommandBuffers() {return this.ptr.get(LAYOUT$pCommandBuffers, OFFSET$pCommandBuffers);}
    public void pCommandBuffers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCommandBuffers, OFFSET$pCommandBuffers, value);}
    public java.lang.foreign.MemorySegment pCommandBuffers_ptr() {return this.ptr.asSlice(OFFSET$pCommandBuffers, LAYOUT$pCommandBuffers);}

    public int signalSemaphoreCount() {return this.ptr.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);}
    public void signalSemaphoreCount(int value) {this.ptr.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);}
    public java.lang.foreign.MemorySegment signalSemaphoreCount_ptr() {return this.ptr.asSlice(OFFSET$signalSemaphoreCount, LAYOUT$signalSemaphoreCount);}

    public java.lang.foreign.MemorySegment pSignalSemaphores() {return this.ptr.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);}
    public void pSignalSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);}
    public java.lang.foreign.MemorySegment pSignalSemaphores_ptr() {return this.ptr.asSlice(OFFSET$pSignalSemaphores, LAYOUT$pSignalSemaphores);}
}

package vulkan;

public record VkSwapchainPresentModesCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$presentModeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$presentModeCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPresentModes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPresentModes = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$presentModeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPresentModes
    ).withName("VkSwapchainPresentModesCreateInfoEXT");

    public VkSwapchainPresentModesCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int presentModeCount() {return this.ptr.get(LAYOUT$presentModeCount, OFFSET$presentModeCount);}
    public void presentModeCount(int value) {this.ptr.set(LAYOUT$presentModeCount, OFFSET$presentModeCount, value);}
    public java.lang.foreign.MemorySegment presentModeCount_ptr() {return this.ptr.asSlice(OFFSET$presentModeCount, LAYOUT$presentModeCount);}

    public java.lang.foreign.MemorySegment pPresentModes() {return this.ptr.get(LAYOUT$pPresentModes, OFFSET$pPresentModes);}
    public void pPresentModes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPresentModes, OFFSET$pPresentModes, value);}
    public java.lang.foreign.MemorySegment pPresentModes_ptr() {return this.ptr.asSlice(OFFSET$pPresentModes, LAYOUT$pPresentModes);}
}

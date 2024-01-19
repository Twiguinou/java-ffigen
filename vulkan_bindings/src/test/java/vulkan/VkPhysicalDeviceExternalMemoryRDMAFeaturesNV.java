package vulkan;

public record VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$externalMemoryRDMA = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$externalMemoryRDMA = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$externalMemoryRDMA,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceExternalMemoryRDMAFeaturesNV");

    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int externalMemoryRDMA() {return this.ptr.get(LAYOUT$externalMemoryRDMA, OFFSET$externalMemoryRDMA);}
    public void externalMemoryRDMA(int value) {this.ptr.set(LAYOUT$externalMemoryRDMA, OFFSET$externalMemoryRDMA, value);}
    public java.lang.foreign.MemorySegment externalMemoryRDMA_ptr() {return this.ptr.asSlice(OFFSET$externalMemoryRDMA, LAYOUT$externalMemoryRDMA);}
}

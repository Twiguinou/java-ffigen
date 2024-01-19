package vulkan;

public record VkPhysicalDeviceCoherentMemoryFeaturesAMD(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceCoherentMemory = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceCoherentMemory = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$deviceCoherentMemory,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceCoherentMemoryFeaturesAMD");

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int deviceCoherentMemory() {return this.ptr.get(LAYOUT$deviceCoherentMemory, OFFSET$deviceCoherentMemory);}
    public void deviceCoherentMemory(int value) {this.ptr.set(LAYOUT$deviceCoherentMemory, OFFSET$deviceCoherentMemory, value);}
    public java.lang.foreign.MemorySegment deviceCoherentMemory_ptr() {return this.ptr.asSlice(OFFSET$deviceCoherentMemory, LAYOUT$deviceCoherentMemory);}
}

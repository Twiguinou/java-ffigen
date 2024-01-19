package vulkan;

public record VkPhysicalDeviceUniformBufferStandardLayoutFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformBufferStandardLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$uniformBufferStandardLayout = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$uniformBufferStandardLayout,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceUniformBufferStandardLayoutFeatures");

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int uniformBufferStandardLayout() {return this.ptr.get(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout);}
    public void uniformBufferStandardLayout(int value) {this.ptr.set(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout, value);}
    public java.lang.foreign.MemorySegment uniformBufferStandardLayout_ptr() {return this.ptr.asSlice(OFFSET$uniformBufferStandardLayout, LAYOUT$uniformBufferStandardLayout);}
}

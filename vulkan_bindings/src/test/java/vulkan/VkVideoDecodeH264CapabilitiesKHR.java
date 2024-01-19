package vulkan;

public record VkVideoDecodeH264CapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxLevelIdc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxLevelIdc = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$fieldOffsetGranularity = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$fieldOffsetGranularity = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxLevelIdc,
            LAYOUT$fieldOffsetGranularity,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkVideoDecodeH264CapabilitiesKHR");

    public VkVideoDecodeH264CapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxLevelIdc() {return this.ptr.get(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc);}
    public void maxLevelIdc(int value) {this.ptr.set(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc, value);}
    public java.lang.foreign.MemorySegment maxLevelIdc_ptr() {return this.ptr.asSlice(OFFSET$maxLevelIdc, LAYOUT$maxLevelIdc);}

    public vulkan.VkOffset2D fieldOffsetGranularity() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$fieldOffsetGranularity, LAYOUT$fieldOffsetGranularity));}
}

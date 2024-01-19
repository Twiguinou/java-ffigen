package vulkan;

public record VkSamplerBlockMatchWindowCreateInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$windowExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$windowExtent = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$windowCompareMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$windowCompareMode = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$windowExtent,
            LAYOUT$windowCompareMode,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkSamplerBlockMatchWindowCreateInfoQCOM");

    public VkSamplerBlockMatchWindowCreateInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkExtent2D windowExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$windowExtent, LAYOUT$windowExtent));}

    public int windowCompareMode() {return this.ptr.get(LAYOUT$windowCompareMode, OFFSET$windowCompareMode);}
    public void windowCompareMode(int value) {this.ptr.set(LAYOUT$windowCompareMode, OFFSET$windowCompareMode, value);}
    public java.lang.foreign.MemorySegment windowCompareMode_ptr() {return this.ptr.asSlice(OFFSET$windowCompareMode, LAYOUT$windowCompareMode);}
}

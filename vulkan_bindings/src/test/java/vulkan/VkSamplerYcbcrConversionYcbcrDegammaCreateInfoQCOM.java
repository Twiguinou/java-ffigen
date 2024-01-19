package vulkan;

public record VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$enableYDegamma = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$enableYDegamma = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$enableCbCrDegamma = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$enableCbCrDegamma = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$enableYDegamma,
            LAYOUT$enableCbCrDegamma
    ).withName("VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM");

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int enableYDegamma() {return this.ptr.get(LAYOUT$enableYDegamma, OFFSET$enableYDegamma);}
    public void enableYDegamma(int value) {this.ptr.set(LAYOUT$enableYDegamma, OFFSET$enableYDegamma, value);}
    public java.lang.foreign.MemorySegment enableYDegamma_ptr() {return this.ptr.asSlice(OFFSET$enableYDegamma, LAYOUT$enableYDegamma);}

    public int enableCbCrDegamma() {return this.ptr.get(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma);}
    public void enableCbCrDegamma(int value) {this.ptr.set(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma, value);}
    public java.lang.foreign.MemorySegment enableCbCrDegamma_ptr() {return this.ptr.asSlice(OFFSET$enableCbCrDegamma, LAYOUT$enableCbCrDegamma);}
}

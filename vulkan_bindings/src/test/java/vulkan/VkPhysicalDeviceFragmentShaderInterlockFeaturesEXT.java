package vulkan;

public record VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShaderSampleInterlock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShaderSampleInterlock = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShaderPixelInterlock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShaderPixelInterlock = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShaderShadingRateInterlock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShaderShadingRateInterlock = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$fragmentShaderSampleInterlock,
            LAYOUT$fragmentShaderPixelInterlock,
            LAYOUT$fragmentShaderShadingRateInterlock,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT");

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int fragmentShaderSampleInterlock() {return this.ptr.get(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock);}
    public void fragmentShaderSampleInterlock(int value) {this.ptr.set(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock, value);}
    public java.lang.foreign.MemorySegment fragmentShaderSampleInterlock_ptr() {return this.ptr.asSlice(OFFSET$fragmentShaderSampleInterlock, LAYOUT$fragmentShaderSampleInterlock);}

    public int fragmentShaderPixelInterlock() {return this.ptr.get(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock);}
    public void fragmentShaderPixelInterlock(int value) {this.ptr.set(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock, value);}
    public java.lang.foreign.MemorySegment fragmentShaderPixelInterlock_ptr() {return this.ptr.asSlice(OFFSET$fragmentShaderPixelInterlock, LAYOUT$fragmentShaderPixelInterlock);}

    public int fragmentShaderShadingRateInterlock() {return this.ptr.get(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock);}
    public void fragmentShaderShadingRateInterlock(int value) {this.ptr.set(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock, value);}
    public java.lang.foreign.MemorySegment fragmentShaderShadingRateInterlock_ptr() {return this.ptr.asSlice(OFFSET$fragmentShaderShadingRateInterlock, LAYOUT$fragmentShaderShadingRateInterlock);}
}

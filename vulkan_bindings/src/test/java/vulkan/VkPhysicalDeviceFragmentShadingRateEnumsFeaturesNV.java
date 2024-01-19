package vulkan;

public record VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateEnums = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateEnums = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supersampleFragmentShadingRates = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supersampleFragmentShadingRates = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$noInvocationFragmentShadingRates = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$noInvocationFragmentShadingRates = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$fragmentShadingRateEnums,
            LAYOUT$supersampleFragmentShadingRates,
            LAYOUT$noInvocationFragmentShadingRates,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV");

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int fragmentShadingRateEnums() {return this.ptr.get(LAYOUT$fragmentShadingRateEnums, OFFSET$fragmentShadingRateEnums);}
    public void fragmentShadingRateEnums(int value) {this.ptr.set(LAYOUT$fragmentShadingRateEnums, OFFSET$fragmentShadingRateEnums, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateEnums_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateEnums, LAYOUT$fragmentShadingRateEnums);}

    public int supersampleFragmentShadingRates() {return this.ptr.get(LAYOUT$supersampleFragmentShadingRates, OFFSET$supersampleFragmentShadingRates);}
    public void supersampleFragmentShadingRates(int value) {this.ptr.set(LAYOUT$supersampleFragmentShadingRates, OFFSET$supersampleFragmentShadingRates, value);}
    public java.lang.foreign.MemorySegment supersampleFragmentShadingRates_ptr() {return this.ptr.asSlice(OFFSET$supersampleFragmentShadingRates, LAYOUT$supersampleFragmentShadingRates);}

    public int noInvocationFragmentShadingRates() {return this.ptr.get(LAYOUT$noInvocationFragmentShadingRates, OFFSET$noInvocationFragmentShadingRates);}
    public void noInvocationFragmentShadingRates(int value) {this.ptr.set(LAYOUT$noInvocationFragmentShadingRates, OFFSET$noInvocationFragmentShadingRates, value);}
    public java.lang.foreign.MemorySegment noInvocationFragmentShadingRates_ptr() {return this.ptr.asSlice(OFFSET$noInvocationFragmentShadingRates, LAYOUT$noInvocationFragmentShadingRates);}
}

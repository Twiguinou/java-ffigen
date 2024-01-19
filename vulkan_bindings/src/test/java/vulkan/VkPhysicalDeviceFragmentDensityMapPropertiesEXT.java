package vulkan;

public record VkPhysicalDeviceFragmentDensityMapPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minFragmentDensityTexelSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minFragmentDensityTexelSize = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxFragmentDensityTexelSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxFragmentDensityTexelSize = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentDensityInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentDensityInvocations = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$minFragmentDensityTexelSize,
            LAYOUT$maxFragmentDensityTexelSize,
            LAYOUT$fragmentDensityInvocations,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFragmentDensityMapPropertiesEXT");

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkExtent2D minFragmentDensityTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minFragmentDensityTexelSize, LAYOUT$minFragmentDensityTexelSize));}

    public vulkan.VkExtent2D maxFragmentDensityTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxFragmentDensityTexelSize, LAYOUT$maxFragmentDensityTexelSize));}

    public int fragmentDensityInvocations() {return this.ptr.get(LAYOUT$fragmentDensityInvocations, OFFSET$fragmentDensityInvocations);}
    public void fragmentDensityInvocations(int value) {this.ptr.set(LAYOUT$fragmentDensityInvocations, OFFSET$fragmentDensityInvocations, value);}
    public java.lang.foreign.MemorySegment fragmentDensityInvocations_ptr() {return this.ptr.asSlice(OFFSET$fragmentDensityInvocations, LAYOUT$fragmentDensityInvocations);}
}

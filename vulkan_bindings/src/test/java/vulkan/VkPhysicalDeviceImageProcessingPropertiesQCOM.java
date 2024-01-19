package vulkan;

public record VkPhysicalDeviceImageProcessingPropertiesQCOM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxWeightFilterPhases = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxWeightFilterPhases = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxWeightFilterDimension = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxWeightFilterDimension = 20L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxBlockMatchRegion = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxBlockMatchRegion = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxBoxFilterBlockSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxBoxFilterBlockSize = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxWeightFilterPhases,
            LAYOUT$maxWeightFilterDimension,
            LAYOUT$maxBlockMatchRegion,
            LAYOUT$maxBoxFilterBlockSize,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceImageProcessingPropertiesQCOM");

    public VkPhysicalDeviceImageProcessingPropertiesQCOM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxWeightFilterPhases() {return this.ptr.get(LAYOUT$maxWeightFilterPhases, OFFSET$maxWeightFilterPhases);}
    public void maxWeightFilterPhases(int value) {this.ptr.set(LAYOUT$maxWeightFilterPhases, OFFSET$maxWeightFilterPhases, value);}
    public java.lang.foreign.MemorySegment maxWeightFilterPhases_ptr() {return this.ptr.asSlice(OFFSET$maxWeightFilterPhases, LAYOUT$maxWeightFilterPhases);}

    public vulkan.VkExtent2D maxWeightFilterDimension() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxWeightFilterDimension, LAYOUT$maxWeightFilterDimension));}

    public vulkan.VkExtent2D maxBlockMatchRegion() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxBlockMatchRegion, LAYOUT$maxBlockMatchRegion));}

    public vulkan.VkExtent2D maxBoxFilterBlockSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxBoxFilterBlockSize, LAYOUT$maxBoxFilterBlockSize));}
}

package vulkan;

public record VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$computeDerivativeGroupQuads = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$computeDerivativeGroupQuads = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$computeDerivativeGroupLinear = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$computeDerivativeGroupLinear = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$computeDerivativeGroupQuads,
            LAYOUT$computeDerivativeGroupLinear
    ).withName("VkPhysicalDeviceComputeShaderDerivativesFeaturesNV");

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int computeDerivativeGroupQuads() {return this.ptr.get(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads);}
    public void computeDerivativeGroupQuads(int value) {this.ptr.set(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads, value);}
    public java.lang.foreign.MemorySegment computeDerivativeGroupQuads_ptr() {return this.ptr.asSlice(OFFSET$computeDerivativeGroupQuads, LAYOUT$computeDerivativeGroupQuads);}

    public int computeDerivativeGroupLinear() {return this.ptr.get(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear);}
    public void computeDerivativeGroupLinear(int value) {this.ptr.set(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear, value);}
    public java.lang.foreign.MemorySegment computeDerivativeGroupLinear_ptr() {return this.ptr.asSlice(OFFSET$computeDerivativeGroupLinear, LAYOUT$computeDerivativeGroupLinear);}
}

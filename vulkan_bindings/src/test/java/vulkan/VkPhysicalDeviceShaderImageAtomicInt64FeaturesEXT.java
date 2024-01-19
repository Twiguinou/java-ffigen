package vulkan;

public record VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderImageInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderImageInt64Atomics = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseImageInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sparseImageInt64Atomics = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shaderImageInt64Atomics,
            LAYOUT$sparseImageInt64Atomics
    ).withName("VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT");

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shaderImageInt64Atomics() {return this.ptr.get(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics);}
    public void shaderImageInt64Atomics(int value) {this.ptr.set(LAYOUT$shaderImageInt64Atomics, OFFSET$shaderImageInt64Atomics, value);}
    public java.lang.foreign.MemorySegment shaderImageInt64Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderImageInt64Atomics, LAYOUT$shaderImageInt64Atomics);}

    public int sparseImageInt64Atomics() {return this.ptr.get(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics);}
    public void sparseImageInt64Atomics(int value) {this.ptr.set(LAYOUT$sparseImageInt64Atomics, OFFSET$sparseImageInt64Atomics, value);}
    public java.lang.foreign.MemorySegment sparseImageInt64Atomics_ptr() {return this.ptr.asSlice(OFFSET$sparseImageInt64Atomics, LAYOUT$sparseImageInt64Atomics);}
}

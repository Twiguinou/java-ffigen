package vulkan;

public record VkPhysicalDeviceShaderAtomicInt64Features(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderBufferInt64Atomics = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSharedInt64Atomics = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shaderBufferInt64Atomics,
            LAYOUT$shaderSharedInt64Atomics
    ).withName("VkPhysicalDeviceShaderAtomicInt64Features");

    public VkPhysicalDeviceShaderAtomicInt64Features(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shaderBufferInt64Atomics() {return this.ptr.get(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics);}
    public void shaderBufferInt64Atomics(int value) {this.ptr.set(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics, value);}
    public java.lang.foreign.MemorySegment shaderBufferInt64Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferInt64Atomics, LAYOUT$shaderBufferInt64Atomics);}

    public int shaderSharedInt64Atomics() {return this.ptr.get(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics);}
    public void shaderSharedInt64Atomics(int value) {this.ptr.set(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics, value);}
    public java.lang.foreign.MemorySegment shaderSharedInt64Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedInt64Atomics, LAYOUT$shaderSharedInt64Atomics);}
}

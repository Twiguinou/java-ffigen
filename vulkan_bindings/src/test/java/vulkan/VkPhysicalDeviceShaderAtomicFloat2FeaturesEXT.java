package vulkan;

public record VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat16Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderBufferFloat16Atomics = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat16AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderBufferFloat16AtomicAdd = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat16AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderBufferFloat16AtomicMinMax = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderBufferFloat32AtomicMinMax = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat64AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderBufferFloat64AtomicMinMax = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat16Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSharedFloat16Atomics = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat16AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSharedFloat16AtomicAdd = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat16AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSharedFloat16AtomicMinMax = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSharedFloat32AtomicMinMax = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat64AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSharedFloat64AtomicMinMax = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderImageFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderImageFloat32AtomicMinMax = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseImageFloat32AtomicMinMax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sparseImageFloat32AtomicMinMax = 60L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shaderBufferFloat16Atomics,
            LAYOUT$shaderBufferFloat16AtomicAdd,
            LAYOUT$shaderBufferFloat16AtomicMinMax,
            LAYOUT$shaderBufferFloat32AtomicMinMax,
            LAYOUT$shaderBufferFloat64AtomicMinMax,
            LAYOUT$shaderSharedFloat16Atomics,
            LAYOUT$shaderSharedFloat16AtomicAdd,
            LAYOUT$shaderSharedFloat16AtomicMinMax,
            LAYOUT$shaderSharedFloat32AtomicMinMax,
            LAYOUT$shaderSharedFloat64AtomicMinMax,
            LAYOUT$shaderImageFloat32AtomicMinMax,
            LAYOUT$sparseImageFloat32AtomicMinMax
    ).withName("VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT");

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shaderBufferFloat16Atomics() {return this.ptr.get(LAYOUT$shaderBufferFloat16Atomics, OFFSET$shaderBufferFloat16Atomics);}
    public void shaderBufferFloat16Atomics(int value) {this.ptr.set(LAYOUT$shaderBufferFloat16Atomics, OFFSET$shaderBufferFloat16Atomics, value);}
    public java.lang.foreign.MemorySegment shaderBufferFloat16Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat16Atomics, LAYOUT$shaderBufferFloat16Atomics);}

    public int shaderBufferFloat16AtomicAdd() {return this.ptr.get(LAYOUT$shaderBufferFloat16AtomicAdd, OFFSET$shaderBufferFloat16AtomicAdd);}
    public void shaderBufferFloat16AtomicAdd(int value) {this.ptr.set(LAYOUT$shaderBufferFloat16AtomicAdd, OFFSET$shaderBufferFloat16AtomicAdd, value);}
    public java.lang.foreign.MemorySegment shaderBufferFloat16AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat16AtomicAdd, LAYOUT$shaderBufferFloat16AtomicAdd);}

    public int shaderBufferFloat16AtomicMinMax() {return this.ptr.get(LAYOUT$shaderBufferFloat16AtomicMinMax, OFFSET$shaderBufferFloat16AtomicMinMax);}
    public void shaderBufferFloat16AtomicMinMax(int value) {this.ptr.set(LAYOUT$shaderBufferFloat16AtomicMinMax, OFFSET$shaderBufferFloat16AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment shaderBufferFloat16AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat16AtomicMinMax, LAYOUT$shaderBufferFloat16AtomicMinMax);}

    public int shaderBufferFloat32AtomicMinMax() {return this.ptr.get(LAYOUT$shaderBufferFloat32AtomicMinMax, OFFSET$shaderBufferFloat32AtomicMinMax);}
    public void shaderBufferFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT$shaderBufferFloat32AtomicMinMax, OFFSET$shaderBufferFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment shaderBufferFloat32AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat32AtomicMinMax, LAYOUT$shaderBufferFloat32AtomicMinMax);}

    public int shaderBufferFloat64AtomicMinMax() {return this.ptr.get(LAYOUT$shaderBufferFloat64AtomicMinMax, OFFSET$shaderBufferFloat64AtomicMinMax);}
    public void shaderBufferFloat64AtomicMinMax(int value) {this.ptr.set(LAYOUT$shaderBufferFloat64AtomicMinMax, OFFSET$shaderBufferFloat64AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment shaderBufferFloat64AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat64AtomicMinMax, LAYOUT$shaderBufferFloat64AtomicMinMax);}

    public int shaderSharedFloat16Atomics() {return this.ptr.get(LAYOUT$shaderSharedFloat16Atomics, OFFSET$shaderSharedFloat16Atomics);}
    public void shaderSharedFloat16Atomics(int value) {this.ptr.set(LAYOUT$shaderSharedFloat16Atomics, OFFSET$shaderSharedFloat16Atomics, value);}
    public java.lang.foreign.MemorySegment shaderSharedFloat16Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat16Atomics, LAYOUT$shaderSharedFloat16Atomics);}

    public int shaderSharedFloat16AtomicAdd() {return this.ptr.get(LAYOUT$shaderSharedFloat16AtomicAdd, OFFSET$shaderSharedFloat16AtomicAdd);}
    public void shaderSharedFloat16AtomicAdd(int value) {this.ptr.set(LAYOUT$shaderSharedFloat16AtomicAdd, OFFSET$shaderSharedFloat16AtomicAdd, value);}
    public java.lang.foreign.MemorySegment shaderSharedFloat16AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat16AtomicAdd, LAYOUT$shaderSharedFloat16AtomicAdd);}

    public int shaderSharedFloat16AtomicMinMax() {return this.ptr.get(LAYOUT$shaderSharedFloat16AtomicMinMax, OFFSET$shaderSharedFloat16AtomicMinMax);}
    public void shaderSharedFloat16AtomicMinMax(int value) {this.ptr.set(LAYOUT$shaderSharedFloat16AtomicMinMax, OFFSET$shaderSharedFloat16AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment shaderSharedFloat16AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat16AtomicMinMax, LAYOUT$shaderSharedFloat16AtomicMinMax);}

    public int shaderSharedFloat32AtomicMinMax() {return this.ptr.get(LAYOUT$shaderSharedFloat32AtomicMinMax, OFFSET$shaderSharedFloat32AtomicMinMax);}
    public void shaderSharedFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT$shaderSharedFloat32AtomicMinMax, OFFSET$shaderSharedFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment shaderSharedFloat32AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat32AtomicMinMax, LAYOUT$shaderSharedFloat32AtomicMinMax);}

    public int shaderSharedFloat64AtomicMinMax() {return this.ptr.get(LAYOUT$shaderSharedFloat64AtomicMinMax, OFFSET$shaderSharedFloat64AtomicMinMax);}
    public void shaderSharedFloat64AtomicMinMax(int value) {this.ptr.set(LAYOUT$shaderSharedFloat64AtomicMinMax, OFFSET$shaderSharedFloat64AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment shaderSharedFloat64AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat64AtomicMinMax, LAYOUT$shaderSharedFloat64AtomicMinMax);}

    public int shaderImageFloat32AtomicMinMax() {return this.ptr.get(LAYOUT$shaderImageFloat32AtomicMinMax, OFFSET$shaderImageFloat32AtomicMinMax);}
    public void shaderImageFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT$shaderImageFloat32AtomicMinMax, OFFSET$shaderImageFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment shaderImageFloat32AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$shaderImageFloat32AtomicMinMax, LAYOUT$shaderImageFloat32AtomicMinMax);}

    public int sparseImageFloat32AtomicMinMax() {return this.ptr.get(LAYOUT$sparseImageFloat32AtomicMinMax, OFFSET$sparseImageFloat32AtomicMinMax);}
    public void sparseImageFloat32AtomicMinMax(int value) {this.ptr.set(LAYOUT$sparseImageFloat32AtomicMinMax, OFFSET$sparseImageFloat32AtomicMinMax, value);}
    public java.lang.foreign.MemorySegment sparseImageFloat32AtomicMinMax_ptr() {return this.ptr.asSlice(OFFSET$sparseImageFloat32AtomicMinMax, LAYOUT$sparseImageFloat32AtomicMinMax);}
}

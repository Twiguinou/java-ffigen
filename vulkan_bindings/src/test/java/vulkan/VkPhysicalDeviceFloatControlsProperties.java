package vulkan;

public record VkPhysicalDeviceFloatControlsProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$denormBehaviorIndependence = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$denormBehaviorIndependence = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$roundingModeIndependence = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$roundingModeIndependence = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat16 = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat32 = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat64 = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDenormPreserveFloat16 = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDenormPreserveFloat32 = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDenormPreserveFloat64 = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormFlushToZeroFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDenormFlushToZeroFloat16 = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormFlushToZeroFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDenormFlushToZeroFloat32 = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormFlushToZeroFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderDenormFlushToZeroFloat64 = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTEFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderRoundingModeRTEFloat16 = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTEFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderRoundingModeRTEFloat32 = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTEFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderRoundingModeRTEFloat64 = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTZFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderRoundingModeRTZFloat16 = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTZFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderRoundingModeRTZFloat32 = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTZFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderRoundingModeRTZFloat64 = 80L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$denormBehaviorIndependence,
            LAYOUT$roundingModeIndependence,
            LAYOUT$shaderSignedZeroInfNanPreserveFloat16,
            LAYOUT$shaderSignedZeroInfNanPreserveFloat32,
            LAYOUT$shaderSignedZeroInfNanPreserveFloat64,
            LAYOUT$shaderDenormPreserveFloat16,
            LAYOUT$shaderDenormPreserveFloat32,
            LAYOUT$shaderDenormPreserveFloat64,
            LAYOUT$shaderDenormFlushToZeroFloat16,
            LAYOUT$shaderDenormFlushToZeroFloat32,
            LAYOUT$shaderDenormFlushToZeroFloat64,
            LAYOUT$shaderRoundingModeRTEFloat16,
            LAYOUT$shaderRoundingModeRTEFloat32,
            LAYOUT$shaderRoundingModeRTEFloat64,
            LAYOUT$shaderRoundingModeRTZFloat16,
            LAYOUT$shaderRoundingModeRTZFloat32,
            LAYOUT$shaderRoundingModeRTZFloat64,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFloatControlsProperties");

    public VkPhysicalDeviceFloatControlsProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int denormBehaviorIndependence() {return this.ptr.get(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence);}
    public void denormBehaviorIndependence(int value) {this.ptr.set(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence, value);}
    public java.lang.foreign.MemorySegment denormBehaviorIndependence_ptr() {return this.ptr.asSlice(OFFSET$denormBehaviorIndependence, LAYOUT$denormBehaviorIndependence);}

    public int roundingModeIndependence() {return this.ptr.get(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence);}
    public void roundingModeIndependence(int value) {this.ptr.set(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence, value);}
    public java.lang.foreign.MemorySegment roundingModeIndependence_ptr() {return this.ptr.asSlice(OFFSET$roundingModeIndependence, LAYOUT$roundingModeIndependence);}

    public int shaderSignedZeroInfNanPreserveFloat16() {return this.ptr.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16);}
    public void shaderSignedZeroInfNanPreserveFloat16(int value) {this.ptr.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16, value);}
    public java.lang.foreign.MemorySegment shaderSignedZeroInfNanPreserveFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderSignedZeroInfNanPreserveFloat16, LAYOUT$shaderSignedZeroInfNanPreserveFloat16);}

    public int shaderSignedZeroInfNanPreserveFloat32() {return this.ptr.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32);}
    public void shaderSignedZeroInfNanPreserveFloat32(int value) {this.ptr.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32, value);}
    public java.lang.foreign.MemorySegment shaderSignedZeroInfNanPreserveFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderSignedZeroInfNanPreserveFloat32, LAYOUT$shaderSignedZeroInfNanPreserveFloat32);}

    public int shaderSignedZeroInfNanPreserveFloat64() {return this.ptr.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64);}
    public void shaderSignedZeroInfNanPreserveFloat64(int value) {this.ptr.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64, value);}
    public java.lang.foreign.MemorySegment shaderSignedZeroInfNanPreserveFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderSignedZeroInfNanPreserveFloat64, LAYOUT$shaderSignedZeroInfNanPreserveFloat64);}

    public int shaderDenormPreserveFloat16() {return this.ptr.get(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16);}
    public void shaderDenormPreserveFloat16(int value) {this.ptr.set(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16, value);}
    public java.lang.foreign.MemorySegment shaderDenormPreserveFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormPreserveFloat16, LAYOUT$shaderDenormPreserveFloat16);}

    public int shaderDenormPreserveFloat32() {return this.ptr.get(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32);}
    public void shaderDenormPreserveFloat32(int value) {this.ptr.set(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32, value);}
    public java.lang.foreign.MemorySegment shaderDenormPreserveFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormPreserveFloat32, LAYOUT$shaderDenormPreserveFloat32);}

    public int shaderDenormPreserveFloat64() {return this.ptr.get(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64);}
    public void shaderDenormPreserveFloat64(int value) {this.ptr.set(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64, value);}
    public java.lang.foreign.MemorySegment shaderDenormPreserveFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormPreserveFloat64, LAYOUT$shaderDenormPreserveFloat64);}

    public int shaderDenormFlushToZeroFloat16() {return this.ptr.get(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16);}
    public void shaderDenormFlushToZeroFloat16(int value) {this.ptr.set(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16, value);}
    public java.lang.foreign.MemorySegment shaderDenormFlushToZeroFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormFlushToZeroFloat16, LAYOUT$shaderDenormFlushToZeroFloat16);}

    public int shaderDenormFlushToZeroFloat32() {return this.ptr.get(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32);}
    public void shaderDenormFlushToZeroFloat32(int value) {this.ptr.set(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32, value);}
    public java.lang.foreign.MemorySegment shaderDenormFlushToZeroFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormFlushToZeroFloat32, LAYOUT$shaderDenormFlushToZeroFloat32);}

    public int shaderDenormFlushToZeroFloat64() {return this.ptr.get(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64);}
    public void shaderDenormFlushToZeroFloat64(int value) {this.ptr.set(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64, value);}
    public java.lang.foreign.MemorySegment shaderDenormFlushToZeroFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormFlushToZeroFloat64, LAYOUT$shaderDenormFlushToZeroFloat64);}

    public int shaderRoundingModeRTEFloat16() {return this.ptr.get(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16);}
    public void shaderRoundingModeRTEFloat16(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16, value);}
    public java.lang.foreign.MemorySegment shaderRoundingModeRTEFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTEFloat16, LAYOUT$shaderRoundingModeRTEFloat16);}

    public int shaderRoundingModeRTEFloat32() {return this.ptr.get(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32);}
    public void shaderRoundingModeRTEFloat32(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32, value);}
    public java.lang.foreign.MemorySegment shaderRoundingModeRTEFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTEFloat32, LAYOUT$shaderRoundingModeRTEFloat32);}

    public int shaderRoundingModeRTEFloat64() {return this.ptr.get(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64);}
    public void shaderRoundingModeRTEFloat64(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64, value);}
    public java.lang.foreign.MemorySegment shaderRoundingModeRTEFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTEFloat64, LAYOUT$shaderRoundingModeRTEFloat64);}

    public int shaderRoundingModeRTZFloat16() {return this.ptr.get(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16);}
    public void shaderRoundingModeRTZFloat16(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16, value);}
    public java.lang.foreign.MemorySegment shaderRoundingModeRTZFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTZFloat16, LAYOUT$shaderRoundingModeRTZFloat16);}

    public int shaderRoundingModeRTZFloat32() {return this.ptr.get(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32);}
    public void shaderRoundingModeRTZFloat32(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32, value);}
    public java.lang.foreign.MemorySegment shaderRoundingModeRTZFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTZFloat32, LAYOUT$shaderRoundingModeRTZFloat32);}

    public int shaderRoundingModeRTZFloat64() {return this.ptr.get(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64);}
    public void shaderRoundingModeRTZFloat64(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64, value);}
    public java.lang.foreign.MemorySegment shaderRoundingModeRTZFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTZFloat64, LAYOUT$shaderRoundingModeRTZFloat64);}
}

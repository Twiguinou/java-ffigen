package vulkan;

public record VkPhysicalDeviceShaderCorePropertiesARM(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pixelRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pixelRate = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$texelRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$texelRate = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fmaRate = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fmaRate = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$pixelRate,
            LAYOUT$texelRate,
            LAYOUT$fmaRate,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceShaderCorePropertiesARM");

    public VkPhysicalDeviceShaderCorePropertiesARM(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int pixelRate() {return this.ptr.get(LAYOUT$pixelRate, OFFSET$pixelRate);}
    public void pixelRate(int value) {this.ptr.set(LAYOUT$pixelRate, OFFSET$pixelRate, value);}
    public java.lang.foreign.MemorySegment pixelRate_ptr() {return this.ptr.asSlice(OFFSET$pixelRate, LAYOUT$pixelRate);}

    public int texelRate() {return this.ptr.get(LAYOUT$texelRate, OFFSET$texelRate);}
    public void texelRate(int value) {this.ptr.set(LAYOUT$texelRate, OFFSET$texelRate, value);}
    public java.lang.foreign.MemorySegment texelRate_ptr() {return this.ptr.asSlice(OFFSET$texelRate, LAYOUT$texelRate);}

    public int fmaRate() {return this.ptr.get(LAYOUT$fmaRate, OFFSET$fmaRate);}
    public void fmaRate(int value) {this.ptr.set(LAYOUT$fmaRate, OFFSET$fmaRate, value);}
    public java.lang.foreign.MemorySegment fmaRate_ptr() {return this.ptr.asSlice(OFFSET$fmaRate, LAYOUT$fmaRate);}
}

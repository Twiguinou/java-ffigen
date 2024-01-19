package vulkan;

public record VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSMCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSMCount = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderWarpsPerSM = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderWarpsPerSM = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$shaderSMCount,
            LAYOUT$shaderWarpsPerSM
    ).withName("VkPhysicalDeviceShaderSMBuiltinsPropertiesNV");

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int shaderSMCount() {return this.ptr.get(LAYOUT$shaderSMCount, OFFSET$shaderSMCount);}
    public void shaderSMCount(int value) {this.ptr.set(LAYOUT$shaderSMCount, OFFSET$shaderSMCount, value);}
    public java.lang.foreign.MemorySegment shaderSMCount_ptr() {return this.ptr.asSlice(OFFSET$shaderSMCount, LAYOUT$shaderSMCount);}

    public int shaderWarpsPerSM() {return this.ptr.get(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM);}
    public void shaderWarpsPerSM(int value) {this.ptr.set(LAYOUT$shaderWarpsPerSM, OFFSET$shaderWarpsPerSM, value);}
    public java.lang.foreign.MemorySegment shaderWarpsPerSM_ptr() {return this.ptr.asSlice(OFFSET$shaderWarpsPerSM, LAYOUT$shaderWarpsPerSM);}
}

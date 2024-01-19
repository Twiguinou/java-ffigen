package vulkan;

public record VkPhysicalDeviceRobustness2PropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$robustStorageBufferAccessSizeAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$robustStorageBufferAccessSizeAlignment = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$robustUniformBufferAccessSizeAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$robustUniformBufferAccessSizeAlignment = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$robustStorageBufferAccessSizeAlignment,
            LAYOUT$robustUniformBufferAccessSizeAlignment
    ).withName("VkPhysicalDeviceRobustness2PropertiesEXT");

    public VkPhysicalDeviceRobustness2PropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long robustStorageBufferAccessSizeAlignment() {return this.ptr.get(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment);}
    public void robustStorageBufferAccessSizeAlignment(long value) {this.ptr.set(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment, value);}
    public java.lang.foreign.MemorySegment robustStorageBufferAccessSizeAlignment_ptr() {return this.ptr.asSlice(OFFSET$robustStorageBufferAccessSizeAlignment, LAYOUT$robustStorageBufferAccessSizeAlignment);}

    public long robustUniformBufferAccessSizeAlignment() {return this.ptr.get(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment);}
    public void robustUniformBufferAccessSizeAlignment(long value) {this.ptr.set(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment, value);}
    public java.lang.foreign.MemorySegment robustUniformBufferAccessSizeAlignment_ptr() {return this.ptr.asSlice(OFFSET$robustUniformBufferAccessSizeAlignment, LAYOUT$robustUniformBufferAccessSizeAlignment);}
}

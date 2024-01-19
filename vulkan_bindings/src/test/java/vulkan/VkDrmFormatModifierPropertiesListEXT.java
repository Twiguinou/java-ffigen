package vulkan;

public record VkDrmFormatModifierPropertiesListEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$drmFormatModifierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$drmFormatModifierCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDrmFormatModifierProperties = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDrmFormatModifierProperties = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$drmFormatModifierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDrmFormatModifierProperties
    ).withName("VkDrmFormatModifierPropertiesListEXT");

    public VkDrmFormatModifierPropertiesListEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int drmFormatModifierCount() {return this.ptr.get(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount);}
    public void drmFormatModifierCount(int value) {this.ptr.set(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount, value);}
    public java.lang.foreign.MemorySegment drmFormatModifierCount_ptr() {return this.ptr.asSlice(OFFSET$drmFormatModifierCount, LAYOUT$drmFormatModifierCount);}

    public java.lang.foreign.MemorySegment pDrmFormatModifierProperties() {return this.ptr.get(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties);}
    public void pDrmFormatModifierProperties(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties, value);}
    public java.lang.foreign.MemorySegment pDrmFormatModifierProperties_ptr() {return this.ptr.asSlice(OFFSET$pDrmFormatModifierProperties, LAYOUT$pDrmFormatModifierProperties);}
}

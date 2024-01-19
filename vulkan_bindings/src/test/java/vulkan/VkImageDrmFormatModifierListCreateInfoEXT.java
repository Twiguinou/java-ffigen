package vulkan;

public record VkImageDrmFormatModifierListCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$drmFormatModifierCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$drmFormatModifierCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDrmFormatModifiers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDrmFormatModifiers = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$drmFormatModifierCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDrmFormatModifiers
    ).withName("VkImageDrmFormatModifierListCreateInfoEXT");

    public VkImageDrmFormatModifierListCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
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

    public java.lang.foreign.MemorySegment pDrmFormatModifiers() {return this.ptr.get(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers);}
    public void pDrmFormatModifiers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers, value);}
    public java.lang.foreign.MemorySegment pDrmFormatModifiers_ptr() {return this.ptr.asSlice(OFFSET$pDrmFormatModifiers, LAYOUT$pDrmFormatModifiers);}
}

package vulkan;

public record VkImageDrmFormatModifierExplicitCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$drmFormatModifier = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$drmFormatModifier = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$drmFormatModifierPlaneCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$drmFormatModifierPlaneCount = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPlaneLayouts = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPlaneLayouts = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$drmFormatModifier,
            LAYOUT$drmFormatModifierPlaneCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPlaneLayouts
    ).withName("VkImageDrmFormatModifierExplicitCreateInfoEXT");

    public VkImageDrmFormatModifierExplicitCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long drmFormatModifier() {return this.ptr.get(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier);}
    public void drmFormatModifier(long value) {this.ptr.set(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier, value);}
    public java.lang.foreign.MemorySegment drmFormatModifier_ptr() {return this.ptr.asSlice(OFFSET$drmFormatModifier, LAYOUT$drmFormatModifier);}

    public int drmFormatModifierPlaneCount() {return this.ptr.get(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount);}
    public void drmFormatModifierPlaneCount(int value) {this.ptr.set(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount, value);}
    public java.lang.foreign.MemorySegment drmFormatModifierPlaneCount_ptr() {return this.ptr.asSlice(OFFSET$drmFormatModifierPlaneCount, LAYOUT$drmFormatModifierPlaneCount);}

    public java.lang.foreign.MemorySegment pPlaneLayouts() {return this.ptr.get(LAYOUT$pPlaneLayouts, OFFSET$pPlaneLayouts);}
    public void pPlaneLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPlaneLayouts, OFFSET$pPlaneLayouts, value);}
    public java.lang.foreign.MemorySegment pPlaneLayouts_ptr() {return this.ptr.asSlice(OFFSET$pPlaneLayouts, LAYOUT$pPlaneLayouts);}
}

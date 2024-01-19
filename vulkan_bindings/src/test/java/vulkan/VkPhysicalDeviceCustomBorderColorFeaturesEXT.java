package vulkan;

public record VkPhysicalDeviceCustomBorderColorFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$customBorderColors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$customBorderColors = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$customBorderColorWithoutFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$customBorderColorWithoutFormat = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$customBorderColors,
            LAYOUT$customBorderColorWithoutFormat
    ).withName("VkPhysicalDeviceCustomBorderColorFeaturesEXT");

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int customBorderColors() {return this.ptr.get(LAYOUT$customBorderColors, OFFSET$customBorderColors);}
    public void customBorderColors(int value) {this.ptr.set(LAYOUT$customBorderColors, OFFSET$customBorderColors, value);}
    public java.lang.foreign.MemorySegment customBorderColors_ptr() {return this.ptr.asSlice(OFFSET$customBorderColors, LAYOUT$customBorderColors);}

    public int customBorderColorWithoutFormat() {return this.ptr.get(LAYOUT$customBorderColorWithoutFormat, OFFSET$customBorderColorWithoutFormat);}
    public void customBorderColorWithoutFormat(int value) {this.ptr.set(LAYOUT$customBorderColorWithoutFormat, OFFSET$customBorderColorWithoutFormat, value);}
    public java.lang.foreign.MemorySegment customBorderColorWithoutFormat_ptr() {return this.ptr.asSlice(OFFSET$customBorderColorWithoutFormat, LAYOUT$customBorderColorWithoutFormat);}
}

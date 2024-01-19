package vulkan;

public record VkFilterCubicImageViewImageFormatPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$filterCubic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$filterCubic = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$filterCubicMinmax = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$filterCubicMinmax = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$filterCubic,
            LAYOUT$filterCubicMinmax
    ).withName("VkFilterCubicImageViewImageFormatPropertiesEXT");

    public VkFilterCubicImageViewImageFormatPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int filterCubic() {return this.ptr.get(LAYOUT$filterCubic, OFFSET$filterCubic);}
    public void filterCubic(int value) {this.ptr.set(LAYOUT$filterCubic, OFFSET$filterCubic, value);}
    public java.lang.foreign.MemorySegment filterCubic_ptr() {return this.ptr.asSlice(OFFSET$filterCubic, LAYOUT$filterCubic);}

    public int filterCubicMinmax() {return this.ptr.get(LAYOUT$filterCubicMinmax, OFFSET$filterCubicMinmax);}
    public void filterCubicMinmax(int value) {this.ptr.set(LAYOUT$filterCubicMinmax, OFFSET$filterCubicMinmax, value);}
    public java.lang.foreign.MemorySegment filterCubicMinmax_ptr() {return this.ptr.asSlice(OFFSET$filterCubicMinmax, LAYOUT$filterCubicMinmax);}
}

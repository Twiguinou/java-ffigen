package vulkan;

public record VkShadingRatePaletteNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRatePaletteEntryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shadingRatePaletteEntryCount = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pShadingRatePaletteEntries = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pShadingRatePaletteEntries = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$shadingRatePaletteEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pShadingRatePaletteEntries
    ).withName("VkShadingRatePaletteNV");

    public VkShadingRatePaletteNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int shadingRatePaletteEntryCount() {return this.ptr.get(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount);}
    public void shadingRatePaletteEntryCount(int value) {this.ptr.set(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount, value);}
    public java.lang.foreign.MemorySegment shadingRatePaletteEntryCount_ptr() {return this.ptr.asSlice(OFFSET$shadingRatePaletteEntryCount, LAYOUT$shadingRatePaletteEntryCount);}

    public java.lang.foreign.MemorySegment pShadingRatePaletteEntries() {return this.ptr.get(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries);}
    public void pShadingRatePaletteEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries, value);}
    public java.lang.foreign.MemorySegment pShadingRatePaletteEntries_ptr() {return this.ptr.asSlice(OFFSET$pShadingRatePaletteEntries, LAYOUT$pShadingRatePaletteEntries);}
}

package vulkan;

public record VkSpecializationInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mapEntryCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mapEntryCount = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pMapEntries = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pMapEntries = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$dataSize = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pData = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pData = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$mapEntryCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pMapEntries,
            LAYOUT$dataSize,
            LAYOUT$pData
    ).withName("VkSpecializationInfo");

    public VkSpecializationInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int mapEntryCount() {return this.ptr.get(LAYOUT$mapEntryCount, OFFSET$mapEntryCount);}
    public void mapEntryCount(int value) {this.ptr.set(LAYOUT$mapEntryCount, OFFSET$mapEntryCount, value);}
    public java.lang.foreign.MemorySegment mapEntryCount_ptr() {return this.ptr.asSlice(OFFSET$mapEntryCount, LAYOUT$mapEntryCount);}

    public java.lang.foreign.MemorySegment pMapEntries() {return this.ptr.get(LAYOUT$pMapEntries, OFFSET$pMapEntries);}
    public void pMapEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMapEntries, OFFSET$pMapEntries, value);}
    public java.lang.foreign.MemorySegment pMapEntries_ptr() {return this.ptr.asSlice(OFFSET$pMapEntries, LAYOUT$pMapEntries);}

    public long dataSize() {return this.ptr.get(LAYOUT$dataSize, OFFSET$dataSize);}
    public void dataSize(long value) {this.ptr.set(LAYOUT$dataSize, OFFSET$dataSize, value);}
    public java.lang.foreign.MemorySegment dataSize_ptr() {return this.ptr.asSlice(OFFSET$dataSize, LAYOUT$dataSize);}

    public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT$pData, OFFSET$pData);}
    public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pData, OFFSET$pData, value);}
    public java.lang.foreign.MemorySegment pData_ptr() {return this.ptr.asSlice(OFFSET$pData, LAYOUT$pData);}
}

package vulkan;

public record VkBindImageMemoryDeviceGroupInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceIndexCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDeviceIndices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDeviceIndices = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$splitInstanceBindRegionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$splitInstanceBindRegionCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSplitInstanceBindRegions = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSplitInstanceBindRegions = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$deviceIndexCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDeviceIndices,
            LAYOUT$splitInstanceBindRegionCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSplitInstanceBindRegions
    ).withName("VkBindImageMemoryDeviceGroupInfo");

    public VkBindImageMemoryDeviceGroupInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int deviceIndexCount() {return this.ptr.get(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount);}
    public void deviceIndexCount(int value) {this.ptr.set(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount, value);}
    public java.lang.foreign.MemorySegment deviceIndexCount_ptr() {return this.ptr.asSlice(OFFSET$deviceIndexCount, LAYOUT$deviceIndexCount);}

    public java.lang.foreign.MemorySegment pDeviceIndices() {return this.ptr.get(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices);}
    public void pDeviceIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices, value);}
    public java.lang.foreign.MemorySegment pDeviceIndices_ptr() {return this.ptr.asSlice(OFFSET$pDeviceIndices, LAYOUT$pDeviceIndices);}

    public int splitInstanceBindRegionCount() {return this.ptr.get(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount);}
    public void splitInstanceBindRegionCount(int value) {this.ptr.set(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount, value);}
    public java.lang.foreign.MemorySegment splitInstanceBindRegionCount_ptr() {return this.ptr.asSlice(OFFSET$splitInstanceBindRegionCount, LAYOUT$splitInstanceBindRegionCount);}

    public java.lang.foreign.MemorySegment pSplitInstanceBindRegions() {return this.ptr.get(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions);}
    public void pSplitInstanceBindRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions, value);}
    public java.lang.foreign.MemorySegment pSplitInstanceBindRegions_ptr() {return this.ptr.asSlice(OFFSET$pSplitInstanceBindRegions, LAYOUT$pSplitInstanceBindRegions);}
}

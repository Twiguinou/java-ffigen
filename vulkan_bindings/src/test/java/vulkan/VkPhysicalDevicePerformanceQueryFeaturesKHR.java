package vulkan;

public record VkPhysicalDevicePerformanceQueryFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$performanceCounterQueryPools = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$performanceCounterQueryPools = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$performanceCounterMultipleQueryPools = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$performanceCounterMultipleQueryPools = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$performanceCounterQueryPools,
            LAYOUT$performanceCounterMultipleQueryPools
    ).withName("VkPhysicalDevicePerformanceQueryFeaturesKHR");

    public VkPhysicalDevicePerformanceQueryFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int performanceCounterQueryPools() {return this.ptr.get(LAYOUT$performanceCounterQueryPools, OFFSET$performanceCounterQueryPools);}
    public void performanceCounterQueryPools(int value) {this.ptr.set(LAYOUT$performanceCounterQueryPools, OFFSET$performanceCounterQueryPools, value);}
    public java.lang.foreign.MemorySegment performanceCounterQueryPools_ptr() {return this.ptr.asSlice(OFFSET$performanceCounterQueryPools, LAYOUT$performanceCounterQueryPools);}

    public int performanceCounterMultipleQueryPools() {return this.ptr.get(LAYOUT$performanceCounterMultipleQueryPools, OFFSET$performanceCounterMultipleQueryPools);}
    public void performanceCounterMultipleQueryPools(int value) {this.ptr.set(LAYOUT$performanceCounterMultipleQueryPools, OFFSET$performanceCounterMultipleQueryPools, value);}
    public java.lang.foreign.MemorySegment performanceCounterMultipleQueryPools_ptr() {return this.ptr.asSlice(OFFSET$performanceCounterMultipleQueryPools, LAYOUT$performanceCounterMultipleQueryPools);}
}

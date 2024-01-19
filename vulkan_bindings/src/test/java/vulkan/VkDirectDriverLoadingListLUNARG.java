package vulkan;

public record VkDirectDriverLoadingListLUNARG(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mode = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$driverCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$driverCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDrivers = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDrivers = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$mode,
            LAYOUT$driverCount,
            LAYOUT$pDrivers
    ).withName("VkDirectDriverLoadingListLUNARG");

    public VkDirectDriverLoadingListLUNARG(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int mode() {return this.ptr.get(LAYOUT$mode, OFFSET$mode);}
    public void mode(int value) {this.ptr.set(LAYOUT$mode, OFFSET$mode, value);}
    public java.lang.foreign.MemorySegment mode_ptr() {return this.ptr.asSlice(OFFSET$mode, LAYOUT$mode);}

    public int driverCount() {return this.ptr.get(LAYOUT$driverCount, OFFSET$driverCount);}
    public void driverCount(int value) {this.ptr.set(LAYOUT$driverCount, OFFSET$driverCount, value);}
    public java.lang.foreign.MemorySegment driverCount_ptr() {return this.ptr.asSlice(OFFSET$driverCount, LAYOUT$driverCount);}

    public java.lang.foreign.MemorySegment pDrivers() {return this.ptr.get(LAYOUT$pDrivers, OFFSET$pDrivers);}
    public void pDrivers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDrivers, OFFSET$pDrivers, value);}
    public java.lang.foreign.MemorySegment pDrivers_ptr() {return this.ptr.asSlice(OFFSET$pDrivers, LAYOUT$pDrivers);}
}

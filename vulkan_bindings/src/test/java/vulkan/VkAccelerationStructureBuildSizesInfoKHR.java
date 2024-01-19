package vulkan;

public record VkAccelerationStructureBuildSizesInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$accelerationStructureSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$accelerationStructureSize = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$updateScratchSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$updateScratchSize = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$buildScratchSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$buildScratchSize = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$accelerationStructureSize,
            LAYOUT$updateScratchSize,
            LAYOUT$buildScratchSize
    ).withName("VkAccelerationStructureBuildSizesInfoKHR");

    public VkAccelerationStructureBuildSizesInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long accelerationStructureSize() {return this.ptr.get(LAYOUT$accelerationStructureSize, OFFSET$accelerationStructureSize);}
    public void accelerationStructureSize(long value) {this.ptr.set(LAYOUT$accelerationStructureSize, OFFSET$accelerationStructureSize, value);}
    public java.lang.foreign.MemorySegment accelerationStructureSize_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureSize, LAYOUT$accelerationStructureSize);}

    public long updateScratchSize() {return this.ptr.get(LAYOUT$updateScratchSize, OFFSET$updateScratchSize);}
    public void updateScratchSize(long value) {this.ptr.set(LAYOUT$updateScratchSize, OFFSET$updateScratchSize, value);}
    public java.lang.foreign.MemorySegment updateScratchSize_ptr() {return this.ptr.asSlice(OFFSET$updateScratchSize, LAYOUT$updateScratchSize);}

    public long buildScratchSize() {return this.ptr.get(LAYOUT$buildScratchSize, OFFSET$buildScratchSize);}
    public void buildScratchSize(long value) {this.ptr.set(LAYOUT$buildScratchSize, OFFSET$buildScratchSize, value);}
    public java.lang.foreign.MemorySegment buildScratchSize_ptr() {return this.ptr.asSlice(OFFSET$buildScratchSize, LAYOUT$buildScratchSize);}
}

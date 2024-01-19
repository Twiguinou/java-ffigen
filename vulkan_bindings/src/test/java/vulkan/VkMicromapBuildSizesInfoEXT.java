package vulkan;

public record VkMicromapBuildSizesInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$micromapSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$micromapSize = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$buildScratchSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$buildScratchSize = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$discardable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$discardable = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$micromapSize,
            LAYOUT$buildScratchSize,
            LAYOUT$discardable,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkMicromapBuildSizesInfoEXT");

    public VkMicromapBuildSizesInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long micromapSize() {return this.ptr.get(LAYOUT$micromapSize, OFFSET$micromapSize);}
    public void micromapSize(long value) {this.ptr.set(LAYOUT$micromapSize, OFFSET$micromapSize, value);}
    public java.lang.foreign.MemorySegment micromapSize_ptr() {return this.ptr.asSlice(OFFSET$micromapSize, LAYOUT$micromapSize);}

    public long buildScratchSize() {return this.ptr.get(LAYOUT$buildScratchSize, OFFSET$buildScratchSize);}
    public void buildScratchSize(long value) {this.ptr.set(LAYOUT$buildScratchSize, OFFSET$buildScratchSize, value);}
    public java.lang.foreign.MemorySegment buildScratchSize_ptr() {return this.ptr.asSlice(OFFSET$buildScratchSize, LAYOUT$buildScratchSize);}

    public int discardable() {return this.ptr.get(LAYOUT$discardable, OFFSET$discardable);}
    public void discardable(int value) {this.ptr.set(LAYOUT$discardable, OFFSET$discardable, value);}
    public java.lang.foreign.MemorySegment discardable_ptr() {return this.ptr.asSlice(OFFSET$discardable, LAYOUT$discardable);}
}

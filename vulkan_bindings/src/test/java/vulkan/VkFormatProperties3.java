package vulkan;

public record VkFormatProperties3(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$linearTilingFeatures = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$linearTilingFeatures = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$optimalTilingFeatures = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$optimalTilingFeatures = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bufferFeatures = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bufferFeatures = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$linearTilingFeatures,
            LAYOUT$optimalTilingFeatures,
            LAYOUT$bufferFeatures
    ).withName("VkFormatProperties3");

    public VkFormatProperties3(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long linearTilingFeatures() {return this.ptr.get(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures);}
    public void linearTilingFeatures(long value) {this.ptr.set(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures, value);}
    public java.lang.foreign.MemorySegment linearTilingFeatures_ptr() {return this.ptr.asSlice(OFFSET$linearTilingFeatures, LAYOUT$linearTilingFeatures);}

    public long optimalTilingFeatures() {return this.ptr.get(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures);}
    public void optimalTilingFeatures(long value) {this.ptr.set(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures, value);}
    public java.lang.foreign.MemorySegment optimalTilingFeatures_ptr() {return this.ptr.asSlice(OFFSET$optimalTilingFeatures, LAYOUT$optimalTilingFeatures);}

    public long bufferFeatures() {return this.ptr.get(LAYOUT$bufferFeatures, OFFSET$bufferFeatures);}
    public void bufferFeatures(long value) {this.ptr.set(LAYOUT$bufferFeatures, OFFSET$bufferFeatures, value);}
    public java.lang.foreign.MemorySegment bufferFeatures_ptr() {return this.ptr.asSlice(OFFSET$bufferFeatures, LAYOUT$bufferFeatures);}
}

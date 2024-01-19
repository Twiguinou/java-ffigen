package vulkan;

public record VkImageSubresourceRange(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$aspectMask = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$baseMipLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$baseMipLevel = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$levelCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$levelCount = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$baseArrayLayer = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$layerCount = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$aspectMask,
            LAYOUT$baseMipLevel,
            LAYOUT$levelCount,
            LAYOUT$baseArrayLayer,
            LAYOUT$layerCount
    ).withName("VkImageSubresourceRange");

    public VkImageSubresourceRange(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int aspectMask() {return this.ptr.get(LAYOUT$aspectMask, OFFSET$aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);}
    public java.lang.foreign.MemorySegment aspectMask_ptr() {return this.ptr.asSlice(OFFSET$aspectMask, LAYOUT$aspectMask);}

    public int baseMipLevel() {return this.ptr.get(LAYOUT$baseMipLevel, OFFSET$baseMipLevel);}
    public void baseMipLevel(int value) {this.ptr.set(LAYOUT$baseMipLevel, OFFSET$baseMipLevel, value);}
    public java.lang.foreign.MemorySegment baseMipLevel_ptr() {return this.ptr.asSlice(OFFSET$baseMipLevel, LAYOUT$baseMipLevel);}

    public int levelCount() {return this.ptr.get(LAYOUT$levelCount, OFFSET$levelCount);}
    public void levelCount(int value) {this.ptr.set(LAYOUT$levelCount, OFFSET$levelCount, value);}
    public java.lang.foreign.MemorySegment levelCount_ptr() {return this.ptr.asSlice(OFFSET$levelCount, LAYOUT$levelCount);}

    public int baseArrayLayer() {return this.ptr.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);}
    public void baseArrayLayer(int value) {this.ptr.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);}
    public java.lang.foreign.MemorySegment baseArrayLayer_ptr() {return this.ptr.asSlice(OFFSET$baseArrayLayer, LAYOUT$baseArrayLayer);}

    public int layerCount() {return this.ptr.get(LAYOUT$layerCount, OFFSET$layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT$layerCount, OFFSET$layerCount, value);}
    public java.lang.foreign.MemorySegment layerCount_ptr() {return this.ptr.asSlice(OFFSET$layerCount, LAYOUT$layerCount);}
}

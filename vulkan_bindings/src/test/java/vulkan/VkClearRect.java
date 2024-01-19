package vulkan;

public record VkClearRect(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$rect = vulkan.VkRect2D.gStructLayout;
    public static final long OFFSET$rect = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$baseArrayLayer = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$layerCount = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$rect,
            LAYOUT$baseArrayLayer,
            LAYOUT$layerCount
    ).withName("VkClearRect");

    public VkClearRect(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.VkRect2D rect() {return new vulkan.VkRect2D(this.ptr.asSlice(OFFSET$rect, LAYOUT$rect));}

    public int baseArrayLayer() {return this.ptr.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);}
    public void baseArrayLayer(int value) {this.ptr.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);}
    public java.lang.foreign.MemorySegment baseArrayLayer_ptr() {return this.ptr.asSlice(OFFSET$baseArrayLayer, LAYOUT$baseArrayLayer);}

    public int layerCount() {return this.ptr.get(LAYOUT$layerCount, OFFSET$layerCount);}
    public void layerCount(int value) {this.ptr.set(LAYOUT$layerCount, OFFSET$layerCount, value);}
    public java.lang.foreign.MemorySegment layerCount_ptr() {return this.ptr.asSlice(OFFSET$layerCount, LAYOUT$layerCount);}
}

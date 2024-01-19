package vulkan;

public record VkRectLayerKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$offset = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$offset = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$extent = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$layer = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$offset,
            LAYOUT$extent,
            LAYOUT$layer
    ).withName("VkRectLayerKHR");

    public VkRectLayerKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.VkOffset2D offset() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$offset, LAYOUT$offset));}

    public vulkan.VkExtent2D extent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$extent, LAYOUT$extent));}

    public int layer() {return this.ptr.get(LAYOUT$layer, OFFSET$layer);}
    public void layer(int value) {this.ptr.set(LAYOUT$layer, OFFSET$layer, value);}
    public java.lang.foreign.MemorySegment layer_ptr() {return this.ptr.asSlice(OFFSET$layer, LAYOUT$layer);}
}

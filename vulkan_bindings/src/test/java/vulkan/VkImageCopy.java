package vulkan;

public record VkImageCopy(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$srcSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$srcSubresource = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$srcOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$srcOffset = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
    public static final long OFFSET$dstSubresource = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dstOffset = vulkan.VkOffset3D.gStructLayout;
    public static final long OFFSET$dstOffset = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$extent = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$extent = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$srcSubresource,
            LAYOUT$srcOffset,
            LAYOUT$dstSubresource,
            LAYOUT$dstOffset,
            LAYOUT$extent
    ).withName("VkImageCopy");

    public VkImageCopy(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.VkImageSubresourceLayers srcSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));}

    public vulkan.VkOffset3D srcOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$srcOffset, LAYOUT$srcOffset));}

    public vulkan.VkImageSubresourceLayers dstSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));}

    public vulkan.VkOffset3D dstOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$dstOffset, LAYOUT$dstOffset));}

    public vulkan.VkExtent3D extent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$extent, LAYOUT$extent));}
}

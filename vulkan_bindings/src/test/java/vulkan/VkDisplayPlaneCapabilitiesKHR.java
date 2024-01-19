package vulkan;

public record VkDisplayPlaneCapabilitiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedAlpha = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$supportedAlpha = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minSrcPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$minSrcPosition = 4L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxSrcPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$maxSrcPosition = 12L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minSrcExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minSrcExtent = 20L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxSrcExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxSrcExtent = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minDstPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$minDstPosition = 36L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxDstPosition = vulkan.VkOffset2D.gStructLayout;
    public static final long OFFSET$maxDstPosition = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minDstExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minDstExtent = 52L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxDstExtent = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxDstExtent = 60L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$supportedAlpha,
            LAYOUT$minSrcPosition,
            LAYOUT$maxSrcPosition,
            LAYOUT$minSrcExtent,
            LAYOUT$maxSrcExtent,
            LAYOUT$minDstPosition,
            LAYOUT$maxDstPosition,
            LAYOUT$minDstExtent,
            LAYOUT$maxDstExtent
    ).withName("VkDisplayPlaneCapabilitiesKHR");

    public VkDisplayPlaneCapabilitiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int supportedAlpha() {return this.ptr.get(LAYOUT$supportedAlpha, OFFSET$supportedAlpha);}
    public void supportedAlpha(int value) {this.ptr.set(LAYOUT$supportedAlpha, OFFSET$supportedAlpha, value);}
    public java.lang.foreign.MemorySegment supportedAlpha_ptr() {return this.ptr.asSlice(OFFSET$supportedAlpha, LAYOUT$supportedAlpha);}

    public vulkan.VkOffset2D minSrcPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$minSrcPosition, LAYOUT$minSrcPosition));}

    public vulkan.VkOffset2D maxSrcPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$maxSrcPosition, LAYOUT$maxSrcPosition));}

    public vulkan.VkExtent2D minSrcExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minSrcExtent, LAYOUT$minSrcExtent));}

    public vulkan.VkExtent2D maxSrcExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxSrcExtent, LAYOUT$maxSrcExtent));}

    public vulkan.VkOffset2D minDstPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$minDstPosition, LAYOUT$minDstPosition));}

    public vulkan.VkOffset2D maxDstPosition() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$maxDstPosition, LAYOUT$maxDstPosition));}

    public vulkan.VkExtent2D minDstExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minDstExtent, LAYOUT$minDstExtent));}

    public vulkan.VkExtent2D maxDstExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxDstExtent, LAYOUT$maxDstExtent));}
}

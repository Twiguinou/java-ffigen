package vulkan;

public record VkSparseImageFormatProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$aspectMask = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$imageGranularity = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$imageGranularity = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$aspectMask,
            LAYOUT$imageGranularity,
            LAYOUT$flags
    ).withName("VkSparseImageFormatProperties");

    public VkSparseImageFormatProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int aspectMask() {return this.ptr.get(LAYOUT$aspectMask, OFFSET$aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);}
    public java.lang.foreign.MemorySegment aspectMask_ptr() {return this.ptr.asSlice(OFFSET$aspectMask, LAYOUT$aspectMask);}

    public vulkan.VkExtent3D imageGranularity() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$imageGranularity, LAYOUT$imageGranularity));}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}

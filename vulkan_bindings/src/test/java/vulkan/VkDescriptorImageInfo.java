package vulkan;

public record VkDescriptorImageInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$sampler = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$sampler = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$imageView = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$imageView = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageLayout = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sampler,
            LAYOUT$imageView,
            LAYOUT$imageLayout,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkDescriptorImageInfo");

    public VkDescriptorImageInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment sampler() {return this.ptr.get(LAYOUT$sampler, OFFSET$sampler);}
    public void sampler(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$sampler, OFFSET$sampler, value);}
    public java.lang.foreign.MemorySegment sampler_ptr() {return this.ptr.asSlice(OFFSET$sampler, LAYOUT$sampler);}

    public java.lang.foreign.MemorySegment imageView() {return this.ptr.get(LAYOUT$imageView, OFFSET$imageView);}
    public void imageView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$imageView, OFFSET$imageView, value);}
    public java.lang.foreign.MemorySegment imageView_ptr() {return this.ptr.asSlice(OFFSET$imageView, LAYOUT$imageView);}

    public int imageLayout() {return this.ptr.get(LAYOUT$imageLayout, OFFSET$imageLayout);}
    public void imageLayout(int value) {this.ptr.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);}
    public java.lang.foreign.MemorySegment imageLayout_ptr() {return this.ptr.asSlice(OFFSET$imageLayout, LAYOUT$imageLayout);}
}

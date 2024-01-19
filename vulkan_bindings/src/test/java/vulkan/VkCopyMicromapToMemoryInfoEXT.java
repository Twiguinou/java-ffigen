package vulkan;

public record VkCopyMicromapToMemoryInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$src = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$src = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$dst = vulkan.VkDeviceOrHostAddressKHR.gStructLayout;
    public static final long OFFSET$dst = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mode = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$src,
            LAYOUT$dst,
            LAYOUT$mode,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkCopyMicromapToMemoryInfoEXT");

    public VkCopyMicromapToMemoryInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment src() {return this.ptr.get(LAYOUT$src, OFFSET$src);}
    public void src(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$src, OFFSET$src, value);}
    public java.lang.foreign.MemorySegment src_ptr() {return this.ptr.asSlice(OFFSET$src, LAYOUT$src);}

    public vulkan.VkDeviceOrHostAddressKHR dst() {return new vulkan.VkDeviceOrHostAddressKHR(this.ptr.asSlice(OFFSET$dst, LAYOUT$dst));}

    public int mode() {return this.ptr.get(LAYOUT$mode, OFFSET$mode);}
    public void mode(int value) {this.ptr.set(LAYOUT$mode, OFFSET$mode, value);}
    public java.lang.foreign.MemorySegment mode_ptr() {return this.ptr.asSlice(OFFSET$mode, LAYOUT$mode);}
}

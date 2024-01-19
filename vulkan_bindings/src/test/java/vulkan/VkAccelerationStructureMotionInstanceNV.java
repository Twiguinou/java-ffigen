package vulkan;

public record VkAccelerationStructureMotionInstanceNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$type = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 4L;
    public static final java.lang.foreign.GroupLayout LAYOUT$data = vulkan.VkAccelerationStructureMotionInstanceDataNV.gStructLayout;
    public static final long OFFSET$data = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$type,
            LAYOUT$flags,
            LAYOUT$data
    ).withName("VkAccelerationStructureMotionInstanceNV");

    public VkAccelerationStructureMotionInstanceNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
    public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
    public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public vulkan.VkAccelerationStructureMotionInstanceDataNV data() {return new vulkan.VkAccelerationStructureMotionInstanceDataNV(this.ptr.asSlice(OFFSET$data, LAYOUT$data));}
}

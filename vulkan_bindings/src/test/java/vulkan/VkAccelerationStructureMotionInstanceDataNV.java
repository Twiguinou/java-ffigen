package vulkan;

public record VkAccelerationStructureMotionInstanceDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$staticInstance = vulkan.VkAccelerationStructureInstanceKHR.gStructLayout;
    public static final long OFFSET$staticInstance = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$matrixMotionInstance = vulkan.VkAccelerationStructureMatrixMotionInstanceNV.gStructLayout;
    public static final long OFFSET$matrixMotionInstance = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$srtMotionInstance = vulkan.VkAccelerationStructureSRTMotionInstanceNV.gStructLayout;
    public static final long OFFSET$srtMotionInstance = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$staticInstance,
            LAYOUT$matrixMotionInstance,
            LAYOUT$srtMotionInstance
    ).withName("VkAccelerationStructureMotionInstanceDataNV");

    public VkAccelerationStructureMotionInstanceDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.VkAccelerationStructureInstanceKHR staticInstance() {return new vulkan.VkAccelerationStructureInstanceKHR(this.ptr.asSlice(OFFSET$staticInstance, LAYOUT$staticInstance));}

    public vulkan.VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {return new vulkan.VkAccelerationStructureMatrixMotionInstanceNV(this.ptr.asSlice(OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance));}

    public vulkan.VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {return new vulkan.VkAccelerationStructureSRTMotionInstanceNV(this.ptr.asSlice(OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance));}
}

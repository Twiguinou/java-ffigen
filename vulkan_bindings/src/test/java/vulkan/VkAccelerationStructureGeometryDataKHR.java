package vulkan;

public record VkAccelerationStructureGeometryDataKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$triangles = vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.gStructLayout;
    public static final long OFFSET$triangles = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$aabbs = vulkan.VkAccelerationStructureGeometryAabbsDataKHR.gStructLayout;
    public static final long OFFSET$aabbs = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$instances = vulkan.VkAccelerationStructureGeometryInstancesDataKHR.gStructLayout;
    public static final long OFFSET$instances = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$triangles,
            LAYOUT$aabbs,
            LAYOUT$instances
    ).withName("VkAccelerationStructureGeometryDataKHR");

    public VkAccelerationStructureGeometryDataKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.VkAccelerationStructureGeometryTrianglesDataKHR triangles() {return new vulkan.VkAccelerationStructureGeometryTrianglesDataKHR(this.ptr.asSlice(OFFSET$triangles, LAYOUT$triangles));}

    public vulkan.VkAccelerationStructureGeometryAabbsDataKHR aabbs() {return new vulkan.VkAccelerationStructureGeometryAabbsDataKHR(this.ptr.asSlice(OFFSET$aabbs, LAYOUT$aabbs));}

    public vulkan.VkAccelerationStructureGeometryInstancesDataKHR instances() {return new vulkan.VkAccelerationStructureGeometryInstancesDataKHR(this.ptr.asSlice(OFFSET$instances, LAYOUT$instances));}
}

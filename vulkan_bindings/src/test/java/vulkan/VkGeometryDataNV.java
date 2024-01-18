package vulkan;

public record VkGeometryDataNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$triangles = vulkan.VkGeometryTrianglesNV.gStructLayout;
	public static final long OFFSET$triangles = 0L;
	public static final java.lang.foreign.GroupLayout LAYOUT$aabbs = vulkan.VkGeometryAABBNV.gStructLayout;
	public static final long OFFSET$aabbs = 96L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$triangles,
			LAYOUT$aabbs
	).withName("VkGeometryDataNV");

	public VkGeometryDataNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.VkGeometryTrianglesNV triangles() {return new vulkan.VkGeometryTrianglesNV(this.ptr.asSlice(OFFSET$triangles, LAYOUT$triangles));}

	public vulkan.VkGeometryAABBNV aabbs() {return new vulkan.VkGeometryAABBNV(this.ptr.asSlice(OFFSET$aabbs, LAYOUT$aabbs));}
}

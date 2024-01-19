package vulkan;

public record VkAccelerationStructureGeometryTrianglesDataKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexFormat = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexFormat = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$vertexData = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$vertexData = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$vertexStride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$vertexStride = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxVertex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxVertex = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$indexType = 44L;
	public static final java.lang.foreign.GroupLayout LAYOUT$indexData = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$indexData = 48L;
	public static final java.lang.foreign.GroupLayout LAYOUT$transformData = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$transformData = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$vertexFormat,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$vertexData,
			LAYOUT$vertexStride,
			LAYOUT$maxVertex,
			LAYOUT$indexType,
			LAYOUT$indexData,
			LAYOUT$transformData
	).withName("VkAccelerationStructureGeometryTrianglesDataKHR");

	public VkAccelerationStructureGeometryTrianglesDataKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int vertexFormat() {return this.ptr.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);}
	public void vertexFormat(int value) {this.ptr.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);}
	public java.lang.foreign.MemorySegment vertexFormat_ptr() {return this.ptr.asSlice(OFFSET$vertexFormat, LAYOUT$vertexFormat);}

	public vulkan.VkDeviceOrHostAddressConstKHR vertexData() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$vertexData, LAYOUT$vertexData));}

	public long vertexStride() {return this.ptr.get(LAYOUT$vertexStride, OFFSET$vertexStride);}
	public void vertexStride(long value) {this.ptr.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);}
	public java.lang.foreign.MemorySegment vertexStride_ptr() {return this.ptr.asSlice(OFFSET$vertexStride, LAYOUT$vertexStride);}

	public int maxVertex() {return this.ptr.get(LAYOUT$maxVertex, OFFSET$maxVertex);}
	public void maxVertex(int value) {this.ptr.set(LAYOUT$maxVertex, OFFSET$maxVertex, value);}
	public java.lang.foreign.MemorySegment maxVertex_ptr() {return this.ptr.asSlice(OFFSET$maxVertex, LAYOUT$maxVertex);}

	public int indexType() {return this.ptr.get(LAYOUT$indexType, OFFSET$indexType);}
	public void indexType(int value) {this.ptr.set(LAYOUT$indexType, OFFSET$indexType, value);}
	public java.lang.foreign.MemorySegment indexType_ptr() {return this.ptr.asSlice(OFFSET$indexType, LAYOUT$indexType);}

	public vulkan.VkDeviceOrHostAddressConstKHR indexData() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$indexData, LAYOUT$indexData));}

	public vulkan.VkDeviceOrHostAddressConstKHR transformData() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$transformData, LAYOUT$transformData));}
}

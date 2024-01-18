package vulkan;

public record VkAccelerationStructureTrianglesOpacityMicromapEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$indexType = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$indexBuffer = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$indexBuffer = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$indexStride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$indexStride = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$baseTriangle = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$baseTriangle = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$usageCountsCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$usageCountsCount = 44L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pUsageCounts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pUsageCounts = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$ppUsageCounts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$ppUsageCounts = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$micromap = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$micromap = 64L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$indexType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$indexBuffer,
			LAYOUT$indexStride,
			LAYOUT$baseTriangle,
			LAYOUT$usageCountsCount,
			LAYOUT$pUsageCounts,
			LAYOUT$ppUsageCounts,
			LAYOUT$micromap
	).withName("VkAccelerationStructureTrianglesOpacityMicromapEXT");

	public VkAccelerationStructureTrianglesOpacityMicromapEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int indexType() {return this.ptr.get(LAYOUT$indexType, OFFSET$indexType);}
	public void indexType(int value) {this.ptr.set(LAYOUT$indexType, OFFSET$indexType, value);}
	public java.lang.foreign.MemorySegment indexType_ptr() {return this.ptr.asSlice(OFFSET$indexType, LAYOUT$indexType);}

	public vulkan.VkDeviceOrHostAddressConstKHR indexBuffer() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$indexBuffer, LAYOUT$indexBuffer));}

	public long indexStride() {return this.ptr.get(LAYOUT$indexStride, OFFSET$indexStride);}
	public void indexStride(long value) {this.ptr.set(LAYOUT$indexStride, OFFSET$indexStride, value);}
	public java.lang.foreign.MemorySegment indexStride_ptr() {return this.ptr.asSlice(OFFSET$indexStride, LAYOUT$indexStride);}

	public int baseTriangle() {return this.ptr.get(LAYOUT$baseTriangle, OFFSET$baseTriangle);}
	public void baseTriangle(int value) {this.ptr.set(LAYOUT$baseTriangle, OFFSET$baseTriangle, value);}
	public java.lang.foreign.MemorySegment baseTriangle_ptr() {return this.ptr.asSlice(OFFSET$baseTriangle, LAYOUT$baseTriangle);}

	public int usageCountsCount() {return this.ptr.get(LAYOUT$usageCountsCount, OFFSET$usageCountsCount);}
	public void usageCountsCount(int value) {this.ptr.set(LAYOUT$usageCountsCount, OFFSET$usageCountsCount, value);}
	public java.lang.foreign.MemorySegment usageCountsCount_ptr() {return this.ptr.asSlice(OFFSET$usageCountsCount, LAYOUT$usageCountsCount);}

	public java.lang.foreign.MemorySegment pUsageCounts() {return this.ptr.get(LAYOUT$pUsageCounts, OFFSET$pUsageCounts);}
	public void pUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUsageCounts, OFFSET$pUsageCounts, value);}
	public java.lang.foreign.MemorySegment pUsageCounts_ptr() {return this.ptr.asSlice(OFFSET$pUsageCounts, LAYOUT$pUsageCounts);}

	public java.lang.foreign.MemorySegment ppUsageCounts() {return this.ptr.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);}
	public void ppUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);}
	public java.lang.foreign.MemorySegment ppUsageCounts_ptr() {return this.ptr.asSlice(OFFSET$ppUsageCounts, LAYOUT$ppUsageCounts);}

	public java.lang.foreign.MemorySegment micromap() {return this.ptr.get(LAYOUT$micromap, OFFSET$micromap);}
	public void micromap(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$micromap, OFFSET$micromap, value);}
	public java.lang.foreign.MemorySegment micromap_ptr() {return this.ptr.asSlice(OFFSET$micromap, LAYOUT$micromap);}
}

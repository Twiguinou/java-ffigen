package vulkan;

public record VkMicromapBuildInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$type = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$mode = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$dstMicromap = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$dstMicromap = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$usageCountsCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$usageCountsCount = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pUsageCounts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pUsageCounts = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$ppUsageCounts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$ppUsageCounts = 56L;
	public static final java.lang.foreign.GroupLayout LAYOUT$data = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$data = 64L;
	public static final java.lang.foreign.GroupLayout LAYOUT$scratchData = vulkan.VkDeviceOrHostAddressKHR.gStructLayout;
	public static final long OFFSET$scratchData = 72L;
	public static final java.lang.foreign.GroupLayout LAYOUT$triangleArray = vulkan.VkDeviceOrHostAddressConstKHR.gStructLayout;
	public static final long OFFSET$triangleArray = 80L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$triangleArrayStride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$triangleArrayStride = 88L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$type,
			LAYOUT$flags,
			LAYOUT$mode,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$dstMicromap,
			LAYOUT$usageCountsCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pUsageCounts,
			LAYOUT$ppUsageCounts,
			LAYOUT$data,
			LAYOUT$scratchData,
			LAYOUT$triangleArray,
			LAYOUT$triangleArrayStride
	).withName("VkMicromapBuildInfoEXT");

	public VkMicromapBuildInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
	public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
	public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public int mode() {return this.ptr.get(LAYOUT$mode, OFFSET$mode);}
	public void mode(int value) {this.ptr.set(LAYOUT$mode, OFFSET$mode, value);}
	public java.lang.foreign.MemorySegment mode_ptr() {return this.ptr.asSlice(OFFSET$mode, LAYOUT$mode);}

	public java.lang.foreign.MemorySegment dstMicromap() {return this.ptr.get(LAYOUT$dstMicromap, OFFSET$dstMicromap);}
	public void dstMicromap(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstMicromap, OFFSET$dstMicromap, value);}
	public java.lang.foreign.MemorySegment dstMicromap_ptr() {return this.ptr.asSlice(OFFSET$dstMicromap, LAYOUT$dstMicromap);}

	public int usageCountsCount() {return this.ptr.get(LAYOUT$usageCountsCount, OFFSET$usageCountsCount);}
	public void usageCountsCount(int value) {this.ptr.set(LAYOUT$usageCountsCount, OFFSET$usageCountsCount, value);}
	public java.lang.foreign.MemorySegment usageCountsCount_ptr() {return this.ptr.asSlice(OFFSET$usageCountsCount, LAYOUT$usageCountsCount);}

	public java.lang.foreign.MemorySegment pUsageCounts() {return this.ptr.get(LAYOUT$pUsageCounts, OFFSET$pUsageCounts);}
	public void pUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pUsageCounts, OFFSET$pUsageCounts, value);}
	public java.lang.foreign.MemorySegment pUsageCounts_ptr() {return this.ptr.asSlice(OFFSET$pUsageCounts, LAYOUT$pUsageCounts);}

	public java.lang.foreign.MemorySegment ppUsageCounts() {return this.ptr.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);}
	public void ppUsageCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);}
	public java.lang.foreign.MemorySegment ppUsageCounts_ptr() {return this.ptr.asSlice(OFFSET$ppUsageCounts, LAYOUT$ppUsageCounts);}

	public vulkan.VkDeviceOrHostAddressConstKHR data() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$data, LAYOUT$data));}

	public vulkan.VkDeviceOrHostAddressKHR scratchData() {return new vulkan.VkDeviceOrHostAddressKHR(this.ptr.asSlice(OFFSET$scratchData, LAYOUT$scratchData));}

	public vulkan.VkDeviceOrHostAddressConstKHR triangleArray() {return new vulkan.VkDeviceOrHostAddressConstKHR(this.ptr.asSlice(OFFSET$triangleArray, LAYOUT$triangleArray));}

	public long triangleArrayStride() {return this.ptr.get(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride);}
	public void triangleArrayStride(long value) {this.ptr.set(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride, value);}
	public java.lang.foreign.MemorySegment triangleArrayStride_ptr() {return this.ptr.asSlice(OFFSET$triangleArrayStride, LAYOUT$triangleArrayStride);}
}

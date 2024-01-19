package vulkan;

public record VkAccelerationStructureBuildGeometryInfoKHR(java.lang.foreign.MemorySegment ptr)
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
	public static final java.lang.foreign.AddressLayout LAYOUT$srcAccelerationStructure = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$srcAccelerationStructure = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$dstAccelerationStructure = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$dstAccelerationStructure = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$geometryCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$geometryCount = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pGeometries = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pGeometries = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$ppGeometries = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$ppGeometries = 64L;
	public static final java.lang.foreign.GroupLayout LAYOUT$scratchData = vulkan.VkDeviceOrHostAddressKHR.gStructLayout;
	public static final long OFFSET$scratchData = 72L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$type,
			LAYOUT$flags,
			LAYOUT$mode,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$srcAccelerationStructure,
			LAYOUT$dstAccelerationStructure,
			LAYOUT$geometryCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pGeometries,
			LAYOUT$ppGeometries,
			LAYOUT$scratchData
	).withName("VkAccelerationStructureBuildGeometryInfoKHR");

	public VkAccelerationStructureBuildGeometryInfoKHR(java.lang.foreign.SegmentAllocator allocator)
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

	public java.lang.foreign.MemorySegment srcAccelerationStructure() {return this.ptr.get(LAYOUT$srcAccelerationStructure, OFFSET$srcAccelerationStructure);}
	public void srcAccelerationStructure(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$srcAccelerationStructure, OFFSET$srcAccelerationStructure, value);}
	public java.lang.foreign.MemorySegment srcAccelerationStructure_ptr() {return this.ptr.asSlice(OFFSET$srcAccelerationStructure, LAYOUT$srcAccelerationStructure);}

	public java.lang.foreign.MemorySegment dstAccelerationStructure() {return this.ptr.get(LAYOUT$dstAccelerationStructure, OFFSET$dstAccelerationStructure);}
	public void dstAccelerationStructure(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstAccelerationStructure, OFFSET$dstAccelerationStructure, value);}
	public java.lang.foreign.MemorySegment dstAccelerationStructure_ptr() {return this.ptr.asSlice(OFFSET$dstAccelerationStructure, LAYOUT$dstAccelerationStructure);}

	public int geometryCount() {return this.ptr.get(LAYOUT$geometryCount, OFFSET$geometryCount);}
	public void geometryCount(int value) {this.ptr.set(LAYOUT$geometryCount, OFFSET$geometryCount, value);}
	public java.lang.foreign.MemorySegment geometryCount_ptr() {return this.ptr.asSlice(OFFSET$geometryCount, LAYOUT$geometryCount);}

	public java.lang.foreign.MemorySegment pGeometries() {return this.ptr.get(LAYOUT$pGeometries, OFFSET$pGeometries);}
	public void pGeometries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pGeometries, OFFSET$pGeometries, value);}
	public java.lang.foreign.MemorySegment pGeometries_ptr() {return this.ptr.asSlice(OFFSET$pGeometries, LAYOUT$pGeometries);}

	public java.lang.foreign.MemorySegment ppGeometries() {return this.ptr.get(LAYOUT$ppGeometries, OFFSET$ppGeometries);}
	public void ppGeometries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ppGeometries, OFFSET$ppGeometries, value);}
	public java.lang.foreign.MemorySegment ppGeometries_ptr() {return this.ptr.asSlice(OFFSET$ppGeometries, LAYOUT$ppGeometries);}

	public vulkan.VkDeviceOrHostAddressKHR scratchData() {return new vulkan.VkDeviceOrHostAddressKHR(this.ptr.asSlice(OFFSET$scratchData, LAYOUT$scratchData));}
}

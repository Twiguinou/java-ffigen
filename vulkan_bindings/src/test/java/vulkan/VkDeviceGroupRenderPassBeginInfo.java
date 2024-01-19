package vulkan;

public record VkDeviceGroupRenderPassBeginInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$deviceMask = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceRenderAreaCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$deviceRenderAreaCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDeviceRenderAreas = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDeviceRenderAreas = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$deviceMask,
			LAYOUT$deviceRenderAreaCount,
			LAYOUT$pDeviceRenderAreas
	).withName("VkDeviceGroupRenderPassBeginInfo");

	public VkDeviceGroupRenderPassBeginInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int deviceMask() {return this.ptr.get(LAYOUT$deviceMask, OFFSET$deviceMask);}
	public void deviceMask(int value) {this.ptr.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);}
	public java.lang.foreign.MemorySegment deviceMask_ptr() {return this.ptr.asSlice(OFFSET$deviceMask, LAYOUT$deviceMask);}

	public int deviceRenderAreaCount() {return this.ptr.get(LAYOUT$deviceRenderAreaCount, OFFSET$deviceRenderAreaCount);}
	public void deviceRenderAreaCount(int value) {this.ptr.set(LAYOUT$deviceRenderAreaCount, OFFSET$deviceRenderAreaCount, value);}
	public java.lang.foreign.MemorySegment deviceRenderAreaCount_ptr() {return this.ptr.asSlice(OFFSET$deviceRenderAreaCount, LAYOUT$deviceRenderAreaCount);}

	public java.lang.foreign.MemorySegment pDeviceRenderAreas() {return this.ptr.get(LAYOUT$pDeviceRenderAreas, OFFSET$pDeviceRenderAreas);}
	public void pDeviceRenderAreas(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDeviceRenderAreas, OFFSET$pDeviceRenderAreas, value);}
	public java.lang.foreign.MemorySegment pDeviceRenderAreas_ptr() {return this.ptr.asSlice(OFFSET$pDeviceRenderAreas, LAYOUT$pDeviceRenderAreas);}
}

package vulkan;

public record VkDeviceGroupSubmitInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$waitSemaphoreCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pWaitSemaphoreDeviceIndices = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pWaitSemaphoreDeviceIndices = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$commandBufferCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$commandBufferCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCommandBufferDeviceMasks = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCommandBufferDeviceMasks = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$signalSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$signalSemaphoreCount = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSignalSemaphoreDeviceIndices = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSignalSemaphoreDeviceIndices = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$waitSemaphoreCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pWaitSemaphoreDeviceIndices,
			LAYOUT$commandBufferCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pCommandBufferDeviceMasks,
			LAYOUT$signalSemaphoreCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pSignalSemaphoreDeviceIndices
	).withName("VkDeviceGroupSubmitInfo");

	public VkDeviceGroupSubmitInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int waitSemaphoreCount() {return this.ptr.get(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount);}
	public void waitSemaphoreCount(int value) {this.ptr.set(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount, value);}
	public java.lang.foreign.MemorySegment waitSemaphoreCount_ptr() {return this.ptr.asSlice(OFFSET$waitSemaphoreCount, LAYOUT$waitSemaphoreCount);}

	public java.lang.foreign.MemorySegment pWaitSemaphoreDeviceIndices() {return this.ptr.get(LAYOUT$pWaitSemaphoreDeviceIndices, OFFSET$pWaitSemaphoreDeviceIndices);}
	public void pWaitSemaphoreDeviceIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWaitSemaphoreDeviceIndices, OFFSET$pWaitSemaphoreDeviceIndices, value);}
	public java.lang.foreign.MemorySegment pWaitSemaphoreDeviceIndices_ptr() {return this.ptr.asSlice(OFFSET$pWaitSemaphoreDeviceIndices, LAYOUT$pWaitSemaphoreDeviceIndices);}

	public int commandBufferCount() {return this.ptr.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);}
	public void commandBufferCount(int value) {this.ptr.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);}
	public java.lang.foreign.MemorySegment commandBufferCount_ptr() {return this.ptr.asSlice(OFFSET$commandBufferCount, LAYOUT$commandBufferCount);}

	public java.lang.foreign.MemorySegment pCommandBufferDeviceMasks() {return this.ptr.get(LAYOUT$pCommandBufferDeviceMasks, OFFSET$pCommandBufferDeviceMasks);}
	public void pCommandBufferDeviceMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCommandBufferDeviceMasks, OFFSET$pCommandBufferDeviceMasks, value);}
	public java.lang.foreign.MemorySegment pCommandBufferDeviceMasks_ptr() {return this.ptr.asSlice(OFFSET$pCommandBufferDeviceMasks, LAYOUT$pCommandBufferDeviceMasks);}

	public int signalSemaphoreCount() {return this.ptr.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);}
	public void signalSemaphoreCount(int value) {this.ptr.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);}
	public java.lang.foreign.MemorySegment signalSemaphoreCount_ptr() {return this.ptr.asSlice(OFFSET$signalSemaphoreCount, LAYOUT$signalSemaphoreCount);}

	public java.lang.foreign.MemorySegment pSignalSemaphoreDeviceIndices() {return this.ptr.get(LAYOUT$pSignalSemaphoreDeviceIndices, OFFSET$pSignalSemaphoreDeviceIndices);}
	public void pSignalSemaphoreDeviceIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSignalSemaphoreDeviceIndices, OFFSET$pSignalSemaphoreDeviceIndices, value);}
	public java.lang.foreign.MemorySegment pSignalSemaphoreDeviceIndices_ptr() {return this.ptr.asSlice(OFFSET$pSignalSemaphoreDeviceIndices, LAYOUT$pSignalSemaphoreDeviceIndices);}
}

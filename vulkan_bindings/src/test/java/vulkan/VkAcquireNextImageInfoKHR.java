package vulkan;

public record VkAcquireNextImageInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$swapchain = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$swapchain = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$timeout = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$timeout = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$semaphore = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$semaphore = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$fence = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$fence = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$deviceMask = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$swapchain,
			LAYOUT$timeout,
			LAYOUT$semaphore,
			LAYOUT$fence,
			LAYOUT$deviceMask,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkAcquireNextImageInfoKHR");

	public VkAcquireNextImageInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment swapchain() {return this.ptr.get(LAYOUT$swapchain, OFFSET$swapchain);}
	public void swapchain(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$swapchain, OFFSET$swapchain, value);}
	public java.lang.foreign.MemorySegment swapchain_ptr() {return this.ptr.asSlice(OFFSET$swapchain, LAYOUT$swapchain);}

	public long timeout() {return this.ptr.get(LAYOUT$timeout, OFFSET$timeout);}
	public void timeout(long value) {this.ptr.set(LAYOUT$timeout, OFFSET$timeout, value);}
	public java.lang.foreign.MemorySegment timeout_ptr() {return this.ptr.asSlice(OFFSET$timeout, LAYOUT$timeout);}

	public java.lang.foreign.MemorySegment semaphore() {return this.ptr.get(LAYOUT$semaphore, OFFSET$semaphore);}
	public void semaphore(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$semaphore, OFFSET$semaphore, value);}
	public java.lang.foreign.MemorySegment semaphore_ptr() {return this.ptr.asSlice(OFFSET$semaphore, LAYOUT$semaphore);}

	public java.lang.foreign.MemorySegment fence() {return this.ptr.get(LAYOUT$fence, OFFSET$fence);}
	public void fence(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$fence, OFFSET$fence, value);}
	public java.lang.foreign.MemorySegment fence_ptr() {return this.ptr.asSlice(OFFSET$fence, LAYOUT$fence);}

	public int deviceMask() {return this.ptr.get(LAYOUT$deviceMask, OFFSET$deviceMask);}
	public void deviceMask(int value) {this.ptr.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);}
	public java.lang.foreign.MemorySegment deviceMask_ptr() {return this.ptr.asSlice(OFFSET$deviceMask, LAYOUT$deviceMask);}
}

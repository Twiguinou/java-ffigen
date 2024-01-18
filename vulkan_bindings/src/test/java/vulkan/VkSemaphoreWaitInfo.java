package vulkan;

public record VkSemaphoreWaitInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$semaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$semaphoreCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSemaphores = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSemaphores = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pValues = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pValues = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$semaphoreCount,
			LAYOUT$pSemaphores,
			LAYOUT$pValues
	).withName("VkSemaphoreWaitInfo");

	public VkSemaphoreWaitInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public int semaphoreCount() {return this.ptr.get(LAYOUT$semaphoreCount, OFFSET$semaphoreCount);}
	public void semaphoreCount(int value) {this.ptr.set(LAYOUT$semaphoreCount, OFFSET$semaphoreCount, value);}
	public java.lang.foreign.MemorySegment semaphoreCount_ptr() {return this.ptr.asSlice(OFFSET$semaphoreCount, LAYOUT$semaphoreCount);}

	public java.lang.foreign.MemorySegment pSemaphores() {return this.ptr.get(LAYOUT$pSemaphores, OFFSET$pSemaphores);}
	public void pSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSemaphores, OFFSET$pSemaphores, value);}
	public java.lang.foreign.MemorySegment pSemaphores_ptr() {return this.ptr.asSlice(OFFSET$pSemaphores, LAYOUT$pSemaphores);}

	public java.lang.foreign.MemorySegment pValues() {return this.ptr.get(LAYOUT$pValues, OFFSET$pValues);}
	public void pValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pValues, OFFSET$pValues, value);}
	public java.lang.foreign.MemorySegment pValues_ptr() {return this.ptr.asSlice(OFFSET$pValues, LAYOUT$pValues);}
}

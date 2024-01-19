package vulkan;

public record VkBindSparseInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$waitSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$waitSemaphoreCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pWaitSemaphores = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pWaitSemaphores = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferBindCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$bufferBindCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pBufferBinds = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pBufferBinds = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageOpaqueBindCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageOpaqueBindCount = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pImageOpaqueBinds = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pImageOpaqueBinds = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageBindCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageBindCount = 64L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pImageBinds = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pImageBinds = 72L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$signalSemaphoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$signalSemaphoreCount = 80L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSignalSemaphores = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSignalSemaphores = 88L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$waitSemaphoreCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pWaitSemaphores,
			LAYOUT$bufferBindCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pBufferBinds,
			LAYOUT$imageOpaqueBindCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pImageOpaqueBinds,
			LAYOUT$imageBindCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pImageBinds,
			LAYOUT$signalSemaphoreCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pSignalSemaphores
	).withName("VkBindSparseInfo");

	public VkBindSparseInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public java.lang.foreign.MemorySegment pWaitSemaphores() {return this.ptr.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);}
	public void pWaitSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);}
	public java.lang.foreign.MemorySegment pWaitSemaphores_ptr() {return this.ptr.asSlice(OFFSET$pWaitSemaphores, LAYOUT$pWaitSemaphores);}

	public int bufferBindCount() {return this.ptr.get(LAYOUT$bufferBindCount, OFFSET$bufferBindCount);}
	public void bufferBindCount(int value) {this.ptr.set(LAYOUT$bufferBindCount, OFFSET$bufferBindCount, value);}
	public java.lang.foreign.MemorySegment bufferBindCount_ptr() {return this.ptr.asSlice(OFFSET$bufferBindCount, LAYOUT$bufferBindCount);}

	public java.lang.foreign.MemorySegment pBufferBinds() {return this.ptr.get(LAYOUT$pBufferBinds, OFFSET$pBufferBinds);}
	public void pBufferBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBufferBinds, OFFSET$pBufferBinds, value);}
	public java.lang.foreign.MemorySegment pBufferBinds_ptr() {return this.ptr.asSlice(OFFSET$pBufferBinds, LAYOUT$pBufferBinds);}

	public int imageOpaqueBindCount() {return this.ptr.get(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount);}
	public void imageOpaqueBindCount(int value) {this.ptr.set(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount, value);}
	public java.lang.foreign.MemorySegment imageOpaqueBindCount_ptr() {return this.ptr.asSlice(OFFSET$imageOpaqueBindCount, LAYOUT$imageOpaqueBindCount);}

	public java.lang.foreign.MemorySegment pImageOpaqueBinds() {return this.ptr.get(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds);}
	public void pImageOpaqueBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds, value);}
	public java.lang.foreign.MemorySegment pImageOpaqueBinds_ptr() {return this.ptr.asSlice(OFFSET$pImageOpaqueBinds, LAYOUT$pImageOpaqueBinds);}

	public int imageBindCount() {return this.ptr.get(LAYOUT$imageBindCount, OFFSET$imageBindCount);}
	public void imageBindCount(int value) {this.ptr.set(LAYOUT$imageBindCount, OFFSET$imageBindCount, value);}
	public java.lang.foreign.MemorySegment imageBindCount_ptr() {return this.ptr.asSlice(OFFSET$imageBindCount, LAYOUT$imageBindCount);}

	public java.lang.foreign.MemorySegment pImageBinds() {return this.ptr.get(LAYOUT$pImageBinds, OFFSET$pImageBinds);}
	public void pImageBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pImageBinds, OFFSET$pImageBinds, value);}
	public java.lang.foreign.MemorySegment pImageBinds_ptr() {return this.ptr.asSlice(OFFSET$pImageBinds, LAYOUT$pImageBinds);}

	public int signalSemaphoreCount() {return this.ptr.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);}
	public void signalSemaphoreCount(int value) {this.ptr.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);}
	public java.lang.foreign.MemorySegment signalSemaphoreCount_ptr() {return this.ptr.asSlice(OFFSET$signalSemaphoreCount, LAYOUT$signalSemaphoreCount);}

	public java.lang.foreign.MemorySegment pSignalSemaphores() {return this.ptr.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);}
	public void pSignalSemaphores(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);}
	public java.lang.foreign.MemorySegment pSignalSemaphores_ptr() {return this.ptr.asSlice(OFFSET$pSignalSemaphores, LAYOUT$pSignalSemaphores);}
}

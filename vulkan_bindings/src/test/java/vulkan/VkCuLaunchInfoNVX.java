package vulkan;

public record VkCuLaunchInfoNVX(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$function = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$function = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$gridDimX = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$gridDimX = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$gridDimY = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$gridDimY = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$gridDimZ = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$gridDimZ = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blockDimX = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$blockDimX = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blockDimY = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$blockDimY = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blockDimZ = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$blockDimZ = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sharedMemBytes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sharedMemBytes = 48L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$paramCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$paramCount = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pParams = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pParams = 64L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$extraCount = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$extraCount = 72L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pExtras = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pExtras = 80L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$function,
			LAYOUT$gridDimX,
			LAYOUT$gridDimY,
			LAYOUT$gridDimZ,
			LAYOUT$blockDimX,
			LAYOUT$blockDimY,
			LAYOUT$blockDimZ,
			LAYOUT$sharedMemBytes,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$paramCount,
			LAYOUT$pParams,
			LAYOUT$extraCount,
			LAYOUT$pExtras
	).withName("VkCuLaunchInfoNVX");

	public VkCuLaunchInfoNVX(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment function() {return this.ptr.get(LAYOUT$function, OFFSET$function);}
	public void function(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$function, OFFSET$function, value);}
	public java.lang.foreign.MemorySegment function_ptr() {return this.ptr.asSlice(OFFSET$function, LAYOUT$function);}

	public int gridDimX() {return this.ptr.get(LAYOUT$gridDimX, OFFSET$gridDimX);}
	public void gridDimX(int value) {this.ptr.set(LAYOUT$gridDimX, OFFSET$gridDimX, value);}
	public java.lang.foreign.MemorySegment gridDimX_ptr() {return this.ptr.asSlice(OFFSET$gridDimX, LAYOUT$gridDimX);}

	public int gridDimY() {return this.ptr.get(LAYOUT$gridDimY, OFFSET$gridDimY);}
	public void gridDimY(int value) {this.ptr.set(LAYOUT$gridDimY, OFFSET$gridDimY, value);}
	public java.lang.foreign.MemorySegment gridDimY_ptr() {return this.ptr.asSlice(OFFSET$gridDimY, LAYOUT$gridDimY);}

	public int gridDimZ() {return this.ptr.get(LAYOUT$gridDimZ, OFFSET$gridDimZ);}
	public void gridDimZ(int value) {this.ptr.set(LAYOUT$gridDimZ, OFFSET$gridDimZ, value);}
	public java.lang.foreign.MemorySegment gridDimZ_ptr() {return this.ptr.asSlice(OFFSET$gridDimZ, LAYOUT$gridDimZ);}

	public int blockDimX() {return this.ptr.get(LAYOUT$blockDimX, OFFSET$blockDimX);}
	public void blockDimX(int value) {this.ptr.set(LAYOUT$blockDimX, OFFSET$blockDimX, value);}
	public java.lang.foreign.MemorySegment blockDimX_ptr() {return this.ptr.asSlice(OFFSET$blockDimX, LAYOUT$blockDimX);}

	public int blockDimY() {return this.ptr.get(LAYOUT$blockDimY, OFFSET$blockDimY);}
	public void blockDimY(int value) {this.ptr.set(LAYOUT$blockDimY, OFFSET$blockDimY, value);}
	public java.lang.foreign.MemorySegment blockDimY_ptr() {return this.ptr.asSlice(OFFSET$blockDimY, LAYOUT$blockDimY);}

	public int blockDimZ() {return this.ptr.get(LAYOUT$blockDimZ, OFFSET$blockDimZ);}
	public void blockDimZ(int value) {this.ptr.set(LAYOUT$blockDimZ, OFFSET$blockDimZ, value);}
	public java.lang.foreign.MemorySegment blockDimZ_ptr() {return this.ptr.asSlice(OFFSET$blockDimZ, LAYOUT$blockDimZ);}

	public int sharedMemBytes() {return this.ptr.get(LAYOUT$sharedMemBytes, OFFSET$sharedMemBytes);}
	public void sharedMemBytes(int value) {this.ptr.set(LAYOUT$sharedMemBytes, OFFSET$sharedMemBytes, value);}
	public java.lang.foreign.MemorySegment sharedMemBytes_ptr() {return this.ptr.asSlice(OFFSET$sharedMemBytes, LAYOUT$sharedMemBytes);}

	public long paramCount() {return this.ptr.get(LAYOUT$paramCount, OFFSET$paramCount);}
	public void paramCount(long value) {this.ptr.set(LAYOUT$paramCount, OFFSET$paramCount, value);}
	public java.lang.foreign.MemorySegment paramCount_ptr() {return this.ptr.asSlice(OFFSET$paramCount, LAYOUT$paramCount);}

	public java.lang.foreign.MemorySegment pParams() {return this.ptr.get(LAYOUT$pParams, OFFSET$pParams);}
	public void pParams(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pParams, OFFSET$pParams, value);}
	public java.lang.foreign.MemorySegment pParams_ptr() {return this.ptr.asSlice(OFFSET$pParams, LAYOUT$pParams);}

	public long extraCount() {return this.ptr.get(LAYOUT$extraCount, OFFSET$extraCount);}
	public void extraCount(long value) {this.ptr.set(LAYOUT$extraCount, OFFSET$extraCount, value);}
	public java.lang.foreign.MemorySegment extraCount_ptr() {return this.ptr.asSlice(OFFSET$extraCount, LAYOUT$extraCount);}

	public java.lang.foreign.MemorySegment pExtras() {return this.ptr.get(LAYOUT$pExtras, OFFSET$pExtras);}
	public void pExtras(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pExtras, OFFSET$pExtras, value);}
	public java.lang.foreign.MemorySegment pExtras_ptr() {return this.ptr.asSlice(OFFSET$pExtras, LAYOUT$pExtras);}
}

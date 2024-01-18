package vulkan;

public record VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$shaderCoreMask = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$shaderCoreMask = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderCoreCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderCoreCount = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderWarpsPerCore = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderWarpsPerCore = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderCoreMask,
			LAYOUT$shaderCoreCount,
			LAYOUT$shaderWarpsPerCore
	).withName("VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM");

	public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public long shaderCoreMask() {return this.ptr.get(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask);}
	public void shaderCoreMask(long value) {this.ptr.set(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask, value);}
	public java.lang.foreign.MemorySegment shaderCoreMask_ptr() {return this.ptr.asSlice(OFFSET$shaderCoreMask, LAYOUT$shaderCoreMask);}

	public int shaderCoreCount() {return this.ptr.get(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount);}
	public void shaderCoreCount(int value) {this.ptr.set(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount, value);}
	public java.lang.foreign.MemorySegment shaderCoreCount_ptr() {return this.ptr.asSlice(OFFSET$shaderCoreCount, LAYOUT$shaderCoreCount);}

	public int shaderWarpsPerCore() {return this.ptr.get(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore);}
	public void shaderWarpsPerCore(int value) {this.ptr.set(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore, value);}
	public java.lang.foreign.MemorySegment shaderWarpsPerCore_ptr() {return this.ptr.asSlice(OFFSET$shaderWarpsPerCore, LAYOUT$shaderWarpsPerCore);}
}

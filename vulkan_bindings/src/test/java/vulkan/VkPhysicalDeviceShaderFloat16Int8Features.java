package vulkan;

public record VkPhysicalDeviceShaderFloat16Int8Features(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderFloat16 = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInt8 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderInt8 = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderFloat16,
			LAYOUT$shaderInt8
	).withName("VkPhysicalDeviceShaderFloat16Int8Features");

	public VkPhysicalDeviceShaderFloat16Int8Features(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int shaderFloat16() {return this.ptr.get(LAYOUT$shaderFloat16, OFFSET$shaderFloat16);}
	public void shaderFloat16(int value) {this.ptr.set(LAYOUT$shaderFloat16, OFFSET$shaderFloat16, value);}
	public java.lang.foreign.MemorySegment shaderFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderFloat16, LAYOUT$shaderFloat16);}

	public int shaderInt8() {return this.ptr.get(LAYOUT$shaderInt8, OFFSET$shaderInt8);}
	public void shaderInt8(int value) {this.ptr.set(LAYOUT$shaderInt8, OFFSET$shaderInt8, value);}
	public java.lang.foreign.MemorySegment shaderInt8_ptr() {return this.ptr.asSlice(OFFSET$shaderInt8, LAYOUT$shaderInt8);}
}

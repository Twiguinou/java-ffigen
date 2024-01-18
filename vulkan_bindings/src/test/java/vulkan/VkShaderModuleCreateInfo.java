package vulkan;

public record VkShaderModuleCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$codeSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$codeSize = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCode = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCode = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$codeSize,
			LAYOUT$pCode
	).withName("VkShaderModuleCreateInfo");

	public VkShaderModuleCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public long codeSize() {return this.ptr.get(LAYOUT$codeSize, OFFSET$codeSize);}
	public void codeSize(long value) {this.ptr.set(LAYOUT$codeSize, OFFSET$codeSize, value);}
	public java.lang.foreign.MemorySegment codeSize_ptr() {return this.ptr.asSlice(OFFSET$codeSize, LAYOUT$codeSize);}

	public java.lang.foreign.MemorySegment pCode() {return this.ptr.get(LAYOUT$pCode, OFFSET$pCode);}
	public void pCode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCode, OFFSET$pCode, value);}
	public java.lang.foreign.MemorySegment pCode_ptr() {return this.ptr.asSlice(OFFSET$pCode, LAYOUT$pCode);}
}

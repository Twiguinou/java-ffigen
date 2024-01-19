package vulkan;

public record VkPipelineViewportSwizzleStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewportCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pViewportSwizzles = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pViewportSwizzles = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$viewportCount,
			LAYOUT$pViewportSwizzles
	).withName("VkPipelineViewportSwizzleStateCreateInfoNV");

	public VkPipelineViewportSwizzleStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
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

	public int viewportCount() {return this.ptr.get(LAYOUT$viewportCount, OFFSET$viewportCount);}
	public void viewportCount(int value) {this.ptr.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);}
	public java.lang.foreign.MemorySegment viewportCount_ptr() {return this.ptr.asSlice(OFFSET$viewportCount, LAYOUT$viewportCount);}

	public java.lang.foreign.MemorySegment pViewportSwizzles() {return this.ptr.get(LAYOUT$pViewportSwizzles, OFFSET$pViewportSwizzles);}
	public void pViewportSwizzles(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewportSwizzles, OFFSET$pViewportSwizzles, value);}
	public java.lang.foreign.MemorySegment pViewportSwizzles_ptr() {return this.ptr.asSlice(OFFSET$pViewportSwizzles, LAYOUT$pViewportSwizzles);}
}

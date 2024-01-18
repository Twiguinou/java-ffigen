package vulkan;

public record VkMemoryBarrier(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcAccessMask = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstAccessMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstAccessMask = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$srcAccessMask,
			LAYOUT$dstAccessMask
	).withName("VkMemoryBarrier");

	public VkMemoryBarrier(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int srcAccessMask() {return this.ptr.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);}
	public void srcAccessMask(int value) {this.ptr.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);}
	public java.lang.foreign.MemorySegment srcAccessMask_ptr() {return this.ptr.asSlice(OFFSET$srcAccessMask, LAYOUT$srcAccessMask);}

	public int dstAccessMask() {return this.ptr.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);}
	public void dstAccessMask(int value) {this.ptr.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);}
	public java.lang.foreign.MemorySegment dstAccessMask_ptr() {return this.ptr.asSlice(OFFSET$dstAccessMask, LAYOUT$dstAccessMask);}
}

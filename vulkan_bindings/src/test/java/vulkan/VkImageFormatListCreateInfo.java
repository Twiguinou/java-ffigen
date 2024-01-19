package vulkan;

public record VkImageFormatListCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewFormatCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewFormatCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pViewFormats = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pViewFormats = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$viewFormatCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pViewFormats
	).withName("VkImageFormatListCreateInfo");

	public VkImageFormatListCreateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int viewFormatCount() {return this.ptr.get(LAYOUT$viewFormatCount, OFFSET$viewFormatCount);}
	public void viewFormatCount(int value) {this.ptr.set(LAYOUT$viewFormatCount, OFFSET$viewFormatCount, value);}
	public java.lang.foreign.MemorySegment viewFormatCount_ptr() {return this.ptr.asSlice(OFFSET$viewFormatCount, LAYOUT$viewFormatCount);}

	public java.lang.foreign.MemorySegment pViewFormats() {return this.ptr.get(LAYOUT$pViewFormats, OFFSET$pViewFormats);}
	public void pViewFormats(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewFormats, OFFSET$pViewFormats, value);}
	public java.lang.foreign.MemorySegment pViewFormats_ptr() {return this.ptr.asSlice(OFFSET$pViewFormats, LAYOUT$pViewFormats);}
}

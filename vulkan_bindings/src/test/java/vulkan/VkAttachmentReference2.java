package vulkan;

public record VkAttachmentReference2(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$attachment = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$layout = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$aspectMask = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$attachment,
			LAYOUT$layout,
			LAYOUT$aspectMask,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkAttachmentReference2");

	public VkAttachmentReference2(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int attachment() {return this.ptr.get(LAYOUT$attachment, OFFSET$attachment);}
	public void attachment(int value) {this.ptr.set(LAYOUT$attachment, OFFSET$attachment, value);}
	public java.lang.foreign.MemorySegment attachment_ptr() {return this.ptr.asSlice(OFFSET$attachment, LAYOUT$attachment);}

	public int layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
	public void layout(int value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
	public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}

	public int aspectMask() {return this.ptr.get(LAYOUT$aspectMask, OFFSET$aspectMask);}
	public void aspectMask(int value) {this.ptr.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);}
	public java.lang.foreign.MemorySegment aspectMask_ptr() {return this.ptr.asSlice(OFFSET$aspectMask, LAYOUT$aspectMask);}
}

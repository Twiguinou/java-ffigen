package vulkan;

public record VkFramebufferAttachmentImageInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$usage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$usage = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$width = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$height = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layerCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$layerCount = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewFormatCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$viewFormatCount = 36L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pViewFormats = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pViewFormats = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$usage,
			LAYOUT$width,
			LAYOUT$height,
			LAYOUT$layerCount,
			LAYOUT$viewFormatCount,
			LAYOUT$pViewFormats
	).withName("VkFramebufferAttachmentImageInfo");

	public VkFramebufferAttachmentImageInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public int usage() {return this.ptr.get(LAYOUT$usage, OFFSET$usage);}
	public void usage(int value) {this.ptr.set(LAYOUT$usage, OFFSET$usage, value);}
	public java.lang.foreign.MemorySegment usage_ptr() {return this.ptr.asSlice(OFFSET$usage, LAYOUT$usage);}

	public int width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
	public void width(int value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
	public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

	public int height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
	public void height(int value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
	public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

	public int layerCount() {return this.ptr.get(LAYOUT$layerCount, OFFSET$layerCount);}
	public void layerCount(int value) {this.ptr.set(LAYOUT$layerCount, OFFSET$layerCount, value);}
	public java.lang.foreign.MemorySegment layerCount_ptr() {return this.ptr.asSlice(OFFSET$layerCount, LAYOUT$layerCount);}

	public int viewFormatCount() {return this.ptr.get(LAYOUT$viewFormatCount, OFFSET$viewFormatCount);}
	public void viewFormatCount(int value) {this.ptr.set(LAYOUT$viewFormatCount, OFFSET$viewFormatCount, value);}
	public java.lang.foreign.MemorySegment viewFormatCount_ptr() {return this.ptr.asSlice(OFFSET$viewFormatCount, LAYOUT$viewFormatCount);}

	public java.lang.foreign.MemorySegment pViewFormats() {return this.ptr.get(LAYOUT$pViewFormats, OFFSET$pViewFormats);}
	public void pViewFormats(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pViewFormats, OFFSET$pViewFormats, value);}
	public java.lang.foreign.MemorySegment pViewFormats_ptr() {return this.ptr.asSlice(OFFSET$pViewFormats, LAYOUT$pViewFormats);}
}

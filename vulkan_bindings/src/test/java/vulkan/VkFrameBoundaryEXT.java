package vulkan;

public record VkFrameBoundaryEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$frameID = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$frameID = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pImages = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pImages = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$bufferCount = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pBuffers = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pBuffers = 56L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$tagName = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$tagName = 64L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$tagSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$tagSize = 72L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pTag = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pTag = 80L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$frameID,
			LAYOUT$imageCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pImages,
			LAYOUT$bufferCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pBuffers,
			LAYOUT$tagName,
			LAYOUT$tagSize,
			LAYOUT$pTag
	).withName("VkFrameBoundaryEXT");

	public VkFrameBoundaryEXT(java.lang.foreign.SegmentAllocator allocator)
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

	public long frameID() {return this.ptr.get(LAYOUT$frameID, OFFSET$frameID);}
	public void frameID(long value) {this.ptr.set(LAYOUT$frameID, OFFSET$frameID, value);}
	public java.lang.foreign.MemorySegment frameID_ptr() {return this.ptr.asSlice(OFFSET$frameID, LAYOUT$frameID);}

	public int imageCount() {return this.ptr.get(LAYOUT$imageCount, OFFSET$imageCount);}
	public void imageCount(int value) {this.ptr.set(LAYOUT$imageCount, OFFSET$imageCount, value);}
	public java.lang.foreign.MemorySegment imageCount_ptr() {return this.ptr.asSlice(OFFSET$imageCount, LAYOUT$imageCount);}

	public java.lang.foreign.MemorySegment pImages() {return this.ptr.get(LAYOUT$pImages, OFFSET$pImages);}
	public void pImages(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pImages, OFFSET$pImages, value);}
	public java.lang.foreign.MemorySegment pImages_ptr() {return this.ptr.asSlice(OFFSET$pImages, LAYOUT$pImages);}

	public int bufferCount() {return this.ptr.get(LAYOUT$bufferCount, OFFSET$bufferCount);}
	public void bufferCount(int value) {this.ptr.set(LAYOUT$bufferCount, OFFSET$bufferCount, value);}
	public java.lang.foreign.MemorySegment bufferCount_ptr() {return this.ptr.asSlice(OFFSET$bufferCount, LAYOUT$bufferCount);}

	public java.lang.foreign.MemorySegment pBuffers() {return this.ptr.get(LAYOUT$pBuffers, OFFSET$pBuffers);}
	public void pBuffers(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBuffers, OFFSET$pBuffers, value);}
	public java.lang.foreign.MemorySegment pBuffers_ptr() {return this.ptr.asSlice(OFFSET$pBuffers, LAYOUT$pBuffers);}

	public long tagName() {return this.ptr.get(LAYOUT$tagName, OFFSET$tagName);}
	public void tagName(long value) {this.ptr.set(LAYOUT$tagName, OFFSET$tagName, value);}
	public java.lang.foreign.MemorySegment tagName_ptr() {return this.ptr.asSlice(OFFSET$tagName, LAYOUT$tagName);}

	public long tagSize() {return this.ptr.get(LAYOUT$tagSize, OFFSET$tagSize);}
	public void tagSize(long value) {this.ptr.set(LAYOUT$tagSize, OFFSET$tagSize, value);}
	public java.lang.foreign.MemorySegment tagSize_ptr() {return this.ptr.asSlice(OFFSET$tagSize, LAYOUT$tagSize);}

	public java.lang.foreign.MemorySegment pTag() {return this.ptr.get(LAYOUT$pTag, OFFSET$pTag);}
	public void pTag(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pTag, OFFSET$pTag, value);}
	public java.lang.foreign.MemorySegment pTag_ptr() {return this.ptr.asSlice(OFFSET$pTag, LAYOUT$pTag);}
}

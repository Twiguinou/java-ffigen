package vulkan;

public record VkBufferCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$size = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$usage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$usage = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sharingMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sharingMode = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$queueFamilyIndexCount = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pQueueFamilyIndices = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pQueueFamilyIndices = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$size,
			LAYOUT$usage,
			LAYOUT$sharingMode,
			LAYOUT$queueFamilyIndexCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pQueueFamilyIndices
	).withName("VkBufferCreateInfo");

	public VkBufferCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
	public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
	public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

	public int usage() {return this.ptr.get(LAYOUT$usage, OFFSET$usage);}
	public void usage(int value) {this.ptr.set(LAYOUT$usage, OFFSET$usage, value);}
	public java.lang.foreign.MemorySegment usage_ptr() {return this.ptr.asSlice(OFFSET$usage, LAYOUT$usage);}

	public int sharingMode() {return this.ptr.get(LAYOUT$sharingMode, OFFSET$sharingMode);}
	public void sharingMode(int value) {this.ptr.set(LAYOUT$sharingMode, OFFSET$sharingMode, value);}
	public java.lang.foreign.MemorySegment sharingMode_ptr() {return this.ptr.asSlice(OFFSET$sharingMode, LAYOUT$sharingMode);}

	public int queueFamilyIndexCount() {return this.ptr.get(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount);}
	public void queueFamilyIndexCount(int value) {this.ptr.set(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount, value);}
	public java.lang.foreign.MemorySegment queueFamilyIndexCount_ptr() {return this.ptr.asSlice(OFFSET$queueFamilyIndexCount, LAYOUT$queueFamilyIndexCount);}

	public java.lang.foreign.MemorySegment pQueueFamilyIndices() {return this.ptr.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);}
	public void pQueueFamilyIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);}
	public java.lang.foreign.MemorySegment pQueueFamilyIndices_ptr() {return this.ptr.asSlice(OFFSET$pQueueFamilyIndices, LAYOUT$pQueueFamilyIndices);}
}

package vulkan;

public record VkBufferViewCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$buffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$buffer = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$format = 32L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$offset = 40L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$range = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$range = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$buffer,
			LAYOUT$format,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$offset,
			LAYOUT$range
	).withName("VkBufferViewCreateInfo");

	public VkBufferViewCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT$buffer, OFFSET$buffer);}
	public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$buffer, OFFSET$buffer, value);}
	public java.lang.foreign.MemorySegment buffer_ptr() {return this.ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}

	public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
	public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
	public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

	public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
	public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
	public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

	public long range() {return this.ptr.get(LAYOUT$range, OFFSET$range);}
	public void range(long value) {this.ptr.set(LAYOUT$range, OFFSET$range, value);}
	public java.lang.foreign.MemorySegment range_ptr() {return this.ptr.asSlice(OFFSET$range, LAYOUT$range);}
}

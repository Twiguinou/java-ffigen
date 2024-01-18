package vulkan;

public record VkMemoryHeap(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$size = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$size,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkMemoryHeap");

	public VkMemoryHeap(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
	public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
	public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}

package vulkan;

public record VkSpecializationMapEntry(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$constantID = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$constantID = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$offset = 4L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$size = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$constantID,
			LAYOUT$offset,
			LAYOUT$size
	).withName("VkSpecializationMapEntry");

	public VkSpecializationMapEntry(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int constantID() {return this.ptr.get(LAYOUT$constantID, OFFSET$constantID);}
	public void constantID(int value) {this.ptr.set(LAYOUT$constantID, OFFSET$constantID, value);}
	public java.lang.foreign.MemorySegment constantID_ptr() {return this.ptr.asSlice(OFFSET$constantID, LAYOUT$constantID);}

	public int offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
	public void offset(int value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
	public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

	public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
	public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
	public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}
}

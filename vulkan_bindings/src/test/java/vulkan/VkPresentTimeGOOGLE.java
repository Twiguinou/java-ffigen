package vulkan;

public record VkPresentTimeGOOGLE(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$presentID = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$presentID = 0L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$desiredPresentTime = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$desiredPresentTime = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$presentID,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$desiredPresentTime
	).withName("VkPresentTimeGOOGLE");

	public VkPresentTimeGOOGLE(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int presentID() {return this.ptr.get(LAYOUT$presentID, OFFSET$presentID);}
	public void presentID(int value) {this.ptr.set(LAYOUT$presentID, OFFSET$presentID, value);}
	public java.lang.foreign.MemorySegment presentID_ptr() {return this.ptr.asSlice(OFFSET$presentID, LAYOUT$presentID);}

	public long desiredPresentTime() {return this.ptr.get(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime);}
	public void desiredPresentTime(long value) {this.ptr.set(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime, value);}
	public java.lang.foreign.MemorySegment desiredPresentTime_ptr() {return this.ptr.asSlice(OFFSET$desiredPresentTime, LAYOUT$desiredPresentTime);}
}

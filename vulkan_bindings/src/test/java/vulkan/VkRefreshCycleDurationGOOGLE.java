package vulkan;

public record VkRefreshCycleDurationGOOGLE(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$refreshDuration = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$refreshDuration = 0L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$refreshDuration
	).withName("VkRefreshCycleDurationGOOGLE");

	public VkRefreshCycleDurationGOOGLE(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public long refreshDuration() {return this.ptr.get(LAYOUT$refreshDuration, OFFSET$refreshDuration);}
	public void refreshDuration(long value) {this.ptr.set(LAYOUT$refreshDuration, OFFSET$refreshDuration, value);}
	public java.lang.foreign.MemorySegment refreshDuration_ptr() {return this.ptr.asSlice(OFFSET$refreshDuration, LAYOUT$refreshDuration);}
}

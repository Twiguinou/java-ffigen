package vulkan;

public record VkLatencySleepModeInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$lowLatencyMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$lowLatencyMode = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$lowLatencyBoost = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$lowLatencyBoost = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minimumIntervalUs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minimumIntervalUs = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$lowLatencyMode,
			LAYOUT$lowLatencyBoost,
			LAYOUT$minimumIntervalUs,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkLatencySleepModeInfoNV");

	public VkLatencySleepModeInfoNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int lowLatencyMode() {return this.ptr.get(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode);}
	public void lowLatencyMode(int value) {this.ptr.set(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode, value);}
	public java.lang.foreign.MemorySegment lowLatencyMode_ptr() {return this.ptr.asSlice(OFFSET$lowLatencyMode, LAYOUT$lowLatencyMode);}

	public int lowLatencyBoost() {return this.ptr.get(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost);}
	public void lowLatencyBoost(int value) {this.ptr.set(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost, value);}
	public java.lang.foreign.MemorySegment lowLatencyBoost_ptr() {return this.ptr.asSlice(OFFSET$lowLatencyBoost, LAYOUT$lowLatencyBoost);}

	public int minimumIntervalUs() {return this.ptr.get(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs);}
	public void minimumIntervalUs(int value) {this.ptr.set(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs, value);}
	public java.lang.foreign.MemorySegment minimumIntervalUs_ptr() {return this.ptr.asSlice(OFFSET$minimumIntervalUs, LAYOUT$minimumIntervalUs);}
}

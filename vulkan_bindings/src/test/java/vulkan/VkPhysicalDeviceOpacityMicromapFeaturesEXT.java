package vulkan;

public record VkPhysicalDeviceOpacityMicromapFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$micromap = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$micromap = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$micromapCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$micromapCaptureReplay = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$micromapHostCommands = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$micromapHostCommands = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$micromap,
			LAYOUT$micromapCaptureReplay,
			LAYOUT$micromapHostCommands,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceOpacityMicromapFeaturesEXT");

	public VkPhysicalDeviceOpacityMicromapFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int micromap() {return this.ptr.get(LAYOUT$micromap, OFFSET$micromap);}
	public void micromap(int value) {this.ptr.set(LAYOUT$micromap, OFFSET$micromap, value);}
	public java.lang.foreign.MemorySegment micromap_ptr() {return this.ptr.asSlice(OFFSET$micromap, LAYOUT$micromap);}

	public int micromapCaptureReplay() {return this.ptr.get(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay);}
	public void micromapCaptureReplay(int value) {this.ptr.set(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay, value);}
	public java.lang.foreign.MemorySegment micromapCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$micromapCaptureReplay, LAYOUT$micromapCaptureReplay);}

	public int micromapHostCommands() {return this.ptr.get(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands);}
	public void micromapHostCommands(int value) {this.ptr.set(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands, value);}
	public java.lang.foreign.MemorySegment micromapHostCommands_ptr() {return this.ptr.asSlice(OFFSET$micromapHostCommands, LAYOUT$micromapHostCommands);}
}

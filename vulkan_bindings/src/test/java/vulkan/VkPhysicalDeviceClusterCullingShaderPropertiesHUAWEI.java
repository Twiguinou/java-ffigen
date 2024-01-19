package vulkan;

public record VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$maxWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$maxWorkGroupCount = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$maxWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$maxWorkGroupSize = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxOutputClusterCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxOutputClusterCount = 40L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$indirectBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$indirectBufferOffsetAlignment = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$maxWorkGroupCount,
			LAYOUT$maxWorkGroupSize,
			LAYOUT$maxOutputClusterCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$indirectBufferOffsetAlignment
	).withName("VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI");

	public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment maxWorkGroupCount() {return this.ptr.asSlice(OFFSET$maxWorkGroupCount, LAYOUT$maxWorkGroupCount);}
	public int maxWorkGroupCount(int i) {return this.maxWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void maxWorkGroupCount(int i, int value) {this.maxWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public java.lang.foreign.MemorySegment maxWorkGroupSize() {return this.ptr.asSlice(OFFSET$maxWorkGroupSize, LAYOUT$maxWorkGroupSize);}
	public int maxWorkGroupSize(int i) {return this.maxWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void maxWorkGroupSize(int i, int value) {this.maxWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public int maxOutputClusterCount() {return this.ptr.get(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount);}
	public void maxOutputClusterCount(int value) {this.ptr.set(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount, value);}
	public java.lang.foreign.MemorySegment maxOutputClusterCount_ptr() {return this.ptr.asSlice(OFFSET$maxOutputClusterCount, LAYOUT$maxOutputClusterCount);}

	public long indirectBufferOffsetAlignment() {return this.ptr.get(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment);}
	public void indirectBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment, value);}
	public java.lang.foreign.MemorySegment indirectBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$indirectBufferOffsetAlignment, LAYOUT$indirectBufferOffsetAlignment);}
}

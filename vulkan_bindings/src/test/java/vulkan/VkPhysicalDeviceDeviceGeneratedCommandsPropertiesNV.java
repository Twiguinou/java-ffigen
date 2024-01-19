package vulkan;

public record VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxGraphicsShaderGroupCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxGraphicsShaderGroupCount = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxIndirectSequenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxIndirectSequenceCount = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxIndirectCommandsTokenCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxIndirectCommandsTokenCount = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxIndirectCommandsStreamCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxIndirectCommandsStreamCount = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxIndirectCommandsTokenOffset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxIndirectCommandsTokenOffset = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxIndirectCommandsStreamStride = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxIndirectCommandsStreamStride = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minSequencesCountBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minSequencesCountBufferOffsetAlignment = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minSequencesIndexBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minSequencesIndexBufferOffsetAlignment = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minIndirectCommandsBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$minIndirectCommandsBufferOffsetAlignment = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$maxGraphicsShaderGroupCount,
			LAYOUT$maxIndirectSequenceCount,
			LAYOUT$maxIndirectCommandsTokenCount,
			LAYOUT$maxIndirectCommandsStreamCount,
			LAYOUT$maxIndirectCommandsTokenOffset,
			LAYOUT$maxIndirectCommandsStreamStride,
			LAYOUT$minSequencesCountBufferOffsetAlignment,
			LAYOUT$minSequencesIndexBufferOffsetAlignment,
			LAYOUT$minIndirectCommandsBufferOffsetAlignment,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV");

	public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int maxGraphicsShaderGroupCount() {return this.ptr.get(LAYOUT$maxGraphicsShaderGroupCount, OFFSET$maxGraphicsShaderGroupCount);}
	public void maxGraphicsShaderGroupCount(int value) {this.ptr.set(LAYOUT$maxGraphicsShaderGroupCount, OFFSET$maxGraphicsShaderGroupCount, value);}
	public java.lang.foreign.MemorySegment maxGraphicsShaderGroupCount_ptr() {return this.ptr.asSlice(OFFSET$maxGraphicsShaderGroupCount, LAYOUT$maxGraphicsShaderGroupCount);}

	public int maxIndirectSequenceCount() {return this.ptr.get(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount);}
	public void maxIndirectSequenceCount(int value) {this.ptr.set(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount, value);}
	public java.lang.foreign.MemorySegment maxIndirectSequenceCount_ptr() {return this.ptr.asSlice(OFFSET$maxIndirectSequenceCount, LAYOUT$maxIndirectSequenceCount);}

	public int maxIndirectCommandsTokenCount() {return this.ptr.get(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount);}
	public void maxIndirectCommandsTokenCount(int value) {this.ptr.set(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount, value);}
	public java.lang.foreign.MemorySegment maxIndirectCommandsTokenCount_ptr() {return this.ptr.asSlice(OFFSET$maxIndirectCommandsTokenCount, LAYOUT$maxIndirectCommandsTokenCount);}

	public int maxIndirectCommandsStreamCount() {return this.ptr.get(LAYOUT$maxIndirectCommandsStreamCount, OFFSET$maxIndirectCommandsStreamCount);}
	public void maxIndirectCommandsStreamCount(int value) {this.ptr.set(LAYOUT$maxIndirectCommandsStreamCount, OFFSET$maxIndirectCommandsStreamCount, value);}
	public java.lang.foreign.MemorySegment maxIndirectCommandsStreamCount_ptr() {return this.ptr.asSlice(OFFSET$maxIndirectCommandsStreamCount, LAYOUT$maxIndirectCommandsStreamCount);}

	public int maxIndirectCommandsTokenOffset() {return this.ptr.get(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset);}
	public void maxIndirectCommandsTokenOffset(int value) {this.ptr.set(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset, value);}
	public java.lang.foreign.MemorySegment maxIndirectCommandsTokenOffset_ptr() {return this.ptr.asSlice(OFFSET$maxIndirectCommandsTokenOffset, LAYOUT$maxIndirectCommandsTokenOffset);}

	public int maxIndirectCommandsStreamStride() {return this.ptr.get(LAYOUT$maxIndirectCommandsStreamStride, OFFSET$maxIndirectCommandsStreamStride);}
	public void maxIndirectCommandsStreamStride(int value) {this.ptr.set(LAYOUT$maxIndirectCommandsStreamStride, OFFSET$maxIndirectCommandsStreamStride, value);}
	public java.lang.foreign.MemorySegment maxIndirectCommandsStreamStride_ptr() {return this.ptr.asSlice(OFFSET$maxIndirectCommandsStreamStride, LAYOUT$maxIndirectCommandsStreamStride);}

	public int minSequencesCountBufferOffsetAlignment() {return this.ptr.get(LAYOUT$minSequencesCountBufferOffsetAlignment, OFFSET$minSequencesCountBufferOffsetAlignment);}
	public void minSequencesCountBufferOffsetAlignment(int value) {this.ptr.set(LAYOUT$minSequencesCountBufferOffsetAlignment, OFFSET$minSequencesCountBufferOffsetAlignment, value);}
	public java.lang.foreign.MemorySegment minSequencesCountBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minSequencesCountBufferOffsetAlignment, LAYOUT$minSequencesCountBufferOffsetAlignment);}

	public int minSequencesIndexBufferOffsetAlignment() {return this.ptr.get(LAYOUT$minSequencesIndexBufferOffsetAlignment, OFFSET$minSequencesIndexBufferOffsetAlignment);}
	public void minSequencesIndexBufferOffsetAlignment(int value) {this.ptr.set(LAYOUT$minSequencesIndexBufferOffsetAlignment, OFFSET$minSequencesIndexBufferOffsetAlignment, value);}
	public java.lang.foreign.MemorySegment minSequencesIndexBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minSequencesIndexBufferOffsetAlignment, LAYOUT$minSequencesIndexBufferOffsetAlignment);}

	public int minIndirectCommandsBufferOffsetAlignment() {return this.ptr.get(LAYOUT$minIndirectCommandsBufferOffsetAlignment, OFFSET$minIndirectCommandsBufferOffsetAlignment);}
	public void minIndirectCommandsBufferOffsetAlignment(int value) {this.ptr.set(LAYOUT$minIndirectCommandsBufferOffsetAlignment, OFFSET$minIndirectCommandsBufferOffsetAlignment, value);}
	public java.lang.foreign.MemorySegment minIndirectCommandsBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minIndirectCommandsBufferOffsetAlignment, LAYOUT$minIndirectCommandsBufferOffsetAlignment);}
}

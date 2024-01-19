package vulkan;

public record VkGeneratedCommandsInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pipelineBindPoint = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pipeline = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pipeline = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$indirectCommandsLayout = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$indirectCommandsLayout = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$streamCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$streamCount = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStreams = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStreams = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sequencesCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sequencesCount = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$preprocessBuffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$preprocessBuffer = 64L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$preprocessOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$preprocessOffset = 72L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$preprocessSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$preprocessSize = 80L;
	public static final java.lang.foreign.AddressLayout LAYOUT$sequencesCountBuffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$sequencesCountBuffer = 88L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$sequencesCountOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$sequencesCountOffset = 96L;
	public static final java.lang.foreign.AddressLayout LAYOUT$sequencesIndexBuffer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$sequencesIndexBuffer = 104L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$sequencesIndexOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$sequencesIndexOffset = 112L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$pipelineBindPoint,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pipeline,
			LAYOUT$indirectCommandsLayout,
			LAYOUT$streamCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pStreams,
			LAYOUT$sequencesCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$preprocessBuffer,
			LAYOUT$preprocessOffset,
			LAYOUT$preprocessSize,
			LAYOUT$sequencesCountBuffer,
			LAYOUT$sequencesCountOffset,
			LAYOUT$sequencesIndexBuffer,
			LAYOUT$sequencesIndexOffset
	).withName("VkGeneratedCommandsInfoNV");

	public VkGeneratedCommandsInfoNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int pipelineBindPoint() {return this.ptr.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);}
	public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);}
	public java.lang.foreign.MemorySegment pipelineBindPoint_ptr() {return this.ptr.asSlice(OFFSET$pipelineBindPoint, LAYOUT$pipelineBindPoint);}

	public java.lang.foreign.MemorySegment pipeline() {return this.ptr.get(LAYOUT$pipeline, OFFSET$pipeline);}
	public void pipeline(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pipeline, OFFSET$pipeline, value);}
	public java.lang.foreign.MemorySegment pipeline_ptr() {return this.ptr.asSlice(OFFSET$pipeline, LAYOUT$pipeline);}

	public java.lang.foreign.MemorySegment indirectCommandsLayout() {return this.ptr.get(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout);}
	public void indirectCommandsLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$indirectCommandsLayout, OFFSET$indirectCommandsLayout, value);}
	public java.lang.foreign.MemorySegment indirectCommandsLayout_ptr() {return this.ptr.asSlice(OFFSET$indirectCommandsLayout, LAYOUT$indirectCommandsLayout);}

	public int streamCount() {return this.ptr.get(LAYOUT$streamCount, OFFSET$streamCount);}
	public void streamCount(int value) {this.ptr.set(LAYOUT$streamCount, OFFSET$streamCount, value);}
	public java.lang.foreign.MemorySegment streamCount_ptr() {return this.ptr.asSlice(OFFSET$streamCount, LAYOUT$streamCount);}

	public java.lang.foreign.MemorySegment pStreams() {return this.ptr.get(LAYOUT$pStreams, OFFSET$pStreams);}
	public void pStreams(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStreams, OFFSET$pStreams, value);}
	public java.lang.foreign.MemorySegment pStreams_ptr() {return this.ptr.asSlice(OFFSET$pStreams, LAYOUT$pStreams);}

	public int sequencesCount() {return this.ptr.get(LAYOUT$sequencesCount, OFFSET$sequencesCount);}
	public void sequencesCount(int value) {this.ptr.set(LAYOUT$sequencesCount, OFFSET$sequencesCount, value);}
	public java.lang.foreign.MemorySegment sequencesCount_ptr() {return this.ptr.asSlice(OFFSET$sequencesCount, LAYOUT$sequencesCount);}

	public java.lang.foreign.MemorySegment preprocessBuffer() {return this.ptr.get(LAYOUT$preprocessBuffer, OFFSET$preprocessBuffer);}
	public void preprocessBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$preprocessBuffer, OFFSET$preprocessBuffer, value);}
	public java.lang.foreign.MemorySegment preprocessBuffer_ptr() {return this.ptr.asSlice(OFFSET$preprocessBuffer, LAYOUT$preprocessBuffer);}

	public long preprocessOffset() {return this.ptr.get(LAYOUT$preprocessOffset, OFFSET$preprocessOffset);}
	public void preprocessOffset(long value) {this.ptr.set(LAYOUT$preprocessOffset, OFFSET$preprocessOffset, value);}
	public java.lang.foreign.MemorySegment preprocessOffset_ptr() {return this.ptr.asSlice(OFFSET$preprocessOffset, LAYOUT$preprocessOffset);}

	public long preprocessSize() {return this.ptr.get(LAYOUT$preprocessSize, OFFSET$preprocessSize);}
	public void preprocessSize(long value) {this.ptr.set(LAYOUT$preprocessSize, OFFSET$preprocessSize, value);}
	public java.lang.foreign.MemorySegment preprocessSize_ptr() {return this.ptr.asSlice(OFFSET$preprocessSize, LAYOUT$preprocessSize);}

	public java.lang.foreign.MemorySegment sequencesCountBuffer() {return this.ptr.get(LAYOUT$sequencesCountBuffer, OFFSET$sequencesCountBuffer);}
	public void sequencesCountBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$sequencesCountBuffer, OFFSET$sequencesCountBuffer, value);}
	public java.lang.foreign.MemorySegment sequencesCountBuffer_ptr() {return this.ptr.asSlice(OFFSET$sequencesCountBuffer, LAYOUT$sequencesCountBuffer);}

	public long sequencesCountOffset() {return this.ptr.get(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset);}
	public void sequencesCountOffset(long value) {this.ptr.set(LAYOUT$sequencesCountOffset, OFFSET$sequencesCountOffset, value);}
	public java.lang.foreign.MemorySegment sequencesCountOffset_ptr() {return this.ptr.asSlice(OFFSET$sequencesCountOffset, LAYOUT$sequencesCountOffset);}

	public java.lang.foreign.MemorySegment sequencesIndexBuffer() {return this.ptr.get(LAYOUT$sequencesIndexBuffer, OFFSET$sequencesIndexBuffer);}
	public void sequencesIndexBuffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$sequencesIndexBuffer, OFFSET$sequencesIndexBuffer, value);}
	public java.lang.foreign.MemorySegment sequencesIndexBuffer_ptr() {return this.ptr.asSlice(OFFSET$sequencesIndexBuffer, LAYOUT$sequencesIndexBuffer);}

	public long sequencesIndexOffset() {return this.ptr.get(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset);}
	public void sequencesIndexOffset(long value) {this.ptr.set(LAYOUT$sequencesIndexOffset, OFFSET$sequencesIndexOffset, value);}
	public java.lang.foreign.MemorySegment sequencesIndexOffset_ptr() {return this.ptr.asSlice(OFFSET$sequencesIndexOffset, LAYOUT$sequencesIndexOffset);}
}

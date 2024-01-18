package vulkan;

public record VkClearColorValue(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.SequenceLayout LAYOUT$float32 = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT);
	public static final long OFFSET$float32 = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$int32 = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$int32 = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$uint32 = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$uint32 = 0L;

	public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
			LAYOUT$float32,
			LAYOUT$int32,
			LAYOUT$uint32
	).withName("VkClearColorValue");

	public VkClearColorValue(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment float32() {return this.ptr.asSlice(OFFSET$float32, LAYOUT$float32);}
	public float float32(int i) {return this.float32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
	public void float32(int i, float value) {this.float32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}

	public java.lang.foreign.MemorySegment int32() {return this.ptr.asSlice(OFFSET$int32, LAYOUT$int32);}
	public int int32(int i) {return this.int32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void int32(int i, int value) {this.int32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public java.lang.foreign.MemorySegment uint32() {return this.ptr.asSlice(OFFSET$uint32, LAYOUT$uint32);}
	public int uint32(int i) {return this.uint32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void uint32(int i, int value) {this.uint32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}
}

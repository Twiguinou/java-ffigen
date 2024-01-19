package vulkan;

public record VkRenderPassSubpassFeedbackInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subpassMergeStatus = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$subpassMergeStatus = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$description = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$postMergeIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$postMergeIndex = 260L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$subpassMergeStatus,
			LAYOUT$description,
			LAYOUT$postMergeIndex
	).withName("VkRenderPassSubpassFeedbackInfoEXT");

	public VkRenderPassSubpassFeedbackInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int subpassMergeStatus() {return this.ptr.get(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus);}
	public void subpassMergeStatus(int value) {this.ptr.set(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus, value);}
	public java.lang.foreign.MemorySegment subpassMergeStatus_ptr() {return this.ptr.asSlice(OFFSET$subpassMergeStatus, LAYOUT$subpassMergeStatus);}

	public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
	public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public int postMergeIndex() {return this.ptr.get(LAYOUT$postMergeIndex, OFFSET$postMergeIndex);}
	public void postMergeIndex(int value) {this.ptr.set(LAYOUT$postMergeIndex, OFFSET$postMergeIndex, value);}
	public java.lang.foreign.MemorySegment postMergeIndex_ptr() {return this.ptr.asSlice(OFFSET$postMergeIndex, LAYOUT$postMergeIndex);}
}

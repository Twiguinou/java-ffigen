package vulkan;

public record VkRenderPassCreationFeedbackInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$postMergeSubpassCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$postMergeSubpassCount = 0L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$postMergeSubpassCount
	).withName("VkRenderPassCreationFeedbackInfoEXT");

	public VkRenderPassCreationFeedbackInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int postMergeSubpassCount() {return this.ptr.get(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount);}
	public void postMergeSubpassCount(int value) {this.ptr.set(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount, value);}
	public java.lang.foreign.MemorySegment postMergeSubpassCount_ptr() {return this.ptr.asSlice(OFFSET$postMergeSubpassCount, LAYOUT$postMergeSubpassCount);}
}

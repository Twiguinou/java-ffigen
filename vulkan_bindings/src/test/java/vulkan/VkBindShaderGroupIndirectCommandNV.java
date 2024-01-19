package vulkan;

public record VkBindShaderGroupIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$groupIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$groupIndex = 0L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$groupIndex
	).withName("VkBindShaderGroupIndirectCommandNV");

	public VkBindShaderGroupIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int groupIndex() {return this.ptr.get(LAYOUT$groupIndex, OFFSET$groupIndex);}
	public void groupIndex(int value) {this.ptr.set(LAYOUT$groupIndex, OFFSET$groupIndex, value);}
	public java.lang.foreign.MemorySegment groupIndex_ptr() {return this.ptr.asSlice(OFFSET$groupIndex, LAYOUT$groupIndex);}
}

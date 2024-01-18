package vulkan;

public record VkMultiDrawIndexedInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$firstIndex = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$indexCount = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexOffset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexOffset = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$firstIndex,
			LAYOUT$indexCount,
			LAYOUT$vertexOffset
	).withName("VkMultiDrawIndexedInfoEXT");

	public VkMultiDrawIndexedInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int firstIndex() {return this.ptr.get(LAYOUT$firstIndex, OFFSET$firstIndex);}
	public void firstIndex(int value) {this.ptr.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);}
	public java.lang.foreign.MemorySegment firstIndex_ptr() {return this.ptr.asSlice(OFFSET$firstIndex, LAYOUT$firstIndex);}

	public int indexCount() {return this.ptr.get(LAYOUT$indexCount, OFFSET$indexCount);}
	public void indexCount(int value) {this.ptr.set(LAYOUT$indexCount, OFFSET$indexCount, value);}
	public java.lang.foreign.MemorySegment indexCount_ptr() {return this.ptr.asSlice(OFFSET$indexCount, LAYOUT$indexCount);}

	public int vertexOffset() {return this.ptr.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);}
	public void vertexOffset(int value) {this.ptr.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);}
	public java.lang.foreign.MemorySegment vertexOffset_ptr() {return this.ptr.asSlice(OFFSET$vertexOffset, LAYOUT$vertexOffset);}
}

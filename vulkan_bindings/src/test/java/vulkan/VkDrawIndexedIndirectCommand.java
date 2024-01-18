package vulkan;

public record VkDrawIndexedIndirectCommand(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$indexCount = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$instanceCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$instanceCount = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$firstIndex = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexOffset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexOffset = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstInstance = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$firstInstance = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$indexCount,
			LAYOUT$instanceCount,
			LAYOUT$firstIndex,
			LAYOUT$vertexOffset,
			LAYOUT$firstInstance
	).withName("VkDrawIndexedIndirectCommand");

	public VkDrawIndexedIndirectCommand(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int indexCount() {return this.ptr.get(LAYOUT$indexCount, OFFSET$indexCount);}
	public void indexCount(int value) {this.ptr.set(LAYOUT$indexCount, OFFSET$indexCount, value);}
	public java.lang.foreign.MemorySegment indexCount_ptr() {return this.ptr.asSlice(OFFSET$indexCount, LAYOUT$indexCount);}

	public int instanceCount() {return this.ptr.get(LAYOUT$instanceCount, OFFSET$instanceCount);}
	public void instanceCount(int value) {this.ptr.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);}
	public java.lang.foreign.MemorySegment instanceCount_ptr() {return this.ptr.asSlice(OFFSET$instanceCount, LAYOUT$instanceCount);}

	public int firstIndex() {return this.ptr.get(LAYOUT$firstIndex, OFFSET$firstIndex);}
	public void firstIndex(int value) {this.ptr.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);}
	public java.lang.foreign.MemorySegment firstIndex_ptr() {return this.ptr.asSlice(OFFSET$firstIndex, LAYOUT$firstIndex);}

	public int vertexOffset() {return this.ptr.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);}
	public void vertexOffset(int value) {this.ptr.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);}
	public java.lang.foreign.MemorySegment vertexOffset_ptr() {return this.ptr.asSlice(OFFSET$vertexOffset, LAYOUT$vertexOffset);}

	public int firstInstance() {return this.ptr.get(LAYOUT$firstInstance, OFFSET$firstInstance);}
	public void firstInstance(int value) {this.ptr.set(LAYOUT$firstInstance, OFFSET$firstInstance, value);}
	public java.lang.foreign.MemorySegment firstInstance_ptr() {return this.ptr.asSlice(OFFSET$firstInstance, LAYOUT$firstInstance);}
}

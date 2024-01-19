package vulkan;

public record VkMultiDrawInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstVertex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$firstVertex = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexCount = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$firstVertex,
			LAYOUT$vertexCount
	).withName("VkMultiDrawInfoEXT");

	public VkMultiDrawInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int firstVertex() {return this.ptr.get(LAYOUT$firstVertex, OFFSET$firstVertex);}
	public void firstVertex(int value) {this.ptr.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);}
	public java.lang.foreign.MemorySegment firstVertex_ptr() {return this.ptr.asSlice(OFFSET$firstVertex, LAYOUT$firstVertex);}

	public int vertexCount() {return this.ptr.get(LAYOUT$vertexCount, OFFSET$vertexCount);}
	public void vertexCount(int value) {this.ptr.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);}
	public java.lang.foreign.MemorySegment vertexCount_ptr() {return this.ptr.asSlice(OFFSET$vertexCount, LAYOUT$vertexCount);}
}

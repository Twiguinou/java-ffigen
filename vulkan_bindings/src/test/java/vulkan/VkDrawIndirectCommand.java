package vulkan;

public record VkDrawIndirectCommand(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexCount = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$instanceCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$instanceCount = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstVertex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$firstVertex = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstInstance = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$firstInstance = 12L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$vertexCount,
			LAYOUT$instanceCount,
			LAYOUT$firstVertex,
			LAYOUT$firstInstance
	).withName("VkDrawIndirectCommand");

	public VkDrawIndirectCommand(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int vertexCount() {return this.ptr.get(LAYOUT$vertexCount, OFFSET$vertexCount);}
	public void vertexCount(int value) {this.ptr.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);}
	public java.lang.foreign.MemorySegment vertexCount_ptr() {return this.ptr.asSlice(OFFSET$vertexCount, LAYOUT$vertexCount);}

	public int instanceCount() {return this.ptr.get(LAYOUT$instanceCount, OFFSET$instanceCount);}
	public void instanceCount(int value) {this.ptr.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);}
	public java.lang.foreign.MemorySegment instanceCount_ptr() {return this.ptr.asSlice(OFFSET$instanceCount, LAYOUT$instanceCount);}

	public int firstVertex() {return this.ptr.get(LAYOUT$firstVertex, OFFSET$firstVertex);}
	public void firstVertex(int value) {this.ptr.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);}
	public java.lang.foreign.MemorySegment firstVertex_ptr() {return this.ptr.asSlice(OFFSET$firstVertex, LAYOUT$firstVertex);}

	public int firstInstance() {return this.ptr.get(LAYOUT$firstInstance, OFFSET$firstInstance);}
	public void firstInstance(int value) {this.ptr.set(LAYOUT$firstInstance, OFFSET$firstInstance, value);}
	public java.lang.foreign.MemorySegment firstInstance_ptr() {return this.ptr.asSlice(OFFSET$firstInstance, LAYOUT$firstInstance);}
}

package vulkan;

public record VkDrawMeshTasksIndirectCommandNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$taskCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$taskCount = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$firstTask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$firstTask = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$taskCount,
			LAYOUT$firstTask
	).withName("VkDrawMeshTasksIndirectCommandNV");

	public VkDrawMeshTasksIndirectCommandNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int taskCount() {return this.ptr.get(LAYOUT$taskCount, OFFSET$taskCount);}
	public void taskCount(int value) {this.ptr.set(LAYOUT$taskCount, OFFSET$taskCount, value);}
	public java.lang.foreign.MemorySegment taskCount_ptr() {return this.ptr.asSlice(OFFSET$taskCount, LAYOUT$taskCount);}

	public int firstTask() {return this.ptr.get(LAYOUT$firstTask, OFFSET$firstTask);}
	public void firstTask(int value) {this.ptr.set(LAYOUT$firstTask, OFFSET$firstTask, value);}
	public java.lang.foreign.MemorySegment firstTask_ptr() {return this.ptr.asSlice(OFFSET$firstTask, LAYOUT$firstTask);}
}

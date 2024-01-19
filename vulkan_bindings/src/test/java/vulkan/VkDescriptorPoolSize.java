package vulkan;

public record VkDescriptorPoolSize(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$type = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorCount = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$type,
			LAYOUT$descriptorCount
	).withName("VkDescriptorPoolSize");

	public VkDescriptorPoolSize(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
	public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
	public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

	public int descriptorCount() {return this.ptr.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);}
	public void descriptorCount(int value) {this.ptr.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);}
	public java.lang.foreign.MemorySegment descriptorCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorCount, LAYOUT$descriptorCount);}
}

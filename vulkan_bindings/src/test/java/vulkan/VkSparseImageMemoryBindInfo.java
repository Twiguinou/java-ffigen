package vulkan;

public record VkSparseImageMemoryBindInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.AddressLayout LAYOUT$image = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$image = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bindCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$bindCount = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pBinds = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pBinds = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$image,
			LAYOUT$bindCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pBinds
	).withName("VkSparseImageMemoryBindInfo");

	public VkSparseImageMemoryBindInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment image() {return this.ptr.get(LAYOUT$image, OFFSET$image);}
	public void image(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$image, OFFSET$image, value);}
	public java.lang.foreign.MemorySegment image_ptr() {return this.ptr.asSlice(OFFSET$image, LAYOUT$image);}

	public int bindCount() {return this.ptr.get(LAYOUT$bindCount, OFFSET$bindCount);}
	public void bindCount(int value) {this.ptr.set(LAYOUT$bindCount, OFFSET$bindCount, value);}
	public java.lang.foreign.MemorySegment bindCount_ptr() {return this.ptr.asSlice(OFFSET$bindCount, LAYOUT$bindCount);}

	public java.lang.foreign.MemorySegment pBinds() {return this.ptr.get(LAYOUT$pBinds, OFFSET$pBinds);}
	public void pBinds(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBinds, OFFSET$pBinds, value);}
	public java.lang.foreign.MemorySegment pBinds_ptr() {return this.ptr.asSlice(OFFSET$pBinds, LAYOUT$pBinds);}
}

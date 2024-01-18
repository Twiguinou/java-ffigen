package vulkan;

public record VkDescriptorSetAllocateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$descriptorPool = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$descriptorPool = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorSetCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorSetCount = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSetLayouts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSetLayouts = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$descriptorPool,
			LAYOUT$descriptorSetCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pSetLayouts
	).withName("VkDescriptorSetAllocateInfo");

	public VkDescriptorSetAllocateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment descriptorPool() {return this.ptr.get(LAYOUT$descriptorPool, OFFSET$descriptorPool);}
	public void descriptorPool(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$descriptorPool, OFFSET$descriptorPool, value);}
	public java.lang.foreign.MemorySegment descriptorPool_ptr() {return this.ptr.asSlice(OFFSET$descriptorPool, LAYOUT$descriptorPool);}

	public int descriptorSetCount() {return this.ptr.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);}
	public void descriptorSetCount(int value) {this.ptr.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);}
	public java.lang.foreign.MemorySegment descriptorSetCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorSetCount, LAYOUT$descriptorSetCount);}

	public java.lang.foreign.MemorySegment pSetLayouts() {return this.ptr.get(LAYOUT$pSetLayouts, OFFSET$pSetLayouts);}
	public void pSetLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSetLayouts, OFFSET$pSetLayouts, value);}
	public java.lang.foreign.MemorySegment pSetLayouts_ptr() {return this.ptr.asSlice(OFFSET$pSetLayouts, LAYOUT$pSetLayouts);}
}

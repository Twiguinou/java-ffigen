package vulkan;

public record VkDescriptorSetLayoutHostMappingInfoVALVE(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$descriptorOffset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$descriptorOffset = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorSize = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$descriptorOffset,
			LAYOUT$descriptorSize,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDescriptorSetLayoutHostMappingInfoVALVE");

	public VkDescriptorSetLayoutHostMappingInfoVALVE(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public long descriptorOffset() {return this.ptr.get(LAYOUT$descriptorOffset, OFFSET$descriptorOffset);}
	public void descriptorOffset(long value) {this.ptr.set(LAYOUT$descriptorOffset, OFFSET$descriptorOffset, value);}
	public java.lang.foreign.MemorySegment descriptorOffset_ptr() {return this.ptr.asSlice(OFFSET$descriptorOffset, LAYOUT$descriptorOffset);}

	public int descriptorSize() {return this.ptr.get(LAYOUT$descriptorSize, OFFSET$descriptorSize);}
	public void descriptorSize(int value) {this.ptr.set(LAYOUT$descriptorSize, OFFSET$descriptorSize, value);}
	public java.lang.foreign.MemorySegment descriptorSize_ptr() {return this.ptr.asSlice(OFFSET$descriptorSize, LAYOUT$descriptorSize);}
}

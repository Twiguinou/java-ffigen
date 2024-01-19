package vulkan;

public record VkPhysicalDeviceInlineUniformBlockProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxInlineUniformBlockSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxInlineUniformBlockSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorInlineUniformBlocks = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetInlineUniformBlocks = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$maxInlineUniformBlockSize,
			LAYOUT$maxPerStageDescriptorInlineUniformBlocks,
			LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks,
			LAYOUT$maxDescriptorSetInlineUniformBlocks,
			LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceInlineUniformBlockProperties");

	public VkPhysicalDeviceInlineUniformBlockProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int maxInlineUniformBlockSize() {return this.ptr.get(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize);}
	public void maxInlineUniformBlockSize(int value) {this.ptr.set(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize, value);}
	public java.lang.foreign.MemorySegment maxInlineUniformBlockSize_ptr() {return this.ptr.asSlice(OFFSET$maxInlineUniformBlockSize, LAYOUT$maxInlineUniformBlockSize);}

	public int maxPerStageDescriptorInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks);}
	public void maxPerStageDescriptorInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks, value);}
	public java.lang.foreign.MemorySegment maxPerStageDescriptorInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorInlineUniformBlocks, LAYOUT$maxPerStageDescriptorInlineUniformBlocks);}

	public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}
	public void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, value);}
	public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}

	public int maxDescriptorSetInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks);}
	public void maxDescriptorSetInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks, value);}
	public java.lang.foreign.MemorySegment maxDescriptorSetInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetInlineUniformBlocks, LAYOUT$maxDescriptorSetInlineUniformBlocks);}

	public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}
	public void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, value);}
	public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}
}

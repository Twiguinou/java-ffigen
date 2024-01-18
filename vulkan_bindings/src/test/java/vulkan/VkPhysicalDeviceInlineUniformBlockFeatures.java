package vulkan;

public record VkPhysicalDeviceInlineUniformBlockFeatures(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inlineUniformBlock = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$inlineUniformBlock = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$inlineUniformBlock,
			LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind
	).withName("VkPhysicalDeviceInlineUniformBlockFeatures");

	public VkPhysicalDeviceInlineUniformBlockFeatures(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int inlineUniformBlock() {return this.ptr.get(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock);}
	public void inlineUniformBlock(int value) {this.ptr.set(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock, value);}
	public java.lang.foreign.MemorySegment inlineUniformBlock_ptr() {return this.ptr.asSlice(OFFSET$inlineUniformBlock, LAYOUT$inlineUniformBlock);}

	public int descriptorBindingInlineUniformBlockUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind);}
	public void descriptorBindingInlineUniformBlockUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingInlineUniformBlockUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind, LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind);}
}

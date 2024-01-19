package vulkan;

public record VkDescriptorUpdateTemplateEntry(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstBinding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstBinding = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstArrayElement = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstArrayElement = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorCount = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorType = 12L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$offset = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$stride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$stride = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$dstBinding,
			LAYOUT$dstArrayElement,
			LAYOUT$descriptorCount,
			LAYOUT$descriptorType,
			LAYOUT$offset,
			LAYOUT$stride
	).withName("VkDescriptorUpdateTemplateEntry");

	public VkDescriptorUpdateTemplateEntry(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int dstBinding() {return this.ptr.get(LAYOUT$dstBinding, OFFSET$dstBinding);}
	public void dstBinding(int value) {this.ptr.set(LAYOUT$dstBinding, OFFSET$dstBinding, value);}
	public java.lang.foreign.MemorySegment dstBinding_ptr() {return this.ptr.asSlice(OFFSET$dstBinding, LAYOUT$dstBinding);}

	public int dstArrayElement() {return this.ptr.get(LAYOUT$dstArrayElement, OFFSET$dstArrayElement);}
	public void dstArrayElement(int value) {this.ptr.set(LAYOUT$dstArrayElement, OFFSET$dstArrayElement, value);}
	public java.lang.foreign.MemorySegment dstArrayElement_ptr() {return this.ptr.asSlice(OFFSET$dstArrayElement, LAYOUT$dstArrayElement);}

	public int descriptorCount() {return this.ptr.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);}
	public void descriptorCount(int value) {this.ptr.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);}
	public java.lang.foreign.MemorySegment descriptorCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorCount, LAYOUT$descriptorCount);}

	public int descriptorType() {return this.ptr.get(LAYOUT$descriptorType, OFFSET$descriptorType);}
	public void descriptorType(int value) {this.ptr.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);}
	public java.lang.foreign.MemorySegment descriptorType_ptr() {return this.ptr.asSlice(OFFSET$descriptorType, LAYOUT$descriptorType);}

	public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
	public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
	public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

	public long stride() {return this.ptr.get(LAYOUT$stride, OFFSET$stride);}
	public void stride(long value) {this.ptr.set(LAYOUT$stride, OFFSET$stride, value);}
	public java.lang.foreign.MemorySegment stride_ptr() {return this.ptr.asSlice(OFFSET$stride, LAYOUT$stride);}
}

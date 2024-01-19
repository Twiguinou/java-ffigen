package vulkan;

public record VkCopyDescriptorSet(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$srcSet = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$srcSet = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcBinding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcBinding = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcArrayElement = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcArrayElement = 28L;
	public static final java.lang.foreign.AddressLayout LAYOUT$dstSet = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$dstSet = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstBinding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstBinding = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstArrayElement = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstArrayElement = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorCount = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$srcSet,
			LAYOUT$srcBinding,
			LAYOUT$srcArrayElement,
			LAYOUT$dstSet,
			LAYOUT$dstBinding,
			LAYOUT$dstArrayElement,
			LAYOUT$descriptorCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkCopyDescriptorSet");

	public VkCopyDescriptorSet(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment srcSet() {return this.ptr.get(LAYOUT$srcSet, OFFSET$srcSet);}
	public void srcSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$srcSet, OFFSET$srcSet, value);}
	public java.lang.foreign.MemorySegment srcSet_ptr() {return this.ptr.asSlice(OFFSET$srcSet, LAYOUT$srcSet);}

	public int srcBinding() {return this.ptr.get(LAYOUT$srcBinding, OFFSET$srcBinding);}
	public void srcBinding(int value) {this.ptr.set(LAYOUT$srcBinding, OFFSET$srcBinding, value);}
	public java.lang.foreign.MemorySegment srcBinding_ptr() {return this.ptr.asSlice(OFFSET$srcBinding, LAYOUT$srcBinding);}

	public int srcArrayElement() {return this.ptr.get(LAYOUT$srcArrayElement, OFFSET$srcArrayElement);}
	public void srcArrayElement(int value) {this.ptr.set(LAYOUT$srcArrayElement, OFFSET$srcArrayElement, value);}
	public java.lang.foreign.MemorySegment srcArrayElement_ptr() {return this.ptr.asSlice(OFFSET$srcArrayElement, LAYOUT$srcArrayElement);}

	public java.lang.foreign.MemorySegment dstSet() {return this.ptr.get(LAYOUT$dstSet, OFFSET$dstSet);}
	public void dstSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstSet, OFFSET$dstSet, value);}
	public java.lang.foreign.MemorySegment dstSet_ptr() {return this.ptr.asSlice(OFFSET$dstSet, LAYOUT$dstSet);}

	public int dstBinding() {return this.ptr.get(LAYOUT$dstBinding, OFFSET$dstBinding);}
	public void dstBinding(int value) {this.ptr.set(LAYOUT$dstBinding, OFFSET$dstBinding, value);}
	public java.lang.foreign.MemorySegment dstBinding_ptr() {return this.ptr.asSlice(OFFSET$dstBinding, LAYOUT$dstBinding);}

	public int dstArrayElement() {return this.ptr.get(LAYOUT$dstArrayElement, OFFSET$dstArrayElement);}
	public void dstArrayElement(int value) {this.ptr.set(LAYOUT$dstArrayElement, OFFSET$dstArrayElement, value);}
	public java.lang.foreign.MemorySegment dstArrayElement_ptr() {return this.ptr.asSlice(OFFSET$dstArrayElement, LAYOUT$dstArrayElement);}

	public int descriptorCount() {return this.ptr.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);}
	public void descriptorCount(int value) {this.ptr.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);}
	public java.lang.foreign.MemorySegment descriptorCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorCount, LAYOUT$descriptorCount);}
}

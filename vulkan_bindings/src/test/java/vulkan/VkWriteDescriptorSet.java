package vulkan;

public record VkWriteDescriptorSet(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$dstSet = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$dstSet = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstBinding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstBinding = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstArrayElement = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstArrayElement = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorCount = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorType = 36L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pImageInfo = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pImageInfo = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pBufferInfo = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pBufferInfo = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pTexelBufferView = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pTexelBufferView = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$dstSet,
			LAYOUT$dstBinding,
			LAYOUT$dstArrayElement,
			LAYOUT$descriptorCount,
			LAYOUT$descriptorType,
			LAYOUT$pImageInfo,
			LAYOUT$pBufferInfo,
			LAYOUT$pTexelBufferView
	).withName("VkWriteDescriptorSet");

	public VkWriteDescriptorSet(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

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

	public int descriptorType() {return this.ptr.get(LAYOUT$descriptorType, OFFSET$descriptorType);}
	public void descriptorType(int value) {this.ptr.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);}
	public java.lang.foreign.MemorySegment descriptorType_ptr() {return this.ptr.asSlice(OFFSET$descriptorType, LAYOUT$descriptorType);}

	public java.lang.foreign.MemorySegment pImageInfo() {return this.ptr.get(LAYOUT$pImageInfo, OFFSET$pImageInfo);}
	public void pImageInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pImageInfo, OFFSET$pImageInfo, value);}
	public java.lang.foreign.MemorySegment pImageInfo_ptr() {return this.ptr.asSlice(OFFSET$pImageInfo, LAYOUT$pImageInfo);}

	public java.lang.foreign.MemorySegment pBufferInfo() {return this.ptr.get(LAYOUT$pBufferInfo, OFFSET$pBufferInfo);}
	public void pBufferInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBufferInfo, OFFSET$pBufferInfo, value);}
	public java.lang.foreign.MemorySegment pBufferInfo_ptr() {return this.ptr.asSlice(OFFSET$pBufferInfo, LAYOUT$pBufferInfo);}

	public java.lang.foreign.MemorySegment pTexelBufferView() {return this.ptr.get(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView);}
	public void pTexelBufferView(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView, value);}
	public java.lang.foreign.MemorySegment pTexelBufferView_ptr() {return this.ptr.asSlice(OFFSET$pTexelBufferView, LAYOUT$pTexelBufferView);}
}

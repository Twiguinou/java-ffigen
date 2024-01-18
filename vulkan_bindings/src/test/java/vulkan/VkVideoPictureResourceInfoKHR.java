package vulkan;

public record VkVideoPictureResourceInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.GroupLayout LAYOUT$codedOffset = vulkan.VkOffset2D.gStructLayout;
	public static final long OFFSET$codedOffset = 16L;
	public static final java.lang.foreign.GroupLayout LAYOUT$codedExtent = vulkan.VkExtent2D.gStructLayout;
	public static final long OFFSET$codedExtent = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$baseArrayLayer = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$baseArrayLayer = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$imageViewBinding = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$imageViewBinding = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$codedOffset,
			LAYOUT$codedExtent,
			LAYOUT$baseArrayLayer,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$imageViewBinding
	).withName("VkVideoPictureResourceInfoKHR");

	public VkVideoPictureResourceInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public vulkan.VkOffset2D codedOffset() {return new vulkan.VkOffset2D(this.ptr.asSlice(OFFSET$codedOffset, LAYOUT$codedOffset));}

	public vulkan.VkExtent2D codedExtent() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$codedExtent, LAYOUT$codedExtent));}

	public int baseArrayLayer() {return this.ptr.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);}
	public void baseArrayLayer(int value) {this.ptr.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);}
	public java.lang.foreign.MemorySegment baseArrayLayer_ptr() {return this.ptr.asSlice(OFFSET$baseArrayLayer, LAYOUT$baseArrayLayer);}

	public java.lang.foreign.MemorySegment imageViewBinding() {return this.ptr.get(LAYOUT$imageViewBinding, OFFSET$imageViewBinding);}
	public void imageViewBinding(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$imageViewBinding, OFFSET$imageViewBinding, value);}
	public java.lang.foreign.MemorySegment imageViewBinding_ptr() {return this.ptr.asSlice(OFFSET$imageViewBinding, LAYOUT$imageViewBinding);}
}

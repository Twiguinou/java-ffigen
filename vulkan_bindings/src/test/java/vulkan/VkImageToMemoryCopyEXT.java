package vulkan;

public record VkImageToMemoryCopyEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pHostPointer = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pHostPointer = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryRowLength = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$memoryRowLength = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$memoryImageHeight = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$memoryImageHeight = 28L;
	public static final java.lang.foreign.GroupLayout LAYOUT$imageSubresource = vulkan.VkImageSubresourceLayers.gStructLayout;
	public static final long OFFSET$imageSubresource = 32L;
	public static final java.lang.foreign.GroupLayout LAYOUT$imageOffset = vulkan.VkOffset3D.gStructLayout;
	public static final long OFFSET$imageOffset = 48L;
	public static final java.lang.foreign.GroupLayout LAYOUT$imageExtent = vulkan.VkExtent3D.gStructLayout;
	public static final long OFFSET$imageExtent = 60L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$pHostPointer,
			LAYOUT$memoryRowLength,
			LAYOUT$memoryImageHeight,
			LAYOUT$imageSubresource,
			LAYOUT$imageOffset,
			LAYOUT$imageExtent
	).withName("VkImageToMemoryCopyEXT");

	public VkImageToMemoryCopyEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment pHostPointer() {return this.ptr.get(LAYOUT$pHostPointer, OFFSET$pHostPointer);}
	public void pHostPointer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pHostPointer, OFFSET$pHostPointer, value);}
	public java.lang.foreign.MemorySegment pHostPointer_ptr() {return this.ptr.asSlice(OFFSET$pHostPointer, LAYOUT$pHostPointer);}

	public int memoryRowLength() {return this.ptr.get(LAYOUT$memoryRowLength, OFFSET$memoryRowLength);}
	public void memoryRowLength(int value) {this.ptr.set(LAYOUT$memoryRowLength, OFFSET$memoryRowLength, value);}
	public java.lang.foreign.MemorySegment memoryRowLength_ptr() {return this.ptr.asSlice(OFFSET$memoryRowLength, LAYOUT$memoryRowLength);}

	public int memoryImageHeight() {return this.ptr.get(LAYOUT$memoryImageHeight, OFFSET$memoryImageHeight);}
	public void memoryImageHeight(int value) {this.ptr.set(LAYOUT$memoryImageHeight, OFFSET$memoryImageHeight, value);}
	public java.lang.foreign.MemorySegment memoryImageHeight_ptr() {return this.ptr.asSlice(OFFSET$memoryImageHeight, LAYOUT$memoryImageHeight);}

	public vulkan.VkImageSubresourceLayers imageSubresource() {return new vulkan.VkImageSubresourceLayers(this.ptr.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));}

	public vulkan.VkOffset3D imageOffset() {return new vulkan.VkOffset3D(this.ptr.asSlice(OFFSET$imageOffset, LAYOUT$imageOffset));}

	public vulkan.VkExtent3D imageExtent() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));}
}

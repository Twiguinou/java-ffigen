package vulkan;

public record VkVideoReferenceSlotInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$slotIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$slotIndex = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pPictureResource = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pPictureResource = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$slotIndex,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pPictureResource
	).withName("VkVideoReferenceSlotInfoKHR");

	public VkVideoReferenceSlotInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int slotIndex() {return this.ptr.get(LAYOUT$slotIndex, OFFSET$slotIndex);}
	public void slotIndex(int value) {this.ptr.set(LAYOUT$slotIndex, OFFSET$slotIndex, value);}
	public java.lang.foreign.MemorySegment slotIndex_ptr() {return this.ptr.asSlice(OFFSET$slotIndex, LAYOUT$slotIndex);}

	public java.lang.foreign.MemorySegment pPictureResource() {return this.ptr.get(LAYOUT$pPictureResource, OFFSET$pPictureResource);}
	public void pPictureResource(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPictureResource, OFFSET$pPictureResource, value);}
	public java.lang.foreign.MemorySegment pPictureResource_ptr() {return this.ptr.asSlice(OFFSET$pPictureResource, LAYOUT$pPictureResource);}
}

package vulkan;

public record VkFramebufferAttachmentsCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentImageInfoCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$attachmentImageInfoCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pAttachmentImageInfos = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pAttachmentImageInfos = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$attachmentImageInfoCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pAttachmentImageInfos
	).withName("VkFramebufferAttachmentsCreateInfo");

	public VkFramebufferAttachmentsCreateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int attachmentImageInfoCount() {return this.ptr.get(LAYOUT$attachmentImageInfoCount, OFFSET$attachmentImageInfoCount);}
	public void attachmentImageInfoCount(int value) {this.ptr.set(LAYOUT$attachmentImageInfoCount, OFFSET$attachmentImageInfoCount, value);}
	public java.lang.foreign.MemorySegment attachmentImageInfoCount_ptr() {return this.ptr.asSlice(OFFSET$attachmentImageInfoCount, LAYOUT$attachmentImageInfoCount);}

	public java.lang.foreign.MemorySegment pAttachmentImageInfos() {return this.ptr.get(LAYOUT$pAttachmentImageInfos, OFFSET$pAttachmentImageInfos);}
	public void pAttachmentImageInfos(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAttachmentImageInfos, OFFSET$pAttachmentImageInfos, value);}
	public java.lang.foreign.MemorySegment pAttachmentImageInfos_ptr() {return this.ptr.asSlice(OFFSET$pAttachmentImageInfos, LAYOUT$pAttachmentImageInfos);}
}

package vulkan;

public record VkRenderPassAttachmentBeginInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$attachmentCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAttachments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAttachments = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$attachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pAttachments
    ).withName("VkRenderPassAttachmentBeginInfo");

    public VkRenderPassAttachmentBeginInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int attachmentCount() {return this.ptr.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);}
    public void attachmentCount(int value) {this.ptr.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);}
    public java.lang.foreign.MemorySegment attachmentCount_ptr() {return this.ptr.asSlice(OFFSET$attachmentCount, LAYOUT$attachmentCount);}

    public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT$pAttachments, OFFSET$pAttachments);}
    public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);}
    public java.lang.foreign.MemorySegment pAttachments_ptr() {return this.ptr.asSlice(OFFSET$pAttachments, LAYOUT$pAttachments);}
}

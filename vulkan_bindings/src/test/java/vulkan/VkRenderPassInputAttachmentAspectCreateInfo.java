package vulkan;

public record VkRenderPassInputAttachmentAspectCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectReferenceCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$aspectReferenceCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAspectReferences = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAspectReferences = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$aspectReferenceCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pAspectReferences
    ).withName("VkRenderPassInputAttachmentAspectCreateInfo");

    public VkRenderPassInputAttachmentAspectCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int aspectReferenceCount() {return this.ptr.get(LAYOUT$aspectReferenceCount, OFFSET$aspectReferenceCount);}
    public void aspectReferenceCount(int value) {this.ptr.set(LAYOUT$aspectReferenceCount, OFFSET$aspectReferenceCount, value);}
    public java.lang.foreign.MemorySegment aspectReferenceCount_ptr() {return this.ptr.asSlice(OFFSET$aspectReferenceCount, LAYOUT$aspectReferenceCount);}

    public java.lang.foreign.MemorySegment pAspectReferences() {return this.ptr.get(LAYOUT$pAspectReferences, OFFSET$pAspectReferences);}
    public void pAspectReferences(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAspectReferences, OFFSET$pAspectReferences, value);}
    public java.lang.foreign.MemorySegment pAspectReferences_ptr() {return this.ptr.asSlice(OFFSET$pAspectReferences, LAYOUT$pAspectReferences);}
}

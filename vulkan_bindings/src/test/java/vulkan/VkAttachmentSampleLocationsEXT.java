package vulkan;

public record VkAttachmentSampleLocationsEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$attachmentIndex = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$sampleLocationsInfo = vulkan.VkSampleLocationsInfoEXT.gStructLayout;
    public static final long OFFSET$sampleLocationsInfo = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$attachmentIndex,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$sampleLocationsInfo
    ).withName("VkAttachmentSampleLocationsEXT");

    public VkAttachmentSampleLocationsEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int attachmentIndex() {return this.ptr.get(LAYOUT$attachmentIndex, OFFSET$attachmentIndex);}
    public void attachmentIndex(int value) {this.ptr.set(LAYOUT$attachmentIndex, OFFSET$attachmentIndex, value);}
    public java.lang.foreign.MemorySegment attachmentIndex_ptr() {return this.ptr.asSlice(OFFSET$attachmentIndex, LAYOUT$attachmentIndex);}

    public vulkan.VkSampleLocationsInfoEXT sampleLocationsInfo() {return new vulkan.VkSampleLocationsInfoEXT(this.ptr.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));}
}

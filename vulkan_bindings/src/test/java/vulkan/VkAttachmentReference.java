package vulkan;

public record VkAttachmentReference(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$attachment = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$layout = 4L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$attachment,
            LAYOUT$layout
    ).withName("VkAttachmentReference");

    public VkAttachmentReference(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int attachment() {return this.ptr.get(LAYOUT$attachment, OFFSET$attachment);}
    public void attachment(int value) {this.ptr.set(LAYOUT$attachment, OFFSET$attachment, value);}
    public java.lang.foreign.MemorySegment attachment_ptr() {return this.ptr.asSlice(OFFSET$attachment, LAYOUT$attachment);}

    public int layout() {return this.ptr.get(LAYOUT$layout, OFFSET$layout);}
    public void layout(int value) {this.ptr.set(LAYOUT$layout, OFFSET$layout, value);}
    public java.lang.foreign.MemorySegment layout_ptr() {return this.ptr.asSlice(OFFSET$layout, LAYOUT$layout);}
}

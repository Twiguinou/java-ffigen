package vulkan;

public record VkInputAttachmentAspectReference(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subpass = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subpass = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inputAttachmentIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$inputAttachmentIndex = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspectMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$aspectMask = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$subpass,
            LAYOUT$inputAttachmentIndex,
            LAYOUT$aspectMask
    ).withName("VkInputAttachmentAspectReference");

    public VkInputAttachmentAspectReference(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int subpass() {return this.ptr.get(LAYOUT$subpass, OFFSET$subpass);}
    public void subpass(int value) {this.ptr.set(LAYOUT$subpass, OFFSET$subpass, value);}
    public java.lang.foreign.MemorySegment subpass_ptr() {return this.ptr.asSlice(OFFSET$subpass, LAYOUT$subpass);}

    public int inputAttachmentIndex() {return this.ptr.get(LAYOUT$inputAttachmentIndex, OFFSET$inputAttachmentIndex);}
    public void inputAttachmentIndex(int value) {this.ptr.set(LAYOUT$inputAttachmentIndex, OFFSET$inputAttachmentIndex, value);}
    public java.lang.foreign.MemorySegment inputAttachmentIndex_ptr() {return this.ptr.asSlice(OFFSET$inputAttachmentIndex, LAYOUT$inputAttachmentIndex);}

    public int aspectMask() {return this.ptr.get(LAYOUT$aspectMask, OFFSET$aspectMask);}
    public void aspectMask(int value) {this.ptr.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);}
    public java.lang.foreign.MemorySegment aspectMask_ptr() {return this.ptr.asSlice(OFFSET$aspectMask, LAYOUT$aspectMask);}
}

package vulkan;

public record VkSubpassDescription(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pipelineBindPoint = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inputAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$inputAttachmentCount = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pInputAttachments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pInputAttachments = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$colorAttachmentCount = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pColorAttachments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pColorAttachments = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pResolveAttachments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pResolveAttachments = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDepthStencilAttachment = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDepthStencilAttachment = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$preserveAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$preserveAttachmentCount = 56L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pPreserveAttachments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pPreserveAttachments = 64L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$pipelineBindPoint,
            LAYOUT$inputAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pInputAttachments,
            LAYOUT$colorAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pColorAttachments,
            LAYOUT$pResolveAttachments,
            LAYOUT$pDepthStencilAttachment,
            LAYOUT$preserveAttachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pPreserveAttachments
    ).withName("VkSubpassDescription");

    public VkSubpassDescription(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int pipelineBindPoint() {return this.ptr.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);}
    public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);}
    public java.lang.foreign.MemorySegment pipelineBindPoint_ptr() {return this.ptr.asSlice(OFFSET$pipelineBindPoint, LAYOUT$pipelineBindPoint);}

    public int inputAttachmentCount() {return this.ptr.get(LAYOUT$inputAttachmentCount, OFFSET$inputAttachmentCount);}
    public void inputAttachmentCount(int value) {this.ptr.set(LAYOUT$inputAttachmentCount, OFFSET$inputAttachmentCount, value);}
    public java.lang.foreign.MemorySegment inputAttachmentCount_ptr() {return this.ptr.asSlice(OFFSET$inputAttachmentCount, LAYOUT$inputAttachmentCount);}

    public java.lang.foreign.MemorySegment pInputAttachments() {return this.ptr.get(LAYOUT$pInputAttachments, OFFSET$pInputAttachments);}
    public void pInputAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pInputAttachments, OFFSET$pInputAttachments, value);}
    public java.lang.foreign.MemorySegment pInputAttachments_ptr() {return this.ptr.asSlice(OFFSET$pInputAttachments, LAYOUT$pInputAttachments);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment colorAttachmentCount_ptr() {return this.ptr.asSlice(OFFSET$colorAttachmentCount, LAYOUT$colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachments() {return this.ptr.get(LAYOUT$pColorAttachments, OFFSET$pColorAttachments);}
    public void pColorAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pColorAttachments, OFFSET$pColorAttachments, value);}
    public java.lang.foreign.MemorySegment pColorAttachments_ptr() {return this.ptr.asSlice(OFFSET$pColorAttachments, LAYOUT$pColorAttachments);}

    public java.lang.foreign.MemorySegment pResolveAttachments() {return this.ptr.get(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments);}
    public void pResolveAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pResolveAttachments, OFFSET$pResolveAttachments, value);}
    public java.lang.foreign.MemorySegment pResolveAttachments_ptr() {return this.ptr.asSlice(OFFSET$pResolveAttachments, LAYOUT$pResolveAttachments);}

    public java.lang.foreign.MemorySegment pDepthStencilAttachment() {return this.ptr.get(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment);}
    public void pDepthStencilAttachment(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDepthStencilAttachment, OFFSET$pDepthStencilAttachment, value);}
    public java.lang.foreign.MemorySegment pDepthStencilAttachment_ptr() {return this.ptr.asSlice(OFFSET$pDepthStencilAttachment, LAYOUT$pDepthStencilAttachment);}

    public int preserveAttachmentCount() {return this.ptr.get(LAYOUT$preserveAttachmentCount, OFFSET$preserveAttachmentCount);}
    public void preserveAttachmentCount(int value) {this.ptr.set(LAYOUT$preserveAttachmentCount, OFFSET$preserveAttachmentCount, value);}
    public java.lang.foreign.MemorySegment preserveAttachmentCount_ptr() {return this.ptr.asSlice(OFFSET$preserveAttachmentCount, LAYOUT$preserveAttachmentCount);}

    public java.lang.foreign.MemorySegment pPreserveAttachments() {return this.ptr.get(LAYOUT$pPreserveAttachments, OFFSET$pPreserveAttachments);}
    public void pPreserveAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPreserveAttachments, OFFSET$pPreserveAttachments, value);}
    public java.lang.foreign.MemorySegment pPreserveAttachments_ptr() {return this.ptr.asSlice(OFFSET$pPreserveAttachments, LAYOUT$pPreserveAttachments);}
}

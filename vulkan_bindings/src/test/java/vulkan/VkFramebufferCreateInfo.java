package vulkan;

public record VkFramebufferCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$renderPass = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$renderPass = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$attachmentCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAttachments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAttachments = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$width = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$height = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$layers = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$renderPass,
            LAYOUT$attachmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pAttachments,
            LAYOUT$width,
            LAYOUT$height,
            LAYOUT$layers,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkFramebufferCreateInfo");

    public VkFramebufferCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment renderPass() {return this.ptr.get(LAYOUT$renderPass, OFFSET$renderPass);}
    public void renderPass(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$renderPass, OFFSET$renderPass, value);}
    public java.lang.foreign.MemorySegment renderPass_ptr() {return this.ptr.asSlice(OFFSET$renderPass, LAYOUT$renderPass);}

    public int attachmentCount() {return this.ptr.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);}
    public void attachmentCount(int value) {this.ptr.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);}
    public java.lang.foreign.MemorySegment attachmentCount_ptr() {return this.ptr.asSlice(OFFSET$attachmentCount, LAYOUT$attachmentCount);}

    public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT$pAttachments, OFFSET$pAttachments);}
    public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);}
    public java.lang.foreign.MemorySegment pAttachments_ptr() {return this.ptr.asSlice(OFFSET$pAttachments, LAYOUT$pAttachments);}

    public int width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
    public void width(int value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
    public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

    public int height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(int value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public int layers() {return this.ptr.get(LAYOUT$layers, OFFSET$layers);}
    public void layers(int value) {this.ptr.set(LAYOUT$layers, OFFSET$layers, value);}
    public java.lang.foreign.MemorySegment layers_ptr() {return this.ptr.asSlice(OFFSET$layers, LAYOUT$layers);}
}

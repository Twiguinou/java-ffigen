package vulkan;

public record VkPipelineRenderingCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$viewMask = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorAttachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$colorAttachmentCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pColorAttachmentFormats = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pColorAttachmentFormats = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthAttachmentFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthAttachmentFormat = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stencilAttachmentFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stencilAttachmentFormat = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$viewMask,
            LAYOUT$colorAttachmentCount,
            LAYOUT$pColorAttachmentFormats,
            LAYOUT$depthAttachmentFormat,
            LAYOUT$stencilAttachmentFormat
    ).withName("VkPipelineRenderingCreateInfo");

    public VkPipelineRenderingCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int viewMask() {return this.ptr.get(LAYOUT$viewMask, OFFSET$viewMask);}
    public void viewMask(int value) {this.ptr.set(LAYOUT$viewMask, OFFSET$viewMask, value);}
    public java.lang.foreign.MemorySegment viewMask_ptr() {return this.ptr.asSlice(OFFSET$viewMask, LAYOUT$viewMask);}

    public int colorAttachmentCount() {return this.ptr.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);}
    public void colorAttachmentCount(int value) {this.ptr.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);}
    public java.lang.foreign.MemorySegment colorAttachmentCount_ptr() {return this.ptr.asSlice(OFFSET$colorAttachmentCount, LAYOUT$colorAttachmentCount);}

    public java.lang.foreign.MemorySegment pColorAttachmentFormats() {return this.ptr.get(LAYOUT$pColorAttachmentFormats, OFFSET$pColorAttachmentFormats);}
    public void pColorAttachmentFormats(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pColorAttachmentFormats, OFFSET$pColorAttachmentFormats, value);}
    public java.lang.foreign.MemorySegment pColorAttachmentFormats_ptr() {return this.ptr.asSlice(OFFSET$pColorAttachmentFormats, LAYOUT$pColorAttachmentFormats);}

    public int depthAttachmentFormat() {return this.ptr.get(LAYOUT$depthAttachmentFormat, OFFSET$depthAttachmentFormat);}
    public void depthAttachmentFormat(int value) {this.ptr.set(LAYOUT$depthAttachmentFormat, OFFSET$depthAttachmentFormat, value);}
    public java.lang.foreign.MemorySegment depthAttachmentFormat_ptr() {return this.ptr.asSlice(OFFSET$depthAttachmentFormat, LAYOUT$depthAttachmentFormat);}

    public int stencilAttachmentFormat() {return this.ptr.get(LAYOUT$stencilAttachmentFormat, OFFSET$stencilAttachmentFormat);}
    public void stencilAttachmentFormat(int value) {this.ptr.set(LAYOUT$stencilAttachmentFormat, OFFSET$stencilAttachmentFormat, value);}
    public java.lang.foreign.MemorySegment stencilAttachmentFormat_ptr() {return this.ptr.asSlice(OFFSET$stencilAttachmentFormat, LAYOUT$stencilAttachmentFormat);}
}

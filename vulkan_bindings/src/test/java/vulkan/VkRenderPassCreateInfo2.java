package vulkan;

public record VkRenderPassCreateInfo2(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$attachmentCount = 20L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pAttachments = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pAttachments = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subpassCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subpassCount = 32L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSubpasses = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSubpasses = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dependencyCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dependencyCount = 48L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDependencies = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDependencies = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$correlatedViewMaskCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$correlatedViewMaskCount = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pCorrelatedViewMasks = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pCorrelatedViewMasks = 72L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$attachmentCount,
            LAYOUT$pAttachments,
            LAYOUT$subpassCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSubpasses,
            LAYOUT$dependencyCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDependencies,
            LAYOUT$correlatedViewMaskCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pCorrelatedViewMasks
    ).withName("VkRenderPassCreateInfo2");

    public VkRenderPassCreateInfo2(java.lang.foreign.SegmentAllocator allocator)
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

    public int attachmentCount() {return this.ptr.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);}
    public void attachmentCount(int value) {this.ptr.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);}
    public java.lang.foreign.MemorySegment attachmentCount_ptr() {return this.ptr.asSlice(OFFSET$attachmentCount, LAYOUT$attachmentCount);}

    public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT$pAttachments, OFFSET$pAttachments);}
    public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);}
    public java.lang.foreign.MemorySegment pAttachments_ptr() {return this.ptr.asSlice(OFFSET$pAttachments, LAYOUT$pAttachments);}

    public int subpassCount() {return this.ptr.get(LAYOUT$subpassCount, OFFSET$subpassCount);}
    public void subpassCount(int value) {this.ptr.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);}
    public java.lang.foreign.MemorySegment subpassCount_ptr() {return this.ptr.asSlice(OFFSET$subpassCount, LAYOUT$subpassCount);}

    public java.lang.foreign.MemorySegment pSubpasses() {return this.ptr.get(LAYOUT$pSubpasses, OFFSET$pSubpasses);}
    public void pSubpasses(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSubpasses, OFFSET$pSubpasses, value);}
    public java.lang.foreign.MemorySegment pSubpasses_ptr() {return this.ptr.asSlice(OFFSET$pSubpasses, LAYOUT$pSubpasses);}

    public int dependencyCount() {return this.ptr.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);}
    public void dependencyCount(int value) {this.ptr.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);}
    public java.lang.foreign.MemorySegment dependencyCount_ptr() {return this.ptr.asSlice(OFFSET$dependencyCount, LAYOUT$dependencyCount);}

    public java.lang.foreign.MemorySegment pDependencies() {return this.ptr.get(LAYOUT$pDependencies, OFFSET$pDependencies);}
    public void pDependencies(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDependencies, OFFSET$pDependencies, value);}
    public java.lang.foreign.MemorySegment pDependencies_ptr() {return this.ptr.asSlice(OFFSET$pDependencies, LAYOUT$pDependencies);}

    public int correlatedViewMaskCount() {return this.ptr.get(LAYOUT$correlatedViewMaskCount, OFFSET$correlatedViewMaskCount);}
    public void correlatedViewMaskCount(int value) {this.ptr.set(LAYOUT$correlatedViewMaskCount, OFFSET$correlatedViewMaskCount, value);}
    public java.lang.foreign.MemorySegment correlatedViewMaskCount_ptr() {return this.ptr.asSlice(OFFSET$correlatedViewMaskCount, LAYOUT$correlatedViewMaskCount);}

    public java.lang.foreign.MemorySegment pCorrelatedViewMasks() {return this.ptr.get(LAYOUT$pCorrelatedViewMasks, OFFSET$pCorrelatedViewMasks);}
    public void pCorrelatedViewMasks(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCorrelatedViewMasks, OFFSET$pCorrelatedViewMasks, value);}
    public java.lang.foreign.MemorySegment pCorrelatedViewMasks_ptr() {return this.ptr.asSlice(OFFSET$pCorrelatedViewMasks, LAYOUT$pCorrelatedViewMasks);}
}

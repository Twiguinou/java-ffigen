package vulkan;

public record VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$advancedBlendMaxColorAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$advancedBlendMaxColorAttachments = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$advancedBlendIndependentBlend = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$advancedBlendIndependentBlend = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$advancedBlendNonPremultipliedSrcColor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$advancedBlendNonPremultipliedSrcColor = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$advancedBlendNonPremultipliedDstColor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$advancedBlendNonPremultipliedDstColor = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$advancedBlendCorrelatedOverlap = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$advancedBlendCorrelatedOverlap = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$advancedBlendAllOperations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$advancedBlendAllOperations = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$advancedBlendMaxColorAttachments,
            LAYOUT$advancedBlendIndependentBlend,
            LAYOUT$advancedBlendNonPremultipliedSrcColor,
            LAYOUT$advancedBlendNonPremultipliedDstColor,
            LAYOUT$advancedBlendCorrelatedOverlap,
            LAYOUT$advancedBlendAllOperations
    ).withName("VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT");

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int advancedBlendMaxColorAttachments() {return this.ptr.get(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments);}
    public void advancedBlendMaxColorAttachments(int value) {this.ptr.set(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments, value);}
    public java.lang.foreign.MemorySegment advancedBlendMaxColorAttachments_ptr() {return this.ptr.asSlice(OFFSET$advancedBlendMaxColorAttachments, LAYOUT$advancedBlendMaxColorAttachments);}

    public int advancedBlendIndependentBlend() {return this.ptr.get(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend);}
    public void advancedBlendIndependentBlend(int value) {this.ptr.set(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend, value);}
    public java.lang.foreign.MemorySegment advancedBlendIndependentBlend_ptr() {return this.ptr.asSlice(OFFSET$advancedBlendIndependentBlend, LAYOUT$advancedBlendIndependentBlend);}

    public int advancedBlendNonPremultipliedSrcColor() {return this.ptr.get(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor);}
    public void advancedBlendNonPremultipliedSrcColor(int value) {this.ptr.set(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor, value);}
    public java.lang.foreign.MemorySegment advancedBlendNonPremultipliedSrcColor_ptr() {return this.ptr.asSlice(OFFSET$advancedBlendNonPremultipliedSrcColor, LAYOUT$advancedBlendNonPremultipliedSrcColor);}

    public int advancedBlendNonPremultipliedDstColor() {return this.ptr.get(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor);}
    public void advancedBlendNonPremultipliedDstColor(int value) {this.ptr.set(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor, value);}
    public java.lang.foreign.MemorySegment advancedBlendNonPremultipliedDstColor_ptr() {return this.ptr.asSlice(OFFSET$advancedBlendNonPremultipliedDstColor, LAYOUT$advancedBlendNonPremultipliedDstColor);}

    public int advancedBlendCorrelatedOverlap() {return this.ptr.get(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap);}
    public void advancedBlendCorrelatedOverlap(int value) {this.ptr.set(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap, value);}
    public java.lang.foreign.MemorySegment advancedBlendCorrelatedOverlap_ptr() {return this.ptr.asSlice(OFFSET$advancedBlendCorrelatedOverlap, LAYOUT$advancedBlendCorrelatedOverlap);}

    public int advancedBlendAllOperations() {return this.ptr.get(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations);}
    public void advancedBlendAllOperations(int value) {this.ptr.set(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations, value);}
    public java.lang.foreign.MemorySegment advancedBlendAllOperations_ptr() {return this.ptr.asSlice(OFFSET$advancedBlendAllOperations, LAYOUT$advancedBlendAllOperations);}
}

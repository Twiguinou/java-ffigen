package vulkan;

public record VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$graphicsPipelineLibraryFastLinking = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$graphicsPipelineLibraryFastLinking = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$graphicsPipelineLibraryFastLinking,
            LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration
    ).withName("VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT");

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int graphicsPipelineLibraryFastLinking() {return this.ptr.get(LAYOUT$graphicsPipelineLibraryFastLinking, OFFSET$graphicsPipelineLibraryFastLinking);}
    public void graphicsPipelineLibraryFastLinking(int value) {this.ptr.set(LAYOUT$graphicsPipelineLibraryFastLinking, OFFSET$graphicsPipelineLibraryFastLinking, value);}
    public java.lang.foreign.MemorySegment graphicsPipelineLibraryFastLinking_ptr() {return this.ptr.asSlice(OFFSET$graphicsPipelineLibraryFastLinking, LAYOUT$graphicsPipelineLibraryFastLinking);}

    public int graphicsPipelineLibraryIndependentInterpolationDecoration() {return this.ptr.get(LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration);}
    public void graphicsPipelineLibraryIndependentInterpolationDecoration(int value) {this.ptr.set(LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration, value);}
    public java.lang.foreign.MemorySegment graphicsPipelineLibraryIndependentInterpolationDecoration_ptr() {return this.ptr.asSlice(OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration, LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration);}
}

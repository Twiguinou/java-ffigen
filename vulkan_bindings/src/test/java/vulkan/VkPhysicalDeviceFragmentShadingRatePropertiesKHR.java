package vulkan;

public record VkPhysicalDeviceFragmentShadingRatePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minFragmentShadingRateAttachmentTexelSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$minFragmentShadingRateAttachmentTexelSize = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxFragmentShadingRateAttachmentTexelSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxFragmentShadingRateAttachmentTexelSize = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentShadingRateAttachmentTexelSizeAspectRatio = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveFragmentShadingRateWithMultipleViewports = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$primitiveFragmentShadingRateWithMultipleViewports = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$layeredShadingRateAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$layeredShadingRateAttachments = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateNonTrivialCombinerOps = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateNonTrivialCombinerOps = 44L;
    public static final java.lang.foreign.GroupLayout LAYOUT$maxFragmentSize = vulkan.VkExtent2D.gStructLayout;
    public static final long OFFSET$maxFragmentSize = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentSizeAspectRatio = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentSizeAspectRatio = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentShadingRateCoverageSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentShadingRateCoverageSamples = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentShadingRateRasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentShadingRateRasterizationSamples = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateWithShaderDepthStencilWrites = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateWithSampleMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateWithSampleMask = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateWithShaderSampleMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateWithShaderSampleMask = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateWithConservativeRasterization = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateWithConservativeRasterization = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateWithFragmentShaderInterlock = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateWithFragmentShaderInterlock = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateWithCustomSampleLocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateWithCustomSampleLocations = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentShadingRateStrictMultiplyCombiner = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$fragmentShadingRateStrictMultiplyCombiner = 92L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$minFragmentShadingRateAttachmentTexelSize,
            LAYOUT$maxFragmentShadingRateAttachmentTexelSize,
            LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio,
            LAYOUT$primitiveFragmentShadingRateWithMultipleViewports,
            LAYOUT$layeredShadingRateAttachments,
            LAYOUT$fragmentShadingRateNonTrivialCombinerOps,
            LAYOUT$maxFragmentSize,
            LAYOUT$maxFragmentSizeAspectRatio,
            LAYOUT$maxFragmentShadingRateCoverageSamples,
            LAYOUT$maxFragmentShadingRateRasterizationSamples,
            LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites,
            LAYOUT$fragmentShadingRateWithSampleMask,
            LAYOUT$fragmentShadingRateWithShaderSampleMask,
            LAYOUT$fragmentShadingRateWithConservativeRasterization,
            LAYOUT$fragmentShadingRateWithFragmentShaderInterlock,
            LAYOUT$fragmentShadingRateWithCustomSampleLocations,
            LAYOUT$fragmentShadingRateStrictMultiplyCombiner
    ).withName("VkPhysicalDeviceFragmentShadingRatePropertiesKHR");

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public vulkan.VkExtent2D minFragmentShadingRateAttachmentTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$minFragmentShadingRateAttachmentTexelSize, LAYOUT$minFragmentShadingRateAttachmentTexelSize));}

    public vulkan.VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxFragmentShadingRateAttachmentTexelSize, LAYOUT$maxFragmentShadingRateAttachmentTexelSize));}

    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {return this.ptr.get(LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, OFFSET$maxFragmentShadingRateAttachmentTexelSizeAspectRatio);}
    public void maxFragmentShadingRateAttachmentTexelSizeAspectRatio(int value) {this.ptr.set(LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, OFFSET$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, value);}
    public java.lang.foreign.MemorySegment maxFragmentShadingRateAttachmentTexelSizeAspectRatio_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, LAYOUT$maxFragmentShadingRateAttachmentTexelSizeAspectRatio);}

    public int primitiveFragmentShadingRateWithMultipleViewports() {return this.ptr.get(LAYOUT$primitiveFragmentShadingRateWithMultipleViewports, OFFSET$primitiveFragmentShadingRateWithMultipleViewports);}
    public void primitiveFragmentShadingRateWithMultipleViewports(int value) {this.ptr.set(LAYOUT$primitiveFragmentShadingRateWithMultipleViewports, OFFSET$primitiveFragmentShadingRateWithMultipleViewports, value);}
    public java.lang.foreign.MemorySegment primitiveFragmentShadingRateWithMultipleViewports_ptr() {return this.ptr.asSlice(OFFSET$primitiveFragmentShadingRateWithMultipleViewports, LAYOUT$primitiveFragmentShadingRateWithMultipleViewports);}

    public int layeredShadingRateAttachments() {return this.ptr.get(LAYOUT$layeredShadingRateAttachments, OFFSET$layeredShadingRateAttachments);}
    public void layeredShadingRateAttachments(int value) {this.ptr.set(LAYOUT$layeredShadingRateAttachments, OFFSET$layeredShadingRateAttachments, value);}
    public java.lang.foreign.MemorySegment layeredShadingRateAttachments_ptr() {return this.ptr.asSlice(OFFSET$layeredShadingRateAttachments, LAYOUT$layeredShadingRateAttachments);}

    public int fragmentShadingRateNonTrivialCombinerOps() {return this.ptr.get(LAYOUT$fragmentShadingRateNonTrivialCombinerOps, OFFSET$fragmentShadingRateNonTrivialCombinerOps);}
    public void fragmentShadingRateNonTrivialCombinerOps(int value) {this.ptr.set(LAYOUT$fragmentShadingRateNonTrivialCombinerOps, OFFSET$fragmentShadingRateNonTrivialCombinerOps, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateNonTrivialCombinerOps_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateNonTrivialCombinerOps, LAYOUT$fragmentShadingRateNonTrivialCombinerOps);}

    public vulkan.VkExtent2D maxFragmentSize() {return new vulkan.VkExtent2D(this.ptr.asSlice(OFFSET$maxFragmentSize, LAYOUT$maxFragmentSize));}

    public int maxFragmentSizeAspectRatio() {return this.ptr.get(LAYOUT$maxFragmentSizeAspectRatio, OFFSET$maxFragmentSizeAspectRatio);}
    public void maxFragmentSizeAspectRatio(int value) {this.ptr.set(LAYOUT$maxFragmentSizeAspectRatio, OFFSET$maxFragmentSizeAspectRatio, value);}
    public java.lang.foreign.MemorySegment maxFragmentSizeAspectRatio_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentSizeAspectRatio, LAYOUT$maxFragmentSizeAspectRatio);}

    public int maxFragmentShadingRateCoverageSamples() {return this.ptr.get(LAYOUT$maxFragmentShadingRateCoverageSamples, OFFSET$maxFragmentShadingRateCoverageSamples);}
    public void maxFragmentShadingRateCoverageSamples(int value) {this.ptr.set(LAYOUT$maxFragmentShadingRateCoverageSamples, OFFSET$maxFragmentShadingRateCoverageSamples, value);}
    public java.lang.foreign.MemorySegment maxFragmentShadingRateCoverageSamples_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentShadingRateCoverageSamples, LAYOUT$maxFragmentShadingRateCoverageSamples);}

    public int maxFragmentShadingRateRasterizationSamples() {return this.ptr.get(LAYOUT$maxFragmentShadingRateRasterizationSamples, OFFSET$maxFragmentShadingRateRasterizationSamples);}
    public void maxFragmentShadingRateRasterizationSamples(int value) {this.ptr.set(LAYOUT$maxFragmentShadingRateRasterizationSamples, OFFSET$maxFragmentShadingRateRasterizationSamples, value);}
    public java.lang.foreign.MemorySegment maxFragmentShadingRateRasterizationSamples_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentShadingRateRasterizationSamples, LAYOUT$maxFragmentShadingRateRasterizationSamples);}

    public int fragmentShadingRateWithShaderDepthStencilWrites() {return this.ptr.get(LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites, OFFSET$fragmentShadingRateWithShaderDepthStencilWrites);}
    public void fragmentShadingRateWithShaderDepthStencilWrites(int value) {this.ptr.set(LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites, OFFSET$fragmentShadingRateWithShaderDepthStencilWrites, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateWithShaderDepthStencilWrites_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateWithShaderDepthStencilWrites, LAYOUT$fragmentShadingRateWithShaderDepthStencilWrites);}

    public int fragmentShadingRateWithSampleMask() {return this.ptr.get(LAYOUT$fragmentShadingRateWithSampleMask, OFFSET$fragmentShadingRateWithSampleMask);}
    public void fragmentShadingRateWithSampleMask(int value) {this.ptr.set(LAYOUT$fragmentShadingRateWithSampleMask, OFFSET$fragmentShadingRateWithSampleMask, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateWithSampleMask_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateWithSampleMask, LAYOUT$fragmentShadingRateWithSampleMask);}

    public int fragmentShadingRateWithShaderSampleMask() {return this.ptr.get(LAYOUT$fragmentShadingRateWithShaderSampleMask, OFFSET$fragmentShadingRateWithShaderSampleMask);}
    public void fragmentShadingRateWithShaderSampleMask(int value) {this.ptr.set(LAYOUT$fragmentShadingRateWithShaderSampleMask, OFFSET$fragmentShadingRateWithShaderSampleMask, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateWithShaderSampleMask_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateWithShaderSampleMask, LAYOUT$fragmentShadingRateWithShaderSampleMask);}

    public int fragmentShadingRateWithConservativeRasterization() {return this.ptr.get(LAYOUT$fragmentShadingRateWithConservativeRasterization, OFFSET$fragmentShadingRateWithConservativeRasterization);}
    public void fragmentShadingRateWithConservativeRasterization(int value) {this.ptr.set(LAYOUT$fragmentShadingRateWithConservativeRasterization, OFFSET$fragmentShadingRateWithConservativeRasterization, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateWithConservativeRasterization_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateWithConservativeRasterization, LAYOUT$fragmentShadingRateWithConservativeRasterization);}

    public int fragmentShadingRateWithFragmentShaderInterlock() {return this.ptr.get(LAYOUT$fragmentShadingRateWithFragmentShaderInterlock, OFFSET$fragmentShadingRateWithFragmentShaderInterlock);}
    public void fragmentShadingRateWithFragmentShaderInterlock(int value) {this.ptr.set(LAYOUT$fragmentShadingRateWithFragmentShaderInterlock, OFFSET$fragmentShadingRateWithFragmentShaderInterlock, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateWithFragmentShaderInterlock_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateWithFragmentShaderInterlock, LAYOUT$fragmentShadingRateWithFragmentShaderInterlock);}

    public int fragmentShadingRateWithCustomSampleLocations() {return this.ptr.get(LAYOUT$fragmentShadingRateWithCustomSampleLocations, OFFSET$fragmentShadingRateWithCustomSampleLocations);}
    public void fragmentShadingRateWithCustomSampleLocations(int value) {this.ptr.set(LAYOUT$fragmentShadingRateWithCustomSampleLocations, OFFSET$fragmentShadingRateWithCustomSampleLocations, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateWithCustomSampleLocations_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateWithCustomSampleLocations, LAYOUT$fragmentShadingRateWithCustomSampleLocations);}

    public int fragmentShadingRateStrictMultiplyCombiner() {return this.ptr.get(LAYOUT$fragmentShadingRateStrictMultiplyCombiner, OFFSET$fragmentShadingRateStrictMultiplyCombiner);}
    public void fragmentShadingRateStrictMultiplyCombiner(int value) {this.ptr.set(LAYOUT$fragmentShadingRateStrictMultiplyCombiner, OFFSET$fragmentShadingRateStrictMultiplyCombiner, value);}
    public java.lang.foreign.MemorySegment fragmentShadingRateStrictMultiplyCombiner_ptr() {return this.ptr.asSlice(OFFSET$fragmentShadingRateStrictMultiplyCombiner, LAYOUT$fragmentShadingRateStrictMultiplyCombiner);}
}

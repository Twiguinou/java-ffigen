package vulkan;

public record VkPhysicalDeviceDescriptorIndexingProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxUpdateAfterBindDescriptorsInAllPools = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxUpdateAfterBindDescriptorsInAllPools = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderUniformBufferArrayNonUniformIndexingNative = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSampledImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSampledImageArrayNonUniformIndexingNative = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderStorageBufferArrayNonUniformIndexingNative = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderStorageImageArrayNonUniformIndexingNative = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$robustBufferAccessUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$robustBufferAccessUpdateAfterBind = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$quadDivergentImplicitLod = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$quadDivergentImplicitLod = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageUpdateAfterBindResources = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageUpdateAfterBindResources = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindSamplers = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = 92L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindSampledImages = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageImages = 100L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments = 104L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxUpdateAfterBindDescriptorsInAllPools,
            LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative,
            LAYOUT$shaderSampledImageArrayNonUniformIndexingNative,
            LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative,
            LAYOUT$shaderStorageImageArrayNonUniformIndexingNative,
            LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative,
            LAYOUT$robustBufferAccessUpdateAfterBind,
            LAYOUT$quadDivergentImplicitLod,
            LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers,
            LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers,
            LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers,
            LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages,
            LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages,
            LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments,
            LAYOUT$maxPerStageUpdateAfterBindResources,
            LAYOUT$maxDescriptorSetUpdateAfterBindSamplers,
            LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers,
            LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic,
            LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers,
            LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic,
            LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages,
            LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages,
            LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceDescriptorIndexingProperties");

    public VkPhysicalDeviceDescriptorIndexingProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxUpdateAfterBindDescriptorsInAllPools() {return this.ptr.get(LAYOUT$maxUpdateAfterBindDescriptorsInAllPools, OFFSET$maxUpdateAfterBindDescriptorsInAllPools);}
    public void maxUpdateAfterBindDescriptorsInAllPools(int value) {this.ptr.set(LAYOUT$maxUpdateAfterBindDescriptorsInAllPools, OFFSET$maxUpdateAfterBindDescriptorsInAllPools, value);}
    public java.lang.foreign.MemorySegment maxUpdateAfterBindDescriptorsInAllPools_ptr() {return this.ptr.asSlice(OFFSET$maxUpdateAfterBindDescriptorsInAllPools, LAYOUT$maxUpdateAfterBindDescriptorsInAllPools);}

    public int shaderUniformBufferArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative, OFFSET$shaderUniformBufferArrayNonUniformIndexingNative);}
    public void shaderUniformBufferArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative, OFFSET$shaderUniformBufferArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment shaderUniformBufferArrayNonUniformIndexingNative_ptr() {return this.ptr.asSlice(OFFSET$shaderUniformBufferArrayNonUniformIndexingNative, LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative);}

    public int shaderSampledImageArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT$shaderSampledImageArrayNonUniformIndexingNative, OFFSET$shaderSampledImageArrayNonUniformIndexingNative);}
    public void shaderSampledImageArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT$shaderSampledImageArrayNonUniformIndexingNative, OFFSET$shaderSampledImageArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment shaderSampledImageArrayNonUniformIndexingNative_ptr() {return this.ptr.asSlice(OFFSET$shaderSampledImageArrayNonUniformIndexingNative, LAYOUT$shaderSampledImageArrayNonUniformIndexingNative);}

    public int shaderStorageBufferArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative, OFFSET$shaderStorageBufferArrayNonUniformIndexingNative);}
    public void shaderStorageBufferArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative, OFFSET$shaderStorageBufferArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment shaderStorageBufferArrayNonUniformIndexingNative_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageBufferArrayNonUniformIndexingNative, LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative);}

    public int shaderStorageImageArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT$shaderStorageImageArrayNonUniformIndexingNative, OFFSET$shaderStorageImageArrayNonUniformIndexingNative);}
    public void shaderStorageImageArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT$shaderStorageImageArrayNonUniformIndexingNative, OFFSET$shaderStorageImageArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment shaderStorageImageArrayNonUniformIndexingNative_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageImageArrayNonUniformIndexingNative, LAYOUT$shaderStorageImageArrayNonUniformIndexingNative);}

    public int shaderInputAttachmentArrayNonUniformIndexingNative() {return this.ptr.get(LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative, OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative);}
    public void shaderInputAttachmentArrayNonUniformIndexingNative(int value) {this.ptr.set(LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative, OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative, value);}
    public java.lang.foreign.MemorySegment shaderInputAttachmentArrayNonUniformIndexingNative_ptr() {return this.ptr.asSlice(OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative, LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative);}

    public int robustBufferAccessUpdateAfterBind() {return this.ptr.get(LAYOUT$robustBufferAccessUpdateAfterBind, OFFSET$robustBufferAccessUpdateAfterBind);}
    public void robustBufferAccessUpdateAfterBind(int value) {this.ptr.set(LAYOUT$robustBufferAccessUpdateAfterBind, OFFSET$robustBufferAccessUpdateAfterBind, value);}
    public java.lang.foreign.MemorySegment robustBufferAccessUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$robustBufferAccessUpdateAfterBind, LAYOUT$robustBufferAccessUpdateAfterBind);}

    public int quadDivergentImplicitLod() {return this.ptr.get(LAYOUT$quadDivergentImplicitLod, OFFSET$quadDivergentImplicitLod);}
    public void quadDivergentImplicitLod(int value) {this.ptr.set(LAYOUT$quadDivergentImplicitLod, OFFSET$quadDivergentImplicitLod, value);}
    public java.lang.foreign.MemorySegment quadDivergentImplicitLod_ptr() {return this.ptr.asSlice(OFFSET$quadDivergentImplicitLod, LAYOUT$quadDivergentImplicitLod);}

    public int maxPerStageDescriptorUpdateAfterBindSamplers() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers, OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers);}
    public void maxPerStageDescriptorUpdateAfterBindSamplers(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers, OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindSamplers_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers, LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers);}

    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers);}
    public void maxPerStageDescriptorUpdateAfterBindUniformBuffers(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindUniformBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers, LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers);}

    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers);}
    public void maxPerStageDescriptorUpdateAfterBindStorageBuffers(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindStorageBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers, LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers);}

    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages, OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages);}
    public void maxPerStageDescriptorUpdateAfterBindSampledImages(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages, OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindSampledImages_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages, LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages);}

    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages);}
    public void maxPerStageDescriptorUpdateAfterBindStorageImages(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages, OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindStorageImages_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages, LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages);}

    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments, OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments);}
    public void maxPerStageDescriptorUpdateAfterBindInputAttachments(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments, OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindInputAttachments_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments, LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments);}

    public int maxPerStageUpdateAfterBindResources() {return this.ptr.get(LAYOUT$maxPerStageUpdateAfterBindResources, OFFSET$maxPerStageUpdateAfterBindResources);}
    public void maxPerStageUpdateAfterBindResources(int value) {this.ptr.set(LAYOUT$maxPerStageUpdateAfterBindResources, OFFSET$maxPerStageUpdateAfterBindResources, value);}
    public java.lang.foreign.MemorySegment maxPerStageUpdateAfterBindResources_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageUpdateAfterBindResources, LAYOUT$maxPerStageUpdateAfterBindResources);}

    public int maxDescriptorSetUpdateAfterBindSamplers() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindSamplers, OFFSET$maxDescriptorSetUpdateAfterBindSamplers);}
    public void maxDescriptorSetUpdateAfterBindSamplers(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindSamplers, OFFSET$maxDescriptorSetUpdateAfterBindSamplers, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindSamplers_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindSamplers, LAYOUT$maxDescriptorSetUpdateAfterBindSamplers);}

    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers);}
    public void maxDescriptorSetUpdateAfterBindUniformBuffers(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindUniformBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers, LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers);}

    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);}
    public void maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindUniformBuffersDynamic_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);}

    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers);}
    public void maxDescriptorSetUpdateAfterBindStorageBuffers(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindStorageBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers, LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers);}

    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);}
    public void maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindStorageBuffersDynamic_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);}

    public int maxDescriptorSetUpdateAfterBindSampledImages() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages, OFFSET$maxDescriptorSetUpdateAfterBindSampledImages);}
    public void maxDescriptorSetUpdateAfterBindSampledImages(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages, OFFSET$maxDescriptorSetUpdateAfterBindSampledImages, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindSampledImages_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindSampledImages, LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages);}

    public int maxDescriptorSetUpdateAfterBindStorageImages() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages, OFFSET$maxDescriptorSetUpdateAfterBindStorageImages);}
    public void maxDescriptorSetUpdateAfterBindStorageImages(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages, OFFSET$maxDescriptorSetUpdateAfterBindStorageImages, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindStorageImages_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindStorageImages, LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages);}

    public int maxDescriptorSetUpdateAfterBindInputAttachments() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments, OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments);}
    public void maxDescriptorSetUpdateAfterBindInputAttachments(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments, OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindInputAttachments_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments, LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments);}
}

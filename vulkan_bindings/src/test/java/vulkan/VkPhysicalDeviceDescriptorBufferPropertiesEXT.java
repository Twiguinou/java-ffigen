package vulkan;

public record VkPhysicalDeviceDescriptorBufferPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$combinedImageSamplerDescriptorSingleArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$combinedImageSamplerDescriptorSingleArray = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferlessPushDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bufferlessPushDescriptors = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$allowSamplerImageViewPostSubmitCreation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$allowSamplerImageViewPostSubmitCreation = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$descriptorBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$descriptorBufferOffsetAlignment = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorBufferBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorBufferBindings = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxResourceDescriptorBufferBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxResourceDescriptorBufferBindings = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSamplerDescriptorBufferBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSamplerDescriptorBufferBindings = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxEmbeddedImmutableSamplerBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxEmbeddedImmutableSamplerBindings = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxEmbeddedImmutableSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxEmbeddedImmutableSamplers = 56L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bufferCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bufferCaptureReplayDescriptorDataSize = 64L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$imageCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$imageCaptureReplayDescriptorDataSize = 72L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$imageViewCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$imageViewCaptureReplayDescriptorDataSize = 80L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$samplerCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$samplerCaptureReplayDescriptorDataSize = 88L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$accelerationStructureCaptureReplayDescriptorDataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$accelerationStructureCaptureReplayDescriptorDataSize = 96L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$samplerDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$samplerDescriptorSize = 104L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$combinedImageSamplerDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$combinedImageSamplerDescriptorSize = 112L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$sampledImageDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$sampledImageDescriptorSize = 120L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$storageImageDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$storageImageDescriptorSize = 128L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$uniformTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$uniformTexelBufferDescriptorSize = 136L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$robustUniformTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$robustUniformTexelBufferDescriptorSize = 144L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$storageTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$storageTexelBufferDescriptorSize = 152L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$robustStorageTexelBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$robustStorageTexelBufferDescriptorSize = 160L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$uniformBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$uniformBufferDescriptorSize = 168L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$robustUniformBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$robustUniformBufferDescriptorSize = 176L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$storageBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$storageBufferDescriptorSize = 184L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$robustStorageBufferDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$robustStorageBufferDescriptorSize = 192L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$inputAttachmentDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$inputAttachmentDescriptorSize = 200L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$accelerationStructureDescriptorSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$accelerationStructureDescriptorSize = 208L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxSamplerDescriptorBufferRange = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxSamplerDescriptorBufferRange = 216L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxResourceDescriptorBufferRange = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxResourceDescriptorBufferRange = 224L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$samplerDescriptorBufferAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$samplerDescriptorBufferAddressSpaceSize = 232L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$resourceDescriptorBufferAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$resourceDescriptorBufferAddressSpaceSize = 240L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$descriptorBufferAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$descriptorBufferAddressSpaceSize = 248L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$combinedImageSamplerDescriptorSingleArray,
            LAYOUT$bufferlessPushDescriptors,
            LAYOUT$allowSamplerImageViewPostSubmitCreation,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$descriptorBufferOffsetAlignment,
            LAYOUT$maxDescriptorBufferBindings,
            LAYOUT$maxResourceDescriptorBufferBindings,
            LAYOUT$maxSamplerDescriptorBufferBindings,
            LAYOUT$maxEmbeddedImmutableSamplerBindings,
            LAYOUT$maxEmbeddedImmutableSamplers,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$bufferCaptureReplayDescriptorDataSize,
            LAYOUT$imageCaptureReplayDescriptorDataSize,
            LAYOUT$imageViewCaptureReplayDescriptorDataSize,
            LAYOUT$samplerCaptureReplayDescriptorDataSize,
            LAYOUT$accelerationStructureCaptureReplayDescriptorDataSize,
            LAYOUT$samplerDescriptorSize,
            LAYOUT$combinedImageSamplerDescriptorSize,
            LAYOUT$sampledImageDescriptorSize,
            LAYOUT$storageImageDescriptorSize,
            LAYOUT$uniformTexelBufferDescriptorSize,
            LAYOUT$robustUniformTexelBufferDescriptorSize,
            LAYOUT$storageTexelBufferDescriptorSize,
            LAYOUT$robustStorageTexelBufferDescriptorSize,
            LAYOUT$uniformBufferDescriptorSize,
            LAYOUT$robustUniformBufferDescriptorSize,
            LAYOUT$storageBufferDescriptorSize,
            LAYOUT$robustStorageBufferDescriptorSize,
            LAYOUT$inputAttachmentDescriptorSize,
            LAYOUT$accelerationStructureDescriptorSize,
            LAYOUT$maxSamplerDescriptorBufferRange,
            LAYOUT$maxResourceDescriptorBufferRange,
            LAYOUT$samplerDescriptorBufferAddressSpaceSize,
            LAYOUT$resourceDescriptorBufferAddressSpaceSize,
            LAYOUT$descriptorBufferAddressSpaceSize
    ).withName("VkPhysicalDeviceDescriptorBufferPropertiesEXT");

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int combinedImageSamplerDescriptorSingleArray() {return this.ptr.get(LAYOUT$combinedImageSamplerDescriptorSingleArray, OFFSET$combinedImageSamplerDescriptorSingleArray);}
    public void combinedImageSamplerDescriptorSingleArray(int value) {this.ptr.set(LAYOUT$combinedImageSamplerDescriptorSingleArray, OFFSET$combinedImageSamplerDescriptorSingleArray, value);}
    public java.lang.foreign.MemorySegment combinedImageSamplerDescriptorSingleArray_ptr() {return this.ptr.asSlice(OFFSET$combinedImageSamplerDescriptorSingleArray, LAYOUT$combinedImageSamplerDescriptorSingleArray);}

    public int bufferlessPushDescriptors() {return this.ptr.get(LAYOUT$bufferlessPushDescriptors, OFFSET$bufferlessPushDescriptors);}
    public void bufferlessPushDescriptors(int value) {this.ptr.set(LAYOUT$bufferlessPushDescriptors, OFFSET$bufferlessPushDescriptors, value);}
    public java.lang.foreign.MemorySegment bufferlessPushDescriptors_ptr() {return this.ptr.asSlice(OFFSET$bufferlessPushDescriptors, LAYOUT$bufferlessPushDescriptors);}

    public int allowSamplerImageViewPostSubmitCreation() {return this.ptr.get(LAYOUT$allowSamplerImageViewPostSubmitCreation, OFFSET$allowSamplerImageViewPostSubmitCreation);}
    public void allowSamplerImageViewPostSubmitCreation(int value) {this.ptr.set(LAYOUT$allowSamplerImageViewPostSubmitCreation, OFFSET$allowSamplerImageViewPostSubmitCreation, value);}
    public java.lang.foreign.MemorySegment allowSamplerImageViewPostSubmitCreation_ptr() {return this.ptr.asSlice(OFFSET$allowSamplerImageViewPostSubmitCreation, LAYOUT$allowSamplerImageViewPostSubmitCreation);}

    public long descriptorBufferOffsetAlignment() {return this.ptr.get(LAYOUT$descriptorBufferOffsetAlignment, OFFSET$descriptorBufferOffsetAlignment);}
    public void descriptorBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT$descriptorBufferOffsetAlignment, OFFSET$descriptorBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment descriptorBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$descriptorBufferOffsetAlignment, LAYOUT$descriptorBufferOffsetAlignment);}

    public int maxDescriptorBufferBindings() {return this.ptr.get(LAYOUT$maxDescriptorBufferBindings, OFFSET$maxDescriptorBufferBindings);}
    public void maxDescriptorBufferBindings(int value) {this.ptr.set(LAYOUT$maxDescriptorBufferBindings, OFFSET$maxDescriptorBufferBindings, value);}
    public java.lang.foreign.MemorySegment maxDescriptorBufferBindings_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorBufferBindings, LAYOUT$maxDescriptorBufferBindings);}

    public int maxResourceDescriptorBufferBindings() {return this.ptr.get(LAYOUT$maxResourceDescriptorBufferBindings, OFFSET$maxResourceDescriptorBufferBindings);}
    public void maxResourceDescriptorBufferBindings(int value) {this.ptr.set(LAYOUT$maxResourceDescriptorBufferBindings, OFFSET$maxResourceDescriptorBufferBindings, value);}
    public java.lang.foreign.MemorySegment maxResourceDescriptorBufferBindings_ptr() {return this.ptr.asSlice(OFFSET$maxResourceDescriptorBufferBindings, LAYOUT$maxResourceDescriptorBufferBindings);}

    public int maxSamplerDescriptorBufferBindings() {return this.ptr.get(LAYOUT$maxSamplerDescriptorBufferBindings, OFFSET$maxSamplerDescriptorBufferBindings);}
    public void maxSamplerDescriptorBufferBindings(int value) {this.ptr.set(LAYOUT$maxSamplerDescriptorBufferBindings, OFFSET$maxSamplerDescriptorBufferBindings, value);}
    public java.lang.foreign.MemorySegment maxSamplerDescriptorBufferBindings_ptr() {return this.ptr.asSlice(OFFSET$maxSamplerDescriptorBufferBindings, LAYOUT$maxSamplerDescriptorBufferBindings);}

    public int maxEmbeddedImmutableSamplerBindings() {return this.ptr.get(LAYOUT$maxEmbeddedImmutableSamplerBindings, OFFSET$maxEmbeddedImmutableSamplerBindings);}
    public void maxEmbeddedImmutableSamplerBindings(int value) {this.ptr.set(LAYOUT$maxEmbeddedImmutableSamplerBindings, OFFSET$maxEmbeddedImmutableSamplerBindings, value);}
    public java.lang.foreign.MemorySegment maxEmbeddedImmutableSamplerBindings_ptr() {return this.ptr.asSlice(OFFSET$maxEmbeddedImmutableSamplerBindings, LAYOUT$maxEmbeddedImmutableSamplerBindings);}

    public int maxEmbeddedImmutableSamplers() {return this.ptr.get(LAYOUT$maxEmbeddedImmutableSamplers, OFFSET$maxEmbeddedImmutableSamplers);}
    public void maxEmbeddedImmutableSamplers(int value) {this.ptr.set(LAYOUT$maxEmbeddedImmutableSamplers, OFFSET$maxEmbeddedImmutableSamplers, value);}
    public java.lang.foreign.MemorySegment maxEmbeddedImmutableSamplers_ptr() {return this.ptr.asSlice(OFFSET$maxEmbeddedImmutableSamplers, LAYOUT$maxEmbeddedImmutableSamplers);}

    public long bufferCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT$bufferCaptureReplayDescriptorDataSize, OFFSET$bufferCaptureReplayDescriptorDataSize);}
    public void bufferCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT$bufferCaptureReplayDescriptorDataSize, OFFSET$bufferCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment bufferCaptureReplayDescriptorDataSize_ptr() {return this.ptr.asSlice(OFFSET$bufferCaptureReplayDescriptorDataSize, LAYOUT$bufferCaptureReplayDescriptorDataSize);}

    public long imageCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT$imageCaptureReplayDescriptorDataSize, OFFSET$imageCaptureReplayDescriptorDataSize);}
    public void imageCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT$imageCaptureReplayDescriptorDataSize, OFFSET$imageCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment imageCaptureReplayDescriptorDataSize_ptr() {return this.ptr.asSlice(OFFSET$imageCaptureReplayDescriptorDataSize, LAYOUT$imageCaptureReplayDescriptorDataSize);}

    public long imageViewCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT$imageViewCaptureReplayDescriptorDataSize, OFFSET$imageViewCaptureReplayDescriptorDataSize);}
    public void imageViewCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT$imageViewCaptureReplayDescriptorDataSize, OFFSET$imageViewCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment imageViewCaptureReplayDescriptorDataSize_ptr() {return this.ptr.asSlice(OFFSET$imageViewCaptureReplayDescriptorDataSize, LAYOUT$imageViewCaptureReplayDescriptorDataSize);}

    public long samplerCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT$samplerCaptureReplayDescriptorDataSize, OFFSET$samplerCaptureReplayDescriptorDataSize);}
    public void samplerCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT$samplerCaptureReplayDescriptorDataSize, OFFSET$samplerCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment samplerCaptureReplayDescriptorDataSize_ptr() {return this.ptr.asSlice(OFFSET$samplerCaptureReplayDescriptorDataSize, LAYOUT$samplerCaptureReplayDescriptorDataSize);}

    public long accelerationStructureCaptureReplayDescriptorDataSize() {return this.ptr.get(LAYOUT$accelerationStructureCaptureReplayDescriptorDataSize, OFFSET$accelerationStructureCaptureReplayDescriptorDataSize);}
    public void accelerationStructureCaptureReplayDescriptorDataSize(long value) {this.ptr.set(LAYOUT$accelerationStructureCaptureReplayDescriptorDataSize, OFFSET$accelerationStructureCaptureReplayDescriptorDataSize, value);}
    public java.lang.foreign.MemorySegment accelerationStructureCaptureReplayDescriptorDataSize_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureCaptureReplayDescriptorDataSize, LAYOUT$accelerationStructureCaptureReplayDescriptorDataSize);}

    public long samplerDescriptorSize() {return this.ptr.get(LAYOUT$samplerDescriptorSize, OFFSET$samplerDescriptorSize);}
    public void samplerDescriptorSize(long value) {this.ptr.set(LAYOUT$samplerDescriptorSize, OFFSET$samplerDescriptorSize, value);}
    public java.lang.foreign.MemorySegment samplerDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$samplerDescriptorSize, LAYOUT$samplerDescriptorSize);}

    public long combinedImageSamplerDescriptorSize() {return this.ptr.get(LAYOUT$combinedImageSamplerDescriptorSize, OFFSET$combinedImageSamplerDescriptorSize);}
    public void combinedImageSamplerDescriptorSize(long value) {this.ptr.set(LAYOUT$combinedImageSamplerDescriptorSize, OFFSET$combinedImageSamplerDescriptorSize, value);}
    public java.lang.foreign.MemorySegment combinedImageSamplerDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$combinedImageSamplerDescriptorSize, LAYOUT$combinedImageSamplerDescriptorSize);}

    public long sampledImageDescriptorSize() {return this.ptr.get(LAYOUT$sampledImageDescriptorSize, OFFSET$sampledImageDescriptorSize);}
    public void sampledImageDescriptorSize(long value) {this.ptr.set(LAYOUT$sampledImageDescriptorSize, OFFSET$sampledImageDescriptorSize, value);}
    public java.lang.foreign.MemorySegment sampledImageDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$sampledImageDescriptorSize, LAYOUT$sampledImageDescriptorSize);}

    public long storageImageDescriptorSize() {return this.ptr.get(LAYOUT$storageImageDescriptorSize, OFFSET$storageImageDescriptorSize);}
    public void storageImageDescriptorSize(long value) {this.ptr.set(LAYOUT$storageImageDescriptorSize, OFFSET$storageImageDescriptorSize, value);}
    public java.lang.foreign.MemorySegment storageImageDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$storageImageDescriptorSize, LAYOUT$storageImageDescriptorSize);}

    public long uniformTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT$uniformTexelBufferDescriptorSize, OFFSET$uniformTexelBufferDescriptorSize);}
    public void uniformTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$uniformTexelBufferDescriptorSize, OFFSET$uniformTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment uniformTexelBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$uniformTexelBufferDescriptorSize, LAYOUT$uniformTexelBufferDescriptorSize);}

    public long robustUniformTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT$robustUniformTexelBufferDescriptorSize, OFFSET$robustUniformTexelBufferDescriptorSize);}
    public void robustUniformTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$robustUniformTexelBufferDescriptorSize, OFFSET$robustUniformTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment robustUniformTexelBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$robustUniformTexelBufferDescriptorSize, LAYOUT$robustUniformTexelBufferDescriptorSize);}

    public long storageTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT$storageTexelBufferDescriptorSize, OFFSET$storageTexelBufferDescriptorSize);}
    public void storageTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$storageTexelBufferDescriptorSize, OFFSET$storageTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment storageTexelBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$storageTexelBufferDescriptorSize, LAYOUT$storageTexelBufferDescriptorSize);}

    public long robustStorageTexelBufferDescriptorSize() {return this.ptr.get(LAYOUT$robustStorageTexelBufferDescriptorSize, OFFSET$robustStorageTexelBufferDescriptorSize);}
    public void robustStorageTexelBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$robustStorageTexelBufferDescriptorSize, OFFSET$robustStorageTexelBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment robustStorageTexelBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$robustStorageTexelBufferDescriptorSize, LAYOUT$robustStorageTexelBufferDescriptorSize);}

    public long uniformBufferDescriptorSize() {return this.ptr.get(LAYOUT$uniformBufferDescriptorSize, OFFSET$uniformBufferDescriptorSize);}
    public void uniformBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$uniformBufferDescriptorSize, OFFSET$uniformBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment uniformBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$uniformBufferDescriptorSize, LAYOUT$uniformBufferDescriptorSize);}

    public long robustUniformBufferDescriptorSize() {return this.ptr.get(LAYOUT$robustUniformBufferDescriptorSize, OFFSET$robustUniformBufferDescriptorSize);}
    public void robustUniformBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$robustUniformBufferDescriptorSize, OFFSET$robustUniformBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment robustUniformBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$robustUniformBufferDescriptorSize, LAYOUT$robustUniformBufferDescriptorSize);}

    public long storageBufferDescriptorSize() {return this.ptr.get(LAYOUT$storageBufferDescriptorSize, OFFSET$storageBufferDescriptorSize);}
    public void storageBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$storageBufferDescriptorSize, OFFSET$storageBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment storageBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$storageBufferDescriptorSize, LAYOUT$storageBufferDescriptorSize);}

    public long robustStorageBufferDescriptorSize() {return this.ptr.get(LAYOUT$robustStorageBufferDescriptorSize, OFFSET$robustStorageBufferDescriptorSize);}
    public void robustStorageBufferDescriptorSize(long value) {this.ptr.set(LAYOUT$robustStorageBufferDescriptorSize, OFFSET$robustStorageBufferDescriptorSize, value);}
    public java.lang.foreign.MemorySegment robustStorageBufferDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$robustStorageBufferDescriptorSize, LAYOUT$robustStorageBufferDescriptorSize);}

    public long inputAttachmentDescriptorSize() {return this.ptr.get(LAYOUT$inputAttachmentDescriptorSize, OFFSET$inputAttachmentDescriptorSize);}
    public void inputAttachmentDescriptorSize(long value) {this.ptr.set(LAYOUT$inputAttachmentDescriptorSize, OFFSET$inputAttachmentDescriptorSize, value);}
    public java.lang.foreign.MemorySegment inputAttachmentDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$inputAttachmentDescriptorSize, LAYOUT$inputAttachmentDescriptorSize);}

    public long accelerationStructureDescriptorSize() {return this.ptr.get(LAYOUT$accelerationStructureDescriptorSize, OFFSET$accelerationStructureDescriptorSize);}
    public void accelerationStructureDescriptorSize(long value) {this.ptr.set(LAYOUT$accelerationStructureDescriptorSize, OFFSET$accelerationStructureDescriptorSize, value);}
    public java.lang.foreign.MemorySegment accelerationStructureDescriptorSize_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureDescriptorSize, LAYOUT$accelerationStructureDescriptorSize);}

    public long maxSamplerDescriptorBufferRange() {return this.ptr.get(LAYOUT$maxSamplerDescriptorBufferRange, OFFSET$maxSamplerDescriptorBufferRange);}
    public void maxSamplerDescriptorBufferRange(long value) {this.ptr.set(LAYOUT$maxSamplerDescriptorBufferRange, OFFSET$maxSamplerDescriptorBufferRange, value);}
    public java.lang.foreign.MemorySegment maxSamplerDescriptorBufferRange_ptr() {return this.ptr.asSlice(OFFSET$maxSamplerDescriptorBufferRange, LAYOUT$maxSamplerDescriptorBufferRange);}

    public long maxResourceDescriptorBufferRange() {return this.ptr.get(LAYOUT$maxResourceDescriptorBufferRange, OFFSET$maxResourceDescriptorBufferRange);}
    public void maxResourceDescriptorBufferRange(long value) {this.ptr.set(LAYOUT$maxResourceDescriptorBufferRange, OFFSET$maxResourceDescriptorBufferRange, value);}
    public java.lang.foreign.MemorySegment maxResourceDescriptorBufferRange_ptr() {return this.ptr.asSlice(OFFSET$maxResourceDescriptorBufferRange, LAYOUT$maxResourceDescriptorBufferRange);}

    public long samplerDescriptorBufferAddressSpaceSize() {return this.ptr.get(LAYOUT$samplerDescriptorBufferAddressSpaceSize, OFFSET$samplerDescriptorBufferAddressSpaceSize);}
    public void samplerDescriptorBufferAddressSpaceSize(long value) {this.ptr.set(LAYOUT$samplerDescriptorBufferAddressSpaceSize, OFFSET$samplerDescriptorBufferAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment samplerDescriptorBufferAddressSpaceSize_ptr() {return this.ptr.asSlice(OFFSET$samplerDescriptorBufferAddressSpaceSize, LAYOUT$samplerDescriptorBufferAddressSpaceSize);}

    public long resourceDescriptorBufferAddressSpaceSize() {return this.ptr.get(LAYOUT$resourceDescriptorBufferAddressSpaceSize, OFFSET$resourceDescriptorBufferAddressSpaceSize);}
    public void resourceDescriptorBufferAddressSpaceSize(long value) {this.ptr.set(LAYOUT$resourceDescriptorBufferAddressSpaceSize, OFFSET$resourceDescriptorBufferAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment resourceDescriptorBufferAddressSpaceSize_ptr() {return this.ptr.asSlice(OFFSET$resourceDescriptorBufferAddressSpaceSize, LAYOUT$resourceDescriptorBufferAddressSpaceSize);}

    public long descriptorBufferAddressSpaceSize() {return this.ptr.get(LAYOUT$descriptorBufferAddressSpaceSize, OFFSET$descriptorBufferAddressSpaceSize);}
    public void descriptorBufferAddressSpaceSize(long value) {this.ptr.set(LAYOUT$descriptorBufferAddressSpaceSize, OFFSET$descriptorBufferAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment descriptorBufferAddressSpaceSize_ptr() {return this.ptr.asSlice(OFFSET$descriptorBufferAddressSpaceSize, LAYOUT$descriptorBufferAddressSpaceSize);}
}

package vulkan;

public record VkPhysicalDeviceLimits(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageDimension1D = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxImageDimension1D = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageDimension2D = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxImageDimension2D = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageDimension3D = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxImageDimension3D = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageDimensionCube = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxImageDimensionCube = 12L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxImageArrayLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxImageArrayLayers = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTexelBufferElements = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTexelBufferElements = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxUniformBufferRange = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxUniformBufferRange = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxStorageBufferRange = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxStorageBufferRange = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPushConstantsSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPushConstantsSize = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMemoryAllocationCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMemoryAllocationCount = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSamplerAllocationCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSamplerAllocationCount = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$bufferImageGranularity = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$bufferImageGranularity = 48L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$sparseAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$sparseAddressSpaceSize = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxBoundDescriptorSets = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxBoundDescriptorSets = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorSamplers = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUniformBuffers = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorStorageBuffers = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorSampledImages = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorStorageImages = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorInputAttachments = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageResources = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageResources = 92L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetSamplers = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUniformBuffers = 100L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUniformBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUniformBuffersDynamic = 104L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetStorageBuffers = 108L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetStorageBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetStorageBuffersDynamic = 112L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetSampledImages = 116L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetStorageImages = 120L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetInputAttachments = 124L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxVertexInputAttributes = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxVertexInputAttributes = 128L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxVertexInputBindings = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxVertexInputBindings = 132L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxVertexInputAttributeOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxVertexInputAttributeOffset = 136L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxVertexInputBindingStride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxVertexInputBindingStride = 140L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxVertexOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxVertexOutputComponents = 144L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationGenerationLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationGenerationLevel = 148L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationPatchSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationPatchSize = 152L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationControlPerVertexInputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationControlPerVertexInputComponents = 156L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationControlPerVertexOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationControlPerVertexOutputComponents = 160L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationControlPerPatchOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationControlPerPatchOutputComponents = 164L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationControlTotalOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationControlTotalOutputComponents = 168L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationEvaluationInputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationEvaluationInputComponents = 172L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTessellationEvaluationOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTessellationEvaluationOutputComponents = 176L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxGeometryShaderInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxGeometryShaderInvocations = 180L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxGeometryInputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxGeometryInputComponents = 184L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxGeometryOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxGeometryOutputComponents = 188L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxGeometryOutputVertices = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxGeometryOutputVertices = 192L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxGeometryTotalOutputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxGeometryTotalOutputComponents = 196L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentInputComponents = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentInputComponents = 200L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentOutputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentOutputAttachments = 204L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentDualSrcAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentDualSrcAttachments = 208L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFragmentCombinedOutputResources = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFragmentCombinedOutputResources = 212L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxComputeSharedMemorySize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxComputeSharedMemorySize = 216L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxComputeWorkGroupCount = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxComputeWorkGroupCount = 220L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxComputeWorkGroupInvocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxComputeWorkGroupInvocations = 232L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxComputeWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxComputeWorkGroupSize = 236L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subPixelPrecisionBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subPixelPrecisionBits = 248L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subTexelPrecisionBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subTexelPrecisionBits = 252L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mipmapPrecisionBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$mipmapPrecisionBits = 256L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDrawIndexedIndexValue = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDrawIndexedIndexValue = 260L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDrawIndirectCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDrawIndirectCount = 264L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxSamplerLodBias = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxSamplerLodBias = 268L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxSamplerAnisotropy = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxSamplerAnisotropy = 272L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxViewports = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxViewports = 276L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$maxViewportDimensions = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$maxViewportDimensions = 280L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$viewportBoundsRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET$viewportBoundsRange = 288L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$viewportSubPixelBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$viewportSubPixelBits = 296L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minMemoryMapAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minMemoryMapAlignment = 304L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minTexelBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minTexelBufferOffsetAlignment = 312L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minUniformBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minUniformBufferOffsetAlignment = 320L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$minStorageBufferOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$minStorageBufferOffsetAlignment = 328L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minTexelOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minTexelOffset = 336L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTexelOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTexelOffset = 340L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minTexelGatherOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minTexelGatherOffset = 344L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTexelGatherOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTexelGatherOffset = 348L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minInterpolationOffset = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$minInterpolationOffset = 352L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxInterpolationOffset = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxInterpolationOffset = 356L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subPixelInterpolationOffsetBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subPixelInterpolationOffsetBits = 360L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFramebufferWidth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFramebufferWidth = 364L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFramebufferHeight = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFramebufferHeight = 368L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxFramebufferLayers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxFramebufferLayers = 372L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$framebufferColorSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$framebufferColorSampleCounts = 376L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$framebufferDepthSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$framebufferDepthSampleCounts = 380L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$framebufferStencilSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$framebufferStencilSampleCounts = 384L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$framebufferNoAttachmentsSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$framebufferNoAttachmentsSampleCounts = 388L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxColorAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxColorAttachments = 392L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampledImageColorSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampledImageColorSampleCounts = 396L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampledImageIntegerSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampledImageIntegerSampleCounts = 400L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampledImageDepthSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampledImageDepthSampleCounts = 404L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampledImageStencilSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sampledImageStencilSampleCounts = 408L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageImageSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storageImageSampleCounts = 412L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSampleMaskWords = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSampleMaskWords = 416L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$timestampComputeAndGraphics = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$timestampComputeAndGraphics = 420L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$timestampPeriod = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$timestampPeriod = 424L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxClipDistances = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxClipDistances = 428L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxCullDistances = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxCullDistances = 432L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxCombinedClipAndCullDistances = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxCombinedClipAndCullDistances = 436L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$discreteQueuePriorities = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$discreteQueuePriorities = 440L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$pointSizeRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET$pointSizeRange = 444L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$lineWidthRange = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET$lineWidthRange = 452L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$pointSizeGranularity = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$pointSizeGranularity = 460L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$lineWidthGranularity = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$lineWidthGranularity = 464L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$strictLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$strictLines = 468L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$standardSampleLocations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$standardSampleLocations = 472L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$optimalBufferCopyOffsetAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$optimalBufferCopyOffsetAlignment = 480L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$optimalBufferCopyRowPitchAlignment = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$optimalBufferCopyRowPitchAlignment = 488L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$nonCoherentAtomSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$nonCoherentAtomSize = 496L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$maxImageDimension1D,
            LAYOUT$maxImageDimension2D,
            LAYOUT$maxImageDimension3D,
            LAYOUT$maxImageDimensionCube,
            LAYOUT$maxImageArrayLayers,
            LAYOUT$maxTexelBufferElements,
            LAYOUT$maxUniformBufferRange,
            LAYOUT$maxStorageBufferRange,
            LAYOUT$maxPushConstantsSize,
            LAYOUT$maxMemoryAllocationCount,
            LAYOUT$maxSamplerAllocationCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$bufferImageGranularity,
            LAYOUT$sparseAddressSpaceSize,
            LAYOUT$maxBoundDescriptorSets,
            LAYOUT$maxPerStageDescriptorSamplers,
            LAYOUT$maxPerStageDescriptorUniformBuffers,
            LAYOUT$maxPerStageDescriptorStorageBuffers,
            LAYOUT$maxPerStageDescriptorSampledImages,
            LAYOUT$maxPerStageDescriptorStorageImages,
            LAYOUT$maxPerStageDescriptorInputAttachments,
            LAYOUT$maxPerStageResources,
            LAYOUT$maxDescriptorSetSamplers,
            LAYOUT$maxDescriptorSetUniformBuffers,
            LAYOUT$maxDescriptorSetUniformBuffersDynamic,
            LAYOUT$maxDescriptorSetStorageBuffers,
            LAYOUT$maxDescriptorSetStorageBuffersDynamic,
            LAYOUT$maxDescriptorSetSampledImages,
            LAYOUT$maxDescriptorSetStorageImages,
            LAYOUT$maxDescriptorSetInputAttachments,
            LAYOUT$maxVertexInputAttributes,
            LAYOUT$maxVertexInputBindings,
            LAYOUT$maxVertexInputAttributeOffset,
            LAYOUT$maxVertexInputBindingStride,
            LAYOUT$maxVertexOutputComponents,
            LAYOUT$maxTessellationGenerationLevel,
            LAYOUT$maxTessellationPatchSize,
            LAYOUT$maxTessellationControlPerVertexInputComponents,
            LAYOUT$maxTessellationControlPerVertexOutputComponents,
            LAYOUT$maxTessellationControlPerPatchOutputComponents,
            LAYOUT$maxTessellationControlTotalOutputComponents,
            LAYOUT$maxTessellationEvaluationInputComponents,
            LAYOUT$maxTessellationEvaluationOutputComponents,
            LAYOUT$maxGeometryShaderInvocations,
            LAYOUT$maxGeometryInputComponents,
            LAYOUT$maxGeometryOutputComponents,
            LAYOUT$maxGeometryOutputVertices,
            LAYOUT$maxGeometryTotalOutputComponents,
            LAYOUT$maxFragmentInputComponents,
            LAYOUT$maxFragmentOutputAttachments,
            LAYOUT$maxFragmentDualSrcAttachments,
            LAYOUT$maxFragmentCombinedOutputResources,
            LAYOUT$maxComputeSharedMemorySize,
            LAYOUT$maxComputeWorkGroupCount,
            LAYOUT$maxComputeWorkGroupInvocations,
            LAYOUT$maxComputeWorkGroupSize,
            LAYOUT$subPixelPrecisionBits,
            LAYOUT$subTexelPrecisionBits,
            LAYOUT$mipmapPrecisionBits,
            LAYOUT$maxDrawIndexedIndexValue,
            LAYOUT$maxDrawIndirectCount,
            LAYOUT$maxSamplerLodBias,
            LAYOUT$maxSamplerAnisotropy,
            LAYOUT$maxViewports,
            LAYOUT$maxViewportDimensions,
            LAYOUT$viewportBoundsRange,
            LAYOUT$viewportSubPixelBits,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$minMemoryMapAlignment,
            LAYOUT$minTexelBufferOffsetAlignment,
            LAYOUT$minUniformBufferOffsetAlignment,
            LAYOUT$minStorageBufferOffsetAlignment,
            LAYOUT$minTexelOffset,
            LAYOUT$maxTexelOffset,
            LAYOUT$minTexelGatherOffset,
            LAYOUT$maxTexelGatherOffset,
            LAYOUT$minInterpolationOffset,
            LAYOUT$maxInterpolationOffset,
            LAYOUT$subPixelInterpolationOffsetBits,
            LAYOUT$maxFramebufferWidth,
            LAYOUT$maxFramebufferHeight,
            LAYOUT$maxFramebufferLayers,
            LAYOUT$framebufferColorSampleCounts,
            LAYOUT$framebufferDepthSampleCounts,
            LAYOUT$framebufferStencilSampleCounts,
            LAYOUT$framebufferNoAttachmentsSampleCounts,
            LAYOUT$maxColorAttachments,
            LAYOUT$sampledImageColorSampleCounts,
            LAYOUT$sampledImageIntegerSampleCounts,
            LAYOUT$sampledImageDepthSampleCounts,
            LAYOUT$sampledImageStencilSampleCounts,
            LAYOUT$storageImageSampleCounts,
            LAYOUT$maxSampleMaskWords,
            LAYOUT$timestampComputeAndGraphics,
            LAYOUT$timestampPeriod,
            LAYOUT$maxClipDistances,
            LAYOUT$maxCullDistances,
            LAYOUT$maxCombinedClipAndCullDistances,
            LAYOUT$discreteQueuePriorities,
            LAYOUT$pointSizeRange,
            LAYOUT$lineWidthRange,
            LAYOUT$pointSizeGranularity,
            LAYOUT$lineWidthGranularity,
            LAYOUT$strictLines,
            LAYOUT$standardSampleLocations,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$optimalBufferCopyOffsetAlignment,
            LAYOUT$optimalBufferCopyRowPitchAlignment,
            LAYOUT$nonCoherentAtomSize
    ).withName("VkPhysicalDeviceLimits");

    public VkPhysicalDeviceLimits(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int maxImageDimension1D() {return this.ptr.get(LAYOUT$maxImageDimension1D, OFFSET$maxImageDimension1D);}
    public void maxImageDimension1D(int value) {this.ptr.set(LAYOUT$maxImageDimension1D, OFFSET$maxImageDimension1D, value);}
    public java.lang.foreign.MemorySegment maxImageDimension1D_ptr() {return this.ptr.asSlice(OFFSET$maxImageDimension1D, LAYOUT$maxImageDimension1D);}

    public int maxImageDimension2D() {return this.ptr.get(LAYOUT$maxImageDimension2D, OFFSET$maxImageDimension2D);}
    public void maxImageDimension2D(int value) {this.ptr.set(LAYOUT$maxImageDimension2D, OFFSET$maxImageDimension2D, value);}
    public java.lang.foreign.MemorySegment maxImageDimension2D_ptr() {return this.ptr.asSlice(OFFSET$maxImageDimension2D, LAYOUT$maxImageDimension2D);}

    public int maxImageDimension3D() {return this.ptr.get(LAYOUT$maxImageDimension3D, OFFSET$maxImageDimension3D);}
    public void maxImageDimension3D(int value) {this.ptr.set(LAYOUT$maxImageDimension3D, OFFSET$maxImageDimension3D, value);}
    public java.lang.foreign.MemorySegment maxImageDimension3D_ptr() {return this.ptr.asSlice(OFFSET$maxImageDimension3D, LAYOUT$maxImageDimension3D);}

    public int maxImageDimensionCube() {return this.ptr.get(LAYOUT$maxImageDimensionCube, OFFSET$maxImageDimensionCube);}
    public void maxImageDimensionCube(int value) {this.ptr.set(LAYOUT$maxImageDimensionCube, OFFSET$maxImageDimensionCube, value);}
    public java.lang.foreign.MemorySegment maxImageDimensionCube_ptr() {return this.ptr.asSlice(OFFSET$maxImageDimensionCube, LAYOUT$maxImageDimensionCube);}

    public int maxImageArrayLayers() {return this.ptr.get(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers);}
    public void maxImageArrayLayers(int value) {this.ptr.set(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers, value);}
    public java.lang.foreign.MemorySegment maxImageArrayLayers_ptr() {return this.ptr.asSlice(OFFSET$maxImageArrayLayers, LAYOUT$maxImageArrayLayers);}

    public int maxTexelBufferElements() {return this.ptr.get(LAYOUT$maxTexelBufferElements, OFFSET$maxTexelBufferElements);}
    public void maxTexelBufferElements(int value) {this.ptr.set(LAYOUT$maxTexelBufferElements, OFFSET$maxTexelBufferElements, value);}
    public java.lang.foreign.MemorySegment maxTexelBufferElements_ptr() {return this.ptr.asSlice(OFFSET$maxTexelBufferElements, LAYOUT$maxTexelBufferElements);}

    public int maxUniformBufferRange() {return this.ptr.get(LAYOUT$maxUniformBufferRange, OFFSET$maxUniformBufferRange);}
    public void maxUniformBufferRange(int value) {this.ptr.set(LAYOUT$maxUniformBufferRange, OFFSET$maxUniformBufferRange, value);}
    public java.lang.foreign.MemorySegment maxUniformBufferRange_ptr() {return this.ptr.asSlice(OFFSET$maxUniformBufferRange, LAYOUT$maxUniformBufferRange);}

    public int maxStorageBufferRange() {return this.ptr.get(LAYOUT$maxStorageBufferRange, OFFSET$maxStorageBufferRange);}
    public void maxStorageBufferRange(int value) {this.ptr.set(LAYOUT$maxStorageBufferRange, OFFSET$maxStorageBufferRange, value);}
    public java.lang.foreign.MemorySegment maxStorageBufferRange_ptr() {return this.ptr.asSlice(OFFSET$maxStorageBufferRange, LAYOUT$maxStorageBufferRange);}

    public int maxPushConstantsSize() {return this.ptr.get(LAYOUT$maxPushConstantsSize, OFFSET$maxPushConstantsSize);}
    public void maxPushConstantsSize(int value) {this.ptr.set(LAYOUT$maxPushConstantsSize, OFFSET$maxPushConstantsSize, value);}
    public java.lang.foreign.MemorySegment maxPushConstantsSize_ptr() {return this.ptr.asSlice(OFFSET$maxPushConstantsSize, LAYOUT$maxPushConstantsSize);}

    public int maxMemoryAllocationCount() {return this.ptr.get(LAYOUT$maxMemoryAllocationCount, OFFSET$maxMemoryAllocationCount);}
    public void maxMemoryAllocationCount(int value) {this.ptr.set(LAYOUT$maxMemoryAllocationCount, OFFSET$maxMemoryAllocationCount, value);}
    public java.lang.foreign.MemorySegment maxMemoryAllocationCount_ptr() {return this.ptr.asSlice(OFFSET$maxMemoryAllocationCount, LAYOUT$maxMemoryAllocationCount);}

    public int maxSamplerAllocationCount() {return this.ptr.get(LAYOUT$maxSamplerAllocationCount, OFFSET$maxSamplerAllocationCount);}
    public void maxSamplerAllocationCount(int value) {this.ptr.set(LAYOUT$maxSamplerAllocationCount, OFFSET$maxSamplerAllocationCount, value);}
    public java.lang.foreign.MemorySegment maxSamplerAllocationCount_ptr() {return this.ptr.asSlice(OFFSET$maxSamplerAllocationCount, LAYOUT$maxSamplerAllocationCount);}

    public long bufferImageGranularity() {return this.ptr.get(LAYOUT$bufferImageGranularity, OFFSET$bufferImageGranularity);}
    public void bufferImageGranularity(long value) {this.ptr.set(LAYOUT$bufferImageGranularity, OFFSET$bufferImageGranularity, value);}
    public java.lang.foreign.MemorySegment bufferImageGranularity_ptr() {return this.ptr.asSlice(OFFSET$bufferImageGranularity, LAYOUT$bufferImageGranularity);}

    public long sparseAddressSpaceSize() {return this.ptr.get(LAYOUT$sparseAddressSpaceSize, OFFSET$sparseAddressSpaceSize);}
    public void sparseAddressSpaceSize(long value) {this.ptr.set(LAYOUT$sparseAddressSpaceSize, OFFSET$sparseAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment sparseAddressSpaceSize_ptr() {return this.ptr.asSlice(OFFSET$sparseAddressSpaceSize, LAYOUT$sparseAddressSpaceSize);}

    public int maxBoundDescriptorSets() {return this.ptr.get(LAYOUT$maxBoundDescriptorSets, OFFSET$maxBoundDescriptorSets);}
    public void maxBoundDescriptorSets(int value) {this.ptr.set(LAYOUT$maxBoundDescriptorSets, OFFSET$maxBoundDescriptorSets, value);}
    public java.lang.foreign.MemorySegment maxBoundDescriptorSets_ptr() {return this.ptr.asSlice(OFFSET$maxBoundDescriptorSets, LAYOUT$maxBoundDescriptorSets);}

    public int maxPerStageDescriptorSamplers() {return this.ptr.get(LAYOUT$maxPerStageDescriptorSamplers, OFFSET$maxPerStageDescriptorSamplers);}
    public void maxPerStageDescriptorSamplers(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorSamplers, OFFSET$maxPerStageDescriptorSamplers, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorSamplers_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorSamplers, LAYOUT$maxPerStageDescriptorSamplers);}

    public int maxPerStageDescriptorUniformBuffers() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUniformBuffers, OFFSET$maxPerStageDescriptorUniformBuffers);}
    public void maxPerStageDescriptorUniformBuffers(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUniformBuffers, OFFSET$maxPerStageDescriptorUniformBuffers, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUniformBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUniformBuffers, LAYOUT$maxPerStageDescriptorUniformBuffers);}

    public int maxPerStageDescriptorStorageBuffers() {return this.ptr.get(LAYOUT$maxPerStageDescriptorStorageBuffers, OFFSET$maxPerStageDescriptorStorageBuffers);}
    public void maxPerStageDescriptorStorageBuffers(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorStorageBuffers, OFFSET$maxPerStageDescriptorStorageBuffers, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorStorageBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorStorageBuffers, LAYOUT$maxPerStageDescriptorStorageBuffers);}

    public int maxPerStageDescriptorSampledImages() {return this.ptr.get(LAYOUT$maxPerStageDescriptorSampledImages, OFFSET$maxPerStageDescriptorSampledImages);}
    public void maxPerStageDescriptorSampledImages(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorSampledImages, OFFSET$maxPerStageDescriptorSampledImages, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorSampledImages_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorSampledImages, LAYOUT$maxPerStageDescriptorSampledImages);}

    public int maxPerStageDescriptorStorageImages() {return this.ptr.get(LAYOUT$maxPerStageDescriptorStorageImages, OFFSET$maxPerStageDescriptorStorageImages);}
    public void maxPerStageDescriptorStorageImages(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorStorageImages, OFFSET$maxPerStageDescriptorStorageImages, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorStorageImages_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorStorageImages, LAYOUT$maxPerStageDescriptorStorageImages);}

    public int maxPerStageDescriptorInputAttachments() {return this.ptr.get(LAYOUT$maxPerStageDescriptorInputAttachments, OFFSET$maxPerStageDescriptorInputAttachments);}
    public void maxPerStageDescriptorInputAttachments(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorInputAttachments, OFFSET$maxPerStageDescriptorInputAttachments, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorInputAttachments_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorInputAttachments, LAYOUT$maxPerStageDescriptorInputAttachments);}

    public int maxPerStageResources() {return this.ptr.get(LAYOUT$maxPerStageResources, OFFSET$maxPerStageResources);}
    public void maxPerStageResources(int value) {this.ptr.set(LAYOUT$maxPerStageResources, OFFSET$maxPerStageResources, value);}
    public java.lang.foreign.MemorySegment maxPerStageResources_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageResources, LAYOUT$maxPerStageResources);}

    public int maxDescriptorSetSamplers() {return this.ptr.get(LAYOUT$maxDescriptorSetSamplers, OFFSET$maxDescriptorSetSamplers);}
    public void maxDescriptorSetSamplers(int value) {this.ptr.set(LAYOUT$maxDescriptorSetSamplers, OFFSET$maxDescriptorSetSamplers, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetSamplers_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetSamplers, LAYOUT$maxDescriptorSetSamplers);}

    public int maxDescriptorSetUniformBuffers() {return this.ptr.get(LAYOUT$maxDescriptorSetUniformBuffers, OFFSET$maxDescriptorSetUniformBuffers);}
    public void maxDescriptorSetUniformBuffers(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUniformBuffers, OFFSET$maxDescriptorSetUniformBuffers, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUniformBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUniformBuffers, LAYOUT$maxDescriptorSetUniformBuffers);}

    public int maxDescriptorSetUniformBuffersDynamic() {return this.ptr.get(LAYOUT$maxDescriptorSetUniformBuffersDynamic, OFFSET$maxDescriptorSetUniformBuffersDynamic);}
    public void maxDescriptorSetUniformBuffersDynamic(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUniformBuffersDynamic, OFFSET$maxDescriptorSetUniformBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUniformBuffersDynamic_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUniformBuffersDynamic, LAYOUT$maxDescriptorSetUniformBuffersDynamic);}

    public int maxDescriptorSetStorageBuffers() {return this.ptr.get(LAYOUT$maxDescriptorSetStorageBuffers, OFFSET$maxDescriptorSetStorageBuffers);}
    public void maxDescriptorSetStorageBuffers(int value) {this.ptr.set(LAYOUT$maxDescriptorSetStorageBuffers, OFFSET$maxDescriptorSetStorageBuffers, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetStorageBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetStorageBuffers, LAYOUT$maxDescriptorSetStorageBuffers);}

    public int maxDescriptorSetStorageBuffersDynamic() {return this.ptr.get(LAYOUT$maxDescriptorSetStorageBuffersDynamic, OFFSET$maxDescriptorSetStorageBuffersDynamic);}
    public void maxDescriptorSetStorageBuffersDynamic(int value) {this.ptr.set(LAYOUT$maxDescriptorSetStorageBuffersDynamic, OFFSET$maxDescriptorSetStorageBuffersDynamic, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetStorageBuffersDynamic_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetStorageBuffersDynamic, LAYOUT$maxDescriptorSetStorageBuffersDynamic);}

    public int maxDescriptorSetSampledImages() {return this.ptr.get(LAYOUT$maxDescriptorSetSampledImages, OFFSET$maxDescriptorSetSampledImages);}
    public void maxDescriptorSetSampledImages(int value) {this.ptr.set(LAYOUT$maxDescriptorSetSampledImages, OFFSET$maxDescriptorSetSampledImages, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetSampledImages_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetSampledImages, LAYOUT$maxDescriptorSetSampledImages);}

    public int maxDescriptorSetStorageImages() {return this.ptr.get(LAYOUT$maxDescriptorSetStorageImages, OFFSET$maxDescriptorSetStorageImages);}
    public void maxDescriptorSetStorageImages(int value) {this.ptr.set(LAYOUT$maxDescriptorSetStorageImages, OFFSET$maxDescriptorSetStorageImages, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetStorageImages_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetStorageImages, LAYOUT$maxDescriptorSetStorageImages);}

    public int maxDescriptorSetInputAttachments() {return this.ptr.get(LAYOUT$maxDescriptorSetInputAttachments, OFFSET$maxDescriptorSetInputAttachments);}
    public void maxDescriptorSetInputAttachments(int value) {this.ptr.set(LAYOUT$maxDescriptorSetInputAttachments, OFFSET$maxDescriptorSetInputAttachments, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetInputAttachments_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetInputAttachments, LAYOUT$maxDescriptorSetInputAttachments);}

    public int maxVertexInputAttributes() {return this.ptr.get(LAYOUT$maxVertexInputAttributes, OFFSET$maxVertexInputAttributes);}
    public void maxVertexInputAttributes(int value) {this.ptr.set(LAYOUT$maxVertexInputAttributes, OFFSET$maxVertexInputAttributes, value);}
    public java.lang.foreign.MemorySegment maxVertexInputAttributes_ptr() {return this.ptr.asSlice(OFFSET$maxVertexInputAttributes, LAYOUT$maxVertexInputAttributes);}

    public int maxVertexInputBindings() {return this.ptr.get(LAYOUT$maxVertexInputBindings, OFFSET$maxVertexInputBindings);}
    public void maxVertexInputBindings(int value) {this.ptr.set(LAYOUT$maxVertexInputBindings, OFFSET$maxVertexInputBindings, value);}
    public java.lang.foreign.MemorySegment maxVertexInputBindings_ptr() {return this.ptr.asSlice(OFFSET$maxVertexInputBindings, LAYOUT$maxVertexInputBindings);}

    public int maxVertexInputAttributeOffset() {return this.ptr.get(LAYOUT$maxVertexInputAttributeOffset, OFFSET$maxVertexInputAttributeOffset);}
    public void maxVertexInputAttributeOffset(int value) {this.ptr.set(LAYOUT$maxVertexInputAttributeOffset, OFFSET$maxVertexInputAttributeOffset, value);}
    public java.lang.foreign.MemorySegment maxVertexInputAttributeOffset_ptr() {return this.ptr.asSlice(OFFSET$maxVertexInputAttributeOffset, LAYOUT$maxVertexInputAttributeOffset);}

    public int maxVertexInputBindingStride() {return this.ptr.get(LAYOUT$maxVertexInputBindingStride, OFFSET$maxVertexInputBindingStride);}
    public void maxVertexInputBindingStride(int value) {this.ptr.set(LAYOUT$maxVertexInputBindingStride, OFFSET$maxVertexInputBindingStride, value);}
    public java.lang.foreign.MemorySegment maxVertexInputBindingStride_ptr() {return this.ptr.asSlice(OFFSET$maxVertexInputBindingStride, LAYOUT$maxVertexInputBindingStride);}

    public int maxVertexOutputComponents() {return this.ptr.get(LAYOUT$maxVertexOutputComponents, OFFSET$maxVertexOutputComponents);}
    public void maxVertexOutputComponents(int value) {this.ptr.set(LAYOUT$maxVertexOutputComponents, OFFSET$maxVertexOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxVertexOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxVertexOutputComponents, LAYOUT$maxVertexOutputComponents);}

    public int maxTessellationGenerationLevel() {return this.ptr.get(LAYOUT$maxTessellationGenerationLevel, OFFSET$maxTessellationGenerationLevel);}
    public void maxTessellationGenerationLevel(int value) {this.ptr.set(LAYOUT$maxTessellationGenerationLevel, OFFSET$maxTessellationGenerationLevel, value);}
    public java.lang.foreign.MemorySegment maxTessellationGenerationLevel_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationGenerationLevel, LAYOUT$maxTessellationGenerationLevel);}

    public int maxTessellationPatchSize() {return this.ptr.get(LAYOUT$maxTessellationPatchSize, OFFSET$maxTessellationPatchSize);}
    public void maxTessellationPatchSize(int value) {this.ptr.set(LAYOUT$maxTessellationPatchSize, OFFSET$maxTessellationPatchSize, value);}
    public java.lang.foreign.MemorySegment maxTessellationPatchSize_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationPatchSize, LAYOUT$maxTessellationPatchSize);}

    public int maxTessellationControlPerVertexInputComponents() {return this.ptr.get(LAYOUT$maxTessellationControlPerVertexInputComponents, OFFSET$maxTessellationControlPerVertexInputComponents);}
    public void maxTessellationControlPerVertexInputComponents(int value) {this.ptr.set(LAYOUT$maxTessellationControlPerVertexInputComponents, OFFSET$maxTessellationControlPerVertexInputComponents, value);}
    public java.lang.foreign.MemorySegment maxTessellationControlPerVertexInputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationControlPerVertexInputComponents, LAYOUT$maxTessellationControlPerVertexInputComponents);}

    public int maxTessellationControlPerVertexOutputComponents() {return this.ptr.get(LAYOUT$maxTessellationControlPerVertexOutputComponents, OFFSET$maxTessellationControlPerVertexOutputComponents);}
    public void maxTessellationControlPerVertexOutputComponents(int value) {this.ptr.set(LAYOUT$maxTessellationControlPerVertexOutputComponents, OFFSET$maxTessellationControlPerVertexOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxTessellationControlPerVertexOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationControlPerVertexOutputComponents, LAYOUT$maxTessellationControlPerVertexOutputComponents);}

    public int maxTessellationControlPerPatchOutputComponents() {return this.ptr.get(LAYOUT$maxTessellationControlPerPatchOutputComponents, OFFSET$maxTessellationControlPerPatchOutputComponents);}
    public void maxTessellationControlPerPatchOutputComponents(int value) {this.ptr.set(LAYOUT$maxTessellationControlPerPatchOutputComponents, OFFSET$maxTessellationControlPerPatchOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxTessellationControlPerPatchOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationControlPerPatchOutputComponents, LAYOUT$maxTessellationControlPerPatchOutputComponents);}

    public int maxTessellationControlTotalOutputComponents() {return this.ptr.get(LAYOUT$maxTessellationControlTotalOutputComponents, OFFSET$maxTessellationControlTotalOutputComponents);}
    public void maxTessellationControlTotalOutputComponents(int value) {this.ptr.set(LAYOUT$maxTessellationControlTotalOutputComponents, OFFSET$maxTessellationControlTotalOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxTessellationControlTotalOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationControlTotalOutputComponents, LAYOUT$maxTessellationControlTotalOutputComponents);}

    public int maxTessellationEvaluationInputComponents() {return this.ptr.get(LAYOUT$maxTessellationEvaluationInputComponents, OFFSET$maxTessellationEvaluationInputComponents);}
    public void maxTessellationEvaluationInputComponents(int value) {this.ptr.set(LAYOUT$maxTessellationEvaluationInputComponents, OFFSET$maxTessellationEvaluationInputComponents, value);}
    public java.lang.foreign.MemorySegment maxTessellationEvaluationInputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationEvaluationInputComponents, LAYOUT$maxTessellationEvaluationInputComponents);}

    public int maxTessellationEvaluationOutputComponents() {return this.ptr.get(LAYOUT$maxTessellationEvaluationOutputComponents, OFFSET$maxTessellationEvaluationOutputComponents);}
    public void maxTessellationEvaluationOutputComponents(int value) {this.ptr.set(LAYOUT$maxTessellationEvaluationOutputComponents, OFFSET$maxTessellationEvaluationOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxTessellationEvaluationOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxTessellationEvaluationOutputComponents, LAYOUT$maxTessellationEvaluationOutputComponents);}

    public int maxGeometryShaderInvocations() {return this.ptr.get(LAYOUT$maxGeometryShaderInvocations, OFFSET$maxGeometryShaderInvocations);}
    public void maxGeometryShaderInvocations(int value) {this.ptr.set(LAYOUT$maxGeometryShaderInvocations, OFFSET$maxGeometryShaderInvocations, value);}
    public java.lang.foreign.MemorySegment maxGeometryShaderInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxGeometryShaderInvocations, LAYOUT$maxGeometryShaderInvocations);}

    public int maxGeometryInputComponents() {return this.ptr.get(LAYOUT$maxGeometryInputComponents, OFFSET$maxGeometryInputComponents);}
    public void maxGeometryInputComponents(int value) {this.ptr.set(LAYOUT$maxGeometryInputComponents, OFFSET$maxGeometryInputComponents, value);}
    public java.lang.foreign.MemorySegment maxGeometryInputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxGeometryInputComponents, LAYOUT$maxGeometryInputComponents);}

    public int maxGeometryOutputComponents() {return this.ptr.get(LAYOUT$maxGeometryOutputComponents, OFFSET$maxGeometryOutputComponents);}
    public void maxGeometryOutputComponents(int value) {this.ptr.set(LAYOUT$maxGeometryOutputComponents, OFFSET$maxGeometryOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxGeometryOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxGeometryOutputComponents, LAYOUT$maxGeometryOutputComponents);}

    public int maxGeometryOutputVertices() {return this.ptr.get(LAYOUT$maxGeometryOutputVertices, OFFSET$maxGeometryOutputVertices);}
    public void maxGeometryOutputVertices(int value) {this.ptr.set(LAYOUT$maxGeometryOutputVertices, OFFSET$maxGeometryOutputVertices, value);}
    public java.lang.foreign.MemorySegment maxGeometryOutputVertices_ptr() {return this.ptr.asSlice(OFFSET$maxGeometryOutputVertices, LAYOUT$maxGeometryOutputVertices);}

    public int maxGeometryTotalOutputComponents() {return this.ptr.get(LAYOUT$maxGeometryTotalOutputComponents, OFFSET$maxGeometryTotalOutputComponents);}
    public void maxGeometryTotalOutputComponents(int value) {this.ptr.set(LAYOUT$maxGeometryTotalOutputComponents, OFFSET$maxGeometryTotalOutputComponents, value);}
    public java.lang.foreign.MemorySegment maxGeometryTotalOutputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxGeometryTotalOutputComponents, LAYOUT$maxGeometryTotalOutputComponents);}

    public int maxFragmentInputComponents() {return this.ptr.get(LAYOUT$maxFragmentInputComponents, OFFSET$maxFragmentInputComponents);}
    public void maxFragmentInputComponents(int value) {this.ptr.set(LAYOUT$maxFragmentInputComponents, OFFSET$maxFragmentInputComponents, value);}
    public java.lang.foreign.MemorySegment maxFragmentInputComponents_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentInputComponents, LAYOUT$maxFragmentInputComponents);}

    public int maxFragmentOutputAttachments() {return this.ptr.get(LAYOUT$maxFragmentOutputAttachments, OFFSET$maxFragmentOutputAttachments);}
    public void maxFragmentOutputAttachments(int value) {this.ptr.set(LAYOUT$maxFragmentOutputAttachments, OFFSET$maxFragmentOutputAttachments, value);}
    public java.lang.foreign.MemorySegment maxFragmentOutputAttachments_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentOutputAttachments, LAYOUT$maxFragmentOutputAttachments);}

    public int maxFragmentDualSrcAttachments() {return this.ptr.get(LAYOUT$maxFragmentDualSrcAttachments, OFFSET$maxFragmentDualSrcAttachments);}
    public void maxFragmentDualSrcAttachments(int value) {this.ptr.set(LAYOUT$maxFragmentDualSrcAttachments, OFFSET$maxFragmentDualSrcAttachments, value);}
    public java.lang.foreign.MemorySegment maxFragmentDualSrcAttachments_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentDualSrcAttachments, LAYOUT$maxFragmentDualSrcAttachments);}

    public int maxFragmentCombinedOutputResources() {return this.ptr.get(LAYOUT$maxFragmentCombinedOutputResources, OFFSET$maxFragmentCombinedOutputResources);}
    public void maxFragmentCombinedOutputResources(int value) {this.ptr.set(LAYOUT$maxFragmentCombinedOutputResources, OFFSET$maxFragmentCombinedOutputResources, value);}
    public java.lang.foreign.MemorySegment maxFragmentCombinedOutputResources_ptr() {return this.ptr.asSlice(OFFSET$maxFragmentCombinedOutputResources, LAYOUT$maxFragmentCombinedOutputResources);}

    public int maxComputeSharedMemorySize() {return this.ptr.get(LAYOUT$maxComputeSharedMemorySize, OFFSET$maxComputeSharedMemorySize);}
    public void maxComputeSharedMemorySize(int value) {this.ptr.set(LAYOUT$maxComputeSharedMemorySize, OFFSET$maxComputeSharedMemorySize, value);}
    public java.lang.foreign.MemorySegment maxComputeSharedMemorySize_ptr() {return this.ptr.asSlice(OFFSET$maxComputeSharedMemorySize, LAYOUT$maxComputeSharedMemorySize);}

    public java.lang.foreign.MemorySegment maxComputeWorkGroupCount() {return this.ptr.asSlice(OFFSET$maxComputeWorkGroupCount, LAYOUT$maxComputeWorkGroupCount);}
    public int maxComputeWorkGroupCount(int i) {return this.maxComputeWorkGroupCount().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxComputeWorkGroupCount(int i, int value) {this.maxComputeWorkGroupCount().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int maxComputeWorkGroupInvocations() {return this.ptr.get(LAYOUT$maxComputeWorkGroupInvocations, OFFSET$maxComputeWorkGroupInvocations);}
    public void maxComputeWorkGroupInvocations(int value) {this.ptr.set(LAYOUT$maxComputeWorkGroupInvocations, OFFSET$maxComputeWorkGroupInvocations, value);}
    public java.lang.foreign.MemorySegment maxComputeWorkGroupInvocations_ptr() {return this.ptr.asSlice(OFFSET$maxComputeWorkGroupInvocations, LAYOUT$maxComputeWorkGroupInvocations);}

    public java.lang.foreign.MemorySegment maxComputeWorkGroupSize() {return this.ptr.asSlice(OFFSET$maxComputeWorkGroupSize, LAYOUT$maxComputeWorkGroupSize);}
    public int maxComputeWorkGroupSize(int i) {return this.maxComputeWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxComputeWorkGroupSize(int i, int value) {this.maxComputeWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public int subPixelPrecisionBits() {return this.ptr.get(LAYOUT$subPixelPrecisionBits, OFFSET$subPixelPrecisionBits);}
    public void subPixelPrecisionBits(int value) {this.ptr.set(LAYOUT$subPixelPrecisionBits, OFFSET$subPixelPrecisionBits, value);}
    public java.lang.foreign.MemorySegment subPixelPrecisionBits_ptr() {return this.ptr.asSlice(OFFSET$subPixelPrecisionBits, LAYOUT$subPixelPrecisionBits);}

    public int subTexelPrecisionBits() {return this.ptr.get(LAYOUT$subTexelPrecisionBits, OFFSET$subTexelPrecisionBits);}
    public void subTexelPrecisionBits(int value) {this.ptr.set(LAYOUT$subTexelPrecisionBits, OFFSET$subTexelPrecisionBits, value);}
    public java.lang.foreign.MemorySegment subTexelPrecisionBits_ptr() {return this.ptr.asSlice(OFFSET$subTexelPrecisionBits, LAYOUT$subTexelPrecisionBits);}

    public int mipmapPrecisionBits() {return this.ptr.get(LAYOUT$mipmapPrecisionBits, OFFSET$mipmapPrecisionBits);}
    public void mipmapPrecisionBits(int value) {this.ptr.set(LAYOUT$mipmapPrecisionBits, OFFSET$mipmapPrecisionBits, value);}
    public java.lang.foreign.MemorySegment mipmapPrecisionBits_ptr() {return this.ptr.asSlice(OFFSET$mipmapPrecisionBits, LAYOUT$mipmapPrecisionBits);}

    public int maxDrawIndexedIndexValue() {return this.ptr.get(LAYOUT$maxDrawIndexedIndexValue, OFFSET$maxDrawIndexedIndexValue);}
    public void maxDrawIndexedIndexValue(int value) {this.ptr.set(LAYOUT$maxDrawIndexedIndexValue, OFFSET$maxDrawIndexedIndexValue, value);}
    public java.lang.foreign.MemorySegment maxDrawIndexedIndexValue_ptr() {return this.ptr.asSlice(OFFSET$maxDrawIndexedIndexValue, LAYOUT$maxDrawIndexedIndexValue);}

    public int maxDrawIndirectCount() {return this.ptr.get(LAYOUT$maxDrawIndirectCount, OFFSET$maxDrawIndirectCount);}
    public void maxDrawIndirectCount(int value) {this.ptr.set(LAYOUT$maxDrawIndirectCount, OFFSET$maxDrawIndirectCount, value);}
    public java.lang.foreign.MemorySegment maxDrawIndirectCount_ptr() {return this.ptr.asSlice(OFFSET$maxDrawIndirectCount, LAYOUT$maxDrawIndirectCount);}

    public float maxSamplerLodBias() {return this.ptr.get(LAYOUT$maxSamplerLodBias, OFFSET$maxSamplerLodBias);}
    public void maxSamplerLodBias(float value) {this.ptr.set(LAYOUT$maxSamplerLodBias, OFFSET$maxSamplerLodBias, value);}
    public java.lang.foreign.MemorySegment maxSamplerLodBias_ptr() {return this.ptr.asSlice(OFFSET$maxSamplerLodBias, LAYOUT$maxSamplerLodBias);}

    public float maxSamplerAnisotropy() {return this.ptr.get(LAYOUT$maxSamplerAnisotropy, OFFSET$maxSamplerAnisotropy);}
    public void maxSamplerAnisotropy(float value) {this.ptr.set(LAYOUT$maxSamplerAnisotropy, OFFSET$maxSamplerAnisotropy, value);}
    public java.lang.foreign.MemorySegment maxSamplerAnisotropy_ptr() {return this.ptr.asSlice(OFFSET$maxSamplerAnisotropy, LAYOUT$maxSamplerAnisotropy);}

    public int maxViewports() {return this.ptr.get(LAYOUT$maxViewports, OFFSET$maxViewports);}
    public void maxViewports(int value) {this.ptr.set(LAYOUT$maxViewports, OFFSET$maxViewports, value);}
    public java.lang.foreign.MemorySegment maxViewports_ptr() {return this.ptr.asSlice(OFFSET$maxViewports, LAYOUT$maxViewports);}

    public java.lang.foreign.MemorySegment maxViewportDimensions() {return this.ptr.asSlice(OFFSET$maxViewportDimensions, LAYOUT$maxViewportDimensions);}
    public int maxViewportDimensions(int i) {return this.maxViewportDimensions().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void maxViewportDimensions(int i, int value) {this.maxViewportDimensions().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public java.lang.foreign.MemorySegment viewportBoundsRange() {return this.ptr.asSlice(OFFSET$viewportBoundsRange, LAYOUT$viewportBoundsRange);}
    public float viewportBoundsRange(int i) {return this.viewportBoundsRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
    public void viewportBoundsRange(int i, float value) {this.viewportBoundsRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}

    public int viewportSubPixelBits() {return this.ptr.get(LAYOUT$viewportSubPixelBits, OFFSET$viewportSubPixelBits);}
    public void viewportSubPixelBits(int value) {this.ptr.set(LAYOUT$viewportSubPixelBits, OFFSET$viewportSubPixelBits, value);}
    public java.lang.foreign.MemorySegment viewportSubPixelBits_ptr() {return this.ptr.asSlice(OFFSET$viewportSubPixelBits, LAYOUT$viewportSubPixelBits);}

    public long minMemoryMapAlignment() {return this.ptr.get(LAYOUT$minMemoryMapAlignment, OFFSET$minMemoryMapAlignment);}
    public void minMemoryMapAlignment(long value) {this.ptr.set(LAYOUT$minMemoryMapAlignment, OFFSET$minMemoryMapAlignment, value);}
    public java.lang.foreign.MemorySegment minMemoryMapAlignment_ptr() {return this.ptr.asSlice(OFFSET$minMemoryMapAlignment, LAYOUT$minMemoryMapAlignment);}

    public long minTexelBufferOffsetAlignment() {return this.ptr.get(LAYOUT$minTexelBufferOffsetAlignment, OFFSET$minTexelBufferOffsetAlignment);}
    public void minTexelBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT$minTexelBufferOffsetAlignment, OFFSET$minTexelBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment minTexelBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minTexelBufferOffsetAlignment, LAYOUT$minTexelBufferOffsetAlignment);}

    public long minUniformBufferOffsetAlignment() {return this.ptr.get(LAYOUT$minUniformBufferOffsetAlignment, OFFSET$minUniformBufferOffsetAlignment);}
    public void minUniformBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT$minUniformBufferOffsetAlignment, OFFSET$minUniformBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment minUniformBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minUniformBufferOffsetAlignment, LAYOUT$minUniformBufferOffsetAlignment);}

    public long minStorageBufferOffsetAlignment() {return this.ptr.get(LAYOUT$minStorageBufferOffsetAlignment, OFFSET$minStorageBufferOffsetAlignment);}
    public void minStorageBufferOffsetAlignment(long value) {this.ptr.set(LAYOUT$minStorageBufferOffsetAlignment, OFFSET$minStorageBufferOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment minStorageBufferOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$minStorageBufferOffsetAlignment, LAYOUT$minStorageBufferOffsetAlignment);}

    public int minTexelOffset() {return this.ptr.get(LAYOUT$minTexelOffset, OFFSET$minTexelOffset);}
    public void minTexelOffset(int value) {this.ptr.set(LAYOUT$minTexelOffset, OFFSET$minTexelOffset, value);}
    public java.lang.foreign.MemorySegment minTexelOffset_ptr() {return this.ptr.asSlice(OFFSET$minTexelOffset, LAYOUT$minTexelOffset);}

    public int maxTexelOffset() {return this.ptr.get(LAYOUT$maxTexelOffset, OFFSET$maxTexelOffset);}
    public void maxTexelOffset(int value) {this.ptr.set(LAYOUT$maxTexelOffset, OFFSET$maxTexelOffset, value);}
    public java.lang.foreign.MemorySegment maxTexelOffset_ptr() {return this.ptr.asSlice(OFFSET$maxTexelOffset, LAYOUT$maxTexelOffset);}

    public int minTexelGatherOffset() {return this.ptr.get(LAYOUT$minTexelGatherOffset, OFFSET$minTexelGatherOffset);}
    public void minTexelGatherOffset(int value) {this.ptr.set(LAYOUT$minTexelGatherOffset, OFFSET$minTexelGatherOffset, value);}
    public java.lang.foreign.MemorySegment minTexelGatherOffset_ptr() {return this.ptr.asSlice(OFFSET$minTexelGatherOffset, LAYOUT$minTexelGatherOffset);}

    public int maxTexelGatherOffset() {return this.ptr.get(LAYOUT$maxTexelGatherOffset, OFFSET$maxTexelGatherOffset);}
    public void maxTexelGatherOffset(int value) {this.ptr.set(LAYOUT$maxTexelGatherOffset, OFFSET$maxTexelGatherOffset, value);}
    public java.lang.foreign.MemorySegment maxTexelGatherOffset_ptr() {return this.ptr.asSlice(OFFSET$maxTexelGatherOffset, LAYOUT$maxTexelGatherOffset);}

    public float minInterpolationOffset() {return this.ptr.get(LAYOUT$minInterpolationOffset, OFFSET$minInterpolationOffset);}
    public void minInterpolationOffset(float value) {this.ptr.set(LAYOUT$minInterpolationOffset, OFFSET$minInterpolationOffset, value);}
    public java.lang.foreign.MemorySegment minInterpolationOffset_ptr() {return this.ptr.asSlice(OFFSET$minInterpolationOffset, LAYOUT$minInterpolationOffset);}

    public float maxInterpolationOffset() {return this.ptr.get(LAYOUT$maxInterpolationOffset, OFFSET$maxInterpolationOffset);}
    public void maxInterpolationOffset(float value) {this.ptr.set(LAYOUT$maxInterpolationOffset, OFFSET$maxInterpolationOffset, value);}
    public java.lang.foreign.MemorySegment maxInterpolationOffset_ptr() {return this.ptr.asSlice(OFFSET$maxInterpolationOffset, LAYOUT$maxInterpolationOffset);}

    public int subPixelInterpolationOffsetBits() {return this.ptr.get(LAYOUT$subPixelInterpolationOffsetBits, OFFSET$subPixelInterpolationOffsetBits);}
    public void subPixelInterpolationOffsetBits(int value) {this.ptr.set(LAYOUT$subPixelInterpolationOffsetBits, OFFSET$subPixelInterpolationOffsetBits, value);}
    public java.lang.foreign.MemorySegment subPixelInterpolationOffsetBits_ptr() {return this.ptr.asSlice(OFFSET$subPixelInterpolationOffsetBits, LAYOUT$subPixelInterpolationOffsetBits);}

    public int maxFramebufferWidth() {return this.ptr.get(LAYOUT$maxFramebufferWidth, OFFSET$maxFramebufferWidth);}
    public void maxFramebufferWidth(int value) {this.ptr.set(LAYOUT$maxFramebufferWidth, OFFSET$maxFramebufferWidth, value);}
    public java.lang.foreign.MemorySegment maxFramebufferWidth_ptr() {return this.ptr.asSlice(OFFSET$maxFramebufferWidth, LAYOUT$maxFramebufferWidth);}

    public int maxFramebufferHeight() {return this.ptr.get(LAYOUT$maxFramebufferHeight, OFFSET$maxFramebufferHeight);}
    public void maxFramebufferHeight(int value) {this.ptr.set(LAYOUT$maxFramebufferHeight, OFFSET$maxFramebufferHeight, value);}
    public java.lang.foreign.MemorySegment maxFramebufferHeight_ptr() {return this.ptr.asSlice(OFFSET$maxFramebufferHeight, LAYOUT$maxFramebufferHeight);}

    public int maxFramebufferLayers() {return this.ptr.get(LAYOUT$maxFramebufferLayers, OFFSET$maxFramebufferLayers);}
    public void maxFramebufferLayers(int value) {this.ptr.set(LAYOUT$maxFramebufferLayers, OFFSET$maxFramebufferLayers, value);}
    public java.lang.foreign.MemorySegment maxFramebufferLayers_ptr() {return this.ptr.asSlice(OFFSET$maxFramebufferLayers, LAYOUT$maxFramebufferLayers);}

    public int framebufferColorSampleCounts() {return this.ptr.get(LAYOUT$framebufferColorSampleCounts, OFFSET$framebufferColorSampleCounts);}
    public void framebufferColorSampleCounts(int value) {this.ptr.set(LAYOUT$framebufferColorSampleCounts, OFFSET$framebufferColorSampleCounts, value);}
    public java.lang.foreign.MemorySegment framebufferColorSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$framebufferColorSampleCounts, LAYOUT$framebufferColorSampleCounts);}

    public int framebufferDepthSampleCounts() {return this.ptr.get(LAYOUT$framebufferDepthSampleCounts, OFFSET$framebufferDepthSampleCounts);}
    public void framebufferDepthSampleCounts(int value) {this.ptr.set(LAYOUT$framebufferDepthSampleCounts, OFFSET$framebufferDepthSampleCounts, value);}
    public java.lang.foreign.MemorySegment framebufferDepthSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$framebufferDepthSampleCounts, LAYOUT$framebufferDepthSampleCounts);}

    public int framebufferStencilSampleCounts() {return this.ptr.get(LAYOUT$framebufferStencilSampleCounts, OFFSET$framebufferStencilSampleCounts);}
    public void framebufferStencilSampleCounts(int value) {this.ptr.set(LAYOUT$framebufferStencilSampleCounts, OFFSET$framebufferStencilSampleCounts, value);}
    public java.lang.foreign.MemorySegment framebufferStencilSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$framebufferStencilSampleCounts, LAYOUT$framebufferStencilSampleCounts);}

    public int framebufferNoAttachmentsSampleCounts() {return this.ptr.get(LAYOUT$framebufferNoAttachmentsSampleCounts, OFFSET$framebufferNoAttachmentsSampleCounts);}
    public void framebufferNoAttachmentsSampleCounts(int value) {this.ptr.set(LAYOUT$framebufferNoAttachmentsSampleCounts, OFFSET$framebufferNoAttachmentsSampleCounts, value);}
    public java.lang.foreign.MemorySegment framebufferNoAttachmentsSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$framebufferNoAttachmentsSampleCounts, LAYOUT$framebufferNoAttachmentsSampleCounts);}

    public int maxColorAttachments() {return this.ptr.get(LAYOUT$maxColorAttachments, OFFSET$maxColorAttachments);}
    public void maxColorAttachments(int value) {this.ptr.set(LAYOUT$maxColorAttachments, OFFSET$maxColorAttachments, value);}
    public java.lang.foreign.MemorySegment maxColorAttachments_ptr() {return this.ptr.asSlice(OFFSET$maxColorAttachments, LAYOUT$maxColorAttachments);}

    public int sampledImageColorSampleCounts() {return this.ptr.get(LAYOUT$sampledImageColorSampleCounts, OFFSET$sampledImageColorSampleCounts);}
    public void sampledImageColorSampleCounts(int value) {this.ptr.set(LAYOUT$sampledImageColorSampleCounts, OFFSET$sampledImageColorSampleCounts, value);}
    public java.lang.foreign.MemorySegment sampledImageColorSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$sampledImageColorSampleCounts, LAYOUT$sampledImageColorSampleCounts);}

    public int sampledImageIntegerSampleCounts() {return this.ptr.get(LAYOUT$sampledImageIntegerSampleCounts, OFFSET$sampledImageIntegerSampleCounts);}
    public void sampledImageIntegerSampleCounts(int value) {this.ptr.set(LAYOUT$sampledImageIntegerSampleCounts, OFFSET$sampledImageIntegerSampleCounts, value);}
    public java.lang.foreign.MemorySegment sampledImageIntegerSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$sampledImageIntegerSampleCounts, LAYOUT$sampledImageIntegerSampleCounts);}

    public int sampledImageDepthSampleCounts() {return this.ptr.get(LAYOUT$sampledImageDepthSampleCounts, OFFSET$sampledImageDepthSampleCounts);}
    public void sampledImageDepthSampleCounts(int value) {this.ptr.set(LAYOUT$sampledImageDepthSampleCounts, OFFSET$sampledImageDepthSampleCounts, value);}
    public java.lang.foreign.MemorySegment sampledImageDepthSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$sampledImageDepthSampleCounts, LAYOUT$sampledImageDepthSampleCounts);}

    public int sampledImageStencilSampleCounts() {return this.ptr.get(LAYOUT$sampledImageStencilSampleCounts, OFFSET$sampledImageStencilSampleCounts);}
    public void sampledImageStencilSampleCounts(int value) {this.ptr.set(LAYOUT$sampledImageStencilSampleCounts, OFFSET$sampledImageStencilSampleCounts, value);}
    public java.lang.foreign.MemorySegment sampledImageStencilSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$sampledImageStencilSampleCounts, LAYOUT$sampledImageStencilSampleCounts);}

    public int storageImageSampleCounts() {return this.ptr.get(LAYOUT$storageImageSampleCounts, OFFSET$storageImageSampleCounts);}
    public void storageImageSampleCounts(int value) {this.ptr.set(LAYOUT$storageImageSampleCounts, OFFSET$storageImageSampleCounts, value);}
    public java.lang.foreign.MemorySegment storageImageSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$storageImageSampleCounts, LAYOUT$storageImageSampleCounts);}

    public int maxSampleMaskWords() {return this.ptr.get(LAYOUT$maxSampleMaskWords, OFFSET$maxSampleMaskWords);}
    public void maxSampleMaskWords(int value) {this.ptr.set(LAYOUT$maxSampleMaskWords, OFFSET$maxSampleMaskWords, value);}
    public java.lang.foreign.MemorySegment maxSampleMaskWords_ptr() {return this.ptr.asSlice(OFFSET$maxSampleMaskWords, LAYOUT$maxSampleMaskWords);}

    public int timestampComputeAndGraphics() {return this.ptr.get(LAYOUT$timestampComputeAndGraphics, OFFSET$timestampComputeAndGraphics);}
    public void timestampComputeAndGraphics(int value) {this.ptr.set(LAYOUT$timestampComputeAndGraphics, OFFSET$timestampComputeAndGraphics, value);}
    public java.lang.foreign.MemorySegment timestampComputeAndGraphics_ptr() {return this.ptr.asSlice(OFFSET$timestampComputeAndGraphics, LAYOUT$timestampComputeAndGraphics);}

    public float timestampPeriod() {return this.ptr.get(LAYOUT$timestampPeriod, OFFSET$timestampPeriod);}
    public void timestampPeriod(float value) {this.ptr.set(LAYOUT$timestampPeriod, OFFSET$timestampPeriod, value);}
    public java.lang.foreign.MemorySegment timestampPeriod_ptr() {return this.ptr.asSlice(OFFSET$timestampPeriod, LAYOUT$timestampPeriod);}

    public int maxClipDistances() {return this.ptr.get(LAYOUT$maxClipDistances, OFFSET$maxClipDistances);}
    public void maxClipDistances(int value) {this.ptr.set(LAYOUT$maxClipDistances, OFFSET$maxClipDistances, value);}
    public java.lang.foreign.MemorySegment maxClipDistances_ptr() {return this.ptr.asSlice(OFFSET$maxClipDistances, LAYOUT$maxClipDistances);}

    public int maxCullDistances() {return this.ptr.get(LAYOUT$maxCullDistances, OFFSET$maxCullDistances);}
    public void maxCullDistances(int value) {this.ptr.set(LAYOUT$maxCullDistances, OFFSET$maxCullDistances, value);}
    public java.lang.foreign.MemorySegment maxCullDistances_ptr() {return this.ptr.asSlice(OFFSET$maxCullDistances, LAYOUT$maxCullDistances);}

    public int maxCombinedClipAndCullDistances() {return this.ptr.get(LAYOUT$maxCombinedClipAndCullDistances, OFFSET$maxCombinedClipAndCullDistances);}
    public void maxCombinedClipAndCullDistances(int value) {this.ptr.set(LAYOUT$maxCombinedClipAndCullDistances, OFFSET$maxCombinedClipAndCullDistances, value);}
    public java.lang.foreign.MemorySegment maxCombinedClipAndCullDistances_ptr() {return this.ptr.asSlice(OFFSET$maxCombinedClipAndCullDistances, LAYOUT$maxCombinedClipAndCullDistances);}

    public int discreteQueuePriorities() {return this.ptr.get(LAYOUT$discreteQueuePriorities, OFFSET$discreteQueuePriorities);}
    public void discreteQueuePriorities(int value) {this.ptr.set(LAYOUT$discreteQueuePriorities, OFFSET$discreteQueuePriorities, value);}
    public java.lang.foreign.MemorySegment discreteQueuePriorities_ptr() {return this.ptr.asSlice(OFFSET$discreteQueuePriorities, LAYOUT$discreteQueuePriorities);}

    public java.lang.foreign.MemorySegment pointSizeRange() {return this.ptr.asSlice(OFFSET$pointSizeRange, LAYOUT$pointSizeRange);}
    public float pointSizeRange(int i) {return this.pointSizeRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
    public void pointSizeRange(int i, float value) {this.pointSizeRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}

    public java.lang.foreign.MemorySegment lineWidthRange() {return this.ptr.asSlice(OFFSET$lineWidthRange, LAYOUT$lineWidthRange);}
    public float lineWidthRange(int i) {return this.lineWidthRange().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
    public void lineWidthRange(int i, float value) {this.lineWidthRange().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}

    public float pointSizeGranularity() {return this.ptr.get(LAYOUT$pointSizeGranularity, OFFSET$pointSizeGranularity);}
    public void pointSizeGranularity(float value) {this.ptr.set(LAYOUT$pointSizeGranularity, OFFSET$pointSizeGranularity, value);}
    public java.lang.foreign.MemorySegment pointSizeGranularity_ptr() {return this.ptr.asSlice(OFFSET$pointSizeGranularity, LAYOUT$pointSizeGranularity);}

    public float lineWidthGranularity() {return this.ptr.get(LAYOUT$lineWidthGranularity, OFFSET$lineWidthGranularity);}
    public void lineWidthGranularity(float value) {this.ptr.set(LAYOUT$lineWidthGranularity, OFFSET$lineWidthGranularity, value);}
    public java.lang.foreign.MemorySegment lineWidthGranularity_ptr() {return this.ptr.asSlice(OFFSET$lineWidthGranularity, LAYOUT$lineWidthGranularity);}

    public int strictLines() {return this.ptr.get(LAYOUT$strictLines, OFFSET$strictLines);}
    public void strictLines(int value) {this.ptr.set(LAYOUT$strictLines, OFFSET$strictLines, value);}
    public java.lang.foreign.MemorySegment strictLines_ptr() {return this.ptr.asSlice(OFFSET$strictLines, LAYOUT$strictLines);}

    public int standardSampleLocations() {return this.ptr.get(LAYOUT$standardSampleLocations, OFFSET$standardSampleLocations);}
    public void standardSampleLocations(int value) {this.ptr.set(LAYOUT$standardSampleLocations, OFFSET$standardSampleLocations, value);}
    public java.lang.foreign.MemorySegment standardSampleLocations_ptr() {return this.ptr.asSlice(OFFSET$standardSampleLocations, LAYOUT$standardSampleLocations);}

    public long optimalBufferCopyOffsetAlignment() {return this.ptr.get(LAYOUT$optimalBufferCopyOffsetAlignment, OFFSET$optimalBufferCopyOffsetAlignment);}
    public void optimalBufferCopyOffsetAlignment(long value) {this.ptr.set(LAYOUT$optimalBufferCopyOffsetAlignment, OFFSET$optimalBufferCopyOffsetAlignment, value);}
    public java.lang.foreign.MemorySegment optimalBufferCopyOffsetAlignment_ptr() {return this.ptr.asSlice(OFFSET$optimalBufferCopyOffsetAlignment, LAYOUT$optimalBufferCopyOffsetAlignment);}

    public long optimalBufferCopyRowPitchAlignment() {return this.ptr.get(LAYOUT$optimalBufferCopyRowPitchAlignment, OFFSET$optimalBufferCopyRowPitchAlignment);}
    public void optimalBufferCopyRowPitchAlignment(long value) {this.ptr.set(LAYOUT$optimalBufferCopyRowPitchAlignment, OFFSET$optimalBufferCopyRowPitchAlignment, value);}
    public java.lang.foreign.MemorySegment optimalBufferCopyRowPitchAlignment_ptr() {return this.ptr.asSlice(OFFSET$optimalBufferCopyRowPitchAlignment, LAYOUT$optimalBufferCopyRowPitchAlignment);}

    public long nonCoherentAtomSize() {return this.ptr.get(LAYOUT$nonCoherentAtomSize, OFFSET$nonCoherentAtomSize);}
    public void nonCoherentAtomSize(long value) {this.ptr.set(LAYOUT$nonCoherentAtomSize, OFFSET$nonCoherentAtomSize, value);}
    public java.lang.foreign.MemorySegment nonCoherentAtomSize_ptr() {return this.ptr.asSlice(OFFSET$nonCoherentAtomSize, LAYOUT$nonCoherentAtomSize);}
}

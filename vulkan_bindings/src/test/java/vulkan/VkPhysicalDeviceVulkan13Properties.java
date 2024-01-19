package vulkan;

public record VkPhysicalDeviceVulkan13Properties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$minSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$minSubgroupSize = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSubgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxSubgroupSize = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxComputeWorkgroupSubgroups = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxComputeWorkgroupSubgroups = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$requiredSubgroupSizeStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$requiredSubgroupSizeStages = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxInlineUniformBlockSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxInlineUniformBlockSize = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorInlineUniformBlocks = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetInlineUniformBlocks = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxInlineUniformTotalSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxInlineUniformTotalSize = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct8BitUnsignedAccelerated = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct8BitSignedAccelerated = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct8BitMixedSignednessAccelerated = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct4x8BitPackedSignedAccelerated = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct16BitUnsignedAccelerated = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct16BitSignedAccelerated = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct16BitMixedSignednessAccelerated = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct32BitUnsignedAccelerated = 92L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct32BitSignedAccelerated = 96L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct32BitMixedSignednessAccelerated = 100L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct64BitUnsignedAccelerated = 104L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct64BitSignedAccelerated = 108L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProduct64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProduct64BitMixedSignednessAccelerated = 112L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = 116L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated = 120L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = 124L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = 128L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = 132L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = 136L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = 140L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated = 144L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = 148L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = 152L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated = 156L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = 160L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = 164L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated = 168L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = 172L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$storageTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$storageTexelBufferOffsetAlignmentBytes = 176L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$storageTexelBufferOffsetSingleTexelAlignment = 184L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$uniformTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$uniformTexelBufferOffsetAlignmentBytes = 192L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$uniformTexelBufferOffsetSingleTexelAlignment = 200L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxBufferSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxBufferSize = 208L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$minSubgroupSize,
            LAYOUT$maxSubgroupSize,
            LAYOUT$maxComputeWorkgroupSubgroups,
            LAYOUT$requiredSubgroupSizeStages,
            LAYOUT$maxInlineUniformBlockSize,
            LAYOUT$maxPerStageDescriptorInlineUniformBlocks,
            LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks,
            LAYOUT$maxDescriptorSetInlineUniformBlocks,
            LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks,
            LAYOUT$maxInlineUniformTotalSize,
            LAYOUT$integerDotProduct8BitUnsignedAccelerated,
            LAYOUT$integerDotProduct8BitSignedAccelerated,
            LAYOUT$integerDotProduct8BitMixedSignednessAccelerated,
            LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated,
            LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated,
            LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated,
            LAYOUT$integerDotProduct16BitUnsignedAccelerated,
            LAYOUT$integerDotProduct16BitSignedAccelerated,
            LAYOUT$integerDotProduct16BitMixedSignednessAccelerated,
            LAYOUT$integerDotProduct32BitUnsignedAccelerated,
            LAYOUT$integerDotProduct32BitSignedAccelerated,
            LAYOUT$integerDotProduct32BitMixedSignednessAccelerated,
            LAYOUT$integerDotProduct64BitUnsignedAccelerated,
            LAYOUT$integerDotProduct64BitSignedAccelerated,
            LAYOUT$integerDotProduct64BitMixedSignednessAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated,
            LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated,
            LAYOUT$storageTexelBufferOffsetAlignmentBytes,
            LAYOUT$storageTexelBufferOffsetSingleTexelAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$uniformTexelBufferOffsetAlignmentBytes,
            LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$maxBufferSize
    ).withName("VkPhysicalDeviceVulkan13Properties");

    public VkPhysicalDeviceVulkan13Properties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int minSubgroupSize() {return this.ptr.get(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize);}
    public void minSubgroupSize(int value) {this.ptr.set(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize, value);}
    public java.lang.foreign.MemorySegment minSubgroupSize_ptr() {return this.ptr.asSlice(OFFSET$minSubgroupSize, LAYOUT$minSubgroupSize);}

    public int maxSubgroupSize() {return this.ptr.get(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize);}
    public void maxSubgroupSize(int value) {this.ptr.set(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize, value);}
    public java.lang.foreign.MemorySegment maxSubgroupSize_ptr() {return this.ptr.asSlice(OFFSET$maxSubgroupSize, LAYOUT$maxSubgroupSize);}

    public int maxComputeWorkgroupSubgroups() {return this.ptr.get(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups);}
    public void maxComputeWorkgroupSubgroups(int value) {this.ptr.set(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups, value);}
    public java.lang.foreign.MemorySegment maxComputeWorkgroupSubgroups_ptr() {return this.ptr.asSlice(OFFSET$maxComputeWorkgroupSubgroups, LAYOUT$maxComputeWorkgroupSubgroups);}

    public int requiredSubgroupSizeStages() {return this.ptr.get(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages);}
    public void requiredSubgroupSizeStages(int value) {this.ptr.set(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages, value);}
    public java.lang.foreign.MemorySegment requiredSubgroupSizeStages_ptr() {return this.ptr.asSlice(OFFSET$requiredSubgroupSizeStages, LAYOUT$requiredSubgroupSizeStages);}

    public int maxInlineUniformBlockSize() {return this.ptr.get(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize);}
    public void maxInlineUniformBlockSize(int value) {this.ptr.set(LAYOUT$maxInlineUniformBlockSize, OFFSET$maxInlineUniformBlockSize, value);}
    public java.lang.foreign.MemorySegment maxInlineUniformBlockSize_ptr() {return this.ptr.asSlice(OFFSET$maxInlineUniformBlockSize, LAYOUT$maxInlineUniformBlockSize);}

    public int maxPerStageDescriptorInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks);}
    public void maxPerStageDescriptorInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorInlineUniformBlocks, OFFSET$maxPerStageDescriptorInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorInlineUniformBlocks, LAYOUT$maxPerStageDescriptorInlineUniformBlocks);}

    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}
    public void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, LAYOUT$maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);}

    public int maxDescriptorSetInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks);}
    public void maxDescriptorSetInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxDescriptorSetInlineUniformBlocks, OFFSET$maxDescriptorSetInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetInlineUniformBlocks, LAYOUT$maxDescriptorSetInlineUniformBlocks);}

    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {return this.ptr.get(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}
    public void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) {this.ptr.set(LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, value);}
    public java.lang.foreign.MemorySegment maxDescriptorSetUpdateAfterBindInlineUniformBlocks_ptr() {return this.ptr.asSlice(OFFSET$maxDescriptorSetUpdateAfterBindInlineUniformBlocks, LAYOUT$maxDescriptorSetUpdateAfterBindInlineUniformBlocks);}

    public int maxInlineUniformTotalSize() {return this.ptr.get(LAYOUT$maxInlineUniformTotalSize, OFFSET$maxInlineUniformTotalSize);}
    public void maxInlineUniformTotalSize(int value) {this.ptr.set(LAYOUT$maxInlineUniformTotalSize, OFFSET$maxInlineUniformTotalSize, value);}
    public java.lang.foreign.MemorySegment maxInlineUniformTotalSize_ptr() {return this.ptr.asSlice(OFFSET$maxInlineUniformTotalSize, LAYOUT$maxInlineUniformTotalSize);}

    public int integerDotProduct8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated);}
    public void integerDotProduct8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct8BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct8BitUnsignedAccelerated, LAYOUT$integerDotProduct8BitUnsignedAccelerated);}

    public int integerDotProduct8BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated);}
    public void integerDotProduct8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct8BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct8BitSignedAccelerated, LAYOUT$integerDotProduct8BitSignedAccelerated);}

    public int integerDotProduct8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated);}
    public void integerDotProduct8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct8BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct8BitMixedSignednessAccelerated, LAYOUT$integerDotProduct8BitMixedSignednessAccelerated);}

    public int integerDotProduct4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated);}
    public void integerDotProduct4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct4x8BitPackedUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated, LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated);}

    public int integerDotProduct4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated);}
    public void integerDotProduct4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct4x8BitPackedSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct4x8BitPackedSignedAccelerated, LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated);}

    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated);}
    public void integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct4x8BitPackedMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated, LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated);}

    public int integerDotProduct16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated);}
    public void integerDotProduct16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct16BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct16BitUnsignedAccelerated, LAYOUT$integerDotProduct16BitUnsignedAccelerated);}

    public int integerDotProduct16BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated);}
    public void integerDotProduct16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct16BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct16BitSignedAccelerated, LAYOUT$integerDotProduct16BitSignedAccelerated);}

    public int integerDotProduct16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated);}
    public void integerDotProduct16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct16BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct16BitMixedSignednessAccelerated, LAYOUT$integerDotProduct16BitMixedSignednessAccelerated);}

    public int integerDotProduct32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated);}
    public void integerDotProduct32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct32BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct32BitUnsignedAccelerated, LAYOUT$integerDotProduct32BitUnsignedAccelerated);}

    public int integerDotProduct32BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated);}
    public void integerDotProduct32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct32BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct32BitSignedAccelerated, LAYOUT$integerDotProduct32BitSignedAccelerated);}

    public int integerDotProduct32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated);}
    public void integerDotProduct32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct32BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct32BitMixedSignednessAccelerated, LAYOUT$integerDotProduct32BitMixedSignednessAccelerated);}

    public int integerDotProduct64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated);}
    public void integerDotProduct64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct64BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct64BitUnsignedAccelerated, LAYOUT$integerDotProduct64BitUnsignedAccelerated);}

    public int integerDotProduct64BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated);}
    public void integerDotProduct64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct64BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct64BitSignedAccelerated, LAYOUT$integerDotProduct64BitSignedAccelerated);}

    public int integerDotProduct64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated);}
    public void integerDotProduct64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProduct64BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProduct64BitMixedSignednessAccelerated, LAYOUT$integerDotProduct64BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating8BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating8BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating16BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating16BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating32BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating32BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating64BitUnsignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating64BitSignedAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated, LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated);}

    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {return this.ptr.get(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}
    public void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) {this.ptr.set(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, value);}
    public java.lang.foreign.MemorySegment integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated_ptr() {return this.ptr.asSlice(OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);}

    public long storageTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes);}
    public void storageTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes, value);}
    public java.lang.foreign.MemorySegment storageTexelBufferOffsetAlignmentBytes_ptr() {return this.ptr.asSlice(OFFSET$storageTexelBufferOffsetAlignmentBytes, LAYOUT$storageTexelBufferOffsetAlignmentBytes);}

    public int storageTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment);}
    public void storageTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment, value);}
    public java.lang.foreign.MemorySegment storageTexelBufferOffsetSingleTexelAlignment_ptr() {return this.ptr.asSlice(OFFSET$storageTexelBufferOffsetSingleTexelAlignment, LAYOUT$storageTexelBufferOffsetSingleTexelAlignment);}

    public long uniformTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes);}
    public void uniformTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes, value);}
    public java.lang.foreign.MemorySegment uniformTexelBufferOffsetAlignmentBytes_ptr() {return this.ptr.asSlice(OFFSET$uniformTexelBufferOffsetAlignmentBytes, LAYOUT$uniformTexelBufferOffsetAlignmentBytes);}

    public int uniformTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment);}
    public void uniformTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment, value);}
    public java.lang.foreign.MemorySegment uniformTexelBufferOffsetSingleTexelAlignment_ptr() {return this.ptr.asSlice(OFFSET$uniformTexelBufferOffsetSingleTexelAlignment, LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment);}

    public long maxBufferSize() {return this.ptr.get(LAYOUT$maxBufferSize, OFFSET$maxBufferSize);}
    public void maxBufferSize(long value) {this.ptr.set(LAYOUT$maxBufferSize, OFFSET$maxBufferSize, value);}
    public java.lang.foreign.MemorySegment maxBufferSize_ptr() {return this.ptr.asSlice(OFFSET$maxBufferSize, LAYOUT$maxBufferSize);}
}

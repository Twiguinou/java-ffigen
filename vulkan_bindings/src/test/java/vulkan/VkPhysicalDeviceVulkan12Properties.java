package vulkan;

public record VkPhysicalDeviceVulkan12Properties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$driverID = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$driverID = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$driverName = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$driverName = 20L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$driverInfo = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$driverInfo = 276L;
	public static final java.lang.foreign.GroupLayout LAYOUT$conformanceVersion = vulkan.VkConformanceVersion.gStructLayout;
	public static final long OFFSET$conformanceVersion = 532L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$denormBehaviorIndependence = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$denormBehaviorIndependence = 536L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$roundingModeIndependence = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$roundingModeIndependence = 540L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat16 = 544L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat32 = 548L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat64 = 552L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormPreserveFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderDenormPreserveFloat16 = 556L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormPreserveFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderDenormPreserveFloat32 = 560L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormPreserveFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderDenormPreserveFloat64 = 564L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormFlushToZeroFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderDenormFlushToZeroFloat16 = 568L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormFlushToZeroFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderDenormFlushToZeroFloat32 = 572L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderDenormFlushToZeroFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderDenormFlushToZeroFloat64 = 576L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTEFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderRoundingModeRTEFloat16 = 580L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTEFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderRoundingModeRTEFloat32 = 584L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTEFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderRoundingModeRTEFloat64 = 588L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTZFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderRoundingModeRTZFloat16 = 592L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTZFloat32 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderRoundingModeRTZFloat32 = 596L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderRoundingModeRTZFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderRoundingModeRTZFloat64 = 600L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxUpdateAfterBindDescriptorsInAllPools = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxUpdateAfterBindDescriptorsInAllPools = 604L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderUniformBufferArrayNonUniformIndexingNative = 608L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSampledImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSampledImageArrayNonUniformIndexingNative = 612L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageBufferArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageBufferArrayNonUniformIndexingNative = 616L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageImageArrayNonUniformIndexingNative = 620L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInputAttachmentArrayNonUniformIndexingNative = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderInputAttachmentArrayNonUniformIndexingNative = 624L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$robustBufferAccessUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$robustBufferAccessUpdateAfterBind = 628L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$quadDivergentImplicitLod = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$quadDivergentImplicitLod = 632L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindSamplers = 636L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindUniformBuffers = 640L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindStorageBuffers = 644L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindSampledImages = 648L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindStorageImages = 652L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindInputAttachments = 656L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerStageUpdateAfterBindResources = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxPerStageUpdateAfterBindResources = 660L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindSamplers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindSamplers = 664L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffers = 668L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = 672L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffers = 676L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = 680L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindSampledImages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindSampledImages = 684L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindStorageImages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindStorageImages = 688L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxDescriptorSetUpdateAfterBindInputAttachments = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxDescriptorSetUpdateAfterBindInputAttachments = 692L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedDepthResolveModes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedDepthResolveModes = 696L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$supportedStencilResolveModes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$supportedStencilResolveModes = 700L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$independentResolveNone = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$independentResolveNone = 704L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$independentResolve = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$independentResolve = 708L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$filterMinmaxSingleComponentFormats = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$filterMinmaxSingleComponentFormats = 712L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$filterMinmaxImageComponentMapping = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$filterMinmaxImageComponentMapping = 716L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxTimelineSemaphoreValueDifference = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$maxTimelineSemaphoreValueDifference = 720L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$framebufferIntegerColorSampleCounts = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$framebufferIntegerColorSampleCounts = 728L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$driverID,
			LAYOUT$driverName,
			LAYOUT$driverInfo,
			LAYOUT$conformanceVersion,
			LAYOUT$denormBehaviorIndependence,
			LAYOUT$roundingModeIndependence,
			LAYOUT$shaderSignedZeroInfNanPreserveFloat16,
			LAYOUT$shaderSignedZeroInfNanPreserveFloat32,
			LAYOUT$shaderSignedZeroInfNanPreserveFloat64,
			LAYOUT$shaderDenormPreserveFloat16,
			LAYOUT$shaderDenormPreserveFloat32,
			LAYOUT$shaderDenormPreserveFloat64,
			LAYOUT$shaderDenormFlushToZeroFloat16,
			LAYOUT$shaderDenormFlushToZeroFloat32,
			LAYOUT$shaderDenormFlushToZeroFloat64,
			LAYOUT$shaderRoundingModeRTEFloat16,
			LAYOUT$shaderRoundingModeRTEFloat32,
			LAYOUT$shaderRoundingModeRTEFloat64,
			LAYOUT$shaderRoundingModeRTZFloat16,
			LAYOUT$shaderRoundingModeRTZFloat32,
			LAYOUT$shaderRoundingModeRTZFloat64,
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
			LAYOUT$supportedDepthResolveModes,
			LAYOUT$supportedStencilResolveModes,
			LAYOUT$independentResolveNone,
			LAYOUT$independentResolve,
			LAYOUT$filterMinmaxSingleComponentFormats,
			LAYOUT$filterMinmaxImageComponentMapping,
			LAYOUT$maxTimelineSemaphoreValueDifference,
			LAYOUT$framebufferIntegerColorSampleCounts,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceVulkan12Properties");

	public VkPhysicalDeviceVulkan12Properties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int driverID() {return this.ptr.get(LAYOUT$driverID, OFFSET$driverID);}
	public void driverID(int value) {this.ptr.set(LAYOUT$driverID, OFFSET$driverID, value);}
	public java.lang.foreign.MemorySegment driverID_ptr() {return this.ptr.asSlice(OFFSET$driverID, LAYOUT$driverID);}

	public java.lang.foreign.MemorySegment driverName() {return this.ptr.asSlice(OFFSET$driverName, LAYOUT$driverName);}
	public char driverName(int i) {return (char)this.driverName().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void driverName(int i, char value) {this.driverName().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment driverInfo() {return this.ptr.asSlice(OFFSET$driverInfo, LAYOUT$driverInfo);}
	public char driverInfo(int i) {return (char)this.driverInfo().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void driverInfo(int i, char value) {this.driverInfo().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public vulkan.VkConformanceVersion conformanceVersion() {return new vulkan.VkConformanceVersion(this.ptr.asSlice(OFFSET$conformanceVersion, LAYOUT$conformanceVersion));}

	public int denormBehaviorIndependence() {return this.ptr.get(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence);}
	public void denormBehaviorIndependence(int value) {this.ptr.set(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence, value);}
	public java.lang.foreign.MemorySegment denormBehaviorIndependence_ptr() {return this.ptr.asSlice(OFFSET$denormBehaviorIndependence, LAYOUT$denormBehaviorIndependence);}

	public int roundingModeIndependence() {return this.ptr.get(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence);}
	public void roundingModeIndependence(int value) {this.ptr.set(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence, value);}
	public java.lang.foreign.MemorySegment roundingModeIndependence_ptr() {return this.ptr.asSlice(OFFSET$roundingModeIndependence, LAYOUT$roundingModeIndependence);}

	public int shaderSignedZeroInfNanPreserveFloat16() {return this.ptr.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16);}
	public void shaderSignedZeroInfNanPreserveFloat16(int value) {this.ptr.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16, value);}
	public java.lang.foreign.MemorySegment shaderSignedZeroInfNanPreserveFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderSignedZeroInfNanPreserveFloat16, LAYOUT$shaderSignedZeroInfNanPreserveFloat16);}

	public int shaderSignedZeroInfNanPreserveFloat32() {return this.ptr.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32);}
	public void shaderSignedZeroInfNanPreserveFloat32(int value) {this.ptr.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32, value);}
	public java.lang.foreign.MemorySegment shaderSignedZeroInfNanPreserveFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderSignedZeroInfNanPreserveFloat32, LAYOUT$shaderSignedZeroInfNanPreserveFloat32);}

	public int shaderSignedZeroInfNanPreserveFloat64() {return this.ptr.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64);}
	public void shaderSignedZeroInfNanPreserveFloat64(int value) {this.ptr.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64, value);}
	public java.lang.foreign.MemorySegment shaderSignedZeroInfNanPreserveFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderSignedZeroInfNanPreserveFloat64, LAYOUT$shaderSignedZeroInfNanPreserveFloat64);}

	public int shaderDenormPreserveFloat16() {return this.ptr.get(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16);}
	public void shaderDenormPreserveFloat16(int value) {this.ptr.set(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16, value);}
	public java.lang.foreign.MemorySegment shaderDenormPreserveFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormPreserveFloat16, LAYOUT$shaderDenormPreserveFloat16);}

	public int shaderDenormPreserveFloat32() {return this.ptr.get(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32);}
	public void shaderDenormPreserveFloat32(int value) {this.ptr.set(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32, value);}
	public java.lang.foreign.MemorySegment shaderDenormPreserveFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormPreserveFloat32, LAYOUT$shaderDenormPreserveFloat32);}

	public int shaderDenormPreserveFloat64() {return this.ptr.get(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64);}
	public void shaderDenormPreserveFloat64(int value) {this.ptr.set(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64, value);}
	public java.lang.foreign.MemorySegment shaderDenormPreserveFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormPreserveFloat64, LAYOUT$shaderDenormPreserveFloat64);}

	public int shaderDenormFlushToZeroFloat16() {return this.ptr.get(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16);}
	public void shaderDenormFlushToZeroFloat16(int value) {this.ptr.set(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16, value);}
	public java.lang.foreign.MemorySegment shaderDenormFlushToZeroFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormFlushToZeroFloat16, LAYOUT$shaderDenormFlushToZeroFloat16);}

	public int shaderDenormFlushToZeroFloat32() {return this.ptr.get(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32);}
	public void shaderDenormFlushToZeroFloat32(int value) {this.ptr.set(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32, value);}
	public java.lang.foreign.MemorySegment shaderDenormFlushToZeroFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormFlushToZeroFloat32, LAYOUT$shaderDenormFlushToZeroFloat32);}

	public int shaderDenormFlushToZeroFloat64() {return this.ptr.get(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64);}
	public void shaderDenormFlushToZeroFloat64(int value) {this.ptr.set(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64, value);}
	public java.lang.foreign.MemorySegment shaderDenormFlushToZeroFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderDenormFlushToZeroFloat64, LAYOUT$shaderDenormFlushToZeroFloat64);}

	public int shaderRoundingModeRTEFloat16() {return this.ptr.get(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16);}
	public void shaderRoundingModeRTEFloat16(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16, value);}
	public java.lang.foreign.MemorySegment shaderRoundingModeRTEFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTEFloat16, LAYOUT$shaderRoundingModeRTEFloat16);}

	public int shaderRoundingModeRTEFloat32() {return this.ptr.get(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32);}
	public void shaderRoundingModeRTEFloat32(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32, value);}
	public java.lang.foreign.MemorySegment shaderRoundingModeRTEFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTEFloat32, LAYOUT$shaderRoundingModeRTEFloat32);}

	public int shaderRoundingModeRTEFloat64() {return this.ptr.get(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64);}
	public void shaderRoundingModeRTEFloat64(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64, value);}
	public java.lang.foreign.MemorySegment shaderRoundingModeRTEFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTEFloat64, LAYOUT$shaderRoundingModeRTEFloat64);}

	public int shaderRoundingModeRTZFloat16() {return this.ptr.get(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16);}
	public void shaderRoundingModeRTZFloat16(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16, value);}
	public java.lang.foreign.MemorySegment shaderRoundingModeRTZFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTZFloat16, LAYOUT$shaderRoundingModeRTZFloat16);}

	public int shaderRoundingModeRTZFloat32() {return this.ptr.get(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32);}
	public void shaderRoundingModeRTZFloat32(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32, value);}
	public java.lang.foreign.MemorySegment shaderRoundingModeRTZFloat32_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTZFloat32, LAYOUT$shaderRoundingModeRTZFloat32);}

	public int shaderRoundingModeRTZFloat64() {return this.ptr.get(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64);}
	public void shaderRoundingModeRTZFloat64(int value) {this.ptr.set(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64, value);}
	public java.lang.foreign.MemorySegment shaderRoundingModeRTZFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderRoundingModeRTZFloat64, LAYOUT$shaderRoundingModeRTZFloat64);}

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

	public int supportedDepthResolveModes() {return this.ptr.get(LAYOUT$supportedDepthResolveModes, OFFSET$supportedDepthResolveModes);}
	public void supportedDepthResolveModes(int value) {this.ptr.set(LAYOUT$supportedDepthResolveModes, OFFSET$supportedDepthResolveModes, value);}
	public java.lang.foreign.MemorySegment supportedDepthResolveModes_ptr() {return this.ptr.asSlice(OFFSET$supportedDepthResolveModes, LAYOUT$supportedDepthResolveModes);}

	public int supportedStencilResolveModes() {return this.ptr.get(LAYOUT$supportedStencilResolveModes, OFFSET$supportedStencilResolveModes);}
	public void supportedStencilResolveModes(int value) {this.ptr.set(LAYOUT$supportedStencilResolveModes, OFFSET$supportedStencilResolveModes, value);}
	public java.lang.foreign.MemorySegment supportedStencilResolveModes_ptr() {return this.ptr.asSlice(OFFSET$supportedStencilResolveModes, LAYOUT$supportedStencilResolveModes);}

	public int independentResolveNone() {return this.ptr.get(LAYOUT$independentResolveNone, OFFSET$independentResolveNone);}
	public void independentResolveNone(int value) {this.ptr.set(LAYOUT$independentResolveNone, OFFSET$independentResolveNone, value);}
	public java.lang.foreign.MemorySegment independentResolveNone_ptr() {return this.ptr.asSlice(OFFSET$independentResolveNone, LAYOUT$independentResolveNone);}

	public int independentResolve() {return this.ptr.get(LAYOUT$independentResolve, OFFSET$independentResolve);}
	public void independentResolve(int value) {this.ptr.set(LAYOUT$independentResolve, OFFSET$independentResolve, value);}
	public java.lang.foreign.MemorySegment independentResolve_ptr() {return this.ptr.asSlice(OFFSET$independentResolve, LAYOUT$independentResolve);}

	public int filterMinmaxSingleComponentFormats() {return this.ptr.get(LAYOUT$filterMinmaxSingleComponentFormats, OFFSET$filterMinmaxSingleComponentFormats);}
	public void filterMinmaxSingleComponentFormats(int value) {this.ptr.set(LAYOUT$filterMinmaxSingleComponentFormats, OFFSET$filterMinmaxSingleComponentFormats, value);}
	public java.lang.foreign.MemorySegment filterMinmaxSingleComponentFormats_ptr() {return this.ptr.asSlice(OFFSET$filterMinmaxSingleComponentFormats, LAYOUT$filterMinmaxSingleComponentFormats);}

	public int filterMinmaxImageComponentMapping() {return this.ptr.get(LAYOUT$filterMinmaxImageComponentMapping, OFFSET$filterMinmaxImageComponentMapping);}
	public void filterMinmaxImageComponentMapping(int value) {this.ptr.set(LAYOUT$filterMinmaxImageComponentMapping, OFFSET$filterMinmaxImageComponentMapping, value);}
	public java.lang.foreign.MemorySegment filterMinmaxImageComponentMapping_ptr() {return this.ptr.asSlice(OFFSET$filterMinmaxImageComponentMapping, LAYOUT$filterMinmaxImageComponentMapping);}

	public long maxTimelineSemaphoreValueDifference() {return this.ptr.get(LAYOUT$maxTimelineSemaphoreValueDifference, OFFSET$maxTimelineSemaphoreValueDifference);}
	public void maxTimelineSemaphoreValueDifference(long value) {this.ptr.set(LAYOUT$maxTimelineSemaphoreValueDifference, OFFSET$maxTimelineSemaphoreValueDifference, value);}
	public java.lang.foreign.MemorySegment maxTimelineSemaphoreValueDifference_ptr() {return this.ptr.asSlice(OFFSET$maxTimelineSemaphoreValueDifference, LAYOUT$maxTimelineSemaphoreValueDifference);}

	public int framebufferIntegerColorSampleCounts() {return this.ptr.get(LAYOUT$framebufferIntegerColorSampleCounts, OFFSET$framebufferIntegerColorSampleCounts);}
	public void framebufferIntegerColorSampleCounts(int value) {this.ptr.set(LAYOUT$framebufferIntegerColorSampleCounts, OFFSET$framebufferIntegerColorSampleCounts, value);}
	public java.lang.foreign.MemorySegment framebufferIntegerColorSampleCounts_ptr() {return this.ptr.asSlice(OFFSET$framebufferIntegerColorSampleCounts, LAYOUT$framebufferIntegerColorSampleCounts);}
}

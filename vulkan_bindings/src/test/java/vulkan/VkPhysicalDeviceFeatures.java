package vulkan;

public record VkPhysicalDeviceFeatures(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$robustBufferAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$robustBufferAccess = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fullDrawIndexUint32 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$fullDrawIndexUint32 = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageCubeArray = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageCubeArray = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$independentBlend = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$independentBlend = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$geometryShader = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$geometryShader = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tessellationShader = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$tessellationShader = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sampleRateShading = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sampleRateShading = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dualSrcBlend = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dualSrcBlend = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$logicOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$logicOp = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiDrawIndirect = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$multiDrawIndirect = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$drawIndirectFirstInstance = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$drawIndirectFirstInstance = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthClamp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depthClamp = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBiasClamp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depthBiasClamp = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fillModeNonSolid = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$fillModeNonSolid = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBounds = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depthBounds = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$wideLines = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$wideLines = 60L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$largePoints = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$largePoints = 64L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$alphaToOne = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$alphaToOne = 68L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multiViewport = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$multiViewport = 72L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$samplerAnisotropy = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$samplerAnisotropy = 76L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textureCompressionETC2 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$textureCompressionETC2 = 80L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textureCompressionASTC_LDR = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$textureCompressionASTC_LDR = 84L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$textureCompressionBC = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$textureCompressionBC = 88L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$occlusionQueryPrecise = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$occlusionQueryPrecise = 92L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineStatisticsQuery = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pipelineStatisticsQuery = 96L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexPipelineStoresAndAtomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexPipelineStoresAndAtomics = 100L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fragmentStoresAndAtomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$fragmentStoresAndAtomics = 104L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderTessellationAndGeometryPointSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderTessellationAndGeometryPointSize = 108L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderImageGatherExtended = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderImageGatherExtended = 112L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageExtendedFormats = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageImageExtendedFormats = 116L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageMultisample = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageImageMultisample = 120L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageReadWithoutFormat = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageImageReadWithoutFormat = 124L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageWriteWithoutFormat = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageImageWriteWithoutFormat = 128L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderUniformBufferArrayDynamicIndexing = 132L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSampledImageArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSampledImageArrayDynamicIndexing = 136L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageBufferArrayDynamicIndexing = 140L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageImageArrayDynamicIndexing = 144L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderClipDistance = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderClipDistance = 148L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderCullDistance = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderCullDistance = 152L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderFloat64 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderFloat64 = 156L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInt64 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderInt64 = 160L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInt16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderInt16 = 164L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderResourceResidency = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderResourceResidency = 168L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderResourceMinLod = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderResourceMinLod = 172L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseBinding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseBinding = 176L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidencyBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidencyBuffer = 180L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidencyImage2D = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidencyImage2D = 184L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidencyImage3D = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidencyImage3D = 188L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidency2Samples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidency2Samples = 192L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidency4Samples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidency4Samples = 196L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidency8Samples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidency8Samples = 200L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidency16Samples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidency16Samples = 204L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseResidencyAliased = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseResidencyAliased = 208L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$variableMultisampleRate = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$variableMultisampleRate = 212L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inheritedQueries = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$inheritedQueries = 216L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$robustBufferAccess,
			LAYOUT$fullDrawIndexUint32,
			LAYOUT$imageCubeArray,
			LAYOUT$independentBlend,
			LAYOUT$geometryShader,
			LAYOUT$tessellationShader,
			LAYOUT$sampleRateShading,
			LAYOUT$dualSrcBlend,
			LAYOUT$logicOp,
			LAYOUT$multiDrawIndirect,
			LAYOUT$drawIndirectFirstInstance,
			LAYOUT$depthClamp,
			LAYOUT$depthBiasClamp,
			LAYOUT$fillModeNonSolid,
			LAYOUT$depthBounds,
			LAYOUT$wideLines,
			LAYOUT$largePoints,
			LAYOUT$alphaToOne,
			LAYOUT$multiViewport,
			LAYOUT$samplerAnisotropy,
			LAYOUT$textureCompressionETC2,
			LAYOUT$textureCompressionASTC_LDR,
			LAYOUT$textureCompressionBC,
			LAYOUT$occlusionQueryPrecise,
			LAYOUT$pipelineStatisticsQuery,
			LAYOUT$vertexPipelineStoresAndAtomics,
			LAYOUT$fragmentStoresAndAtomics,
			LAYOUT$shaderTessellationAndGeometryPointSize,
			LAYOUT$shaderImageGatherExtended,
			LAYOUT$shaderStorageImageExtendedFormats,
			LAYOUT$shaderStorageImageMultisample,
			LAYOUT$shaderStorageImageReadWithoutFormat,
			LAYOUT$shaderStorageImageWriteWithoutFormat,
			LAYOUT$shaderUniformBufferArrayDynamicIndexing,
			LAYOUT$shaderSampledImageArrayDynamicIndexing,
			LAYOUT$shaderStorageBufferArrayDynamicIndexing,
			LAYOUT$shaderStorageImageArrayDynamicIndexing,
			LAYOUT$shaderClipDistance,
			LAYOUT$shaderCullDistance,
			LAYOUT$shaderFloat64,
			LAYOUT$shaderInt64,
			LAYOUT$shaderInt16,
			LAYOUT$shaderResourceResidency,
			LAYOUT$shaderResourceMinLod,
			LAYOUT$sparseBinding,
			LAYOUT$sparseResidencyBuffer,
			LAYOUT$sparseResidencyImage2D,
			LAYOUT$sparseResidencyImage3D,
			LAYOUT$sparseResidency2Samples,
			LAYOUT$sparseResidency4Samples,
			LAYOUT$sparseResidency8Samples,
			LAYOUT$sparseResidency16Samples,
			LAYOUT$sparseResidencyAliased,
			LAYOUT$variableMultisampleRate,
			LAYOUT$inheritedQueries
	).withName("VkPhysicalDeviceFeatures");

	public VkPhysicalDeviceFeatures(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int robustBufferAccess() {return this.ptr.get(LAYOUT$robustBufferAccess, OFFSET$robustBufferAccess);}
	public void robustBufferAccess(int value) {this.ptr.set(LAYOUT$robustBufferAccess, OFFSET$robustBufferAccess, value);}
	public java.lang.foreign.MemorySegment robustBufferAccess_ptr() {return this.ptr.asSlice(OFFSET$robustBufferAccess, LAYOUT$robustBufferAccess);}

	public int fullDrawIndexUint32() {return this.ptr.get(LAYOUT$fullDrawIndexUint32, OFFSET$fullDrawIndexUint32);}
	public void fullDrawIndexUint32(int value) {this.ptr.set(LAYOUT$fullDrawIndexUint32, OFFSET$fullDrawIndexUint32, value);}
	public java.lang.foreign.MemorySegment fullDrawIndexUint32_ptr() {return this.ptr.asSlice(OFFSET$fullDrawIndexUint32, LAYOUT$fullDrawIndexUint32);}

	public int imageCubeArray() {return this.ptr.get(LAYOUT$imageCubeArray, OFFSET$imageCubeArray);}
	public void imageCubeArray(int value) {this.ptr.set(LAYOUT$imageCubeArray, OFFSET$imageCubeArray, value);}
	public java.lang.foreign.MemorySegment imageCubeArray_ptr() {return this.ptr.asSlice(OFFSET$imageCubeArray, LAYOUT$imageCubeArray);}

	public int independentBlend() {return this.ptr.get(LAYOUT$independentBlend, OFFSET$independentBlend);}
	public void independentBlend(int value) {this.ptr.set(LAYOUT$independentBlend, OFFSET$independentBlend, value);}
	public java.lang.foreign.MemorySegment independentBlend_ptr() {return this.ptr.asSlice(OFFSET$independentBlend, LAYOUT$independentBlend);}

	public int geometryShader() {return this.ptr.get(LAYOUT$geometryShader, OFFSET$geometryShader);}
	public void geometryShader(int value) {this.ptr.set(LAYOUT$geometryShader, OFFSET$geometryShader, value);}
	public java.lang.foreign.MemorySegment geometryShader_ptr() {return this.ptr.asSlice(OFFSET$geometryShader, LAYOUT$geometryShader);}

	public int tessellationShader() {return this.ptr.get(LAYOUT$tessellationShader, OFFSET$tessellationShader);}
	public void tessellationShader(int value) {this.ptr.set(LAYOUT$tessellationShader, OFFSET$tessellationShader, value);}
	public java.lang.foreign.MemorySegment tessellationShader_ptr() {return this.ptr.asSlice(OFFSET$tessellationShader, LAYOUT$tessellationShader);}

	public int sampleRateShading() {return this.ptr.get(LAYOUT$sampleRateShading, OFFSET$sampleRateShading);}
	public void sampleRateShading(int value) {this.ptr.set(LAYOUT$sampleRateShading, OFFSET$sampleRateShading, value);}
	public java.lang.foreign.MemorySegment sampleRateShading_ptr() {return this.ptr.asSlice(OFFSET$sampleRateShading, LAYOUT$sampleRateShading);}

	public int dualSrcBlend() {return this.ptr.get(LAYOUT$dualSrcBlend, OFFSET$dualSrcBlend);}
	public void dualSrcBlend(int value) {this.ptr.set(LAYOUT$dualSrcBlend, OFFSET$dualSrcBlend, value);}
	public java.lang.foreign.MemorySegment dualSrcBlend_ptr() {return this.ptr.asSlice(OFFSET$dualSrcBlend, LAYOUT$dualSrcBlend);}

	public int logicOp() {return this.ptr.get(LAYOUT$logicOp, OFFSET$logicOp);}
	public void logicOp(int value) {this.ptr.set(LAYOUT$logicOp, OFFSET$logicOp, value);}
	public java.lang.foreign.MemorySegment logicOp_ptr() {return this.ptr.asSlice(OFFSET$logicOp, LAYOUT$logicOp);}

	public int multiDrawIndirect() {return this.ptr.get(LAYOUT$multiDrawIndirect, OFFSET$multiDrawIndirect);}
	public void multiDrawIndirect(int value) {this.ptr.set(LAYOUT$multiDrawIndirect, OFFSET$multiDrawIndirect, value);}
	public java.lang.foreign.MemorySegment multiDrawIndirect_ptr() {return this.ptr.asSlice(OFFSET$multiDrawIndirect, LAYOUT$multiDrawIndirect);}

	public int drawIndirectFirstInstance() {return this.ptr.get(LAYOUT$drawIndirectFirstInstance, OFFSET$drawIndirectFirstInstance);}
	public void drawIndirectFirstInstance(int value) {this.ptr.set(LAYOUT$drawIndirectFirstInstance, OFFSET$drawIndirectFirstInstance, value);}
	public java.lang.foreign.MemorySegment drawIndirectFirstInstance_ptr() {return this.ptr.asSlice(OFFSET$drawIndirectFirstInstance, LAYOUT$drawIndirectFirstInstance);}

	public int depthClamp() {return this.ptr.get(LAYOUT$depthClamp, OFFSET$depthClamp);}
	public void depthClamp(int value) {this.ptr.set(LAYOUT$depthClamp, OFFSET$depthClamp, value);}
	public java.lang.foreign.MemorySegment depthClamp_ptr() {return this.ptr.asSlice(OFFSET$depthClamp, LAYOUT$depthClamp);}

	public int depthBiasClamp() {return this.ptr.get(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp);}
	public void depthBiasClamp(int value) {this.ptr.set(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp, value);}
	public java.lang.foreign.MemorySegment depthBiasClamp_ptr() {return this.ptr.asSlice(OFFSET$depthBiasClamp, LAYOUT$depthBiasClamp);}

	public int fillModeNonSolid() {return this.ptr.get(LAYOUT$fillModeNonSolid, OFFSET$fillModeNonSolid);}
	public void fillModeNonSolid(int value) {this.ptr.set(LAYOUT$fillModeNonSolid, OFFSET$fillModeNonSolid, value);}
	public java.lang.foreign.MemorySegment fillModeNonSolid_ptr() {return this.ptr.asSlice(OFFSET$fillModeNonSolid, LAYOUT$fillModeNonSolid);}

	public int depthBounds() {return this.ptr.get(LAYOUT$depthBounds, OFFSET$depthBounds);}
	public void depthBounds(int value) {this.ptr.set(LAYOUT$depthBounds, OFFSET$depthBounds, value);}
	public java.lang.foreign.MemorySegment depthBounds_ptr() {return this.ptr.asSlice(OFFSET$depthBounds, LAYOUT$depthBounds);}

	public int wideLines() {return this.ptr.get(LAYOUT$wideLines, OFFSET$wideLines);}
	public void wideLines(int value) {this.ptr.set(LAYOUT$wideLines, OFFSET$wideLines, value);}
	public java.lang.foreign.MemorySegment wideLines_ptr() {return this.ptr.asSlice(OFFSET$wideLines, LAYOUT$wideLines);}

	public int largePoints() {return this.ptr.get(LAYOUT$largePoints, OFFSET$largePoints);}
	public void largePoints(int value) {this.ptr.set(LAYOUT$largePoints, OFFSET$largePoints, value);}
	public java.lang.foreign.MemorySegment largePoints_ptr() {return this.ptr.asSlice(OFFSET$largePoints, LAYOUT$largePoints);}

	public int alphaToOne() {return this.ptr.get(LAYOUT$alphaToOne, OFFSET$alphaToOne);}
	public void alphaToOne(int value) {this.ptr.set(LAYOUT$alphaToOne, OFFSET$alphaToOne, value);}
	public java.lang.foreign.MemorySegment alphaToOne_ptr() {return this.ptr.asSlice(OFFSET$alphaToOne, LAYOUT$alphaToOne);}

	public int multiViewport() {return this.ptr.get(LAYOUT$multiViewport, OFFSET$multiViewport);}
	public void multiViewport(int value) {this.ptr.set(LAYOUT$multiViewport, OFFSET$multiViewport, value);}
	public java.lang.foreign.MemorySegment multiViewport_ptr() {return this.ptr.asSlice(OFFSET$multiViewport, LAYOUT$multiViewport);}

	public int samplerAnisotropy() {return this.ptr.get(LAYOUT$samplerAnisotropy, OFFSET$samplerAnisotropy);}
	public void samplerAnisotropy(int value) {this.ptr.set(LAYOUT$samplerAnisotropy, OFFSET$samplerAnisotropy, value);}
	public java.lang.foreign.MemorySegment samplerAnisotropy_ptr() {return this.ptr.asSlice(OFFSET$samplerAnisotropy, LAYOUT$samplerAnisotropy);}

	public int textureCompressionETC2() {return this.ptr.get(LAYOUT$textureCompressionETC2, OFFSET$textureCompressionETC2);}
	public void textureCompressionETC2(int value) {this.ptr.set(LAYOUT$textureCompressionETC2, OFFSET$textureCompressionETC2, value);}
	public java.lang.foreign.MemorySegment textureCompressionETC2_ptr() {return this.ptr.asSlice(OFFSET$textureCompressionETC2, LAYOUT$textureCompressionETC2);}

	public int textureCompressionASTC_LDR() {return this.ptr.get(LAYOUT$textureCompressionASTC_LDR, OFFSET$textureCompressionASTC_LDR);}
	public void textureCompressionASTC_LDR(int value) {this.ptr.set(LAYOUT$textureCompressionASTC_LDR, OFFSET$textureCompressionASTC_LDR, value);}
	public java.lang.foreign.MemorySegment textureCompressionASTC_LDR_ptr() {return this.ptr.asSlice(OFFSET$textureCompressionASTC_LDR, LAYOUT$textureCompressionASTC_LDR);}

	public int textureCompressionBC() {return this.ptr.get(LAYOUT$textureCompressionBC, OFFSET$textureCompressionBC);}
	public void textureCompressionBC(int value) {this.ptr.set(LAYOUT$textureCompressionBC, OFFSET$textureCompressionBC, value);}
	public java.lang.foreign.MemorySegment textureCompressionBC_ptr() {return this.ptr.asSlice(OFFSET$textureCompressionBC, LAYOUT$textureCompressionBC);}

	public int occlusionQueryPrecise() {return this.ptr.get(LAYOUT$occlusionQueryPrecise, OFFSET$occlusionQueryPrecise);}
	public void occlusionQueryPrecise(int value) {this.ptr.set(LAYOUT$occlusionQueryPrecise, OFFSET$occlusionQueryPrecise, value);}
	public java.lang.foreign.MemorySegment occlusionQueryPrecise_ptr() {return this.ptr.asSlice(OFFSET$occlusionQueryPrecise, LAYOUT$occlusionQueryPrecise);}

	public int pipelineStatisticsQuery() {return this.ptr.get(LAYOUT$pipelineStatisticsQuery, OFFSET$pipelineStatisticsQuery);}
	public void pipelineStatisticsQuery(int value) {this.ptr.set(LAYOUT$pipelineStatisticsQuery, OFFSET$pipelineStatisticsQuery, value);}
	public java.lang.foreign.MemorySegment pipelineStatisticsQuery_ptr() {return this.ptr.asSlice(OFFSET$pipelineStatisticsQuery, LAYOUT$pipelineStatisticsQuery);}

	public int vertexPipelineStoresAndAtomics() {return this.ptr.get(LAYOUT$vertexPipelineStoresAndAtomics, OFFSET$vertexPipelineStoresAndAtomics);}
	public void vertexPipelineStoresAndAtomics(int value) {this.ptr.set(LAYOUT$vertexPipelineStoresAndAtomics, OFFSET$vertexPipelineStoresAndAtomics, value);}
	public java.lang.foreign.MemorySegment vertexPipelineStoresAndAtomics_ptr() {return this.ptr.asSlice(OFFSET$vertexPipelineStoresAndAtomics, LAYOUT$vertexPipelineStoresAndAtomics);}

	public int fragmentStoresAndAtomics() {return this.ptr.get(LAYOUT$fragmentStoresAndAtomics, OFFSET$fragmentStoresAndAtomics);}
	public void fragmentStoresAndAtomics(int value) {this.ptr.set(LAYOUT$fragmentStoresAndAtomics, OFFSET$fragmentStoresAndAtomics, value);}
	public java.lang.foreign.MemorySegment fragmentStoresAndAtomics_ptr() {return this.ptr.asSlice(OFFSET$fragmentStoresAndAtomics, LAYOUT$fragmentStoresAndAtomics);}

	public int shaderTessellationAndGeometryPointSize() {return this.ptr.get(LAYOUT$shaderTessellationAndGeometryPointSize, OFFSET$shaderTessellationAndGeometryPointSize);}
	public void shaderTessellationAndGeometryPointSize(int value) {this.ptr.set(LAYOUT$shaderTessellationAndGeometryPointSize, OFFSET$shaderTessellationAndGeometryPointSize, value);}
	public java.lang.foreign.MemorySegment shaderTessellationAndGeometryPointSize_ptr() {return this.ptr.asSlice(OFFSET$shaderTessellationAndGeometryPointSize, LAYOUT$shaderTessellationAndGeometryPointSize);}

	public int shaderImageGatherExtended() {return this.ptr.get(LAYOUT$shaderImageGatherExtended, OFFSET$shaderImageGatherExtended);}
	public void shaderImageGatherExtended(int value) {this.ptr.set(LAYOUT$shaderImageGatherExtended, OFFSET$shaderImageGatherExtended, value);}
	public java.lang.foreign.MemorySegment shaderImageGatherExtended_ptr() {return this.ptr.asSlice(OFFSET$shaderImageGatherExtended, LAYOUT$shaderImageGatherExtended);}

	public int shaderStorageImageExtendedFormats() {return this.ptr.get(LAYOUT$shaderStorageImageExtendedFormats, OFFSET$shaderStorageImageExtendedFormats);}
	public void shaderStorageImageExtendedFormats(int value) {this.ptr.set(LAYOUT$shaderStorageImageExtendedFormats, OFFSET$shaderStorageImageExtendedFormats, value);}
	public java.lang.foreign.MemorySegment shaderStorageImageExtendedFormats_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageImageExtendedFormats, LAYOUT$shaderStorageImageExtendedFormats);}

	public int shaderStorageImageMultisample() {return this.ptr.get(LAYOUT$shaderStorageImageMultisample, OFFSET$shaderStorageImageMultisample);}
	public void shaderStorageImageMultisample(int value) {this.ptr.set(LAYOUT$shaderStorageImageMultisample, OFFSET$shaderStorageImageMultisample, value);}
	public java.lang.foreign.MemorySegment shaderStorageImageMultisample_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageImageMultisample, LAYOUT$shaderStorageImageMultisample);}

	public int shaderStorageImageReadWithoutFormat() {return this.ptr.get(LAYOUT$shaderStorageImageReadWithoutFormat, OFFSET$shaderStorageImageReadWithoutFormat);}
	public void shaderStorageImageReadWithoutFormat(int value) {this.ptr.set(LAYOUT$shaderStorageImageReadWithoutFormat, OFFSET$shaderStorageImageReadWithoutFormat, value);}
	public java.lang.foreign.MemorySegment shaderStorageImageReadWithoutFormat_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageImageReadWithoutFormat, LAYOUT$shaderStorageImageReadWithoutFormat);}

	public int shaderStorageImageWriteWithoutFormat() {return this.ptr.get(LAYOUT$shaderStorageImageWriteWithoutFormat, OFFSET$shaderStorageImageWriteWithoutFormat);}
	public void shaderStorageImageWriteWithoutFormat(int value) {this.ptr.set(LAYOUT$shaderStorageImageWriteWithoutFormat, OFFSET$shaderStorageImageWriteWithoutFormat, value);}
	public java.lang.foreign.MemorySegment shaderStorageImageWriteWithoutFormat_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageImageWriteWithoutFormat, LAYOUT$shaderStorageImageWriteWithoutFormat);}

	public int shaderUniformBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT$shaderUniformBufferArrayDynamicIndexing, OFFSET$shaderUniformBufferArrayDynamicIndexing);}
	public void shaderUniformBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT$shaderUniformBufferArrayDynamicIndexing, OFFSET$shaderUniformBufferArrayDynamicIndexing, value);}
	public java.lang.foreign.MemorySegment shaderUniformBufferArrayDynamicIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderUniformBufferArrayDynamicIndexing, LAYOUT$shaderUniformBufferArrayDynamicIndexing);}

	public int shaderSampledImageArrayDynamicIndexing() {return this.ptr.get(LAYOUT$shaderSampledImageArrayDynamicIndexing, OFFSET$shaderSampledImageArrayDynamicIndexing);}
	public void shaderSampledImageArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT$shaderSampledImageArrayDynamicIndexing, OFFSET$shaderSampledImageArrayDynamicIndexing, value);}
	public java.lang.foreign.MemorySegment shaderSampledImageArrayDynamicIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderSampledImageArrayDynamicIndexing, LAYOUT$shaderSampledImageArrayDynamicIndexing);}

	public int shaderStorageBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT$shaderStorageBufferArrayDynamicIndexing, OFFSET$shaderStorageBufferArrayDynamicIndexing);}
	public void shaderStorageBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT$shaderStorageBufferArrayDynamicIndexing, OFFSET$shaderStorageBufferArrayDynamicIndexing, value);}
	public java.lang.foreign.MemorySegment shaderStorageBufferArrayDynamicIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageBufferArrayDynamicIndexing, LAYOUT$shaderStorageBufferArrayDynamicIndexing);}

	public int shaderStorageImageArrayDynamicIndexing() {return this.ptr.get(LAYOUT$shaderStorageImageArrayDynamicIndexing, OFFSET$shaderStorageImageArrayDynamicIndexing);}
	public void shaderStorageImageArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT$shaderStorageImageArrayDynamicIndexing, OFFSET$shaderStorageImageArrayDynamicIndexing, value);}
	public java.lang.foreign.MemorySegment shaderStorageImageArrayDynamicIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageImageArrayDynamicIndexing, LAYOUT$shaderStorageImageArrayDynamicIndexing);}

	public int shaderClipDistance() {return this.ptr.get(LAYOUT$shaderClipDistance, OFFSET$shaderClipDistance);}
	public void shaderClipDistance(int value) {this.ptr.set(LAYOUT$shaderClipDistance, OFFSET$shaderClipDistance, value);}
	public java.lang.foreign.MemorySegment shaderClipDistance_ptr() {return this.ptr.asSlice(OFFSET$shaderClipDistance, LAYOUT$shaderClipDistance);}

	public int shaderCullDistance() {return this.ptr.get(LAYOUT$shaderCullDistance, OFFSET$shaderCullDistance);}
	public void shaderCullDistance(int value) {this.ptr.set(LAYOUT$shaderCullDistance, OFFSET$shaderCullDistance, value);}
	public java.lang.foreign.MemorySegment shaderCullDistance_ptr() {return this.ptr.asSlice(OFFSET$shaderCullDistance, LAYOUT$shaderCullDistance);}

	public int shaderFloat64() {return this.ptr.get(LAYOUT$shaderFloat64, OFFSET$shaderFloat64);}
	public void shaderFloat64(int value) {this.ptr.set(LAYOUT$shaderFloat64, OFFSET$shaderFloat64, value);}
	public java.lang.foreign.MemorySegment shaderFloat64_ptr() {return this.ptr.asSlice(OFFSET$shaderFloat64, LAYOUT$shaderFloat64);}

	public int shaderInt64() {return this.ptr.get(LAYOUT$shaderInt64, OFFSET$shaderInt64);}
	public void shaderInt64(int value) {this.ptr.set(LAYOUT$shaderInt64, OFFSET$shaderInt64, value);}
	public java.lang.foreign.MemorySegment shaderInt64_ptr() {return this.ptr.asSlice(OFFSET$shaderInt64, LAYOUT$shaderInt64);}

	public int shaderInt16() {return this.ptr.get(LAYOUT$shaderInt16, OFFSET$shaderInt16);}
	public void shaderInt16(int value) {this.ptr.set(LAYOUT$shaderInt16, OFFSET$shaderInt16, value);}
	public java.lang.foreign.MemorySegment shaderInt16_ptr() {return this.ptr.asSlice(OFFSET$shaderInt16, LAYOUT$shaderInt16);}

	public int shaderResourceResidency() {return this.ptr.get(LAYOUT$shaderResourceResidency, OFFSET$shaderResourceResidency);}
	public void shaderResourceResidency(int value) {this.ptr.set(LAYOUT$shaderResourceResidency, OFFSET$shaderResourceResidency, value);}
	public java.lang.foreign.MemorySegment shaderResourceResidency_ptr() {return this.ptr.asSlice(OFFSET$shaderResourceResidency, LAYOUT$shaderResourceResidency);}

	public int shaderResourceMinLod() {return this.ptr.get(LAYOUT$shaderResourceMinLod, OFFSET$shaderResourceMinLod);}
	public void shaderResourceMinLod(int value) {this.ptr.set(LAYOUT$shaderResourceMinLod, OFFSET$shaderResourceMinLod, value);}
	public java.lang.foreign.MemorySegment shaderResourceMinLod_ptr() {return this.ptr.asSlice(OFFSET$shaderResourceMinLod, LAYOUT$shaderResourceMinLod);}

	public int sparseBinding() {return this.ptr.get(LAYOUT$sparseBinding, OFFSET$sparseBinding);}
	public void sparseBinding(int value) {this.ptr.set(LAYOUT$sparseBinding, OFFSET$sparseBinding, value);}
	public java.lang.foreign.MemorySegment sparseBinding_ptr() {return this.ptr.asSlice(OFFSET$sparseBinding, LAYOUT$sparseBinding);}

	public int sparseResidencyBuffer() {return this.ptr.get(LAYOUT$sparseResidencyBuffer, OFFSET$sparseResidencyBuffer);}
	public void sparseResidencyBuffer(int value) {this.ptr.set(LAYOUT$sparseResidencyBuffer, OFFSET$sparseResidencyBuffer, value);}
	public java.lang.foreign.MemorySegment sparseResidencyBuffer_ptr() {return this.ptr.asSlice(OFFSET$sparseResidencyBuffer, LAYOUT$sparseResidencyBuffer);}

	public int sparseResidencyImage2D() {return this.ptr.get(LAYOUT$sparseResidencyImage2D, OFFSET$sparseResidencyImage2D);}
	public void sparseResidencyImage2D(int value) {this.ptr.set(LAYOUT$sparseResidencyImage2D, OFFSET$sparseResidencyImage2D, value);}
	public java.lang.foreign.MemorySegment sparseResidencyImage2D_ptr() {return this.ptr.asSlice(OFFSET$sparseResidencyImage2D, LAYOUT$sparseResidencyImage2D);}

	public int sparseResidencyImage3D() {return this.ptr.get(LAYOUT$sparseResidencyImage3D, OFFSET$sparseResidencyImage3D);}
	public void sparseResidencyImage3D(int value) {this.ptr.set(LAYOUT$sparseResidencyImage3D, OFFSET$sparseResidencyImage3D, value);}
	public java.lang.foreign.MemorySegment sparseResidencyImage3D_ptr() {return this.ptr.asSlice(OFFSET$sparseResidencyImage3D, LAYOUT$sparseResidencyImage3D);}

	public int sparseResidency2Samples() {return this.ptr.get(LAYOUT$sparseResidency2Samples, OFFSET$sparseResidency2Samples);}
	public void sparseResidency2Samples(int value) {this.ptr.set(LAYOUT$sparseResidency2Samples, OFFSET$sparseResidency2Samples, value);}
	public java.lang.foreign.MemorySegment sparseResidency2Samples_ptr() {return this.ptr.asSlice(OFFSET$sparseResidency2Samples, LAYOUT$sparseResidency2Samples);}

	public int sparseResidency4Samples() {return this.ptr.get(LAYOUT$sparseResidency4Samples, OFFSET$sparseResidency4Samples);}
	public void sparseResidency4Samples(int value) {this.ptr.set(LAYOUT$sparseResidency4Samples, OFFSET$sparseResidency4Samples, value);}
	public java.lang.foreign.MemorySegment sparseResidency4Samples_ptr() {return this.ptr.asSlice(OFFSET$sparseResidency4Samples, LAYOUT$sparseResidency4Samples);}

	public int sparseResidency8Samples() {return this.ptr.get(LAYOUT$sparseResidency8Samples, OFFSET$sparseResidency8Samples);}
	public void sparseResidency8Samples(int value) {this.ptr.set(LAYOUT$sparseResidency8Samples, OFFSET$sparseResidency8Samples, value);}
	public java.lang.foreign.MemorySegment sparseResidency8Samples_ptr() {return this.ptr.asSlice(OFFSET$sparseResidency8Samples, LAYOUT$sparseResidency8Samples);}

	public int sparseResidency16Samples() {return this.ptr.get(LAYOUT$sparseResidency16Samples, OFFSET$sparseResidency16Samples);}
	public void sparseResidency16Samples(int value) {this.ptr.set(LAYOUT$sparseResidency16Samples, OFFSET$sparseResidency16Samples, value);}
	public java.lang.foreign.MemorySegment sparseResidency16Samples_ptr() {return this.ptr.asSlice(OFFSET$sparseResidency16Samples, LAYOUT$sparseResidency16Samples);}

	public int sparseResidencyAliased() {return this.ptr.get(LAYOUT$sparseResidencyAliased, OFFSET$sparseResidencyAliased);}
	public void sparseResidencyAliased(int value) {this.ptr.set(LAYOUT$sparseResidencyAliased, OFFSET$sparseResidencyAliased, value);}
	public java.lang.foreign.MemorySegment sparseResidencyAliased_ptr() {return this.ptr.asSlice(OFFSET$sparseResidencyAliased, LAYOUT$sparseResidencyAliased);}

	public int variableMultisampleRate() {return this.ptr.get(LAYOUT$variableMultisampleRate, OFFSET$variableMultisampleRate);}
	public void variableMultisampleRate(int value) {this.ptr.set(LAYOUT$variableMultisampleRate, OFFSET$variableMultisampleRate, value);}
	public java.lang.foreign.MemorySegment variableMultisampleRate_ptr() {return this.ptr.asSlice(OFFSET$variableMultisampleRate, LAYOUT$variableMultisampleRate);}

	public int inheritedQueries() {return this.ptr.get(LAYOUT$inheritedQueries, OFFSET$inheritedQueries);}
	public void inheritedQueries(int value) {this.ptr.set(LAYOUT$inheritedQueries, OFFSET$inheritedQueries, value);}
	public java.lang.foreign.MemorySegment inheritedQueries_ptr() {return this.ptr.asSlice(OFFSET$inheritedQueries, LAYOUT$inheritedQueries);}
}

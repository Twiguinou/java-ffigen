package vulkan;

public record VkPhysicalDeviceConservativeRasterizationPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$primitiveOverestimationSize = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$primitiveOverestimationSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxExtraPrimitiveOverestimationSize = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$maxExtraPrimitiveOverestimationSize = 20L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$extraPrimitiveOverestimationSizeGranularity = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$extraPrimitiveOverestimationSizeGranularity = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveUnderestimation = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$primitiveUnderestimation = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$conservativePointAndLineRasterization = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$conservativePointAndLineRasterization = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$degenerateTrianglesRasterized = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$degenerateTrianglesRasterized = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$degenerateLinesRasterized = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$degenerateLinesRasterized = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$fullyCoveredFragmentShaderInputVariable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$fullyCoveredFragmentShaderInputVariable = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$conservativeRasterizationPostDepthCoverage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$conservativeRasterizationPostDepthCoverage = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$primitiveOverestimationSize,
			LAYOUT$maxExtraPrimitiveOverestimationSize,
			LAYOUT$extraPrimitiveOverestimationSizeGranularity,
			LAYOUT$primitiveUnderestimation,
			LAYOUT$conservativePointAndLineRasterization,
			LAYOUT$degenerateTrianglesRasterized,
			LAYOUT$degenerateLinesRasterized,
			LAYOUT$fullyCoveredFragmentShaderInputVariable,
			LAYOUT$conservativeRasterizationPostDepthCoverage,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceConservativeRasterizationPropertiesEXT");

	public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public float primitiveOverestimationSize() {return this.ptr.get(LAYOUT$primitiveOverestimationSize, OFFSET$primitiveOverestimationSize);}
	public void primitiveOverestimationSize(float value) {this.ptr.set(LAYOUT$primitiveOverestimationSize, OFFSET$primitiveOverestimationSize, value);}
	public java.lang.foreign.MemorySegment primitiveOverestimationSize_ptr() {return this.ptr.asSlice(OFFSET$primitiveOverestimationSize, LAYOUT$primitiveOverestimationSize);}

	public float maxExtraPrimitiveOverestimationSize() {return this.ptr.get(LAYOUT$maxExtraPrimitiveOverestimationSize, OFFSET$maxExtraPrimitiveOverestimationSize);}
	public void maxExtraPrimitiveOverestimationSize(float value) {this.ptr.set(LAYOUT$maxExtraPrimitiveOverestimationSize, OFFSET$maxExtraPrimitiveOverestimationSize, value);}
	public java.lang.foreign.MemorySegment maxExtraPrimitiveOverestimationSize_ptr() {return this.ptr.asSlice(OFFSET$maxExtraPrimitiveOverestimationSize, LAYOUT$maxExtraPrimitiveOverestimationSize);}

	public float extraPrimitiveOverestimationSizeGranularity() {return this.ptr.get(LAYOUT$extraPrimitiveOverestimationSizeGranularity, OFFSET$extraPrimitiveOverestimationSizeGranularity);}
	public void extraPrimitiveOverestimationSizeGranularity(float value) {this.ptr.set(LAYOUT$extraPrimitiveOverestimationSizeGranularity, OFFSET$extraPrimitiveOverestimationSizeGranularity, value);}
	public java.lang.foreign.MemorySegment extraPrimitiveOverestimationSizeGranularity_ptr() {return this.ptr.asSlice(OFFSET$extraPrimitiveOverestimationSizeGranularity, LAYOUT$extraPrimitiveOverestimationSizeGranularity);}

	public int primitiveUnderestimation() {return this.ptr.get(LAYOUT$primitiveUnderestimation, OFFSET$primitiveUnderestimation);}
	public void primitiveUnderestimation(int value) {this.ptr.set(LAYOUT$primitiveUnderestimation, OFFSET$primitiveUnderestimation, value);}
	public java.lang.foreign.MemorySegment primitiveUnderestimation_ptr() {return this.ptr.asSlice(OFFSET$primitiveUnderestimation, LAYOUT$primitiveUnderestimation);}

	public int conservativePointAndLineRasterization() {return this.ptr.get(LAYOUT$conservativePointAndLineRasterization, OFFSET$conservativePointAndLineRasterization);}
	public void conservativePointAndLineRasterization(int value) {this.ptr.set(LAYOUT$conservativePointAndLineRasterization, OFFSET$conservativePointAndLineRasterization, value);}
	public java.lang.foreign.MemorySegment conservativePointAndLineRasterization_ptr() {return this.ptr.asSlice(OFFSET$conservativePointAndLineRasterization, LAYOUT$conservativePointAndLineRasterization);}

	public int degenerateTrianglesRasterized() {return this.ptr.get(LAYOUT$degenerateTrianglesRasterized, OFFSET$degenerateTrianglesRasterized);}
	public void degenerateTrianglesRasterized(int value) {this.ptr.set(LAYOUT$degenerateTrianglesRasterized, OFFSET$degenerateTrianglesRasterized, value);}
	public java.lang.foreign.MemorySegment degenerateTrianglesRasterized_ptr() {return this.ptr.asSlice(OFFSET$degenerateTrianglesRasterized, LAYOUT$degenerateTrianglesRasterized);}

	public int degenerateLinesRasterized() {return this.ptr.get(LAYOUT$degenerateLinesRasterized, OFFSET$degenerateLinesRasterized);}
	public void degenerateLinesRasterized(int value) {this.ptr.set(LAYOUT$degenerateLinesRasterized, OFFSET$degenerateLinesRasterized, value);}
	public java.lang.foreign.MemorySegment degenerateLinesRasterized_ptr() {return this.ptr.asSlice(OFFSET$degenerateLinesRasterized, LAYOUT$degenerateLinesRasterized);}

	public int fullyCoveredFragmentShaderInputVariable() {return this.ptr.get(LAYOUT$fullyCoveredFragmentShaderInputVariable, OFFSET$fullyCoveredFragmentShaderInputVariable);}
	public void fullyCoveredFragmentShaderInputVariable(int value) {this.ptr.set(LAYOUT$fullyCoveredFragmentShaderInputVariable, OFFSET$fullyCoveredFragmentShaderInputVariable, value);}
	public java.lang.foreign.MemorySegment fullyCoveredFragmentShaderInputVariable_ptr() {return this.ptr.asSlice(OFFSET$fullyCoveredFragmentShaderInputVariable, LAYOUT$fullyCoveredFragmentShaderInputVariable);}

	public int conservativeRasterizationPostDepthCoverage() {return this.ptr.get(LAYOUT$conservativeRasterizationPostDepthCoverage, OFFSET$conservativeRasterizationPostDepthCoverage);}
	public void conservativeRasterizationPostDepthCoverage(int value) {this.ptr.set(LAYOUT$conservativeRasterizationPostDepthCoverage, OFFSET$conservativeRasterizationPostDepthCoverage, value);}
	public java.lang.foreign.MemorySegment conservativeRasterizationPostDepthCoverage_ptr() {return this.ptr.asSlice(OFFSET$conservativeRasterizationPostDepthCoverage, LAYOUT$conservativeRasterizationPostDepthCoverage);}
}

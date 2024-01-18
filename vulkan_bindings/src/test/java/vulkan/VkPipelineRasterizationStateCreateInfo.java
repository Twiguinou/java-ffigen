package vulkan;

public record VkPipelineRasterizationStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthClampEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depthClampEnable = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rasterizerDiscardEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rasterizerDiscardEnable = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$polygonMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$polygonMode = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cullMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$cullMode = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frontFace = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$frontFace = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBiasEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depthBiasEnable = 40L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$depthBiasConstantFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$depthBiasConstantFactor = 44L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$depthBiasClamp = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$depthBiasClamp = 48L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$depthBiasSlopeFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$depthBiasSlopeFactor = 52L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$lineWidth = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$lineWidth = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$depthClampEnable,
			LAYOUT$rasterizerDiscardEnable,
			LAYOUT$polygonMode,
			LAYOUT$cullMode,
			LAYOUT$frontFace,
			LAYOUT$depthBiasEnable,
			LAYOUT$depthBiasConstantFactor,
			LAYOUT$depthBiasClamp,
			LAYOUT$depthBiasSlopeFactor,
			LAYOUT$lineWidth,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPipelineRasterizationStateCreateInfo");

	public VkPipelineRasterizationStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public int depthClampEnable() {return this.ptr.get(LAYOUT$depthClampEnable, OFFSET$depthClampEnable);}
	public void depthClampEnable(int value) {this.ptr.set(LAYOUT$depthClampEnable, OFFSET$depthClampEnable, value);}
	public java.lang.foreign.MemorySegment depthClampEnable_ptr() {return this.ptr.asSlice(OFFSET$depthClampEnable, LAYOUT$depthClampEnable);}

	public int rasterizerDiscardEnable() {return this.ptr.get(LAYOUT$rasterizerDiscardEnable, OFFSET$rasterizerDiscardEnable);}
	public void rasterizerDiscardEnable(int value) {this.ptr.set(LAYOUT$rasterizerDiscardEnable, OFFSET$rasterizerDiscardEnable, value);}
	public java.lang.foreign.MemorySegment rasterizerDiscardEnable_ptr() {return this.ptr.asSlice(OFFSET$rasterizerDiscardEnable, LAYOUT$rasterizerDiscardEnable);}

	public int polygonMode() {return this.ptr.get(LAYOUT$polygonMode, OFFSET$polygonMode);}
	public void polygonMode(int value) {this.ptr.set(LAYOUT$polygonMode, OFFSET$polygonMode, value);}
	public java.lang.foreign.MemorySegment polygonMode_ptr() {return this.ptr.asSlice(OFFSET$polygonMode, LAYOUT$polygonMode);}

	public int cullMode() {return this.ptr.get(LAYOUT$cullMode, OFFSET$cullMode);}
	public void cullMode(int value) {this.ptr.set(LAYOUT$cullMode, OFFSET$cullMode, value);}
	public java.lang.foreign.MemorySegment cullMode_ptr() {return this.ptr.asSlice(OFFSET$cullMode, LAYOUT$cullMode);}

	public int frontFace() {return this.ptr.get(LAYOUT$frontFace, OFFSET$frontFace);}
	public void frontFace(int value) {this.ptr.set(LAYOUT$frontFace, OFFSET$frontFace, value);}
	public java.lang.foreign.MemorySegment frontFace_ptr() {return this.ptr.asSlice(OFFSET$frontFace, LAYOUT$frontFace);}

	public int depthBiasEnable() {return this.ptr.get(LAYOUT$depthBiasEnable, OFFSET$depthBiasEnable);}
	public void depthBiasEnable(int value) {this.ptr.set(LAYOUT$depthBiasEnable, OFFSET$depthBiasEnable, value);}
	public java.lang.foreign.MemorySegment depthBiasEnable_ptr() {return this.ptr.asSlice(OFFSET$depthBiasEnable, LAYOUT$depthBiasEnable);}

	public float depthBiasConstantFactor() {return this.ptr.get(LAYOUT$depthBiasConstantFactor, OFFSET$depthBiasConstantFactor);}
	public void depthBiasConstantFactor(float value) {this.ptr.set(LAYOUT$depthBiasConstantFactor, OFFSET$depthBiasConstantFactor, value);}
	public java.lang.foreign.MemorySegment depthBiasConstantFactor_ptr() {return this.ptr.asSlice(OFFSET$depthBiasConstantFactor, LAYOUT$depthBiasConstantFactor);}

	public float depthBiasClamp() {return this.ptr.get(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp);}
	public void depthBiasClamp(float value) {this.ptr.set(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp, value);}
	public java.lang.foreign.MemorySegment depthBiasClamp_ptr() {return this.ptr.asSlice(OFFSET$depthBiasClamp, LAYOUT$depthBiasClamp);}

	public float depthBiasSlopeFactor() {return this.ptr.get(LAYOUT$depthBiasSlopeFactor, OFFSET$depthBiasSlopeFactor);}
	public void depthBiasSlopeFactor(float value) {this.ptr.set(LAYOUT$depthBiasSlopeFactor, OFFSET$depthBiasSlopeFactor, value);}
	public java.lang.foreign.MemorySegment depthBiasSlopeFactor_ptr() {return this.ptr.asSlice(OFFSET$depthBiasSlopeFactor, LAYOUT$depthBiasSlopeFactor);}

	public float lineWidth() {return this.ptr.get(LAYOUT$lineWidth, OFFSET$lineWidth);}
	public void lineWidth(float value) {this.ptr.set(LAYOUT$lineWidth, OFFSET$lineWidth, value);}
	public java.lang.foreign.MemorySegment lineWidth_ptr() {return this.ptr.asSlice(OFFSET$lineWidth, LAYOUT$lineWidth);}
}

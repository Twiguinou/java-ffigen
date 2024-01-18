package vulkan;

public record VkDepthBiasInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$depthBiasConstantFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$depthBiasConstantFactor = 16L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$depthBiasClamp = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$depthBiasClamp = 20L;
	public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$depthBiasSlopeFactor = java.lang.foreign.ValueLayout.JAVA_FLOAT;
	public static final long OFFSET$depthBiasSlopeFactor = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$depthBiasConstantFactor,
			LAYOUT$depthBiasClamp,
			LAYOUT$depthBiasSlopeFactor,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDepthBiasInfoEXT");

	public VkDepthBiasInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public float depthBiasConstantFactor() {return this.ptr.get(LAYOUT$depthBiasConstantFactor, OFFSET$depthBiasConstantFactor);}
	public void depthBiasConstantFactor(float value) {this.ptr.set(LAYOUT$depthBiasConstantFactor, OFFSET$depthBiasConstantFactor, value);}
	public java.lang.foreign.MemorySegment depthBiasConstantFactor_ptr() {return this.ptr.asSlice(OFFSET$depthBiasConstantFactor, LAYOUT$depthBiasConstantFactor);}

	public float depthBiasClamp() {return this.ptr.get(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp);}
	public void depthBiasClamp(float value) {this.ptr.set(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp, value);}
	public java.lang.foreign.MemorySegment depthBiasClamp_ptr() {return this.ptr.asSlice(OFFSET$depthBiasClamp, LAYOUT$depthBiasClamp);}

	public float depthBiasSlopeFactor() {return this.ptr.get(LAYOUT$depthBiasSlopeFactor, OFFSET$depthBiasSlopeFactor);}
	public void depthBiasSlopeFactor(float value) {this.ptr.set(LAYOUT$depthBiasSlopeFactor, OFFSET$depthBiasSlopeFactor, value);}
	public java.lang.foreign.MemorySegment depthBiasSlopeFactor_ptr() {return this.ptr.asSlice(OFFSET$depthBiasSlopeFactor, LAYOUT$depthBiasSlopeFactor);}
}

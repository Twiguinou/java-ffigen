package vulkan;

public record VkMultisampledRenderToSingleSampledInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$multisampledRenderToSingleSampledEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$multisampledRenderToSingleSampledEnable = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rasterizationSamples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rasterizationSamples = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$multisampledRenderToSingleSampledEnable,
			LAYOUT$rasterizationSamples
	).withName("VkMultisampledRenderToSingleSampledInfoEXT");

	public VkMultisampledRenderToSingleSampledInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int multisampledRenderToSingleSampledEnable() {return this.ptr.get(LAYOUT$multisampledRenderToSingleSampledEnable, OFFSET$multisampledRenderToSingleSampledEnable);}
	public void multisampledRenderToSingleSampledEnable(int value) {this.ptr.set(LAYOUT$multisampledRenderToSingleSampledEnable, OFFSET$multisampledRenderToSingleSampledEnable, value);}
	public java.lang.foreign.MemorySegment multisampledRenderToSingleSampledEnable_ptr() {return this.ptr.asSlice(OFFSET$multisampledRenderToSingleSampledEnable, LAYOUT$multisampledRenderToSingleSampledEnable);}

	public int rasterizationSamples() {return this.ptr.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);}
	public void rasterizationSamples(int value) {this.ptr.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);}
	public java.lang.foreign.MemorySegment rasterizationSamples_ptr() {return this.ptr.asSlice(OFFSET$rasterizationSamples, LAYOUT$rasterizationSamples);}
}

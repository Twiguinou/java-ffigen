package vulkan;

public record VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingMotionBlur = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rayTracingMotionBlur = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$rayTracingMotionBlur,
			LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect
	).withName("VkPhysicalDeviceRayTracingMotionBlurFeaturesNV");

	public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int rayTracingMotionBlur() {return this.ptr.get(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur);}
	public void rayTracingMotionBlur(int value) {this.ptr.set(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur, value);}
	public java.lang.foreign.MemorySegment rayTracingMotionBlur_ptr() {return this.ptr.asSlice(OFFSET$rayTracingMotionBlur, LAYOUT$rayTracingMotionBlur);}

	public int rayTracingMotionBlurPipelineTraceRaysIndirect() {return this.ptr.get(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect);}
	public void rayTracingMotionBlurPipelineTraceRaysIndirect(int value) {this.ptr.set(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect, value);}
	public java.lang.foreign.MemorySegment rayTracingMotionBlurPipelineTraceRaysIndirect_ptr() {return this.ptr.asSlice(OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect, LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect);}
}

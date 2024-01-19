package vulkan;

public record VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingMaintenance1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rayTracingMaintenance1 = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect2 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$rayTracingPipelineTraceRaysIndirect2 = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$rayTracingMaintenance1,
			LAYOUT$rayTracingPipelineTraceRaysIndirect2
	).withName("VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR");

	public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int rayTracingMaintenance1() {return this.ptr.get(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1);}
	public void rayTracingMaintenance1(int value) {this.ptr.set(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1, value);}
	public java.lang.foreign.MemorySegment rayTracingMaintenance1_ptr() {return this.ptr.asSlice(OFFSET$rayTracingMaintenance1, LAYOUT$rayTracingMaintenance1);}

	public int rayTracingPipelineTraceRaysIndirect2() {return this.ptr.get(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2);}
	public void rayTracingPipelineTraceRaysIndirect2(int value) {this.ptr.set(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2, value);}
	public java.lang.foreign.MemorySegment rayTracingPipelineTraceRaysIndirect2_ptr() {return this.ptr.asSlice(OFFSET$rayTracingPipelineTraceRaysIndirect2, LAYOUT$rayTracingPipelineTraceRaysIndirect2);}
}

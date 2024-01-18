package vulkan;

public record VkShaderStatisticsInfoAMD(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStageMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStageMask = 0L;
	public static final java.lang.foreign.GroupLayout LAYOUT$resourceUsage = vulkan.VkShaderResourceUsageAMD.gStructLayout;
	public static final long OFFSET$resourceUsage = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numPhysicalVgprs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numPhysicalVgprs = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numPhysicalSgprs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numPhysicalSgprs = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numAvailableVgprs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numAvailableVgprs = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numAvailableSgprs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numAvailableSgprs = 52L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$computeWorkGroupSize = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$computeWorkGroupSize = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$shaderStageMask,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$resourceUsage,
			LAYOUT$numPhysicalVgprs,
			LAYOUT$numPhysicalSgprs,
			LAYOUT$numAvailableVgprs,
			LAYOUT$numAvailableSgprs,
			LAYOUT$computeWorkGroupSize,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkShaderStatisticsInfoAMD");

	public VkShaderStatisticsInfoAMD(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int shaderStageMask() {return this.ptr.get(LAYOUT$shaderStageMask, OFFSET$shaderStageMask);}
	public void shaderStageMask(int value) {this.ptr.set(LAYOUT$shaderStageMask, OFFSET$shaderStageMask, value);}
	public java.lang.foreign.MemorySegment shaderStageMask_ptr() {return this.ptr.asSlice(OFFSET$shaderStageMask, LAYOUT$shaderStageMask);}

	public vulkan.VkShaderResourceUsageAMD resourceUsage() {return new vulkan.VkShaderResourceUsageAMD(this.ptr.asSlice(OFFSET$resourceUsage, LAYOUT$resourceUsage));}

	public int numPhysicalVgprs() {return this.ptr.get(LAYOUT$numPhysicalVgprs, OFFSET$numPhysicalVgprs);}
	public void numPhysicalVgprs(int value) {this.ptr.set(LAYOUT$numPhysicalVgprs, OFFSET$numPhysicalVgprs, value);}
	public java.lang.foreign.MemorySegment numPhysicalVgprs_ptr() {return this.ptr.asSlice(OFFSET$numPhysicalVgprs, LAYOUT$numPhysicalVgprs);}

	public int numPhysicalSgprs() {return this.ptr.get(LAYOUT$numPhysicalSgprs, OFFSET$numPhysicalSgprs);}
	public void numPhysicalSgprs(int value) {this.ptr.set(LAYOUT$numPhysicalSgprs, OFFSET$numPhysicalSgprs, value);}
	public java.lang.foreign.MemorySegment numPhysicalSgprs_ptr() {return this.ptr.asSlice(OFFSET$numPhysicalSgprs, LAYOUT$numPhysicalSgprs);}

	public int numAvailableVgprs() {return this.ptr.get(LAYOUT$numAvailableVgprs, OFFSET$numAvailableVgprs);}
	public void numAvailableVgprs(int value) {this.ptr.set(LAYOUT$numAvailableVgprs, OFFSET$numAvailableVgprs, value);}
	public java.lang.foreign.MemorySegment numAvailableVgprs_ptr() {return this.ptr.asSlice(OFFSET$numAvailableVgprs, LAYOUT$numAvailableVgprs);}

	public int numAvailableSgprs() {return this.ptr.get(LAYOUT$numAvailableSgprs, OFFSET$numAvailableSgprs);}
	public void numAvailableSgprs(int value) {this.ptr.set(LAYOUT$numAvailableSgprs, OFFSET$numAvailableSgprs, value);}
	public java.lang.foreign.MemorySegment numAvailableSgprs_ptr() {return this.ptr.asSlice(OFFSET$numAvailableSgprs, LAYOUT$numAvailableSgprs);}

	public java.lang.foreign.MemorySegment computeWorkGroupSize() {return this.ptr.asSlice(OFFSET$computeWorkGroupSize, LAYOUT$computeWorkGroupSize);}
	public int computeWorkGroupSize(int i) {return this.computeWorkGroupSize().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void computeWorkGroupSize(int i, int value) {this.computeWorkGroupSize().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}
}

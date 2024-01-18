package vulkan;

public record VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$extendedDynamicState2 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$extendedDynamicState2 = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$extendedDynamicState2LogicOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$extendedDynamicState2LogicOp = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$extendedDynamicState2PatchControlPoints = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$extendedDynamicState2PatchControlPoints = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$extendedDynamicState2,
			LAYOUT$extendedDynamicState2LogicOp,
			LAYOUT$extendedDynamicState2PatchControlPoints,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceExtendedDynamicState2FeaturesEXT");

	public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int extendedDynamicState2() {return this.ptr.get(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2);}
	public void extendedDynamicState2(int value) {this.ptr.set(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2, value);}
	public java.lang.foreign.MemorySegment extendedDynamicState2_ptr() {return this.ptr.asSlice(OFFSET$extendedDynamicState2, LAYOUT$extendedDynamicState2);}

	public int extendedDynamicState2LogicOp() {return this.ptr.get(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp);}
	public void extendedDynamicState2LogicOp(int value) {this.ptr.set(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp, value);}
	public java.lang.foreign.MemorySegment extendedDynamicState2LogicOp_ptr() {return this.ptr.asSlice(OFFSET$extendedDynamicState2LogicOp, LAYOUT$extendedDynamicState2LogicOp);}

	public int extendedDynamicState2PatchControlPoints() {return this.ptr.get(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints);}
	public void extendedDynamicState2PatchControlPoints(int value) {this.ptr.set(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints, value);}
	public java.lang.foreign.MemorySegment extendedDynamicState2PatchControlPoints_ptr() {return this.ptr.asSlice(OFFSET$extendedDynamicState2PatchControlPoints, LAYOUT$extendedDynamicState2PatchControlPoints);}
}

package vulkan;

public record VkPipelineFragmentShadingRateEnumStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRateType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shadingRateType = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shadingRate = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shadingRate = 20L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$combinerOps = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$combinerOps = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shadingRateType,
			LAYOUT$shadingRate,
			LAYOUT$combinerOps
	).withName("VkPipelineFragmentShadingRateEnumStateCreateInfoNV");

	public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int shadingRateType() {return this.ptr.get(LAYOUT$shadingRateType, OFFSET$shadingRateType);}
	public void shadingRateType(int value) {this.ptr.set(LAYOUT$shadingRateType, OFFSET$shadingRateType, value);}
	public java.lang.foreign.MemorySegment shadingRateType_ptr() {return this.ptr.asSlice(OFFSET$shadingRateType, LAYOUT$shadingRateType);}

	public int shadingRate() {return this.ptr.get(LAYOUT$shadingRate, OFFSET$shadingRate);}
	public void shadingRate(int value) {this.ptr.set(LAYOUT$shadingRate, OFFSET$shadingRate, value);}
	public java.lang.foreign.MemorySegment shadingRate_ptr() {return this.ptr.asSlice(OFFSET$shadingRate, LAYOUT$shadingRate);}

	public java.lang.foreign.MemorySegment combinerOps() {return this.ptr.asSlice(OFFSET$combinerOps, LAYOUT$combinerOps);}
	public int combinerOps(int i) {return this.combinerOps().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void combinerOps(int i, int value) {this.combinerOps().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}
}

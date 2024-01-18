package vulkan;

public record VkValidationFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$enabledValidationFeatureCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$enabledValidationFeatureCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pEnabledValidationFeatures = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pEnabledValidationFeatures = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$disabledValidationFeatureCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$disabledValidationFeatureCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDisabledValidationFeatures = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDisabledValidationFeatures = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$enabledValidationFeatureCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pEnabledValidationFeatures,
			LAYOUT$disabledValidationFeatureCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pDisabledValidationFeatures
	).withName("VkValidationFeaturesEXT");

	public VkValidationFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int enabledValidationFeatureCount() {return this.ptr.get(LAYOUT$enabledValidationFeatureCount, OFFSET$enabledValidationFeatureCount);}
	public void enabledValidationFeatureCount(int value) {this.ptr.set(LAYOUT$enabledValidationFeatureCount, OFFSET$enabledValidationFeatureCount, value);}
	public java.lang.foreign.MemorySegment enabledValidationFeatureCount_ptr() {return this.ptr.asSlice(OFFSET$enabledValidationFeatureCount, LAYOUT$enabledValidationFeatureCount);}

	public java.lang.foreign.MemorySegment pEnabledValidationFeatures() {return this.ptr.get(LAYOUT$pEnabledValidationFeatures, OFFSET$pEnabledValidationFeatures);}
	public void pEnabledValidationFeatures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pEnabledValidationFeatures, OFFSET$pEnabledValidationFeatures, value);}
	public java.lang.foreign.MemorySegment pEnabledValidationFeatures_ptr() {return this.ptr.asSlice(OFFSET$pEnabledValidationFeatures, LAYOUT$pEnabledValidationFeatures);}

	public int disabledValidationFeatureCount() {return this.ptr.get(LAYOUT$disabledValidationFeatureCount, OFFSET$disabledValidationFeatureCount);}
	public void disabledValidationFeatureCount(int value) {this.ptr.set(LAYOUT$disabledValidationFeatureCount, OFFSET$disabledValidationFeatureCount, value);}
	public java.lang.foreign.MemorySegment disabledValidationFeatureCount_ptr() {return this.ptr.asSlice(OFFSET$disabledValidationFeatureCount, LAYOUT$disabledValidationFeatureCount);}

	public java.lang.foreign.MemorySegment pDisabledValidationFeatures() {return this.ptr.get(LAYOUT$pDisabledValidationFeatures, OFFSET$pDisabledValidationFeatures);}
	public void pDisabledValidationFeatures(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDisabledValidationFeatures, OFFSET$pDisabledValidationFeatures, value);}
	public java.lang.foreign.MemorySegment pDisabledValidationFeatures_ptr() {return this.ptr.asSlice(OFFSET$pDisabledValidationFeatures, LAYOUT$pDisabledValidationFeatures);}
}

package vulkan;

public record VkShaderCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stage = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nextStage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$nextStage = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$codeType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$codeType = 28L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$codeSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$codeSize = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCode = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCode = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pName = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pName = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$setLayoutCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$setLayoutCount = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSetLayouts = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSetLayouts = 64L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pushConstantRangeCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pushConstantRangeCount = 72L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pPushConstantRanges = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pPushConstantRanges = 80L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSpecializationInfo = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSpecializationInfo = 88L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$stage,
			LAYOUT$nextStage,
			LAYOUT$codeType,
			LAYOUT$codeSize,
			LAYOUT$pCode,
			LAYOUT$pName,
			LAYOUT$setLayoutCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pSetLayouts,
			LAYOUT$pushConstantRangeCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pPushConstantRanges,
			LAYOUT$pSpecializationInfo
	).withName("VkShaderCreateInfoEXT");

	public VkShaderCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
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

	public int stage() {return this.ptr.get(LAYOUT$stage, OFFSET$stage);}
	public void stage(int value) {this.ptr.set(LAYOUT$stage, OFFSET$stage, value);}
	public java.lang.foreign.MemorySegment stage_ptr() {return this.ptr.asSlice(OFFSET$stage, LAYOUT$stage);}

	public int nextStage() {return this.ptr.get(LAYOUT$nextStage, OFFSET$nextStage);}
	public void nextStage(int value) {this.ptr.set(LAYOUT$nextStage, OFFSET$nextStage, value);}
	public java.lang.foreign.MemorySegment nextStage_ptr() {return this.ptr.asSlice(OFFSET$nextStage, LAYOUT$nextStage);}

	public int codeType() {return this.ptr.get(LAYOUT$codeType, OFFSET$codeType);}
	public void codeType(int value) {this.ptr.set(LAYOUT$codeType, OFFSET$codeType, value);}
	public java.lang.foreign.MemorySegment codeType_ptr() {return this.ptr.asSlice(OFFSET$codeType, LAYOUT$codeType);}

	public long codeSize() {return this.ptr.get(LAYOUT$codeSize, OFFSET$codeSize);}
	public void codeSize(long value) {this.ptr.set(LAYOUT$codeSize, OFFSET$codeSize, value);}
	public java.lang.foreign.MemorySegment codeSize_ptr() {return this.ptr.asSlice(OFFSET$codeSize, LAYOUT$codeSize);}

	public java.lang.foreign.MemorySegment pCode() {return this.ptr.get(LAYOUT$pCode, OFFSET$pCode);}
	public void pCode(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCode, OFFSET$pCode, value);}
	public java.lang.foreign.MemorySegment pCode_ptr() {return this.ptr.asSlice(OFFSET$pCode, LAYOUT$pCode);}

	public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT$pName, OFFSET$pName);}
	public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pName, OFFSET$pName, value);}
	public java.lang.foreign.MemorySegment pName_ptr() {return this.ptr.asSlice(OFFSET$pName, LAYOUT$pName);}

	public int setLayoutCount() {return this.ptr.get(LAYOUT$setLayoutCount, OFFSET$setLayoutCount);}
	public void setLayoutCount(int value) {this.ptr.set(LAYOUT$setLayoutCount, OFFSET$setLayoutCount, value);}
	public java.lang.foreign.MemorySegment setLayoutCount_ptr() {return this.ptr.asSlice(OFFSET$setLayoutCount, LAYOUT$setLayoutCount);}

	public java.lang.foreign.MemorySegment pSetLayouts() {return this.ptr.get(LAYOUT$pSetLayouts, OFFSET$pSetLayouts);}
	public void pSetLayouts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSetLayouts, OFFSET$pSetLayouts, value);}
	public java.lang.foreign.MemorySegment pSetLayouts_ptr() {return this.ptr.asSlice(OFFSET$pSetLayouts, LAYOUT$pSetLayouts);}

	public int pushConstantRangeCount() {return this.ptr.get(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount);}
	public void pushConstantRangeCount(int value) {this.ptr.set(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount, value);}
	public java.lang.foreign.MemorySegment pushConstantRangeCount_ptr() {return this.ptr.asSlice(OFFSET$pushConstantRangeCount, LAYOUT$pushConstantRangeCount);}

	public java.lang.foreign.MemorySegment pPushConstantRanges() {return this.ptr.get(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges);}
	public void pPushConstantRanges(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges, value);}
	public java.lang.foreign.MemorySegment pPushConstantRanges_ptr() {return this.ptr.asSlice(OFFSET$pPushConstantRanges, LAYOUT$pPushConstantRanges);}

	public java.lang.foreign.MemorySegment pSpecializationInfo() {return this.ptr.get(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo);}
	public void pSpecializationInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo, value);}
	public java.lang.foreign.MemorySegment pSpecializationInfo_ptr() {return this.ptr.asSlice(OFFSET$pSpecializationInfo, LAYOUT$pSpecializationInfo);}
}

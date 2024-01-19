package vulkan;

public record VkPipelineColorBlendStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$logicOpEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$logicOpEnable = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$logicOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$logicOp = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$attachmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$attachmentCount = 28L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pAttachments = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pAttachments = 32L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$blendConstants = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT);
	public static final long OFFSET$blendConstants = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$logicOpEnable,
			LAYOUT$logicOp,
			LAYOUT$attachmentCount,
			LAYOUT$pAttachments,
			LAYOUT$blendConstants
	).withName("VkPipelineColorBlendStateCreateInfo");

	public VkPipelineColorBlendStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public int logicOpEnable() {return this.ptr.get(LAYOUT$logicOpEnable, OFFSET$logicOpEnable);}
	public void logicOpEnable(int value) {this.ptr.set(LAYOUT$logicOpEnable, OFFSET$logicOpEnable, value);}
	public java.lang.foreign.MemorySegment logicOpEnable_ptr() {return this.ptr.asSlice(OFFSET$logicOpEnable, LAYOUT$logicOpEnable);}

	public int logicOp() {return this.ptr.get(LAYOUT$logicOp, OFFSET$logicOp);}
	public void logicOp(int value) {this.ptr.set(LAYOUT$logicOp, OFFSET$logicOp, value);}
	public java.lang.foreign.MemorySegment logicOp_ptr() {return this.ptr.asSlice(OFFSET$logicOp, LAYOUT$logicOp);}

	public int attachmentCount() {return this.ptr.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);}
	public void attachmentCount(int value) {this.ptr.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);}
	public java.lang.foreign.MemorySegment attachmentCount_ptr() {return this.ptr.asSlice(OFFSET$attachmentCount, LAYOUT$attachmentCount);}

	public java.lang.foreign.MemorySegment pAttachments() {return this.ptr.get(LAYOUT$pAttachments, OFFSET$pAttachments);}
	public void pAttachments(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);}
	public java.lang.foreign.MemorySegment pAttachments_ptr() {return this.ptr.asSlice(OFFSET$pAttachments, LAYOUT$pAttachments);}

	public java.lang.foreign.MemorySegment blendConstants() {return this.ptr.asSlice(OFFSET$blendConstants, LAYOUT$blendConstants);}
	public float blendConstants(int i) {return this.blendConstants().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
	public void blendConstants(int i, float value) {this.blendConstants().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}
}

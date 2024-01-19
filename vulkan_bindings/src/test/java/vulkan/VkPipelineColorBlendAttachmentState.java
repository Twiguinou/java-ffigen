package vulkan;

public record VkPipelineColorBlendAttachmentState(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blendEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$blendEnable = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcColorBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcColorBlendFactor = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstColorBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstColorBlendFactor = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorBlendOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$colorBlendOp = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcAlphaBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$srcAlphaBlendFactor = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstAlphaBlendFactor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dstAlphaBlendFactor = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$alphaBlendOp = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$alphaBlendOp = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$colorWriteMask = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$colorWriteMask = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$blendEnable,
			LAYOUT$srcColorBlendFactor,
			LAYOUT$dstColorBlendFactor,
			LAYOUT$colorBlendOp,
			LAYOUT$srcAlphaBlendFactor,
			LAYOUT$dstAlphaBlendFactor,
			LAYOUT$alphaBlendOp,
			LAYOUT$colorWriteMask
	).withName("VkPipelineColorBlendAttachmentState");

	public VkPipelineColorBlendAttachmentState(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int blendEnable() {return this.ptr.get(LAYOUT$blendEnable, OFFSET$blendEnable);}
	public void blendEnable(int value) {this.ptr.set(LAYOUT$blendEnable, OFFSET$blendEnable, value);}
	public java.lang.foreign.MemorySegment blendEnable_ptr() {return this.ptr.asSlice(OFFSET$blendEnable, LAYOUT$blendEnable);}

	public int srcColorBlendFactor() {return this.ptr.get(LAYOUT$srcColorBlendFactor, OFFSET$srcColorBlendFactor);}
	public void srcColorBlendFactor(int value) {this.ptr.set(LAYOUT$srcColorBlendFactor, OFFSET$srcColorBlendFactor, value);}
	public java.lang.foreign.MemorySegment srcColorBlendFactor_ptr() {return this.ptr.asSlice(OFFSET$srcColorBlendFactor, LAYOUT$srcColorBlendFactor);}

	public int dstColorBlendFactor() {return this.ptr.get(LAYOUT$dstColorBlendFactor, OFFSET$dstColorBlendFactor);}
	public void dstColorBlendFactor(int value) {this.ptr.set(LAYOUT$dstColorBlendFactor, OFFSET$dstColorBlendFactor, value);}
	public java.lang.foreign.MemorySegment dstColorBlendFactor_ptr() {return this.ptr.asSlice(OFFSET$dstColorBlendFactor, LAYOUT$dstColorBlendFactor);}

	public int colorBlendOp() {return this.ptr.get(LAYOUT$colorBlendOp, OFFSET$colorBlendOp);}
	public void colorBlendOp(int value) {this.ptr.set(LAYOUT$colorBlendOp, OFFSET$colorBlendOp, value);}
	public java.lang.foreign.MemorySegment colorBlendOp_ptr() {return this.ptr.asSlice(OFFSET$colorBlendOp, LAYOUT$colorBlendOp);}

	public int srcAlphaBlendFactor() {return this.ptr.get(LAYOUT$srcAlphaBlendFactor, OFFSET$srcAlphaBlendFactor);}
	public void srcAlphaBlendFactor(int value) {this.ptr.set(LAYOUT$srcAlphaBlendFactor, OFFSET$srcAlphaBlendFactor, value);}
	public java.lang.foreign.MemorySegment srcAlphaBlendFactor_ptr() {return this.ptr.asSlice(OFFSET$srcAlphaBlendFactor, LAYOUT$srcAlphaBlendFactor);}

	public int dstAlphaBlendFactor() {return this.ptr.get(LAYOUT$dstAlphaBlendFactor, OFFSET$dstAlphaBlendFactor);}
	public void dstAlphaBlendFactor(int value) {this.ptr.set(LAYOUT$dstAlphaBlendFactor, OFFSET$dstAlphaBlendFactor, value);}
	public java.lang.foreign.MemorySegment dstAlphaBlendFactor_ptr() {return this.ptr.asSlice(OFFSET$dstAlphaBlendFactor, LAYOUT$dstAlphaBlendFactor);}

	public int alphaBlendOp() {return this.ptr.get(LAYOUT$alphaBlendOp, OFFSET$alphaBlendOp);}
	public void alphaBlendOp(int value) {this.ptr.set(LAYOUT$alphaBlendOp, OFFSET$alphaBlendOp, value);}
	public java.lang.foreign.MemorySegment alphaBlendOp_ptr() {return this.ptr.asSlice(OFFSET$alphaBlendOp, LAYOUT$alphaBlendOp);}

	public int colorWriteMask() {return this.ptr.get(LAYOUT$colorWriteMask, OFFSET$colorWriteMask);}
	public void colorWriteMask(int value) {this.ptr.set(LAYOUT$colorWriteMask, OFFSET$colorWriteMask, value);}
	public java.lang.foreign.MemorySegment colorWriteMask_ptr() {return this.ptr.asSlice(OFFSET$colorWriteMask, LAYOUT$colorWriteMask);}
}

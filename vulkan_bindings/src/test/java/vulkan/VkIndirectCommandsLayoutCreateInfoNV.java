package vulkan;

public record VkIndirectCommandsLayoutCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pipelineBindPoint = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tokenCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$tokenCount = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pTokens = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pTokens = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$streamCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$streamCount = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStreamStrides = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStreamStrides = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$pipelineBindPoint,
			LAYOUT$tokenCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pTokens,
			LAYOUT$streamCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pStreamStrides
	).withName("VkIndirectCommandsLayoutCreateInfoNV");

	public VkIndirectCommandsLayoutCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
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

	public int pipelineBindPoint() {return this.ptr.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);}
	public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);}
	public java.lang.foreign.MemorySegment pipelineBindPoint_ptr() {return this.ptr.asSlice(OFFSET$pipelineBindPoint, LAYOUT$pipelineBindPoint);}

	public int tokenCount() {return this.ptr.get(LAYOUT$tokenCount, OFFSET$tokenCount);}
	public void tokenCount(int value) {this.ptr.set(LAYOUT$tokenCount, OFFSET$tokenCount, value);}
	public java.lang.foreign.MemorySegment tokenCount_ptr() {return this.ptr.asSlice(OFFSET$tokenCount, LAYOUT$tokenCount);}

	public java.lang.foreign.MemorySegment pTokens() {return this.ptr.get(LAYOUT$pTokens, OFFSET$pTokens);}
	public void pTokens(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pTokens, OFFSET$pTokens, value);}
	public java.lang.foreign.MemorySegment pTokens_ptr() {return this.ptr.asSlice(OFFSET$pTokens, LAYOUT$pTokens);}

	public int streamCount() {return this.ptr.get(LAYOUT$streamCount, OFFSET$streamCount);}
	public void streamCount(int value) {this.ptr.set(LAYOUT$streamCount, OFFSET$streamCount, value);}
	public java.lang.foreign.MemorySegment streamCount_ptr() {return this.ptr.asSlice(OFFSET$streamCount, LAYOUT$streamCount);}

	public java.lang.foreign.MemorySegment pStreamStrides() {return this.ptr.get(LAYOUT$pStreamStrides, OFFSET$pStreamStrides);}
	public void pStreamStrides(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStreamStrides, OFFSET$pStreamStrides, value);}
	public java.lang.foreign.MemorySegment pStreamStrides_ptr() {return this.ptr.asSlice(OFFSET$pStreamStrides, LAYOUT$pStreamStrides);}
}

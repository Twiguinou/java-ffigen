package vulkan;

public record VkPipelineExecutableInternalRepresentationKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$name = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$description = 272L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isText = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$isText = 528L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dataSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$dataSize = 536L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pData = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pData = 544L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$name,
			LAYOUT$description,
			LAYOUT$isText,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$dataSize,
			LAYOUT$pData
	).withName("VkPipelineExecutableInternalRepresentationKHR");

	public VkPipelineExecutableInternalRepresentationKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment name() {return this.ptr.asSlice(OFFSET$name, LAYOUT$name);}
	public char name(int i) {return (char)this.name().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void name(int i, char value) {this.name().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
	public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public int isText() {return this.ptr.get(LAYOUT$isText, OFFSET$isText);}
	public void isText(int value) {this.ptr.set(LAYOUT$isText, OFFSET$isText, value);}
	public java.lang.foreign.MemorySegment isText_ptr() {return this.ptr.asSlice(OFFSET$isText, LAYOUT$isText);}

	public long dataSize() {return this.ptr.get(LAYOUT$dataSize, OFFSET$dataSize);}
	public void dataSize(long value) {this.ptr.set(LAYOUT$dataSize, OFFSET$dataSize, value);}
	public java.lang.foreign.MemorySegment dataSize_ptr() {return this.ptr.asSlice(OFFSET$dataSize, LAYOUT$dataSize);}

	public java.lang.foreign.MemorySegment pData() {return this.ptr.get(LAYOUT$pData, OFFSET$pData);}
	public void pData(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pData, OFFSET$pData, value);}
	public java.lang.foreign.MemorySegment pData_ptr() {return this.ptr.asSlice(OFFSET$pData, LAYOUT$pData);}
}

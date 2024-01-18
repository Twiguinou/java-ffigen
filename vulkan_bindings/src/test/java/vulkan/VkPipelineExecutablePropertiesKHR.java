package vulkan;

public record VkPipelineExecutablePropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stages = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stages = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$name = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$name = 20L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$description = java.lang.foreign.MemoryLayout.sequenceLayout(256, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$description = 276L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$subgroupSize = 532L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$stages,
			LAYOUT$name,
			LAYOUT$description,
			LAYOUT$subgroupSize
	).withName("VkPipelineExecutablePropertiesKHR");

	public VkPipelineExecutablePropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int stages() {return this.ptr.get(LAYOUT$stages, OFFSET$stages);}
	public void stages(int value) {this.ptr.set(LAYOUT$stages, OFFSET$stages, value);}
	public java.lang.foreign.MemorySegment stages_ptr() {return this.ptr.asSlice(OFFSET$stages, LAYOUT$stages);}

	public java.lang.foreign.MemorySegment name() {return this.ptr.asSlice(OFFSET$name, LAYOUT$name);}
	public char name(int i) {return (char)this.name().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void name(int i, char value) {this.name().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment description() {return this.ptr.asSlice(OFFSET$description, LAYOUT$description);}
	public char description(int i) {return (char)this.description().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void description(int i, char value) {this.description().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public int subgroupSize() {return this.ptr.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);}
	public void subgroupSize(int value) {this.ptr.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);}
	public java.lang.foreign.MemorySegment subgroupSize_ptr() {return this.ptr.asSlice(OFFSET$subgroupSize, LAYOUT$subgroupSize);}
}

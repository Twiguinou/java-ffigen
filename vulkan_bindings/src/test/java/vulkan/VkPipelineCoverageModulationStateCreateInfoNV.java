package vulkan;

public record VkPipelineCoverageModulationStateCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$coverageModulationMode = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$coverageModulationMode = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$coverageModulationTableEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$coverageModulationTableEnable = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$coverageModulationTableCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$coverageModulationTableCount = 28L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pCoverageModulationTable = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pCoverageModulationTable = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$coverageModulationMode,
			LAYOUT$coverageModulationTableEnable,
			LAYOUT$coverageModulationTableCount,
			LAYOUT$pCoverageModulationTable
	).withName("VkPipelineCoverageModulationStateCreateInfoNV");

	public VkPipelineCoverageModulationStateCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
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

	public int coverageModulationMode() {return this.ptr.get(LAYOUT$coverageModulationMode, OFFSET$coverageModulationMode);}
	public void coverageModulationMode(int value) {this.ptr.set(LAYOUT$coverageModulationMode, OFFSET$coverageModulationMode, value);}
	public java.lang.foreign.MemorySegment coverageModulationMode_ptr() {return this.ptr.asSlice(OFFSET$coverageModulationMode, LAYOUT$coverageModulationMode);}

	public int coverageModulationTableEnable() {return this.ptr.get(LAYOUT$coverageModulationTableEnable, OFFSET$coverageModulationTableEnable);}
	public void coverageModulationTableEnable(int value) {this.ptr.set(LAYOUT$coverageModulationTableEnable, OFFSET$coverageModulationTableEnable, value);}
	public java.lang.foreign.MemorySegment coverageModulationTableEnable_ptr() {return this.ptr.asSlice(OFFSET$coverageModulationTableEnable, LAYOUT$coverageModulationTableEnable);}

	public int coverageModulationTableCount() {return this.ptr.get(LAYOUT$coverageModulationTableCount, OFFSET$coverageModulationTableCount);}
	public void coverageModulationTableCount(int value) {this.ptr.set(LAYOUT$coverageModulationTableCount, OFFSET$coverageModulationTableCount, value);}
	public java.lang.foreign.MemorySegment coverageModulationTableCount_ptr() {return this.ptr.asSlice(OFFSET$coverageModulationTableCount, LAYOUT$coverageModulationTableCount);}

	public java.lang.foreign.MemorySegment pCoverageModulationTable() {return this.ptr.get(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable);}
	public void pCoverageModulationTable(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pCoverageModulationTable, OFFSET$pCoverageModulationTable, value);}
	public java.lang.foreign.MemorySegment pCoverageModulationTable_ptr() {return this.ptr.asSlice(OFFSET$pCoverageModulationTable, LAYOUT$pCoverageModulationTable);}
}

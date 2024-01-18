package vulkan;

public record VkVideoDecodeH265SessionParametersAddInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdVPSCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stdVPSCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStdVPSs = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStdVPSs = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdSPSCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stdSPSCount = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStdSPSs = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStdSPSs = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdPPSCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stdPPSCount = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pStdPPSs = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pStdPPSs = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$stdVPSCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pStdVPSs,
			LAYOUT$stdSPSCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pStdSPSs,
			LAYOUT$stdPPSCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pStdPPSs
	).withName("VkVideoDecodeH265SessionParametersAddInfoKHR");

	public VkVideoDecodeH265SessionParametersAddInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int stdVPSCount() {return this.ptr.get(LAYOUT$stdVPSCount, OFFSET$stdVPSCount);}
	public void stdVPSCount(int value) {this.ptr.set(LAYOUT$stdVPSCount, OFFSET$stdVPSCount, value);}
	public java.lang.foreign.MemorySegment stdVPSCount_ptr() {return this.ptr.asSlice(OFFSET$stdVPSCount, LAYOUT$stdVPSCount);}

	public java.lang.foreign.MemorySegment pStdVPSs() {return this.ptr.get(LAYOUT$pStdVPSs, OFFSET$pStdVPSs);}
	public void pStdVPSs(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdVPSs, OFFSET$pStdVPSs, value);}
	public java.lang.foreign.MemorySegment pStdVPSs_ptr() {return this.ptr.asSlice(OFFSET$pStdVPSs, LAYOUT$pStdVPSs);}

	public int stdSPSCount() {return this.ptr.get(LAYOUT$stdSPSCount, OFFSET$stdSPSCount);}
	public void stdSPSCount(int value) {this.ptr.set(LAYOUT$stdSPSCount, OFFSET$stdSPSCount, value);}
	public java.lang.foreign.MemorySegment stdSPSCount_ptr() {return this.ptr.asSlice(OFFSET$stdSPSCount, LAYOUT$stdSPSCount);}

	public java.lang.foreign.MemorySegment pStdSPSs() {return this.ptr.get(LAYOUT$pStdSPSs, OFFSET$pStdSPSs);}
	public void pStdSPSs(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdSPSs, OFFSET$pStdSPSs, value);}
	public java.lang.foreign.MemorySegment pStdSPSs_ptr() {return this.ptr.asSlice(OFFSET$pStdSPSs, LAYOUT$pStdSPSs);}

	public int stdPPSCount() {return this.ptr.get(LAYOUT$stdPPSCount, OFFSET$stdPPSCount);}
	public void stdPPSCount(int value) {this.ptr.set(LAYOUT$stdPPSCount, OFFSET$stdPPSCount, value);}
	public java.lang.foreign.MemorySegment stdPPSCount_ptr() {return this.ptr.asSlice(OFFSET$stdPPSCount, LAYOUT$stdPPSCount);}

	public java.lang.foreign.MemorySegment pStdPPSs() {return this.ptr.get(LAYOUT$pStdPPSs, OFFSET$pStdPPSs);}
	public void pStdPPSs(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdPPSs, OFFSET$pStdPPSs, value);}
	public java.lang.foreign.MemorySegment pStdPPSs_ptr() {return this.ptr.asSlice(OFFSET$pStdPPSs, LAYOUT$pStdPPSs);}
}

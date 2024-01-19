package vulkan;

public record VkVideoDecodeH264SessionParametersCreateInfoKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxStdSPSCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxStdSPSCount = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxStdPPSCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxStdPPSCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pParametersAddInfo = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pParametersAddInfo = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$maxStdSPSCount,
			LAYOUT$maxStdPPSCount,
			LAYOUT$pParametersAddInfo
	).withName("VkVideoDecodeH264SessionParametersCreateInfoKHR");

	public VkVideoDecodeH264SessionParametersCreateInfoKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int maxStdSPSCount() {return this.ptr.get(LAYOUT$maxStdSPSCount, OFFSET$maxStdSPSCount);}
	public void maxStdSPSCount(int value) {this.ptr.set(LAYOUT$maxStdSPSCount, OFFSET$maxStdSPSCount, value);}
	public java.lang.foreign.MemorySegment maxStdSPSCount_ptr() {return this.ptr.asSlice(OFFSET$maxStdSPSCount, LAYOUT$maxStdSPSCount);}

	public int maxStdPPSCount() {return this.ptr.get(LAYOUT$maxStdPPSCount, OFFSET$maxStdPPSCount);}
	public void maxStdPPSCount(int value) {this.ptr.set(LAYOUT$maxStdPPSCount, OFFSET$maxStdPPSCount, value);}
	public java.lang.foreign.MemorySegment maxStdPPSCount_ptr() {return this.ptr.asSlice(OFFSET$maxStdPPSCount, LAYOUT$maxStdPPSCount);}

	public java.lang.foreign.MemorySegment pParametersAddInfo() {return this.ptr.get(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo);}
	public void pParametersAddInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo, value);}
	public java.lang.foreign.MemorySegment pParametersAddInfo_ptr() {return this.ptr.asSlice(OFFSET$pParametersAddInfo, LAYOUT$pParametersAddInfo);}
}

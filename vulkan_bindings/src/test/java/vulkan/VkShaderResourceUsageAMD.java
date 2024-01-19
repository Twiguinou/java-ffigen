package vulkan;

public record VkShaderResourceUsageAMD(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numUsedVgprs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numUsedVgprs = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numUsedSgprs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$numUsedSgprs = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$ldsSizePerLocalWorkGroup = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$ldsSizePerLocalWorkGroup = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$ldsUsageSizeInBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$ldsUsageSizeInBytes = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$scratchMemUsageInBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$scratchMemUsageInBytes = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$numUsedVgprs,
			LAYOUT$numUsedSgprs,
			LAYOUT$ldsSizePerLocalWorkGroup,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$ldsUsageSizeInBytes,
			LAYOUT$scratchMemUsageInBytes
	).withName("VkShaderResourceUsageAMD");

	public VkShaderResourceUsageAMD(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int numUsedVgprs() {return this.ptr.get(LAYOUT$numUsedVgprs, OFFSET$numUsedVgprs);}
	public void numUsedVgprs(int value) {this.ptr.set(LAYOUT$numUsedVgprs, OFFSET$numUsedVgprs, value);}
	public java.lang.foreign.MemorySegment numUsedVgprs_ptr() {return this.ptr.asSlice(OFFSET$numUsedVgprs, LAYOUT$numUsedVgprs);}

	public int numUsedSgprs() {return this.ptr.get(LAYOUT$numUsedSgprs, OFFSET$numUsedSgprs);}
	public void numUsedSgprs(int value) {this.ptr.set(LAYOUT$numUsedSgprs, OFFSET$numUsedSgprs, value);}
	public java.lang.foreign.MemorySegment numUsedSgprs_ptr() {return this.ptr.asSlice(OFFSET$numUsedSgprs, LAYOUT$numUsedSgprs);}

	public int ldsSizePerLocalWorkGroup() {return this.ptr.get(LAYOUT$ldsSizePerLocalWorkGroup, OFFSET$ldsSizePerLocalWorkGroup);}
	public void ldsSizePerLocalWorkGroup(int value) {this.ptr.set(LAYOUT$ldsSizePerLocalWorkGroup, OFFSET$ldsSizePerLocalWorkGroup, value);}
	public java.lang.foreign.MemorySegment ldsSizePerLocalWorkGroup_ptr() {return this.ptr.asSlice(OFFSET$ldsSizePerLocalWorkGroup, LAYOUT$ldsSizePerLocalWorkGroup);}

	public long ldsUsageSizeInBytes() {return this.ptr.get(LAYOUT$ldsUsageSizeInBytes, OFFSET$ldsUsageSizeInBytes);}
	public void ldsUsageSizeInBytes(long value) {this.ptr.set(LAYOUT$ldsUsageSizeInBytes, OFFSET$ldsUsageSizeInBytes, value);}
	public java.lang.foreign.MemorySegment ldsUsageSizeInBytes_ptr() {return this.ptr.asSlice(OFFSET$ldsUsageSizeInBytes, LAYOUT$ldsUsageSizeInBytes);}

	public long scratchMemUsageInBytes() {return this.ptr.get(LAYOUT$scratchMemUsageInBytes, OFFSET$scratchMemUsageInBytes);}
	public void scratchMemUsageInBytes(long value) {this.ptr.set(LAYOUT$scratchMemUsageInBytes, OFFSET$scratchMemUsageInBytes, value);}
	public java.lang.foreign.MemorySegment scratchMemUsageInBytes_ptr() {return this.ptr.asSlice(OFFSET$scratchMemUsageInBytes, LAYOUT$scratchMemUsageInBytes);}
}

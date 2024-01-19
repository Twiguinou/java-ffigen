package vulkan;

public record VkPhysicalDeviceTexelBufferAlignmentProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$storageTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$storageTexelBufferOffsetAlignmentBytes = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$storageTexelBufferOffsetSingleTexelAlignment = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$uniformTexelBufferOffsetAlignmentBytes = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$uniformTexelBufferOffsetAlignmentBytes = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$uniformTexelBufferOffsetSingleTexelAlignment = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$storageTexelBufferOffsetAlignmentBytes,
			LAYOUT$storageTexelBufferOffsetSingleTexelAlignment,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$uniformTexelBufferOffsetAlignmentBytes,
			LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceTexelBufferAlignmentProperties");

	public VkPhysicalDeviceTexelBufferAlignmentProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public long storageTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes);}
	public void storageTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes, value);}
	public java.lang.foreign.MemorySegment storageTexelBufferOffsetAlignmentBytes_ptr() {return this.ptr.asSlice(OFFSET$storageTexelBufferOffsetAlignmentBytes, LAYOUT$storageTexelBufferOffsetAlignmentBytes);}

	public int storageTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment);}
	public void storageTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment, value);}
	public java.lang.foreign.MemorySegment storageTexelBufferOffsetSingleTexelAlignment_ptr() {return this.ptr.asSlice(OFFSET$storageTexelBufferOffsetSingleTexelAlignment, LAYOUT$storageTexelBufferOffsetSingleTexelAlignment);}

	public long uniformTexelBufferOffsetAlignmentBytes() {return this.ptr.get(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes);}
	public void uniformTexelBufferOffsetAlignmentBytes(long value) {this.ptr.set(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes, value);}
	public java.lang.foreign.MemorySegment uniformTexelBufferOffsetAlignmentBytes_ptr() {return this.ptr.asSlice(OFFSET$uniformTexelBufferOffsetAlignmentBytes, LAYOUT$uniformTexelBufferOffsetAlignmentBytes);}

	public int uniformTexelBufferOffsetSingleTexelAlignment() {return this.ptr.get(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment);}
	public void uniformTexelBufferOffsetSingleTexelAlignment(int value) {this.ptr.set(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment, value);}
	public java.lang.foreign.MemorySegment uniformTexelBufferOffsetSingleTexelAlignment_ptr() {return this.ptr.asSlice(OFFSET$uniformTexelBufferOffsetSingleTexelAlignment, LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment);}
}

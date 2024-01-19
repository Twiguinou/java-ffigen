package vulkan;

public record VkImageCompressionPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageCompressionFlags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageCompressionFlags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageCompressionFixedRateFlags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imageCompressionFixedRateFlags = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$imageCompressionFlags,
			LAYOUT$imageCompressionFixedRateFlags
	).withName("VkImageCompressionPropertiesEXT");

	public VkImageCompressionPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int imageCompressionFlags() {return this.ptr.get(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags);}
	public void imageCompressionFlags(int value) {this.ptr.set(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags, value);}
	public java.lang.foreign.MemorySegment imageCompressionFlags_ptr() {return this.ptr.asSlice(OFFSET$imageCompressionFlags, LAYOUT$imageCompressionFlags);}

	public int imageCompressionFixedRateFlags() {return this.ptr.get(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags);}
	public void imageCompressionFixedRateFlags(int value) {this.ptr.set(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags, value);}
	public java.lang.foreign.MemorySegment imageCompressionFixedRateFlags_ptr() {return this.ptr.asSlice(OFFSET$imageCompressionFixedRateFlags, LAYOUT$imageCompressionFixedRateFlags);}
}

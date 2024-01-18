package vulkan;

public record VkDecompressMemoryRegionNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$srcAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$srcAddress = 0L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$dstAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$dstAddress = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$compressedSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$compressedSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$decompressedSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$decompressedSize = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$decompressionMethod = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$decompressionMethod = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$srcAddress,
			LAYOUT$dstAddress,
			LAYOUT$compressedSize,
			LAYOUT$decompressedSize,
			LAYOUT$decompressionMethod
	).withName("VkDecompressMemoryRegionNV");

	public VkDecompressMemoryRegionNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public long srcAddress() {return this.ptr.get(LAYOUT$srcAddress, OFFSET$srcAddress);}
	public void srcAddress(long value) {this.ptr.set(LAYOUT$srcAddress, OFFSET$srcAddress, value);}
	public java.lang.foreign.MemorySegment srcAddress_ptr() {return this.ptr.asSlice(OFFSET$srcAddress, LAYOUT$srcAddress);}

	public long dstAddress() {return this.ptr.get(LAYOUT$dstAddress, OFFSET$dstAddress);}
	public void dstAddress(long value) {this.ptr.set(LAYOUT$dstAddress, OFFSET$dstAddress, value);}
	public java.lang.foreign.MemorySegment dstAddress_ptr() {return this.ptr.asSlice(OFFSET$dstAddress, LAYOUT$dstAddress);}

	public long compressedSize() {return this.ptr.get(LAYOUT$compressedSize, OFFSET$compressedSize);}
	public void compressedSize(long value) {this.ptr.set(LAYOUT$compressedSize, OFFSET$compressedSize, value);}
	public java.lang.foreign.MemorySegment compressedSize_ptr() {return this.ptr.asSlice(OFFSET$compressedSize, LAYOUT$compressedSize);}

	public long decompressedSize() {return this.ptr.get(LAYOUT$decompressedSize, OFFSET$decompressedSize);}
	public void decompressedSize(long value) {this.ptr.set(LAYOUT$decompressedSize, OFFSET$decompressedSize, value);}
	public java.lang.foreign.MemorySegment decompressedSize_ptr() {return this.ptr.asSlice(OFFSET$decompressedSize, LAYOUT$decompressedSize);}

	public long decompressionMethod() {return this.ptr.get(LAYOUT$decompressionMethod, OFFSET$decompressionMethod);}
	public void decompressionMethod(long value) {this.ptr.set(LAYOUT$decompressionMethod, OFFSET$decompressionMethod, value);}
	public java.lang.foreign.MemorySegment decompressionMethod_ptr() {return this.ptr.asSlice(OFFSET$decompressionMethod, LAYOUT$decompressionMethod);}
}

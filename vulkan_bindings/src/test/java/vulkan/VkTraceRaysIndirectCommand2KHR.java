package vulkan;

public record VkTraceRaysIndirectCommand2KHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$raygenShaderRecordAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$raygenShaderRecordAddress = 0L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$raygenShaderRecordSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$raygenShaderRecordSize = 8L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$missShaderBindingTableAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$missShaderBindingTableAddress = 16L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$missShaderBindingTableSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$missShaderBindingTableSize = 24L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$missShaderBindingTableStride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$missShaderBindingTableStride = 32L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$hitShaderBindingTableAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$hitShaderBindingTableAddress = 40L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$hitShaderBindingTableSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$hitShaderBindingTableSize = 48L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$hitShaderBindingTableStride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$hitShaderBindingTableStride = 56L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$callableShaderBindingTableAddress = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$callableShaderBindingTableAddress = 64L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$callableShaderBindingTableSize = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$callableShaderBindingTableSize = 72L;
	public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$callableShaderBindingTableStride = java.lang.foreign.ValueLayout.JAVA_LONG;
	public static final long OFFSET$callableShaderBindingTableStride = 80L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$width = 88L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$height = 92L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depth = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$depth = 96L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$raygenShaderRecordAddress,
			LAYOUT$raygenShaderRecordSize,
			LAYOUT$missShaderBindingTableAddress,
			LAYOUT$missShaderBindingTableSize,
			LAYOUT$missShaderBindingTableStride,
			LAYOUT$hitShaderBindingTableAddress,
			LAYOUT$hitShaderBindingTableSize,
			LAYOUT$hitShaderBindingTableStride,
			LAYOUT$callableShaderBindingTableAddress,
			LAYOUT$callableShaderBindingTableSize,
			LAYOUT$callableShaderBindingTableStride,
			LAYOUT$width,
			LAYOUT$height,
			LAYOUT$depth,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkTraceRaysIndirectCommand2KHR");

	public VkTraceRaysIndirectCommand2KHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public long raygenShaderRecordAddress() {return this.ptr.get(LAYOUT$raygenShaderRecordAddress, OFFSET$raygenShaderRecordAddress);}
	public void raygenShaderRecordAddress(long value) {this.ptr.set(LAYOUT$raygenShaderRecordAddress, OFFSET$raygenShaderRecordAddress, value);}
	public java.lang.foreign.MemorySegment raygenShaderRecordAddress_ptr() {return this.ptr.asSlice(OFFSET$raygenShaderRecordAddress, LAYOUT$raygenShaderRecordAddress);}

	public long raygenShaderRecordSize() {return this.ptr.get(LAYOUT$raygenShaderRecordSize, OFFSET$raygenShaderRecordSize);}
	public void raygenShaderRecordSize(long value) {this.ptr.set(LAYOUT$raygenShaderRecordSize, OFFSET$raygenShaderRecordSize, value);}
	public java.lang.foreign.MemorySegment raygenShaderRecordSize_ptr() {return this.ptr.asSlice(OFFSET$raygenShaderRecordSize, LAYOUT$raygenShaderRecordSize);}

	public long missShaderBindingTableAddress() {return this.ptr.get(LAYOUT$missShaderBindingTableAddress, OFFSET$missShaderBindingTableAddress);}
	public void missShaderBindingTableAddress(long value) {this.ptr.set(LAYOUT$missShaderBindingTableAddress, OFFSET$missShaderBindingTableAddress, value);}
	public java.lang.foreign.MemorySegment missShaderBindingTableAddress_ptr() {return this.ptr.asSlice(OFFSET$missShaderBindingTableAddress, LAYOUT$missShaderBindingTableAddress);}

	public long missShaderBindingTableSize() {return this.ptr.get(LAYOUT$missShaderBindingTableSize, OFFSET$missShaderBindingTableSize);}
	public void missShaderBindingTableSize(long value) {this.ptr.set(LAYOUT$missShaderBindingTableSize, OFFSET$missShaderBindingTableSize, value);}
	public java.lang.foreign.MemorySegment missShaderBindingTableSize_ptr() {return this.ptr.asSlice(OFFSET$missShaderBindingTableSize, LAYOUT$missShaderBindingTableSize);}

	public long missShaderBindingTableStride() {return this.ptr.get(LAYOUT$missShaderBindingTableStride, OFFSET$missShaderBindingTableStride);}
	public void missShaderBindingTableStride(long value) {this.ptr.set(LAYOUT$missShaderBindingTableStride, OFFSET$missShaderBindingTableStride, value);}
	public java.lang.foreign.MemorySegment missShaderBindingTableStride_ptr() {return this.ptr.asSlice(OFFSET$missShaderBindingTableStride, LAYOUT$missShaderBindingTableStride);}

	public long hitShaderBindingTableAddress() {return this.ptr.get(LAYOUT$hitShaderBindingTableAddress, OFFSET$hitShaderBindingTableAddress);}
	public void hitShaderBindingTableAddress(long value) {this.ptr.set(LAYOUT$hitShaderBindingTableAddress, OFFSET$hitShaderBindingTableAddress, value);}
	public java.lang.foreign.MemorySegment hitShaderBindingTableAddress_ptr() {return this.ptr.asSlice(OFFSET$hitShaderBindingTableAddress, LAYOUT$hitShaderBindingTableAddress);}

	public long hitShaderBindingTableSize() {return this.ptr.get(LAYOUT$hitShaderBindingTableSize, OFFSET$hitShaderBindingTableSize);}
	public void hitShaderBindingTableSize(long value) {this.ptr.set(LAYOUT$hitShaderBindingTableSize, OFFSET$hitShaderBindingTableSize, value);}
	public java.lang.foreign.MemorySegment hitShaderBindingTableSize_ptr() {return this.ptr.asSlice(OFFSET$hitShaderBindingTableSize, LAYOUT$hitShaderBindingTableSize);}

	public long hitShaderBindingTableStride() {return this.ptr.get(LAYOUT$hitShaderBindingTableStride, OFFSET$hitShaderBindingTableStride);}
	public void hitShaderBindingTableStride(long value) {this.ptr.set(LAYOUT$hitShaderBindingTableStride, OFFSET$hitShaderBindingTableStride, value);}
	public java.lang.foreign.MemorySegment hitShaderBindingTableStride_ptr() {return this.ptr.asSlice(OFFSET$hitShaderBindingTableStride, LAYOUT$hitShaderBindingTableStride);}

	public long callableShaderBindingTableAddress() {return this.ptr.get(LAYOUT$callableShaderBindingTableAddress, OFFSET$callableShaderBindingTableAddress);}
	public void callableShaderBindingTableAddress(long value) {this.ptr.set(LAYOUT$callableShaderBindingTableAddress, OFFSET$callableShaderBindingTableAddress, value);}
	public java.lang.foreign.MemorySegment callableShaderBindingTableAddress_ptr() {return this.ptr.asSlice(OFFSET$callableShaderBindingTableAddress, LAYOUT$callableShaderBindingTableAddress);}

	public long callableShaderBindingTableSize() {return this.ptr.get(LAYOUT$callableShaderBindingTableSize, OFFSET$callableShaderBindingTableSize);}
	public void callableShaderBindingTableSize(long value) {this.ptr.set(LAYOUT$callableShaderBindingTableSize, OFFSET$callableShaderBindingTableSize, value);}
	public java.lang.foreign.MemorySegment callableShaderBindingTableSize_ptr() {return this.ptr.asSlice(OFFSET$callableShaderBindingTableSize, LAYOUT$callableShaderBindingTableSize);}

	public long callableShaderBindingTableStride() {return this.ptr.get(LAYOUT$callableShaderBindingTableStride, OFFSET$callableShaderBindingTableStride);}
	public void callableShaderBindingTableStride(long value) {this.ptr.set(LAYOUT$callableShaderBindingTableStride, OFFSET$callableShaderBindingTableStride, value);}
	public java.lang.foreign.MemorySegment callableShaderBindingTableStride_ptr() {return this.ptr.asSlice(OFFSET$callableShaderBindingTableStride, LAYOUT$callableShaderBindingTableStride);}

	public int width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
	public void width(int value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
	public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

	public int height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
	public void height(int value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
	public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

	public int depth() {return this.ptr.get(LAYOUT$depth, OFFSET$depth);}
	public void depth(int value) {this.ptr.set(LAYOUT$depth, OFFSET$depth, value);}
	public java.lang.foreign.MemorySegment depth_ptr() {return this.ptr.asSlice(OFFSET$depth, LAYOUT$depth);}
}

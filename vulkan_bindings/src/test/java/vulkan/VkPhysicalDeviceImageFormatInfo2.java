package vulkan;

public record VkPhysicalDeviceImageFormatInfo2(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$format = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$type = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$type = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tiling = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$tiling = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$usage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$usage = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$format,
			LAYOUT$type,
			LAYOUT$tiling,
			LAYOUT$usage,
			LAYOUT$flags,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceImageFormatInfo2");

	public VkPhysicalDeviceImageFormatInfo2(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
	public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
	public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

	public int type() {return this.ptr.get(LAYOUT$type, OFFSET$type);}
	public void type(int value) {this.ptr.set(LAYOUT$type, OFFSET$type, value);}
	public java.lang.foreign.MemorySegment type_ptr() {return this.ptr.asSlice(OFFSET$type, LAYOUT$type);}

	public int tiling() {return this.ptr.get(LAYOUT$tiling, OFFSET$tiling);}
	public void tiling(int value) {this.ptr.set(LAYOUT$tiling, OFFSET$tiling, value);}
	public java.lang.foreign.MemorySegment tiling_ptr() {return this.ptr.asSlice(OFFSET$tiling, LAYOUT$tiling);}

	public int usage() {return this.ptr.get(LAYOUT$usage, OFFSET$usage);}
	public void usage(int value) {this.ptr.set(LAYOUT$usage, OFFSET$usage, value);}
	public java.lang.foreign.MemorySegment usage_ptr() {return this.ptr.asSlice(OFFSET$usage, LAYOUT$usage);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}

package vulkan;

public record VkVertexInputBindingDescription2EXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$binding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$binding = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stride = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stride = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$inputRate = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$inputRate = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$divisor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$divisor = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$binding,
			LAYOUT$stride,
			LAYOUT$inputRate,
			LAYOUT$divisor
	).withName("VkVertexInputBindingDescription2EXT");

	public VkVertexInputBindingDescription2EXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int binding() {return this.ptr.get(LAYOUT$binding, OFFSET$binding);}
	public void binding(int value) {this.ptr.set(LAYOUT$binding, OFFSET$binding, value);}
	public java.lang.foreign.MemorySegment binding_ptr() {return this.ptr.asSlice(OFFSET$binding, LAYOUT$binding);}

	public int stride() {return this.ptr.get(LAYOUT$stride, OFFSET$stride);}
	public void stride(int value) {this.ptr.set(LAYOUT$stride, OFFSET$stride, value);}
	public java.lang.foreign.MemorySegment stride_ptr() {return this.ptr.asSlice(OFFSET$stride, LAYOUT$stride);}

	public int inputRate() {return this.ptr.get(LAYOUT$inputRate, OFFSET$inputRate);}
	public void inputRate(int value) {this.ptr.set(LAYOUT$inputRate, OFFSET$inputRate, value);}
	public java.lang.foreign.MemorySegment inputRate_ptr() {return this.ptr.asSlice(OFFSET$inputRate, LAYOUT$inputRate);}

	public int divisor() {return this.ptr.get(LAYOUT$divisor, OFFSET$divisor);}
	public void divisor(int value) {this.ptr.set(LAYOUT$divisor, OFFSET$divisor, value);}
	public java.lang.foreign.MemorySegment divisor_ptr() {return this.ptr.asSlice(OFFSET$divisor, LAYOUT$divisor);}
}

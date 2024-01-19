package vulkan;

public record VkVertexInputBindingDivisorDescriptionEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$binding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$binding = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$divisor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$divisor = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$binding,
			LAYOUT$divisor
	).withName("VkVertexInputBindingDivisorDescriptionEXT");

	public VkVertexInputBindingDivisorDescriptionEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int binding() {return this.ptr.get(LAYOUT$binding, OFFSET$binding);}
	public void binding(int value) {this.ptr.set(LAYOUT$binding, OFFSET$binding, value);}
	public java.lang.foreign.MemorySegment binding_ptr() {return this.ptr.asSlice(OFFSET$binding, LAYOUT$binding);}

	public int divisor() {return this.ptr.get(LAYOUT$divisor, OFFSET$divisor);}
	public void divisor(int value) {this.ptr.set(LAYOUT$divisor, OFFSET$divisor, value);}
	public java.lang.foreign.MemorySegment divisor_ptr() {return this.ptr.asSlice(OFFSET$divisor, LAYOUT$divisor);}
}

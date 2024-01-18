package vulkan;

public record VkVertexInputAttributeDescription(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$location = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$location = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$binding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$binding = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$format = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$offset = 12L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$location,
			LAYOUT$binding,
			LAYOUT$format,
			LAYOUT$offset
	).withName("VkVertexInputAttributeDescription");

	public VkVertexInputAttributeDescription(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int location() {return this.ptr.get(LAYOUT$location, OFFSET$location);}
	public void location(int value) {this.ptr.set(LAYOUT$location, OFFSET$location, value);}
	public java.lang.foreign.MemorySegment location_ptr() {return this.ptr.asSlice(OFFSET$location, LAYOUT$location);}

	public int binding() {return this.ptr.get(LAYOUT$binding, OFFSET$binding);}
	public void binding(int value) {this.ptr.set(LAYOUT$binding, OFFSET$binding, value);}
	public java.lang.foreign.MemorySegment binding_ptr() {return this.ptr.asSlice(OFFSET$binding, LAYOUT$binding);}

	public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
	public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
	public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}

	public int offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
	public void offset(int value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
	public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}
}

package vulkan;

public record VkPhysicalDeviceSparseProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$residencyStandard2DBlockShape = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$residencyStandard2DBlockShape = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$residencyStandard2DMultisampleBlockShape = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$residencyStandard2DMultisampleBlockShape = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$residencyStandard3DBlockShape = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$residencyStandard3DBlockShape = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$residencyAlignedMipSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$residencyAlignedMipSize = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$residencyNonResidentStrict = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$residencyNonResidentStrict = 16L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$residencyStandard2DBlockShape,
			LAYOUT$residencyStandard2DMultisampleBlockShape,
			LAYOUT$residencyStandard3DBlockShape,
			LAYOUT$residencyAlignedMipSize,
			LAYOUT$residencyNonResidentStrict
	).withName("VkPhysicalDeviceSparseProperties");

	public VkPhysicalDeviceSparseProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int residencyStandard2DBlockShape() {return this.ptr.get(LAYOUT$residencyStandard2DBlockShape, OFFSET$residencyStandard2DBlockShape);}
	public void residencyStandard2DBlockShape(int value) {this.ptr.set(LAYOUT$residencyStandard2DBlockShape, OFFSET$residencyStandard2DBlockShape, value);}
	public java.lang.foreign.MemorySegment residencyStandard2DBlockShape_ptr() {return this.ptr.asSlice(OFFSET$residencyStandard2DBlockShape, LAYOUT$residencyStandard2DBlockShape);}

	public int residencyStandard2DMultisampleBlockShape() {return this.ptr.get(LAYOUT$residencyStandard2DMultisampleBlockShape, OFFSET$residencyStandard2DMultisampleBlockShape);}
	public void residencyStandard2DMultisampleBlockShape(int value) {this.ptr.set(LAYOUT$residencyStandard2DMultisampleBlockShape, OFFSET$residencyStandard2DMultisampleBlockShape, value);}
	public java.lang.foreign.MemorySegment residencyStandard2DMultisampleBlockShape_ptr() {return this.ptr.asSlice(OFFSET$residencyStandard2DMultisampleBlockShape, LAYOUT$residencyStandard2DMultisampleBlockShape);}

	public int residencyStandard3DBlockShape() {return this.ptr.get(LAYOUT$residencyStandard3DBlockShape, OFFSET$residencyStandard3DBlockShape);}
	public void residencyStandard3DBlockShape(int value) {this.ptr.set(LAYOUT$residencyStandard3DBlockShape, OFFSET$residencyStandard3DBlockShape, value);}
	public java.lang.foreign.MemorySegment residencyStandard3DBlockShape_ptr() {return this.ptr.asSlice(OFFSET$residencyStandard3DBlockShape, LAYOUT$residencyStandard3DBlockShape);}

	public int residencyAlignedMipSize() {return this.ptr.get(LAYOUT$residencyAlignedMipSize, OFFSET$residencyAlignedMipSize);}
	public void residencyAlignedMipSize(int value) {this.ptr.set(LAYOUT$residencyAlignedMipSize, OFFSET$residencyAlignedMipSize, value);}
	public java.lang.foreign.MemorySegment residencyAlignedMipSize_ptr() {return this.ptr.asSlice(OFFSET$residencyAlignedMipSize, LAYOUT$residencyAlignedMipSize);}

	public int residencyNonResidentStrict() {return this.ptr.get(LAYOUT$residencyNonResidentStrict, OFFSET$residencyNonResidentStrict);}
	public void residencyNonResidentStrict(int value) {this.ptr.set(LAYOUT$residencyNonResidentStrict, OFFSET$residencyNonResidentStrict, value);}
	public java.lang.foreign.MemorySegment residencyNonResidentStrict_ptr() {return this.ptr.asSlice(OFFSET$residencyNonResidentStrict, LAYOUT$residencyNonResidentStrict);}
}

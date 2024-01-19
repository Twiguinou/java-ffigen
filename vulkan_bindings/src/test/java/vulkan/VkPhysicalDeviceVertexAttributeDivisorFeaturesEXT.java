package vulkan;

public record VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexAttributeInstanceRateDivisor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexAttributeInstanceRateDivisor = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexAttributeInstanceRateZeroDivisor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexAttributeInstanceRateZeroDivisor = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$vertexAttributeInstanceRateDivisor,
			LAYOUT$vertexAttributeInstanceRateZeroDivisor
	).withName("VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT");

	public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int vertexAttributeInstanceRateDivisor() {return this.ptr.get(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor);}
	public void vertexAttributeInstanceRateDivisor(int value) {this.ptr.set(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor, value);}
	public java.lang.foreign.MemorySegment vertexAttributeInstanceRateDivisor_ptr() {return this.ptr.asSlice(OFFSET$vertexAttributeInstanceRateDivisor, LAYOUT$vertexAttributeInstanceRateDivisor);}

	public int vertexAttributeInstanceRateZeroDivisor() {return this.ptr.get(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor);}
	public void vertexAttributeInstanceRateZeroDivisor(int value) {this.ptr.set(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor, value);}
	public java.lang.foreign.MemorySegment vertexAttributeInstanceRateZeroDivisor_ptr() {return this.ptr.asSlice(OFFSET$vertexAttributeInstanceRateZeroDivisor, LAYOUT$vertexAttributeInstanceRateZeroDivisor);}
}

package vulkan;

public record VkPipelineVertexInputDivisorStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexBindingDivisorCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexBindingDivisorCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pVertexBindingDivisors = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pVertexBindingDivisors = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$vertexBindingDivisorCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pVertexBindingDivisors
	).withName("VkPipelineVertexInputDivisorStateCreateInfoEXT");

	public VkPipelineVertexInputDivisorStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int vertexBindingDivisorCount() {return this.ptr.get(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount);}
	public void vertexBindingDivisorCount(int value) {this.ptr.set(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount, value);}
	public java.lang.foreign.MemorySegment vertexBindingDivisorCount_ptr() {return this.ptr.asSlice(OFFSET$vertexBindingDivisorCount, LAYOUT$vertexBindingDivisorCount);}

	public java.lang.foreign.MemorySegment pVertexBindingDivisors() {return this.ptr.get(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors);}
	public void pVertexBindingDivisors(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors, value);}
	public java.lang.foreign.MemorySegment pVertexBindingDivisors_ptr() {return this.ptr.asSlice(OFFSET$pVertexBindingDivisors, LAYOUT$pVertexBindingDivisors);}
}

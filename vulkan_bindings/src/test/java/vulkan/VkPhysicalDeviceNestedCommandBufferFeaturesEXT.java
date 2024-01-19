package vulkan;

public record VkPhysicalDeviceNestedCommandBufferFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nestedCommandBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$nestedCommandBuffer = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nestedCommandBufferRendering = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$nestedCommandBufferRendering = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nestedCommandBufferSimultaneousUse = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$nestedCommandBufferSimultaneousUse = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$nestedCommandBuffer,
			LAYOUT$nestedCommandBufferRendering,
			LAYOUT$nestedCommandBufferSimultaneousUse,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceNestedCommandBufferFeaturesEXT");

	public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int nestedCommandBuffer() {return this.ptr.get(LAYOUT$nestedCommandBuffer, OFFSET$nestedCommandBuffer);}
	public void nestedCommandBuffer(int value) {this.ptr.set(LAYOUT$nestedCommandBuffer, OFFSET$nestedCommandBuffer, value);}
	public java.lang.foreign.MemorySegment nestedCommandBuffer_ptr() {return this.ptr.asSlice(OFFSET$nestedCommandBuffer, LAYOUT$nestedCommandBuffer);}

	public int nestedCommandBufferRendering() {return this.ptr.get(LAYOUT$nestedCommandBufferRendering, OFFSET$nestedCommandBufferRendering);}
	public void nestedCommandBufferRendering(int value) {this.ptr.set(LAYOUT$nestedCommandBufferRendering, OFFSET$nestedCommandBufferRendering, value);}
	public java.lang.foreign.MemorySegment nestedCommandBufferRendering_ptr() {return this.ptr.asSlice(OFFSET$nestedCommandBufferRendering, LAYOUT$nestedCommandBufferRendering);}

	public int nestedCommandBufferSimultaneousUse() {return this.ptr.get(LAYOUT$nestedCommandBufferSimultaneousUse, OFFSET$nestedCommandBufferSimultaneousUse);}
	public void nestedCommandBufferSimultaneousUse(int value) {this.ptr.set(LAYOUT$nestedCommandBufferSimultaneousUse, OFFSET$nestedCommandBufferSimultaneousUse, value);}
	public java.lang.foreign.MemorySegment nestedCommandBufferSimultaneousUse_ptr() {return this.ptr.asSlice(OFFSET$nestedCommandBufferSimultaneousUse, LAYOUT$nestedCommandBufferSimultaneousUse);}
}

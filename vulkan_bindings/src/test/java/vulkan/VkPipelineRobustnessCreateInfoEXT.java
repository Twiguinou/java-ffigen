package vulkan;

public record VkPipelineRobustnessCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$storageBuffers = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$uniformBuffers = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexInputs = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexInputs = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$images = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$images = 28L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$storageBuffers,
			LAYOUT$uniformBuffers,
			LAYOUT$vertexInputs,
			LAYOUT$images
	).withName("VkPipelineRobustnessCreateInfoEXT");

	public VkPipelineRobustnessCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int storageBuffers() {return this.ptr.get(LAYOUT$storageBuffers, OFFSET$storageBuffers);}
	public void storageBuffers(int value) {this.ptr.set(LAYOUT$storageBuffers, OFFSET$storageBuffers, value);}
	public java.lang.foreign.MemorySegment storageBuffers_ptr() {return this.ptr.asSlice(OFFSET$storageBuffers, LAYOUT$storageBuffers);}

	public int uniformBuffers() {return this.ptr.get(LAYOUT$uniformBuffers, OFFSET$uniformBuffers);}
	public void uniformBuffers(int value) {this.ptr.set(LAYOUT$uniformBuffers, OFFSET$uniformBuffers, value);}
	public java.lang.foreign.MemorySegment uniformBuffers_ptr() {return this.ptr.asSlice(OFFSET$uniformBuffers, LAYOUT$uniformBuffers);}

	public int vertexInputs() {return this.ptr.get(LAYOUT$vertexInputs, OFFSET$vertexInputs);}
	public void vertexInputs(int value) {this.ptr.set(LAYOUT$vertexInputs, OFFSET$vertexInputs, value);}
	public java.lang.foreign.MemorySegment vertexInputs_ptr() {return this.ptr.asSlice(OFFSET$vertexInputs, LAYOUT$vertexInputs);}

	public int images() {return this.ptr.get(LAYOUT$images, OFFSET$images);}
	public void images(int value) {this.ptr.set(LAYOUT$images, OFFSET$images, value);}
	public java.lang.foreign.MemorySegment images_ptr() {return this.ptr.asSlice(OFFSET$images, LAYOUT$images);}
}

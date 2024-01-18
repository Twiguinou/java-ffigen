package vulkan;

public record VkPipelineInputAssemblyStateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$topology = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$topology = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$primitiveRestartEnable = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$primitiveRestartEnable = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$topology,
			LAYOUT$primitiveRestartEnable,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPipelineInputAssemblyStateCreateInfo");

	public VkPipelineInputAssemblyStateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
	public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
	public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

	public int topology() {return this.ptr.get(LAYOUT$topology, OFFSET$topology);}
	public void topology(int value) {this.ptr.set(LAYOUT$topology, OFFSET$topology, value);}
	public java.lang.foreign.MemorySegment topology_ptr() {return this.ptr.asSlice(OFFSET$topology, LAYOUT$topology);}

	public int primitiveRestartEnable() {return this.ptr.get(LAYOUT$primitiveRestartEnable, OFFSET$primitiveRestartEnable);}
	public void primitiveRestartEnable(int value) {this.ptr.set(LAYOUT$primitiveRestartEnable, OFFSET$primitiveRestartEnable, value);}
	public java.lang.foreign.MemorySegment primitiveRestartEnable_ptr() {return this.ptr.asSlice(OFFSET$primitiveRestartEnable, LAYOUT$primitiveRestartEnable);}
}

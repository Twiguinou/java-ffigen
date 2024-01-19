package vulkan;

public record VkDescriptorPoolCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxSets = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$maxSets = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$poolSizeCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$poolSizeCount = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pPoolSizes = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pPoolSizes = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$maxSets,
			LAYOUT$poolSizeCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pPoolSizes
	).withName("VkDescriptorPoolCreateInfo");

	public VkDescriptorPoolCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public int maxSets() {return this.ptr.get(LAYOUT$maxSets, OFFSET$maxSets);}
	public void maxSets(int value) {this.ptr.set(LAYOUT$maxSets, OFFSET$maxSets, value);}
	public java.lang.foreign.MemorySegment maxSets_ptr() {return this.ptr.asSlice(OFFSET$maxSets, LAYOUT$maxSets);}

	public int poolSizeCount() {return this.ptr.get(LAYOUT$poolSizeCount, OFFSET$poolSizeCount);}
	public void poolSizeCount(int value) {this.ptr.set(LAYOUT$poolSizeCount, OFFSET$poolSizeCount, value);}
	public java.lang.foreign.MemorySegment poolSizeCount_ptr() {return this.ptr.asSlice(OFFSET$poolSizeCount, LAYOUT$poolSizeCount);}

	public java.lang.foreign.MemorySegment pPoolSizes() {return this.ptr.get(LAYOUT$pPoolSizes, OFFSET$pPoolSizes);}
	public void pPoolSizes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPoolSizes, OFFSET$pPoolSizes, value);}
	public java.lang.foreign.MemorySegment pPoolSizes_ptr() {return this.ptr.asSlice(OFFSET$pPoolSizes, LAYOUT$pPoolSizes);}
}

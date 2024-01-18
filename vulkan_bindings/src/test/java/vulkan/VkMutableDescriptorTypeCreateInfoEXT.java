package vulkan;

public record VkMutableDescriptorTypeCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$mutableDescriptorTypeListCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$mutableDescriptorTypeListCount = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pMutableDescriptorTypeLists = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pMutableDescriptorTypeLists = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$mutableDescriptorTypeListCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pMutableDescriptorTypeLists
	).withName("VkMutableDescriptorTypeCreateInfoEXT");

	public VkMutableDescriptorTypeCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int mutableDescriptorTypeListCount() {return this.ptr.get(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount);}
	public void mutableDescriptorTypeListCount(int value) {this.ptr.set(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount, value);}
	public java.lang.foreign.MemorySegment mutableDescriptorTypeListCount_ptr() {return this.ptr.asSlice(OFFSET$mutableDescriptorTypeListCount, LAYOUT$mutableDescriptorTypeListCount);}

	public java.lang.foreign.MemorySegment pMutableDescriptorTypeLists() {return this.ptr.get(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists);}
	public void pMutableDescriptorTypeLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists, value);}
	public java.lang.foreign.MemorySegment pMutableDescriptorTypeLists_ptr() {return this.ptr.asSlice(OFFSET$pMutableDescriptorTypeLists, LAYOUT$pMutableDescriptorTypeLists);}
}

package vulkan;

public record VkDescriptorSetBindingReferenceVALVE(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.AddressLayout LAYOUT$descriptorSetLayout = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$descriptorSetLayout = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$binding = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$binding = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$descriptorSetLayout,
			LAYOUT$binding,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDescriptorSetBindingReferenceVALVE");

	public VkDescriptorSetBindingReferenceVALVE(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public java.lang.foreign.MemorySegment descriptorSetLayout() {return this.ptr.get(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout);}
	public void descriptorSetLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout, value);}
	public java.lang.foreign.MemorySegment descriptorSetLayout_ptr() {return this.ptr.asSlice(OFFSET$descriptorSetLayout, LAYOUT$descriptorSetLayout);}

	public int binding() {return this.ptr.get(LAYOUT$binding, OFFSET$binding);}
	public void binding(int value) {this.ptr.set(LAYOUT$binding, OFFSET$binding, value);}
	public java.lang.foreign.MemorySegment binding_ptr() {return this.ptr.asSlice(OFFSET$binding, LAYOUT$binding);}
}

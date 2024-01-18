package vulkan;

public record VkDescriptorUpdateTemplateCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorUpdateEntryCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorUpdateEntryCount = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDescriptorUpdateEntries = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDescriptorUpdateEntries = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$templateType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$templateType = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$descriptorSetLayout = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$descriptorSetLayout = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pipelineBindPoint = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pipelineBindPoint = 48L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pipelineLayout = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pipelineLayout = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$set = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$set = 64L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$descriptorUpdateEntryCount,
			LAYOUT$pDescriptorUpdateEntries,
			LAYOUT$templateType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$descriptorSetLayout,
			LAYOUT$pipelineBindPoint,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pipelineLayout,
			LAYOUT$set,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkDescriptorUpdateTemplateCreateInfo");

	public VkDescriptorUpdateTemplateCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public int descriptorUpdateEntryCount() {return this.ptr.get(LAYOUT$descriptorUpdateEntryCount, OFFSET$descriptorUpdateEntryCount);}
	public void descriptorUpdateEntryCount(int value) {this.ptr.set(LAYOUT$descriptorUpdateEntryCount, OFFSET$descriptorUpdateEntryCount, value);}
	public java.lang.foreign.MemorySegment descriptorUpdateEntryCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorUpdateEntryCount, LAYOUT$descriptorUpdateEntryCount);}

	public java.lang.foreign.MemorySegment pDescriptorUpdateEntries() {return this.ptr.get(LAYOUT$pDescriptorUpdateEntries, OFFSET$pDescriptorUpdateEntries);}
	public void pDescriptorUpdateEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDescriptorUpdateEntries, OFFSET$pDescriptorUpdateEntries, value);}
	public java.lang.foreign.MemorySegment pDescriptorUpdateEntries_ptr() {return this.ptr.asSlice(OFFSET$pDescriptorUpdateEntries, LAYOUT$pDescriptorUpdateEntries);}

	public int templateType() {return this.ptr.get(LAYOUT$templateType, OFFSET$templateType);}
	public void templateType(int value) {this.ptr.set(LAYOUT$templateType, OFFSET$templateType, value);}
	public java.lang.foreign.MemorySegment templateType_ptr() {return this.ptr.asSlice(OFFSET$templateType, LAYOUT$templateType);}

	public java.lang.foreign.MemorySegment descriptorSetLayout() {return this.ptr.get(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout);}
	public void descriptorSetLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout, value);}
	public java.lang.foreign.MemorySegment descriptorSetLayout_ptr() {return this.ptr.asSlice(OFFSET$descriptorSetLayout, LAYOUT$descriptorSetLayout);}

	public int pipelineBindPoint() {return this.ptr.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);}
	public void pipelineBindPoint(int value) {this.ptr.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);}
	public java.lang.foreign.MemorySegment pipelineBindPoint_ptr() {return this.ptr.asSlice(OFFSET$pipelineBindPoint, LAYOUT$pipelineBindPoint);}

	public java.lang.foreign.MemorySegment pipelineLayout() {return this.ptr.get(LAYOUT$pipelineLayout, OFFSET$pipelineLayout);}
	public void pipelineLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pipelineLayout, OFFSET$pipelineLayout, value);}
	public java.lang.foreign.MemorySegment pipelineLayout_ptr() {return this.ptr.asSlice(OFFSET$pipelineLayout, LAYOUT$pipelineLayout);}

	public int set() {return this.ptr.get(LAYOUT$set, OFFSET$set);}
	public void set(int value) {this.ptr.set(LAYOUT$set, OFFSET$set, value);}
	public java.lang.foreign.MemorySegment set_ptr() {return this.ptr.asSlice(OFFSET$set, LAYOUT$set);}
}

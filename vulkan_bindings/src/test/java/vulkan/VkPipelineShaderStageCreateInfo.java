package vulkan;

public record VkPipelineShaderStageCreateInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$flags = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stage = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stage = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$module = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$module = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pName = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pName = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSpecializationInfo = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSpecializationInfo = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$flags,
			LAYOUT$stage,
			LAYOUT$module,
			LAYOUT$pName,
			LAYOUT$pSpecializationInfo
	).withName("VkPipelineShaderStageCreateInfo");

	public VkPipelineShaderStageCreateInfo(java.lang.foreign.SegmentAllocator allocator)
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

	public int stage() {return this.ptr.get(LAYOUT$stage, OFFSET$stage);}
	public void stage(int value) {this.ptr.set(LAYOUT$stage, OFFSET$stage, value);}
	public java.lang.foreign.MemorySegment stage_ptr() {return this.ptr.asSlice(OFFSET$stage, LAYOUT$stage);}

	public java.lang.foreign.MemorySegment module() {return this.ptr.get(LAYOUT$module, OFFSET$module);}
	public void module(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$module, OFFSET$module, value);}
	public java.lang.foreign.MemorySegment module_ptr() {return this.ptr.asSlice(OFFSET$module, LAYOUT$module);}

	public java.lang.foreign.MemorySegment pName() {return this.ptr.get(LAYOUT$pName, OFFSET$pName);}
	public void pName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pName, OFFSET$pName, value);}
	public java.lang.foreign.MemorySegment pName_ptr() {return this.ptr.asSlice(OFFSET$pName, LAYOUT$pName);}

	public java.lang.foreign.MemorySegment pSpecializationInfo() {return this.ptr.get(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo);}
	public void pSpecializationInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo, value);}
	public java.lang.foreign.MemorySegment pSpecializationInfo_ptr() {return this.ptr.asSlice(OFFSET$pSpecializationInfo, LAYOUT$pSpecializationInfo);}
}

package vulkan;

public record VkIndirectCommandsLayoutTokenNV(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$tokenType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$tokenType = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stream = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$stream = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$offset = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexBindingUnit = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexBindingUnit = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vertexDynamicStride = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vertexDynamicStride = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pushconstantPipelineLayout = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pushconstantPipelineLayout = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pushconstantShaderStageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pushconstantShaderStageFlags = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pushconstantOffset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pushconstantOffset = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pushconstantSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pushconstantSize = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indirectStateFlags = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$indirectStateFlags = 60L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$indexTypeCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$indexTypeCount = 64L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pIndexTypes = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pIndexTypes = 72L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pIndexTypeValues = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pIndexTypeValues = 80L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$tokenType,
			LAYOUT$stream,
			LAYOUT$offset,
			LAYOUT$vertexBindingUnit,
			LAYOUT$vertexDynamicStride,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pushconstantPipelineLayout,
			LAYOUT$pushconstantShaderStageFlags,
			LAYOUT$pushconstantOffset,
			LAYOUT$pushconstantSize,
			LAYOUT$indirectStateFlags,
			LAYOUT$indexTypeCount,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pIndexTypes,
			LAYOUT$pIndexTypeValues
	).withName("VkIndirectCommandsLayoutTokenNV");

	public VkIndirectCommandsLayoutTokenNV(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int tokenType() {return this.ptr.get(LAYOUT$tokenType, OFFSET$tokenType);}
	public void tokenType(int value) {this.ptr.set(LAYOUT$tokenType, OFFSET$tokenType, value);}
	public java.lang.foreign.MemorySegment tokenType_ptr() {return this.ptr.asSlice(OFFSET$tokenType, LAYOUT$tokenType);}

	public int stream() {return this.ptr.get(LAYOUT$stream, OFFSET$stream);}
	public void stream(int value) {this.ptr.set(LAYOUT$stream, OFFSET$stream, value);}
	public java.lang.foreign.MemorySegment stream_ptr() {return this.ptr.asSlice(OFFSET$stream, LAYOUT$stream);}

	public int offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
	public void offset(int value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
	public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

	public int vertexBindingUnit() {return this.ptr.get(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit);}
	public void vertexBindingUnit(int value) {this.ptr.set(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit, value);}
	public java.lang.foreign.MemorySegment vertexBindingUnit_ptr() {return this.ptr.asSlice(OFFSET$vertexBindingUnit, LAYOUT$vertexBindingUnit);}

	public int vertexDynamicStride() {return this.ptr.get(LAYOUT$vertexDynamicStride, OFFSET$vertexDynamicStride);}
	public void vertexDynamicStride(int value) {this.ptr.set(LAYOUT$vertexDynamicStride, OFFSET$vertexDynamicStride, value);}
	public java.lang.foreign.MemorySegment vertexDynamicStride_ptr() {return this.ptr.asSlice(OFFSET$vertexDynamicStride, LAYOUT$vertexDynamicStride);}

	public java.lang.foreign.MemorySegment pushconstantPipelineLayout() {return this.ptr.get(LAYOUT$pushconstantPipelineLayout, OFFSET$pushconstantPipelineLayout);}
	public void pushconstantPipelineLayout(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pushconstantPipelineLayout, OFFSET$pushconstantPipelineLayout, value);}
	public java.lang.foreign.MemorySegment pushconstantPipelineLayout_ptr() {return this.ptr.asSlice(OFFSET$pushconstantPipelineLayout, LAYOUT$pushconstantPipelineLayout);}

	public int pushconstantShaderStageFlags() {return this.ptr.get(LAYOUT$pushconstantShaderStageFlags, OFFSET$pushconstantShaderStageFlags);}
	public void pushconstantShaderStageFlags(int value) {this.ptr.set(LAYOUT$pushconstantShaderStageFlags, OFFSET$pushconstantShaderStageFlags, value);}
	public java.lang.foreign.MemorySegment pushconstantShaderStageFlags_ptr() {return this.ptr.asSlice(OFFSET$pushconstantShaderStageFlags, LAYOUT$pushconstantShaderStageFlags);}

	public int pushconstantOffset() {return this.ptr.get(LAYOUT$pushconstantOffset, OFFSET$pushconstantOffset);}
	public void pushconstantOffset(int value) {this.ptr.set(LAYOUT$pushconstantOffset, OFFSET$pushconstantOffset, value);}
	public java.lang.foreign.MemorySegment pushconstantOffset_ptr() {return this.ptr.asSlice(OFFSET$pushconstantOffset, LAYOUT$pushconstantOffset);}

	public int pushconstantSize() {return this.ptr.get(LAYOUT$pushconstantSize, OFFSET$pushconstantSize);}
	public void pushconstantSize(int value) {this.ptr.set(LAYOUT$pushconstantSize, OFFSET$pushconstantSize, value);}
	public java.lang.foreign.MemorySegment pushconstantSize_ptr() {return this.ptr.asSlice(OFFSET$pushconstantSize, LAYOUT$pushconstantSize);}

	public int indirectStateFlags() {return this.ptr.get(LAYOUT$indirectStateFlags, OFFSET$indirectStateFlags);}
	public void indirectStateFlags(int value) {this.ptr.set(LAYOUT$indirectStateFlags, OFFSET$indirectStateFlags, value);}
	public java.lang.foreign.MemorySegment indirectStateFlags_ptr() {return this.ptr.asSlice(OFFSET$indirectStateFlags, LAYOUT$indirectStateFlags);}

	public int indexTypeCount() {return this.ptr.get(LAYOUT$indexTypeCount, OFFSET$indexTypeCount);}
	public void indexTypeCount(int value) {this.ptr.set(LAYOUT$indexTypeCount, OFFSET$indexTypeCount, value);}
	public java.lang.foreign.MemorySegment indexTypeCount_ptr() {return this.ptr.asSlice(OFFSET$indexTypeCount, LAYOUT$indexTypeCount);}

	public java.lang.foreign.MemorySegment pIndexTypes() {return this.ptr.get(LAYOUT$pIndexTypes, OFFSET$pIndexTypes);}
	public void pIndexTypes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pIndexTypes, OFFSET$pIndexTypes, value);}
	public java.lang.foreign.MemorySegment pIndexTypes_ptr() {return this.ptr.asSlice(OFFSET$pIndexTypes, LAYOUT$pIndexTypes);}

	public java.lang.foreign.MemorySegment pIndexTypeValues() {return this.ptr.get(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues);}
	public void pIndexTypeValues(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues, value);}
	public java.lang.foreign.MemorySegment pIndexTypeValues_ptr() {return this.ptr.asSlice(OFFSET$pIndexTypeValues, LAYOUT$pIndexTypeValues);}
}

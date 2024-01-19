package vulkan;

public record VkExternalFenceProperties(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$exportFromImportedHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$exportFromImportedHandleTypes = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$compatibleHandleTypes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$compatibleHandleTypes = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$externalFenceFeatures = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$externalFenceFeatures = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$exportFromImportedHandleTypes,
			LAYOUT$compatibleHandleTypes,
			LAYOUT$externalFenceFeatures,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkExternalFenceProperties");

	public VkExternalFenceProperties(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int exportFromImportedHandleTypes() {return this.ptr.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);}
	public void exportFromImportedHandleTypes(int value) {this.ptr.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);}
	public java.lang.foreign.MemorySegment exportFromImportedHandleTypes_ptr() {return this.ptr.asSlice(OFFSET$exportFromImportedHandleTypes, LAYOUT$exportFromImportedHandleTypes);}

	public int compatibleHandleTypes() {return this.ptr.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);}
	public void compatibleHandleTypes(int value) {this.ptr.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);}
	public java.lang.foreign.MemorySegment compatibleHandleTypes_ptr() {return this.ptr.asSlice(OFFSET$compatibleHandleTypes, LAYOUT$compatibleHandleTypes);}

	public int externalFenceFeatures() {return this.ptr.get(LAYOUT$externalFenceFeatures, OFFSET$externalFenceFeatures);}
	public void externalFenceFeatures(int value) {this.ptr.set(LAYOUT$externalFenceFeatures, OFFSET$externalFenceFeatures, value);}
	public java.lang.foreign.MemorySegment externalFenceFeatures_ptr() {return this.ptr.asSlice(OFFSET$externalFenceFeatures, LAYOUT$externalFenceFeatures);}
}

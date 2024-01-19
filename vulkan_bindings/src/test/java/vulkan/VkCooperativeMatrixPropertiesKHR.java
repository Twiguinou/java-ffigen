package vulkan;

public record VkCooperativeMatrixPropertiesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$MSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$MSize = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$NSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$NSize = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$KSize = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$KSize = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$AType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$AType = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$BType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$BType = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$CType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$CType = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$ResultType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$ResultType = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$saturatingAccumulation = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$saturatingAccumulation = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$scope = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$scope = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$MSize,
			LAYOUT$NSize,
			LAYOUT$KSize,
			LAYOUT$AType,
			LAYOUT$BType,
			LAYOUT$CType,
			LAYOUT$ResultType,
			LAYOUT$saturatingAccumulation,
			LAYOUT$scope,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkCooperativeMatrixPropertiesKHR");

	public VkCooperativeMatrixPropertiesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int MSize() {return this.ptr.get(LAYOUT$MSize, OFFSET$MSize);}
	public void MSize(int value) {this.ptr.set(LAYOUT$MSize, OFFSET$MSize, value);}
	public java.lang.foreign.MemorySegment MSize_ptr() {return this.ptr.asSlice(OFFSET$MSize, LAYOUT$MSize);}

	public int NSize() {return this.ptr.get(LAYOUT$NSize, OFFSET$NSize);}
	public void NSize(int value) {this.ptr.set(LAYOUT$NSize, OFFSET$NSize, value);}
	public java.lang.foreign.MemorySegment NSize_ptr() {return this.ptr.asSlice(OFFSET$NSize, LAYOUT$NSize);}

	public int KSize() {return this.ptr.get(LAYOUT$KSize, OFFSET$KSize);}
	public void KSize(int value) {this.ptr.set(LAYOUT$KSize, OFFSET$KSize, value);}
	public java.lang.foreign.MemorySegment KSize_ptr() {return this.ptr.asSlice(OFFSET$KSize, LAYOUT$KSize);}

	public int AType() {return this.ptr.get(LAYOUT$AType, OFFSET$AType);}
	public void AType(int value) {this.ptr.set(LAYOUT$AType, OFFSET$AType, value);}
	public java.lang.foreign.MemorySegment AType_ptr() {return this.ptr.asSlice(OFFSET$AType, LAYOUT$AType);}

	public int BType() {return this.ptr.get(LAYOUT$BType, OFFSET$BType);}
	public void BType(int value) {this.ptr.set(LAYOUT$BType, OFFSET$BType, value);}
	public java.lang.foreign.MemorySegment BType_ptr() {return this.ptr.asSlice(OFFSET$BType, LAYOUT$BType);}

	public int CType() {return this.ptr.get(LAYOUT$CType, OFFSET$CType);}
	public void CType(int value) {this.ptr.set(LAYOUT$CType, OFFSET$CType, value);}
	public java.lang.foreign.MemorySegment CType_ptr() {return this.ptr.asSlice(OFFSET$CType, LAYOUT$CType);}

	public int ResultType() {return this.ptr.get(LAYOUT$ResultType, OFFSET$ResultType);}
	public void ResultType(int value) {this.ptr.set(LAYOUT$ResultType, OFFSET$ResultType, value);}
	public java.lang.foreign.MemorySegment ResultType_ptr() {return this.ptr.asSlice(OFFSET$ResultType, LAYOUT$ResultType);}

	public int saturatingAccumulation() {return this.ptr.get(LAYOUT$saturatingAccumulation, OFFSET$saturatingAccumulation);}
	public void saturatingAccumulation(int value) {this.ptr.set(LAYOUT$saturatingAccumulation, OFFSET$saturatingAccumulation, value);}
	public java.lang.foreign.MemorySegment saturatingAccumulation_ptr() {return this.ptr.asSlice(OFFSET$saturatingAccumulation, LAYOUT$saturatingAccumulation);}

	public int scope() {return this.ptr.get(LAYOUT$scope, OFFSET$scope);}
	public void scope(int value) {this.ptr.set(LAYOUT$scope, OFFSET$scope, value);}
	public java.lang.foreign.MemorySegment scope_ptr() {return this.ptr.asSlice(OFFSET$scope, LAYOUT$scope);}
}

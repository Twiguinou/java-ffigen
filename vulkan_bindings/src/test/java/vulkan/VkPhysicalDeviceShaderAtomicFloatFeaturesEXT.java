package vulkan;

public record VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderBufferFloat32Atomics = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderBufferFloat32AtomicAdd = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderBufferFloat64Atomics = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferFloat64AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderBufferFloat64AtomicAdd = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSharedFloat32Atomics = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSharedFloat32AtomicAdd = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSharedFloat64Atomics = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedFloat64AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSharedFloat64AtomicAdd = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderImageFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderImageFloat32Atomics = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderImageFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderImageFloat32AtomicAdd = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseImageFloat32Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseImageFloat32Atomics = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sparseImageFloat32AtomicAdd = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sparseImageFloat32AtomicAdd = 60L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$shaderBufferFloat32Atomics,
			LAYOUT$shaderBufferFloat32AtomicAdd,
			LAYOUT$shaderBufferFloat64Atomics,
			LAYOUT$shaderBufferFloat64AtomicAdd,
			LAYOUT$shaderSharedFloat32Atomics,
			LAYOUT$shaderSharedFloat32AtomicAdd,
			LAYOUT$shaderSharedFloat64Atomics,
			LAYOUT$shaderSharedFloat64AtomicAdd,
			LAYOUT$shaderImageFloat32Atomics,
			LAYOUT$shaderImageFloat32AtomicAdd,
			LAYOUT$sparseImageFloat32Atomics,
			LAYOUT$sparseImageFloat32AtomicAdd
	).withName("VkPhysicalDeviceShaderAtomicFloatFeaturesEXT");

	public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int shaderBufferFloat32Atomics() {return this.ptr.get(LAYOUT$shaderBufferFloat32Atomics, OFFSET$shaderBufferFloat32Atomics);}
	public void shaderBufferFloat32Atomics(int value) {this.ptr.set(LAYOUT$shaderBufferFloat32Atomics, OFFSET$shaderBufferFloat32Atomics, value);}
	public java.lang.foreign.MemorySegment shaderBufferFloat32Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat32Atomics, LAYOUT$shaderBufferFloat32Atomics);}

	public int shaderBufferFloat32AtomicAdd() {return this.ptr.get(LAYOUT$shaderBufferFloat32AtomicAdd, OFFSET$shaderBufferFloat32AtomicAdd);}
	public void shaderBufferFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT$shaderBufferFloat32AtomicAdd, OFFSET$shaderBufferFloat32AtomicAdd, value);}
	public java.lang.foreign.MemorySegment shaderBufferFloat32AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat32AtomicAdd, LAYOUT$shaderBufferFloat32AtomicAdd);}

	public int shaderBufferFloat64Atomics() {return this.ptr.get(LAYOUT$shaderBufferFloat64Atomics, OFFSET$shaderBufferFloat64Atomics);}
	public void shaderBufferFloat64Atomics(int value) {this.ptr.set(LAYOUT$shaderBufferFloat64Atomics, OFFSET$shaderBufferFloat64Atomics, value);}
	public java.lang.foreign.MemorySegment shaderBufferFloat64Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat64Atomics, LAYOUT$shaderBufferFloat64Atomics);}

	public int shaderBufferFloat64AtomicAdd() {return this.ptr.get(LAYOUT$shaderBufferFloat64AtomicAdd, OFFSET$shaderBufferFloat64AtomicAdd);}
	public void shaderBufferFloat64AtomicAdd(int value) {this.ptr.set(LAYOUT$shaderBufferFloat64AtomicAdd, OFFSET$shaderBufferFloat64AtomicAdd, value);}
	public java.lang.foreign.MemorySegment shaderBufferFloat64AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferFloat64AtomicAdd, LAYOUT$shaderBufferFloat64AtomicAdd);}

	public int shaderSharedFloat32Atomics() {return this.ptr.get(LAYOUT$shaderSharedFloat32Atomics, OFFSET$shaderSharedFloat32Atomics);}
	public void shaderSharedFloat32Atomics(int value) {this.ptr.set(LAYOUT$shaderSharedFloat32Atomics, OFFSET$shaderSharedFloat32Atomics, value);}
	public java.lang.foreign.MemorySegment shaderSharedFloat32Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat32Atomics, LAYOUT$shaderSharedFloat32Atomics);}

	public int shaderSharedFloat32AtomicAdd() {return this.ptr.get(LAYOUT$shaderSharedFloat32AtomicAdd, OFFSET$shaderSharedFloat32AtomicAdd);}
	public void shaderSharedFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT$shaderSharedFloat32AtomicAdd, OFFSET$shaderSharedFloat32AtomicAdd, value);}
	public java.lang.foreign.MemorySegment shaderSharedFloat32AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat32AtomicAdd, LAYOUT$shaderSharedFloat32AtomicAdd);}

	public int shaderSharedFloat64Atomics() {return this.ptr.get(LAYOUT$shaderSharedFloat64Atomics, OFFSET$shaderSharedFloat64Atomics);}
	public void shaderSharedFloat64Atomics(int value) {this.ptr.set(LAYOUT$shaderSharedFloat64Atomics, OFFSET$shaderSharedFloat64Atomics, value);}
	public java.lang.foreign.MemorySegment shaderSharedFloat64Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat64Atomics, LAYOUT$shaderSharedFloat64Atomics);}

	public int shaderSharedFloat64AtomicAdd() {return this.ptr.get(LAYOUT$shaderSharedFloat64AtomicAdd, OFFSET$shaderSharedFloat64AtomicAdd);}
	public void shaderSharedFloat64AtomicAdd(int value) {this.ptr.set(LAYOUT$shaderSharedFloat64AtomicAdd, OFFSET$shaderSharedFloat64AtomicAdd, value);}
	public java.lang.foreign.MemorySegment shaderSharedFloat64AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedFloat64AtomicAdd, LAYOUT$shaderSharedFloat64AtomicAdd);}

	public int shaderImageFloat32Atomics() {return this.ptr.get(LAYOUT$shaderImageFloat32Atomics, OFFSET$shaderImageFloat32Atomics);}
	public void shaderImageFloat32Atomics(int value) {this.ptr.set(LAYOUT$shaderImageFloat32Atomics, OFFSET$shaderImageFloat32Atomics, value);}
	public java.lang.foreign.MemorySegment shaderImageFloat32Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderImageFloat32Atomics, LAYOUT$shaderImageFloat32Atomics);}

	public int shaderImageFloat32AtomicAdd() {return this.ptr.get(LAYOUT$shaderImageFloat32AtomicAdd, OFFSET$shaderImageFloat32AtomicAdd);}
	public void shaderImageFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT$shaderImageFloat32AtomicAdd, OFFSET$shaderImageFloat32AtomicAdd, value);}
	public java.lang.foreign.MemorySegment shaderImageFloat32AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$shaderImageFloat32AtomicAdd, LAYOUT$shaderImageFloat32AtomicAdd);}

	public int sparseImageFloat32Atomics() {return this.ptr.get(LAYOUT$sparseImageFloat32Atomics, OFFSET$sparseImageFloat32Atomics);}
	public void sparseImageFloat32Atomics(int value) {this.ptr.set(LAYOUT$sparseImageFloat32Atomics, OFFSET$sparseImageFloat32Atomics, value);}
	public java.lang.foreign.MemorySegment sparseImageFloat32Atomics_ptr() {return this.ptr.asSlice(OFFSET$sparseImageFloat32Atomics, LAYOUT$sparseImageFloat32Atomics);}

	public int sparseImageFloat32AtomicAdd() {return this.ptr.get(LAYOUT$sparseImageFloat32AtomicAdd, OFFSET$sparseImageFloat32AtomicAdd);}
	public void sparseImageFloat32AtomicAdd(int value) {this.ptr.set(LAYOUT$sparseImageFloat32AtomicAdd, OFFSET$sparseImageFloat32AtomicAdd, value);}
	public java.lang.foreign.MemorySegment sparseImageFloat32AtomicAdd_ptr() {return this.ptr.asSlice(OFFSET$sparseImageFloat32AtomicAdd, LAYOUT$sparseImageFloat32AtomicAdd);}
}

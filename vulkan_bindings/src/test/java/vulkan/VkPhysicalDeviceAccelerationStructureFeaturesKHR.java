package vulkan;

public record VkPhysicalDeviceAccelerationStructureFeaturesKHR(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$accelerationStructure = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$accelerationStructure = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$accelerationStructureCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$accelerationStructureCaptureReplay = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$accelerationStructureIndirectBuild = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$accelerationStructureIndirectBuild = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$accelerationStructureHostCommands = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$accelerationStructureHostCommands = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$accelerationStructure,
			LAYOUT$accelerationStructureCaptureReplay,
			LAYOUT$accelerationStructureIndirectBuild,
			LAYOUT$accelerationStructureHostCommands,
			LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceAccelerationStructureFeaturesKHR");

	public VkPhysicalDeviceAccelerationStructureFeaturesKHR(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int accelerationStructure() {return this.ptr.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);}
	public void accelerationStructure(int value) {this.ptr.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);}
	public java.lang.foreign.MemorySegment accelerationStructure_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructure, LAYOUT$accelerationStructure);}

	public int accelerationStructureCaptureReplay() {return this.ptr.get(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay);}
	public void accelerationStructureCaptureReplay(int value) {this.ptr.set(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay, value);}
	public java.lang.foreign.MemorySegment accelerationStructureCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureCaptureReplay, LAYOUT$accelerationStructureCaptureReplay);}

	public int accelerationStructureIndirectBuild() {return this.ptr.get(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild);}
	public void accelerationStructureIndirectBuild(int value) {this.ptr.set(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild, value);}
	public java.lang.foreign.MemorySegment accelerationStructureIndirectBuild_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureIndirectBuild, LAYOUT$accelerationStructureIndirectBuild);}

	public int accelerationStructureHostCommands() {return this.ptr.get(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands);}
	public void accelerationStructureHostCommands(int value) {this.ptr.set(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands, value);}
	public java.lang.foreign.MemorySegment accelerationStructureHostCommands_ptr() {return this.ptr.asSlice(OFFSET$accelerationStructureHostCommands, LAYOUT$accelerationStructureHostCommands);}

	public int descriptorBindingAccelerationStructureUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind);}
	public void descriptorBindingAccelerationStructureUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingAccelerationStructureUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind, LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind);}
}

package vulkan;

public record VkPhysicalDeviceVulkan12Features(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$sType = 0L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pNext = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$samplerMirrorClampToEdge = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$samplerMirrorClampToEdge = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$drawIndirectCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$drawIndirectCount = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$storageBuffer8BitAccess = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformAndStorageBuffer8BitAccess = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$uniformAndStorageBuffer8BitAccess = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$storagePushConstant8 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$storagePushConstant8 = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderBufferInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderBufferInt64Atomics = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSharedInt64Atomics = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSharedInt64Atomics = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderFloat16 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderFloat16 = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInt8 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderInt8 = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorIndexing = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInputAttachmentArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderInputAttachmentArrayDynamicIndexing = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderUniformTexelBufferArrayDynamicIndexing = 60L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageTexelBufferArrayDynamicIndexing = 64L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderUniformBufferArrayNonUniformIndexing = 68L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSampledImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSampledImageArrayNonUniformIndexing = 72L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageBufferArrayNonUniformIndexing = 76L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageImageArrayNonUniformIndexing = 80L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInputAttachmentArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderInputAttachmentArrayNonUniformIndexing = 84L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing = 88L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing = 92L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingUniformBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingUniformBufferUpdateAfterBind = 96L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingSampledImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingSampledImageUpdateAfterBind = 100L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingStorageImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingStorageImageUpdateAfterBind = 104L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingStorageBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingStorageBufferUpdateAfterBind = 108L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind = 112L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind = 116L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingUpdateUnusedWhilePending = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingUpdateUnusedWhilePending = 120L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingPartiallyBound = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingPartiallyBound = 124L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingVariableDescriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$descriptorBindingVariableDescriptorCount = 128L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$runtimeDescriptorArray = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$runtimeDescriptorArray = 132L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$samplerFilterMinmax = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$samplerFilterMinmax = 136L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$scalarBlockLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$scalarBlockLayout = 140L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imagelessFramebuffer = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$imagelessFramebuffer = 144L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uniformBufferStandardLayout = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$uniformBufferStandardLayout = 148L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSubgroupExtendedTypes = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderSubgroupExtendedTypes = 152L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$separateDepthStencilLayouts = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$separateDepthStencilLayouts = 156L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$hostQueryReset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$hostQueryReset = 160L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$timelineSemaphore = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$timelineSemaphore = 164L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferDeviceAddress = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$bufferDeviceAddress = 168L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferDeviceAddressCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$bufferDeviceAddressCaptureReplay = 172L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bufferDeviceAddressMultiDevice = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$bufferDeviceAddressMultiDevice = 176L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vulkanMemoryModel = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vulkanMemoryModel = 180L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vulkanMemoryModelDeviceScope = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vulkanMemoryModelDeviceScope = 184L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vulkanMemoryModelAvailabilityVisibilityChains = 188L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderOutputViewportIndex = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderOutputViewportIndex = 192L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderOutputLayer = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$shaderOutputLayer = 196L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupBroadcastDynamicId = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$subgroupBroadcastDynamicId = 200L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$sType,
			java.lang.foreign.MemoryLayout.paddingLayout(4),
			LAYOUT$pNext,
			LAYOUT$samplerMirrorClampToEdge,
			LAYOUT$drawIndirectCount,
			LAYOUT$storageBuffer8BitAccess,
			LAYOUT$uniformAndStorageBuffer8BitAccess,
			LAYOUT$storagePushConstant8,
			LAYOUT$shaderBufferInt64Atomics,
			LAYOUT$shaderSharedInt64Atomics,
			LAYOUT$shaderFloat16,
			LAYOUT$shaderInt8,
			LAYOUT$descriptorIndexing,
			LAYOUT$shaderInputAttachmentArrayDynamicIndexing,
			LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing,
			LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing,
			LAYOUT$shaderUniformBufferArrayNonUniformIndexing,
			LAYOUT$shaderSampledImageArrayNonUniformIndexing,
			LAYOUT$shaderStorageBufferArrayNonUniformIndexing,
			LAYOUT$shaderStorageImageArrayNonUniformIndexing,
			LAYOUT$shaderInputAttachmentArrayNonUniformIndexing,
			LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing,
			LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing,
			LAYOUT$descriptorBindingUniformBufferUpdateAfterBind,
			LAYOUT$descriptorBindingSampledImageUpdateAfterBind,
			LAYOUT$descriptorBindingStorageImageUpdateAfterBind,
			LAYOUT$descriptorBindingStorageBufferUpdateAfterBind,
			LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind,
			LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind,
			LAYOUT$descriptorBindingUpdateUnusedWhilePending,
			LAYOUT$descriptorBindingPartiallyBound,
			LAYOUT$descriptorBindingVariableDescriptorCount,
			LAYOUT$runtimeDescriptorArray,
			LAYOUT$samplerFilterMinmax,
			LAYOUT$scalarBlockLayout,
			LAYOUT$imagelessFramebuffer,
			LAYOUT$uniformBufferStandardLayout,
			LAYOUT$shaderSubgroupExtendedTypes,
			LAYOUT$separateDepthStencilLayouts,
			LAYOUT$hostQueryReset,
			LAYOUT$timelineSemaphore,
			LAYOUT$bufferDeviceAddress,
			LAYOUT$bufferDeviceAddressCaptureReplay,
			LAYOUT$bufferDeviceAddressMultiDevice,
			LAYOUT$vulkanMemoryModel,
			LAYOUT$vulkanMemoryModelDeviceScope,
			LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains,
			LAYOUT$shaderOutputViewportIndex,
			LAYOUT$shaderOutputLayer,
			LAYOUT$subgroupBroadcastDynamicId,
			java.lang.foreign.MemoryLayout.paddingLayout(4)
	).withName("VkPhysicalDeviceVulkan12Features");

	public VkPhysicalDeviceVulkan12Features(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
	public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
	public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

	public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
	public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
	public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

	public int samplerMirrorClampToEdge() {return this.ptr.get(LAYOUT$samplerMirrorClampToEdge, OFFSET$samplerMirrorClampToEdge);}
	public void samplerMirrorClampToEdge(int value) {this.ptr.set(LAYOUT$samplerMirrorClampToEdge, OFFSET$samplerMirrorClampToEdge, value);}
	public java.lang.foreign.MemorySegment samplerMirrorClampToEdge_ptr() {return this.ptr.asSlice(OFFSET$samplerMirrorClampToEdge, LAYOUT$samplerMirrorClampToEdge);}

	public int drawIndirectCount() {return this.ptr.get(LAYOUT$drawIndirectCount, OFFSET$drawIndirectCount);}
	public void drawIndirectCount(int value) {this.ptr.set(LAYOUT$drawIndirectCount, OFFSET$drawIndirectCount, value);}
	public java.lang.foreign.MemorySegment drawIndirectCount_ptr() {return this.ptr.asSlice(OFFSET$drawIndirectCount, LAYOUT$drawIndirectCount);}

	public int storageBuffer8BitAccess() {return this.ptr.get(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess);}
	public void storageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess, value);}
	public java.lang.foreign.MemorySegment storageBuffer8BitAccess_ptr() {return this.ptr.asSlice(OFFSET$storageBuffer8BitAccess, LAYOUT$storageBuffer8BitAccess);}

	public int uniformAndStorageBuffer8BitAccess() {return this.ptr.get(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess);}
	public void uniformAndStorageBuffer8BitAccess(int value) {this.ptr.set(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess, value);}
	public java.lang.foreign.MemorySegment uniformAndStorageBuffer8BitAccess_ptr() {return this.ptr.asSlice(OFFSET$uniformAndStorageBuffer8BitAccess, LAYOUT$uniformAndStorageBuffer8BitAccess);}

	public int storagePushConstant8() {return this.ptr.get(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8);}
	public void storagePushConstant8(int value) {this.ptr.set(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8, value);}
	public java.lang.foreign.MemorySegment storagePushConstant8_ptr() {return this.ptr.asSlice(OFFSET$storagePushConstant8, LAYOUT$storagePushConstant8);}

	public int shaderBufferInt64Atomics() {return this.ptr.get(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics);}
	public void shaderBufferInt64Atomics(int value) {this.ptr.set(LAYOUT$shaderBufferInt64Atomics, OFFSET$shaderBufferInt64Atomics, value);}
	public java.lang.foreign.MemorySegment shaderBufferInt64Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderBufferInt64Atomics, LAYOUT$shaderBufferInt64Atomics);}

	public int shaderSharedInt64Atomics() {return this.ptr.get(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics);}
	public void shaderSharedInt64Atomics(int value) {this.ptr.set(LAYOUT$shaderSharedInt64Atomics, OFFSET$shaderSharedInt64Atomics, value);}
	public java.lang.foreign.MemorySegment shaderSharedInt64Atomics_ptr() {return this.ptr.asSlice(OFFSET$shaderSharedInt64Atomics, LAYOUT$shaderSharedInt64Atomics);}

	public int shaderFloat16() {return this.ptr.get(LAYOUT$shaderFloat16, OFFSET$shaderFloat16);}
	public void shaderFloat16(int value) {this.ptr.set(LAYOUT$shaderFloat16, OFFSET$shaderFloat16, value);}
	public java.lang.foreign.MemorySegment shaderFloat16_ptr() {return this.ptr.asSlice(OFFSET$shaderFloat16, LAYOUT$shaderFloat16);}

	public int shaderInt8() {return this.ptr.get(LAYOUT$shaderInt8, OFFSET$shaderInt8);}
	public void shaderInt8(int value) {this.ptr.set(LAYOUT$shaderInt8, OFFSET$shaderInt8, value);}
	public java.lang.foreign.MemorySegment shaderInt8_ptr() {return this.ptr.asSlice(OFFSET$shaderInt8, LAYOUT$shaderInt8);}

	public int descriptorIndexing() {return this.ptr.get(LAYOUT$descriptorIndexing, OFFSET$descriptorIndexing);}
	public void descriptorIndexing(int value) {this.ptr.set(LAYOUT$descriptorIndexing, OFFSET$descriptorIndexing, value);}
	public java.lang.foreign.MemorySegment descriptorIndexing_ptr() {return this.ptr.asSlice(OFFSET$descriptorIndexing, LAYOUT$descriptorIndexing);}

	public int shaderInputAttachmentArrayDynamicIndexing() {return this.ptr.get(LAYOUT$shaderInputAttachmentArrayDynamicIndexing, OFFSET$shaderInputAttachmentArrayDynamicIndexing);}
	public void shaderInputAttachmentArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT$shaderInputAttachmentArrayDynamicIndexing, OFFSET$shaderInputAttachmentArrayDynamicIndexing, value);}
	public java.lang.foreign.MemorySegment shaderInputAttachmentArrayDynamicIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderInputAttachmentArrayDynamicIndexing, LAYOUT$shaderInputAttachmentArrayDynamicIndexing);}

	public int shaderUniformTexelBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing, OFFSET$shaderUniformTexelBufferArrayDynamicIndexing);}
	public void shaderUniformTexelBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing, OFFSET$shaderUniformTexelBufferArrayDynamicIndexing, value);}
	public java.lang.foreign.MemorySegment shaderUniformTexelBufferArrayDynamicIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderUniformTexelBufferArrayDynamicIndexing, LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing);}

	public int shaderStorageTexelBufferArrayDynamicIndexing() {return this.ptr.get(LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing, OFFSET$shaderStorageTexelBufferArrayDynamicIndexing);}
	public void shaderStorageTexelBufferArrayDynamicIndexing(int value) {this.ptr.set(LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing, OFFSET$shaderStorageTexelBufferArrayDynamicIndexing, value);}
	public java.lang.foreign.MemorySegment shaderStorageTexelBufferArrayDynamicIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageTexelBufferArrayDynamicIndexing, LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing);}

	public int shaderUniformBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT$shaderUniformBufferArrayNonUniformIndexing, OFFSET$shaderUniformBufferArrayNonUniformIndexing);}
	public void shaderUniformBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT$shaderUniformBufferArrayNonUniformIndexing, OFFSET$shaderUniformBufferArrayNonUniformIndexing, value);}
	public java.lang.foreign.MemorySegment shaderUniformBufferArrayNonUniformIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderUniformBufferArrayNonUniformIndexing, LAYOUT$shaderUniformBufferArrayNonUniformIndexing);}

	public int shaderSampledImageArrayNonUniformIndexing() {return this.ptr.get(LAYOUT$shaderSampledImageArrayNonUniformIndexing, OFFSET$shaderSampledImageArrayNonUniformIndexing);}
	public void shaderSampledImageArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT$shaderSampledImageArrayNonUniformIndexing, OFFSET$shaderSampledImageArrayNonUniformIndexing, value);}
	public java.lang.foreign.MemorySegment shaderSampledImageArrayNonUniformIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderSampledImageArrayNonUniformIndexing, LAYOUT$shaderSampledImageArrayNonUniformIndexing);}

	public int shaderStorageBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT$shaderStorageBufferArrayNonUniformIndexing, OFFSET$shaderStorageBufferArrayNonUniformIndexing);}
	public void shaderStorageBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT$shaderStorageBufferArrayNonUniformIndexing, OFFSET$shaderStorageBufferArrayNonUniformIndexing, value);}
	public java.lang.foreign.MemorySegment shaderStorageBufferArrayNonUniformIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageBufferArrayNonUniformIndexing, LAYOUT$shaderStorageBufferArrayNonUniformIndexing);}

	public int shaderStorageImageArrayNonUniformIndexing() {return this.ptr.get(LAYOUT$shaderStorageImageArrayNonUniformIndexing, OFFSET$shaderStorageImageArrayNonUniformIndexing);}
	public void shaderStorageImageArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT$shaderStorageImageArrayNonUniformIndexing, OFFSET$shaderStorageImageArrayNonUniformIndexing, value);}
	public java.lang.foreign.MemorySegment shaderStorageImageArrayNonUniformIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageImageArrayNonUniformIndexing, LAYOUT$shaderStorageImageArrayNonUniformIndexing);}

	public int shaderInputAttachmentArrayNonUniformIndexing() {return this.ptr.get(LAYOUT$shaderInputAttachmentArrayNonUniformIndexing, OFFSET$shaderInputAttachmentArrayNonUniformIndexing);}
	public void shaderInputAttachmentArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT$shaderInputAttachmentArrayNonUniformIndexing, OFFSET$shaderInputAttachmentArrayNonUniformIndexing, value);}
	public java.lang.foreign.MemorySegment shaderInputAttachmentArrayNonUniformIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderInputAttachmentArrayNonUniformIndexing, LAYOUT$shaderInputAttachmentArrayNonUniformIndexing);}

	public int shaderUniformTexelBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing);}
	public void shaderUniformTexelBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing, OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing, value);}
	public java.lang.foreign.MemorySegment shaderUniformTexelBufferArrayNonUniformIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing, LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing);}

	public int shaderStorageTexelBufferArrayNonUniformIndexing() {return this.ptr.get(LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing);}
	public void shaderStorageTexelBufferArrayNonUniformIndexing(int value) {this.ptr.set(LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing, OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing, value);}
	public java.lang.foreign.MemorySegment shaderStorageTexelBufferArrayNonUniformIndexing_ptr() {return this.ptr.asSlice(OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing, LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing);}

	public int descriptorBindingUniformBufferUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingUniformBufferUpdateAfterBind, OFFSET$descriptorBindingUniformBufferUpdateAfterBind);}
	public void descriptorBindingUniformBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingUniformBufferUpdateAfterBind, OFFSET$descriptorBindingUniformBufferUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingUniformBufferUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingUniformBufferUpdateAfterBind, LAYOUT$descriptorBindingUniformBufferUpdateAfterBind);}

	public int descriptorBindingSampledImageUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingSampledImageUpdateAfterBind, OFFSET$descriptorBindingSampledImageUpdateAfterBind);}
	public void descriptorBindingSampledImageUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingSampledImageUpdateAfterBind, OFFSET$descriptorBindingSampledImageUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingSampledImageUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingSampledImageUpdateAfterBind, LAYOUT$descriptorBindingSampledImageUpdateAfterBind);}

	public int descriptorBindingStorageImageUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingStorageImageUpdateAfterBind, OFFSET$descriptorBindingStorageImageUpdateAfterBind);}
	public void descriptorBindingStorageImageUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingStorageImageUpdateAfterBind, OFFSET$descriptorBindingStorageImageUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingStorageImageUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingStorageImageUpdateAfterBind, LAYOUT$descriptorBindingStorageImageUpdateAfterBind);}

	public int descriptorBindingStorageBufferUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingStorageBufferUpdateAfterBind, OFFSET$descriptorBindingStorageBufferUpdateAfterBind);}
	public void descriptorBindingStorageBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingStorageBufferUpdateAfterBind, OFFSET$descriptorBindingStorageBufferUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingStorageBufferUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingStorageBufferUpdateAfterBind, LAYOUT$descriptorBindingStorageBufferUpdateAfterBind);}

	public int descriptorBindingUniformTexelBufferUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind);}
	public void descriptorBindingUniformTexelBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind, OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingUniformTexelBufferUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind, LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind);}

	public int descriptorBindingStorageTexelBufferUpdateAfterBind() {return this.ptr.get(LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind);}
	public void descriptorBindingStorageTexelBufferUpdateAfterBind(int value) {this.ptr.set(LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind, OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind, value);}
	public java.lang.foreign.MemorySegment descriptorBindingStorageTexelBufferUpdateAfterBind_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind, LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind);}

	public int descriptorBindingUpdateUnusedWhilePending() {return this.ptr.get(LAYOUT$descriptorBindingUpdateUnusedWhilePending, OFFSET$descriptorBindingUpdateUnusedWhilePending);}
	public void descriptorBindingUpdateUnusedWhilePending(int value) {this.ptr.set(LAYOUT$descriptorBindingUpdateUnusedWhilePending, OFFSET$descriptorBindingUpdateUnusedWhilePending, value);}
	public java.lang.foreign.MemorySegment descriptorBindingUpdateUnusedWhilePending_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingUpdateUnusedWhilePending, LAYOUT$descriptorBindingUpdateUnusedWhilePending);}

	public int descriptorBindingPartiallyBound() {return this.ptr.get(LAYOUT$descriptorBindingPartiallyBound, OFFSET$descriptorBindingPartiallyBound);}
	public void descriptorBindingPartiallyBound(int value) {this.ptr.set(LAYOUT$descriptorBindingPartiallyBound, OFFSET$descriptorBindingPartiallyBound, value);}
	public java.lang.foreign.MemorySegment descriptorBindingPartiallyBound_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingPartiallyBound, LAYOUT$descriptorBindingPartiallyBound);}

	public int descriptorBindingVariableDescriptorCount() {return this.ptr.get(LAYOUT$descriptorBindingVariableDescriptorCount, OFFSET$descriptorBindingVariableDescriptorCount);}
	public void descriptorBindingVariableDescriptorCount(int value) {this.ptr.set(LAYOUT$descriptorBindingVariableDescriptorCount, OFFSET$descriptorBindingVariableDescriptorCount, value);}
	public java.lang.foreign.MemorySegment descriptorBindingVariableDescriptorCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorBindingVariableDescriptorCount, LAYOUT$descriptorBindingVariableDescriptorCount);}

	public int runtimeDescriptorArray() {return this.ptr.get(LAYOUT$runtimeDescriptorArray, OFFSET$runtimeDescriptorArray);}
	public void runtimeDescriptorArray(int value) {this.ptr.set(LAYOUT$runtimeDescriptorArray, OFFSET$runtimeDescriptorArray, value);}
	public java.lang.foreign.MemorySegment runtimeDescriptorArray_ptr() {return this.ptr.asSlice(OFFSET$runtimeDescriptorArray, LAYOUT$runtimeDescriptorArray);}

	public int samplerFilterMinmax() {return this.ptr.get(LAYOUT$samplerFilterMinmax, OFFSET$samplerFilterMinmax);}
	public void samplerFilterMinmax(int value) {this.ptr.set(LAYOUT$samplerFilterMinmax, OFFSET$samplerFilterMinmax, value);}
	public java.lang.foreign.MemorySegment samplerFilterMinmax_ptr() {return this.ptr.asSlice(OFFSET$samplerFilterMinmax, LAYOUT$samplerFilterMinmax);}

	public int scalarBlockLayout() {return this.ptr.get(LAYOUT$scalarBlockLayout, OFFSET$scalarBlockLayout);}
	public void scalarBlockLayout(int value) {this.ptr.set(LAYOUT$scalarBlockLayout, OFFSET$scalarBlockLayout, value);}
	public java.lang.foreign.MemorySegment scalarBlockLayout_ptr() {return this.ptr.asSlice(OFFSET$scalarBlockLayout, LAYOUT$scalarBlockLayout);}

	public int imagelessFramebuffer() {return this.ptr.get(LAYOUT$imagelessFramebuffer, OFFSET$imagelessFramebuffer);}
	public void imagelessFramebuffer(int value) {this.ptr.set(LAYOUT$imagelessFramebuffer, OFFSET$imagelessFramebuffer, value);}
	public java.lang.foreign.MemorySegment imagelessFramebuffer_ptr() {return this.ptr.asSlice(OFFSET$imagelessFramebuffer, LAYOUT$imagelessFramebuffer);}

	public int uniformBufferStandardLayout() {return this.ptr.get(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout);}
	public void uniformBufferStandardLayout(int value) {this.ptr.set(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout, value);}
	public java.lang.foreign.MemorySegment uniformBufferStandardLayout_ptr() {return this.ptr.asSlice(OFFSET$uniformBufferStandardLayout, LAYOUT$uniformBufferStandardLayout);}

	public int shaderSubgroupExtendedTypes() {return this.ptr.get(LAYOUT$shaderSubgroupExtendedTypes, OFFSET$shaderSubgroupExtendedTypes);}
	public void shaderSubgroupExtendedTypes(int value) {this.ptr.set(LAYOUT$shaderSubgroupExtendedTypes, OFFSET$shaderSubgroupExtendedTypes, value);}
	public java.lang.foreign.MemorySegment shaderSubgroupExtendedTypes_ptr() {return this.ptr.asSlice(OFFSET$shaderSubgroupExtendedTypes, LAYOUT$shaderSubgroupExtendedTypes);}

	public int separateDepthStencilLayouts() {return this.ptr.get(LAYOUT$separateDepthStencilLayouts, OFFSET$separateDepthStencilLayouts);}
	public void separateDepthStencilLayouts(int value) {this.ptr.set(LAYOUT$separateDepthStencilLayouts, OFFSET$separateDepthStencilLayouts, value);}
	public java.lang.foreign.MemorySegment separateDepthStencilLayouts_ptr() {return this.ptr.asSlice(OFFSET$separateDepthStencilLayouts, LAYOUT$separateDepthStencilLayouts);}

	public int hostQueryReset() {return this.ptr.get(LAYOUT$hostQueryReset, OFFSET$hostQueryReset);}
	public void hostQueryReset(int value) {this.ptr.set(LAYOUT$hostQueryReset, OFFSET$hostQueryReset, value);}
	public java.lang.foreign.MemorySegment hostQueryReset_ptr() {return this.ptr.asSlice(OFFSET$hostQueryReset, LAYOUT$hostQueryReset);}

	public int timelineSemaphore() {return this.ptr.get(LAYOUT$timelineSemaphore, OFFSET$timelineSemaphore);}
	public void timelineSemaphore(int value) {this.ptr.set(LAYOUT$timelineSemaphore, OFFSET$timelineSemaphore, value);}
	public java.lang.foreign.MemorySegment timelineSemaphore_ptr() {return this.ptr.asSlice(OFFSET$timelineSemaphore, LAYOUT$timelineSemaphore);}

	public int bufferDeviceAddress() {return this.ptr.get(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress);}
	public void bufferDeviceAddress(int value) {this.ptr.set(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress, value);}
	public java.lang.foreign.MemorySegment bufferDeviceAddress_ptr() {return this.ptr.asSlice(OFFSET$bufferDeviceAddress, LAYOUT$bufferDeviceAddress);}

	public int bufferDeviceAddressCaptureReplay() {return this.ptr.get(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay);}
	public void bufferDeviceAddressCaptureReplay(int value) {this.ptr.set(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay, value);}
	public java.lang.foreign.MemorySegment bufferDeviceAddressCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$bufferDeviceAddressCaptureReplay, LAYOUT$bufferDeviceAddressCaptureReplay);}

	public int bufferDeviceAddressMultiDevice() {return this.ptr.get(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice);}
	public void bufferDeviceAddressMultiDevice(int value) {this.ptr.set(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice, value);}
	public java.lang.foreign.MemorySegment bufferDeviceAddressMultiDevice_ptr() {return this.ptr.asSlice(OFFSET$bufferDeviceAddressMultiDevice, LAYOUT$bufferDeviceAddressMultiDevice);}

	public int vulkanMemoryModel() {return this.ptr.get(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel);}
	public void vulkanMemoryModel(int value) {this.ptr.set(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel, value);}
	public java.lang.foreign.MemorySegment vulkanMemoryModel_ptr() {return this.ptr.asSlice(OFFSET$vulkanMemoryModel, LAYOUT$vulkanMemoryModel);}

	public int vulkanMemoryModelDeviceScope() {return this.ptr.get(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope);}
	public void vulkanMemoryModelDeviceScope(int value) {this.ptr.set(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope, value);}
	public java.lang.foreign.MemorySegment vulkanMemoryModelDeviceScope_ptr() {return this.ptr.asSlice(OFFSET$vulkanMemoryModelDeviceScope, LAYOUT$vulkanMemoryModelDeviceScope);}

	public int vulkanMemoryModelAvailabilityVisibilityChains() {return this.ptr.get(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains);}
	public void vulkanMemoryModelAvailabilityVisibilityChains(int value) {this.ptr.set(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, value);}
	public java.lang.foreign.MemorySegment vulkanMemoryModelAvailabilityVisibilityChains_ptr() {return this.ptr.asSlice(OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains);}

	public int shaderOutputViewportIndex() {return this.ptr.get(LAYOUT$shaderOutputViewportIndex, OFFSET$shaderOutputViewportIndex);}
	public void shaderOutputViewportIndex(int value) {this.ptr.set(LAYOUT$shaderOutputViewportIndex, OFFSET$shaderOutputViewportIndex, value);}
	public java.lang.foreign.MemorySegment shaderOutputViewportIndex_ptr() {return this.ptr.asSlice(OFFSET$shaderOutputViewportIndex, LAYOUT$shaderOutputViewportIndex);}

	public int shaderOutputLayer() {return this.ptr.get(LAYOUT$shaderOutputLayer, OFFSET$shaderOutputLayer);}
	public void shaderOutputLayer(int value) {this.ptr.set(LAYOUT$shaderOutputLayer, OFFSET$shaderOutputLayer, value);}
	public java.lang.foreign.MemorySegment shaderOutputLayer_ptr() {return this.ptr.asSlice(OFFSET$shaderOutputLayer, LAYOUT$shaderOutputLayer);}

	public int subgroupBroadcastDynamicId() {return this.ptr.get(LAYOUT$subgroupBroadcastDynamicId, OFFSET$subgroupBroadcastDynamicId);}
	public void subgroupBroadcastDynamicId(int value) {this.ptr.set(LAYOUT$subgroupBroadcastDynamicId, OFFSET$subgroupBroadcastDynamicId, value);}
	public java.lang.foreign.MemorySegment subgroupBroadcastDynamicId_ptr() {return this.ptr.asSlice(OFFSET$subgroupBroadcastDynamicId, LAYOUT$subgroupBroadcastDynamicId);}
}

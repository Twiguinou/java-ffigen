package vulkan;

public record VkPhysicalDeviceDescriptorIndexingFeatures(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInputAttachmentArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderInputAttachmentArrayDynamicIndexing = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderUniformTexelBufferArrayDynamicIndexing = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageTexelBufferArrayDynamicIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderStorageTexelBufferArrayDynamicIndexing = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderUniformBufferArrayNonUniformIndexing = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderSampledImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderSampledImageArrayNonUniformIndexing = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderStorageBufferArrayNonUniformIndexing = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageImageArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderStorageImageArrayNonUniformIndexing = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderInputAttachmentArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderInputAttachmentArrayNonUniformIndexing = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderUniformTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderUniformTexelBufferArrayNonUniformIndexing = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$shaderStorageTexelBufferArrayNonUniformIndexing = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$shaderStorageTexelBufferArrayNonUniformIndexing = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingUniformBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingUniformBufferUpdateAfterBind = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingSampledImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingSampledImageUpdateAfterBind = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingStorageImageUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingStorageImageUpdateAfterBind = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingStorageBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingStorageBufferUpdateAfterBind = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingUniformTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingUniformTexelBufferUpdateAfterBind = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingStorageTexelBufferUpdateAfterBind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingStorageTexelBufferUpdateAfterBind = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingUpdateUnusedWhilePending = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingUpdateUnusedWhilePending = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingPartiallyBound = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingPartiallyBound = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBindingVariableDescriptorCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBindingVariableDescriptorCount = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$runtimeDescriptorArray = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$runtimeDescriptorArray = 92L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
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
            LAYOUT$runtimeDescriptorArray
    ).withName("VkPhysicalDeviceDescriptorIndexingFeatures");

    public VkPhysicalDeviceDescriptorIndexingFeatures(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

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
}

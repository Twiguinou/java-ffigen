package vulkan;

public record VkPhysicalDeviceVulkan11Properties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$deviceUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$deviceUUID = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$driverUUID = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$driverUUID = 32L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$deviceLUID = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$deviceLUID = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceNodeMask = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceNodeMask = 56L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceLUIDValid = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceLUIDValid = 60L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subgroupSize = 64L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupSupportedStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subgroupSupportedStages = 68L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupSupportedOperations = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subgroupSupportedOperations = 72L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subgroupQuadOperationsInAllStages = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subgroupQuadOperationsInAllStages = 76L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pointClippingBehavior = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pointClippingBehavior = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMultiviewViewCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMultiviewViewCount = 84L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxMultiviewInstanceIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxMultiviewInstanceIndex = 88L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$protectedNoFault = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$protectedNoFault = 92L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxPerSetDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxPerSetDescriptors = 96L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxMemoryAllocationSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxMemoryAllocationSize = 104L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$deviceUUID,
            LAYOUT$driverUUID,
            LAYOUT$deviceLUID,
            LAYOUT$deviceNodeMask,
            LAYOUT$deviceLUIDValid,
            LAYOUT$subgroupSize,
            LAYOUT$subgroupSupportedStages,
            LAYOUT$subgroupSupportedOperations,
            LAYOUT$subgroupQuadOperationsInAllStages,
            LAYOUT$pointClippingBehavior,
            LAYOUT$maxMultiviewViewCount,
            LAYOUT$maxMultiviewInstanceIndex,
            LAYOUT$protectedNoFault,
            LAYOUT$maxPerSetDescriptors,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$maxMemoryAllocationSize
    ).withName("VkPhysicalDeviceVulkan11Properties");

    public VkPhysicalDeviceVulkan11Properties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment deviceUUID() {return this.ptr.asSlice(OFFSET$deviceUUID, LAYOUT$deviceUUID);}
    public char deviceUUID(int i) {return (char)this.deviceUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void deviceUUID(int i, char value) {this.deviceUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment driverUUID() {return this.ptr.asSlice(OFFSET$driverUUID, LAYOUT$driverUUID);}
    public char driverUUID(int i) {return (char)this.driverUUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void driverUUID(int i, char value) {this.driverUUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment deviceLUID() {return this.ptr.asSlice(OFFSET$deviceLUID, LAYOUT$deviceLUID);}
    public char deviceLUID(int i) {return (char)this.deviceLUID().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void deviceLUID(int i, char value) {this.deviceLUID().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public int deviceNodeMask() {return this.ptr.get(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask);}
    public void deviceNodeMask(int value) {this.ptr.set(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask, value);}
    public java.lang.foreign.MemorySegment deviceNodeMask_ptr() {return this.ptr.asSlice(OFFSET$deviceNodeMask, LAYOUT$deviceNodeMask);}

    public int deviceLUIDValid() {return this.ptr.get(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid);}
    public void deviceLUIDValid(int value) {this.ptr.set(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid, value);}
    public java.lang.foreign.MemorySegment deviceLUIDValid_ptr() {return this.ptr.asSlice(OFFSET$deviceLUIDValid, LAYOUT$deviceLUIDValid);}

    public int subgroupSize() {return this.ptr.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);}
    public void subgroupSize(int value) {this.ptr.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);}
    public java.lang.foreign.MemorySegment subgroupSize_ptr() {return this.ptr.asSlice(OFFSET$subgroupSize, LAYOUT$subgroupSize);}

    public int subgroupSupportedStages() {return this.ptr.get(LAYOUT$subgroupSupportedStages, OFFSET$subgroupSupportedStages);}
    public void subgroupSupportedStages(int value) {this.ptr.set(LAYOUT$subgroupSupportedStages, OFFSET$subgroupSupportedStages, value);}
    public java.lang.foreign.MemorySegment subgroupSupportedStages_ptr() {return this.ptr.asSlice(OFFSET$subgroupSupportedStages, LAYOUT$subgroupSupportedStages);}

    public int subgroupSupportedOperations() {return this.ptr.get(LAYOUT$subgroupSupportedOperations, OFFSET$subgroupSupportedOperations);}
    public void subgroupSupportedOperations(int value) {this.ptr.set(LAYOUT$subgroupSupportedOperations, OFFSET$subgroupSupportedOperations, value);}
    public java.lang.foreign.MemorySegment subgroupSupportedOperations_ptr() {return this.ptr.asSlice(OFFSET$subgroupSupportedOperations, LAYOUT$subgroupSupportedOperations);}

    public int subgroupQuadOperationsInAllStages() {return this.ptr.get(LAYOUT$subgroupQuadOperationsInAllStages, OFFSET$subgroupQuadOperationsInAllStages);}
    public void subgroupQuadOperationsInAllStages(int value) {this.ptr.set(LAYOUT$subgroupQuadOperationsInAllStages, OFFSET$subgroupQuadOperationsInAllStages, value);}
    public java.lang.foreign.MemorySegment subgroupQuadOperationsInAllStages_ptr() {return this.ptr.asSlice(OFFSET$subgroupQuadOperationsInAllStages, LAYOUT$subgroupQuadOperationsInAllStages);}

    public int pointClippingBehavior() {return this.ptr.get(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior);}
    public void pointClippingBehavior(int value) {this.ptr.set(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior, value);}
    public java.lang.foreign.MemorySegment pointClippingBehavior_ptr() {return this.ptr.asSlice(OFFSET$pointClippingBehavior, LAYOUT$pointClippingBehavior);}

    public int maxMultiviewViewCount() {return this.ptr.get(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount);}
    public void maxMultiviewViewCount(int value) {this.ptr.set(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount, value);}
    public java.lang.foreign.MemorySegment maxMultiviewViewCount_ptr() {return this.ptr.asSlice(OFFSET$maxMultiviewViewCount, LAYOUT$maxMultiviewViewCount);}

    public int maxMultiviewInstanceIndex() {return this.ptr.get(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex);}
    public void maxMultiviewInstanceIndex(int value) {this.ptr.set(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex, value);}
    public java.lang.foreign.MemorySegment maxMultiviewInstanceIndex_ptr() {return this.ptr.asSlice(OFFSET$maxMultiviewInstanceIndex, LAYOUT$maxMultiviewInstanceIndex);}

    public int protectedNoFault() {return this.ptr.get(LAYOUT$protectedNoFault, OFFSET$protectedNoFault);}
    public void protectedNoFault(int value) {this.ptr.set(LAYOUT$protectedNoFault, OFFSET$protectedNoFault, value);}
    public java.lang.foreign.MemorySegment protectedNoFault_ptr() {return this.ptr.asSlice(OFFSET$protectedNoFault, LAYOUT$protectedNoFault);}

    public int maxPerSetDescriptors() {return this.ptr.get(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors);}
    public void maxPerSetDescriptors(int value) {this.ptr.set(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors, value);}
    public java.lang.foreign.MemorySegment maxPerSetDescriptors_ptr() {return this.ptr.asSlice(OFFSET$maxPerSetDescriptors, LAYOUT$maxPerSetDescriptors);}

    public long maxMemoryAllocationSize() {return this.ptr.get(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize);}
    public void maxMemoryAllocationSize(long value) {this.ptr.set(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize, value);}
    public java.lang.foreign.MemorySegment maxMemoryAllocationSize_ptr() {return this.ptr.asSlice(OFFSET$maxMemoryAllocationSize, LAYOUT$maxMemoryAllocationSize);}
}

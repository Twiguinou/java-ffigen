package vulkan;

public record VkDescriptorSetVariableDescriptorCountAllocateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorSetCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorSetCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDescriptorCounts = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDescriptorCounts = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$descriptorSetCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDescriptorCounts
    ).withName("VkDescriptorSetVariableDescriptorCountAllocateInfo");

    public VkDescriptorSetVariableDescriptorCountAllocateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int descriptorSetCount() {return this.ptr.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);}
    public void descriptorSetCount(int value) {this.ptr.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);}
    public java.lang.foreign.MemorySegment descriptorSetCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorSetCount, LAYOUT$descriptorSetCount);}

    public java.lang.foreign.MemorySegment pDescriptorCounts() {return this.ptr.get(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts);}
    public void pDescriptorCounts(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts, value);}
    public java.lang.foreign.MemorySegment pDescriptorCounts_ptr() {return this.ptr.asSlice(OFFSET$pDescriptorCounts, LAYOUT$pDescriptorCounts);}
}

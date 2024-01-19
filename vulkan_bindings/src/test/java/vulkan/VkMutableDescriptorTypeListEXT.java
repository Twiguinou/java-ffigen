package vulkan;

public record VkMutableDescriptorTypeListEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorTypeCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorTypeCount = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pDescriptorTypes = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pDescriptorTypes = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$descriptorTypeCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pDescriptorTypes
    ).withName("VkMutableDescriptorTypeListEXT");

    public VkMutableDescriptorTypeListEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int descriptorTypeCount() {return this.ptr.get(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount);}
    public void descriptorTypeCount(int value) {this.ptr.set(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount, value);}
    public java.lang.foreign.MemorySegment descriptorTypeCount_ptr() {return this.ptr.asSlice(OFFSET$descriptorTypeCount, LAYOUT$descriptorTypeCount);}

    public java.lang.foreign.MemorySegment pDescriptorTypes() {return this.ptr.get(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes);}
    public void pDescriptorTypes(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes, value);}
    public java.lang.foreign.MemorySegment pDescriptorTypes_ptr() {return this.ptr.asSlice(OFFSET$pDescriptorTypes, LAYOUT$pDescriptorTypes);}
}

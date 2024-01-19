package vulkan;

public record VkDescriptorSetLayoutBindingFlagsCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bindingCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bindingCount = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pBindingFlags = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pBindingFlags = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$bindingCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pBindingFlags
    ).withName("VkDescriptorSetLayoutBindingFlagsCreateInfo");

    public VkDescriptorSetLayoutBindingFlagsCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int bindingCount() {return this.ptr.get(LAYOUT$bindingCount, OFFSET$bindingCount);}
    public void bindingCount(int value) {this.ptr.set(LAYOUT$bindingCount, OFFSET$bindingCount, value);}
    public java.lang.foreign.MemorySegment bindingCount_ptr() {return this.ptr.asSlice(OFFSET$bindingCount, LAYOUT$bindingCount);}

    public java.lang.foreign.MemorySegment pBindingFlags() {return this.ptr.get(LAYOUT$pBindingFlags, OFFSET$pBindingFlags);}
    public void pBindingFlags(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pBindingFlags, OFFSET$pBindingFlags, value);}
    public java.lang.foreign.MemorySegment pBindingFlags_ptr() {return this.ptr.asSlice(OFFSET$pBindingFlags, LAYOUT$pBindingFlags);}
}

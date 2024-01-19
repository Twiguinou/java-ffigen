package vulkan;

public record VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$extendedSparseAddressSpaceSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$extendedSparseAddressSpaceSize = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$extendedSparseImageUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$extendedSparseImageUsageFlags = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$extendedSparseBufferUsageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$extendedSparseBufferUsageFlags = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$extendedSparseAddressSpaceSize,
            LAYOUT$extendedSparseImageUsageFlags,
            LAYOUT$extendedSparseBufferUsageFlags
    ).withName("VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV");

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long extendedSparseAddressSpaceSize() {return this.ptr.get(LAYOUT$extendedSparseAddressSpaceSize, OFFSET$extendedSparseAddressSpaceSize);}
    public void extendedSparseAddressSpaceSize(long value) {this.ptr.set(LAYOUT$extendedSparseAddressSpaceSize, OFFSET$extendedSparseAddressSpaceSize, value);}
    public java.lang.foreign.MemorySegment extendedSparseAddressSpaceSize_ptr() {return this.ptr.asSlice(OFFSET$extendedSparseAddressSpaceSize, LAYOUT$extendedSparseAddressSpaceSize);}

    public int extendedSparseImageUsageFlags() {return this.ptr.get(LAYOUT$extendedSparseImageUsageFlags, OFFSET$extendedSparseImageUsageFlags);}
    public void extendedSparseImageUsageFlags(int value) {this.ptr.set(LAYOUT$extendedSparseImageUsageFlags, OFFSET$extendedSparseImageUsageFlags, value);}
    public java.lang.foreign.MemorySegment extendedSparseImageUsageFlags_ptr() {return this.ptr.asSlice(OFFSET$extendedSparseImageUsageFlags, LAYOUT$extendedSparseImageUsageFlags);}

    public int extendedSparseBufferUsageFlags() {return this.ptr.get(LAYOUT$extendedSparseBufferUsageFlags, OFFSET$extendedSparseBufferUsageFlags);}
    public void extendedSparseBufferUsageFlags(int value) {this.ptr.set(LAYOUT$extendedSparseBufferUsageFlags, OFFSET$extendedSparseBufferUsageFlags, value);}
    public java.lang.foreign.MemorySegment extendedSparseBufferUsageFlags_ptr() {return this.ptr.asSlice(OFFSET$extendedSparseBufferUsageFlags, LAYOUT$extendedSparseBufferUsageFlags);}
}

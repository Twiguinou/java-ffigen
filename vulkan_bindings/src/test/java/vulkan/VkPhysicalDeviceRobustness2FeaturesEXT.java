package vulkan;

public record VkPhysicalDeviceRobustness2FeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$robustBufferAccess2 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$robustBufferAccess2 = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$robustImageAccess2 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$robustImageAccess2 = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$nullDescriptor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$nullDescriptor = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$robustBufferAccess2,
            LAYOUT$robustImageAccess2,
            LAYOUT$nullDescriptor,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceRobustness2FeaturesEXT");

    public VkPhysicalDeviceRobustness2FeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int robustBufferAccess2() {return this.ptr.get(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2);}
    public void robustBufferAccess2(int value) {this.ptr.set(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2, value);}
    public java.lang.foreign.MemorySegment robustBufferAccess2_ptr() {return this.ptr.asSlice(OFFSET$robustBufferAccess2, LAYOUT$robustBufferAccess2);}

    public int robustImageAccess2() {return this.ptr.get(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2);}
    public void robustImageAccess2(int value) {this.ptr.set(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2, value);}
    public java.lang.foreign.MemorySegment robustImageAccess2_ptr() {return this.ptr.asSlice(OFFSET$robustImageAccess2, LAYOUT$robustImageAccess2);}

    public int nullDescriptor() {return this.ptr.get(LAYOUT$nullDescriptor, OFFSET$nullDescriptor);}
    public void nullDescriptor(int value) {this.ptr.set(LAYOUT$nullDescriptor, OFFSET$nullDescriptor, value);}
    public java.lang.foreign.MemorySegment nullDescriptor_ptr() {return this.ptr.asSlice(OFFSET$nullDescriptor, LAYOUT$nullDescriptor);}
}

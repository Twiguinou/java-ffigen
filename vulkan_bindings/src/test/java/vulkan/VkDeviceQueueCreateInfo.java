package vulkan;

public record VkDeviceQueueCreateInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFamilyIndex = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueFamilyIndex = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueCount = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pQueuePriorities = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pQueuePriorities = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            LAYOUT$queueFamilyIndex,
            LAYOUT$queueCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pQueuePriorities
    ).withName("VkDeviceQueueCreateInfo");

    public VkDeviceQueueCreateInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public int queueFamilyIndex() {return this.ptr.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);}
    public void queueFamilyIndex(int value) {this.ptr.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);}
    public java.lang.foreign.MemorySegment queueFamilyIndex_ptr() {return this.ptr.asSlice(OFFSET$queueFamilyIndex, LAYOUT$queueFamilyIndex);}

    public int queueCount() {return this.ptr.get(LAYOUT$queueCount, OFFSET$queueCount);}
    public void queueCount(int value) {this.ptr.set(LAYOUT$queueCount, OFFSET$queueCount, value);}
    public java.lang.foreign.MemorySegment queueCount_ptr() {return this.ptr.asSlice(OFFSET$queueCount, LAYOUT$queueCount);}

    public java.lang.foreign.MemorySegment pQueuePriorities() {return this.ptr.get(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities);}
    public void pQueuePriorities(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities, value);}
    public java.lang.foreign.MemorySegment pQueuePriorities_ptr() {return this.ptr.asSlice(OFFSET$pQueuePriorities, LAYOUT$pQueuePriorities);}
}

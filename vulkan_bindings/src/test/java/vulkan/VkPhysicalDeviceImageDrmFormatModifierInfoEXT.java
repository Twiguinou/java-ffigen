package vulkan;

public record VkPhysicalDeviceImageDrmFormatModifierInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$drmFormatModifier = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$drmFormatModifier = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sharingMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sharingMode = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFamilyIndexCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueFamilyIndexCount = 28L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pQueueFamilyIndices = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pQueueFamilyIndices = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$drmFormatModifier,
            LAYOUT$sharingMode,
            LAYOUT$queueFamilyIndexCount,
            LAYOUT$pQueueFamilyIndices
    ).withName("VkPhysicalDeviceImageDrmFormatModifierInfoEXT");

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long drmFormatModifier() {return this.ptr.get(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier);}
    public void drmFormatModifier(long value) {this.ptr.set(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier, value);}
    public java.lang.foreign.MemorySegment drmFormatModifier_ptr() {return this.ptr.asSlice(OFFSET$drmFormatModifier, LAYOUT$drmFormatModifier);}

    public int sharingMode() {return this.ptr.get(LAYOUT$sharingMode, OFFSET$sharingMode);}
    public void sharingMode(int value) {this.ptr.set(LAYOUT$sharingMode, OFFSET$sharingMode, value);}
    public java.lang.foreign.MemorySegment sharingMode_ptr() {return this.ptr.asSlice(OFFSET$sharingMode, LAYOUT$sharingMode);}

    public int queueFamilyIndexCount() {return this.ptr.get(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount);}
    public void queueFamilyIndexCount(int value) {this.ptr.set(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount, value);}
    public java.lang.foreign.MemorySegment queueFamilyIndexCount_ptr() {return this.ptr.asSlice(OFFSET$queueFamilyIndexCount, LAYOUT$queueFamilyIndexCount);}

    public java.lang.foreign.MemorySegment pQueueFamilyIndices() {return this.ptr.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);}
    public void pQueueFamilyIndices(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);}
    public java.lang.foreign.MemorySegment pQueueFamilyIndices_ptr() {return this.ptr.asSlice(OFFSET$pQueueFamilyIndices, LAYOUT$pQueueFamilyIndices);}
}

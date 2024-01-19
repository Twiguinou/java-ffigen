package vulkan;

public record VkQueueFamilyProperties(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueFlags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$queueCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$queueCount = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$timestampValidBits = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$timestampValidBits = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$minImageTransferGranularity = vulkan.VkExtent3D.gStructLayout;
    public static final long OFFSET$minImageTransferGranularity = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$queueFlags,
            LAYOUT$queueCount,
            LAYOUT$timestampValidBits,
            LAYOUT$minImageTransferGranularity
    ).withName("VkQueueFamilyProperties");

    public VkQueueFamilyProperties(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int queueFlags() {return this.ptr.get(LAYOUT$queueFlags, OFFSET$queueFlags);}
    public void queueFlags(int value) {this.ptr.set(LAYOUT$queueFlags, OFFSET$queueFlags, value);}
    public java.lang.foreign.MemorySegment queueFlags_ptr() {return this.ptr.asSlice(OFFSET$queueFlags, LAYOUT$queueFlags);}

    public int queueCount() {return this.ptr.get(LAYOUT$queueCount, OFFSET$queueCount);}
    public void queueCount(int value) {this.ptr.set(LAYOUT$queueCount, OFFSET$queueCount, value);}
    public java.lang.foreign.MemorySegment queueCount_ptr() {return this.ptr.asSlice(OFFSET$queueCount, LAYOUT$queueCount);}

    public int timestampValidBits() {return this.ptr.get(LAYOUT$timestampValidBits, OFFSET$timestampValidBits);}
    public void timestampValidBits(int value) {this.ptr.set(LAYOUT$timestampValidBits, OFFSET$timestampValidBits, value);}
    public java.lang.foreign.MemorySegment timestampValidBits_ptr() {return this.ptr.asSlice(OFFSET$timestampValidBits, LAYOUT$timestampValidBits);}

    public vulkan.VkExtent3D minImageTransferGranularity() {return new vulkan.VkExtent3D(this.ptr.asSlice(OFFSET$minImageTransferGranularity, LAYOUT$minImageTransferGranularity));}
}

package vulkan;

public record VkPhysicalDeviceDescriptorBufferFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBuffer = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBuffer = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBufferCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBufferCaptureReplay = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBufferImageLayoutIgnored = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBufferImageLayoutIgnored = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$descriptorBufferPushDescriptors = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$descriptorBufferPushDescriptors = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$descriptorBuffer,
            LAYOUT$descriptorBufferCaptureReplay,
            LAYOUT$descriptorBufferImageLayoutIgnored,
            LAYOUT$descriptorBufferPushDescriptors
    ).withName("VkPhysicalDeviceDescriptorBufferFeaturesEXT");

    public VkPhysicalDeviceDescriptorBufferFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int descriptorBuffer() {return this.ptr.get(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer);}
    public void descriptorBuffer(int value) {this.ptr.set(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer, value);}
    public java.lang.foreign.MemorySegment descriptorBuffer_ptr() {return this.ptr.asSlice(OFFSET$descriptorBuffer, LAYOUT$descriptorBuffer);}

    public int descriptorBufferCaptureReplay() {return this.ptr.get(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay);}
    public void descriptorBufferCaptureReplay(int value) {this.ptr.set(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay, value);}
    public java.lang.foreign.MemorySegment descriptorBufferCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$descriptorBufferCaptureReplay, LAYOUT$descriptorBufferCaptureReplay);}

    public int descriptorBufferImageLayoutIgnored() {return this.ptr.get(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored);}
    public void descriptorBufferImageLayoutIgnored(int value) {this.ptr.set(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored, value);}
    public java.lang.foreign.MemorySegment descriptorBufferImageLayoutIgnored_ptr() {return this.ptr.asSlice(OFFSET$descriptorBufferImageLayoutIgnored, LAYOUT$descriptorBufferImageLayoutIgnored);}

    public int descriptorBufferPushDescriptors() {return this.ptr.get(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors);}
    public void descriptorBufferPushDescriptors(int value) {this.ptr.set(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors, value);}
    public java.lang.foreign.MemorySegment descriptorBufferPushDescriptors_ptr() {return this.ptr.asSlice(OFFSET$descriptorBufferPushDescriptors, LAYOUT$descriptorBufferPushDescriptors);}
}

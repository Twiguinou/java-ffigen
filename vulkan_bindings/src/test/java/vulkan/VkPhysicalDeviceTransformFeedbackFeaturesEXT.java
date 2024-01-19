package vulkan;

public record VkPhysicalDeviceTransformFeedbackFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformFeedback = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformFeedback = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$geometryStreams = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$geometryStreams = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$transformFeedback,
            LAYOUT$geometryStreams
    ).withName("VkPhysicalDeviceTransformFeedbackFeaturesEXT");

    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int transformFeedback() {return this.ptr.get(LAYOUT$transformFeedback, OFFSET$transformFeedback);}
    public void transformFeedback(int value) {this.ptr.set(LAYOUT$transformFeedback, OFFSET$transformFeedback, value);}
    public java.lang.foreign.MemorySegment transformFeedback_ptr() {return this.ptr.asSlice(OFFSET$transformFeedback, LAYOUT$transformFeedback);}

    public int geometryStreams() {return this.ptr.get(LAYOUT$geometryStreams, OFFSET$geometryStreams);}
    public void geometryStreams(int value) {this.ptr.set(LAYOUT$geometryStreams, OFFSET$geometryStreams, value);}
    public java.lang.foreign.MemorySegment geometryStreams_ptr() {return this.ptr.asSlice(OFFSET$geometryStreams, LAYOUT$geometryStreams);}
}

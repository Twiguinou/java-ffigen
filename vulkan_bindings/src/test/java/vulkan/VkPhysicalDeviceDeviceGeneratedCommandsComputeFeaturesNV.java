package vulkan;

public record VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceGeneratedCompute = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceGeneratedCompute = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceGeneratedComputePipelines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceGeneratedComputePipelines = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$deviceGeneratedComputeCaptureReplay = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$deviceGeneratedComputeCaptureReplay = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$deviceGeneratedCompute,
            LAYOUT$deviceGeneratedComputePipelines,
            LAYOUT$deviceGeneratedComputeCaptureReplay,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV");

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int deviceGeneratedCompute() {return this.ptr.get(LAYOUT$deviceGeneratedCompute, OFFSET$deviceGeneratedCompute);}
    public void deviceGeneratedCompute(int value) {this.ptr.set(LAYOUT$deviceGeneratedCompute, OFFSET$deviceGeneratedCompute, value);}
    public java.lang.foreign.MemorySegment deviceGeneratedCompute_ptr() {return this.ptr.asSlice(OFFSET$deviceGeneratedCompute, LAYOUT$deviceGeneratedCompute);}

    public int deviceGeneratedComputePipelines() {return this.ptr.get(LAYOUT$deviceGeneratedComputePipelines, OFFSET$deviceGeneratedComputePipelines);}
    public void deviceGeneratedComputePipelines(int value) {this.ptr.set(LAYOUT$deviceGeneratedComputePipelines, OFFSET$deviceGeneratedComputePipelines, value);}
    public java.lang.foreign.MemorySegment deviceGeneratedComputePipelines_ptr() {return this.ptr.asSlice(OFFSET$deviceGeneratedComputePipelines, LAYOUT$deviceGeneratedComputePipelines);}

    public int deviceGeneratedComputeCaptureReplay() {return this.ptr.get(LAYOUT$deviceGeneratedComputeCaptureReplay, OFFSET$deviceGeneratedComputeCaptureReplay);}
    public void deviceGeneratedComputeCaptureReplay(int value) {this.ptr.set(LAYOUT$deviceGeneratedComputeCaptureReplay, OFFSET$deviceGeneratedComputeCaptureReplay, value);}
    public java.lang.foreign.MemorySegment deviceGeneratedComputeCaptureReplay_ptr() {return this.ptr.asSlice(OFFSET$deviceGeneratedComputeCaptureReplay, LAYOUT$deviceGeneratedComputeCaptureReplay);}
}

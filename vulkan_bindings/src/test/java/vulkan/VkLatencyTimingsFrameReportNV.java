package vulkan;

public record VkLatencyTimingsFrameReportNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$presentID = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$presentID = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$inputSampleTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$inputSampleTimeUs = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$simStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$simStartTimeUs = 32L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$simEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$simEndTimeUs = 40L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$renderSubmitStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$renderSubmitStartTimeUs = 48L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$renderSubmitEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$renderSubmitEndTimeUs = 56L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$presentStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$presentStartTimeUs = 64L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$presentEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$presentEndTimeUs = 72L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$driverStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$driverStartTimeUs = 80L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$driverEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$driverEndTimeUs = 88L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$osRenderQueueStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$osRenderQueueStartTimeUs = 96L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$osRenderQueueEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$osRenderQueueEndTimeUs = 104L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$gpuRenderStartTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$gpuRenderStartTimeUs = 112L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$gpuRenderEndTimeUs = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$gpuRenderEndTimeUs = 120L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$presentID,
            LAYOUT$inputSampleTimeUs,
            LAYOUT$simStartTimeUs,
            LAYOUT$simEndTimeUs,
            LAYOUT$renderSubmitStartTimeUs,
            LAYOUT$renderSubmitEndTimeUs,
            LAYOUT$presentStartTimeUs,
            LAYOUT$presentEndTimeUs,
            LAYOUT$driverStartTimeUs,
            LAYOUT$driverEndTimeUs,
            LAYOUT$osRenderQueueStartTimeUs,
            LAYOUT$osRenderQueueEndTimeUs,
            LAYOUT$gpuRenderStartTimeUs,
            LAYOUT$gpuRenderEndTimeUs
    ).withName("VkLatencyTimingsFrameReportNV");

    public VkLatencyTimingsFrameReportNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public long presentID() {return this.ptr.get(LAYOUT$presentID, OFFSET$presentID);}
    public void presentID(long value) {this.ptr.set(LAYOUT$presentID, OFFSET$presentID, value);}
    public java.lang.foreign.MemorySegment presentID_ptr() {return this.ptr.asSlice(OFFSET$presentID, LAYOUT$presentID);}

    public long inputSampleTimeUs() {return this.ptr.get(LAYOUT$inputSampleTimeUs, OFFSET$inputSampleTimeUs);}
    public void inputSampleTimeUs(long value) {this.ptr.set(LAYOUT$inputSampleTimeUs, OFFSET$inputSampleTimeUs, value);}
    public java.lang.foreign.MemorySegment inputSampleTimeUs_ptr() {return this.ptr.asSlice(OFFSET$inputSampleTimeUs, LAYOUT$inputSampleTimeUs);}

    public long simStartTimeUs() {return this.ptr.get(LAYOUT$simStartTimeUs, OFFSET$simStartTimeUs);}
    public void simStartTimeUs(long value) {this.ptr.set(LAYOUT$simStartTimeUs, OFFSET$simStartTimeUs, value);}
    public java.lang.foreign.MemorySegment simStartTimeUs_ptr() {return this.ptr.asSlice(OFFSET$simStartTimeUs, LAYOUT$simStartTimeUs);}

    public long simEndTimeUs() {return this.ptr.get(LAYOUT$simEndTimeUs, OFFSET$simEndTimeUs);}
    public void simEndTimeUs(long value) {this.ptr.set(LAYOUT$simEndTimeUs, OFFSET$simEndTimeUs, value);}
    public java.lang.foreign.MemorySegment simEndTimeUs_ptr() {return this.ptr.asSlice(OFFSET$simEndTimeUs, LAYOUT$simEndTimeUs);}

    public long renderSubmitStartTimeUs() {return this.ptr.get(LAYOUT$renderSubmitStartTimeUs, OFFSET$renderSubmitStartTimeUs);}
    public void renderSubmitStartTimeUs(long value) {this.ptr.set(LAYOUT$renderSubmitStartTimeUs, OFFSET$renderSubmitStartTimeUs, value);}
    public java.lang.foreign.MemorySegment renderSubmitStartTimeUs_ptr() {return this.ptr.asSlice(OFFSET$renderSubmitStartTimeUs, LAYOUT$renderSubmitStartTimeUs);}

    public long renderSubmitEndTimeUs() {return this.ptr.get(LAYOUT$renderSubmitEndTimeUs, OFFSET$renderSubmitEndTimeUs);}
    public void renderSubmitEndTimeUs(long value) {this.ptr.set(LAYOUT$renderSubmitEndTimeUs, OFFSET$renderSubmitEndTimeUs, value);}
    public java.lang.foreign.MemorySegment renderSubmitEndTimeUs_ptr() {return this.ptr.asSlice(OFFSET$renderSubmitEndTimeUs, LAYOUT$renderSubmitEndTimeUs);}

    public long presentStartTimeUs() {return this.ptr.get(LAYOUT$presentStartTimeUs, OFFSET$presentStartTimeUs);}
    public void presentStartTimeUs(long value) {this.ptr.set(LAYOUT$presentStartTimeUs, OFFSET$presentStartTimeUs, value);}
    public java.lang.foreign.MemorySegment presentStartTimeUs_ptr() {return this.ptr.asSlice(OFFSET$presentStartTimeUs, LAYOUT$presentStartTimeUs);}

    public long presentEndTimeUs() {return this.ptr.get(LAYOUT$presentEndTimeUs, OFFSET$presentEndTimeUs);}
    public void presentEndTimeUs(long value) {this.ptr.set(LAYOUT$presentEndTimeUs, OFFSET$presentEndTimeUs, value);}
    public java.lang.foreign.MemorySegment presentEndTimeUs_ptr() {return this.ptr.asSlice(OFFSET$presentEndTimeUs, LAYOUT$presentEndTimeUs);}

    public long driverStartTimeUs() {return this.ptr.get(LAYOUT$driverStartTimeUs, OFFSET$driverStartTimeUs);}
    public void driverStartTimeUs(long value) {this.ptr.set(LAYOUT$driverStartTimeUs, OFFSET$driverStartTimeUs, value);}
    public java.lang.foreign.MemorySegment driverStartTimeUs_ptr() {return this.ptr.asSlice(OFFSET$driverStartTimeUs, LAYOUT$driverStartTimeUs);}

    public long driverEndTimeUs() {return this.ptr.get(LAYOUT$driverEndTimeUs, OFFSET$driverEndTimeUs);}
    public void driverEndTimeUs(long value) {this.ptr.set(LAYOUT$driverEndTimeUs, OFFSET$driverEndTimeUs, value);}
    public java.lang.foreign.MemorySegment driverEndTimeUs_ptr() {return this.ptr.asSlice(OFFSET$driverEndTimeUs, LAYOUT$driverEndTimeUs);}

    public long osRenderQueueStartTimeUs() {return this.ptr.get(LAYOUT$osRenderQueueStartTimeUs, OFFSET$osRenderQueueStartTimeUs);}
    public void osRenderQueueStartTimeUs(long value) {this.ptr.set(LAYOUT$osRenderQueueStartTimeUs, OFFSET$osRenderQueueStartTimeUs, value);}
    public java.lang.foreign.MemorySegment osRenderQueueStartTimeUs_ptr() {return this.ptr.asSlice(OFFSET$osRenderQueueStartTimeUs, LAYOUT$osRenderQueueStartTimeUs);}

    public long osRenderQueueEndTimeUs() {return this.ptr.get(LAYOUT$osRenderQueueEndTimeUs, OFFSET$osRenderQueueEndTimeUs);}
    public void osRenderQueueEndTimeUs(long value) {this.ptr.set(LAYOUT$osRenderQueueEndTimeUs, OFFSET$osRenderQueueEndTimeUs, value);}
    public java.lang.foreign.MemorySegment osRenderQueueEndTimeUs_ptr() {return this.ptr.asSlice(OFFSET$osRenderQueueEndTimeUs, LAYOUT$osRenderQueueEndTimeUs);}

    public long gpuRenderStartTimeUs() {return this.ptr.get(LAYOUT$gpuRenderStartTimeUs, OFFSET$gpuRenderStartTimeUs);}
    public void gpuRenderStartTimeUs(long value) {this.ptr.set(LAYOUT$gpuRenderStartTimeUs, OFFSET$gpuRenderStartTimeUs, value);}
    public java.lang.foreign.MemorySegment gpuRenderStartTimeUs_ptr() {return this.ptr.asSlice(OFFSET$gpuRenderStartTimeUs, LAYOUT$gpuRenderStartTimeUs);}

    public long gpuRenderEndTimeUs() {return this.ptr.get(LAYOUT$gpuRenderEndTimeUs, OFFSET$gpuRenderEndTimeUs);}
    public void gpuRenderEndTimeUs(long value) {this.ptr.set(LAYOUT$gpuRenderEndTimeUs, OFFSET$gpuRenderEndTimeUs, value);}
    public java.lang.foreign.MemorySegment gpuRenderEndTimeUs_ptr() {return this.ptr.asSlice(OFFSET$gpuRenderEndTimeUs, LAYOUT$gpuRenderEndTimeUs);}
}

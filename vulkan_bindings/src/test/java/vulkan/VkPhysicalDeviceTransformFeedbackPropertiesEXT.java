package vulkan;

public record VkPhysicalDeviceTransformFeedbackPropertiesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTransformFeedbackStreams = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTransformFeedbackStreams = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTransformFeedbackBuffers = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTransformFeedbackBuffers = 20L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$maxTransformFeedbackBufferSize = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$maxTransformFeedbackBufferSize = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTransformFeedbackStreamDataSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTransformFeedbackStreamDataSize = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTransformFeedbackBufferDataSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTransformFeedbackBufferDataSize = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$maxTransformFeedbackBufferDataStride = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$maxTransformFeedbackBufferDataStride = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformFeedbackQueries = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformFeedbackQueries = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformFeedbackStreamsLinesTriangles = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformFeedbackStreamsLinesTriangles = 48L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformFeedbackRasterizationStreamSelect = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformFeedbackRasterizationStreamSelect = 52L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$transformFeedbackDraw = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$transformFeedbackDraw = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$maxTransformFeedbackStreams,
            LAYOUT$maxTransformFeedbackBuffers,
            LAYOUT$maxTransformFeedbackBufferSize,
            LAYOUT$maxTransformFeedbackStreamDataSize,
            LAYOUT$maxTransformFeedbackBufferDataSize,
            LAYOUT$maxTransformFeedbackBufferDataStride,
            LAYOUT$transformFeedbackQueries,
            LAYOUT$transformFeedbackStreamsLinesTriangles,
            LAYOUT$transformFeedbackRasterizationStreamSelect,
            LAYOUT$transformFeedbackDraw,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceTransformFeedbackPropertiesEXT");

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int maxTransformFeedbackStreams() {return this.ptr.get(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams);}
    public void maxTransformFeedbackStreams(int value) {this.ptr.set(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams, value);}
    public java.lang.foreign.MemorySegment maxTransformFeedbackStreams_ptr() {return this.ptr.asSlice(OFFSET$maxTransformFeedbackStreams, LAYOUT$maxTransformFeedbackStreams);}

    public int maxTransformFeedbackBuffers() {return this.ptr.get(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers);}
    public void maxTransformFeedbackBuffers(int value) {this.ptr.set(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers, value);}
    public java.lang.foreign.MemorySegment maxTransformFeedbackBuffers_ptr() {return this.ptr.asSlice(OFFSET$maxTransformFeedbackBuffers, LAYOUT$maxTransformFeedbackBuffers);}

    public long maxTransformFeedbackBufferSize() {return this.ptr.get(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize);}
    public void maxTransformFeedbackBufferSize(long value) {this.ptr.set(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize, value);}
    public java.lang.foreign.MemorySegment maxTransformFeedbackBufferSize_ptr() {return this.ptr.asSlice(OFFSET$maxTransformFeedbackBufferSize, LAYOUT$maxTransformFeedbackBufferSize);}

    public int maxTransformFeedbackStreamDataSize() {return this.ptr.get(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize);}
    public void maxTransformFeedbackStreamDataSize(int value) {this.ptr.set(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize, value);}
    public java.lang.foreign.MemorySegment maxTransformFeedbackStreamDataSize_ptr() {return this.ptr.asSlice(OFFSET$maxTransformFeedbackStreamDataSize, LAYOUT$maxTransformFeedbackStreamDataSize);}

    public int maxTransformFeedbackBufferDataSize() {return this.ptr.get(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize);}
    public void maxTransformFeedbackBufferDataSize(int value) {this.ptr.set(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize, value);}
    public java.lang.foreign.MemorySegment maxTransformFeedbackBufferDataSize_ptr() {return this.ptr.asSlice(OFFSET$maxTransformFeedbackBufferDataSize, LAYOUT$maxTransformFeedbackBufferDataSize);}

    public int maxTransformFeedbackBufferDataStride() {return this.ptr.get(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride);}
    public void maxTransformFeedbackBufferDataStride(int value) {this.ptr.set(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride, value);}
    public java.lang.foreign.MemorySegment maxTransformFeedbackBufferDataStride_ptr() {return this.ptr.asSlice(OFFSET$maxTransformFeedbackBufferDataStride, LAYOUT$maxTransformFeedbackBufferDataStride);}

    public int transformFeedbackQueries() {return this.ptr.get(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries);}
    public void transformFeedbackQueries(int value) {this.ptr.set(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries, value);}
    public java.lang.foreign.MemorySegment transformFeedbackQueries_ptr() {return this.ptr.asSlice(OFFSET$transformFeedbackQueries, LAYOUT$transformFeedbackQueries);}

    public int transformFeedbackStreamsLinesTriangles() {return this.ptr.get(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles);}
    public void transformFeedbackStreamsLinesTriangles(int value) {this.ptr.set(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles, value);}
    public java.lang.foreign.MemorySegment transformFeedbackStreamsLinesTriangles_ptr() {return this.ptr.asSlice(OFFSET$transformFeedbackStreamsLinesTriangles, LAYOUT$transformFeedbackStreamsLinesTriangles);}

    public int transformFeedbackRasterizationStreamSelect() {return this.ptr.get(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect);}
    public void transformFeedbackRasterizationStreamSelect(int value) {this.ptr.set(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect, value);}
    public java.lang.foreign.MemorySegment transformFeedbackRasterizationStreamSelect_ptr() {return this.ptr.asSlice(OFFSET$transformFeedbackRasterizationStreamSelect, LAYOUT$transformFeedbackRasterizationStreamSelect);}

    public int transformFeedbackDraw() {return this.ptr.get(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw);}
    public void transformFeedbackDraw(int value) {this.ptr.set(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw, value);}
    public java.lang.foreign.MemorySegment transformFeedbackDraw_ptr() {return this.ptr.asSlice(OFFSET$transformFeedbackDraw, LAYOUT$transformFeedbackDraw);}
}

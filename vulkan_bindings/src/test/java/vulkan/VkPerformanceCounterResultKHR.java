package vulkan;

public record VkPerformanceCounterResultKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$int32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$int32 = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$int64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$int64 = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$uint32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$uint32 = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$uint64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$uint64 = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$float32 = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$float32 = 0L;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$float64 = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$float64 = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$int32,
            LAYOUT$int64,
            LAYOUT$uint32,
            LAYOUT$uint64,
            LAYOUT$float32,
            LAYOUT$float64
    ).withName("VkPerformanceCounterResultKHR");

    public VkPerformanceCounterResultKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int int32() {return this.ptr.get(LAYOUT$int32, OFFSET$int32);}
    public void int32(int value) {this.ptr.set(LAYOUT$int32, OFFSET$int32, value);}
    public java.lang.foreign.MemorySegment int32_ptr() {return this.ptr.asSlice(OFFSET$int32, LAYOUT$int32);}

    public long int64() {return this.ptr.get(LAYOUT$int64, OFFSET$int64);}
    public void int64(long value) {this.ptr.set(LAYOUT$int64, OFFSET$int64, value);}
    public java.lang.foreign.MemorySegment int64_ptr() {return this.ptr.asSlice(OFFSET$int64, LAYOUT$int64);}

    public int uint32() {return this.ptr.get(LAYOUT$uint32, OFFSET$uint32);}
    public void uint32(int value) {this.ptr.set(LAYOUT$uint32, OFFSET$uint32, value);}
    public java.lang.foreign.MemorySegment uint32_ptr() {return this.ptr.asSlice(OFFSET$uint32, LAYOUT$uint32);}

    public long uint64() {return this.ptr.get(LAYOUT$uint64, OFFSET$uint64);}
    public void uint64(long value) {this.ptr.set(LAYOUT$uint64, OFFSET$uint64, value);}
    public java.lang.foreign.MemorySegment uint64_ptr() {return this.ptr.asSlice(OFFSET$uint64, LAYOUT$uint64);}

    public float float32() {return this.ptr.get(LAYOUT$float32, OFFSET$float32);}
    public void float32(float value) {this.ptr.set(LAYOUT$float32, OFFSET$float32, value);}
    public java.lang.foreign.MemorySegment float32_ptr() {return this.ptr.asSlice(OFFSET$float32, LAYOUT$float32);}

    public double float64() {return this.ptr.get(LAYOUT$float64, OFFSET$float64);}
    public void float64(double value) {this.ptr.set(LAYOUT$float64, OFFSET$float64, value);}
    public java.lang.foreign.MemorySegment float64_ptr() {return this.ptr.asSlice(OFFSET$float64, LAYOUT$float64);}
}

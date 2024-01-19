package vulkan;

public record VkPipelineExecutableStatisticValueKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$b32 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$b32 = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$i64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$i64 = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$u64 = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$u64 = 0L;
    public static final java.lang.foreign.ValueLayout.OfDouble LAYOUT$f64 = java.lang.foreign.ValueLayout.JAVA_DOUBLE;
    public static final long OFFSET$f64 = 0L;

    public static final java.lang.foreign.UnionLayout gStructLayout = java.lang.foreign.MemoryLayout.unionLayout(
            LAYOUT$b32,
            LAYOUT$i64,
            LAYOUT$u64,
            LAYOUT$f64
    ).withName("VkPipelineExecutableStatisticValueKHR");

    public VkPipelineExecutableStatisticValueKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int b32() {return this.ptr.get(LAYOUT$b32, OFFSET$b32);}
    public void b32(int value) {this.ptr.set(LAYOUT$b32, OFFSET$b32, value);}
    public java.lang.foreign.MemorySegment b32_ptr() {return this.ptr.asSlice(OFFSET$b32, LAYOUT$b32);}

    public long i64() {return this.ptr.get(LAYOUT$i64, OFFSET$i64);}
    public void i64(long value) {this.ptr.set(LAYOUT$i64, OFFSET$i64, value);}
    public java.lang.foreign.MemorySegment i64_ptr() {return this.ptr.asSlice(OFFSET$i64, LAYOUT$i64);}

    public long u64() {return this.ptr.get(LAYOUT$u64, OFFSET$u64);}
    public void u64(long value) {this.ptr.set(LAYOUT$u64, OFFSET$u64, value);}
    public java.lang.foreign.MemorySegment u64_ptr() {return this.ptr.asSlice(OFFSET$u64, LAYOUT$u64);}

    public double f64() {return this.ptr.get(LAYOUT$f64, OFFSET$f64);}
    public void f64(double value) {this.ptr.set(LAYOUT$f64, OFFSET$f64, value);}
    public java.lang.foreign.MemorySegment f64_ptr() {return this.ptr.asSlice(OFFSET$f64, LAYOUT$f64);}
}

package vulkan;

public record VkMicromapUsageEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$count = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$subdivisionLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$subdivisionLevel = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$format = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$count,
            LAYOUT$subdivisionLevel,
            LAYOUT$format
    ).withName("VkMicromapUsageEXT");

    public VkMicromapUsageEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int count() {return this.ptr.get(LAYOUT$count, OFFSET$count);}
    public void count(int value) {this.ptr.set(LAYOUT$count, OFFSET$count, value);}
    public java.lang.foreign.MemorySegment count_ptr() {return this.ptr.asSlice(OFFSET$count, LAYOUT$count);}

    public int subdivisionLevel() {return this.ptr.get(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel);}
    public void subdivisionLevel(int value) {this.ptr.set(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel, value);}
    public java.lang.foreign.MemorySegment subdivisionLevel_ptr() {return this.ptr.asSlice(OFFSET$subdivisionLevel, LAYOUT$subdivisionLevel);}

    public int format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
    public void format(int value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
    public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}
}

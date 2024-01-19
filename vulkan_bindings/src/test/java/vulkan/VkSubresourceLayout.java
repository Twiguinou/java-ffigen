package vulkan;

public record VkSubresourceLayout(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$size = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$rowPitch = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$rowPitch = 16L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$arrayPitch = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$arrayPitch = 24L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$depthPitch = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$depthPitch = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$offset,
            LAYOUT$size,
            LAYOUT$rowPitch,
            LAYOUT$arrayPitch,
            LAYOUT$depthPitch
    ).withName("VkSubresourceLayout");

    public VkSubresourceLayout(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

    public long size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(long value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}

    public long rowPitch() {return this.ptr.get(LAYOUT$rowPitch, OFFSET$rowPitch);}
    public void rowPitch(long value) {this.ptr.set(LAYOUT$rowPitch, OFFSET$rowPitch, value);}
    public java.lang.foreign.MemorySegment rowPitch_ptr() {return this.ptr.asSlice(OFFSET$rowPitch, LAYOUT$rowPitch);}

    public long arrayPitch() {return this.ptr.get(LAYOUT$arrayPitch, OFFSET$arrayPitch);}
    public void arrayPitch(long value) {this.ptr.set(LAYOUT$arrayPitch, OFFSET$arrayPitch, value);}
    public java.lang.foreign.MemorySegment arrayPitch_ptr() {return this.ptr.asSlice(OFFSET$arrayPitch, LAYOUT$arrayPitch);}

    public long depthPitch() {return this.ptr.get(LAYOUT$depthPitch, OFFSET$depthPitch);}
    public void depthPitch(long value) {this.ptr.set(LAYOUT$depthPitch, OFFSET$depthPitch, value);}
    public java.lang.foreign.MemorySegment depthPitch_ptr() {return this.ptr.asSlice(OFFSET$depthPitch, LAYOUT$depthPitch);}
}

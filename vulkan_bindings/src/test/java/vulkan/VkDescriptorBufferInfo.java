package vulkan;

public record VkDescriptorBufferInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$buffer = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$buffer = 0L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$offset = 8L;
    public static final java.lang.foreign.ValueLayout.OfLong LAYOUT$range = java.lang.foreign.ValueLayout.JAVA_LONG;
    public static final long OFFSET$range = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$buffer,
            LAYOUT$offset,
            LAYOUT$range
    ).withName("VkDescriptorBufferInfo");

    public VkDescriptorBufferInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment buffer() {return this.ptr.get(LAYOUT$buffer, OFFSET$buffer);}
    public void buffer(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$buffer, OFFSET$buffer, value);}
    public java.lang.foreign.MemorySegment buffer_ptr() {return this.ptr.asSlice(OFFSET$buffer, LAYOUT$buffer);}

    public long offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(long value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

    public long range() {return this.ptr.get(LAYOUT$range, OFFSET$range);}
    public void range(long value) {this.ptr.set(LAYOUT$range, OFFSET$range, value);}
    public java.lang.foreign.MemorySegment range_ptr() {return this.ptr.asSlice(OFFSET$range, LAYOUT$range);}
}

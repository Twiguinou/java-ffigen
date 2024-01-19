package vulkan;

public record VkMicromapTriangleEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dataOffset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dataOffset = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$subdivisionLevel = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$subdivisionLevel = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$format = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$format = 6L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$dataOffset,
            LAYOUT$subdivisionLevel,
            LAYOUT$format
    ).withName("VkMicromapTriangleEXT");

    public VkMicromapTriangleEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int dataOffset() {return this.ptr.get(LAYOUT$dataOffset, OFFSET$dataOffset);}
    public void dataOffset(int value) {this.ptr.set(LAYOUT$dataOffset, OFFSET$dataOffset, value);}
    public java.lang.foreign.MemorySegment dataOffset_ptr() {return this.ptr.asSlice(OFFSET$dataOffset, LAYOUT$dataOffset);}

    public short subdivisionLevel() {return this.ptr.get(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel);}
    public void subdivisionLevel(short value) {this.ptr.set(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel, value);}
    public java.lang.foreign.MemorySegment subdivisionLevel_ptr() {return this.ptr.asSlice(OFFSET$subdivisionLevel, LAYOUT$subdivisionLevel);}

    public short format() {return this.ptr.get(LAYOUT$format, OFFSET$format);}
    public void format(short value) {this.ptr.set(LAYOUT$format, OFFSET$format, value);}
    public java.lang.foreign.MemorySegment format_ptr() {return this.ptr.asSlice(OFFSET$format, LAYOUT$format);}
}

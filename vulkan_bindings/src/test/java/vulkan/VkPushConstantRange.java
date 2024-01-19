package vulkan;

public record VkPushConstantRange(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stageFlags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stageFlags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$offset = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$offset = 4L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$size = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$size = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$stageFlags,
            LAYOUT$offset,
            LAYOUT$size
    ).withName("VkPushConstantRange");

    public VkPushConstantRange(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int stageFlags() {return this.ptr.get(LAYOUT$stageFlags, OFFSET$stageFlags);}
    public void stageFlags(int value) {this.ptr.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);}
    public java.lang.foreign.MemorySegment stageFlags_ptr() {return this.ptr.asSlice(OFFSET$stageFlags, LAYOUT$stageFlags);}

    public int offset() {return this.ptr.get(LAYOUT$offset, OFFSET$offset);}
    public void offset(int value) {this.ptr.set(LAYOUT$offset, OFFSET$offset, value);}
    public java.lang.foreign.MemorySegment offset_ptr() {return this.ptr.asSlice(OFFSET$offset, LAYOUT$offset);}

    public int size() {return this.ptr.get(LAYOUT$size, OFFSET$size);}
    public void size(int value) {this.ptr.set(LAYOUT$size, OFFSET$size, value);}
    public java.lang.foreign.MemorySegment size_ptr() {return this.ptr.asSlice(OFFSET$size, LAYOUT$size);}
}

package vulkan;

public record VkViewport(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$x = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$x = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$y = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$y = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$width = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$height = 12L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$minDepth = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$minDepth = 16L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$maxDepth = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$maxDepth = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$x,
            LAYOUT$y,
            LAYOUT$width,
            LAYOUT$height,
            LAYOUT$minDepth,
            LAYOUT$maxDepth
    ).withName("VkViewport");

    public VkViewport(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public float x() {return this.ptr.get(LAYOUT$x, OFFSET$x);}
    public void x(float value) {this.ptr.set(LAYOUT$x, OFFSET$x, value);}
    public java.lang.foreign.MemorySegment x_ptr() {return this.ptr.asSlice(OFFSET$x, LAYOUT$x);}

    public float y() {return this.ptr.get(LAYOUT$y, OFFSET$y);}
    public void y(float value) {this.ptr.set(LAYOUT$y, OFFSET$y, value);}
    public java.lang.foreign.MemorySegment y_ptr() {return this.ptr.asSlice(OFFSET$y, LAYOUT$y);}

    public float width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
    public void width(float value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
    public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

    public float height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(float value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public float minDepth() {return this.ptr.get(LAYOUT$minDepth, OFFSET$minDepth);}
    public void minDepth(float value) {this.ptr.set(LAYOUT$minDepth, OFFSET$minDepth, value);}
    public java.lang.foreign.MemorySegment minDepth_ptr() {return this.ptr.asSlice(OFFSET$minDepth, LAYOUT$minDepth);}

    public float maxDepth() {return this.ptr.get(LAYOUT$maxDepth, OFFSET$maxDepth);}
    public void maxDepth(float value) {this.ptr.set(LAYOUT$maxDepth, OFFSET$maxDepth, value);}
    public java.lang.foreign.MemorySegment maxDepth_ptr() {return this.ptr.asSlice(OFFSET$maxDepth, LAYOUT$maxDepth);}
}

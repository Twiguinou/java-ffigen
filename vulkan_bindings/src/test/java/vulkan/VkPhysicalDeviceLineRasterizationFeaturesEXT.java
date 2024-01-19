package vulkan;

public record VkPhysicalDeviceLineRasterizationFeaturesEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$rectangularLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$rectangularLines = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$bresenhamLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$bresenhamLines = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$smoothLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$smoothLines = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stippledRectangularLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stippledRectangularLines = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stippledBresenhamLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stippledBresenhamLines = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stippledSmoothLines = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stippledSmoothLines = 36L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$rectangularLines,
            LAYOUT$bresenhamLines,
            LAYOUT$smoothLines,
            LAYOUT$stippledRectangularLines,
            LAYOUT$stippledBresenhamLines,
            LAYOUT$stippledSmoothLines
    ).withName("VkPhysicalDeviceLineRasterizationFeaturesEXT");

    public VkPhysicalDeviceLineRasterizationFeaturesEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int rectangularLines() {return this.ptr.get(LAYOUT$rectangularLines, OFFSET$rectangularLines);}
    public void rectangularLines(int value) {this.ptr.set(LAYOUT$rectangularLines, OFFSET$rectangularLines, value);}
    public java.lang.foreign.MemorySegment rectangularLines_ptr() {return this.ptr.asSlice(OFFSET$rectangularLines, LAYOUT$rectangularLines);}

    public int bresenhamLines() {return this.ptr.get(LAYOUT$bresenhamLines, OFFSET$bresenhamLines);}
    public void bresenhamLines(int value) {this.ptr.set(LAYOUT$bresenhamLines, OFFSET$bresenhamLines, value);}
    public java.lang.foreign.MemorySegment bresenhamLines_ptr() {return this.ptr.asSlice(OFFSET$bresenhamLines, LAYOUT$bresenhamLines);}

    public int smoothLines() {return this.ptr.get(LAYOUT$smoothLines, OFFSET$smoothLines);}
    public void smoothLines(int value) {this.ptr.set(LAYOUT$smoothLines, OFFSET$smoothLines, value);}
    public java.lang.foreign.MemorySegment smoothLines_ptr() {return this.ptr.asSlice(OFFSET$smoothLines, LAYOUT$smoothLines);}

    public int stippledRectangularLines() {return this.ptr.get(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines);}
    public void stippledRectangularLines(int value) {this.ptr.set(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines, value);}
    public java.lang.foreign.MemorySegment stippledRectangularLines_ptr() {return this.ptr.asSlice(OFFSET$stippledRectangularLines, LAYOUT$stippledRectangularLines);}

    public int stippledBresenhamLines() {return this.ptr.get(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines);}
    public void stippledBresenhamLines(int value) {this.ptr.set(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines, value);}
    public java.lang.foreign.MemorySegment stippledBresenhamLines_ptr() {return this.ptr.asSlice(OFFSET$stippledBresenhamLines, LAYOUT$stippledBresenhamLines);}

    public int stippledSmoothLines() {return this.ptr.get(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines);}
    public void stippledSmoothLines(int value) {this.ptr.set(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines, value);}
    public java.lang.foreign.MemorySegment stippledSmoothLines_ptr() {return this.ptr.asSlice(OFFSET$stippledSmoothLines, LAYOUT$stippledSmoothLines);}
}

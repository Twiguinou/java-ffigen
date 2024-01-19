package vulkan;

public record VkOpticalFlowSessionCreateInfoNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$width = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$width = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$height = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$height = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$imageFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$imageFormat = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flowVectorFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flowVectorFormat = 28L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$costFormat = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$costFormat = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$outputGridSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$outputGridSize = 36L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$hintGridSize = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$hintGridSize = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$performanceLevel = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$performanceLevel = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$width,
            LAYOUT$height,
            LAYOUT$imageFormat,
            LAYOUT$flowVectorFormat,
            LAYOUT$costFormat,
            LAYOUT$outputGridSize,
            LAYOUT$hintGridSize,
            LAYOUT$performanceLevel,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkOpticalFlowSessionCreateInfoNV");

    public VkOpticalFlowSessionCreateInfoNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int width() {return this.ptr.get(LAYOUT$width, OFFSET$width);}
    public void width(int value) {this.ptr.set(LAYOUT$width, OFFSET$width, value);}
    public java.lang.foreign.MemorySegment width_ptr() {return this.ptr.asSlice(OFFSET$width, LAYOUT$width);}

    public int height() {return this.ptr.get(LAYOUT$height, OFFSET$height);}
    public void height(int value) {this.ptr.set(LAYOUT$height, OFFSET$height, value);}
    public java.lang.foreign.MemorySegment height_ptr() {return this.ptr.asSlice(OFFSET$height, LAYOUT$height);}

    public int imageFormat() {return this.ptr.get(LAYOUT$imageFormat, OFFSET$imageFormat);}
    public void imageFormat(int value) {this.ptr.set(LAYOUT$imageFormat, OFFSET$imageFormat, value);}
    public java.lang.foreign.MemorySegment imageFormat_ptr() {return this.ptr.asSlice(OFFSET$imageFormat, LAYOUT$imageFormat);}

    public int flowVectorFormat() {return this.ptr.get(LAYOUT$flowVectorFormat, OFFSET$flowVectorFormat);}
    public void flowVectorFormat(int value) {this.ptr.set(LAYOUT$flowVectorFormat, OFFSET$flowVectorFormat, value);}
    public java.lang.foreign.MemorySegment flowVectorFormat_ptr() {return this.ptr.asSlice(OFFSET$flowVectorFormat, LAYOUT$flowVectorFormat);}

    public int costFormat() {return this.ptr.get(LAYOUT$costFormat, OFFSET$costFormat);}
    public void costFormat(int value) {this.ptr.set(LAYOUT$costFormat, OFFSET$costFormat, value);}
    public java.lang.foreign.MemorySegment costFormat_ptr() {return this.ptr.asSlice(OFFSET$costFormat, LAYOUT$costFormat);}

    public int outputGridSize() {return this.ptr.get(LAYOUT$outputGridSize, OFFSET$outputGridSize);}
    public void outputGridSize(int value) {this.ptr.set(LAYOUT$outputGridSize, OFFSET$outputGridSize, value);}
    public java.lang.foreign.MemorySegment outputGridSize_ptr() {return this.ptr.asSlice(OFFSET$outputGridSize, LAYOUT$outputGridSize);}

    public int hintGridSize() {return this.ptr.get(LAYOUT$hintGridSize, OFFSET$hintGridSize);}
    public void hintGridSize(int value) {this.ptr.set(LAYOUT$hintGridSize, OFFSET$hintGridSize, value);}
    public java.lang.foreign.MemorySegment hintGridSize_ptr() {return this.ptr.asSlice(OFFSET$hintGridSize, LAYOUT$hintGridSize);}

    public int performanceLevel() {return this.ptr.get(LAYOUT$performanceLevel, OFFSET$performanceLevel);}
    public void performanceLevel(int value) {this.ptr.set(LAYOUT$performanceLevel, OFFSET$performanceLevel, value);}
    public java.lang.foreign.MemorySegment performanceLevel_ptr() {return this.ptr.asSlice(OFFSET$performanceLevel, LAYOUT$performanceLevel);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}
}

package vulkan;

public record VkPipelineRasterizationLineStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$lineRasterizationMode = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$lineRasterizationMode = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stippledLineEnable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stippledLineEnable = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$lineStippleFactor = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$lineStippleFactor = 24L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$lineStipplePattern = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$lineStipplePattern = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$lineRasterizationMode,
            LAYOUT$stippledLineEnable,
            LAYOUT$lineStippleFactor,
            LAYOUT$lineStipplePattern,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withName("VkPipelineRasterizationLineStateCreateInfoEXT");

    public VkPipelineRasterizationLineStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int lineRasterizationMode() {return this.ptr.get(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode);}
    public void lineRasterizationMode(int value) {this.ptr.set(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode, value);}
    public java.lang.foreign.MemorySegment lineRasterizationMode_ptr() {return this.ptr.asSlice(OFFSET$lineRasterizationMode, LAYOUT$lineRasterizationMode);}

    public int stippledLineEnable() {return this.ptr.get(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable);}
    public void stippledLineEnable(int value) {this.ptr.set(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable, value);}
    public java.lang.foreign.MemorySegment stippledLineEnable_ptr() {return this.ptr.asSlice(OFFSET$stippledLineEnable, LAYOUT$stippledLineEnable);}

    public int lineStippleFactor() {return this.ptr.get(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor);}
    public void lineStippleFactor(int value) {this.ptr.set(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor, value);}
    public java.lang.foreign.MemorySegment lineStippleFactor_ptr() {return this.ptr.asSlice(OFFSET$lineStippleFactor, LAYOUT$lineStippleFactor);}

    public short lineStipplePattern() {return this.ptr.get(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern);}
    public void lineStipplePattern(short value) {this.ptr.set(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern, value);}
    public java.lang.foreign.MemorySegment lineStipplePattern_ptr() {return this.ptr.asSlice(OFFSET$lineStipplePattern, LAYOUT$lineStipplePattern);}
}

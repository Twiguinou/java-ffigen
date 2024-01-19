package vulkan;

public record VkDebugUtilsLabelEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pLabelName = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pLabelName = 16L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$color = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_FLOAT);
    public static final long OFFSET$color = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$pLabelName,
            LAYOUT$color
    ).withName("VkDebugUtilsLabelEXT");

    public VkDebugUtilsLabelEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment pLabelName() {return this.ptr.get(LAYOUT$pLabelName, OFFSET$pLabelName);}
    public void pLabelName(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pLabelName, OFFSET$pLabelName, value);}
    public java.lang.foreign.MemorySegment pLabelName_ptr() {return this.ptr.asSlice(OFFSET$pLabelName, LAYOUT$pLabelName);}

    public java.lang.foreign.MemorySegment color() {return this.ptr.asSlice(OFFSET$color, LAYOUT$color);}
    public float color(int i) {return this.color().getAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i);}
    public void color(int i, float value) {this.color().setAtIndex(java.lang.foreign.ValueLayout.JAVA_FLOAT, i, value);}
}

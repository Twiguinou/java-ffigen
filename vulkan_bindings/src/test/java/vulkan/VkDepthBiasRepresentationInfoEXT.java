package vulkan;

public record VkDepthBiasRepresentationInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBiasRepresentation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthBiasRepresentation = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$depthBiasExact = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$depthBiasExact = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$depthBiasRepresentation,
            LAYOUT$depthBiasExact
    ).withName("VkDepthBiasRepresentationInfoEXT");

    public VkDepthBiasRepresentationInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int depthBiasRepresentation() {return this.ptr.get(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation);}
    public void depthBiasRepresentation(int value) {this.ptr.set(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation, value);}
    public java.lang.foreign.MemorySegment depthBiasRepresentation_ptr() {return this.ptr.asSlice(OFFSET$depthBiasRepresentation, LAYOUT$depthBiasRepresentation);}

    public int depthBiasExact() {return this.ptr.get(LAYOUT$depthBiasExact, OFFSET$depthBiasExact);}
    public void depthBiasExact(int value) {this.ptr.set(LAYOUT$depthBiasExact, OFFSET$depthBiasExact, value);}
    public java.lang.foreign.MemorySegment depthBiasExact_ptr() {return this.ptr.asSlice(OFFSET$depthBiasExact, LAYOUT$depthBiasExact);}
}

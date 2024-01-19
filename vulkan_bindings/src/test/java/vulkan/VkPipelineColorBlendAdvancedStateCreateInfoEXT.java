package vulkan;

public record VkPipelineColorBlendAdvancedStateCreateInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$srcPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$srcPremultiplied = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstPremultiplied = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dstPremultiplied = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$blendOverlap = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$blendOverlap = 24L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$srcPremultiplied,
            LAYOUT$dstPremultiplied,
            LAYOUT$blendOverlap,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("VkPipelineColorBlendAdvancedStateCreateInfoEXT");

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int srcPremultiplied() {return this.ptr.get(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied);}
    public void srcPremultiplied(int value) {this.ptr.set(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied, value);}
    public java.lang.foreign.MemorySegment srcPremultiplied_ptr() {return this.ptr.asSlice(OFFSET$srcPremultiplied, LAYOUT$srcPremultiplied);}

    public int dstPremultiplied() {return this.ptr.get(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied);}
    public void dstPremultiplied(int value) {this.ptr.set(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied, value);}
    public java.lang.foreign.MemorySegment dstPremultiplied_ptr() {return this.ptr.asSlice(OFFSET$dstPremultiplied, LAYOUT$dstPremultiplied);}

    public int blendOverlap() {return this.ptr.get(LAYOUT$blendOverlap, OFFSET$blendOverlap);}
    public void blendOverlap(int value) {this.ptr.set(LAYOUT$blendOverlap, OFFSET$blendOverlap, value);}
    public java.lang.foreign.MemorySegment blendOverlap_ptr() {return this.ptr.asSlice(OFFSET$blendOverlap, LAYOUT$blendOverlap);}
}

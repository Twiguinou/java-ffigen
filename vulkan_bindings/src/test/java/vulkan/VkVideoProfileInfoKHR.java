package vulkan;

public record VkVideoProfileInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$videoCodecOperation = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$videoCodecOperation = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$chromaSubsampling = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$chromaSubsampling = 20L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$lumaBitDepth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$lumaBitDepth = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$chromaBitDepth = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$chromaBitDepth = 28L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$videoCodecOperation,
            LAYOUT$chromaSubsampling,
            LAYOUT$lumaBitDepth,
            LAYOUT$chromaBitDepth
    ).withName("VkVideoProfileInfoKHR");

    public VkVideoProfileInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int videoCodecOperation() {return this.ptr.get(LAYOUT$videoCodecOperation, OFFSET$videoCodecOperation);}
    public void videoCodecOperation(int value) {this.ptr.set(LAYOUT$videoCodecOperation, OFFSET$videoCodecOperation, value);}
    public java.lang.foreign.MemorySegment videoCodecOperation_ptr() {return this.ptr.asSlice(OFFSET$videoCodecOperation, LAYOUT$videoCodecOperation);}

    public int chromaSubsampling() {return this.ptr.get(LAYOUT$chromaSubsampling, OFFSET$chromaSubsampling);}
    public void chromaSubsampling(int value) {this.ptr.set(LAYOUT$chromaSubsampling, OFFSET$chromaSubsampling, value);}
    public java.lang.foreign.MemorySegment chromaSubsampling_ptr() {return this.ptr.asSlice(OFFSET$chromaSubsampling, LAYOUT$chromaSubsampling);}

    public int lumaBitDepth() {return this.ptr.get(LAYOUT$lumaBitDepth, OFFSET$lumaBitDepth);}
    public void lumaBitDepth(int value) {this.ptr.set(LAYOUT$lumaBitDepth, OFFSET$lumaBitDepth, value);}
    public java.lang.foreign.MemorySegment lumaBitDepth_ptr() {return this.ptr.asSlice(OFFSET$lumaBitDepth, LAYOUT$lumaBitDepth);}

    public int chromaBitDepth() {return this.ptr.get(LAYOUT$chromaBitDepth, OFFSET$chromaBitDepth);}
    public void chromaBitDepth(int value) {this.ptr.set(LAYOUT$chromaBitDepth, OFFSET$chromaBitDepth, value);}
    public java.lang.foreign.MemorySegment chromaBitDepth_ptr() {return this.ptr.asSlice(OFFSET$chromaBitDepth, LAYOUT$chromaBitDepth);}
}

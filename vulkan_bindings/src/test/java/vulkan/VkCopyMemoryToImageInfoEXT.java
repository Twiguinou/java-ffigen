package vulkan;

public record VkCopyMemoryToImageInfoEXT(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$flags = 16L;
    public static final java.lang.foreign.AddressLayout LAYOUT$dstImage = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$dstImage = 24L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dstImageLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$dstImageLayout = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$regionCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$regionCount = 36L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pRegions = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pRegions = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$dstImage,
            LAYOUT$dstImageLayout,
            LAYOUT$regionCount,
            LAYOUT$pRegions
    ).withName("VkCopyMemoryToImageInfoEXT");

    public VkCopyMemoryToImageInfoEXT(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int flags() {return this.ptr.get(LAYOUT$flags, OFFSET$flags);}
    public void flags(int value) {this.ptr.set(LAYOUT$flags, OFFSET$flags, value);}
    public java.lang.foreign.MemorySegment flags_ptr() {return this.ptr.asSlice(OFFSET$flags, LAYOUT$flags);}

    public java.lang.foreign.MemorySegment dstImage() {return this.ptr.get(LAYOUT$dstImage, OFFSET$dstImage);}
    public void dstImage(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$dstImage, OFFSET$dstImage, value);}
    public java.lang.foreign.MemorySegment dstImage_ptr() {return this.ptr.asSlice(OFFSET$dstImage, LAYOUT$dstImage);}

    public int dstImageLayout() {return this.ptr.get(LAYOUT$dstImageLayout, OFFSET$dstImageLayout);}
    public void dstImageLayout(int value) {this.ptr.set(LAYOUT$dstImageLayout, OFFSET$dstImageLayout, value);}
    public java.lang.foreign.MemorySegment dstImageLayout_ptr() {return this.ptr.asSlice(OFFSET$dstImageLayout, LAYOUT$dstImageLayout);}

    public int regionCount() {return this.ptr.get(LAYOUT$regionCount, OFFSET$regionCount);}
    public void regionCount(int value) {this.ptr.set(LAYOUT$regionCount, OFFSET$regionCount, value);}
    public java.lang.foreign.MemorySegment regionCount_ptr() {return this.ptr.asSlice(OFFSET$regionCount, LAYOUT$regionCount);}

    public java.lang.foreign.MemorySegment pRegions() {return this.ptr.get(LAYOUT$pRegions, OFFSET$pRegions);}
    public void pRegions(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pRegions, OFFSET$pRegions, value);}
    public java.lang.foreign.MemorySegment pRegions_ptr() {return this.ptr.asSlice(OFFSET$pRegions, LAYOUT$pRegions);}
}

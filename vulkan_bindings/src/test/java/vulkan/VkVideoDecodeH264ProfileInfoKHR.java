package vulkan;

public record VkVideoDecodeH264ProfileInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$stdProfileIdc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$stdProfileIdc = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pictureLayout = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$pictureLayout = 20L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$stdProfileIdc,
            LAYOUT$pictureLayout
    ).withName("VkVideoDecodeH264ProfileInfoKHR");

    public VkVideoDecodeH264ProfileInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public int stdProfileIdc() {return this.ptr.get(LAYOUT$stdProfileIdc, OFFSET$stdProfileIdc);}
    public void stdProfileIdc(int value) {this.ptr.set(LAYOUT$stdProfileIdc, OFFSET$stdProfileIdc, value);}
    public java.lang.foreign.MemorySegment stdProfileIdc_ptr() {return this.ptr.asSlice(OFFSET$stdProfileIdc, LAYOUT$stdProfileIdc);}

    public int pictureLayout() {return this.ptr.get(LAYOUT$pictureLayout, OFFSET$pictureLayout);}
    public void pictureLayout(int value) {this.ptr.set(LAYOUT$pictureLayout, OFFSET$pictureLayout, value);}
    public java.lang.foreign.MemorySegment pictureLayout_ptr() {return this.ptr.asSlice(OFFSET$pictureLayout, LAYOUT$pictureLayout);}
}

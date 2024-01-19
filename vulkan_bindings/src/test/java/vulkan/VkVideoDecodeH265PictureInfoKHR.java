package vulkan;

public record VkVideoDecodeH265PictureInfoKHR(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sType = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sType = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pNext = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pNext = 8L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pStdPictureInfo = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pStdPictureInfo = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$sliceSegmentCount = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$sliceSegmentCount = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pSliceSegmentOffsets = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pSliceSegmentOffsets = 32L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sType,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pNext,
            LAYOUT$pStdPictureInfo,
            LAYOUT$sliceSegmentCount,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$pSliceSegmentOffsets
    ).withName("VkVideoDecodeH265PictureInfoKHR");

    public VkVideoDecodeH265PictureInfoKHR(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int sType() {return this.ptr.get(LAYOUT$sType, OFFSET$sType);}
    public void sType(int value) {this.ptr.set(LAYOUT$sType, OFFSET$sType, value);}
    public java.lang.foreign.MemorySegment sType_ptr() {return this.ptr.asSlice(OFFSET$sType, LAYOUT$sType);}

    public java.lang.foreign.MemorySegment pNext() {return this.ptr.get(LAYOUT$pNext, OFFSET$pNext);}
    public void pNext(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pNext, OFFSET$pNext, value);}
    public java.lang.foreign.MemorySegment pNext_ptr() {return this.ptr.asSlice(OFFSET$pNext, LAYOUT$pNext);}

    public java.lang.foreign.MemorySegment pStdPictureInfo() {return this.ptr.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);}
    public void pStdPictureInfo(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);}
    public java.lang.foreign.MemorySegment pStdPictureInfo_ptr() {return this.ptr.asSlice(OFFSET$pStdPictureInfo, LAYOUT$pStdPictureInfo);}

    public int sliceSegmentCount() {return this.ptr.get(LAYOUT$sliceSegmentCount, OFFSET$sliceSegmentCount);}
    public void sliceSegmentCount(int value) {this.ptr.set(LAYOUT$sliceSegmentCount, OFFSET$sliceSegmentCount, value);}
    public java.lang.foreign.MemorySegment sliceSegmentCount_ptr() {return this.ptr.asSlice(OFFSET$sliceSegmentCount, LAYOUT$sliceSegmentCount);}

    public java.lang.foreign.MemorySegment pSliceSegmentOffsets() {return this.ptr.get(LAYOUT$pSliceSegmentOffsets, OFFSET$pSliceSegmentOffsets);}
    public void pSliceSegmentOffsets(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSliceSegmentOffsets, OFFSET$pSliceSegmentOffsets, value);}
    public java.lang.foreign.MemorySegment pSliceSegmentOffsets_ptr() {return this.ptr.asSlice(OFFSET$pSliceSegmentOffsets, LAYOUT$pSliceSegmentOffsets);}
}

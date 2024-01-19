package vulkan;

public record StdVideoDecodeH264ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoDecodeH264ReferenceInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$FrameNum = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$FrameNum = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$reserved = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$reserved = 6L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$PicOrderCnt = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$PicOrderCnt = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$FrameNum,
            LAYOUT$reserved,
            LAYOUT$PicOrderCnt
    ).withName("StdVideoDecodeH264ReferenceInfo");

    public StdVideoDecodeH264ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.StdVideoDecodeH264ReferenceInfoFlags flags() {return new vulkan.StdVideoDecodeH264ReferenceInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

    public short FrameNum() {return this.ptr.get(LAYOUT$FrameNum, OFFSET$FrameNum);}
    public void FrameNum(short value) {this.ptr.set(LAYOUT$FrameNum, OFFSET$FrameNum, value);}
    public java.lang.foreign.MemorySegment FrameNum_ptr() {return this.ptr.asSlice(OFFSET$FrameNum, LAYOUT$FrameNum);}

    public short reserved() {return this.ptr.get(LAYOUT$reserved, OFFSET$reserved);}
    public void reserved(short value) {this.ptr.set(LAYOUT$reserved, OFFSET$reserved, value);}
    public java.lang.foreign.MemorySegment reserved_ptr() {return this.ptr.asSlice(OFFSET$reserved, LAYOUT$reserved);}

    public java.lang.foreign.MemorySegment PicOrderCnt() {return this.ptr.asSlice(OFFSET$PicOrderCnt, LAYOUT$PicOrderCnt);}
    public int PicOrderCnt(int i) {return this.PicOrderCnt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void PicOrderCnt(int i, int value) {this.PicOrderCnt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}
}

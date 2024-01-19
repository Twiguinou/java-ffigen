package vulkan;

public record StdVideoH265DecPicBufMgr(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$max_latency_increase_plus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$max_latency_increase_plus1 = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$max_dec_pic_buffering_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$max_dec_pic_buffering_minus1 = 28L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$max_num_reorder_pics = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE);
    public static final long OFFSET$max_num_reorder_pics = 35L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$max_latency_increase_plus1,
            LAYOUT$max_dec_pic_buffering_minus1,
            LAYOUT$max_num_reorder_pics,
            java.lang.foreign.MemoryLayout.paddingLayout(2)
    ).withName("StdVideoH265DecPicBufMgr");

    public StdVideoH265DecPicBufMgr(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment max_latency_increase_plus1() {return this.ptr.asSlice(OFFSET$max_latency_increase_plus1, LAYOUT$max_latency_increase_plus1);}
    public int max_latency_increase_plus1(int i) {return this.max_latency_increase_plus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void max_latency_increase_plus1(int i, int value) {this.max_latency_increase_plus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public java.lang.foreign.MemorySegment max_dec_pic_buffering_minus1() {return this.ptr.asSlice(OFFSET$max_dec_pic_buffering_minus1, LAYOUT$max_dec_pic_buffering_minus1);}
    public char max_dec_pic_buffering_minus1(int i) {return (char)this.max_dec_pic_buffering_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void max_dec_pic_buffering_minus1(int i, char value) {this.max_dec_pic_buffering_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

    public java.lang.foreign.MemorySegment max_num_reorder_pics() {return this.ptr.asSlice(OFFSET$max_num_reorder_pics, LAYOUT$max_num_reorder_pics);}
    public char max_num_reorder_pics(int i) {return (char)this.max_num_reorder_pics().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
    public void max_num_reorder_pics(int i, char value) {this.max_num_reorder_pics().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}

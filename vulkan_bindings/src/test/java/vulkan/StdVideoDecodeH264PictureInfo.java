package vulkan;

public record StdVideoDecodeH264PictureInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoDecodeH264PictureInfoFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$seq_parameter_set_id = 4L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pic_parameter_set_id = 5L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$reserved1 = 6L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$reserved2 = 7L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$frame_num = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$frame_num = 8L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$idr_pic_id = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$idr_pic_id = 10L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$PicOrderCnt = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$PicOrderCnt = 12L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$seq_parameter_set_id,
            LAYOUT$pic_parameter_set_id,
            LAYOUT$reserved1,
            LAYOUT$reserved2,
            LAYOUT$frame_num,
            LAYOUT$idr_pic_id,
            LAYOUT$PicOrderCnt
    ).withName("StdVideoDecodeH264PictureInfo");

    public StdVideoDecodeH264PictureInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.StdVideoDecodeH264PictureInfoFlags flags() {return new vulkan.StdVideoDecodeH264PictureInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

    public char seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id);}
    public void seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$seq_parameter_set_id, LAYOUT$seq_parameter_set_id);}

    public char pic_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id);}
    public void pic_parameter_set_id(char value) {this.ptr.set(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment pic_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pic_parameter_set_id, LAYOUT$pic_parameter_set_id);}

    public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
    public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
    public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

    public char reserved2() {return (char)this.ptr.get(LAYOUT$reserved2, OFFSET$reserved2);}
    public void reserved2(char value) {this.ptr.set(LAYOUT$reserved2, OFFSET$reserved2, (byte)value);}
    public java.lang.foreign.MemorySegment reserved2_ptr() {return this.ptr.asSlice(OFFSET$reserved2, LAYOUT$reserved2);}

    public short frame_num() {return this.ptr.get(LAYOUT$frame_num, OFFSET$frame_num);}
    public void frame_num(short value) {this.ptr.set(LAYOUT$frame_num, OFFSET$frame_num, value);}
    public java.lang.foreign.MemorySegment frame_num_ptr() {return this.ptr.asSlice(OFFSET$frame_num, LAYOUT$frame_num);}

    public short idr_pic_id() {return this.ptr.get(LAYOUT$idr_pic_id, OFFSET$idr_pic_id);}
    public void idr_pic_id(short value) {this.ptr.set(LAYOUT$idr_pic_id, OFFSET$idr_pic_id, value);}
    public java.lang.foreign.MemorySegment idr_pic_id_ptr() {return this.ptr.asSlice(OFFSET$idr_pic_id, LAYOUT$idr_pic_id);}

    public java.lang.foreign.MemorySegment PicOrderCnt() {return this.ptr.asSlice(OFFSET$PicOrderCnt, LAYOUT$PicOrderCnt);}
    public int PicOrderCnt(int i) {return this.PicOrderCnt().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void PicOrderCnt(int i, int value) {this.PicOrderCnt().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}
}

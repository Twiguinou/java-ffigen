package vulkan;

public record StdVideoH265ShortTermRefPicSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH265ShortTermRefPicSetFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$delta_idx_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$delta_idx_minus1 = 4L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$use_delta_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$use_delta_flag = 8L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$abs_delta_rps_minus1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$abs_delta_rps_minus1 = 10L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$used_by_curr_pic_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$used_by_curr_pic_flag = 12L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$used_by_curr_pic_s0_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$used_by_curr_pic_s0_flag = 14L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$used_by_curr_pic_s1_flag = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$used_by_curr_pic_s1_flag = 16L;
    public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_SHORT;
    public static final long OFFSET$reserved1 = 18L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$reserved2 = 20L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved3 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$reserved3 = 21L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_negative_pics = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_negative_pics = 22L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_positive_pics = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_positive_pics = 23L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_poc_s0_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET$delta_poc_s0_minus1 = 24L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$delta_poc_s1_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_SHORT);
    public static final long OFFSET$delta_poc_s1_minus1 = 56L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$delta_idx_minus1,
            LAYOUT$use_delta_flag,
            LAYOUT$abs_delta_rps_minus1,
            LAYOUT$used_by_curr_pic_flag,
            LAYOUT$used_by_curr_pic_s0_flag,
            LAYOUT$used_by_curr_pic_s1_flag,
            LAYOUT$reserved1,
            LAYOUT$reserved2,
            LAYOUT$reserved3,
            LAYOUT$num_negative_pics,
            LAYOUT$num_positive_pics,
            LAYOUT$delta_poc_s0_minus1,
            LAYOUT$delta_poc_s1_minus1
    ).withName("StdVideoH265ShortTermRefPicSet");

    public StdVideoH265ShortTermRefPicSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.StdVideoH265ShortTermRefPicSetFlags flags() {return new vulkan.StdVideoH265ShortTermRefPicSetFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

    public int delta_idx_minus1() {return this.ptr.get(LAYOUT$delta_idx_minus1, OFFSET$delta_idx_minus1);}
    public void delta_idx_minus1(int value) {this.ptr.set(LAYOUT$delta_idx_minus1, OFFSET$delta_idx_minus1, value);}
    public java.lang.foreign.MemorySegment delta_idx_minus1_ptr() {return this.ptr.asSlice(OFFSET$delta_idx_minus1, LAYOUT$delta_idx_minus1);}

    public short use_delta_flag() {return this.ptr.get(LAYOUT$use_delta_flag, OFFSET$use_delta_flag);}
    public void use_delta_flag(short value) {this.ptr.set(LAYOUT$use_delta_flag, OFFSET$use_delta_flag, value);}
    public java.lang.foreign.MemorySegment use_delta_flag_ptr() {return this.ptr.asSlice(OFFSET$use_delta_flag, LAYOUT$use_delta_flag);}

    public short abs_delta_rps_minus1() {return this.ptr.get(LAYOUT$abs_delta_rps_minus1, OFFSET$abs_delta_rps_minus1);}
    public void abs_delta_rps_minus1(short value) {this.ptr.set(LAYOUT$abs_delta_rps_minus1, OFFSET$abs_delta_rps_minus1, value);}
    public java.lang.foreign.MemorySegment abs_delta_rps_minus1_ptr() {return this.ptr.asSlice(OFFSET$abs_delta_rps_minus1, LAYOUT$abs_delta_rps_minus1);}

    public short used_by_curr_pic_flag() {return this.ptr.get(LAYOUT$used_by_curr_pic_flag, OFFSET$used_by_curr_pic_flag);}
    public void used_by_curr_pic_flag(short value) {this.ptr.set(LAYOUT$used_by_curr_pic_flag, OFFSET$used_by_curr_pic_flag, value);}
    public java.lang.foreign.MemorySegment used_by_curr_pic_flag_ptr() {return this.ptr.asSlice(OFFSET$used_by_curr_pic_flag, LAYOUT$used_by_curr_pic_flag);}

    public short used_by_curr_pic_s0_flag() {return this.ptr.get(LAYOUT$used_by_curr_pic_s0_flag, OFFSET$used_by_curr_pic_s0_flag);}
    public void used_by_curr_pic_s0_flag(short value) {this.ptr.set(LAYOUT$used_by_curr_pic_s0_flag, OFFSET$used_by_curr_pic_s0_flag, value);}
    public java.lang.foreign.MemorySegment used_by_curr_pic_s0_flag_ptr() {return this.ptr.asSlice(OFFSET$used_by_curr_pic_s0_flag, LAYOUT$used_by_curr_pic_s0_flag);}

    public short used_by_curr_pic_s1_flag() {return this.ptr.get(LAYOUT$used_by_curr_pic_s1_flag, OFFSET$used_by_curr_pic_s1_flag);}
    public void used_by_curr_pic_s1_flag(short value) {this.ptr.set(LAYOUT$used_by_curr_pic_s1_flag, OFFSET$used_by_curr_pic_s1_flag, value);}
    public java.lang.foreign.MemorySegment used_by_curr_pic_s1_flag_ptr() {return this.ptr.asSlice(OFFSET$used_by_curr_pic_s1_flag, LAYOUT$used_by_curr_pic_s1_flag);}

    public short reserved1() {return this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
    public void reserved1(short value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, value);}
    public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

    public char reserved2() {return (char)this.ptr.get(LAYOUT$reserved2, OFFSET$reserved2);}
    public void reserved2(char value) {this.ptr.set(LAYOUT$reserved2, OFFSET$reserved2, (byte)value);}
    public java.lang.foreign.MemorySegment reserved2_ptr() {return this.ptr.asSlice(OFFSET$reserved2, LAYOUT$reserved2);}

    public char reserved3() {return (char)this.ptr.get(LAYOUT$reserved3, OFFSET$reserved3);}
    public void reserved3(char value) {this.ptr.set(LAYOUT$reserved3, OFFSET$reserved3, (byte)value);}
    public java.lang.foreign.MemorySegment reserved3_ptr() {return this.ptr.asSlice(OFFSET$reserved3, LAYOUT$reserved3);}

    public char num_negative_pics() {return (char)this.ptr.get(LAYOUT$num_negative_pics, OFFSET$num_negative_pics);}
    public void num_negative_pics(char value) {this.ptr.set(LAYOUT$num_negative_pics, OFFSET$num_negative_pics, (byte)value);}
    public java.lang.foreign.MemorySegment num_negative_pics_ptr() {return this.ptr.asSlice(OFFSET$num_negative_pics, LAYOUT$num_negative_pics);}

    public char num_positive_pics() {return (char)this.ptr.get(LAYOUT$num_positive_pics, OFFSET$num_positive_pics);}
    public void num_positive_pics(char value) {this.ptr.set(LAYOUT$num_positive_pics, OFFSET$num_positive_pics, (byte)value);}
    public java.lang.foreign.MemorySegment num_positive_pics_ptr() {return this.ptr.asSlice(OFFSET$num_positive_pics, LAYOUT$num_positive_pics);}

    public java.lang.foreign.MemorySegment delta_poc_s0_minus1() {return this.ptr.asSlice(OFFSET$delta_poc_s0_minus1, LAYOUT$delta_poc_s0_minus1);}
    public short delta_poc_s0_minus1(int i) {return this.delta_poc_s0_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i);}
    public void delta_poc_s0_minus1(int i, short value) {this.delta_poc_s0_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i, value);}

    public java.lang.foreign.MemorySegment delta_poc_s1_minus1() {return this.ptr.asSlice(OFFSET$delta_poc_s1_minus1, LAYOUT$delta_poc_s1_minus1);}
    public short delta_poc_s1_minus1(int i) {return this.delta_poc_s1_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i);}
    public void delta_poc_s1_minus1(int i, short value) {this.delta_poc_s1_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i, value);}
}

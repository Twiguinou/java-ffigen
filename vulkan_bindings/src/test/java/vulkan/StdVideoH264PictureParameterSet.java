package vulkan;

public record StdVideoH264PictureParameterSet(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH264PpsFlags.gStructLayout;
    public static final long OFFSET$flags = 0L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$seq_parameter_set_id = 4L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pic_parameter_set_id = 5L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l0_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_ref_idx_l0_default_active_minus1 = 6L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l1_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$num_ref_idx_l1_default_active_minus1 = 7L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$weighted_bipred_idc = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$weighted_bipred_idc = 8L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pic_init_qp_minus26 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pic_init_qp_minus26 = 12L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pic_init_qs_minus26 = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$pic_init_qs_minus26 = 13L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_qp_index_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$chroma_qp_index_offset = 14L;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$second_chroma_qp_index_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
    public static final long OFFSET$second_chroma_qp_index_offset = 15L;
    public static final java.lang.foreign.AddressLayout LAYOUT$pScalingLists = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$pScalingLists = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$flags,
            LAYOUT$seq_parameter_set_id,
            LAYOUT$pic_parameter_set_id,
            LAYOUT$num_ref_idx_l0_default_active_minus1,
            LAYOUT$num_ref_idx_l1_default_active_minus1,
            LAYOUT$weighted_bipred_idc,
            LAYOUT$pic_init_qp_minus26,
            LAYOUT$pic_init_qs_minus26,
            LAYOUT$chroma_qp_index_offset,
            LAYOUT$second_chroma_qp_index_offset,
            LAYOUT$pScalingLists
    ).withName("StdVideoH264PictureParameterSet");

    public StdVideoH264PictureParameterSet(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public vulkan.StdVideoH264PpsFlags flags() {return new vulkan.StdVideoH264PpsFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

    public char seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id);}
    public void seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$seq_parameter_set_id, LAYOUT$seq_parameter_set_id);}

    public char pic_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id);}
    public void pic_parameter_set_id(char value) {this.ptr.set(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id, (byte)value);}
    public java.lang.foreign.MemorySegment pic_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pic_parameter_set_id, LAYOUT$pic_parameter_set_id);}

    public char num_ref_idx_l0_default_active_minus1() {return (char)this.ptr.get(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1);}
    public void num_ref_idx_l0_default_active_minus1(char value) {this.ptr.set(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1, (byte)value);}
    public java.lang.foreign.MemorySegment num_ref_idx_l0_default_active_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_ref_idx_l0_default_active_minus1, LAYOUT$num_ref_idx_l0_default_active_minus1);}

    public char num_ref_idx_l1_default_active_minus1() {return (char)this.ptr.get(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1);}
    public void num_ref_idx_l1_default_active_minus1(char value) {this.ptr.set(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1, (byte)value);}
    public java.lang.foreign.MemorySegment num_ref_idx_l1_default_active_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_ref_idx_l1_default_active_minus1, LAYOUT$num_ref_idx_l1_default_active_minus1);}

    public int weighted_bipred_idc() {return this.ptr.get(LAYOUT$weighted_bipred_idc, OFFSET$weighted_bipred_idc);}
    public void weighted_bipred_idc(int value) {this.ptr.set(LAYOUT$weighted_bipred_idc, OFFSET$weighted_bipred_idc, value);}
    public java.lang.foreign.MemorySegment weighted_bipred_idc_ptr() {return this.ptr.asSlice(OFFSET$weighted_bipred_idc, LAYOUT$weighted_bipred_idc);}

    public char pic_init_qp_minus26() {return (char)this.ptr.get(LAYOUT$pic_init_qp_minus26, OFFSET$pic_init_qp_minus26);}
    public void pic_init_qp_minus26(char value) {this.ptr.set(LAYOUT$pic_init_qp_minus26, OFFSET$pic_init_qp_minus26, (byte)value);}
    public java.lang.foreign.MemorySegment pic_init_qp_minus26_ptr() {return this.ptr.asSlice(OFFSET$pic_init_qp_minus26, LAYOUT$pic_init_qp_minus26);}

    public char pic_init_qs_minus26() {return (char)this.ptr.get(LAYOUT$pic_init_qs_minus26, OFFSET$pic_init_qs_minus26);}
    public void pic_init_qs_minus26(char value) {this.ptr.set(LAYOUT$pic_init_qs_minus26, OFFSET$pic_init_qs_minus26, (byte)value);}
    public java.lang.foreign.MemorySegment pic_init_qs_minus26_ptr() {return this.ptr.asSlice(OFFSET$pic_init_qs_minus26, LAYOUT$pic_init_qs_minus26);}

    public char chroma_qp_index_offset() {return (char)this.ptr.get(LAYOUT$chroma_qp_index_offset, OFFSET$chroma_qp_index_offset);}
    public void chroma_qp_index_offset(char value) {this.ptr.set(LAYOUT$chroma_qp_index_offset, OFFSET$chroma_qp_index_offset, (byte)value);}
    public java.lang.foreign.MemorySegment chroma_qp_index_offset_ptr() {return this.ptr.asSlice(OFFSET$chroma_qp_index_offset, LAYOUT$chroma_qp_index_offset);}

    public char second_chroma_qp_index_offset() {return (char)this.ptr.get(LAYOUT$second_chroma_qp_index_offset, OFFSET$second_chroma_qp_index_offset);}
    public void second_chroma_qp_index_offset(char value) {this.ptr.set(LAYOUT$second_chroma_qp_index_offset, OFFSET$second_chroma_qp_index_offset, (byte)value);}
    public java.lang.foreign.MemorySegment second_chroma_qp_index_offset_ptr() {return this.ptr.asSlice(OFFSET$second_chroma_qp_index_offset, LAYOUT$second_chroma_qp_index_offset);}

    public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);}
    public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);}
    public java.lang.foreign.MemorySegment pScalingLists_ptr() {return this.ptr.asSlice(OFFSET$pScalingLists, LAYOUT$pScalingLists);}
}

package vulkan;

public record StdVideoH265PictureParameterSet(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH265PpsFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_pic_parameter_set_id = 4L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_seq_parameter_set_id = 5L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$sps_video_parameter_set_id = 6L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_extra_slice_header_bits = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_extra_slice_header_bits = 7L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l0_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_ref_idx_l0_default_active_minus1 = 8L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_idx_l1_default_active_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_ref_idx_l1_default_active_minus1 = 9L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$init_qp_minus26 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$init_qp_minus26 = 10L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$diff_cu_qp_delta_depth = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$diff_cu_qp_delta_depth = 11L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_cb_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_cb_qp_offset = 12L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_cr_qp_offset = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_cr_qp_offset = 13L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_beta_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_beta_offset_div2 = 14L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_tc_offset_div2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_tc_offset_div2 = 15L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_parallel_merge_level_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_parallel_merge_level_minus2 = 16L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_max_transform_skip_block_size_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_max_transform_skip_block_size_minus2 = 17L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$diff_cu_chroma_qp_offset_depth = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$diff_cu_chroma_qp_offset_depth = 18L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_qp_offset_list_len_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$chroma_qp_offset_list_len_minus1 = 19L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$cb_qp_offset_list = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$cb_qp_offset_list = 20L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$cr_qp_offset_list = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$cr_qp_offset_list = 26L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_sao_offset_scale_luma = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_sao_offset_scale_luma = 32L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_sao_offset_scale_chroma = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_sao_offset_scale_chroma = 33L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_act_y_qp_offset_plus5 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_act_y_qp_offset_plus5 = 34L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_act_cb_qp_offset_plus5 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_act_cb_qp_offset_plus5 = 35L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_act_cr_qp_offset_plus3 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_act_cr_qp_offset_plus3 = 36L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_num_palette_predictor_initializers = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_num_palette_predictor_initializers = 37L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$luma_bit_depth_entry_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$luma_bit_depth_entry_minus8 = 38L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_bit_depth_entry_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$chroma_bit_depth_entry_minus8 = 39L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_tile_columns_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_tile_columns_minus1 = 40L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_tile_rows_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_tile_rows_minus1 = 41L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved1 = 42L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved2 = 43L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$column_width_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(19, java.lang.foreign.ValueLayout.JAVA_SHORT);
	public static final long OFFSET$column_width_minus1 = 44L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$row_height_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(21, java.lang.foreign.ValueLayout.JAVA_SHORT);
	public static final long OFFSET$row_height_minus1 = 82L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$reserved3 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$reserved3 = 124L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pScalingLists = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pScalingLists = 128L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pPredictorPaletteEntries = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pPredictorPaletteEntries = 136L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$pps_pic_parameter_set_id,
			LAYOUT$pps_seq_parameter_set_id,
			LAYOUT$sps_video_parameter_set_id,
			LAYOUT$num_extra_slice_header_bits,
			LAYOUT$num_ref_idx_l0_default_active_minus1,
			LAYOUT$num_ref_idx_l1_default_active_minus1,
			LAYOUT$init_qp_minus26,
			LAYOUT$diff_cu_qp_delta_depth,
			LAYOUT$pps_cb_qp_offset,
			LAYOUT$pps_cr_qp_offset,
			LAYOUT$pps_beta_offset_div2,
			LAYOUT$pps_tc_offset_div2,
			LAYOUT$log2_parallel_merge_level_minus2,
			LAYOUT$log2_max_transform_skip_block_size_minus2,
			LAYOUT$diff_cu_chroma_qp_offset_depth,
			LAYOUT$chroma_qp_offset_list_len_minus1,
			LAYOUT$cb_qp_offset_list,
			LAYOUT$cr_qp_offset_list,
			LAYOUT$log2_sao_offset_scale_luma,
			LAYOUT$log2_sao_offset_scale_chroma,
			LAYOUT$pps_act_y_qp_offset_plus5,
			LAYOUT$pps_act_cb_qp_offset_plus5,
			LAYOUT$pps_act_cr_qp_offset_plus3,
			LAYOUT$pps_num_palette_predictor_initializers,
			LAYOUT$luma_bit_depth_entry_minus8,
			LAYOUT$chroma_bit_depth_entry_minus8,
			LAYOUT$num_tile_columns_minus1,
			LAYOUT$num_tile_rows_minus1,
			LAYOUT$reserved1,
			LAYOUT$reserved2,
			LAYOUT$column_width_minus1,
			LAYOUT$row_height_minus1,
			LAYOUT$reserved3,
			LAYOUT$pScalingLists,
			LAYOUT$pPredictorPaletteEntries
	).withName("StdVideoH265PictureParameterSet");

	public StdVideoH265PictureParameterSet(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoH265PpsFlags flags() {return new vulkan.StdVideoH265PpsFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public char pps_pic_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id);}
	public void pps_pic_parameter_set_id(char value) {this.ptr.set(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment pps_pic_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pps_pic_parameter_set_id, LAYOUT$pps_pic_parameter_set_id);}

	public char pps_seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id);}
	public void pps_seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment pps_seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pps_seq_parameter_set_id, LAYOUT$pps_seq_parameter_set_id);}

	public char sps_video_parameter_set_id() {return (char)this.ptr.get(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id);}
	public void sps_video_parameter_set_id(char value) {this.ptr.set(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment sps_video_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$sps_video_parameter_set_id, LAYOUT$sps_video_parameter_set_id);}

	public char num_extra_slice_header_bits() {return (char)this.ptr.get(LAYOUT$num_extra_slice_header_bits, OFFSET$num_extra_slice_header_bits);}
	public void num_extra_slice_header_bits(char value) {this.ptr.set(LAYOUT$num_extra_slice_header_bits, OFFSET$num_extra_slice_header_bits, (byte)value);}
	public java.lang.foreign.MemorySegment num_extra_slice_header_bits_ptr() {return this.ptr.asSlice(OFFSET$num_extra_slice_header_bits, LAYOUT$num_extra_slice_header_bits);}

	public char num_ref_idx_l0_default_active_minus1() {return (char)this.ptr.get(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1);}
	public void num_ref_idx_l0_default_active_minus1(char value) {this.ptr.set(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment num_ref_idx_l0_default_active_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_ref_idx_l0_default_active_minus1, LAYOUT$num_ref_idx_l0_default_active_minus1);}

	public char num_ref_idx_l1_default_active_minus1() {return (char)this.ptr.get(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1);}
	public void num_ref_idx_l1_default_active_minus1(char value) {this.ptr.set(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment num_ref_idx_l1_default_active_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_ref_idx_l1_default_active_minus1, LAYOUT$num_ref_idx_l1_default_active_minus1);}

	public char init_qp_minus26() {return (char)this.ptr.get(LAYOUT$init_qp_minus26, OFFSET$init_qp_minus26);}
	public void init_qp_minus26(char value) {this.ptr.set(LAYOUT$init_qp_minus26, OFFSET$init_qp_minus26, (byte)value);}
	public java.lang.foreign.MemorySegment init_qp_minus26_ptr() {return this.ptr.asSlice(OFFSET$init_qp_minus26, LAYOUT$init_qp_minus26);}

	public char diff_cu_qp_delta_depth() {return (char)this.ptr.get(LAYOUT$diff_cu_qp_delta_depth, OFFSET$diff_cu_qp_delta_depth);}
	public void diff_cu_qp_delta_depth(char value) {this.ptr.set(LAYOUT$diff_cu_qp_delta_depth, OFFSET$diff_cu_qp_delta_depth, (byte)value);}
	public java.lang.foreign.MemorySegment diff_cu_qp_delta_depth_ptr() {return this.ptr.asSlice(OFFSET$diff_cu_qp_delta_depth, LAYOUT$diff_cu_qp_delta_depth);}

	public char pps_cb_qp_offset() {return (char)this.ptr.get(LAYOUT$pps_cb_qp_offset, OFFSET$pps_cb_qp_offset);}
	public void pps_cb_qp_offset(char value) {this.ptr.set(LAYOUT$pps_cb_qp_offset, OFFSET$pps_cb_qp_offset, (byte)value);}
	public java.lang.foreign.MemorySegment pps_cb_qp_offset_ptr() {return this.ptr.asSlice(OFFSET$pps_cb_qp_offset, LAYOUT$pps_cb_qp_offset);}

	public char pps_cr_qp_offset() {return (char)this.ptr.get(LAYOUT$pps_cr_qp_offset, OFFSET$pps_cr_qp_offset);}
	public void pps_cr_qp_offset(char value) {this.ptr.set(LAYOUT$pps_cr_qp_offset, OFFSET$pps_cr_qp_offset, (byte)value);}
	public java.lang.foreign.MemorySegment pps_cr_qp_offset_ptr() {return this.ptr.asSlice(OFFSET$pps_cr_qp_offset, LAYOUT$pps_cr_qp_offset);}

	public char pps_beta_offset_div2() {return (char)this.ptr.get(LAYOUT$pps_beta_offset_div2, OFFSET$pps_beta_offset_div2);}
	public void pps_beta_offset_div2(char value) {this.ptr.set(LAYOUT$pps_beta_offset_div2, OFFSET$pps_beta_offset_div2, (byte)value);}
	public java.lang.foreign.MemorySegment pps_beta_offset_div2_ptr() {return this.ptr.asSlice(OFFSET$pps_beta_offset_div2, LAYOUT$pps_beta_offset_div2);}

	public char pps_tc_offset_div2() {return (char)this.ptr.get(LAYOUT$pps_tc_offset_div2, OFFSET$pps_tc_offset_div2);}
	public void pps_tc_offset_div2(char value) {this.ptr.set(LAYOUT$pps_tc_offset_div2, OFFSET$pps_tc_offset_div2, (byte)value);}
	public java.lang.foreign.MemorySegment pps_tc_offset_div2_ptr() {return this.ptr.asSlice(OFFSET$pps_tc_offset_div2, LAYOUT$pps_tc_offset_div2);}

	public char log2_parallel_merge_level_minus2() {return (char)this.ptr.get(LAYOUT$log2_parallel_merge_level_minus2, OFFSET$log2_parallel_merge_level_minus2);}
	public void log2_parallel_merge_level_minus2(char value) {this.ptr.set(LAYOUT$log2_parallel_merge_level_minus2, OFFSET$log2_parallel_merge_level_minus2, (byte)value);}
	public java.lang.foreign.MemorySegment log2_parallel_merge_level_minus2_ptr() {return this.ptr.asSlice(OFFSET$log2_parallel_merge_level_minus2, LAYOUT$log2_parallel_merge_level_minus2);}

	public char log2_max_transform_skip_block_size_minus2() {return (char)this.ptr.get(LAYOUT$log2_max_transform_skip_block_size_minus2, OFFSET$log2_max_transform_skip_block_size_minus2);}
	public void log2_max_transform_skip_block_size_minus2(char value) {this.ptr.set(LAYOUT$log2_max_transform_skip_block_size_minus2, OFFSET$log2_max_transform_skip_block_size_minus2, (byte)value);}
	public java.lang.foreign.MemorySegment log2_max_transform_skip_block_size_minus2_ptr() {return this.ptr.asSlice(OFFSET$log2_max_transform_skip_block_size_minus2, LAYOUT$log2_max_transform_skip_block_size_minus2);}

	public char diff_cu_chroma_qp_offset_depth() {return (char)this.ptr.get(LAYOUT$diff_cu_chroma_qp_offset_depth, OFFSET$diff_cu_chroma_qp_offset_depth);}
	public void diff_cu_chroma_qp_offset_depth(char value) {this.ptr.set(LAYOUT$diff_cu_chroma_qp_offset_depth, OFFSET$diff_cu_chroma_qp_offset_depth, (byte)value);}
	public java.lang.foreign.MemorySegment diff_cu_chroma_qp_offset_depth_ptr() {return this.ptr.asSlice(OFFSET$diff_cu_chroma_qp_offset_depth, LAYOUT$diff_cu_chroma_qp_offset_depth);}

	public char chroma_qp_offset_list_len_minus1() {return (char)this.ptr.get(LAYOUT$chroma_qp_offset_list_len_minus1, OFFSET$chroma_qp_offset_list_len_minus1);}
	public void chroma_qp_offset_list_len_minus1(char value) {this.ptr.set(LAYOUT$chroma_qp_offset_list_len_minus1, OFFSET$chroma_qp_offset_list_len_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment chroma_qp_offset_list_len_minus1_ptr() {return this.ptr.asSlice(OFFSET$chroma_qp_offset_list_len_minus1, LAYOUT$chroma_qp_offset_list_len_minus1);}

	public java.lang.foreign.MemorySegment cb_qp_offset_list() {return this.ptr.asSlice(OFFSET$cb_qp_offset_list, LAYOUT$cb_qp_offset_list);}
	public char cb_qp_offset_list(int i) {return (char)this.cb_qp_offset_list().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void cb_qp_offset_list(int i, char value) {this.cb_qp_offset_list().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment cr_qp_offset_list() {return this.ptr.asSlice(OFFSET$cr_qp_offset_list, LAYOUT$cr_qp_offset_list);}
	public char cr_qp_offset_list(int i) {return (char)this.cr_qp_offset_list().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void cr_qp_offset_list(int i, char value) {this.cr_qp_offset_list().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public char log2_sao_offset_scale_luma() {return (char)this.ptr.get(LAYOUT$log2_sao_offset_scale_luma, OFFSET$log2_sao_offset_scale_luma);}
	public void log2_sao_offset_scale_luma(char value) {this.ptr.set(LAYOUT$log2_sao_offset_scale_luma, OFFSET$log2_sao_offset_scale_luma, (byte)value);}
	public java.lang.foreign.MemorySegment log2_sao_offset_scale_luma_ptr() {return this.ptr.asSlice(OFFSET$log2_sao_offset_scale_luma, LAYOUT$log2_sao_offset_scale_luma);}

	public char log2_sao_offset_scale_chroma() {return (char)this.ptr.get(LAYOUT$log2_sao_offset_scale_chroma, OFFSET$log2_sao_offset_scale_chroma);}
	public void log2_sao_offset_scale_chroma(char value) {this.ptr.set(LAYOUT$log2_sao_offset_scale_chroma, OFFSET$log2_sao_offset_scale_chroma, (byte)value);}
	public java.lang.foreign.MemorySegment log2_sao_offset_scale_chroma_ptr() {return this.ptr.asSlice(OFFSET$log2_sao_offset_scale_chroma, LAYOUT$log2_sao_offset_scale_chroma);}

	public char pps_act_y_qp_offset_plus5() {return (char)this.ptr.get(LAYOUT$pps_act_y_qp_offset_plus5, OFFSET$pps_act_y_qp_offset_plus5);}
	public void pps_act_y_qp_offset_plus5(char value) {this.ptr.set(LAYOUT$pps_act_y_qp_offset_plus5, OFFSET$pps_act_y_qp_offset_plus5, (byte)value);}
	public java.lang.foreign.MemorySegment pps_act_y_qp_offset_plus5_ptr() {return this.ptr.asSlice(OFFSET$pps_act_y_qp_offset_plus5, LAYOUT$pps_act_y_qp_offset_plus5);}

	public char pps_act_cb_qp_offset_plus5() {return (char)this.ptr.get(LAYOUT$pps_act_cb_qp_offset_plus5, OFFSET$pps_act_cb_qp_offset_plus5);}
	public void pps_act_cb_qp_offset_plus5(char value) {this.ptr.set(LAYOUT$pps_act_cb_qp_offset_plus5, OFFSET$pps_act_cb_qp_offset_plus5, (byte)value);}
	public java.lang.foreign.MemorySegment pps_act_cb_qp_offset_plus5_ptr() {return this.ptr.asSlice(OFFSET$pps_act_cb_qp_offset_plus5, LAYOUT$pps_act_cb_qp_offset_plus5);}

	public char pps_act_cr_qp_offset_plus3() {return (char)this.ptr.get(LAYOUT$pps_act_cr_qp_offset_plus3, OFFSET$pps_act_cr_qp_offset_plus3);}
	public void pps_act_cr_qp_offset_plus3(char value) {this.ptr.set(LAYOUT$pps_act_cr_qp_offset_plus3, OFFSET$pps_act_cr_qp_offset_plus3, (byte)value);}
	public java.lang.foreign.MemorySegment pps_act_cr_qp_offset_plus3_ptr() {return this.ptr.asSlice(OFFSET$pps_act_cr_qp_offset_plus3, LAYOUT$pps_act_cr_qp_offset_plus3);}

	public char pps_num_palette_predictor_initializers() {return (char)this.ptr.get(LAYOUT$pps_num_palette_predictor_initializers, OFFSET$pps_num_palette_predictor_initializers);}
	public void pps_num_palette_predictor_initializers(char value) {this.ptr.set(LAYOUT$pps_num_palette_predictor_initializers, OFFSET$pps_num_palette_predictor_initializers, (byte)value);}
	public java.lang.foreign.MemorySegment pps_num_palette_predictor_initializers_ptr() {return this.ptr.asSlice(OFFSET$pps_num_palette_predictor_initializers, LAYOUT$pps_num_palette_predictor_initializers);}

	public char luma_bit_depth_entry_minus8() {return (char)this.ptr.get(LAYOUT$luma_bit_depth_entry_minus8, OFFSET$luma_bit_depth_entry_minus8);}
	public void luma_bit_depth_entry_minus8(char value) {this.ptr.set(LAYOUT$luma_bit_depth_entry_minus8, OFFSET$luma_bit_depth_entry_minus8, (byte)value);}
	public java.lang.foreign.MemorySegment luma_bit_depth_entry_minus8_ptr() {return this.ptr.asSlice(OFFSET$luma_bit_depth_entry_minus8, LAYOUT$luma_bit_depth_entry_minus8);}

	public char chroma_bit_depth_entry_minus8() {return (char)this.ptr.get(LAYOUT$chroma_bit_depth_entry_minus8, OFFSET$chroma_bit_depth_entry_minus8);}
	public void chroma_bit_depth_entry_minus8(char value) {this.ptr.set(LAYOUT$chroma_bit_depth_entry_minus8, OFFSET$chroma_bit_depth_entry_minus8, (byte)value);}
	public java.lang.foreign.MemorySegment chroma_bit_depth_entry_minus8_ptr() {return this.ptr.asSlice(OFFSET$chroma_bit_depth_entry_minus8, LAYOUT$chroma_bit_depth_entry_minus8);}

	public char num_tile_columns_minus1() {return (char)this.ptr.get(LAYOUT$num_tile_columns_minus1, OFFSET$num_tile_columns_minus1);}
	public void num_tile_columns_minus1(char value) {this.ptr.set(LAYOUT$num_tile_columns_minus1, OFFSET$num_tile_columns_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment num_tile_columns_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_tile_columns_minus1, LAYOUT$num_tile_columns_minus1);}

	public char num_tile_rows_minus1() {return (char)this.ptr.get(LAYOUT$num_tile_rows_minus1, OFFSET$num_tile_rows_minus1);}
	public void num_tile_rows_minus1(char value) {this.ptr.set(LAYOUT$num_tile_rows_minus1, OFFSET$num_tile_rows_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment num_tile_rows_minus1_ptr() {return this.ptr.asSlice(OFFSET$num_tile_rows_minus1, LAYOUT$num_tile_rows_minus1);}

	public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
	public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
	public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

	public char reserved2() {return (char)this.ptr.get(LAYOUT$reserved2, OFFSET$reserved2);}
	public void reserved2(char value) {this.ptr.set(LAYOUT$reserved2, OFFSET$reserved2, (byte)value);}
	public java.lang.foreign.MemorySegment reserved2_ptr() {return this.ptr.asSlice(OFFSET$reserved2, LAYOUT$reserved2);}

	public java.lang.foreign.MemorySegment column_width_minus1() {return this.ptr.asSlice(OFFSET$column_width_minus1, LAYOUT$column_width_minus1);}
	public short column_width_minus1(int i) {return this.column_width_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i);}
	public void column_width_minus1(int i, short value) {this.column_width_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i, value);}

	public java.lang.foreign.MemorySegment row_height_minus1() {return this.ptr.asSlice(OFFSET$row_height_minus1, LAYOUT$row_height_minus1);}
	public short row_height_minus1(int i) {return this.row_height_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i);}
	public void row_height_minus1(int i, short value) {this.row_height_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i, value);}

	public int reserved3() {return this.ptr.get(LAYOUT$reserved3, OFFSET$reserved3);}
	public void reserved3(int value) {this.ptr.set(LAYOUT$reserved3, OFFSET$reserved3, value);}
	public java.lang.foreign.MemorySegment reserved3_ptr() {return this.ptr.asSlice(OFFSET$reserved3, LAYOUT$reserved3);}

	public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);}
	public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);}
	public java.lang.foreign.MemorySegment pScalingLists_ptr() {return this.ptr.asSlice(OFFSET$pScalingLists, LAYOUT$pScalingLists);}

	public java.lang.foreign.MemorySegment pPredictorPaletteEntries() {return this.ptr.get(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries);}
	public void pPredictorPaletteEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries, value);}
	public java.lang.foreign.MemorySegment pPredictorPaletteEntries_ptr() {return this.ptr.asSlice(OFFSET$pPredictorPaletteEntries, LAYOUT$pPredictorPaletteEntries);}
}

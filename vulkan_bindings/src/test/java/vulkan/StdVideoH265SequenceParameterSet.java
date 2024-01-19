package vulkan;

public record StdVideoH265SequenceParameterSet(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH265SpsFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$chroma_format_idc = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$chroma_format_idc = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pic_width_in_luma_samples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pic_width_in_luma_samples = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pic_height_in_luma_samples = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pic_height_in_luma_samples = 12L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$sps_video_parameter_set_id = 16L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sps_max_sub_layers_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$sps_max_sub_layers_minus1 = 17L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$sps_seq_parameter_set_id = 18L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$bit_depth_luma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$bit_depth_luma_minus8 = 19L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$bit_depth_chroma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$bit_depth_chroma_minus8 = 20L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_max_pic_order_cnt_lsb_minus4 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_max_pic_order_cnt_lsb_minus4 = 21L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_min_luma_coding_block_size_minus3 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_min_luma_coding_block_size_minus3 = 22L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_diff_max_min_luma_coding_block_size = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_diff_max_min_luma_coding_block_size = 23L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_min_luma_transform_block_size_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_min_luma_transform_block_size_minus2 = 24L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_diff_max_min_luma_transform_block_size = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_diff_max_min_luma_transform_block_size = 25L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$max_transform_hierarchy_depth_inter = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$max_transform_hierarchy_depth_inter = 26L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$max_transform_hierarchy_depth_intra = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$max_transform_hierarchy_depth_intra = 27L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_short_term_ref_pic_sets = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_short_term_ref_pic_sets = 28L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_long_term_ref_pics_sps = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_long_term_ref_pics_sps = 29L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pcm_sample_bit_depth_luma_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pcm_sample_bit_depth_luma_minus1 = 30L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pcm_sample_bit_depth_chroma_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pcm_sample_bit_depth_chroma_minus1 = 31L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_min_pcm_luma_coding_block_size_minus3 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_min_pcm_luma_coding_block_size_minus3 = 32L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_diff_max_min_pcm_luma_coding_block_size = 33L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved1 = 34L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved2 = 35L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$palette_max_size = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$palette_max_size = 36L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$delta_palette_max_predictor_size = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$delta_palette_max_predictor_size = 37L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$motion_vector_resolution_control_idc = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$motion_vector_resolution_control_idc = 38L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sps_num_palette_predictor_initializers_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$sps_num_palette_predictor_initializers_minus1 = 39L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$conf_win_left_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$conf_win_left_offset = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$conf_win_right_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$conf_win_right_offset = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$conf_win_top_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$conf_win_top_offset = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$conf_win_bottom_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$conf_win_bottom_offset = 52L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pProfileTierLevel = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pProfileTierLevel = 56L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDecPicBufMgr = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDecPicBufMgr = 64L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pScalingLists = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pScalingLists = 72L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pShortTermRefPicSet = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pShortTermRefPicSet = 80L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pLongTermRefPicsSps = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pLongTermRefPicsSps = 88L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSequenceParameterSetVui = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSequenceParameterSetVui = 96L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pPredictorPaletteEntries = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pPredictorPaletteEntries = 104L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$chroma_format_idc,
			LAYOUT$pic_width_in_luma_samples,
			LAYOUT$pic_height_in_luma_samples,
			LAYOUT$sps_video_parameter_set_id,
			LAYOUT$sps_max_sub_layers_minus1,
			LAYOUT$sps_seq_parameter_set_id,
			LAYOUT$bit_depth_luma_minus8,
			LAYOUT$bit_depth_chroma_minus8,
			LAYOUT$log2_max_pic_order_cnt_lsb_minus4,
			LAYOUT$log2_min_luma_coding_block_size_minus3,
			LAYOUT$log2_diff_max_min_luma_coding_block_size,
			LAYOUT$log2_min_luma_transform_block_size_minus2,
			LAYOUT$log2_diff_max_min_luma_transform_block_size,
			LAYOUT$max_transform_hierarchy_depth_inter,
			LAYOUT$max_transform_hierarchy_depth_intra,
			LAYOUT$num_short_term_ref_pic_sets,
			LAYOUT$num_long_term_ref_pics_sps,
			LAYOUT$pcm_sample_bit_depth_luma_minus1,
			LAYOUT$pcm_sample_bit_depth_chroma_minus1,
			LAYOUT$log2_min_pcm_luma_coding_block_size_minus3,
			LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size,
			LAYOUT$reserved1,
			LAYOUT$reserved2,
			LAYOUT$palette_max_size,
			LAYOUT$delta_palette_max_predictor_size,
			LAYOUT$motion_vector_resolution_control_idc,
			LAYOUT$sps_num_palette_predictor_initializers_minus1,
			LAYOUT$conf_win_left_offset,
			LAYOUT$conf_win_right_offset,
			LAYOUT$conf_win_top_offset,
			LAYOUT$conf_win_bottom_offset,
			LAYOUT$pProfileTierLevel,
			LAYOUT$pDecPicBufMgr,
			LAYOUT$pScalingLists,
			LAYOUT$pShortTermRefPicSet,
			LAYOUT$pLongTermRefPicsSps,
			LAYOUT$pSequenceParameterSetVui,
			LAYOUT$pPredictorPaletteEntries
	).withName("StdVideoH265SequenceParameterSet");

	public StdVideoH265SequenceParameterSet(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoH265SpsFlags flags() {return new vulkan.StdVideoH265SpsFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public int chroma_format_idc() {return this.ptr.get(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc);}
	public void chroma_format_idc(int value) {this.ptr.set(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc, value);}
	public java.lang.foreign.MemorySegment chroma_format_idc_ptr() {return this.ptr.asSlice(OFFSET$chroma_format_idc, LAYOUT$chroma_format_idc);}

	public int pic_width_in_luma_samples() {return this.ptr.get(LAYOUT$pic_width_in_luma_samples, OFFSET$pic_width_in_luma_samples);}
	public void pic_width_in_luma_samples(int value) {this.ptr.set(LAYOUT$pic_width_in_luma_samples, OFFSET$pic_width_in_luma_samples, value);}
	public java.lang.foreign.MemorySegment pic_width_in_luma_samples_ptr() {return this.ptr.asSlice(OFFSET$pic_width_in_luma_samples, LAYOUT$pic_width_in_luma_samples);}

	public int pic_height_in_luma_samples() {return this.ptr.get(LAYOUT$pic_height_in_luma_samples, OFFSET$pic_height_in_luma_samples);}
	public void pic_height_in_luma_samples(int value) {this.ptr.set(LAYOUT$pic_height_in_luma_samples, OFFSET$pic_height_in_luma_samples, value);}
	public java.lang.foreign.MemorySegment pic_height_in_luma_samples_ptr() {return this.ptr.asSlice(OFFSET$pic_height_in_luma_samples, LAYOUT$pic_height_in_luma_samples);}

	public char sps_video_parameter_set_id() {return (char)this.ptr.get(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id);}
	public void sps_video_parameter_set_id(char value) {this.ptr.set(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment sps_video_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$sps_video_parameter_set_id, LAYOUT$sps_video_parameter_set_id);}

	public char sps_max_sub_layers_minus1() {return (char)this.ptr.get(LAYOUT$sps_max_sub_layers_minus1, OFFSET$sps_max_sub_layers_minus1);}
	public void sps_max_sub_layers_minus1(char value) {this.ptr.set(LAYOUT$sps_max_sub_layers_minus1, OFFSET$sps_max_sub_layers_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment sps_max_sub_layers_minus1_ptr() {return this.ptr.asSlice(OFFSET$sps_max_sub_layers_minus1, LAYOUT$sps_max_sub_layers_minus1);}

	public char sps_seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$sps_seq_parameter_set_id, OFFSET$sps_seq_parameter_set_id);}
	public void sps_seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$sps_seq_parameter_set_id, OFFSET$sps_seq_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment sps_seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$sps_seq_parameter_set_id, LAYOUT$sps_seq_parameter_set_id);}

	public char bit_depth_luma_minus8() {return (char)this.ptr.get(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8);}
	public void bit_depth_luma_minus8(char value) {this.ptr.set(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8, (byte)value);}
	public java.lang.foreign.MemorySegment bit_depth_luma_minus8_ptr() {return this.ptr.asSlice(OFFSET$bit_depth_luma_minus8, LAYOUT$bit_depth_luma_minus8);}

	public char bit_depth_chroma_minus8() {return (char)this.ptr.get(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8);}
	public void bit_depth_chroma_minus8(char value) {this.ptr.set(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8, (byte)value);}
	public java.lang.foreign.MemorySegment bit_depth_chroma_minus8_ptr() {return this.ptr.asSlice(OFFSET$bit_depth_chroma_minus8, LAYOUT$bit_depth_chroma_minus8);}

	public char log2_max_pic_order_cnt_lsb_minus4() {return (char)this.ptr.get(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4);}
	public void log2_max_pic_order_cnt_lsb_minus4(char value) {this.ptr.set(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4, (byte)value);}
	public java.lang.foreign.MemorySegment log2_max_pic_order_cnt_lsb_minus4_ptr() {return this.ptr.asSlice(OFFSET$log2_max_pic_order_cnt_lsb_minus4, LAYOUT$log2_max_pic_order_cnt_lsb_minus4);}

	public char log2_min_luma_coding_block_size_minus3() {return (char)this.ptr.get(LAYOUT$log2_min_luma_coding_block_size_minus3, OFFSET$log2_min_luma_coding_block_size_minus3);}
	public void log2_min_luma_coding_block_size_minus3(char value) {this.ptr.set(LAYOUT$log2_min_luma_coding_block_size_minus3, OFFSET$log2_min_luma_coding_block_size_minus3, (byte)value);}
	public java.lang.foreign.MemorySegment log2_min_luma_coding_block_size_minus3_ptr() {return this.ptr.asSlice(OFFSET$log2_min_luma_coding_block_size_minus3, LAYOUT$log2_min_luma_coding_block_size_minus3);}

	public char log2_diff_max_min_luma_coding_block_size() {return (char)this.ptr.get(LAYOUT$log2_diff_max_min_luma_coding_block_size, OFFSET$log2_diff_max_min_luma_coding_block_size);}
	public void log2_diff_max_min_luma_coding_block_size(char value) {this.ptr.set(LAYOUT$log2_diff_max_min_luma_coding_block_size, OFFSET$log2_diff_max_min_luma_coding_block_size, (byte)value);}
	public java.lang.foreign.MemorySegment log2_diff_max_min_luma_coding_block_size_ptr() {return this.ptr.asSlice(OFFSET$log2_diff_max_min_luma_coding_block_size, LAYOUT$log2_diff_max_min_luma_coding_block_size);}

	public char log2_min_luma_transform_block_size_minus2() {return (char)this.ptr.get(LAYOUT$log2_min_luma_transform_block_size_minus2, OFFSET$log2_min_luma_transform_block_size_minus2);}
	public void log2_min_luma_transform_block_size_minus2(char value) {this.ptr.set(LAYOUT$log2_min_luma_transform_block_size_minus2, OFFSET$log2_min_luma_transform_block_size_minus2, (byte)value);}
	public java.lang.foreign.MemorySegment log2_min_luma_transform_block_size_minus2_ptr() {return this.ptr.asSlice(OFFSET$log2_min_luma_transform_block_size_minus2, LAYOUT$log2_min_luma_transform_block_size_minus2);}

	public char log2_diff_max_min_luma_transform_block_size() {return (char)this.ptr.get(LAYOUT$log2_diff_max_min_luma_transform_block_size, OFFSET$log2_diff_max_min_luma_transform_block_size);}
	public void log2_diff_max_min_luma_transform_block_size(char value) {this.ptr.set(LAYOUT$log2_diff_max_min_luma_transform_block_size, OFFSET$log2_diff_max_min_luma_transform_block_size, (byte)value);}
	public java.lang.foreign.MemorySegment log2_diff_max_min_luma_transform_block_size_ptr() {return this.ptr.asSlice(OFFSET$log2_diff_max_min_luma_transform_block_size, LAYOUT$log2_diff_max_min_luma_transform_block_size);}

	public char max_transform_hierarchy_depth_inter() {return (char)this.ptr.get(LAYOUT$max_transform_hierarchy_depth_inter, OFFSET$max_transform_hierarchy_depth_inter);}
	public void max_transform_hierarchy_depth_inter(char value) {this.ptr.set(LAYOUT$max_transform_hierarchy_depth_inter, OFFSET$max_transform_hierarchy_depth_inter, (byte)value);}
	public java.lang.foreign.MemorySegment max_transform_hierarchy_depth_inter_ptr() {return this.ptr.asSlice(OFFSET$max_transform_hierarchy_depth_inter, LAYOUT$max_transform_hierarchy_depth_inter);}

	public char max_transform_hierarchy_depth_intra() {return (char)this.ptr.get(LAYOUT$max_transform_hierarchy_depth_intra, OFFSET$max_transform_hierarchy_depth_intra);}
	public void max_transform_hierarchy_depth_intra(char value) {this.ptr.set(LAYOUT$max_transform_hierarchy_depth_intra, OFFSET$max_transform_hierarchy_depth_intra, (byte)value);}
	public java.lang.foreign.MemorySegment max_transform_hierarchy_depth_intra_ptr() {return this.ptr.asSlice(OFFSET$max_transform_hierarchy_depth_intra, LAYOUT$max_transform_hierarchy_depth_intra);}

	public char num_short_term_ref_pic_sets() {return (char)this.ptr.get(LAYOUT$num_short_term_ref_pic_sets, OFFSET$num_short_term_ref_pic_sets);}
	public void num_short_term_ref_pic_sets(char value) {this.ptr.set(LAYOUT$num_short_term_ref_pic_sets, OFFSET$num_short_term_ref_pic_sets, (byte)value);}
	public java.lang.foreign.MemorySegment num_short_term_ref_pic_sets_ptr() {return this.ptr.asSlice(OFFSET$num_short_term_ref_pic_sets, LAYOUT$num_short_term_ref_pic_sets);}

	public char num_long_term_ref_pics_sps() {return (char)this.ptr.get(LAYOUT$num_long_term_ref_pics_sps, OFFSET$num_long_term_ref_pics_sps);}
	public void num_long_term_ref_pics_sps(char value) {this.ptr.set(LAYOUT$num_long_term_ref_pics_sps, OFFSET$num_long_term_ref_pics_sps, (byte)value);}
	public java.lang.foreign.MemorySegment num_long_term_ref_pics_sps_ptr() {return this.ptr.asSlice(OFFSET$num_long_term_ref_pics_sps, LAYOUT$num_long_term_ref_pics_sps);}

	public char pcm_sample_bit_depth_luma_minus1() {return (char)this.ptr.get(LAYOUT$pcm_sample_bit_depth_luma_minus1, OFFSET$pcm_sample_bit_depth_luma_minus1);}
	public void pcm_sample_bit_depth_luma_minus1(char value) {this.ptr.set(LAYOUT$pcm_sample_bit_depth_luma_minus1, OFFSET$pcm_sample_bit_depth_luma_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment pcm_sample_bit_depth_luma_minus1_ptr() {return this.ptr.asSlice(OFFSET$pcm_sample_bit_depth_luma_minus1, LAYOUT$pcm_sample_bit_depth_luma_minus1);}

	public char pcm_sample_bit_depth_chroma_minus1() {return (char)this.ptr.get(LAYOUT$pcm_sample_bit_depth_chroma_minus1, OFFSET$pcm_sample_bit_depth_chroma_minus1);}
	public void pcm_sample_bit_depth_chroma_minus1(char value) {this.ptr.set(LAYOUT$pcm_sample_bit_depth_chroma_minus1, OFFSET$pcm_sample_bit_depth_chroma_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment pcm_sample_bit_depth_chroma_minus1_ptr() {return this.ptr.asSlice(OFFSET$pcm_sample_bit_depth_chroma_minus1, LAYOUT$pcm_sample_bit_depth_chroma_minus1);}

	public char log2_min_pcm_luma_coding_block_size_minus3() {return (char)this.ptr.get(LAYOUT$log2_min_pcm_luma_coding_block_size_minus3, OFFSET$log2_min_pcm_luma_coding_block_size_minus3);}
	public void log2_min_pcm_luma_coding_block_size_minus3(char value) {this.ptr.set(LAYOUT$log2_min_pcm_luma_coding_block_size_minus3, OFFSET$log2_min_pcm_luma_coding_block_size_minus3, (byte)value);}
	public java.lang.foreign.MemorySegment log2_min_pcm_luma_coding_block_size_minus3_ptr() {return this.ptr.asSlice(OFFSET$log2_min_pcm_luma_coding_block_size_minus3, LAYOUT$log2_min_pcm_luma_coding_block_size_minus3);}

	public char log2_diff_max_min_pcm_luma_coding_block_size() {return (char)this.ptr.get(LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size, OFFSET$log2_diff_max_min_pcm_luma_coding_block_size);}
	public void log2_diff_max_min_pcm_luma_coding_block_size(char value) {this.ptr.set(LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size, OFFSET$log2_diff_max_min_pcm_luma_coding_block_size, (byte)value);}
	public java.lang.foreign.MemorySegment log2_diff_max_min_pcm_luma_coding_block_size_ptr() {return this.ptr.asSlice(OFFSET$log2_diff_max_min_pcm_luma_coding_block_size, LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size);}

	public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
	public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
	public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

	public char reserved2() {return (char)this.ptr.get(LAYOUT$reserved2, OFFSET$reserved2);}
	public void reserved2(char value) {this.ptr.set(LAYOUT$reserved2, OFFSET$reserved2, (byte)value);}
	public java.lang.foreign.MemorySegment reserved2_ptr() {return this.ptr.asSlice(OFFSET$reserved2, LAYOUT$reserved2);}

	public char palette_max_size() {return (char)this.ptr.get(LAYOUT$palette_max_size, OFFSET$palette_max_size);}
	public void palette_max_size(char value) {this.ptr.set(LAYOUT$palette_max_size, OFFSET$palette_max_size, (byte)value);}
	public java.lang.foreign.MemorySegment palette_max_size_ptr() {return this.ptr.asSlice(OFFSET$palette_max_size, LAYOUT$palette_max_size);}

	public char delta_palette_max_predictor_size() {return (char)this.ptr.get(LAYOUT$delta_palette_max_predictor_size, OFFSET$delta_palette_max_predictor_size);}
	public void delta_palette_max_predictor_size(char value) {this.ptr.set(LAYOUT$delta_palette_max_predictor_size, OFFSET$delta_palette_max_predictor_size, (byte)value);}
	public java.lang.foreign.MemorySegment delta_palette_max_predictor_size_ptr() {return this.ptr.asSlice(OFFSET$delta_palette_max_predictor_size, LAYOUT$delta_palette_max_predictor_size);}

	public char motion_vector_resolution_control_idc() {return (char)this.ptr.get(LAYOUT$motion_vector_resolution_control_idc, OFFSET$motion_vector_resolution_control_idc);}
	public void motion_vector_resolution_control_idc(char value) {this.ptr.set(LAYOUT$motion_vector_resolution_control_idc, OFFSET$motion_vector_resolution_control_idc, (byte)value);}
	public java.lang.foreign.MemorySegment motion_vector_resolution_control_idc_ptr() {return this.ptr.asSlice(OFFSET$motion_vector_resolution_control_idc, LAYOUT$motion_vector_resolution_control_idc);}

	public char sps_num_palette_predictor_initializers_minus1() {return (char)this.ptr.get(LAYOUT$sps_num_palette_predictor_initializers_minus1, OFFSET$sps_num_palette_predictor_initializers_minus1);}
	public void sps_num_palette_predictor_initializers_minus1(char value) {this.ptr.set(LAYOUT$sps_num_palette_predictor_initializers_minus1, OFFSET$sps_num_palette_predictor_initializers_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment sps_num_palette_predictor_initializers_minus1_ptr() {return this.ptr.asSlice(OFFSET$sps_num_palette_predictor_initializers_minus1, LAYOUT$sps_num_palette_predictor_initializers_minus1);}

	public int conf_win_left_offset() {return this.ptr.get(LAYOUT$conf_win_left_offset, OFFSET$conf_win_left_offset);}
	public void conf_win_left_offset(int value) {this.ptr.set(LAYOUT$conf_win_left_offset, OFFSET$conf_win_left_offset, value);}
	public java.lang.foreign.MemorySegment conf_win_left_offset_ptr() {return this.ptr.asSlice(OFFSET$conf_win_left_offset, LAYOUT$conf_win_left_offset);}

	public int conf_win_right_offset() {return this.ptr.get(LAYOUT$conf_win_right_offset, OFFSET$conf_win_right_offset);}
	public void conf_win_right_offset(int value) {this.ptr.set(LAYOUT$conf_win_right_offset, OFFSET$conf_win_right_offset, value);}
	public java.lang.foreign.MemorySegment conf_win_right_offset_ptr() {return this.ptr.asSlice(OFFSET$conf_win_right_offset, LAYOUT$conf_win_right_offset);}

	public int conf_win_top_offset() {return this.ptr.get(LAYOUT$conf_win_top_offset, OFFSET$conf_win_top_offset);}
	public void conf_win_top_offset(int value) {this.ptr.set(LAYOUT$conf_win_top_offset, OFFSET$conf_win_top_offset, value);}
	public java.lang.foreign.MemorySegment conf_win_top_offset_ptr() {return this.ptr.asSlice(OFFSET$conf_win_top_offset, LAYOUT$conf_win_top_offset);}

	public int conf_win_bottom_offset() {return this.ptr.get(LAYOUT$conf_win_bottom_offset, OFFSET$conf_win_bottom_offset);}
	public void conf_win_bottom_offset(int value) {this.ptr.set(LAYOUT$conf_win_bottom_offset, OFFSET$conf_win_bottom_offset, value);}
	public java.lang.foreign.MemorySegment conf_win_bottom_offset_ptr() {return this.ptr.asSlice(OFFSET$conf_win_bottom_offset, LAYOUT$conf_win_bottom_offset);}

	public java.lang.foreign.MemorySegment pProfileTierLevel() {return this.ptr.get(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel);}
	public void pProfileTierLevel(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel, value);}
	public java.lang.foreign.MemorySegment pProfileTierLevel_ptr() {return this.ptr.asSlice(OFFSET$pProfileTierLevel, LAYOUT$pProfileTierLevel);}

	public java.lang.foreign.MemorySegment pDecPicBufMgr() {return this.ptr.get(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr);}
	public void pDecPicBufMgr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr, value);}
	public java.lang.foreign.MemorySegment pDecPicBufMgr_ptr() {return this.ptr.asSlice(OFFSET$pDecPicBufMgr, LAYOUT$pDecPicBufMgr);}

	public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);}
	public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);}
	public java.lang.foreign.MemorySegment pScalingLists_ptr() {return this.ptr.asSlice(OFFSET$pScalingLists, LAYOUT$pScalingLists);}

	public java.lang.foreign.MemorySegment pShortTermRefPicSet() {return this.ptr.get(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet);}
	public void pShortTermRefPicSet(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet, value);}
	public java.lang.foreign.MemorySegment pShortTermRefPicSet_ptr() {return this.ptr.asSlice(OFFSET$pShortTermRefPicSet, LAYOUT$pShortTermRefPicSet);}

	public java.lang.foreign.MemorySegment pLongTermRefPicsSps() {return this.ptr.get(LAYOUT$pLongTermRefPicsSps, OFFSET$pLongTermRefPicsSps);}
	public void pLongTermRefPicsSps(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pLongTermRefPicsSps, OFFSET$pLongTermRefPicsSps, value);}
	public java.lang.foreign.MemorySegment pLongTermRefPicsSps_ptr() {return this.ptr.asSlice(OFFSET$pLongTermRefPicsSps, LAYOUT$pLongTermRefPicsSps);}

	public java.lang.foreign.MemorySegment pSequenceParameterSetVui() {return this.ptr.get(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui);}
	public void pSequenceParameterSetVui(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui, value);}
	public java.lang.foreign.MemorySegment pSequenceParameterSetVui_ptr() {return this.ptr.asSlice(OFFSET$pSequenceParameterSetVui, LAYOUT$pSequenceParameterSetVui);}

	public java.lang.foreign.MemorySegment pPredictorPaletteEntries() {return this.ptr.get(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries);}
	public void pPredictorPaletteEntries(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries, value);}
	public java.lang.foreign.MemorySegment pPredictorPaletteEntries_ptr() {return this.ptr.asSlice(OFFSET$pPredictorPaletteEntries, LAYOUT$pPredictorPaletteEntries);}
}

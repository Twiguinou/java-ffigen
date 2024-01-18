package vulkan;

public record StdVideoH265SequenceParameterSetVui(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH265SpsVuiFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$aspect_ratio_idc = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$aspect_ratio_idc = 4L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$sar_width = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$sar_width = 8L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$sar_height = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$sar_height = 10L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$video_format = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$video_format = 12L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$colour_primaries = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$colour_primaries = 13L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$transfer_characteristics = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$transfer_characteristics = 14L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$matrix_coeffs = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$matrix_coeffs = 15L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_sample_loc_type_top_field = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$chroma_sample_loc_type_top_field = 16L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_sample_loc_type_bottom_field = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$chroma_sample_loc_type_bottom_field = 17L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved1 = 18L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved2 = 19L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$def_disp_win_left_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$def_disp_win_left_offset = 20L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$def_disp_win_right_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$def_disp_win_right_offset = 22L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$def_disp_win_top_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$def_disp_win_top_offset = 24L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$def_disp_win_bottom_offset = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$def_disp_win_bottom_offset = 26L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vui_num_units_in_tick = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vui_num_units_in_tick = 28L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vui_time_scale = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vui_time_scale = 32L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vui_num_ticks_poc_diff_one_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vui_num_ticks_poc_diff_one_minus1 = 36L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$min_spatial_segmentation_idc = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$min_spatial_segmentation_idc = 40L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$reserved3 = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$reserved3 = 42L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$max_bytes_per_pic_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$max_bytes_per_pic_denom = 44L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$max_bits_per_min_cu_denom = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$max_bits_per_min_cu_denom = 45L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_max_mv_length_horizontal = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_max_mv_length_horizontal = 46L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_max_mv_length_vertical = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_max_mv_length_vertical = 47L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pHrdParameters = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pHrdParameters = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$aspect_ratio_idc,
			LAYOUT$sar_width,
			LAYOUT$sar_height,
			LAYOUT$video_format,
			LAYOUT$colour_primaries,
			LAYOUT$transfer_characteristics,
			LAYOUT$matrix_coeffs,
			LAYOUT$chroma_sample_loc_type_top_field,
			LAYOUT$chroma_sample_loc_type_bottom_field,
			LAYOUT$reserved1,
			LAYOUT$reserved2,
			LAYOUT$def_disp_win_left_offset,
			LAYOUT$def_disp_win_right_offset,
			LAYOUT$def_disp_win_top_offset,
			LAYOUT$def_disp_win_bottom_offset,
			LAYOUT$vui_num_units_in_tick,
			LAYOUT$vui_time_scale,
			LAYOUT$vui_num_ticks_poc_diff_one_minus1,
			LAYOUT$min_spatial_segmentation_idc,
			LAYOUT$reserved3,
			LAYOUT$max_bytes_per_pic_denom,
			LAYOUT$max_bits_per_min_cu_denom,
			LAYOUT$log2_max_mv_length_horizontal,
			LAYOUT$log2_max_mv_length_vertical,
			LAYOUT$pHrdParameters
	).withName("StdVideoH265SequenceParameterSetVui");

	public StdVideoH265SequenceParameterSetVui(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoH265SpsVuiFlags flags() {return new vulkan.StdVideoH265SpsVuiFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public int aspect_ratio_idc() {return this.ptr.get(LAYOUT$aspect_ratio_idc, OFFSET$aspect_ratio_idc);}
	public void aspect_ratio_idc(int value) {this.ptr.set(LAYOUT$aspect_ratio_idc, OFFSET$aspect_ratio_idc, value);}
	public java.lang.foreign.MemorySegment aspect_ratio_idc_ptr() {return this.ptr.asSlice(OFFSET$aspect_ratio_idc, LAYOUT$aspect_ratio_idc);}

	public short sar_width() {return this.ptr.get(LAYOUT$sar_width, OFFSET$sar_width);}
	public void sar_width(short value) {this.ptr.set(LAYOUT$sar_width, OFFSET$sar_width, value);}
	public java.lang.foreign.MemorySegment sar_width_ptr() {return this.ptr.asSlice(OFFSET$sar_width, LAYOUT$sar_width);}

	public short sar_height() {return this.ptr.get(LAYOUT$sar_height, OFFSET$sar_height);}
	public void sar_height(short value) {this.ptr.set(LAYOUT$sar_height, OFFSET$sar_height, value);}
	public java.lang.foreign.MemorySegment sar_height_ptr() {return this.ptr.asSlice(OFFSET$sar_height, LAYOUT$sar_height);}

	public char video_format() {return (char)this.ptr.get(LAYOUT$video_format, OFFSET$video_format);}
	public void video_format(char value) {this.ptr.set(LAYOUT$video_format, OFFSET$video_format, (byte)value);}
	public java.lang.foreign.MemorySegment video_format_ptr() {return this.ptr.asSlice(OFFSET$video_format, LAYOUT$video_format);}

	public char colour_primaries() {return (char)this.ptr.get(LAYOUT$colour_primaries, OFFSET$colour_primaries);}
	public void colour_primaries(char value) {this.ptr.set(LAYOUT$colour_primaries, OFFSET$colour_primaries, (byte)value);}
	public java.lang.foreign.MemorySegment colour_primaries_ptr() {return this.ptr.asSlice(OFFSET$colour_primaries, LAYOUT$colour_primaries);}

	public char transfer_characteristics() {return (char)this.ptr.get(LAYOUT$transfer_characteristics, OFFSET$transfer_characteristics);}
	public void transfer_characteristics(char value) {this.ptr.set(LAYOUT$transfer_characteristics, OFFSET$transfer_characteristics, (byte)value);}
	public java.lang.foreign.MemorySegment transfer_characteristics_ptr() {return this.ptr.asSlice(OFFSET$transfer_characteristics, LAYOUT$transfer_characteristics);}

	public char matrix_coeffs() {return (char)this.ptr.get(LAYOUT$matrix_coeffs, OFFSET$matrix_coeffs);}
	public void matrix_coeffs(char value) {this.ptr.set(LAYOUT$matrix_coeffs, OFFSET$matrix_coeffs, (byte)value);}
	public java.lang.foreign.MemorySegment matrix_coeffs_ptr() {return this.ptr.asSlice(OFFSET$matrix_coeffs, LAYOUT$matrix_coeffs);}

	public char chroma_sample_loc_type_top_field() {return (char)this.ptr.get(LAYOUT$chroma_sample_loc_type_top_field, OFFSET$chroma_sample_loc_type_top_field);}
	public void chroma_sample_loc_type_top_field(char value) {this.ptr.set(LAYOUT$chroma_sample_loc_type_top_field, OFFSET$chroma_sample_loc_type_top_field, (byte)value);}
	public java.lang.foreign.MemorySegment chroma_sample_loc_type_top_field_ptr() {return this.ptr.asSlice(OFFSET$chroma_sample_loc_type_top_field, LAYOUT$chroma_sample_loc_type_top_field);}

	public char chroma_sample_loc_type_bottom_field() {return (char)this.ptr.get(LAYOUT$chroma_sample_loc_type_bottom_field, OFFSET$chroma_sample_loc_type_bottom_field);}
	public void chroma_sample_loc_type_bottom_field(char value) {this.ptr.set(LAYOUT$chroma_sample_loc_type_bottom_field, OFFSET$chroma_sample_loc_type_bottom_field, (byte)value);}
	public java.lang.foreign.MemorySegment chroma_sample_loc_type_bottom_field_ptr() {return this.ptr.asSlice(OFFSET$chroma_sample_loc_type_bottom_field, LAYOUT$chroma_sample_loc_type_bottom_field);}

	public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
	public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
	public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

	public char reserved2() {return (char)this.ptr.get(LAYOUT$reserved2, OFFSET$reserved2);}
	public void reserved2(char value) {this.ptr.set(LAYOUT$reserved2, OFFSET$reserved2, (byte)value);}
	public java.lang.foreign.MemorySegment reserved2_ptr() {return this.ptr.asSlice(OFFSET$reserved2, LAYOUT$reserved2);}

	public short def_disp_win_left_offset() {return this.ptr.get(LAYOUT$def_disp_win_left_offset, OFFSET$def_disp_win_left_offset);}
	public void def_disp_win_left_offset(short value) {this.ptr.set(LAYOUT$def_disp_win_left_offset, OFFSET$def_disp_win_left_offset, value);}
	public java.lang.foreign.MemorySegment def_disp_win_left_offset_ptr() {return this.ptr.asSlice(OFFSET$def_disp_win_left_offset, LAYOUT$def_disp_win_left_offset);}

	public short def_disp_win_right_offset() {return this.ptr.get(LAYOUT$def_disp_win_right_offset, OFFSET$def_disp_win_right_offset);}
	public void def_disp_win_right_offset(short value) {this.ptr.set(LAYOUT$def_disp_win_right_offset, OFFSET$def_disp_win_right_offset, value);}
	public java.lang.foreign.MemorySegment def_disp_win_right_offset_ptr() {return this.ptr.asSlice(OFFSET$def_disp_win_right_offset, LAYOUT$def_disp_win_right_offset);}

	public short def_disp_win_top_offset() {return this.ptr.get(LAYOUT$def_disp_win_top_offset, OFFSET$def_disp_win_top_offset);}
	public void def_disp_win_top_offset(short value) {this.ptr.set(LAYOUT$def_disp_win_top_offset, OFFSET$def_disp_win_top_offset, value);}
	public java.lang.foreign.MemorySegment def_disp_win_top_offset_ptr() {return this.ptr.asSlice(OFFSET$def_disp_win_top_offset, LAYOUT$def_disp_win_top_offset);}

	public short def_disp_win_bottom_offset() {return this.ptr.get(LAYOUT$def_disp_win_bottom_offset, OFFSET$def_disp_win_bottom_offset);}
	public void def_disp_win_bottom_offset(short value) {this.ptr.set(LAYOUT$def_disp_win_bottom_offset, OFFSET$def_disp_win_bottom_offset, value);}
	public java.lang.foreign.MemorySegment def_disp_win_bottom_offset_ptr() {return this.ptr.asSlice(OFFSET$def_disp_win_bottom_offset, LAYOUT$def_disp_win_bottom_offset);}

	public int vui_num_units_in_tick() {return this.ptr.get(LAYOUT$vui_num_units_in_tick, OFFSET$vui_num_units_in_tick);}
	public void vui_num_units_in_tick(int value) {this.ptr.set(LAYOUT$vui_num_units_in_tick, OFFSET$vui_num_units_in_tick, value);}
	public java.lang.foreign.MemorySegment vui_num_units_in_tick_ptr() {return this.ptr.asSlice(OFFSET$vui_num_units_in_tick, LAYOUT$vui_num_units_in_tick);}

	public int vui_time_scale() {return this.ptr.get(LAYOUT$vui_time_scale, OFFSET$vui_time_scale);}
	public void vui_time_scale(int value) {this.ptr.set(LAYOUT$vui_time_scale, OFFSET$vui_time_scale, value);}
	public java.lang.foreign.MemorySegment vui_time_scale_ptr() {return this.ptr.asSlice(OFFSET$vui_time_scale, LAYOUT$vui_time_scale);}

	public int vui_num_ticks_poc_diff_one_minus1() {return this.ptr.get(LAYOUT$vui_num_ticks_poc_diff_one_minus1, OFFSET$vui_num_ticks_poc_diff_one_minus1);}
	public void vui_num_ticks_poc_diff_one_minus1(int value) {this.ptr.set(LAYOUT$vui_num_ticks_poc_diff_one_minus1, OFFSET$vui_num_ticks_poc_diff_one_minus1, value);}
	public java.lang.foreign.MemorySegment vui_num_ticks_poc_diff_one_minus1_ptr() {return this.ptr.asSlice(OFFSET$vui_num_ticks_poc_diff_one_minus1, LAYOUT$vui_num_ticks_poc_diff_one_minus1);}

	public short min_spatial_segmentation_idc() {return this.ptr.get(LAYOUT$min_spatial_segmentation_idc, OFFSET$min_spatial_segmentation_idc);}
	public void min_spatial_segmentation_idc(short value) {this.ptr.set(LAYOUT$min_spatial_segmentation_idc, OFFSET$min_spatial_segmentation_idc, value);}
	public java.lang.foreign.MemorySegment min_spatial_segmentation_idc_ptr() {return this.ptr.asSlice(OFFSET$min_spatial_segmentation_idc, LAYOUT$min_spatial_segmentation_idc);}

	public short reserved3() {return this.ptr.get(LAYOUT$reserved3, OFFSET$reserved3);}
	public void reserved3(short value) {this.ptr.set(LAYOUT$reserved3, OFFSET$reserved3, value);}
	public java.lang.foreign.MemorySegment reserved3_ptr() {return this.ptr.asSlice(OFFSET$reserved3, LAYOUT$reserved3);}

	public char max_bytes_per_pic_denom() {return (char)this.ptr.get(LAYOUT$max_bytes_per_pic_denom, OFFSET$max_bytes_per_pic_denom);}
	public void max_bytes_per_pic_denom(char value) {this.ptr.set(LAYOUT$max_bytes_per_pic_denom, OFFSET$max_bytes_per_pic_denom, (byte)value);}
	public java.lang.foreign.MemorySegment max_bytes_per_pic_denom_ptr() {return this.ptr.asSlice(OFFSET$max_bytes_per_pic_denom, LAYOUT$max_bytes_per_pic_denom);}

	public char max_bits_per_min_cu_denom() {return (char)this.ptr.get(LAYOUT$max_bits_per_min_cu_denom, OFFSET$max_bits_per_min_cu_denom);}
	public void max_bits_per_min_cu_denom(char value) {this.ptr.set(LAYOUT$max_bits_per_min_cu_denom, OFFSET$max_bits_per_min_cu_denom, (byte)value);}
	public java.lang.foreign.MemorySegment max_bits_per_min_cu_denom_ptr() {return this.ptr.asSlice(OFFSET$max_bits_per_min_cu_denom, LAYOUT$max_bits_per_min_cu_denom);}

	public char log2_max_mv_length_horizontal() {return (char)this.ptr.get(LAYOUT$log2_max_mv_length_horizontal, OFFSET$log2_max_mv_length_horizontal);}
	public void log2_max_mv_length_horizontal(char value) {this.ptr.set(LAYOUT$log2_max_mv_length_horizontal, OFFSET$log2_max_mv_length_horizontal, (byte)value);}
	public java.lang.foreign.MemorySegment log2_max_mv_length_horizontal_ptr() {return this.ptr.asSlice(OFFSET$log2_max_mv_length_horizontal, LAYOUT$log2_max_mv_length_horizontal);}

	public char log2_max_mv_length_vertical() {return (char)this.ptr.get(LAYOUT$log2_max_mv_length_vertical, OFFSET$log2_max_mv_length_vertical);}
	public void log2_max_mv_length_vertical(char value) {this.ptr.set(LAYOUT$log2_max_mv_length_vertical, OFFSET$log2_max_mv_length_vertical, (byte)value);}
	public java.lang.foreign.MemorySegment log2_max_mv_length_vertical_ptr() {return this.ptr.asSlice(OFFSET$log2_max_mv_length_vertical, LAYOUT$log2_max_mv_length_vertical);}

	public java.lang.foreign.MemorySegment pHrdParameters() {return this.ptr.get(LAYOUT$pHrdParameters, OFFSET$pHrdParameters);}
	public void pHrdParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pHrdParameters, OFFSET$pHrdParameters, value);}
	public java.lang.foreign.MemorySegment pHrdParameters_ptr() {return this.ptr.asSlice(OFFSET$pHrdParameters, LAYOUT$pHrdParameters);}
}

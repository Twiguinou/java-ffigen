package vulkan;

public record StdVideoH264SequenceParameterSetVui(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH264SpsVuiFlags.gStructLayout;
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
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$matrix_coefficients = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$matrix_coefficients = 15L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$num_units_in_tick = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$num_units_in_tick = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$time_scale = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$time_scale = 20L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$max_num_reorder_frames = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$max_num_reorder_frames = 24L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$max_dec_frame_buffering = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$max_dec_frame_buffering = 25L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_sample_loc_type_top_field = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$chroma_sample_loc_type_top_field = 26L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$chroma_sample_loc_type_bottom_field = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$chroma_sample_loc_type_bottom_field = 27L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$reserved1 = 28L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pHrdParameters = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pHrdParameters = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$aspect_ratio_idc,
			LAYOUT$sar_width,
			LAYOUT$sar_height,
			LAYOUT$video_format,
			LAYOUT$colour_primaries,
			LAYOUT$transfer_characteristics,
			LAYOUT$matrix_coefficients,
			LAYOUT$num_units_in_tick,
			LAYOUT$time_scale,
			LAYOUT$max_num_reorder_frames,
			LAYOUT$max_dec_frame_buffering,
			LAYOUT$chroma_sample_loc_type_top_field,
			LAYOUT$chroma_sample_loc_type_bottom_field,
			LAYOUT$reserved1,
			LAYOUT$pHrdParameters
	).withName("StdVideoH264SequenceParameterSetVui");

	public StdVideoH264SequenceParameterSetVui(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoH264SpsVuiFlags flags() {return new vulkan.StdVideoH264SpsVuiFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

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

	public char matrix_coefficients() {return (char)this.ptr.get(LAYOUT$matrix_coefficients, OFFSET$matrix_coefficients);}
	public void matrix_coefficients(char value) {this.ptr.set(LAYOUT$matrix_coefficients, OFFSET$matrix_coefficients, (byte)value);}
	public java.lang.foreign.MemorySegment matrix_coefficients_ptr() {return this.ptr.asSlice(OFFSET$matrix_coefficients, LAYOUT$matrix_coefficients);}

	public int num_units_in_tick() {return this.ptr.get(LAYOUT$num_units_in_tick, OFFSET$num_units_in_tick);}
	public void num_units_in_tick(int value) {this.ptr.set(LAYOUT$num_units_in_tick, OFFSET$num_units_in_tick, value);}
	public java.lang.foreign.MemorySegment num_units_in_tick_ptr() {return this.ptr.asSlice(OFFSET$num_units_in_tick, LAYOUT$num_units_in_tick);}

	public int time_scale() {return this.ptr.get(LAYOUT$time_scale, OFFSET$time_scale);}
	public void time_scale(int value) {this.ptr.set(LAYOUT$time_scale, OFFSET$time_scale, value);}
	public java.lang.foreign.MemorySegment time_scale_ptr() {return this.ptr.asSlice(OFFSET$time_scale, LAYOUT$time_scale);}

	public char max_num_reorder_frames() {return (char)this.ptr.get(LAYOUT$max_num_reorder_frames, OFFSET$max_num_reorder_frames);}
	public void max_num_reorder_frames(char value) {this.ptr.set(LAYOUT$max_num_reorder_frames, OFFSET$max_num_reorder_frames, (byte)value);}
	public java.lang.foreign.MemorySegment max_num_reorder_frames_ptr() {return this.ptr.asSlice(OFFSET$max_num_reorder_frames, LAYOUT$max_num_reorder_frames);}

	public char max_dec_frame_buffering() {return (char)this.ptr.get(LAYOUT$max_dec_frame_buffering, OFFSET$max_dec_frame_buffering);}
	public void max_dec_frame_buffering(char value) {this.ptr.set(LAYOUT$max_dec_frame_buffering, OFFSET$max_dec_frame_buffering, (byte)value);}
	public java.lang.foreign.MemorySegment max_dec_frame_buffering_ptr() {return this.ptr.asSlice(OFFSET$max_dec_frame_buffering, LAYOUT$max_dec_frame_buffering);}

	public char chroma_sample_loc_type_top_field() {return (char)this.ptr.get(LAYOUT$chroma_sample_loc_type_top_field, OFFSET$chroma_sample_loc_type_top_field);}
	public void chroma_sample_loc_type_top_field(char value) {this.ptr.set(LAYOUT$chroma_sample_loc_type_top_field, OFFSET$chroma_sample_loc_type_top_field, (byte)value);}
	public java.lang.foreign.MemorySegment chroma_sample_loc_type_top_field_ptr() {return this.ptr.asSlice(OFFSET$chroma_sample_loc_type_top_field, LAYOUT$chroma_sample_loc_type_top_field);}

	public char chroma_sample_loc_type_bottom_field() {return (char)this.ptr.get(LAYOUT$chroma_sample_loc_type_bottom_field, OFFSET$chroma_sample_loc_type_bottom_field);}
	public void chroma_sample_loc_type_bottom_field(char value) {this.ptr.set(LAYOUT$chroma_sample_loc_type_bottom_field, OFFSET$chroma_sample_loc_type_bottom_field, (byte)value);}
	public java.lang.foreign.MemorySegment chroma_sample_loc_type_bottom_field_ptr() {return this.ptr.asSlice(OFFSET$chroma_sample_loc_type_bottom_field, LAYOUT$chroma_sample_loc_type_bottom_field);}

	public int reserved1() {return this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
	public void reserved1(int value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, value);}
	public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

	public java.lang.foreign.MemorySegment pHrdParameters() {return this.ptr.get(LAYOUT$pHrdParameters, OFFSET$pHrdParameters);}
	public void pHrdParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pHrdParameters, OFFSET$pHrdParameters, value);}
	public java.lang.foreign.MemorySegment pHrdParameters_ptr() {return this.ptr.asSlice(OFFSET$pHrdParameters, LAYOUT$pHrdParameters);}
}

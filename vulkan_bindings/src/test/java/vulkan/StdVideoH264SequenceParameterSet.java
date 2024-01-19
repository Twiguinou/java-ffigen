package vulkan;

public record StdVideoH264SequenceParameterSet(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH264SpsFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$profile_idc = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$profile_idc = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$level_idc = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$level_idc = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$chroma_format_idc = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$chroma_format_idc = 12L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$seq_parameter_set_id = 16L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$bit_depth_luma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$bit_depth_luma_minus8 = 17L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$bit_depth_chroma_minus8 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$bit_depth_chroma_minus8 = 18L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_max_frame_num_minus4 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_max_frame_num_minus4 = 19L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pic_order_cnt_type = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pic_order_cnt_type = 20L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$offset_for_non_ref_pic = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$offset_for_non_ref_pic = 24L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$offset_for_top_to_bottom_field = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$offset_for_top_to_bottom_field = 28L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$log2_max_pic_order_cnt_lsb_minus4 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$log2_max_pic_order_cnt_lsb_minus4 = 32L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$num_ref_frames_in_pic_order_cnt_cycle = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$num_ref_frames_in_pic_order_cnt_cycle = 33L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$max_num_ref_frames = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$max_num_ref_frames = 34L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved1 = 35L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pic_width_in_mbs_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pic_width_in_mbs_minus1 = 36L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$pic_height_in_map_units_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$pic_height_in_map_units_minus1 = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frame_crop_left_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$frame_crop_left_offset = 44L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frame_crop_right_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$frame_crop_right_offset = 48L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frame_crop_top_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$frame_crop_top_offset = 52L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$frame_crop_bottom_offset = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$frame_crop_bottom_offset = 56L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$reserved2 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$reserved2 = 60L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pOffsetForRefFrame = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pOffsetForRefFrame = 64L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pScalingLists = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pScalingLists = 72L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSequenceParameterSetVui = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSequenceParameterSetVui = 80L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$profile_idc,
			LAYOUT$level_idc,
			LAYOUT$chroma_format_idc,
			LAYOUT$seq_parameter_set_id,
			LAYOUT$bit_depth_luma_minus8,
			LAYOUT$bit_depth_chroma_minus8,
			LAYOUT$log2_max_frame_num_minus4,
			LAYOUT$pic_order_cnt_type,
			LAYOUT$offset_for_non_ref_pic,
			LAYOUT$offset_for_top_to_bottom_field,
			LAYOUT$log2_max_pic_order_cnt_lsb_minus4,
			LAYOUT$num_ref_frames_in_pic_order_cnt_cycle,
			LAYOUT$max_num_ref_frames,
			LAYOUT$reserved1,
			LAYOUT$pic_width_in_mbs_minus1,
			LAYOUT$pic_height_in_map_units_minus1,
			LAYOUT$frame_crop_left_offset,
			LAYOUT$frame_crop_right_offset,
			LAYOUT$frame_crop_top_offset,
			LAYOUT$frame_crop_bottom_offset,
			LAYOUT$reserved2,
			LAYOUT$pOffsetForRefFrame,
			LAYOUT$pScalingLists,
			LAYOUT$pSequenceParameterSetVui
	).withName("StdVideoH264SequenceParameterSet");

	public StdVideoH264SequenceParameterSet(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoH264SpsFlags flags() {return new vulkan.StdVideoH264SpsFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public int profile_idc() {return this.ptr.get(LAYOUT$profile_idc, OFFSET$profile_idc);}
	public void profile_idc(int value) {this.ptr.set(LAYOUT$profile_idc, OFFSET$profile_idc, value);}
	public java.lang.foreign.MemorySegment profile_idc_ptr() {return this.ptr.asSlice(OFFSET$profile_idc, LAYOUT$profile_idc);}

	public int level_idc() {return this.ptr.get(LAYOUT$level_idc, OFFSET$level_idc);}
	public void level_idc(int value) {this.ptr.set(LAYOUT$level_idc, OFFSET$level_idc, value);}
	public java.lang.foreign.MemorySegment level_idc_ptr() {return this.ptr.asSlice(OFFSET$level_idc, LAYOUT$level_idc);}

	public int chroma_format_idc() {return this.ptr.get(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc);}
	public void chroma_format_idc(int value) {this.ptr.set(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc, value);}
	public java.lang.foreign.MemorySegment chroma_format_idc_ptr() {return this.ptr.asSlice(OFFSET$chroma_format_idc, LAYOUT$chroma_format_idc);}

	public char seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id);}
	public void seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$seq_parameter_set_id, LAYOUT$seq_parameter_set_id);}

	public char bit_depth_luma_minus8() {return (char)this.ptr.get(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8);}
	public void bit_depth_luma_minus8(char value) {this.ptr.set(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8, (byte)value);}
	public java.lang.foreign.MemorySegment bit_depth_luma_minus8_ptr() {return this.ptr.asSlice(OFFSET$bit_depth_luma_minus8, LAYOUT$bit_depth_luma_minus8);}

	public char bit_depth_chroma_minus8() {return (char)this.ptr.get(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8);}
	public void bit_depth_chroma_minus8(char value) {this.ptr.set(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8, (byte)value);}
	public java.lang.foreign.MemorySegment bit_depth_chroma_minus8_ptr() {return this.ptr.asSlice(OFFSET$bit_depth_chroma_minus8, LAYOUT$bit_depth_chroma_minus8);}

	public char log2_max_frame_num_minus4() {return (char)this.ptr.get(LAYOUT$log2_max_frame_num_minus4, OFFSET$log2_max_frame_num_minus4);}
	public void log2_max_frame_num_minus4(char value) {this.ptr.set(LAYOUT$log2_max_frame_num_minus4, OFFSET$log2_max_frame_num_minus4, (byte)value);}
	public java.lang.foreign.MemorySegment log2_max_frame_num_minus4_ptr() {return this.ptr.asSlice(OFFSET$log2_max_frame_num_minus4, LAYOUT$log2_max_frame_num_minus4);}

	public int pic_order_cnt_type() {return this.ptr.get(LAYOUT$pic_order_cnt_type, OFFSET$pic_order_cnt_type);}
	public void pic_order_cnt_type(int value) {this.ptr.set(LAYOUT$pic_order_cnt_type, OFFSET$pic_order_cnt_type, value);}
	public java.lang.foreign.MemorySegment pic_order_cnt_type_ptr() {return this.ptr.asSlice(OFFSET$pic_order_cnt_type, LAYOUT$pic_order_cnt_type);}

	public int offset_for_non_ref_pic() {return this.ptr.get(LAYOUT$offset_for_non_ref_pic, OFFSET$offset_for_non_ref_pic);}
	public void offset_for_non_ref_pic(int value) {this.ptr.set(LAYOUT$offset_for_non_ref_pic, OFFSET$offset_for_non_ref_pic, value);}
	public java.lang.foreign.MemorySegment offset_for_non_ref_pic_ptr() {return this.ptr.asSlice(OFFSET$offset_for_non_ref_pic, LAYOUT$offset_for_non_ref_pic);}

	public int offset_for_top_to_bottom_field() {return this.ptr.get(LAYOUT$offset_for_top_to_bottom_field, OFFSET$offset_for_top_to_bottom_field);}
	public void offset_for_top_to_bottom_field(int value) {this.ptr.set(LAYOUT$offset_for_top_to_bottom_field, OFFSET$offset_for_top_to_bottom_field, value);}
	public java.lang.foreign.MemorySegment offset_for_top_to_bottom_field_ptr() {return this.ptr.asSlice(OFFSET$offset_for_top_to_bottom_field, LAYOUT$offset_for_top_to_bottom_field);}

	public char log2_max_pic_order_cnt_lsb_minus4() {return (char)this.ptr.get(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4);}
	public void log2_max_pic_order_cnt_lsb_minus4(char value) {this.ptr.set(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4, (byte)value);}
	public java.lang.foreign.MemorySegment log2_max_pic_order_cnt_lsb_minus4_ptr() {return this.ptr.asSlice(OFFSET$log2_max_pic_order_cnt_lsb_minus4, LAYOUT$log2_max_pic_order_cnt_lsb_minus4);}

	public char num_ref_frames_in_pic_order_cnt_cycle() {return (char)this.ptr.get(LAYOUT$num_ref_frames_in_pic_order_cnt_cycle, OFFSET$num_ref_frames_in_pic_order_cnt_cycle);}
	public void num_ref_frames_in_pic_order_cnt_cycle(char value) {this.ptr.set(LAYOUT$num_ref_frames_in_pic_order_cnt_cycle, OFFSET$num_ref_frames_in_pic_order_cnt_cycle, (byte)value);}
	public java.lang.foreign.MemorySegment num_ref_frames_in_pic_order_cnt_cycle_ptr() {return this.ptr.asSlice(OFFSET$num_ref_frames_in_pic_order_cnt_cycle, LAYOUT$num_ref_frames_in_pic_order_cnt_cycle);}

	public char max_num_ref_frames() {return (char)this.ptr.get(LAYOUT$max_num_ref_frames, OFFSET$max_num_ref_frames);}
	public void max_num_ref_frames(char value) {this.ptr.set(LAYOUT$max_num_ref_frames, OFFSET$max_num_ref_frames, (byte)value);}
	public java.lang.foreign.MemorySegment max_num_ref_frames_ptr() {return this.ptr.asSlice(OFFSET$max_num_ref_frames, LAYOUT$max_num_ref_frames);}

	public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
	public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
	public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

	public int pic_width_in_mbs_minus1() {return this.ptr.get(LAYOUT$pic_width_in_mbs_minus1, OFFSET$pic_width_in_mbs_minus1);}
	public void pic_width_in_mbs_minus1(int value) {this.ptr.set(LAYOUT$pic_width_in_mbs_minus1, OFFSET$pic_width_in_mbs_minus1, value);}
	public java.lang.foreign.MemorySegment pic_width_in_mbs_minus1_ptr() {return this.ptr.asSlice(OFFSET$pic_width_in_mbs_minus1, LAYOUT$pic_width_in_mbs_minus1);}

	public int pic_height_in_map_units_minus1() {return this.ptr.get(LAYOUT$pic_height_in_map_units_minus1, OFFSET$pic_height_in_map_units_minus1);}
	public void pic_height_in_map_units_minus1(int value) {this.ptr.set(LAYOUT$pic_height_in_map_units_minus1, OFFSET$pic_height_in_map_units_minus1, value);}
	public java.lang.foreign.MemorySegment pic_height_in_map_units_minus1_ptr() {return this.ptr.asSlice(OFFSET$pic_height_in_map_units_minus1, LAYOUT$pic_height_in_map_units_minus1);}

	public int frame_crop_left_offset() {return this.ptr.get(LAYOUT$frame_crop_left_offset, OFFSET$frame_crop_left_offset);}
	public void frame_crop_left_offset(int value) {this.ptr.set(LAYOUT$frame_crop_left_offset, OFFSET$frame_crop_left_offset, value);}
	public java.lang.foreign.MemorySegment frame_crop_left_offset_ptr() {return this.ptr.asSlice(OFFSET$frame_crop_left_offset, LAYOUT$frame_crop_left_offset);}

	public int frame_crop_right_offset() {return this.ptr.get(LAYOUT$frame_crop_right_offset, OFFSET$frame_crop_right_offset);}
	public void frame_crop_right_offset(int value) {this.ptr.set(LAYOUT$frame_crop_right_offset, OFFSET$frame_crop_right_offset, value);}
	public java.lang.foreign.MemorySegment frame_crop_right_offset_ptr() {return this.ptr.asSlice(OFFSET$frame_crop_right_offset, LAYOUT$frame_crop_right_offset);}

	public int frame_crop_top_offset() {return this.ptr.get(LAYOUT$frame_crop_top_offset, OFFSET$frame_crop_top_offset);}
	public void frame_crop_top_offset(int value) {this.ptr.set(LAYOUT$frame_crop_top_offset, OFFSET$frame_crop_top_offset, value);}
	public java.lang.foreign.MemorySegment frame_crop_top_offset_ptr() {return this.ptr.asSlice(OFFSET$frame_crop_top_offset, LAYOUT$frame_crop_top_offset);}

	public int frame_crop_bottom_offset() {return this.ptr.get(LAYOUT$frame_crop_bottom_offset, OFFSET$frame_crop_bottom_offset);}
	public void frame_crop_bottom_offset(int value) {this.ptr.set(LAYOUT$frame_crop_bottom_offset, OFFSET$frame_crop_bottom_offset, value);}
	public java.lang.foreign.MemorySegment frame_crop_bottom_offset_ptr() {return this.ptr.asSlice(OFFSET$frame_crop_bottom_offset, LAYOUT$frame_crop_bottom_offset);}

	public int reserved2() {return this.ptr.get(LAYOUT$reserved2, OFFSET$reserved2);}
	public void reserved2(int value) {this.ptr.set(LAYOUT$reserved2, OFFSET$reserved2, value);}
	public java.lang.foreign.MemorySegment reserved2_ptr() {return this.ptr.asSlice(OFFSET$reserved2, LAYOUT$reserved2);}

	public java.lang.foreign.MemorySegment pOffsetForRefFrame() {return this.ptr.get(LAYOUT$pOffsetForRefFrame, OFFSET$pOffsetForRefFrame);}
	public void pOffsetForRefFrame(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pOffsetForRefFrame, OFFSET$pOffsetForRefFrame, value);}
	public java.lang.foreign.MemorySegment pOffsetForRefFrame_ptr() {return this.ptr.asSlice(OFFSET$pOffsetForRefFrame, LAYOUT$pOffsetForRefFrame);}

	public java.lang.foreign.MemorySegment pScalingLists() {return this.ptr.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);}
	public void pScalingLists(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);}
	public java.lang.foreign.MemorySegment pScalingLists_ptr() {return this.ptr.asSlice(OFFSET$pScalingLists, LAYOUT$pScalingLists);}

	public java.lang.foreign.MemorySegment pSequenceParameterSetVui() {return this.ptr.get(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui);}
	public void pSequenceParameterSetVui(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui, value);}
	public java.lang.foreign.MemorySegment pSequenceParameterSetVui_ptr() {return this.ptr.asSlice(OFFSET$pSequenceParameterSetVui, LAYOUT$pSequenceParameterSetVui);}
}

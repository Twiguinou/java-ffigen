package vulkan;

public record StdVideoH265VideoParameterSet(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH265VpsFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$vps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$vps_video_parameter_set_id = 4L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$vps_max_sub_layers_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$vps_max_sub_layers_minus1 = 5L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved1 = 6L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved2 = 7L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vps_num_units_in_tick = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vps_num_units_in_tick = 8L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vps_time_scale = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vps_time_scale = 12L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$vps_num_ticks_poc_diff_one_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$vps_num_ticks_poc_diff_one_minus1 = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$reserved3 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$reserved3 = 20L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pDecPicBufMgr = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pDecPicBufMgr = 24L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pHrdParameters = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pHrdParameters = 32L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pProfileTierLevel = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pProfileTierLevel = 40L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$vps_video_parameter_set_id,
			LAYOUT$vps_max_sub_layers_minus1,
			LAYOUT$reserved1,
			LAYOUT$reserved2,
			LAYOUT$vps_num_units_in_tick,
			LAYOUT$vps_time_scale,
			LAYOUT$vps_num_ticks_poc_diff_one_minus1,
			LAYOUT$reserved3,
			LAYOUT$pDecPicBufMgr,
			LAYOUT$pHrdParameters,
			LAYOUT$pProfileTierLevel
	).withName("StdVideoH265VideoParameterSet");

	public StdVideoH265VideoParameterSet(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoH265VpsFlags flags() {return new vulkan.StdVideoH265VpsFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public char vps_video_parameter_set_id() {return (char)this.ptr.get(LAYOUT$vps_video_parameter_set_id, OFFSET$vps_video_parameter_set_id);}
	public void vps_video_parameter_set_id(char value) {this.ptr.set(LAYOUT$vps_video_parameter_set_id, OFFSET$vps_video_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment vps_video_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$vps_video_parameter_set_id, LAYOUT$vps_video_parameter_set_id);}

	public char vps_max_sub_layers_minus1() {return (char)this.ptr.get(LAYOUT$vps_max_sub_layers_minus1, OFFSET$vps_max_sub_layers_minus1);}
	public void vps_max_sub_layers_minus1(char value) {this.ptr.set(LAYOUT$vps_max_sub_layers_minus1, OFFSET$vps_max_sub_layers_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment vps_max_sub_layers_minus1_ptr() {return this.ptr.asSlice(OFFSET$vps_max_sub_layers_minus1, LAYOUT$vps_max_sub_layers_minus1);}

	public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
	public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
	public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

	public char reserved2() {return (char)this.ptr.get(LAYOUT$reserved2, OFFSET$reserved2);}
	public void reserved2(char value) {this.ptr.set(LAYOUT$reserved2, OFFSET$reserved2, (byte)value);}
	public java.lang.foreign.MemorySegment reserved2_ptr() {return this.ptr.asSlice(OFFSET$reserved2, LAYOUT$reserved2);}

	public int vps_num_units_in_tick() {return this.ptr.get(LAYOUT$vps_num_units_in_tick, OFFSET$vps_num_units_in_tick);}
	public void vps_num_units_in_tick(int value) {this.ptr.set(LAYOUT$vps_num_units_in_tick, OFFSET$vps_num_units_in_tick, value);}
	public java.lang.foreign.MemorySegment vps_num_units_in_tick_ptr() {return this.ptr.asSlice(OFFSET$vps_num_units_in_tick, LAYOUT$vps_num_units_in_tick);}

	public int vps_time_scale() {return this.ptr.get(LAYOUT$vps_time_scale, OFFSET$vps_time_scale);}
	public void vps_time_scale(int value) {this.ptr.set(LAYOUT$vps_time_scale, OFFSET$vps_time_scale, value);}
	public java.lang.foreign.MemorySegment vps_time_scale_ptr() {return this.ptr.asSlice(OFFSET$vps_time_scale, LAYOUT$vps_time_scale);}

	public int vps_num_ticks_poc_diff_one_minus1() {return this.ptr.get(LAYOUT$vps_num_ticks_poc_diff_one_minus1, OFFSET$vps_num_ticks_poc_diff_one_minus1);}
	public void vps_num_ticks_poc_diff_one_minus1(int value) {this.ptr.set(LAYOUT$vps_num_ticks_poc_diff_one_minus1, OFFSET$vps_num_ticks_poc_diff_one_minus1, value);}
	public java.lang.foreign.MemorySegment vps_num_ticks_poc_diff_one_minus1_ptr() {return this.ptr.asSlice(OFFSET$vps_num_ticks_poc_diff_one_minus1, LAYOUT$vps_num_ticks_poc_diff_one_minus1);}

	public int reserved3() {return this.ptr.get(LAYOUT$reserved3, OFFSET$reserved3);}
	public void reserved3(int value) {this.ptr.set(LAYOUT$reserved3, OFFSET$reserved3, value);}
	public java.lang.foreign.MemorySegment reserved3_ptr() {return this.ptr.asSlice(OFFSET$reserved3, LAYOUT$reserved3);}

	public java.lang.foreign.MemorySegment pDecPicBufMgr() {return this.ptr.get(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr);}
	public void pDecPicBufMgr(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr, value);}
	public java.lang.foreign.MemorySegment pDecPicBufMgr_ptr() {return this.ptr.asSlice(OFFSET$pDecPicBufMgr, LAYOUT$pDecPicBufMgr);}

	public java.lang.foreign.MemorySegment pHrdParameters() {return this.ptr.get(LAYOUT$pHrdParameters, OFFSET$pHrdParameters);}
	public void pHrdParameters(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pHrdParameters, OFFSET$pHrdParameters, value);}
	public java.lang.foreign.MemorySegment pHrdParameters_ptr() {return this.ptr.asSlice(OFFSET$pHrdParameters, LAYOUT$pHrdParameters);}

	public java.lang.foreign.MemorySegment pProfileTierLevel() {return this.ptr.get(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel);}
	public void pProfileTierLevel(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel, value);}
	public java.lang.foreign.MemorySegment pProfileTierLevel_ptr() {return this.ptr.asSlice(OFFSET$pProfileTierLevel, LAYOUT$pProfileTierLevel);}
}

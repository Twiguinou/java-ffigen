package vulkan;

public record StdVideoH265HrdParameters(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoH265HrdFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$tick_divisor_minus2 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$tick_divisor_minus2 = 4L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$du_cpb_removal_delay_increment_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$du_cpb_removal_delay_increment_length_minus1 = 5L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$dpb_output_delay_du_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$dpb_output_delay_du_length_minus1 = 6L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$bit_rate_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$bit_rate_scale = 7L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$cpb_size_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$cpb_size_scale = 8L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$cpb_size_du_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$cpb_size_du_scale = 9L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$initial_cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$initial_cpb_removal_delay_length_minus1 = 10L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$au_cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$au_cpb_removal_delay_length_minus1 = 11L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$dpb_output_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$dpb_output_delay_length_minus1 = 12L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$cpb_cnt_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$cpb_cnt_minus1 = 13L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$elemental_duration_in_tc_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(7, java.lang.foreign.ValueLayout.JAVA_SHORT);
	public static final long OFFSET$elemental_duration_in_tc_minus1 = 20L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$reserved = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_SHORT);
	public static final long OFFSET$reserved = 34L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSubLayerHrdParametersNal = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSubLayerHrdParametersNal = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$pSubLayerHrdParametersVcl = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$pSubLayerHrdParametersVcl = 48L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$tick_divisor_minus2,
			LAYOUT$du_cpb_removal_delay_increment_length_minus1,
			LAYOUT$dpb_output_delay_du_length_minus1,
			LAYOUT$bit_rate_scale,
			LAYOUT$cpb_size_scale,
			LAYOUT$cpb_size_du_scale,
			LAYOUT$initial_cpb_removal_delay_length_minus1,
			LAYOUT$au_cpb_removal_delay_length_minus1,
			LAYOUT$dpb_output_delay_length_minus1,
			LAYOUT$cpb_cnt_minus1,
			LAYOUT$elemental_duration_in_tc_minus1,
			LAYOUT$reserved,
			LAYOUT$pSubLayerHrdParametersNal,
			LAYOUT$pSubLayerHrdParametersVcl
	).withName("StdVideoH265HrdParameters");

	public StdVideoH265HrdParameters(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoH265HrdFlags flags() {return new vulkan.StdVideoH265HrdFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public char tick_divisor_minus2() {return (char)this.ptr.get(LAYOUT$tick_divisor_minus2, OFFSET$tick_divisor_minus2);}
	public void tick_divisor_minus2(char value) {this.ptr.set(LAYOUT$tick_divisor_minus2, OFFSET$tick_divisor_minus2, (byte)value);}
	public java.lang.foreign.MemorySegment tick_divisor_minus2_ptr() {return this.ptr.asSlice(OFFSET$tick_divisor_minus2, LAYOUT$tick_divisor_minus2);}

	public char du_cpb_removal_delay_increment_length_minus1() {return (char)this.ptr.get(LAYOUT$du_cpb_removal_delay_increment_length_minus1, OFFSET$du_cpb_removal_delay_increment_length_minus1);}
	public void du_cpb_removal_delay_increment_length_minus1(char value) {this.ptr.set(LAYOUT$du_cpb_removal_delay_increment_length_minus1, OFFSET$du_cpb_removal_delay_increment_length_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment du_cpb_removal_delay_increment_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$du_cpb_removal_delay_increment_length_minus1, LAYOUT$du_cpb_removal_delay_increment_length_minus1);}

	public char dpb_output_delay_du_length_minus1() {return (char)this.ptr.get(LAYOUT$dpb_output_delay_du_length_minus1, OFFSET$dpb_output_delay_du_length_minus1);}
	public void dpb_output_delay_du_length_minus1(char value) {this.ptr.set(LAYOUT$dpb_output_delay_du_length_minus1, OFFSET$dpb_output_delay_du_length_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment dpb_output_delay_du_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$dpb_output_delay_du_length_minus1, LAYOUT$dpb_output_delay_du_length_minus1);}

	public char bit_rate_scale() {return (char)this.ptr.get(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale);}
	public void bit_rate_scale(char value) {this.ptr.set(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale, (byte)value);}
	public java.lang.foreign.MemorySegment bit_rate_scale_ptr() {return this.ptr.asSlice(OFFSET$bit_rate_scale, LAYOUT$bit_rate_scale);}

	public char cpb_size_scale() {return (char)this.ptr.get(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale);}
	public void cpb_size_scale(char value) {this.ptr.set(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale, (byte)value);}
	public java.lang.foreign.MemorySegment cpb_size_scale_ptr() {return this.ptr.asSlice(OFFSET$cpb_size_scale, LAYOUT$cpb_size_scale);}

	public char cpb_size_du_scale() {return (char)this.ptr.get(LAYOUT$cpb_size_du_scale, OFFSET$cpb_size_du_scale);}
	public void cpb_size_du_scale(char value) {this.ptr.set(LAYOUT$cpb_size_du_scale, OFFSET$cpb_size_du_scale, (byte)value);}
	public java.lang.foreign.MemorySegment cpb_size_du_scale_ptr() {return this.ptr.asSlice(OFFSET$cpb_size_du_scale, LAYOUT$cpb_size_du_scale);}

	public char initial_cpb_removal_delay_length_minus1() {return (char)this.ptr.get(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1);}
	public void initial_cpb_removal_delay_length_minus1(char value) {this.ptr.set(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment initial_cpb_removal_delay_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$initial_cpb_removal_delay_length_minus1, LAYOUT$initial_cpb_removal_delay_length_minus1);}

	public char au_cpb_removal_delay_length_minus1() {return (char)this.ptr.get(LAYOUT$au_cpb_removal_delay_length_minus1, OFFSET$au_cpb_removal_delay_length_minus1);}
	public void au_cpb_removal_delay_length_minus1(char value) {this.ptr.set(LAYOUT$au_cpb_removal_delay_length_minus1, OFFSET$au_cpb_removal_delay_length_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment au_cpb_removal_delay_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$au_cpb_removal_delay_length_minus1, LAYOUT$au_cpb_removal_delay_length_minus1);}

	public char dpb_output_delay_length_minus1() {return (char)this.ptr.get(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1);}
	public void dpb_output_delay_length_minus1(char value) {this.ptr.set(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment dpb_output_delay_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$dpb_output_delay_length_minus1, LAYOUT$dpb_output_delay_length_minus1);}

	public java.lang.foreign.MemorySegment cpb_cnt_minus1() {return this.ptr.asSlice(OFFSET$cpb_cnt_minus1, LAYOUT$cpb_cnt_minus1);}
	public char cpb_cnt_minus1(int i) {return (char)this.cpb_cnt_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void cpb_cnt_minus1(int i, char value) {this.cpb_cnt_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment elemental_duration_in_tc_minus1() {return this.ptr.asSlice(OFFSET$elemental_duration_in_tc_minus1, LAYOUT$elemental_duration_in_tc_minus1);}
	public short elemental_duration_in_tc_minus1(int i) {return this.elemental_duration_in_tc_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i);}
	public void elemental_duration_in_tc_minus1(int i, short value) {this.elemental_duration_in_tc_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i, value);}

	public java.lang.foreign.MemorySegment reserved() {return this.ptr.asSlice(OFFSET$reserved, LAYOUT$reserved);}
	public short reserved(int i) {return this.reserved().getAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i);}
	public void reserved(int i, short value) {this.reserved().setAtIndex(java.lang.foreign.ValueLayout.JAVA_SHORT, i, value);}

	public java.lang.foreign.MemorySegment pSubLayerHrdParametersNal() {return this.ptr.get(LAYOUT$pSubLayerHrdParametersNal, OFFSET$pSubLayerHrdParametersNal);}
	public void pSubLayerHrdParametersNal(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSubLayerHrdParametersNal, OFFSET$pSubLayerHrdParametersNal, value);}
	public java.lang.foreign.MemorySegment pSubLayerHrdParametersNal_ptr() {return this.ptr.asSlice(OFFSET$pSubLayerHrdParametersNal, LAYOUT$pSubLayerHrdParametersNal);}

	public java.lang.foreign.MemorySegment pSubLayerHrdParametersVcl() {return this.ptr.get(LAYOUT$pSubLayerHrdParametersVcl, OFFSET$pSubLayerHrdParametersVcl);}
	public void pSubLayerHrdParametersVcl(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$pSubLayerHrdParametersVcl, OFFSET$pSubLayerHrdParametersVcl, value);}
	public java.lang.foreign.MemorySegment pSubLayerHrdParametersVcl_ptr() {return this.ptr.asSlice(OFFSET$pSubLayerHrdParametersVcl, LAYOUT$pSubLayerHrdParametersVcl);}
}

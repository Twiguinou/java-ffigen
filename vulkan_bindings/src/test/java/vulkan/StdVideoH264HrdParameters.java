package vulkan;

public record StdVideoH264HrdParameters(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$cpb_cnt_minus1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$cpb_cnt_minus1 = 0L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$bit_rate_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$bit_rate_scale = 1L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$cpb_size_scale = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$cpb_size_scale = 2L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$reserved1 = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$reserved1 = 3L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$bit_rate_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$bit_rate_value_minus1 = 4L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$cpb_size_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$cpb_size_value_minus1 = 132L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$cbr_flag = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$cbr_flag = 260L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$initial_cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$initial_cpb_removal_delay_length_minus1 = 292L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cpb_removal_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$cpb_removal_delay_length_minus1 = 296L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$dpb_output_delay_length_minus1 = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$dpb_output_delay_length_minus1 = 300L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$time_offset_length = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$time_offset_length = 304L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$cpb_cnt_minus1,
			LAYOUT$bit_rate_scale,
			LAYOUT$cpb_size_scale,
			LAYOUT$reserved1,
			LAYOUT$bit_rate_value_minus1,
			LAYOUT$cpb_size_value_minus1,
			LAYOUT$cbr_flag,
			LAYOUT$initial_cpb_removal_delay_length_minus1,
			LAYOUT$cpb_removal_delay_length_minus1,
			LAYOUT$dpb_output_delay_length_minus1,
			LAYOUT$time_offset_length
	).withName("StdVideoH264HrdParameters");

	public StdVideoH264HrdParameters(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public char cpb_cnt_minus1() {return (char)this.ptr.get(LAYOUT$cpb_cnt_minus1, OFFSET$cpb_cnt_minus1);}
	public void cpb_cnt_minus1(char value) {this.ptr.set(LAYOUT$cpb_cnt_minus1, OFFSET$cpb_cnt_minus1, (byte)value);}
	public java.lang.foreign.MemorySegment cpb_cnt_minus1_ptr() {return this.ptr.asSlice(OFFSET$cpb_cnt_minus1, LAYOUT$cpb_cnt_minus1);}

	public char bit_rate_scale() {return (char)this.ptr.get(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale);}
	public void bit_rate_scale(char value) {this.ptr.set(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale, (byte)value);}
	public java.lang.foreign.MemorySegment bit_rate_scale_ptr() {return this.ptr.asSlice(OFFSET$bit_rate_scale, LAYOUT$bit_rate_scale);}

	public char cpb_size_scale() {return (char)this.ptr.get(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale);}
	public void cpb_size_scale(char value) {this.ptr.set(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale, (byte)value);}
	public java.lang.foreign.MemorySegment cpb_size_scale_ptr() {return this.ptr.asSlice(OFFSET$cpb_size_scale, LAYOUT$cpb_size_scale);}

	public char reserved1() {return (char)this.ptr.get(LAYOUT$reserved1, OFFSET$reserved1);}
	public void reserved1(char value) {this.ptr.set(LAYOUT$reserved1, OFFSET$reserved1, (byte)value);}
	public java.lang.foreign.MemorySegment reserved1_ptr() {return this.ptr.asSlice(OFFSET$reserved1, LAYOUT$reserved1);}

	public java.lang.foreign.MemorySegment bit_rate_value_minus1() {return this.ptr.asSlice(OFFSET$bit_rate_value_minus1, LAYOUT$bit_rate_value_minus1);}
	public int bit_rate_value_minus1(int i) {return this.bit_rate_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void bit_rate_value_minus1(int i, int value) {this.bit_rate_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public java.lang.foreign.MemorySegment cpb_size_value_minus1() {return this.ptr.asSlice(OFFSET$cpb_size_value_minus1, LAYOUT$cpb_size_value_minus1);}
	public int cpb_size_value_minus1(int i) {return this.cpb_size_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void cpb_size_value_minus1(int i, int value) {this.cpb_size_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public java.lang.foreign.MemorySegment cbr_flag() {return this.ptr.asSlice(OFFSET$cbr_flag, LAYOUT$cbr_flag);}
	public char cbr_flag(int i) {return (char)this.cbr_flag().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void cbr_flag(int i, char value) {this.cbr_flag().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public int initial_cpb_removal_delay_length_minus1() {return this.ptr.get(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1);}
	public void initial_cpb_removal_delay_length_minus1(int value) {this.ptr.set(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1, value);}
	public java.lang.foreign.MemorySegment initial_cpb_removal_delay_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$initial_cpb_removal_delay_length_minus1, LAYOUT$initial_cpb_removal_delay_length_minus1);}

	public int cpb_removal_delay_length_minus1() {return this.ptr.get(LAYOUT$cpb_removal_delay_length_minus1, OFFSET$cpb_removal_delay_length_minus1);}
	public void cpb_removal_delay_length_minus1(int value) {this.ptr.set(LAYOUT$cpb_removal_delay_length_minus1, OFFSET$cpb_removal_delay_length_minus1, value);}
	public java.lang.foreign.MemorySegment cpb_removal_delay_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$cpb_removal_delay_length_minus1, LAYOUT$cpb_removal_delay_length_minus1);}

	public int dpb_output_delay_length_minus1() {return this.ptr.get(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1);}
	public void dpb_output_delay_length_minus1(int value) {this.ptr.set(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1, value);}
	public java.lang.foreign.MemorySegment dpb_output_delay_length_minus1_ptr() {return this.ptr.asSlice(OFFSET$dpb_output_delay_length_minus1, LAYOUT$dpb_output_delay_length_minus1);}

	public int time_offset_length() {return this.ptr.get(LAYOUT$time_offset_length, OFFSET$time_offset_length);}
	public void time_offset_length(int value) {this.ptr.set(LAYOUT$time_offset_length, OFFSET$time_offset_length, value);}
	public java.lang.foreign.MemorySegment time_offset_length_ptr() {return this.ptr.asSlice(OFFSET$time_offset_length, LAYOUT$time_offset_length);}
}

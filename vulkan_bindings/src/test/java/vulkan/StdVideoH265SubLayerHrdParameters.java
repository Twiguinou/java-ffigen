package vulkan;

public record StdVideoH265SubLayerHrdParameters(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.SequenceLayout LAYOUT$bit_rate_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$bit_rate_value_minus1 = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$cpb_size_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$cpb_size_value_minus1 = 128L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$cpb_size_du_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$cpb_size_du_value_minus1 = 256L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$bit_rate_du_value_minus1 = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$bit_rate_du_value_minus1 = 384L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$cbr_flag = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$cbr_flag = 512L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$bit_rate_value_minus1,
			LAYOUT$cpb_size_value_minus1,
			LAYOUT$cpb_size_du_value_minus1,
			LAYOUT$bit_rate_du_value_minus1,
			LAYOUT$cbr_flag
	).withName("StdVideoH265SubLayerHrdParameters");

	public StdVideoH265SubLayerHrdParameters(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment bit_rate_value_minus1() {return this.ptr.asSlice(OFFSET$bit_rate_value_minus1, LAYOUT$bit_rate_value_minus1);}
	public int bit_rate_value_minus1(int i) {return this.bit_rate_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void bit_rate_value_minus1(int i, int value) {this.bit_rate_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public java.lang.foreign.MemorySegment cpb_size_value_minus1() {return this.ptr.asSlice(OFFSET$cpb_size_value_minus1, LAYOUT$cpb_size_value_minus1);}
	public int cpb_size_value_minus1(int i) {return this.cpb_size_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void cpb_size_value_minus1(int i, int value) {this.cpb_size_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public java.lang.foreign.MemorySegment cpb_size_du_value_minus1() {return this.ptr.asSlice(OFFSET$cpb_size_du_value_minus1, LAYOUT$cpb_size_du_value_minus1);}
	public int cpb_size_du_value_minus1(int i) {return this.cpb_size_du_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void cpb_size_du_value_minus1(int i, int value) {this.cpb_size_du_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public java.lang.foreign.MemorySegment bit_rate_du_value_minus1() {return this.ptr.asSlice(OFFSET$bit_rate_du_value_minus1, LAYOUT$bit_rate_du_value_minus1);}
	public int bit_rate_du_value_minus1(int i) {return this.bit_rate_du_value_minus1().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void bit_rate_du_value_minus1(int i, int value) {this.bit_rate_du_value_minus1().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

	public int cbr_flag() {return this.ptr.get(LAYOUT$cbr_flag, OFFSET$cbr_flag);}
	public void cbr_flag(int value) {this.ptr.set(LAYOUT$cbr_flag, OFFSET$cbr_flag, value);}
	public java.lang.foreign.MemorySegment cbr_flag_ptr() {return this.ptr.asSlice(OFFSET$cbr_flag, LAYOUT$cbr_flag);}
}

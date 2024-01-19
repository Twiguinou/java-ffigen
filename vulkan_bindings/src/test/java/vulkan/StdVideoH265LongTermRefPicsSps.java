package vulkan;

public record StdVideoH265LongTermRefPicsSps(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$used_by_curr_pic_lt_sps_flag = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$used_by_curr_pic_lt_sps_flag = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$lt_ref_pic_poc_lsb_sps = java.lang.foreign.MemoryLayout.sequenceLayout(32, java.lang.foreign.ValueLayout.JAVA_INT);
	public static final long OFFSET$lt_ref_pic_poc_lsb_sps = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$used_by_curr_pic_lt_sps_flag,
			LAYOUT$lt_ref_pic_poc_lsb_sps
	).withName("StdVideoH265LongTermRefPicsSps");

	public StdVideoH265LongTermRefPicsSps(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int used_by_curr_pic_lt_sps_flag() {return this.ptr.get(LAYOUT$used_by_curr_pic_lt_sps_flag, OFFSET$used_by_curr_pic_lt_sps_flag);}
	public void used_by_curr_pic_lt_sps_flag(int value) {this.ptr.set(LAYOUT$used_by_curr_pic_lt_sps_flag, OFFSET$used_by_curr_pic_lt_sps_flag, value);}
	public java.lang.foreign.MemorySegment used_by_curr_pic_lt_sps_flag_ptr() {return this.ptr.asSlice(OFFSET$used_by_curr_pic_lt_sps_flag, LAYOUT$used_by_curr_pic_lt_sps_flag);}

	public java.lang.foreign.MemorySegment lt_ref_pic_poc_lsb_sps() {return this.ptr.asSlice(OFFSET$lt_ref_pic_poc_lsb_sps, LAYOUT$lt_ref_pic_poc_lsb_sps);}
	public int lt_ref_pic_poc_lsb_sps(int i) {return this.lt_ref_pic_poc_lsb_sps().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
	public void lt_ref_pic_poc_lsb_sps(int i, int value) {this.lt_ref_pic_poc_lsb_sps().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}
}

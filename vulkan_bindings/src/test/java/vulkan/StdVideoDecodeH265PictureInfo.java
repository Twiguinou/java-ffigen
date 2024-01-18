package vulkan;

public record StdVideoDecodeH265PictureInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoDecodeH265PictureInfoFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$sps_video_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$sps_video_parameter_set_id = 4L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_seq_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_seq_parameter_set_id = 5L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$pps_pic_parameter_set_id = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$pps_pic_parameter_set_id = 6L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$NumDeltaPocsOfRefRpsIdx = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$NumDeltaPocsOfRefRpsIdx = 7L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$PicOrderCntVal = 8L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$NumBitsForSTRefPicSetInSlice = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$NumBitsForSTRefPicSetInSlice = 12L;
	public static final java.lang.foreign.ValueLayout.OfShort LAYOUT$reserved = java.lang.foreign.ValueLayout.JAVA_SHORT;
	public static final long OFFSET$reserved = 14L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$RefPicSetStCurrBefore = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$RefPicSetStCurrBefore = 16L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$RefPicSetStCurrAfter = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$RefPicSetStCurrAfter = 24L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$RefPicSetLtCurr = java.lang.foreign.MemoryLayout.sequenceLayout(8, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$RefPicSetLtCurr = 32L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$sps_video_parameter_set_id,
			LAYOUT$pps_seq_parameter_set_id,
			LAYOUT$pps_pic_parameter_set_id,
			LAYOUT$NumDeltaPocsOfRefRpsIdx,
			LAYOUT$PicOrderCntVal,
			LAYOUT$NumBitsForSTRefPicSetInSlice,
			LAYOUT$reserved,
			LAYOUT$RefPicSetStCurrBefore,
			LAYOUT$RefPicSetStCurrAfter,
			LAYOUT$RefPicSetLtCurr
	).withName("StdVideoDecodeH265PictureInfo");

	public StdVideoDecodeH265PictureInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoDecodeH265PictureInfoFlags flags() {return new vulkan.StdVideoDecodeH265PictureInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public char sps_video_parameter_set_id() {return (char)this.ptr.get(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id);}
	public void sps_video_parameter_set_id(char value) {this.ptr.set(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment sps_video_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$sps_video_parameter_set_id, LAYOUT$sps_video_parameter_set_id);}

	public char pps_seq_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id);}
	public void pps_seq_parameter_set_id(char value) {this.ptr.set(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment pps_seq_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pps_seq_parameter_set_id, LAYOUT$pps_seq_parameter_set_id);}

	public char pps_pic_parameter_set_id() {return (char)this.ptr.get(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id);}
	public void pps_pic_parameter_set_id(char value) {this.ptr.set(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id, (byte)value);}
	public java.lang.foreign.MemorySegment pps_pic_parameter_set_id_ptr() {return this.ptr.asSlice(OFFSET$pps_pic_parameter_set_id, LAYOUT$pps_pic_parameter_set_id);}

	public char NumDeltaPocsOfRefRpsIdx() {return (char)this.ptr.get(LAYOUT$NumDeltaPocsOfRefRpsIdx, OFFSET$NumDeltaPocsOfRefRpsIdx);}
	public void NumDeltaPocsOfRefRpsIdx(char value) {this.ptr.set(LAYOUT$NumDeltaPocsOfRefRpsIdx, OFFSET$NumDeltaPocsOfRefRpsIdx, (byte)value);}
	public java.lang.foreign.MemorySegment NumDeltaPocsOfRefRpsIdx_ptr() {return this.ptr.asSlice(OFFSET$NumDeltaPocsOfRefRpsIdx, LAYOUT$NumDeltaPocsOfRefRpsIdx);}

	public int PicOrderCntVal() {return this.ptr.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);}
	public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);}
	public java.lang.foreign.MemorySegment PicOrderCntVal_ptr() {return this.ptr.asSlice(OFFSET$PicOrderCntVal, LAYOUT$PicOrderCntVal);}

	public short NumBitsForSTRefPicSetInSlice() {return this.ptr.get(LAYOUT$NumBitsForSTRefPicSetInSlice, OFFSET$NumBitsForSTRefPicSetInSlice);}
	public void NumBitsForSTRefPicSetInSlice(short value) {this.ptr.set(LAYOUT$NumBitsForSTRefPicSetInSlice, OFFSET$NumBitsForSTRefPicSetInSlice, value);}
	public java.lang.foreign.MemorySegment NumBitsForSTRefPicSetInSlice_ptr() {return this.ptr.asSlice(OFFSET$NumBitsForSTRefPicSetInSlice, LAYOUT$NumBitsForSTRefPicSetInSlice);}

	public short reserved() {return this.ptr.get(LAYOUT$reserved, OFFSET$reserved);}
	public void reserved(short value) {this.ptr.set(LAYOUT$reserved, OFFSET$reserved, value);}
	public java.lang.foreign.MemorySegment reserved_ptr() {return this.ptr.asSlice(OFFSET$reserved, LAYOUT$reserved);}

	public java.lang.foreign.MemorySegment RefPicSetStCurrBefore() {return this.ptr.asSlice(OFFSET$RefPicSetStCurrBefore, LAYOUT$RefPicSetStCurrBefore);}
	public char RefPicSetStCurrBefore(int i) {return (char)this.RefPicSetStCurrBefore().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void RefPicSetStCurrBefore(int i, char value) {this.RefPicSetStCurrBefore().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment RefPicSetStCurrAfter() {return this.ptr.asSlice(OFFSET$RefPicSetStCurrAfter, LAYOUT$RefPicSetStCurrAfter);}
	public char RefPicSetStCurrAfter(int i) {return (char)this.RefPicSetStCurrAfter().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void RefPicSetStCurrAfter(int i, char value) {this.RefPicSetStCurrAfter().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment RefPicSetLtCurr() {return this.ptr.asSlice(OFFSET$RefPicSetLtCurr, LAYOUT$RefPicSetLtCurr);}
	public char RefPicSetLtCurr(int i) {return (char)this.RefPicSetLtCurr().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void RefPicSetLtCurr(int i, char value) {this.RefPicSetLtCurr().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}

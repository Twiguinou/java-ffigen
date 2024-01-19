package vulkan;

public record StdVideoH265ScalingLists(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingList4x4 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(16, java.lang.foreign.ValueLayout.JAVA_BYTE));
	public static final long OFFSET$ScalingList4x4 = 0L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingList8x8 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
	public static final long OFFSET$ScalingList8x8 = 96L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingList16x16 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
	public static final long OFFSET$ScalingList16x16 = 480L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingList32x32 = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.MemoryLayout.sequenceLayout(64, java.lang.foreign.ValueLayout.JAVA_BYTE));
	public static final long OFFSET$ScalingList32x32 = 864L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingListDCCoef16x16 = java.lang.foreign.MemoryLayout.sequenceLayout(6, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$ScalingListDCCoef16x16 = 992L;
	public static final java.lang.foreign.SequenceLayout LAYOUT$ScalingListDCCoef32x32 = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.JAVA_BYTE);
	public static final long OFFSET$ScalingListDCCoef32x32 = 998L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$ScalingList4x4,
			LAYOUT$ScalingList8x8,
			LAYOUT$ScalingList16x16,
			LAYOUT$ScalingList32x32,
			LAYOUT$ScalingListDCCoef16x16,
			LAYOUT$ScalingListDCCoef32x32
	).withName("StdVideoH265ScalingLists");

	public StdVideoH265ScalingLists(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment ScalingList4x4() {return this.ptr.asSlice(OFFSET$ScalingList4x4, LAYOUT$ScalingList4x4);}

	public java.lang.foreign.MemorySegment ScalingList8x8() {return this.ptr.asSlice(OFFSET$ScalingList8x8, LAYOUT$ScalingList8x8);}

	public java.lang.foreign.MemorySegment ScalingList16x16() {return this.ptr.asSlice(OFFSET$ScalingList16x16, LAYOUT$ScalingList16x16);}

	public java.lang.foreign.MemorySegment ScalingList32x32() {return this.ptr.asSlice(OFFSET$ScalingList32x32, LAYOUT$ScalingList32x32);}

	public java.lang.foreign.MemorySegment ScalingListDCCoef16x16() {return this.ptr.asSlice(OFFSET$ScalingListDCCoef16x16, LAYOUT$ScalingListDCCoef16x16);}
	public char ScalingListDCCoef16x16(int i) {return (char)this.ScalingListDCCoef16x16().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void ScalingListDCCoef16x16(int i, char value) {this.ScalingListDCCoef16x16().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}

	public java.lang.foreign.MemorySegment ScalingListDCCoef32x32() {return this.ptr.asSlice(OFFSET$ScalingListDCCoef32x32, LAYOUT$ScalingListDCCoef32x32);}
	public char ScalingListDCCoef32x32(int i) {return (char)this.ScalingListDCCoef32x32().getAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i);}
	public void ScalingListDCCoef32x32(int i, char value) {this.ScalingListDCCoef32x32().setAtIndex(java.lang.foreign.ValueLayout.JAVA_BYTE, i, (byte)value);}
}

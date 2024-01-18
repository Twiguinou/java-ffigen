package vulkan;

public record StdVideoDecodeH265ReferenceInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.GroupLayout LAYOUT$flags = vulkan.StdVideoDecodeH265ReferenceInfoFlags.gStructLayout;
	public static final long OFFSET$flags = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$PicOrderCntVal = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$PicOrderCntVal = 4L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$flags,
			LAYOUT$PicOrderCntVal
	).withName("StdVideoDecodeH265ReferenceInfo");

	public StdVideoDecodeH265ReferenceInfo(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public vulkan.StdVideoDecodeH265ReferenceInfoFlags flags() {return new vulkan.StdVideoDecodeH265ReferenceInfoFlags(this.ptr.asSlice(OFFSET$flags, LAYOUT$flags));}

	public int PicOrderCntVal() {return this.ptr.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);}
	public void PicOrderCntVal(int value) {this.ptr.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);}
	public java.lang.foreign.MemorySegment PicOrderCntVal_ptr() {return this.ptr.asSlice(OFFSET$PicOrderCntVal, LAYOUT$PicOrderCntVal);}
}

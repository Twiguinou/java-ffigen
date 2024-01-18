package vulkan;

public record StdVideoH265PredictorPaletteEntries(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.SequenceLayout LAYOUT$PredictorPaletteEntries = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.MemoryLayout.sequenceLayout(128, java.lang.foreign.ValueLayout.JAVA_SHORT));
	public static final long OFFSET$PredictorPaletteEntries = 0L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$PredictorPaletteEntries
	).withName("StdVideoH265PredictorPaletteEntries");

	public StdVideoH265PredictorPaletteEntries(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment PredictorPaletteEntries() {return this.ptr.asSlice(OFFSET$PredictorPaletteEntries, LAYOUT$PredictorPaletteEntries);}
}

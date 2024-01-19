package jpgen.clang;

public record CXSourceRange(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.SequenceLayout LAYOUT$ptr_data = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.ADDRESS);
	public static final long OFFSET$ptr_data = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$begin_int_data = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$begin_int_data = 16L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$end_int_data = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$end_int_data = 20L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$ptr_data,
			LAYOUT$begin_int_data,
			LAYOUT$end_int_data
	).withName("CXSourceRange");

	public CXSourceRange(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.asSlice(OFFSET$ptr_data, LAYOUT$ptr_data);}
	public java.lang.foreign.MemorySegment ptr_data(int i) {return this.ptr_data().getAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i);}
	public void ptr_data(int i, java.lang.foreign.MemorySegment value) {this.ptr_data().setAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i, value);}

	public int begin_int_data() {return this.ptr.get(LAYOUT$begin_int_data, OFFSET$begin_int_data);}
	public void begin_int_data(int value) {this.ptr.set(LAYOUT$begin_int_data, OFFSET$begin_int_data, value);}
	public java.lang.foreign.MemorySegment begin_int_data_ptr() {return this.ptr.asSlice(OFFSET$begin_int_data, LAYOUT$begin_int_data);}

	public int end_int_data() {return this.ptr.get(LAYOUT$end_int_data, OFFSET$end_int_data);}
	public void end_int_data(int value) {this.ptr.set(LAYOUT$end_int_data, OFFSET$end_int_data, value);}
	public java.lang.foreign.MemorySegment end_int_data_ptr() {return this.ptr.asSlice(OFFSET$end_int_data, LAYOUT$end_int_data);}
}

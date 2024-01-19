package jpgen.clang;

public record CXSourceLocation(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$ptr_data = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.ADDRESS);
    public static final long OFFSET$ptr_data = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$int_data = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$int_data = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$ptr_data,
            LAYOUT$int_data,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXSourceLocation");

    public CXSourceLocation(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.asSlice(OFFSET$ptr_data, LAYOUT$ptr_data);}
    public java.lang.foreign.MemorySegment ptr_data(int i) {return this.ptr_data().getAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i);}
    public void ptr_data(int i, java.lang.foreign.MemorySegment value) {this.ptr_data().setAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i, value);}

    public int int_data() {return this.ptr.get(LAYOUT$int_data, OFFSET$int_data);}
    public void int_data(int value) {this.ptr.set(LAYOUT$int_data, OFFSET$int_data, value);}
    public java.lang.foreign.MemorySegment int_data_ptr() {return this.ptr.asSlice(OFFSET$int_data, LAYOUT$int_data);}
}

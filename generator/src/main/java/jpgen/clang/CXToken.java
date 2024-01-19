package jpgen.clang;

public record CXToken(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$int_data = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_INT);
    public static final long OFFSET$int_data = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$ptr_data = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$ptr_data = 16L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$int_data,
            LAYOUT$ptr_data
    ).withName("CXToken");

    public CXToken(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment int_data() {return this.ptr.asSlice(OFFSET$int_data, LAYOUT$int_data);}
    public int int_data(int i) {return this.int_data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i);}
    public void int_data(int i, int value) {this.int_data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, i, value);}

    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.get(LAYOUT$ptr_data, OFFSET$ptr_data);}
    public void ptr_data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$ptr_data, OFFSET$ptr_data, value);}
    public java.lang.foreign.MemorySegment ptr_data_ptr() {return this.ptr.asSlice(OFFSET$ptr_data, LAYOUT$ptr_data);}
}

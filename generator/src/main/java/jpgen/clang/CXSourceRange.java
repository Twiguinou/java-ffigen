package jpgen.clang;

public record CXSourceRange(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__ptr_data = java.lang.foreign.MemoryLayout.sequenceLayout(2, jpgen.NativeTypes.UNBOUNDED_POINTER);
    public static final long OFFSET__ptr_data = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__begin_int_data = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__begin_int_data = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__end_int_data = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__end_int_data = 20;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__ptr_data,
            LAYOUT__begin_int_data,
            LAYOUT__end_int_data
    ).withByteAlignment(8).withName("CXSourceRange");

    public CXSourceRange(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXSourceRange getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXSourceRange(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXSourceRange value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.asSlice(OFFSET__ptr_data, LAYOUT__ptr_data);}
    public java.lang.foreign.MemorySegment ptr_data(int index) {return this.ptr_data().getAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index);}
    public void ptr_data(int index, java.lang.foreign.MemorySegment value) {this.ptr_data().setAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index, value);}

    public int begin_int_data() {return this.ptr.get(LAYOUT__begin_int_data, OFFSET__begin_int_data);}
    public void begin_int_data(int value) {this.ptr.set(LAYOUT__begin_int_data, OFFSET__begin_int_data, value);}
    public java.lang.foreign.MemorySegment $begin_int_data() {return this.ptr.asSlice(OFFSET__begin_int_data, LAYOUT__begin_int_data);}

    public int end_int_data() {return this.ptr.get(LAYOUT__end_int_data, OFFSET__end_int_data);}
    public void end_int_data(int value) {this.ptr.set(LAYOUT__end_int_data, OFFSET__end_int_data, value);}
    public java.lang.foreign.MemorySegment $end_int_data() {return this.ptr.asSlice(OFFSET__end_int_data, LAYOUT__end_int_data);}
}

package fr.kenlek.jpgen.clang;

public record CXIdxLoc(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__ptr_data = java.lang.foreign.MemoryLayout.sequenceLayout(2, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER).withName("ptr_data");
    public static final long OFFSET__ptr_data = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__int_data = java.lang.foreign.ValueLayout.JAVA_INT.withName("int_data");
    public static final long OFFSET__int_data = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__ptr_data,
            LAYOUT__int_data,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxLoc");

    public CXIdxLoc(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxLoc getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxLoc(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxLoc value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.asSlice(OFFSET__ptr_data, LAYOUT__ptr_data);}
    public java.lang.foreign.MemorySegment ptr_data(int index) {return this.ptr_data().getAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index);}
    public void ptr_data(int index, java.lang.foreign.MemorySegment value) {this.ptr_data().setAtIndex(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, index, value);}

    public int int_data() {return this.ptr.get(LAYOUT__int_data, OFFSET__int_data);}
    public void int_data(int value) {this.ptr.set(LAYOUT__int_data, OFFSET__int_data, value);}
    public java.lang.foreign.MemorySegment $int_data() {return this.ptr.asSlice(OFFSET__int_data, LAYOUT__int_data);}
}

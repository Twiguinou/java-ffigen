package fr.kenlek.jpgen.clang;

public record CXToken(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__int_data = java.lang.foreign.MemoryLayout.sequenceLayout(4, java.lang.foreign.ValueLayout.JAVA_INT).withName("int_data");
    public static final long OFFSET__int_data = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__ptr_data = fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("ptr_data");
    public static final long OFFSET__ptr_data = 16;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__int_data,
            LAYOUT__ptr_data
    ).withByteAlignment(8).withName("CXToken");

    public CXToken(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXToken getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXToken(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXToken value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment int_data() {return this.ptr.asSlice(OFFSET__int_data, LAYOUT__int_data);}
    public int int_data(int index) {return this.int_data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index);}
    public void int_data(int index, int value) {this.int_data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_INT, index, value);}

    public java.lang.foreign.MemorySegment ptr_data() {return this.ptr.get(LAYOUT__ptr_data, OFFSET__ptr_data);}
    public void ptr_data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__ptr_data, OFFSET__ptr_data, value);}
    public java.lang.foreign.MemorySegment $ptr_data() {return this.ptr.asSlice(OFFSET__ptr_data, LAYOUT__ptr_data);}
}

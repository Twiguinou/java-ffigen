package fr.akshir.jpgen.clang;

public record CXType(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET__kind = 0;
    public static final java.lang.foreign.SequenceLayout LAYOUT__data = java.lang.foreign.MemoryLayout.sequenceLayout(2, fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER).withName("data");
    public static final long OFFSET__data = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__data
    ).withByteAlignment(8).withName("CXType");

    public CXType(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXType getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXType(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXType value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}
    public java.lang.foreign.MemorySegment data(int index) {return this.data().getAtIndex(fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER, index);}
    public void data(int index, java.lang.foreign.MemorySegment value) {this.data().setAtIndex(fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER, index, value);}
}

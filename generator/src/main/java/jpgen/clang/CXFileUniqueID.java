package jpgen.clang;

public record CXFileUniqueID(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT__data = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_LONG).withName("data");
    public static final long OFFSET__data = 0;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__data
    ).withByteAlignment(8).withName("CXFileUniqueID");

    public CXFileUniqueID(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXFileUniqueID getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXFileUniqueID(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXFileUniqueID value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}
    public long data(int index) {return this.data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index);}
    public void data(int index, long value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, index, value);}
}

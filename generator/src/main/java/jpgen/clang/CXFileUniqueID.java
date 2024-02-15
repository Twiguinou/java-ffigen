package jpgen.clang;

public record CXFileUniqueID(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.SequenceLayout LAYOUT$data = java.lang.foreign.MemoryLayout.sequenceLayout(3, java.lang.foreign.ValueLayout.JAVA_LONG);
    public static final long OFFSET$data = 0L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$data
    ).withName("CXFileUniqueID");

    public CXFileUniqueID(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXFileUniqueID getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXFileUniqueID(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}
    public long data(int i) {return this.data().getAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, i);}
    public void data(int i, long value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.JAVA_LONG, i, value);}
}

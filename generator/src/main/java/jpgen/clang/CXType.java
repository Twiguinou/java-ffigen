package jpgen.clang;

public record CXType(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$kind = 0L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$data = java.lang.foreign.MemoryLayout.sequenceLayout(2, java.lang.foreign.ValueLayout.ADDRESS);
    public static final long OFFSET$data = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$data
    ).withName("CXType");

    public CXType(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXType getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXType(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}
    public java.lang.foreign.MemorySegment data(int i) {return this.data().getAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i);}
    public void data(int i, java.lang.foreign.MemorySegment value) {this.data().setAtIndex(java.lang.foreign.ValueLayout.ADDRESS, i, value);}
}

package jpgen.clang;

public record CXCursor(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$kind = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$xdata = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$xdata = 4L;
    public static final java.lang.foreign.SequenceLayout LAYOUT$data = java.lang.foreign.MemoryLayout.sequenceLayout(3, jpgen.NativeTypes.UNBOUNDED_POINTER);
    public static final long OFFSET$data = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$kind,
            LAYOUT$xdata,
            LAYOUT$data
    ).withName("CXCursor");

    public CXCursor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXCursor getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXCursor(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

    public int xdata() {return this.ptr.get(LAYOUT$xdata, OFFSET$xdata);}
    public void xdata(int value) {this.ptr.set(LAYOUT$xdata, OFFSET$xdata, value);}
    public java.lang.foreign.MemorySegment xdata_ptr() {return this.ptr.asSlice(OFFSET$xdata, LAYOUT$xdata);}

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}
    public java.lang.foreign.MemorySegment data(int i) {return this.data().getAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, i);}
    public void data(int i, java.lang.foreign.MemorySegment value) {this.data().setAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, i, value);}
}

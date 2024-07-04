package jpgen.clang;

public record CXCursor(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET__kind = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__xdata = java.lang.foreign.ValueLayout.JAVA_INT.withName("xdata");
    public static final long OFFSET__xdata = 4;
    public static final java.lang.foreign.SequenceLayout LAYOUT__data = java.lang.foreign.MemoryLayout.sequenceLayout(3, jpgen.NativeTypes.UNBOUNDED_POINTER).withName("data");
    public static final long OFFSET__data = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__kind,
            LAYOUT__xdata,
            LAYOUT__data
    ).withByteAlignment(8).withName("CXCursor");

    public CXCursor(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXCursor getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXCursor(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXCursor value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}

    public int xdata() {return this.ptr.get(LAYOUT__xdata, OFFSET__xdata);}
    public void xdata(int value) {this.ptr.set(LAYOUT__xdata, OFFSET__xdata, value);}
    public java.lang.foreign.MemorySegment $xdata() {return this.ptr.asSlice(OFFSET__xdata, LAYOUT__xdata);}

    public java.lang.foreign.MemorySegment data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}
    public java.lang.foreign.MemorySegment data(int index) {return this.data().getAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index);}
    public void data(int index, java.lang.foreign.MemorySegment value) {this.data().setAtIndex(jpgen.NativeTypes.UNBOUNDED_POINTER, index, value);}
}

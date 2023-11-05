package jpgen.clang;

import java.lang.foreign.*;

public record CXCursor(MemorySegment ptr)
{
    public static final ValueLayout.OfInt LAYOUT$kind = ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET$kind;
    public static final ValueLayout.OfInt LAYOUT$xdata = ValueLayout.JAVA_INT.withName("xdata");
    public static final long OFFSET$xdata;
    public static final SequenceLayout LAYOUT$data = MemoryLayout.sequenceLayout(3, ValueLayout.ADDRESS).withName("data");
    public static final long OFFSET$data;

    public static final MemoryLayout gStructLayout = MemoryLayout.structLayout(
            LAYOUT$kind,
            LAYOUT$xdata,
            LAYOUT$data
    ).withName("CXCursor");

    public CXCursor(SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

    public int xdata() {return this.ptr.get(LAYOUT$xdata, OFFSET$xdata);}
    public void xdata(int value) {this.ptr.set(LAYOUT$xdata, OFFSET$xdata, value);}
    public MemorySegment xdata_ptr() {return this.ptr.asSlice(OFFSET$xdata, LAYOUT$xdata);}

    public MemorySegment data() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}
    public MemorySegment data(int i) {return this.data().getAtIndex(ValueLayout.ADDRESS, i);}
    public void data(int i, MemorySegment value) {this.data().setAtIndex(ValueLayout.ADDRESS, i, value);}

    static
    {
        OFFSET$kind = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
        OFFSET$xdata = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("xdata"));
        OFFSET$data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    }
}

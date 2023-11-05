package jpgen.clang;

import java.lang.foreign.*;

public record CXType(MemorySegment ptr)
{
    public static final ValueLayout.OfInt LAYOUT$kind = ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET$kind;
    public static final SequenceLayout LAYOUT$data = MemoryLayout.sequenceLayout(2, ValueLayout.ADDRESS).withName("data");
    public static final long OFFSET$data;

    public static final MemoryLayout gStructLayout = MemoryLayout.structLayout(
            LAYOUT$kind,
            MemoryLayout.paddingLayout(4),
            LAYOUT$data
    ).withName("CXType");

    public CXType(SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

    public MemorySegment data() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}
    public MemorySegment data(int i) {return this.data().getAtIndex(ValueLayout.ADDRESS, i);}
    public void data(int i, MemorySegment value) {this.data().setAtIndex(ValueLayout.ADDRESS, i, value);}

    static
    {
        OFFSET$kind = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("kind"));
        OFFSET$data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("data"));
    }
}

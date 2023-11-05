package jpgen.clang;

import java.lang.foreign.*;

public record CXSourceLocation(MemorySegment ptr)
{
    public static final SequenceLayout LAYOUT$ptr_data = MemoryLayout.sequenceLayout(2, ValueLayout.ADDRESS).withName("ptr_data");
    public static final long OFFSET$ptr_data;
    public static final ValueLayout.OfInt LAYOUT$int_data = ValueLayout.JAVA_INT.withName("int_data");
    public static final long OFFSET$int_data;

    public static final MemoryLayout gStructLayout = MemoryLayout.structLayout(
            LAYOUT$ptr_data,
            LAYOUT$int_data,
            MemoryLayout.paddingLayout(4)
    ).withName("CXSourceLocation");

    public CXSourceLocation(SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public MemorySegment ptr_data() {return this.ptr.asSlice(OFFSET$ptr_data, LAYOUT$ptr_data);}
    public MemorySegment ptr_data(int i) {return this.ptr_data().getAtIndex(ValueLayout.ADDRESS, i);}
    public void ptr_data(int i, MemorySegment value) {this.ptr_data().setAtIndex(ValueLayout.ADDRESS, i, value);}

    public int int_data() {return this.ptr.get(LAYOUT$int_data, OFFSET$int_data);}
    public void int_data(int value) {this.ptr.set(LAYOUT$int_data, OFFSET$int_data, value);}
    public MemorySegment int_data_ptr() {return this.ptr.asSlice(OFFSET$int_data, LAYOUT$int_data);}

    static
    {
        OFFSET$ptr_data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
        OFFSET$int_data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));
    }
}

package jpgen.clang;

import java.lang.foreign.*;

public record CXSourceRange(MemorySegment ptr)
{
    public static final SequenceLayout LAYOUT$ptr_data = MemoryLayout.sequenceLayout(2, ValueLayout.ADDRESS).withName("ptr_data");
    public static final long OFFSET$ptr_data;
    public static final ValueLayout.OfInt LAYOUT$begin_int_data = ValueLayout.JAVA_INT.withName("begin_int_data");
    public static final long OFFSET$begin_int_data;
    public static final ValueLayout.OfInt LAYOUT$end_int_data = ValueLayout.JAVA_INT.withName("end_int_data");
    public static final long OFFSET$end_int_data;

    public static final MemoryLayout gStructLayout = MemoryLayout.structLayout(
            LAYOUT$ptr_data,
            LAYOUT$begin_int_data,
            LAYOUT$end_int_data
    ).withName("CXSourceRange");

    public CXSourceRange(SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public MemorySegment ptr_data() {return this.ptr.asSlice(OFFSET$ptr_data, LAYOUT$ptr_data);}
    public MemorySegment ptr_data(int i) {return this.ptr_data().getAtIndex(ValueLayout.ADDRESS, i);}
    public void ptr_data(int i, MemorySegment value) {this.ptr_data().setAtIndex(ValueLayout.ADDRESS, i, value);}

    public int begin_int_data() {return this.ptr.get(LAYOUT$begin_int_data, OFFSET$begin_int_data);}
    public void begin_int_data(int value) {this.ptr.set(LAYOUT$begin_int_data, OFFSET$begin_int_data, value);}
    public MemorySegment begin_int_data_ptr() {return this.ptr.asSlice(OFFSET$begin_int_data, LAYOUT$begin_int_data);}

    public int end_int_data() {return this.ptr.get(LAYOUT$end_int_data, OFFSET$end_int_data);}
    public void end_int_data(int value) {this.ptr.set(LAYOUT$end_int_data, OFFSET$end_int_data, value);}
    public MemorySegment end_int_data_ptr() {return this.ptr.asSlice(OFFSET$end_int_data, LAYOUT$end_int_data);}

    static
    {
        OFFSET$ptr_data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
        OFFSET$begin_int_data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("begin_int_data"));
        OFFSET$end_int_data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("end_int_data"));
    }
}

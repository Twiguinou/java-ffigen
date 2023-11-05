package jpgen.clang;

import java.lang.foreign.*;

public record CXToken(MemorySegment ptr)
{
    public static final SequenceLayout LAYOUT$int_data = MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("int_data");
    public static final long OFFSET$int_data;
    public static final AddressLayout LAYOUT$ptr_data = ValueLayout.ADDRESS.withName("ptr_data");
    public static final long OFFSET$ptr_data;

    public static final MemoryLayout gStructLayout = MemoryLayout.structLayout(
            LAYOUT$int_data,
            LAYOUT$ptr_data
    ).withName("CXToken");

    public CXToken(SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public MemorySegment data() {return this.ptr.asSlice(OFFSET$int_data, LAYOUT$int_data);}
    public int data(int i) {return this.data().getAtIndex(ValueLayout.JAVA_INT, i);}
    public void data(int i, int value) {this.data().setAtIndex(ValueLayout.JAVA_INT, i, value);}

    public MemorySegment ptr_data() {return this.ptr.get(LAYOUT$ptr_data, OFFSET$ptr_data);}
    public void ptr_data(MemorySegment value) {this.ptr.set(LAYOUT$ptr_data, OFFSET$ptr_data, value);}
    public MemorySegment ptr_data_ptr() {return this.ptr.asSlice(OFFSET$ptr_data, LAYOUT$ptr_data);}

    static
    {
        OFFSET$int_data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("int_data"));
        OFFSET$ptr_data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("ptr_data"));
    }
}

package jpgen.clang;

import java.lang.foreign.*;

public record CXString(MemorySegment ptr)
{
    public static final AddressLayout LAYOUT$data = ValueLayout.ADDRESS.withName("data");
    public static final long OFFSET$data;
    public static final ValueLayout.OfInt LAYOUT$private_flags = ValueLayout.JAVA_INT.withName("private_flags");
    public static final long OFFSET$private_flags;

    public static final MemoryLayout gStructLayout = MemoryLayout.structLayout(
            LAYOUT$data,
            LAYOUT$private_flags,
            MemoryLayout.paddingLayout(4)
    ).withName("CXString");

    public CXString(SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public MemorySegment data() {return this.ptr.get(LAYOUT$data, OFFSET$data);}
    public void data(MemorySegment value) {this.ptr.set(LAYOUT$data, OFFSET$data, value);}
    public MemorySegment data_ptr() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}

    public int private_flags() {return this.ptr.get(LAYOUT$private_flags, OFFSET$private_flags);}
    public void private_flags(int value) {this.ptr.set(LAYOUT$private_flags, OFFSET$private_flags, value);}
    public MemorySegment private_flags_ptr() {return this.ptr.asSlice(OFFSET$private_flags, LAYOUT$private_flags);}

    static
    {
        OFFSET$data = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("data"));
        OFFSET$private_flags = gStructLayout.byteOffset(MemoryLayout.PathElement.groupElement("private_flags"));
    }
}

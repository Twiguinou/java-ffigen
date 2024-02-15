package jpgen.clang;

public record CXString(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$data = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$data = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$private_flags = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$private_flags = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$data,
            LAYOUT$private_flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXString");

    public CXString(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXString getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXString(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment data() {return this.ptr.get(LAYOUT$data, OFFSET$data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$data, OFFSET$data, value);}
    public java.lang.foreign.MemorySegment data_ptr() {return this.ptr.asSlice(OFFSET$data, LAYOUT$data);}

    public int private_flags() {return this.ptr.get(LAYOUT$private_flags, OFFSET$private_flags);}
    public void private_flags(int value) {this.ptr.set(LAYOUT$private_flags, OFFSET$private_flags, value);}
    public java.lang.foreign.MemorySegment private_flags_ptr() {return this.ptr.asSlice(OFFSET$private_flags, LAYOUT$private_flags);}
}

package jpgen.clang;

public record CXString(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__data = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("data");
    public static final long OFFSET__data = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__private_flags = java.lang.foreign.ValueLayout.JAVA_INT.withName("private_flags");
    public static final long OFFSET__private_flags = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__data,
            LAYOUT__private_flags,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXString");

    public CXString(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXString getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXString(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXString value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment data() {return this.ptr.get(LAYOUT__data, OFFSET__data);}
    public void data(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__data, OFFSET__data, value);}
    public java.lang.foreign.MemorySegment $data() {return this.ptr.asSlice(OFFSET__data, LAYOUT__data);}

    public int private_flags() {return this.ptr.get(LAYOUT__private_flags, OFFSET__private_flags);}
    public void private_flags(int value) {this.ptr.set(LAYOUT__private_flags, OFFSET__private_flags, value);}
    public java.lang.foreign.MemorySegment $private_flags() {return this.ptr.asSlice(OFFSET__private_flags, LAYOUT__private_flags);}
}

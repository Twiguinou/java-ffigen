package jpgen.clang;

public record CXIdxObjCProtocolRefListInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$protocols = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$protocols = 0L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$numProtocols = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$numProtocols = 8L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$protocols,
            LAYOUT$numProtocols,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXIdxObjCProtocolRefListInfo");

    public CXIdxObjCProtocolRefListInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXIdxObjCProtocolRefListInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXIdxObjCProtocolRefListInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(LAYOUT$protocols, OFFSET$protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$protocols, OFFSET$protocols, value);}
    public java.lang.foreign.MemorySegment protocols_ptr() {return this.ptr.asSlice(OFFSET$protocols, LAYOUT$protocols);}

    public int numProtocols() {return this.ptr.get(LAYOUT$numProtocols, OFFSET$numProtocols);}
    public void numProtocols(int value) {this.ptr.set(LAYOUT$numProtocols, OFFSET$numProtocols, value);}
    public java.lang.foreign.MemorySegment numProtocols_ptr() {return this.ptr.asSlice(OFFSET$numProtocols, LAYOUT$numProtocols);}
}

package fr.kenlek.jpgen.clang;

public record CXIdxObjCProtocolRefListInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__protocols = fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("protocols");
    public static final long OFFSET__protocols = 0;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__numProtocols = java.lang.foreign.ValueLayout.JAVA_INT.withName("numProtocols");
    public static final long OFFSET__numProtocols = 8;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__protocols,
            LAYOUT__numProtocols,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxObjCProtocolRefListInfo");

    public CXIdxObjCProtocolRefListInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxObjCProtocolRefListInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxObjCProtocolRefListInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxObjCProtocolRefListInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment protocols() {return this.ptr.get(LAYOUT__protocols, OFFSET__protocols);}
    public void protocols(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__protocols, OFFSET__protocols, value);}
    public java.lang.foreign.MemorySegment $protocols() {return this.ptr.asSlice(OFFSET__protocols, LAYOUT__protocols);}

    public int numProtocols() {return this.ptr.get(LAYOUT__numProtocols, OFFSET__numProtocols);}
    public void numProtocols(int value) {this.ptr.set(LAYOUT__numProtocols, OFFSET__numProtocols, value);}
    public java.lang.foreign.MemorySegment $numProtocols() {return this.ptr.asSlice(OFFSET__numProtocols, LAYOUT__numProtocols);}
}
